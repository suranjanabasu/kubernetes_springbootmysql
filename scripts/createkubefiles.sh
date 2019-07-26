#!/bin/bash
echo "**** Begin building Docker images"

cd book_service_1.0
docker build -t bookservice:v1.0 .

#cd ..
#cd books_service_2.0
#docker build -t booksservice:v2.0 .

echo "**** End building Docker images"

echo "**** Begin listing Docker images"

docker image ls

echo "**** End listing Docker images"

echo "**** Begin creating Minikube resources"

cd ../yaml
kubectl create -f namespace-development.yaml
kubectl create -f namespace-testing.yaml
kubectl create -f persistent-volume-mysql.yaml
kubectl create -f persistent-volume-claim-mysql.yaml
kubectl create -f deployment-mysql.yaml
kubectl create -f service-mysql.yaml

echo "**** End creating Minikube resources"