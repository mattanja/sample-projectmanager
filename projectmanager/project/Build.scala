import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "projectmanager"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean
  )

  val projectmanagerCommon = play.Project(
    appName + "-common", appVersion, path = file("common")
  )

  val main = play.Project(
    appName, appVersion, appDependencies, path = file("main")
  ).settings(
    // Add your own project settings here      
  ).dependsOn(projectmanagerCommon)

}
