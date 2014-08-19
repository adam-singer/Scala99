scalaVersion := "2.11.2"

seq(kataSettings: _*)

kataAutoStart

kataUri in Backend := new URI("http://localhost:8080/hello")
