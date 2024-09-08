package q3.estrutura;

import q1eq2.basica.Processo;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private Queue<Processo> fila;

    public Fila() {
        fila = new LinkedList<>();
    }

    public void adicionar(Processo processo) {
        fila.offer(processo);
    }

    public Processo remover() {
        return fila.poll();
    }

    public Processo verificar() {
        return fila.peek();
    }

    public void mostrar() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            fila.forEach(System.out::println);
        }
    }

    public void inverter() {
        LinkedList<Processo> pilha = new LinkedList<>();
        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }
        while (!pilha.isEmpty()) {
            fila.offer(pilha.pop());
        }
    }
}
