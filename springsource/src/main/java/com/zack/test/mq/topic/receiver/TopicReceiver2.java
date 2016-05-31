package com.zack.test.mq.topic.receiver;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

/** 
 * @author zhichao.zzc
 * @version 2016��5��31�� ����10:49:24
 */
@Component
public class TopicReceiver2 implements MessageListener{

	public void onMessage(Message message) {
		try {
            System.out.println("TopicReceiver2���յ���Ϣ:"+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
	}
	
	

}
