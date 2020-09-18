#!/usr/bin/env groovy

def call(args) {
    def scriptDir = WORKSPACE + '@libs/my-shared-library'
    sh "$scriptDir/do-something.sh $args"
}
