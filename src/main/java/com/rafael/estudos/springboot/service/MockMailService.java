package com.rafael.estudos.springboot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class MockMailService extends AbstractEmailService {

	private static final Logger LOG = LoggerFactory.getLogger(MockMailService.class);

	@Override
	public void sendEmail(SimpleMailMessage msg) {

		LOG.info("Simulando  envio de email");
		LOG.info(msg.toString());
		LOG.info("Email enviado ");

	}

}