   job("job-dsl") {
    
    scm {
        git("https://github.com/sai218/sai-login.git", "master")
    }

    steps{
       sh 'mvn clean install '
   }

    
   }



