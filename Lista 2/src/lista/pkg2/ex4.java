package lista.pkg2;

import java.util.Scanner;

public class ex4 {
    
    Scanner f = new Scanner(System.in);
    String palavra;
    String conferir;
    String resultado;
    

    public ex4() {
    palavra = f.nextLine();
    conferir = new StringBuilder(palavra).reverse().toString();
    resultado = (palavra.equals(conferir)) ? palavra + " é um palíndromo" : palavra + " não é um palíndromo";
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    

    
}
