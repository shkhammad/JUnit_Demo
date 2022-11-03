pipeline{
	agent any
	
	stages{
		stage('Build'){
			
			steps{
				withMaven(maven : '3.8.6'){
					bat 'mvn clean compile'
				}
			}
		}
		
		stage('Test'){
			
			steps{
				withMaven(maven : '3.8.6'){
					bat 'mvn test'
				}
			}
			
		}
		
	}
}