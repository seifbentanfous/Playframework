name := """play-scala-seed"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"


crossScalaVersions := Seq("2.12.8", "2.11.12")

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.2" % Test,
  "com.datastax.cassandra" % "cassandra-driver-core" % "3.0.0",
  "com.sksamuel.elastic4s" %% "elastic4s-core" % "6.5.1",
  "com.datastax.spark" % "spark-cassandra-connector_2.11" % "2.4.1",
  "com.sksamuel.elastic4s" %% "elastic4s-http" % "6.5.1",
  "com.sksamuel.elastic4s" %% "elastic4s-play-json" % "6.5.1",
  "com.sksamuel.elastic4s" %% "elastic4s-json4s" % "6.5.1",
  "org.webjars" % "swagger-ui" % "3.22.0",
  "com.typesafe.play" %% "play" % "2.7.0",
  "io.swagger" % "swagger-core" % "2.0.0-rc0",
  "io.swagger" %% "swagger-play2" % "1.7.1"
)


  dependencyOverrides ++= Seq(
    "io.netty" % "netty-all" % "4.1.35.Final",
    "com.fasterxml.jackson.core" % "jackson-core" % "2.9.8",
    "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.8",
    "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.8"
  )

    excludeDependencies ++= Seq (
    "org.slf4j" % "log4j-over-slf4j"
    )