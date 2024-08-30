package lista.pkg2;

import java.util.Scanner;

public class ex2 {
    
    Scanner f = new Scanner(System.in);
    String frase;
    String modificada;

    public ex2() {
    frase = f.nextLine();
    modificada = frase.replace('a', '*').replace('A', '*');
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getModificada() {
        return modificada;
    }

    public void setModificada(String modificada) {
        this.modificada = modificada;
    }
    
    
}
