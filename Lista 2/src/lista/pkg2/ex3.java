package lista.pkg2;

import java.util.Scanner;

public class ex3 {
    
    Scanner f = new Scanner(System.in);
    String usuario;
    String inverter;

    public ex3() {
    usuario = f.nextLine();    
    inverter = new StringBuilder(usuario).reverse().toString();   
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getInverter() {
        return inverter;
    }

    public void setInverter(String inverter) {
        this.inverter = inverter;
    }
    
    
    
}
