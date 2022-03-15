kubectl create secret \
    docker-registry dockercred \
    --docker-server=https://index.docker.io/v1/ \




kubectl create -f kaniko-restapi.yaml

kubectl logs kaniko


kaniko-standalone-setup/restapi/docker/Dockerfile