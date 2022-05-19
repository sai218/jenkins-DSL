job('my-job') {
    scm {
        git("https://github.com/sai218/sai-login.git", "master")
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}