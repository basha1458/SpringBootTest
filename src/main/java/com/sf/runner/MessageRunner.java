package com.sf.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

public class MessageRunner implements CommandLineRunner {
	public static Logger log = LoggerFactory.getLogger(MessageRunner.class);

	@Override
	public void run(String... args) throws Exception {
		try {
			log.info("STARTED");
			int a = 10;
			System.out.println("MessageRunnerApp");
			System.out.println("MessageRunnerApp");

		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("END");

	}

}
