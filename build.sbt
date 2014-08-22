scalaVersion := "2.11.2"

seq(kataSettings: _*)

kataAutoStart

kataUri in Backend := new URI("http://localhost:8080/P01-P10")

libraryDependencies += "com.scalakata" %% "eval" % "0.5.1"
