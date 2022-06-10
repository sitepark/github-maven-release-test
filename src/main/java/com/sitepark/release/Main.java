package com.sitepark.release;

/**
 * Commandline Interface to greet someone
 */
@SuppressWarnings("PMD")
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		if (args.length > 0) {
			main.hello(args);
		} else {
			main.usage();
		}
	}

	/**
	 * Print given Names
	 */
	private void hello(String... names) {
		for (String name : names) {
			System.out.println("Hello " + name);
		}
	}

	/**
	 * Print usage
	 */
	private void usage() {
		System.out.println("greet user");
		System.out.println("usage: main [name]");
	}
}
