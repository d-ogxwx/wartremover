crossScalaVersions := Seq("2.11.12", "2.12.10", "2.12.11", "2.12.12", "2.13.0", "2.13.1", "2.13.2", "2.13.3")

wartremoverErrors += Wart.Serializable

scalacOptions ++= {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, 11)) =>
      Seq("-Xexperimental")
    case _ =>
      Nil
  }
}
