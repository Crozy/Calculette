pipeline{
agent any
stages{
stage('Sonar'){
            steps {
               bat 'mvn sonar:sonar'
            }
         }

stage('Build') {
steps{
	javac -Xlint:deprecation *.java
	}
   }
}
}