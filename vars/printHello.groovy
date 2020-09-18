def call(Map parameters = [:]) {
    def printHelloScript = libraryResource 'com/org/scripts/print-hello.sh'
    def name = parameters.name
    //the following line gives me headaches
    sh(printHelloScript(name))
}
