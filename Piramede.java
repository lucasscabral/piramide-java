package piramede;

import java.util.Scanner;

public class Piramede {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o numero de linhas que voce quer que a piramde tenha: ");
    int linhas = entrada.nextInt();

    for (int i = 1; i < linhas + 1; i++) {
      for (int j = 1; j < i; j++) {
        System.out.print(i);
      }
      System.out.println(i);
    }

  }
}
