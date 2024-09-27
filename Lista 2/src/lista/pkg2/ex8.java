package lista.pkg2;

import java.util.Scanner;

public class ex8 {
    
    Scanner f = new Scanner(System.in);
    String numero;
    String numerosfinais;
    String finais;

    public ex8() {
    numero = f.nextLine();
    
    if (numero.length() >=4) {
        numerosfinais = numero.substring(numero.length() - 4);
       
        finais = numerosfinais;
        
        System.out.println("Últimos 4 dígitos: " + finais);
    }else{
        System.out.println("Número inválido!");
    }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    

    
}
