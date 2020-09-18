@Library('pipeline-library-demo')_

pipeline {
  agent any
  stages {
    stage('MyStage') {
        steps {
            script {
                my_script.my_function("192.168.1.1", "scriptArgumentValue")
            }
        }
    }
  }
}
