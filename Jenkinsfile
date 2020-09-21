@Library('pipeline-library-demo')_

pipeline {
  agent any
  stages {
    stage('MyStage') {
        steps {
            script {
                my_script.my_function()
            }
        }
    }
  }
}
