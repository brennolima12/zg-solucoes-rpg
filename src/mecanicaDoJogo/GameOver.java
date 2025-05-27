package mecanicaDoJogo;

import java.util.Scanner;

public class GameOver {
    public static boolean desejaJogarNovamente(Scanner scanner) {
        System.out.print("\nQuer jogar novamente? (sim / nao): ");
        String resposta = scanner.nextLine().trim().toLowerCase();
        return resposta.equals("sim") || resposta.isEmpty();
    }

    public static void textoGameOver1() throws InterruptedException {
        System.out.println("Processus ministerii – oh não, o mundo será mais uma vez destruído por Glozium");
        Thread.sleep(1500);
        System.out.println("O mundo foi destruído por Glozium, uma fatalidade terrível... Fim de jogo!");

    }

    public static void textoGameOver2() throws InterruptedException {
        System.out.println("Ancião faturador – herói merda, nem para cumprir o trabalho dele, estamos perdidos");
        Thread.sleep(1500);
        System.out.println("O mundo foi destruído por Glozium, uma fatalidade terrível... Fim de jogo!");
    }

    public static void textoGameOver3() throws InterruptedException {
        System.out.println("Dragão – Sinto muito herói, que sua alma seja livre…");
        Thread.sleep(1500);
        System.out.println("O mundo foi destruído por Glozium, uma fatalidade terrível… Fim de jogo!");
    }

    public static void textoGameOver4() throws InterruptedException {
        System.out.println("Estátua do último herói – ...");
        Thread.sleep(1500);
        System.out.println("O mundo foi destruído por Glozium, uma fatalidade terrível… Fim de jogo!");
    }

    public static boolean recomecar(Scanner scanner) {
        return GameOver.desejaJogarNovamente(scanner);
    }

}