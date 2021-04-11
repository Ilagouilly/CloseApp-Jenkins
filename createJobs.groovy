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
                        url 'https://github.com/Ilagouilly/Java-Spring-Boot-Backend/tree/DevEnvironment_H2_Branch'
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
                        url 'https://github.com/Ilagouilly/Java-Spring-Boot-Backend/tree/DevEnvironment_H2_Branch'
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
                        url 'https://github.com/Ilagouilly/Java-Spring-Boot-Backend/tree/DevEnvironment_H2_Branch'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}
