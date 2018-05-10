pipeline {
  agent any
  stages{
    stage ('Build') {
      steps {
        bat 'mvn clean package'
      }
   post {
      success {
          echo 'Guardando...'
          archiveArtifacts artifacts: '**/target/*.war'
       }
    }
 }
  //  stage ('proyecto-deploy'){
    //  steps {
      //  build job: 'proyecto-deploy'
      //}
   // }
    stage ('Paso a PRO'){
      steps{
        timeout(time:5, unit: 'DAYS'){
          input message:'Aprobar el paso a producción?'
        }
        build job: 'despliegue-PRO'
      }
      post {
        success {
          echo 'Realizado el deploy a PRO.'
        }
        failure{
          echo 'Ha fallado el deploy.'
        }
  }
}
}
