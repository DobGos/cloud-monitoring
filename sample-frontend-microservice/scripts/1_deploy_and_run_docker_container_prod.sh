#!/bin/bash
sudo docker run -d --name sample-frontend-microservice -p 4200:80  --name sample-frontend-microservice sample-frontend-microservice:latest