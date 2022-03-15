
kubectl exec --stdin --tty restapi-deployment-69cd767cbf-chxtv -- /bin/bash

kubectl delete service restapi-service
kubectl delete deployoment restapi-service



ok23:k8s $

kubectl apply -f restapi-deployment.yaml
kubectl apply -f restapi-service22.yaml

kubectl apply -f wiremock-deployment.yaml
kubectl apply -f wiremock-service.yaml


kubectl apply -f wiremock-deployment.yaml
kubectl apply -f wiremock-service.yaml



ok23:k8s $ minikube service --url restapi
http://192.168.99.113:30080

ok23:k8s $ minikube service --url wiremock
http://192.168.99.113:30080





minikube service --url wiremock-service
minikube service --url restapi-service






kubectl create secret \
    docker-registry dockercred \
    --docker-server=https://index.docker.io/v1/ \
