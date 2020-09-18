#!/usr/bin/env groovy

def call(args) {
    def scriptDir = WORKSPACE + '@libs/pipeline-library-demo'
    sh "chmod +x do-something.sh"
    sh "$scriptDir/do-something.sh $args"
}
