package lista.pkg2;

import java.util.Scanner;

public class ex9 {
    Scanner f = new Scanner(System.in);
    String ler;
    String modificada;

    public ex9() {
    ler = f.nextLine();
    modificada = ler.replaceAll("\\s+", " ").trim();
    }

    public String getLer() {
        return ler;
    }

    public void setLer(String ler) {
        this.ler = ler;
    }

    public String getModificada() {
        return modificada;
    }

    public void setModificada(String modificada) {
        this.modificada = modificada;
    }
    
    
}
