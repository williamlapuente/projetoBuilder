package projetoBuilder;

import java.util.Scanner;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("Menu:");
            System.out.println("1. Preparar refeição vegetariana");
            System.out.println("2. Preparar refeição não vegetariana");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Meal vegMeal = mealBuilder.prepereVegMeal();
                    System.out.println("Veg Meal");
                    vegMeal.showItems();
                    System.out.println("Total Cost: " + vegMeal.getCost());
                    break;

                case 2:
                    Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
                    System.out.println("\n\nNon-Veg Meal");
                    nonVegMeal.showItems();
                    System.out.println("Total Cost: " + nonVegMeal.getCost());
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 3);

        scanner.close();
    }
}
