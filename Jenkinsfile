node {
    properties([
        pipelineTriggers([
            pollSCM('*/2 * * * *')
        ])
    ])

    checkout scm

    docker.image('maven:3.8.6-openjdk-11-slim').inside('-p 3001:3001') {
        stage('Build') {
            sh 'mvn clean install'
        }
        stage('Test') {
            sh 'mvn test'
        }
        stage('Manual Approval') {
            input message: 'Lanjutkan ke tahap Deploy? (Klik "Proceed" untuk melanjutkan)' 
        }
        stage('Deploy') {
            sh './jenkins/scripts/deliver.sh'
            sleep 60 
        }
    }
}