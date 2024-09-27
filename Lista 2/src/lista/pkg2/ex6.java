package lista.pkg2;

import java.util.Scanner;

public class ex6 {
    
    Scanner f = new Scanner(System.in);
    String nome;
    StringBuilder palavra2;
    String nomeformatado;
    String[] palavras;
    String nomefinal;

    public ex6() {
        nome = f.nextLine();
        palavra2 = new StringBuilder();
        palavras = nome.split("\\s+");

        for (String palavra : palavras) {
            if (palavra.length() > 0) {
                String palavra1 = palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase();
                palavra2.append(palavra1).append(" ");

                nomefinal = palavra2.toString().trim();
            }
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomefinal() {
        return nomefinal;
    }

    public void setNomefinal(String nomefinal) {
        this.nomefinal = nomefinal;
    }
    
    
    
}
