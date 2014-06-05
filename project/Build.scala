import sbt._
import Keys._
import sbtassembly.Plugin._
import AssemblyKeys._

object Build extends Build {
  lazy val buildSettings = Defaults.defaultSettings ++ Seq(
    organization := "uk.co.devsoup",
    version := "1.0.1-SNAPSHOT"
  )

  lazy val app = Project("SimpleScala", file("."),
    settings = buildSettings ++ assemblySettings).settings(
      mainClass in assembly := Some(" uk.co.devsoup.simplescala.Main")
    )
}