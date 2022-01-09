pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
               bat "rmdir  /s /q FWD"
                bat "git clone https://github.com/DhamoK/FWD.git"
                bat "mvn clean -f FWD"
            }
        }
        stage('install') {
            steps {
                bat "mvn install -f FWD"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f FWD"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f FWD"
            }
        }
    }
}
