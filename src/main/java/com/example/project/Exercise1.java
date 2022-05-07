package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));
		}
	}

	public String convertirBaseGabriel(int numBase) {
		int numCifras = Integer.toString(numBase).length();
		boolean esBaseGabriel = verificarBaseGabriel(numBase, numCifras);

		if(esBaseGabriel){
			int numGabriel = 0;
			for(int i = 0; i<numCifras;i++) {
				numGabriel += (numBase%10)*(Math.pow(2, i+1)-1); 
				numBase /= 10;
			}
			return Integer.toString(numGabriel);
		}
		else
			return "El numero proporcionado no esta en base Gabriel.";

	}
	public boolean verificarBaseGabriel(int numBase, int numCifras) {	
		int ultimaCifra;
		boolean hayDos = false , hayUno = false;
		for(int i = 0; i<numCifras;i++) {
			ultimaCifra = numBase%10;
			if(ultimaCifra != 2 && ultimaCifra != 0 && ultimaCifra!=1) {
				return false;
			}else if(ultimaCifra == 2) {
				if(hayUno || hayDos) {
					return false;
				}
				hayDos = true;
			}else if(ultimaCifra == 1){
				hayUno = true;
			}
			numBase /= 10;
		}
		return true;
	}
}
