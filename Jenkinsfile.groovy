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


job('job-3'){
   steps{
       shell ('echo hello dell')
   }

}

