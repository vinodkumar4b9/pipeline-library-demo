@Library('pipeline-library-demo')_

pipeline {
  agent any
  stages {
    stage('MyStage') {
        steps {
            script {
                doSomething.call("a")
            }
        }
    }
  }
