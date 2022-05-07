package com.example.project;
import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
            System.out.println(obj.getMenorNumeroSaltos(a));			
            
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {
		int numSaltos = 0;
		int piedraActual  = 0;
		for(int i = 0; i<a.length;i++) {
			if (a[i] > piedraActual +50) {
				if(a[i-1] == piedraActual)
					return -1;
				else {
					i--;
					piedraActual = a[i];
					numSaltos++;
				}
			}
		}
		piedraActual = a[a.length-1];
		numSaltos++;
		return numSaltos;
	}
}
