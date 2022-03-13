
ok23:backend-kube-wiremock-demo $ mvn clean package -DskipTests
ok23:backend-kube-wiremock-demo $ cp ./target/backend-kube-wiremock-demo-*.jar ./docker-compose/restapi/app.jar


kubectl exec --stdin --tty restapi-deployment-69cd767cbf-chxtv -- /bin/bash




kubectl delete service restapi-service
kubectl delete deployoment restapi-service