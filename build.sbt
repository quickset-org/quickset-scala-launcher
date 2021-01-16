scalaVersion              := "2.13.4"
name                      := "quickset-scala-launcher"
organization              := "org.quickset"
fork in Test              := true
parallelExecution in Test := true
version                   := "0.0.0.1"
lazy val zioVersion = "1.0.3"
enablePlugins(BuildInfoPlugin)
buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion)
buildInfoPackage := "org.quickset"

enablePlugins(NativeImagePlugin)

Compile / mainClass := Some("org.quickset.Main")

// Scala libraries
libraryDependencies ++= Seq(
  "dev.zio" %% "zio"                                     % zioVersion,
  "com.github.spotbugs"  % "spotbugs"         % "4.0.2",
  "dev.zio" %% "zio-test"          % zioVersion % "test",
  "dev.zio" %% "zio-test-sbt"      % zioVersion % "test",
)


testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")