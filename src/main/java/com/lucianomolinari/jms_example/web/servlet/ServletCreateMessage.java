package com.lucianomolinari.jms_example.web.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lucianomolinari.jms_example.entity.User;
import com.lucianomolinari.jms_example.jms.MessageCreator;

@WebServlet("/test")
public class ServletCreateMessage extends HttpServlet {
	private static final long serialVersionUID = -973490316445738120L;

	@EJB
	private MessageCreator messageCreator;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>>>Creating test message...");
		messageCreator.sendMessage(new User("Test user"));
	}

}