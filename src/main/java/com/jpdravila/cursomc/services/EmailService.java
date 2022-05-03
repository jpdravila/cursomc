package com.jpdravila.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.jpdravila.cursomc.domain.Cliente;
import com.jpdravila.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
