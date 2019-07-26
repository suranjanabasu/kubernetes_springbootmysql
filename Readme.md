  585  eval $(minikube docker-env)
	
  586  cd ..
  587  ls
  588  cd book_service_1.0/
  589  ls
  590  docker build -t booksservice:v1.0 .
  591  docker images
  592  kubectl create -f namespace-development.yaml
  593  kubectl create -f namespace-testing.yaml
  594  cd ../yaml/
  595  kubectl create -f namespace-testing.yaml
  596  kubectl create -f persistent-volume-mysql.yaml
  597  kubectl create -f persistent-volume-claim-mysql.yaml
  598  kubectl create -f deployment-mysql.yaml
  599  kubectl get deployments --all-namespaces
  600  kubectl get pods --all-namespaces
  601  kubectl create -f service-mysql.yaml
  602  kubectl get services --all-namespaces
  603  kubectl --namespace=nl-amis-testing run -it --rm --image=mysql:5.7 --restart=Never mysql-client -- mysql -h mysql-service.nl-amis-testing -ppassword
  604  kubectl create -f deployment-booksservice-tst-v1.0.yaml
  605  kubectl get deployments --all-namespaces
  606  kubectl get pods --all-namespaces
  607  kubectl create -f service-booksservice-tst-v1.0.yaml
  608  kubectl get services --all-namespaces
  609  kubectl --namespace=nl-amis-testing run -it --rm --image=mysql:5.7 --restart=Never mysql-client -- mysql -h mysql-service.nl-amis-testing -ppassword
  610  history
