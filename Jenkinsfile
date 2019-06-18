pipeline {
     agent any
     triggers {
          pollSCM('* * * * *')
     }
     stages {
          stage("Compile") {
               steps {
                    bat "./gradlew compileJava"
               }
          }
          stage("Unit test") {
               steps {
                    bat "./gradlew test"
               }
          }

          stage("Package") {
               steps {
                    bat "./gradlew build"
               }
          }
     }
   }