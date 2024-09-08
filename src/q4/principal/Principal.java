package q4.principal;

import q1eq2.basica.Processo;
import q4.estrutura.Pilha;

public class Principal {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        // Empilhando processos
        pilha.empilhar(new Processo(1, "Documento 1"));
        pilha.empilhar(new Processo(2, "Documento 2"));
        pilha.empilhar(new Processo(3, "Documento 3"));

        // Mostrando a pilha
        System.out.println("Pilha original:");
        pilha.mostrar();

        // Verificando o topo da pilha
        System.out.println("\nTopo da pilha: " + pilha.verificarTop());

        // Desempilhando um processo
        System.out.println("\nDesempilhando processo:");
        pilha.desempilhar();
        pilha.mostrar();
    }
}
