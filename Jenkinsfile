node {
    properties([
        pipelineTriggers([
            pollSCM('*/2 * * * *')
        ])
    ])

    docker.image('maven:3.8.6-openjdk-11-slim').inside('-p 3001:3001') {
        stage('Build') {
            sh 'mvn clean install'
        }
        stage('Test') {
            sh 'mvn test'
        }
    }
}