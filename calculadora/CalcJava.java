
package calculadora;

import java.util.Scanner;

public class CalcJava { 

	static public void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		Numero n1=new Numero();
		Numero n2=new Numero();
		Numero resp=new Numero();
		Numero resp1=new Numero ();
		Numero resp2=new Numero ();
		Numero resp3=new Numero ();

		String opc= "s";

		while (opc.equals("s") || opc.equals("S")) {
			
			System.out.printf("Resolva 4 operações em 3 cliques! %n%nDigite o primeiro valor: ");
			n1.setValor(new Scanner(System.in).nextInt());

			System.out.printf("%nDigite o segundo valor: ");
			n2.setValor(new Scanner(System.in).nextInt());

			resp3.setValor(n1.getValor() / n2.getValor());

			resp2.setValor(n1.getValor() * n2.getValor());

			resp1.setValor(n1.getValor() - n2.getValor());

			resp.setValor(n1.getValor() + n2.getValor());

			System.out.printf("%nA seguir as operações: %n %d + %d é: %d %n",n1.getValor(),n2.getValor(),resp.getValor());
			System.out.printf(" %d - %d é: %d %n", n1.getValor(), n2.getValor(), resp1.getValor());
			System.out.printf(" %d x %d é: %d %n", n1.getValor(), n2.getValor(), resp2.getValor());
			System.out.printf(" %d / %d é: %d %n", n1.getValor(), n2.getValor(), resp3.getValor());
			System.out.printf("%nDeseja efetuar outra operação? %n digite a letra:[S] para continuar.");

			opc=new Scanner(System.in).next();
			System.out.printf("%n%n");

		}

	}
}

