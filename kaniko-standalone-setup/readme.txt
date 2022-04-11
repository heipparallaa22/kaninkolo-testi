kubectl create secret \
    docker-registry dockercred \
    --docker-server=https://index.docker.io/v1/ \
    --docker-username=qwerty22 \
    --docker-password=OKOoko_1212 \
    --docker-email=unto.j.valkonen@icloud.com



kubectl create -f kaniko-restapi.yaml

kubectl logs kaniko


kaniko-standalone-setup/restapi/docker/Dockerfile