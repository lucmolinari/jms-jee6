package com.lucianomolinari.jms_example.jms;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import com.lucianomolinari.jms_example.entity.User;

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/queue/test") })
public class MessageConsumer implements MessageListener {

	@Override
	public void onMessage(Message message) {
		ObjectMessage objMsg = (ObjectMessage) message;
		try {
			System.out.println(">>>>> Receiving message with user " + ((User) objMsg.getObject()).getName());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}