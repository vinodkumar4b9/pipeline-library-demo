def my_function(String serverIp, String scriptArgument) {
    def script_content = libraryResource 'my_scripts/test.sh'
    // create a file with script_bash content
    writeFile file: './test.sh', text: script_content
    echo "Execute remote script test.sh..."
    def sshCommand = "ssh username@${serverIp} \'bash -xs\' < ./test.sh ${scriptArgument}"
    echo "Ssh command is: ${sshCommand}"
    sh(sshCommand)
}