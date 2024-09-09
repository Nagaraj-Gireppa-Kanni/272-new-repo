# HelloWorld MicroServices Application

## Name : Nagaraj GK

### SJSU ID : 017465422

## Overview

> - This project demonstrates a simple microservices architecture with two services:
>
> 1. Hello Service: Returns the message "Hello".
> 2. World Service: Returns the message "World".
>
> - Both services are containerized using Docker and can be deployed and accessed locally.

## Technologies used in this Application

> 1. Java with Springboot
> 2. Docker
> 3. MiniKube
> 4. VSCode

## How to Run Applications individually

### 1. Hello Application

> 1. Navigate to directory hello/src/main/java/Hellocontroller.java
> 2. Run the file Hellocontroller.java in vscode
> 3. Application will be live on localhost and port number 8081 "http://localhost:8081/hello"
> 4. Run Maven to package the application - ./mvnw clean package , This will create a .jar file in the target/ directory.

### 1. World Application

> 1. Navigate into directory world-service/src/main/java/Worldcontroller.java
> 2. Run the file Woldcontroller.java in vscode
> 3. Application will be live on localhost and port number 3001 "http://localhost:8080/world"
> 4. Run Maven to package the application - ./mvnw clean package , This will create a .jar file in the target/ directory.

### Build Docker Images Using this Applications

> - Hello application docker Build
>   - docker build -t hello-service .

> - World application docker Build
>   - docker build -t world-service .

> 1. To run Hello application using docker image, run following commands
>    1. "docker tag hello-service nagsgk/hello-service"
>    2. "docker push nagsgk/hello-service"
>    3. "docker rmi hello-service nagsgk/hello-service "
>    4. "docker run -p 8081:8081 nagsgk/hello-service"
>    5. open "http://localhost:8081/hello"

> 2. To pull World docker image,run following command
>    1. "docker tag world-service nagsgk/world-service"
>    2. "docker push nagsgk/world-service"
>    3. "docker rmi world-service nagsgk/world-service "
>    4. "docker run -p 8080:8080 nagsgk/world-service"
>    5. open "http://localhost:8080/world"

## Running mircroservices on Kubernetes Cluster using minikube

> 1. open CMD and run following command
>    - minikube start

> 2. Deployment objects
>    - Go into /kubernetes directory
>      - run "kubectl apply -f hello-deployment.yaml"
>      - run "kubectl apply -f world-deployment.yaml"

> 3. Serivce Objects
>    - run "kubectl apply -f hello-service.yaml"
>    - run "kubectl apply -f world-service.yaml"

> 4. Check everthing is running smoothly
>    - run "kubectl get pods"
>    - run "kubectl get services"

> 5. To get url for accessing the combined service
>
> - run "minikube service combined-service --url"
> - Open the URL in your browser to see "Hello World".
