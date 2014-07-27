name := """MonicoAPI"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "com.voxeo.tropo" % "tropo-webapi-java" % "0.3.2"
)

resolvers += "Uncle Tropos's Public Maven Repo" at "http://maven.tropo.com:8081/nexus/content/groups/public"

