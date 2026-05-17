name := "odfsample"

import sbt.Keys.resourceDirectory

lazy val coreSettings = Seq(
  organization := "jp.naruoga",
  scalaVersion := "2.13.3",
)


version := "0.2"

resolvers += "Jitpack" at "https://jitpack.io"

libraryDependencies += "com.github.naruoga" % "jOpenDocument" % "3.0-e95cf2153c-1"
