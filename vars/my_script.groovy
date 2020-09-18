#!/usr/bin/env groovy

def my_function(String serverIp, String scriptArgument) {
    def script_content = libraryResource 'resources/com/org/scripts/print-hello.sh'
    // create a file with script_bash content
    writeFile file: './print-hello.sh', text: script_content
    echo "Execute remote script print-hello.sh..."
    def sshCommand = "ssh username@${serverIp} \'bash -xs\' < ./test.sh ${scriptArgument}"
    echo "Ssh command is: ${sshCommand}"
    sh(sshCommand)
}
