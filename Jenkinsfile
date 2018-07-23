pipeline {
    agent anyemailext body: 'Hi Dear', subject: 'Multipipeline', to: 'heena.talreja@einfochips.com'

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
            }
        }
    }
}

