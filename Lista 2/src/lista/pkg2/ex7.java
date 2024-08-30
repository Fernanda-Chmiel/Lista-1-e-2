package lista.pkg2;

import java.util.Scanner;

public class ex7 {
    
    Scanner f = new Scanner(System.in);
    String email;
    String dominio;
    String[] extrair;

    public ex7() {
    email = f.nextLine();
    extrair = email.split("@");
   
    if (extrair.length == 2){
        dominio = extrair[1];
        System.out.println("Domínio: " + dominio);
    }else {
        System.out.println("email inválido!");
    }
   
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
