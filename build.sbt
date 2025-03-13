import Dependencies._

lazy val root = (project in file("."))
  .settings(
    organization in ThisBuild := "com.example",
    scalaVersion in ThisBuild := "2.12.20",
    version      in ThisBuild := "0.1.1-SNAPSHOT",
    name := "Hello",
    libraryDependencies += scalaTest % Test
  )
