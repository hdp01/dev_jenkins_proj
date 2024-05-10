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

        stage('Build Stage')
        {
            steps
            {
                bat 'mvn install'
            }
        }

        stage('Clean Stage')
        {
            steps
            {
                echo 'build successfully completed'
            }
        }
    }
}