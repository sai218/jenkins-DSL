job('job-1'){
   steps{
       shell ('echo hello world!')
   }

}


job('job-2'){
   steps{
       shell ('echo hello')
   }

}

