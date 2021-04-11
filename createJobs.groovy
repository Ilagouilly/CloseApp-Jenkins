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
                        url 'https://github.com/Ilagouilly/Java-Spring-Boot-Backend'
                    }
                    branch 'DevEnvironment_H2_Branch'
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
                        url 'https://github.com/Ilagouilly/Java-Spring-Boot-Backend'
                    }
                    branch 'DevEnvironment_H2_Branch'
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
                        url 'https://github.com/Ilagouilly/Java-Spring-Boot-Backend'
                    }
                    branch 'DevEnvironment_H2_Branch'
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}
