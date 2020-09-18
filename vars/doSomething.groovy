#!/usr/bin/env groovy

def call(args) {
    def scriptDir = WORKSPACE + '@libs/pipeline-library-demo'\
    sh chmod 777 do-something.sh
    sh "$scriptDir/do-something.sh $args"
}
