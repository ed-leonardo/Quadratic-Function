package app;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
  public static void main(final String[] args) {
    try {
      System.out.println("");
      final Scanner scan = new Scanner(System.in);
      System.out.println("Digite o coeficiente A:");
      final double a = scan.nextInt();
      System.out.println("Digite o coeficiente B:");
      final double b = scan.nextInt();
      System.out.println("Digite o coeficiente C:");
      final double c = scan.nextInt();
      final DecimalFormat df = new DecimalFormat("##.##");
      df.setRoundingMode(RoundingMode.DOWN);
      
      final double delta = b*b - 4*a*c;
      double raiz;
      if (a==0) {
        System.out.println("Essa função não é de segundo grau");
      } else if (delta < 0) {
        System.out.println("Essa função não possui raízes reais!");            
      } else if (delta == 0) {
        raiz = -b/(2*a);
        System.out.println("A única raiz da função é: " + raiz);
      } else {
        final double segunbaRaiz = (-b + Math.sqrt(delta)) / (2*a);
        raiz = (-b + Math.sqrt(delta)) / 2*a;
        System.out.println("As raízes da função são: " + df.format(raiz) + 
        " e " + segunbaRaiz);
      }
    } catch (Exception ex) {
      System.out.println("Ocorreu um erro!");
    }
  }
}