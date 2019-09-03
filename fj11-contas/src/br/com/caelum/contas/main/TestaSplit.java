package br.com.caelum.contas.main;

public class TestaSplit {
	public static void main(String[] args) {

		String s = "Socorram-me, subi no ônibus em Marrocos";
		String[] array = s.split(" ");
		System.out.println(array.length);
		for (int i = array.length - 1; i >= 0; i--) {		
			System.out.print(array[i] + " ");
		}
	}
}
