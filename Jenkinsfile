pipeline {
     agent any
  tools {
    maven "mvn3"
  }
  
  stages {
    stage('pullscm') {
      steps {
        git branch: 'main', credentialsId: 'GitHub', url: 'git@github.com:sathishbob/functional-testing.git'
      }
    }
    stage('execute test') {
      steps {
        sh "mvn clean test"
      }
    }
  }
}
