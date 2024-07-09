def call(String dockerImage, String dockerImageTag, String dockerFilePath, String registryCredentialsid){
    def imageName= "${dockerImage}:${dockerImageTag}"
    echo "IMAGE:${imageName}"
    def buildImage= docker.build(imageName,"-f ${dockerFilePath}")
    docker.withRegistry('',registryCredentialsid){
        buildImage.push()
    }
}