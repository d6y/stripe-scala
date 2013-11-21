name := "stripe-scala"

version := io.Source.fromFile("VERSION").mkString.trim

organization := "com.stripe"

scalaVersion := "2.10.3"

    scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "org.apache.httpcomponents" % "httpclient" % "[4.1, 4.2)",
  "net.liftweb" %% "lift-json" % "2.6-M2",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)


 // To publish to the Cloudbees repos:

publishTo := Some("CB Repository" at "https://repository-idtp.forge.cloudbees.com/release/")
 
credentials += Credentials( file("/private/idtp/cloudbees.credentials") )



publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { x => false }

pomExtra := (
  <url>http://www.stripe.com/</url>
  <licenses>
    <license>
      <name>MIT</name>
      <url>http://www.opensource.org/licenses/mit-license.php</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:stripe/stripe-scala.git</url>
    <connection>scm:git:git@github.com:stripe/stripe-scala.git</connection>
  </scm>
  <developers>
    <developer>
      <id>siddarth</id>
      <name>Siddarth Chandrasekaran</name>
      <url>https://stripe.com/about#siddarth</url>
    </developer>
  </developers>
)

