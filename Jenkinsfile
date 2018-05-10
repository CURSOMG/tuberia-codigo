pipeline {
  agent any
  parameters {
    string(name: 'tomcat_dev', defaultValue: 'localhost:8090', description: 'Servidor de PRE')
    string(name: 'tomcat_prod', defaultValue: 'localhost:9090', description: 'Servidor de PRO')
  }
  
  triggers {
    pollSCM('* * * * *')
  }
  
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
    stage ('Deployments'){
      parallel{
        stage ('Deploy to staging'){
          steps {
            bat "cp -i /home/jenkins/tomcat-demo.pem **/target/*.war ec2-user@S{params.tomcat_dev}:/var/lib/tomcat7/webapps"
          }
        }
        
        stage ("Deploy to production"){
          steps{
            bat "cp -i /home/jenkins/tomcat-demo.pem **/target/*.war
            @S
    ******************
    
    
    
    
    
    stage ('proyecto-deploy'){
      steps {
        build job: 'proyecto-deploy'
      }
    }
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

