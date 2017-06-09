# CmonWeb

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `-prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).
Before running the tests make sure you are serving the app via `ng serve`.

## Build docker image
### Dev envioronment
Run:
```
sudo docker build --force-rm -t sample-frontend-microservice-dev:latest .
```
### Prod envioronment
Run:
```
sudo docker build -t --force-rm sample-frontend-microservice-prod:latest .
```

## Run the docker image in a container
```
sudo docker run -d -p 4200:80 --name sample-frontend-microservice sample-frontend-microservice:latest
```

## Stop frontend microservice docker container
```
sudo docker stop sample-frontend-microservice
```

### Re-run deployed container
```
sudo docker run -p 4200:80 -td sample-frontend-microservice
```

### To save the image
```
sudo docker save -o sample-frontend-microservice-latest.tar sample-frontend-microservice:latest
```
### To import saved docker image
```
sudo docker import ./sample-frontend-microservice-latest.tar sample-frontend-microservice:latest
```
### SSH over proxy
```
ssh -i "PUBLIC_KEY.PEM" USERNAME@REMOTE_HOST -o "ProxyCommand=nc -X connect -x PROXYHOST:PROXYPORT %h %p"
```
### SFTP over proxy
```
sftp -i "PUBLIC_KEY.PEM" -o "ProxyCommand=nc -X connect -x PROXYHOST:PROXYPORT %h %p" USERNAME@REMOTE_HOST:[REMOTE_FOLDER]
```
