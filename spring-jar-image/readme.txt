kubectl create secret \
    docker-registry dockercred \
    --docker-server=https://index.docker.io/v1/ \




kubectl create -f pod.yaml

kubectl logs kaniko



spring-jar-image/dockerfile/app.jar