package lab3q1;

public class PatoDomestico implements Ave {
    @Override
    public void voar() {
        System.out.println("Pato doméstico voando baixo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Quack! Quack!");
    }
}