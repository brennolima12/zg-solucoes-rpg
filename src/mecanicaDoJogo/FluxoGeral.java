package mecanicaDoJogo;

import itens.Item;
import personagens.Inimigo;
import personagens.Sandubinha;
import textos.TextoItens;

import java.util.List;
import java.util.Scanner;

public class FluxoGeral {
    public static void scannerJogoAto1e3e5ponto1(Scanner scanner, Sandubinha sandubinha) {
        while (true) {
            System.out.print("Digite um comando (atacar / inventario / sair): ");
            String comando = scanner.nextLine().trim().toLowerCase();

            if (comando.equals("inventario")) {
                sandubinha.mostrarInventario();
            } else if (comando.equals("sair")) {
                System.out.println("Jogo Finalizado");
                System.exit(0);
            } else if (comando.equals("atacar")) {
                break;
            } else {
                System.out.println("Comando inválido. Tente novamente.");
            }
        }
    }

    public static void scannerJogoAto2(Scanner scanner, Sandubinha sandubinha) {
        while (true) {
            System.out.print("Digite um comando (atacar / pergaminho / inventario / sair): ");
            String scannerJogoAto2 = scanner.nextLine().trim().toLowerCase();

            if (scannerJogoAto2.equals("inventario")) {
                sandubinha.mostrarInventario();
            } else if (scannerJogoAto2.equals("sair")) {
                System.out.println("Jogo Finalizado");
                System.exit(0);
            } else if (scannerJogoAto2.equals("atacar")) {
                break;
            } else if (scannerJogoAto2.equals("pergaminho")) {
                sandubinha.getPergaminho().ativarPergaminho();
                System.out.println("Sandubinha equipou o pergaminho.");
                break;
            } else {
                System.out.println("Comando inválido. Tente novamente.");
            }
        }

    }

    public static void scannerJogoPreAto4(Scanner scanner, Sandubinha sandubinha) {
        while (true) {
            System.out.print("Digite um comando (sim / nao / inventario / sair): ");
            String comando = scanner.nextLine().trim().toLowerCase();

            if (comando.equals("inventario")) {
                sandubinha.mostrarInventario();
            } else if (comando.equals("sair")) {
                System.out.println("Jogo Finalizado");
                System.exit(0);
            } else if (comando.equals("sim")) {
                System.out.println("Nosso herói foi voando para a Torre de Contas a Receber");
                break;
            } else if (comando.equals("nao")) {
                System.out.println("Nosso herói foi a pé para Torre de Contas a Receber e tomou 10 de dano");
                sandubinha.setVida(sandubinha.getVida() - 3);
                break;
            } else {
                System.out.println("Comando inválido. Tente novamente");
            }
        }
    }

    public static void scannerJogoAto4(Scanner scanner, Sandubinha sandubinha) {
        while (true) {
            System.out.print("Digite um comando (atacar / pergaminho / placa / estilingue / capa / inventario / sair): ");
            String comando = scanner.nextLine().trim().toLowerCase();

            if (comando.equals("inventario")) {
                sandubinha.mostrarInventario();
            } else if (comando.equals("sair")) {
                System.out.println("Jogo Finalizado");
                System.exit(0);
            } else if (comando.equals("atacar")) {
                break;
            } else if (comando.equals("pergaminho")) {
                sandubinha.getPergaminho().ativarPergaminho();
                System.out.println("Sandubinha equipou o pergaminho.");
                break;
            } else if (comando.equals("placa")) {
                sandubinha.getPlacaDePedra().ativarPlacaDePedra();
                System.out.println("Sandubinha equipou a Placa de Pedra.");
                break;
            } else if (comando.equals("estilingue")) {
                sandubinha.getEstilingue().ativarEstilingue();
                System.out.println("Sandubinha equipou o Estilingue.");
                break;
            } else if (comando.equals("capa")) {
                sandubinha.getCapa().ativarCapa();
                System.out.println("Sandubinha equipou a Capa.");
                break;
            } else {
                System.out.println("Comando inválido. Tente novamente.");
            }
        }
    }

    public static void scannerJogoPreAto5(Scanner scanner, Sandubinha sandubinha, List<Item> itens) throws InterruptedException {
        while (true) {
            System.out.print("Deseja ir para Hospitalis e forjar a EspadaZG? Uma vez forjada, só vai poder lutar usando ela (sim / nao / inventario / sair): ");
            String comando = scanner.nextLine().trim().toLowerCase();

            if (comando.equals("sim")) {
                sandubinha.removerItens(itens);
                TextoItens.entregarEspadaZG(sandubinha);
                sandubinha.getEspadaZG().ativarEspadaZG();
                Thread.sleep(1500);
                System.out.println("Sandubinha forja a EspadaZG, e pega a estrada para encontrar Glozium, para o combate final!");
                break;
            } else if (comando.equals("nao")) {
                TextoItens.entregarEspadaZG(sandubinha);
                Thread.sleep(1500);
                System.out.println("Sandubinha escala por fora, vai ao encontro de Glozium, para o combate final!");
                break;
            } else if (comando.equals("inventario")) {
                sandubinha.mostrarInventario();
            } else if (comando.equals("sair")) {
                System.out.println("Jogo Finalizado");
                System.exit(0);
            } else {
                System.out.println("Comando inválido. Tente novamente.");
            }
        }
    }

    public static void scannerJogoAto5 (Scanner scanner, Sandubinha sandubinha){
        while (true) {
            System.out.print("Digite um comando (atacar / pergaminho / placa / estilingue / capa / colar / inventario / sair): ");
            String comando = scanner.nextLine().trim().toLowerCase();

            if (comando.equals("inventario")) {
                sandubinha.mostrarInventario();
            } else if (comando.equals("sair")) {
                System.out.println("Jogo Finalizado");
                System.exit(0);
            } else if (comando.equals("atacar")) {
                break;
            } else if (comando.equals("pergaminho")) {
                sandubinha.getPergaminho().ativarPergaminho();
                System.out.println("Sandubinha equipou o pergaminho.");
                break;
            } else if (comando.equals("placa")) {
                sandubinha.getPlacaDePedra().ativarPlacaDePedra();
                System.out.println("Sandubinha equipou a Placa de Pedra.");
                break;
            } else if (comando.equals("estilingue")) {
                sandubinha.getEstilingue().ativarEstilingue();
                System.out.println("Sandubinha equipou o Estilingue.");
                break;
            } else if (comando.equals("capa")) {
                sandubinha.getCapa().ativarCapa();
                System.out.println("Sandubinha equipou a Capa.");
                break;
            } else if (comando.equals("colar"))  {
                sandubinha.getCapa().ativarCapa();
                System.out.println("Sandubinha equipou o colar.");
                break;
            } else  {
                System.out.println("Comando inválido. Tente novamente.");
            }
        }
    }



    public static void incrementoVida(Sandubinha sandubinha, Inimigo inimigo) {
        System.out.println("\nSandubinha venceu o " + inimigo.getName());
        sandubinha.setVida(sandubinha.getVida());
        sandubinha.setVidaInicial(sandubinha.getVida() + 2);
    }
    public static void numeroSecretoVida(Sandubinha sandubinha, Inimigo inimigo) {
        System.out.println("\nNúmero secreto de Sandubinha: " + sandubinha.getNumeroSecreto());
        System.out.println("Número secreto do " + inimigo.getName() + ": " + inimigo.getNumeroSecreto());
        System.out.println("\nSandubinha - Vida: " + sandubinha.getVida());
        System.out.println(inimigo.getName() + " - Vida: " + inimigo.getVida());
    }

    public static void statusDaRodada(Sandubinha sandubinha, Inimigo inimigo) throws InterruptedException {
        Thread.sleep(1500);
        System.out.println("\nAcompanhe o status da luta!");
        System.out.println("Sandubinha está com " + sandubinha.getVida() + " de vida.");
        System.out.println(inimigo.getName() + " está com " + inimigo.getVida() + " de vida.");
        Thread.sleep(1500);
    }
}
