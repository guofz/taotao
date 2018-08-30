package com.study.rabbitmq.publishSubscribe;

import java.io.IOException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class ReceiveClient2 {

	private static final String EXCHANGE_NAME = "logs";

    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("47.94.142.251");
		factory.setPort(5672);
		factory.setUsername("root");
		factory.setPassword("111111");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        /*通道声明交换机*/
        channel.exchangeDeclare(EXCHANGE_NAME, "fanout");
        /*通道声明队列，并获取队列的名称*/
        String queueName = channel.queueDeclare().getQueue();
        /*通道将队列和交换机绑定*/
        channel.queueBind(queueName, EXCHANGE_NAME, "");
        System.out.println("客户端2开始接收数据...");
        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println("客户端2接收到的数据：" + message + "'");
            }
        };
        channel.basicConsume(queueName, true, consumer);
    }
}
