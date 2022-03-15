
minikube ssh

mkdir kaniko && cd kaniko

echo 'FROM ubuntu' >> dockerfile

echo 'ENTRYPOINT ["/bin/bash", "-c", "echo hello"]' >> dockerfile

    echo 'ENTRYPOINT ["tail", "-f", "/dev/null"]' >> dockerfile
    ENTRYPOINT ["tail", "-f", "/dev/null"]



kubectl create secret \
    docker-registry dockercred \
    --docker-server=https://index.docker.io/v1/ \



kubectl create -f volume.yaml
kubectl create -f volume-claim.yaml
kubectl create -f pod.yaml



kubectl logs kaniko