scalaVersion := "2.11.2"

seq(kataSettings: _*)

kataAutoStart

kataUri in Backend := new URI("http://localhost:7331/index")

libraryDependencies += "com.scalakata" %% "eval" % "0.6.0"
