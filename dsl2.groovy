job('my-job') {
    scm {
        git("https://github.com/sai218/sai-login.git", "master")
    }
    triggers {
        scm('H/2 * * * *')
    }
    steps {
        maven('-e clean install')
    }
}