#!/usr/bin/env groovy

def my_function(String serverIp, String scriptArgument) {
    def script_content = libraryResource 'com/org/scripts/print-hello.sh'
    // create a file with script_bash content
    writeFile file: './print-hello.sh', text: script_content
    echo "Execute remote script print-hello.sh..."
    sh "chmod 777 ./print-hello.sh"
    sh "./print-hello.sh"
}
