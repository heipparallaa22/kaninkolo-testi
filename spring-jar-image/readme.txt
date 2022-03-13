kubectl create secret \
    docker-registry dockercred \
    --docker-server=https://index.docker.io/v1/ \
    --docker-username=qwerty22 \
    --docker-password=OKOoko2222 \
    --docker-email=unto.j.valkonen@icloud.com




kubectl create -f pod.yaml

kubectl logs kaniko