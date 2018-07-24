pipeline {
    agent any
   
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                 emailext body: 'Hi Dear', subject: 'Multipipeline', to: 'talrejaheena@gmail.com'

            }
        }
    }
}

