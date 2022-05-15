job('example1'){
   steps{
       shell ('echo hello world!')
   }

}


job('example2'){
   steps{
       shell ('echo hello')
   }

}

