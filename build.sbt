name := "test-repo-2"

scalaVersion := "2.13.5"

/// sbt-github-actions configuration

ThisBuild / crossScalaVersions := Seq("2.13.5")
ThisBuild / githubWorkflowJavaVersions := Seq("adopt@1.8")
