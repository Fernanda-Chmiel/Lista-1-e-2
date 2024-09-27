package lista.pkg1;
import java.util.Scanner;

public class ex2 {
    Scanner f = new Scanner(System.in);
    String Nome;
    String  Texto;
    String Pedido;

    public ex2() {
        System.out.println("Digite seu nome: ");
        Nome = f.nextLine();
        Texto = "Olá " + Nome + "! Bem-vindo(a) ao programa.";
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    public String getPedido() {
        return Pedido;
    }

    public void setPedido(String Pedido) {
        this.Pedido = Pedido;
    }
    
}
