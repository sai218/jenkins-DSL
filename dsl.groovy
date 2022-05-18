job('dsljob-1'){
    stages{
        
        stage('git checkout'){

            steps{
                git 'https://github.com/sai218/sai-login.git'
            }
        }

            }
}
   
