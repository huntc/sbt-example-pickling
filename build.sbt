name := "sbt-pickling-example"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "org.scala-lang" %% "scala-pickling" % "0.8.0-SNAPSHOT",
  "com.assembla.scala-incubator" %% "graph-core" % "1.7.0"
  )

resolvers += Resolver.sonatypeRepo("snapshots")