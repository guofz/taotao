package com.study.rabbitmq.publishSubscribe;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * 同一条消息发布到多个客户端
 * 
 * @author 丰志
 *
 */
public class Publish {

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
        for(int i = 1 ; i <= 5; i++){
            String message = "Hello World! " + i;
            /*通道发布消息（包括交换机名称、要发布的内容）*/
            channel.basicPublish(EXCHANGE_NAME, "", null, message.getBytes());
            System.out.println(" [x] Sent '" + message + "'");
        }
        channel.close();
        connection.close();
    }
}
