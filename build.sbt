ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.1.1"

lazy val root = (project in file("."))
    .settings(
        name := "ASCII-2048",
        libraryDependencies += "org.cosplayengine" % "cosplay" % "0.2.0"
    )
