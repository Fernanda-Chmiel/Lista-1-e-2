package lista.pkg1;

public class ex4 {
    String frase = "Esta é uma frase de exemplo para execício";
    String maiuscula;
    String minuscula;
    int quantidade;
    String substring;

    public ex4() {
        maiuscula = frase.toUpperCase();
        minuscula = frase.toLowerCase();
        quantidade = frase.length();
        substring = frase.substring(11,27);
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getMaiuscula() {
        return maiuscula;
    }

    public void setMaiuscula(String maiuscula) {
        this.maiuscula = maiuscula;
    }

    public String getMinuscula() {
        return minuscula;
    }

    public void setMinuscula(String minuscula) {
        this.minuscula = minuscula;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getSubstring() {
        return substring;
    }

    public void setSubstring(String substring) {
        this.substring = substring;
    }
    
    
    
    
    
}
