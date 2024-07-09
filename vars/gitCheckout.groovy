def call(Map config) {
    checkout($class: 'GitSCM',
                                branches: [[name: config.branch]],
                                userRemoteConfigs: [[url: config.url, credentialsId: config.credId]])
                                }