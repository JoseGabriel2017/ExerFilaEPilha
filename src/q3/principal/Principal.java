package q3.principal;

import q1eq2.basica.Processo;
import q3.estrutura.Fila;

public class Principal {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adicionar(new Processo(1, "Documento A"));
        fila.adicionar(new Processo(2, "Documento B"));
        fila.adicionar(new Processo(3, "Documento C"));

        System.out.println("Fila original:");
        fila.mostrar();

        System.out.println("\nPrimeiro processo na fila:");
        System.out.println(fila.verificar());

        fila.inverter();
        System.out.println("\nFila invertida:");
        fila.mostrar();

        System.out.println("\nRemovendo processo:");
        fila.remover();
        fila.mostrar();
    }
}
