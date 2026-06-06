package br.inatel.cdg.Threads;

import br.inatel.cdg.Estoque.Estoque;

public class EstoqueThread extends Thread {

    private final Estoque estoque;

    public EstoqueThread(Estoque estoque) {
        this.estoque = estoque;
    }

    @Override
    public void run() {

        while (true) {

            System.out.println(" ");
            System.out.println("== Verificando estoque ==");

            estoque.verificarEstoqueBaixo();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {

                System.out.println(
                        "Monitoramento encerrado."
                );

                break;
            }
        }
    }
}