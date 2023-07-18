package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int quantity = Integer.parseInt(scanner.nextLine());

    for (int i = 1; i <= quantity; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String activityName = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + i + ":");
      int activityWeight = Integer.parseInt(scanner.nextLine());
    }
  }
}