def call() {
   withEnv(['PUPPY_DOH=bobby']) {
    sh(libraryResource('test.sh'))
  }
}
