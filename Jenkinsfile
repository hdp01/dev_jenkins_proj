pipeline
{
    agent any

    tools
    {
        maven 'MAVEN_HOME'
    }

    stages
    {
        stage('Welcome Stage')
        {
            steps
            {
                echo 'Jenkins Pipeline started for real!'
            }
        }

        stage('Clean Stage')
        {
            steps
            {
                bat 'mvn clean'
            }
        }

        stage('Test Stage')
        {
            steps
            {
                bat 'mvn test'
            }
        }

        stage('Build Stage')
        {
            steps
            {
                bat 'mvn install'
            }
        }

        stage('Success Stage')
        {
            steps
            {
                echo 'build successfully completed'
            }
        }

        stage('Final Stage')
        {
            steps
            {
                echo 'CICD Pipeline Process Completed'
            }
        }
    }
}