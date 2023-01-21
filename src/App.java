import edu.nataniel.exercicios.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        Carro meuCarro = new Carro(45, "Renolte");
        //meuCarro.setMarca("Renolt");
        System.out.println(meuCarro.getMarca());
        //meuCarro.setCapacidadeTanque(45);

        System.out.println("O valor para encher o tanque do carro é: " + meuCarro.valorEncherTanque(4.79));
    }
}
