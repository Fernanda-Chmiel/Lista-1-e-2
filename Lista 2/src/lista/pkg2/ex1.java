package lista.pkg2;

import java.util.Scanner;

public class ex1 {
    
    Scanner f = new Scanner(System.in);
    String digite;
    int quantidade;

    public ex1() {
        
        digite = f.nextLine();
        quantidade = digite.length();
    }

    public String getDigite() {
        return digite;
    }

    public void setDigite(String digite) {
        this.digite = digite;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
