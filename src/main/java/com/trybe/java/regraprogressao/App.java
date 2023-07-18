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

    String activityName;
    int activityWeight;
    int activityScore;
    int activityFinalScore;
    int sumFinalScore = 0;
    int sumFinalWeights = 0;

    for (int i = 1; i <= quantity; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      activityName = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + i + ":");
      activityWeight = Integer.parseInt(scanner.nextLine());

      System.out.println("Digite a nota obtida para " + activityName + ":");
      activityScore = Integer.parseInt(scanner.nextLine());

      activityFinalScore = activityScore * activityWeight;

      sumFinalScore = sumFinalScore + activityFinalScore;
      sumFinalWeights = sumFinalWeights + activityWeight;
    }

    double finalScore = sumFinalScore / sumFinalWeights;
    if (finalScore < 85) {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, "
              + finalScore
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    } else {
      System.out.println("Parabéns! Você alcançou " + finalScore
          + "%! E temos o prazer de informar que você obteve aprovação!");
    }
  }
}