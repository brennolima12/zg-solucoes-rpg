package textos;

import java.util.Scanner;

public class TextoEnredo {

    public static void ato1Texto() throws InterruptedException {
        System.out.println("\nUm lugar encantado, dizem que pessoas doentes ou com almas feridas podem ir à floresta para serem curadas.");
        Thread.sleep(1500);
        System.out.println("Sandubinha percorre a floresta e encontra um monstro tenebroso:");
        Thread.sleep(1500);
        System.out.println("Sandubinha – então você é meu primeiro desafio nessa floresta encantada?");
        Thread.sleep(2000);
        System.out.println("Monstro – bem-vindo, vejo que você é um dos escolhidos para enfraquecer Glozium, meu nome é Processus ministerii");
        Thread.sleep(2000);
        System.out.println("Monstro – Sou o ser mágico que atende as almas feridas, envio os informativos disso às cavernas de Faturamentus.");
        Thread.sleep(2000);
        System.out.println("Você não irá lutar comigo, mas sim contra esse ser criado por Glozium. Seres mágicos do meu tipo não podem ser afetados por Glozium, mas também não podem lutar contra, ele me atrapalha me desconcentrando e provocando erros");
        Thread.sleep(1500);
        System.out.println("Surge entre as pernas do grande monstro um ser humanoide, da altura de Sandubinha");
        Thread.sleep(2000);
        System.out.println("Sandubinha – Primeiro, não é enfraquecer, vou dar um fim total em Glozium… Venha monstro!");
        Thread.sleep(1500);
    }

    public static void ato2Texto() throws InterruptedException {
        Thread.sleep(1500);
        System.out.println("Existe sempre um preço a se pagar pela cura do corpo e da alma, após a floresta do atendimentus seu preço é calculado de acordo com o tipo de contrato divino que você tem…");
        Thread.sleep(1500);
        System.out.println("Percorrendo a caverna segurando uma tocha, Sandubinha escuta sons assustadores de grunhidos");
        Thread.sleep(1500);
        System.out.println("O cenário é iluminado por minérios misteriosos. Anciões fantasmas anotam diversas coisas em pergaminhos, estão todos muito ocupados para falar algo a Sandubinha");
        Thread.sleep(1500);
        System.out.println("Sandubinha – Que tipo de situação é essa?");
        Thread.sleep(1500);
        System.out.println("Um monstro em forma de urso surge e diz a Sandubinha");
        Thread.sleep(1500);
        System.out.println("Finalmente diversão, esses anciões só sabem ficar anotando essas coisas inúteis. Vamos lutar heróizinho");
        Thread.sleep(1500);
        System.out.println(" Sandubinha – Criatura desagradável, não me deu tempo nem de tomar uma água, então bora nessa!");
        Thread.sleep(1500);
    }

    public static void ato3Texto() throws InterruptedException {
        Thread.sleep(1500);
        System.out.println("Uma vila mágica que recebe cobranças vindas das cavernas de Faturamentus. Os moradores entregam as mensagens na Torre");
        Thread.sleep(1500);
        System.out.println("Sandubinha é bem recebido em sua chegada. Ele é convidado para um jantar ritualístico com comidas típicas");
        Thread.sleep(1500);
        System.out.println("Os moradores contam que o monstro a ser enfrentado é um ser que voa. Para atacá-lo, o Sandubinha terá que derrubar o monstro e usar sua espada. Então, dão a ele um item, o “Estilingue Mágico”");
        Thread.sleep(1500);
        System.out.println("Logo, um monstro em forma de dragão surge voando:");
        Thread.sleep(1500);
        System.out.println("Dragão da transmissão – Você já tem sua arma… já fui guardião dessas terras e transmitia as mensagens à torre. Mas milênios atrás Glozium me tomou seu escravo, sou obrigado a lutar com toda fúria. Livre-me do sofrimento…");
        Thread.sleep(1500);
        System.out.println("Sandubinha – Você também está preso a um destino que não escolheu, vou te libertar!");
    }

    public static void precedenteAto4Texto() throws InterruptedException {
        System.out.print("");
        Thread.sleep(1500);
        System.out.println("Dragão: muito obrigado, todo herói evitava essa batalha e seguia para a torre, agora sou livre!");
        Thread.sleep(1500);
        System.out.println("Sandubinha – evitava? E dá para seguir sem lutar? como assim?");
        Thread.sleep(1500);
        System.out.println("Sandubinha ganha o artefato “Azah Transmissão”");
        Thread.sleep(1500);
        System.out.println("Sandubinha vai se aproximando da Torre de de Contas a Receber");
        Thread.sleep(1500);
        System.out.print("");
    }

    public static void ato4Texto() throws InterruptedException {
        Thread.sleep(1500);
        System.out.println("A terrível torre é onde seres mágicos recebem o pagamento por seu árduo trabalho. Dizem que a ruína perto da torre era a cidade mais próxima do “grito”, terra natal dos Analytics di Glosium");
        Thread.sleep(1500);
        System.out.println("Sandubinha chega ao primeiro andar da torre. Ele sente uma energia mágica mortífera vindo do topo. Sem dúvidas, Glozium estava lá...");
        Thread.sleep(1500);
        System.out.println("A parede se abre e sai dela o penúltimo monstro a ser enfrentado,");
        Thread.sleep(1500);
        System.out.println("\"Sandubinha – Uma estátua na forma do último herói, por que?\"");
    }

    public static void ato5Texto(Scanner scanner) throws InterruptedException {
        while (true) {
            System.out.print("Deseja pular o diálogo com Glozium? (sim / nao / sair): ");
            String comando = scanner.nextLine().trim().toLowerCase();

            if (comando.equals("sim")) {
                System.out.println("Você pulou o diálogo.");
                return;
            } else if (comando.equals("sair")) {
                System.out.println("Jogo Finalizado");
                System.exit(0);
            } else if (comando.equals("nao")) {
                break;
            } else {
                System.out.println("Comando inválido. Tente novamente.");
            }
        }
        Thread.sleep(1500);
        System.out.println("Sandubinha entra na sala do chefe e se depara com a presença arrepiante de Glozium sentado no trono");
        Thread.sleep(1500);
        System.out.println("Glozium - Um rato invadiu meu recinto; talvez sirva de alimento para meus escravos");
        Thread.sleep(1500);
        System.out.println("Sandubinha - Então você é Glozium? Não é mais aterrorizante que as criaturas apodrecidas que encontrei");
        Thread.sleep(1500);
        System.out.println("Glozium - ha ha ha ha! que petulante");
        Thread.sleep(1500);
        System.out.println("Glozium - Chegou a época, mas mandaram um pobre coitado; péssima ideia");
        Thread.sleep(1500);
        System.out.println("Sandubinha - Vou te destruir, Glozium, e garantir sua aniquilação total e permanente");
        Thread.sleep(1500);
        System.out.println("Glozium - E o que um garoto com cabeça de hambúrguer pode fazer contra um monstro milenar, que presenciou eventos tão singulares, que caminhou sobre a superfície de vulcões e subjugou a humanidade?");
        Thread.sleep(1500);
        System.out.println("Sandubinha lança sua espada girando no ar que fere o monstro e retorna à sua mão");
        Thread.sleep(1500);
        System.out.println("Sandubinha - não subestime alguém com cabeça de hambúrguer, sou um descendente dos Analytics de Glosium. Te procurei em cada canto do inferno para reduzir você a Zero");
        Thread.sleep(1500);
        System.out.println("Glozium - interessante, aceito seu pedido de batalha");
    }

    public static void final1() throws InterruptedException{
        Thread.sleep(1500);
        System.out.println("Sandubinha – Finalmente, Glozium está eliminado por completo, irei retornar à minha família");
        Thread.sleep(1500);
        System.out.println("O herói derrotou Glozium, o mundo agora poderá voltar a seus tempos de alegria. Muito obrigado, herói!");
        Thread.sleep(1500);
        System.out.println("Fim de jogo!");
        Thread.sleep(1500);
    }

    public static void final2() throws InterruptedException {
        Thread.sleep(1500);
        System.out.println("Glozium – você me derrotou com armas tão simples, impressionante, mas irei retornar no ano seguinte");
        Thread.sleep(1500);
        System.out.println("Sandubinha – …retornarei envergonhado para minha família, mas ao menos serei feliz");
        Thread.sleep(1500);
        System.out.println("Sandubinha começa a se enrijecer como pedra...");
        Thread.sleep(1500);
        System.out.println("Glozium – você me derrotou, mas suguei sua energia vital, você irá se transformar em minha estátua da entrada da torre hahaha");
        Thread.sleep(1500);
        System.out.println("Sandubinha – maldito!... Eu… nunc... ir... [virou pedra]");
        Thread.sleep(1500);
        System.out.println("O herói derrotou Glozium ao custo de sua alma, o mundo seguirá normalmente por mais 1 ano… Fim de Jogo!");
    }
    public static void final3() throws InterruptedException {
        System.out.println("\nSandubinha foi derrotado por Glozium...");
        Thread.sleep(1500);
        System.out.println("O mundo foi destruído por Glozium, uma fatalidade terrível… Fim de jogo!");
    }
}
