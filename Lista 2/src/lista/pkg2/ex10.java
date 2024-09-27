package lista.pkg2;

import java.util.Scanner;

public class ex10 {
   Scanner f = new Scanner(System.in);
    String palavra;
    int vogal = 0;
    int consoante = 0;
    
    
    public ex10() {
   palavra = f.nextLine();
   
   palavra = palavra.toLowerCase();
   
   for (char conta : palavra.toCharArray()) {
       if (conta == 'a' || conta == 'e' || conta == 'i' || conta == 'o' || conta == 'u'){
           vogal++;
       }else if (conta >='a' && conta <='z'){
           consoante++;
       }  
       }
    } 

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getVogal() {
        return vogal;
    }

    public void setVogal(int vogal) {
        this.vogal = vogal;
    }

    public int getConsoante() {
        return consoante;
    }

    public void setConsoante(int consoante) {
        this.consoante = consoante;
    }
    
    
    
}
