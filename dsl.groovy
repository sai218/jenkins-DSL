   job("job-dsl") {
    
    scm {
        git("https://github.com/sai218/sai-login.git", "master")
    }

    configure { node ->
        // === Configure the Maven builder ===
        node / methodMissing('goals', 'clean install') // Specifies the goals to execute, such as "clean install" or "deploy"
    
   }

   }



