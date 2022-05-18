job('dsljob-1'){
    steps{
         git ('checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/sai218/sai-login.git']]])')
    }
        

}

   
