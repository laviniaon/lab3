package lab3q1;

public class PavaoAdapter implements Ave {
    private PavaoAzul pavao;

    public PavaoAdapter(PavaoAzul pavao) {
        this.pavao = pavao;
    }

    @Override
    public void voar() {
        System.out.println("Desculpe, pavões não conseguem voar.");
    }

    @Override
    public void emitirSom() {
        pavao.cantar();
    }
}