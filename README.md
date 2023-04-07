# RabbitMQ-Consumer
We will develop two Spring Boot applications, one producer and one consumer application, then we will learn how to use RabbitMQ broker in the Spring boot application to send and receive messages between the Producer and the Consumer.
![image](https://user-images.githubusercontent.com/59931951/230567414-dfb81210-1be1-4b5a-af02-18fb9a2d5c19.png)

Four stations participate in the transmission of the messages:

Producer: creates the messages
Exchanger: delivers messages
Queue: stores messages
Consumer: processes the message

#Install RabbitMQ using Docker
 Assuming the Docker Desktop has been installed, we use the following command to pull a RabbitMQ Docker image from DockerHub.

# docker pull rabbitmq:3.11-management

 After the Docker image is downloaded and saved, we can start a RabbitMQ container using the following command:

# docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.11-management
