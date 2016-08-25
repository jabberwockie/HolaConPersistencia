package com.nisum.onboarding.main;

import java.io.IOException;
import java.util.Scanner;
import com.nisum.onboarding.hw.Greeting;
import com.nisum.onboarding.hw.Log;

public class Main {

	public static void main(String[] args) {
		
		Greeting iorana = new Greeting();
		Scanner leer = new Scanner(System.in);
		String opt;
		Log log = new Log();
		do {
		System.out.println("Ingrese su nombre");
		String name=leer.nextLine();
		System.out.println("-----------------");
		System.out.println(iorana.sayHello(name));
		
		try {
			log.addLog(iorana.sayHello(name));
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Desea ingresar otro nombre? [y/n]");
		opt = leer.nextLine();
		
		} while (opt.toLowerCase().equals("y"));
		
		leer.close();
	}

}
