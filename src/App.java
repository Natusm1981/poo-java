import edu.nataniel.exercicios.Carro;
/**
 * Exercicio de exemplo sobre Classes e Objetos
 */
public class App {
    /**
     * Construtor pode ser vazio ou com sobrecarga;
     * 
     */
    public static void main(String[] args) throws Exception {
        Carro meuCarro = new Carro("Renault", "Clio", "Amarelo", "Manual", 4, 40, 2001, 80);
        //meuCarro.setMarca("Renolt");
        System.out.println(meuCarro.getMarca());
        System.out.println(meuCarro.getModelo());
        System.out.println(meuCarro.getCor());
        System.out.println(meuCarro.getCambio());
        System.out.println(meuCarro.getPortas() + " portas");
        System.out.println(meuCarro.getCapacidadeTanque() + " litros");
        System.out.println(meuCarro.getPotencia()+ " CV");
        System.out.println(meuCarro.getAnoFabricacao() + " Ano de fabricação");

        System.out.println("O valor para encher o tanque do carro é: " + meuCarro.valorEncherTanque(4.79));
    }
}
