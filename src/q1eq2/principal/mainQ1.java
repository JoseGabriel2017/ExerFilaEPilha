package q1eq2.principal;

import basica.Processo;
import estrutura.Fila;

public class mainQ1 {
    public static void main(String[] args) {
        Fila fila = new Fila();

        // Adicionando processos na fila
        fila.adicionar(new Processo(1, "Documento 1"));
        fila.adicionar(new Processo(2, "Documento 2"));
        fila.adicionar(new Processo(3, "Documento 3"));

        // Mostrando os processos na fila
        System.out.println("Fila original:");
        fila.mostrar();

        // Invertendo a fila
        fila.inverter();
        System.out.println("\nFila invertida:");
        fila.mostrar();

        // Removendo um processo
        System.out.println("\nRemovendo processo:");
        fila.remover();
        fila.mostrar();
    }
}