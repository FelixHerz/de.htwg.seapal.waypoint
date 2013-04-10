import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

	val appName         = "waypoint"
	val appVersion      = "1.0-SNAPSHOT"

	val appDependencies = Seq(
	    javaCore,
	    javaJdbc,
	    javaEbean,
		"com.google.inject" % "guice" % "3.0",
		"com.google.inject.extensions" % "guice-multibindings" % "3.0",
		"de.htwg" % "util" % "1.0-SNAPSHOT",
		"de.htwg.seapal" % "mark" % "1.0-SNAPSHOT"
	)

  	val main = play.Project(appName, appVersion, appDependencies).settings(
  	
	// group id...
	organization := "de.htwg.seapal", 

	// disable using the Scala version in output paths and artifacts
	crossPaths := false, 

	resolvers += "HTWG Resolver" at "http://lenny2.in.htwg-konstanz.de:8081/artifactory/libs-snapshot-local",	
	publishTo := Some("HTWG Publisher" at "http://lenny2.in.htwg-konstanz.de:8081/artifactory/libs-snapshot-local;build.timestamp=" + 
	new java.util.Date().getTime()),
		pomExtra :=
		<build>
			<sourceDirectory>app</sourceDirectory>
			<testSourceDirectory>test</testSourceDirectory>
			<resources>
				<resource>
					<directory>app</directory>
				</resource>
			</resources>
		</build>	
	)
}
