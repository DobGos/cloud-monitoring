Sample backend microservice created to be deployed on a docker container on AWS EC2 box.

It is created as part of my exploration of tools available to monitor microservices activity deployed in a cloud.

### Build docker image
Run:
```
sudo gradle buildDocker
```
This will build an image with tag `sample-backend-microservice:latest` and will add it to a local running docker.

### Run backend microservice as a docker container from the newly deployed image
To run `sample-backend-microservice:latest` execute:
```
sudo docker run -p 8080:8080 -d --name sample-backend-microservice sample-backend-microservice:latest
```
### Stop backend microservice docker container
```
sudo docker stop sample-backend-microservice
```
### Re-run deployed container
```
sudo docker run -p 8080:8080 -td sample-backend-microservice
```