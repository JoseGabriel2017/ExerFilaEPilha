import basica.Processo;
import java.util.LinkedList;

public class Fila {
    private LinkedList<Processo> fila;

    public Fila() {
        fila = new LinkedList<>();
    }

    public void adicionar(Processo processo) {
        fila.addLast(processo);
    }

    public Processo remover() {
        return fila.isEmpty() ? null : fila.removeFirst();
    }

    public Processo verificar() {
        return fila.isEmpty() ? null : fila.getFirst();
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
            pilha.push(fila.removeFirst());
        }
        while (!pilha.isEmpty()) {
            fila.addLast(pilha.pop());
        }
    }
}
