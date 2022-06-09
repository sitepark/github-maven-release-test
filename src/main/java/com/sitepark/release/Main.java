package com.sitepark.release;

@SuppressWarnings("PMD")
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		if (args.length > 0) {
			main.hello(args[0]);
		} else {
			main.usage();
		}
	}

	private void hello(String name) {
		System.out.println("Hello " + name);
	}

	private void usage() {
		System.out.println("main [name]");
	}
}
