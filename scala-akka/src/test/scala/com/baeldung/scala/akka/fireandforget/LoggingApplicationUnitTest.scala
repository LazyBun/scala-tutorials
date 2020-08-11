package com.baeldung.scala.akka.fireandforget

import akka.actor.testkit.typed.CapturedLogEvent
import akka.actor.testkit.typed.scaladsl.{BehaviorTestKit, TestInbox}
import com.baeldung.scala.akka.fireandforget.LoggingApplication.MicroserviceActor.DoSomeStuff
import com.baeldung.scala.akka.fireandforget.LoggingApplication.{LogKeeperActor, MicroserviceActor}
import org.scalatest.FlatSpec
import org.slf4j.event.Level

class LoggingApplicationUnitTest extends FlatSpec {

  "A LogKeeperActor" should "log received messages using the trace level" in {
    val logger = BehaviorTestKit(LogKeeperActor())
    logger.run(LogKeeperActor.Trace("A trace log"))
    assertResult(logger.logEntries()) {
      Seq(CapturedLogEvent(Level.TRACE, "A trace log"))
    }
  }

  it should "log received messages using the info level" in {
    val logger = BehaviorTestKit(LogKeeperActor())
    logger.run(LogKeeperActor.Info("An info log"))
    assertResult(logger.logEntries()) {
      Seq(CapturedLogEvent(Level.INFO, "An info log"))
    }
  }

  it should "log received messages using the error level" in {
    val logger = BehaviorTestKit(LogKeeperActor())
    logger.run(LogKeeperActor.Error("An error log"))
    assertResult(logger.logEntries()) {
      Seq(CapturedLogEvent(Level.ERROR, "An error log"))
    }
  }

  "A MicroserviceActor" should
    """send an info log message containing the the string
      | representation of the received object""".stripMargin in {
    val loggerInbox = TestInbox[LoggingApplication.LogKeeperActor.Log]()
    val microserviceActor = BehaviorTestKit(MicroserviceActor(loggerInbox.ref))
    microserviceActor.run(DoSomeStuff("My personal message"))
    loggerInbox.expectMessage(LoggingApplication.LogKeeperActor.Info("My personal message"))
  }
}
