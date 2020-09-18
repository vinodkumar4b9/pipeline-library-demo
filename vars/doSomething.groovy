#!/usr/bin/env groovy

def call(args) {
    def scriptDir = WORKSPACE + '@libs/pipeline-library-demo'
    sh "chmod +x do-something.sh"
    sh "cp  /var/lib/jenkins/workspace/vinod-latest@libs/pipeline-library-demo/do-something.sh /var/lib/jenkins/workspace/vinod-latest"
    sh "$scriptDir/do-something.sh $args"
}
