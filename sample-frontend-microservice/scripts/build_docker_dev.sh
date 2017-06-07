#!/bin/bash

ENV=dev
CONTAINER_NAME=sample-frontend-microservice-${ENV}  

docker stop ${CONTAINER_NAME}  
docker rm ${CONTAINER_NAME}


sudo docker build --force-rm --file ../docker/Dockerfile.${ENV} --tag ${CONTAINER_NAME}:latest ../.