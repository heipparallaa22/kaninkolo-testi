
minikube ssh

mkdir kaniko && cd kaniko

echo 'FROM ubuntu' >> dockerfile

echo 'ENTRYPOINT ["/bin/bash", "-c", "echo hello"]' >> dockerfile

echo 'ENTRYPOINT ["tail", "-f", "/dev/null"]' >> dockerfile


ENTRYPOINT ["tail", "-f", "/dev/null"]