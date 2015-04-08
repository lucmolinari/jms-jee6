package com.lucianomolinari.jms_example.entity;

import java.io.Serializable;

public final class User implements Serializable {
	private static final long serialVersionUID = 8734596722276424601L;

	private final String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}