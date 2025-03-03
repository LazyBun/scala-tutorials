ThisBuild / scalaVersion := "2.12.7"
ThisBuild / version := "1.0-SNAPSHOT"
ThisBuild / organization := "com.baeldung"
ThisBuild / organizationName := "core-scala"

val scalaTest = "org.scalatest" %% "scalatest" % "3.1.2" % Test
val junit = "com.novocode" % "junit-interface" % "0.11" % "test"
val catsEffect = "org.typelevel" % "cats-effect_2.12" % "2.1.4"
val catsCore = "org.typelevel" % "cats-effect_2.12" % "2.1.4"

lazy val scala_core = (project in file("scala-core"))
  .settings(
    name := "scala-core",
    libraryDependencies ++=
      Seq(
        scalaTest,
        junit,
        catsCore,
        catsEffect
      )
  )

lazy val scala_core_2 = (project in file("scala-core-2"))
  .settings(
    name := "scala-core-2",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    libraryDependencies += "org.scalamock" %% "scalamock" % "4.4.0" % Test,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )

lazy val scala_core_3 = (project in file("scala-core-3"))
  .settings(
    name := "scala-core-3",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.12.7",
    libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "2.0.0-M1"
  )

lazy val scala_core_4 = (project in file("scala-core-4"))
  .settings(
    name := "scala-core-4",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.12.7",
    libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "2.0.0-M1"
  )

lazy val scala_core_5 = (project in file("scala-core-5"))
  .settings(
    name := "scala-core-5",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.12.7",
    libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "2.0.0-M1",
    libraryDependencies += "joda-time" % "joda-time" % "2.9.9",
    libraryDependencies += "org.joda" % "joda-convert" % "2.2.1",
    libraryDependencies += "com.github.nscala-time" %% "nscala-time" % "2.28.0"
  )

lazy val scala_core_io = (project in file("scala-core-io"))
  .settings(
    name := "scala-core-io",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )

lazy val scala_core_oop = (project in file("scala-core-oop"))
  .settings(
    name := "scala-core-oop",
    libraryDependencies ++=
      Seq(catsCore, scalaTest, junit)
  )

lazy val scala_core_fp = (project in file("scala-core-fp"))
  .settings(
    name := "scala-core-fp",
    libraryDependencies ++=
      Seq(catsCore, scalaTest, junit)
  )

lazy val scala_lang = (project in file("scala-lang"))
  .settings(
    name := "scala-lang",
    scalacOptions += "-Ypartial-unification",
    libraryDependencies ++=
      Seq(scalaTest, junit)
  )

lazy val scala_lang_2 = (project in file("scala-lang-2"))
  .settings(
    name := "scala-lang",
    scalacOptions += "-Ypartial-unification",
    libraryDependencies ++=
      Seq(scalaTest, junit)
  )

lazy val scala_core_collections = (project in file("scala-core-collections"))
  .settings(
    name := "scala-core-collections",
    libraryDependencies +=
      scalaTest
  )

lazy val scala_test = (project in file("scala-test"))
  .settings(
    name := "scala-test",
    libraryDependencies ++=
      Seq(
        scalaTest,
        junit,
        "org.scalamock" %% "scalamock" % "4.4.0" % Test
      )
  )

lazy val scala_akka = (project in file("scala-akka"))
  .settings(
    name := "scala-akka",
    libraryDependencies += "com.typesafe.akka" % "akka-actor-typed_2.12" % "2.6.9",
    libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3",
    libraryDependencies += "com.typesafe.akka" % "akka-actor-testkit-typed_2.12" % "2.6.9" % Test,
    libraryDependencies += "com.lightbend.akka" %% "akka-stream-alpakka-mongodb" % "2.0.1",
    libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.6.9",
    libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "2.9.0",
    libraryDependencies += "com.lightbend.akka" %% "akka-stream-alpakka-file" % "2.0.2",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    libraryDependencies += "de.flapdoodle.embed" % "de.flapdoodle.embed.mongo" % "2.2.0" % Test
  )

val monocleVersion = "2.0.4"
val slickVersion = "3.3.2"
val shapelessVersion = "2.3.3"
val scalazVersion = "7.3.2"
val fs2Version = "2.5-15-e328d68"
val AkkaVersion = "2.6.12"
val reactiveMongo = "1.0.3"

lazy val scala_libraries = (project in file("scala-libraries"))
  .settings(
    name := "scala-libraries",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.2" % Test,
    libraryDependencies ++= Seq(
      "com.github.julien-truffaut" %% "monocle-core" % monocleVersion,
      "com.github.julien-truffaut" %% "monocle-macro" % monocleVersion,
      "com.github.julien-truffaut" %% "monocle-law" % monocleVersion % "test",
      "com.typesafe.slick" %% "slick" % slickVersion,
      "com.h2database" % "h2" % "1.4.200",
      "com.chuusai" %% "shapeless" % shapelessVersion,
      "com.h2database" % "h2" % "1.4.200",
      "org.scalaz" %% "scalaz-core" % scalazVersion,
      "co.fs2" %% "fs2-core" % fs2Version,
      "co.fs2" %% "fs2-io" % fs2Version,
      "junit" % "junit" % "4.13" % Test,
      "org.reactivemongo" %% "reactivemongo" % reactiveMongo,
      "org.reactivemongo" %% "reactivemongo-akkastream" % reactiveMongo,
      "de.flapdoodle.embed" % "de.flapdoodle.embed.mongo" % "3.0.0" % Test,
      "ch.qos.logback" % "logback-classic" % "1.2.3" % Test,
      "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
      "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
      "com.typesafe.akka" %% "akka-protobuf" % AkkaVersion
    )
  )

val circeVersion = "0.14.1"
val monixVersion = "3.4.0"

lazy val scala_libraries_2 = (project in file("scala-libraries-2"))
  .settings(
    name := "scala-libraries",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.2" % Test,
    libraryDependencies ++= Seq(
      "io.circe" %% "circe-core" % circeVersion,
      "io.circe" %% "circe-generic" % circeVersion,
      "io.circe" %% "circe-parser" % circeVersion,
      "com.github.cb372" %% "scalacache-core" % "0.28.0",
      "com.github.cb372" %% "scalacache-guava" % "0.28.0",
      "com.github.cb372" %% "scalacache-cats-effect" % "0.28.0",
      "com.github.cb372" %% "scalacache-caffeine" % "0.28.0"
    ),
    libraryDependencies ++= Seq(
      "com.typesafe.play" %% "play-slick" % "5.0.0",
      "org.postgresql" % "postgresql" % "42.2.12"
    ),
    libraryDependencies ++= Seq(
      "io.monix" %% "monix" % monixVersion
    ),
    dependencyOverrides := Seq(
      "com.typesafe.akka" %% "akka-protobuf-v3" % "2.6.16",
      "com.typesafe.akka" %% "akka-stream" % "2.6.16",
      "com.typesafe.akka" %% "akka-serialization-jackson" % "2.6.16"
    ),
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.16" % Test,
      "org.scalatest" %% "scalatest" % "3.1.4" % Test
    )
  )

lazy val scala_strings = (project in file("scala-strings"))
  .settings(
    name := "scala-strings",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )

lazy val scala_design_patterns = (project in file("scala-design-patterns"))
  .settings(
    name := "scala-design-patterns",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    libraryDependencies += "org.scalamock" %% "scalamock" % "4.4.0" % Test,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test
  )

lazy val scala_3 = project in file("scala3-lang")

lazy val cats_effects = (project in file("cats-effects"))
  .settings(
    name := "cats-effects",
    libraryDependencies += "org.typelevel" %% "cats-effect" % "3.1.1",
    libraryDependencies += "junit" % "junit" % "4.13" % Test
  )

lazy val zio = (project in file("zio"))
  .settings(
    name := "zio",
    libraryDependencies += "dev.zio" %% "zio" % "2.0.0-M4",
    libraryDependencies += "dev.zio" %% "zio-streams" % "2.0.0-M4",
    libraryDependencies += "dev.zio" %% "zio-test-sbt" % "2.0.0-M4" % "test",
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
