pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('CloseApp-Backend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/Ilagouilly/CloseApp-Backend.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
pipelineJob('CloseApp-Backend-Docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/Ilagouilly/CloseApp-Backend.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}
pipelineJob('CloseApp-Backend-Aws') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/Ilagouilly/CloseApp-Backend.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}