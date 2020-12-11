public class Instrumento {
    protected String nome;

    public Instrumento(String nome){
        this.nome = nome;
    }

    public void tocar(){
        System.out.println(this.nome + "está tocando.");
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
