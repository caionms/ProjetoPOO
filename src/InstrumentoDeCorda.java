public class InstrumentoDeCorda extends Instrumento{
    protected int numeroDeCordas;
    public InstrumentoDeCorda(String nome, int numeroDeCordas) {
        super(nome);
        this.numeroDeCordas = numeroDeCordas;
    }

    @Override
    public void tocar() {
        super.tocar();
    }

    public void setNumeroDeCordas(int numeroDeCordas) {
        this.numeroDeCordas = numeroDeCordas;
    }

    public int getNumeroDeCordas() {
        return numeroDeCordas;
    }
}
