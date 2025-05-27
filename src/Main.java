import mecanicaDoJogo.FluxoGeral;
import personagens.Inimigo;
import personagens.Sandubinha;
import mecanicaDoJogo.GameOver;
import textos.TextoEnredo;
import textos.TextoItens;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nDigite 'sair' para sair do jogo a qualquer momento:");

            TextoEnredo.ato1Texto();
            Sandubinha sandubinha = new Sandubinha(5, 5);
            Inimigo monstro = new Inimigo("Monstro", 3, 3);
            FluxoGeral.numeroSecretoVida(sandubinha, monstro);

            boolean isGameOver = false;
            int rodada = 1;

            while (sandubinha.getVida() > 0 && monstro.getVida() > 0) {
                FluxoGeral.scannerJogoAto1e3e5ponto1(scanner, sandubinha);

                System.out.println("\n--- Rodada " + rodada + " ---");
                sandubinha.setNumeroSorteado(monstro);
                System.out.println("Sandubinha sorteou: " + sandubinha.getNumeroSorteado());
                monstro.perdeuVida(sandubinha);

                if (monstro.getVida() <= 0) {
                    FluxoGeral.incrementoVida(sandubinha, monstro);
                    TextoItens.entregarPergaminho(sandubinha);
                    break;
                }

                monstro.setNumeroSorteado(sandubinha);
                System.out.println("\nMonstro sorteou: " + monstro.getNumeroSorteado());
                sandubinha.perdeuVida(monstro);
                Thread.sleep(1000);

                if (sandubinha.getVida() <= 0) {
                    System.out.println("\nSandubinha levou um golpe fatal e perdeu a luta!");
                    isGameOver = true;
                    break;
                }

                FluxoGeral.statusDaRodada(sandubinha, monstro);
                rodada++;
            }

            if (isGameOver) {
                GameOver.textoGameOver1();
                if (!GameOver.recomecar(scanner)) break;
                continue;
            }

            System.out.println("Processus ministerii – muito obrigado, tome o artefato “Guia de atendimento” e vá para o próximo desafio");
            Thread.sleep(2000);


            TextoEnredo.ato2Texto();
            Inimigo urso = new Inimigo("Urso Demoníaco", 6, 6);
            FluxoGeral.numeroSecretoVida(sandubinha, urso);

            int rodada2 = 1;
            while (sandubinha.getVida() > 0 && urso.getVida() > 0) {
                FluxoGeral.scannerJogoAto2(scanner, sandubinha);
                System.out.println("\n--- RODADA " + rodada2 + " ---");
                Thread.sleep(1000);
                sandubinha.setNumeroSorteado(urso);

                if (sandubinha.getPergaminho().statusPergaminho()) {
                    for (int i = 0; i < 2; i++) {
                        sandubinha.setNumeroSorteado(urso);
                        urso.perdeuVida(sandubinha);
                    }sandubinha.getPergaminho().desativarPergaminho();
                } else {
                    for (int i = 0; i < 2; i++) {
                        sandubinha.setNumeroSorteado(urso);
                        System.out.println("Sandubinha sorteou: " + sandubinha.getNumeroSorteado());
                        urso.perdeuVida(sandubinha);
                    }
                }

                if (urso.getVida() <= 0) {
                    FluxoGeral.incrementoVida(sandubinha, urso);
                    TextoItens.entregarPlacaDePedra(sandubinha);
                    TextoItens.entregarEstilingue(sandubinha);
                    break;
                }

                for (int i = 0; i < 2; i++) {
                    urso.setNumeroSorteado(sandubinha);
                    System.out.println("Urso sorteou: " + urso.getNumeroSorteado());
                    sandubinha.perdeuVida(urso);
                }

                if (sandubinha.getVida() <= 0) {
                    System.out.println("\nSandubinha foi derrotado pelo Urso Demoníaco...");
                    isGameOver = true;
                    break;
                }

                FluxoGeral.statusDaRodada(sandubinha, urso);
                rodada2++;
            }

            System.out.println("\n--- Fim do combate ---\n");
            Thread.sleep(1500);

            if (isGameOver) {
                GameOver.textoGameOver2();
                if (!GameOver.recomecar(scanner)) break;
                continue;
            }

            System.out.println("Ancião faturador – muito obrigado, mas tô ocupado demais para agradecimentos longos, tome o artefato sagrado e siga em frente");
            System.out.println("Sandubinha ganha o artefato “Faturamentus”");


            TextoEnredo.ato3Texto();
            Inimigo dragao = new Inimigo("Dragão Demoníaco", 12, 12);
            FluxoGeral.numeroSecretoVida(sandubinha, dragao);
            System.out.println("Rodada contra oponente aéreo, só é possível lutar usando estiligue");

            int rodada3 = 1;
            while (sandubinha.getVida() > 0 && dragao.getVida() > 0) {
                FluxoGeral.scannerJogoAto1e3e5ponto1(scanner, sandubinha);
                System.out.println("\n--- Rodada " + rodada3 + " ---");
                Thread.sleep(1000);
                sandubinha.setNumeroSorteado(dragao);
                sandubinha.getEstilingue().ativarEstilingue();

                for (int i = 0; i < 3; i++) {
                    sandubinha.setNumeroSorteado(dragao);
                    dragao.perdeuVida(sandubinha);
                }

                if (dragao.getVida() <= 0) {
                    FluxoGeral.incrementoVida(sandubinha, dragao);
                    TextoItens.entregarCapa(sandubinha);
                    break;
                }

                for (int i = 0; i < 3; i++) {
                    dragao.setNumeroSorteado(sandubinha);
                    System.out.println("Dragao sorteou: " + dragao.getNumeroSorteado());
                    sandubinha.perdeuVida(dragao);
                }

                if (sandubinha.getVida() <= 0) {
                    System.out.println("\nSandubinha foi derrotado pelo Dragao...");
                    isGameOver = true;
                    break;
                }

                FluxoGeral.statusDaRodada(sandubinha, dragao);
                rodada3++;

            }
            sandubinha.getEstilingue().desativarEstilingue();

            if (isGameOver) {
                GameOver.textoGameOver3();
                if (!GameOver.recomecar(scanner)) break;
                continue;
            }
            TextoEnredo.precedenteAto4Texto();


            System.out.println("Deseja usar a Azah Transmissão para subir a Torre de Contas a Receber?");
            FluxoGeral.scannerJogoPreAto4(scanner, sandubinha);

            if (sandubinha.getVida() <= 0) {
                System.out.println("Nosso herói escorregou na escada de forma patética, sucumbindo ao seu trágico fim ");
                if (!GameOver.recomecar(scanner)) {
                    break;
                } else {
                    continue;
                }
            }

            TextoEnredo.ato4Texto();
            Inimigo estatua = new Inimigo("Estátua do último herói", 25, 25);
            FluxoGeral.numeroSecretoVida(sandubinha, estatua);
            int rodada4 = 1;
            while (sandubinha.getVida() > 0 && estatua.getVida() > 0) {
                FluxoGeral.scannerJogoAto4(scanner, sandubinha);
                System.out.println("\n--- Rodada " + rodada4 + " ---");
                Thread.sleep(1000);
                sandubinha.setNumeroSorteado(estatua);

                if (sandubinha.getPergaminho() != null && sandubinha.getPergaminho().statusPergaminho()) {
                    for (int i = 0; i < 5; i++) {
                        sandubinha.setNumeroSorteado(estatua);
                        estatua.perdeuVida(sandubinha);
                    }
                    sandubinha.getPergaminho().desativarPergaminho();
                } else if (sandubinha.getPlacaDePedra() != null && sandubinha.getPlacaDePedra().statusPlacaDePedra()) {
                    for (int i = 0; i < 5; i++) {
                        sandubinha.setNumeroSorteado(estatua);
                        estatua.perdeuVida(sandubinha);
                    }
                    sandubinha.getPlacaDePedra().desativarPlacaDePedra();
                } else if (sandubinha.getEstilingue() != null && sandubinha.getEstilingue().statusEstilingue()) {
                    for (int i = 0; i < 5; i++) {
                        sandubinha.setNumeroSorteado(estatua);
                        estatua.perdeuVida(sandubinha);
                    }
                    sandubinha.getEstilingue().desativarEstilingue();

                } else if (sandubinha.getCapa() != null && sandubinha.getCapa().statusCapa()) {
                    for (int i = 0; i < 5; i++) {
                        sandubinha.setNumeroSorteado(estatua);
                        estatua.perdeuVida(sandubinha);
                    }
                    sandubinha.getCapa().desativarCapa();
                } else {
                    for (int i = 0; i < 5; i++) {
                        sandubinha.setNumeroSorteado(estatua);
                        System.out.println("Sandubinha sorteou: " + sandubinha.getNumeroSorteado());
                        estatua.perdeuVida(sandubinha);
                    }
                }

                System.out.print("\n");
                if (estatua.getVida() <= 0) {
                    FluxoGeral.incrementoVida(sandubinha, estatua);
                    TextoItens.entregarColar(sandubinha);
                    break;
                }

                for (int i = 0; i < 5; i++) {
                    estatua.setNumeroSorteado(sandubinha);
                    System.out.println("Estatua sorteou: " + estatua.getNumeroSorteado());
                    sandubinha.perdeuVida(estatua);
                }


                if (sandubinha.getVida() <= 0) {
                    System.out.println("\nSandubinha foi derrotado pela estatua...");
                    isGameOver = true;
                    break;
                }

                FluxoGeral.statusDaRodada(sandubinha, estatua);
                rodada4++;

            }

            if (isGameOver) {
                GameOver.textoGameOver4();
                if (!GameOver.recomecar(scanner)) break;
                continue;
            }
            System.out.println("Estátua do último herói – ...");
            Thread.sleep(2000);
            System.out.println("Sandubinha – É assustador olhar para essa estátua despedaçada e ver a forma do último herói");

            FluxoGeral.scannerJogoPreAto5(scanner, sandubinha, sandubinha.getInventario());
            TextoEnredo.ato5Texto(scanner);

            Inimigo glozium = new Inimigo("Glozium", 100, 100);
            FluxoGeral.numeroSecretoVida(sandubinha, glozium);

            int rodada5 = 1;

            if (sandubinha.getVida() > 0 && glozium.getVida() > 0 && sandubinha.getEspadaZG() != null && sandubinha.getEspadaZG().statusEspadaZG()) {
                while (sandubinha.getVida() > 0 && glozium.getVida() > 0) {
                    FluxoGeral.scannerJogoAto1e3e5ponto1(scanner, sandubinha);
                    System.out.println("\n--- Rodada " + rodada5 + " ---");
                    Thread.sleep(1000);
                    sandubinha.setNumeroSorteado(glozium);
                    sandubinha.getEspadaZG().ativarEspadaZG();

                    for (int i = 0; i < 10; i++) {
                        sandubinha.getEspadaZG().ativarEspadaZG();
                        glozium.perdeuVida(sandubinha);
                        System.out.println("\n");
                    }

                    if (glozium.getVida() <= 0) {
                        TextoEnredo.final1();
                        isGameOver = true;
                        break;
                    }

                    for (int i = 0; i < 10; i++) {
                        glozium.setNumeroSorteado(sandubinha);
                        System.out.println("Glozium sorteou: " + glozium.getNumeroSorteado());
                        sandubinha.perdeuVida(glozium);
                    }

                    if (sandubinha.getVida() <= 0) {
                        System.out.println("Sandubinha foi derrotado por Glozium...");
                        isGameOver = true;
                        break;
                    }

                    FluxoGeral.statusDaRodada(sandubinha, glozium);
                    rodada5++;
                }
            }
            else {
                while (sandubinha.getVida() > 0 && glozium.getVida() > 0) {
                    FluxoGeral.scannerJogoAto5(scanner, sandubinha);
                    System.out.println("\n--- Rodada " + rodada5 + " ---");
                    Thread.sleep(1000);
                    sandubinha.setNumeroSorteado(glozium);

                    if (sandubinha.getPergaminho() != null && sandubinha.getPergaminho().statusPergaminho()) {
                        for (int i = 0; i < 10; i++) {
                            sandubinha.setNumeroSorteado(glozium);
                            glozium.perdeuVida(sandubinha);
                        }
                        sandubinha.getPergaminho().desativarPergaminho();

                    } else if (sandubinha.getPlacaDePedra() != null && sandubinha.getPlacaDePedra().statusPlacaDePedra()) {
                        for (int i = 0; i < 10; i++) {
                            sandubinha.setNumeroSorteado(glozium);
                            glozium.perdeuVida(sandubinha);
                        }
                        sandubinha.getPlacaDePedra().desativarPlacaDePedra();

                    } else if (sandubinha.getEstilingue() != null && sandubinha.getEstilingue().statusEstilingue()) {
                        for (int i = 0; i < 10; i++) {
                            sandubinha.setNumeroSorteado(glozium);
                            glozium.perdeuVida(sandubinha);
                        }
                        sandubinha.getEstilingue().desativarEstilingue();

                    } else if (sandubinha.getCapa() != null && sandubinha.getCapa().statusCapa()) {
                        for (int i = 0; i < 10; i++) {
                            sandubinha.setNumeroSorteado(glozium);
                            glozium.perdeuVida(sandubinha);
                        }
                        sandubinha.getCapa().desativarCapa();

                    } else if (sandubinha.getColar() != null && sandubinha.getColar().statusColar()) {
                        for (int i = 0; i < 10; i++) {
                            sandubinha.setNumeroSorteado(glozium);
                            glozium.perdeuVida(sandubinha);
                        }
                        sandubinha.getColar().desativarColar();

                    } else {
                        for (int i = 0; i < 10; i++) {
                            sandubinha.setNumeroSorteado(glozium);
                            System.out.println("Sandubinha sorteou: " + sandubinha.getNumeroSorteado());
                            glozium.perdeuVida(sandubinha);
                        }
                    }

                    if (glozium.getVida() <= 0) {
                        TextoEnredo.final2();
                        isGameOver = true;
                        break;
                    }

                    for (int i = 0; i < 10; i++) {
                        glozium.setNumeroSorteado(sandubinha);
                        System.out.println("Glozium sorteou: " + glozium.getNumeroSorteado());
                        sandubinha.perdeuVida(glozium);
                    }

                    if (sandubinha.getVida() <= 0) {
                        TextoEnredo.final3();
                        isGameOver = true;
                        break;
                    }

                    FluxoGeral.statusDaRodada(sandubinha, glozium);
                    rodada5++;

                }

            }
            if (isGameOver) {
                if (!GameOver.recomecar(scanner)) break;
            }
        }
    }
}

