pipeline {
    agent any
    
    stages {
        stage('api-test') {
            agent{
                label 'master'
            }
            steps {
                echo 'Build started...'
                git credentialsId: 'Github Credential', url: 'https://github.com/SudhanSNP/SET.git'
                sh 'dotnet build DotNet/Framework/AutomationFramework/AutomationFramework.sln -p:WarningLevel=0'
                echo 'Build completed...'
                
                echo 'Running API Tests...'
                sh 'dotnet test DotNet/Framework/AutomationFramework/Tests.ApiTests/bin/Debug/net6.0/Tests.ApiTests.dll'
                echo 'Completed API Tests...'
            }
        }
        
        stage('ui-test') {
            agent{
                label 'windows'
            }
            steps {
                echo 'Build started...'
                git credentialsId: 'Github Credential', url: 'https://github.com/SudhanSNP/SET.git'
                bat 'dotnet build DotNet/Framework/AutomationFramework/AutomationFramework.sln -p:WarningLevel=0'
                echo 'Build completed...'
                
                echo 'Running UI Tests...'
                bat 'dotnet test DotNet/Framework/AutomationFramework/Tests.ApiTests/bin/Debug/net6.0/Tests.ApiTests.dll --filter "FullyQualifiedName=Tests.UITests.LoginPageTests.UserLoginTest"'
                echo 'Completed UI Tests...'
            }
        }
    }
}
