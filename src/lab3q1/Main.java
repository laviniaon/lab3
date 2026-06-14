package lab3q1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testando o Pato Doméstico ===");
        Ave pato = new PatoDomestico();
        pato.emitirSom();
        pato.voar();

        System.out.println("\n=== Testando o Pavão Azul (Via Adaptador) ===");
        PavaoAzul pavaoAzul = new PavaoAzul();
        Ave pavaoAdaptado = new PavaoAdapter(pavaoAzul);
        pavaoAdaptado.emitirSom();
        pavaoAdaptado.voar();
    }
}