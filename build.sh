#kubectl delete -f dapi.yaml

#build image
docker build -t dapi .

#Tag image
#docker tag dapi asia.gcr.io/mhdanh-hello-kubernete/dapi

#Push image
#docker push asia.gcr.io/mhdanh-hello-kubernete/dapi

#Create Deployment
#kubectl apply -f dapi.yaml
