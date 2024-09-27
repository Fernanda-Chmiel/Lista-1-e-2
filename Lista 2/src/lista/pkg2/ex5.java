package lista.pkg2;

import java.util.Scanner;

public class ex5 {
    Scanner f = new Scanner(System.in);
    String frase;
    String[] palavra;
    int soma;

    public ex5() {
    frase = f.nextLine();
    palavra = frase.split("\\s+");
    soma = palavra.length; 
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
    
    

}
