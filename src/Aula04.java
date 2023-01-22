//import edu.nataniel.exercicios.Veiculos.*; Não foi utilizado nos outros exercicios
import edu.nataniel.exercicios.Aula04.*;
import edu.nataniel.exercicios.Aula04.interfaces.Calculadora;
import edu.nataniel.exercicios.Aula04.interfaces.OperacaoMatematica;

public class Aula04 {
    public static void main(String[] args) throws Exception {
    
    //Downcast
    Funcionario lili = new Gerente();
    Funcionario natus = new Faxineiro();
    Funcionario leona = new Vendedor();

    //Upcast
    //Gerente liliana = (Gerente) new Funcionario();
    //Deve-se evitar Upcast - da erro de compilação (exception: perda de dados)

    //Herança e Polimorfismo


    ClasseFilha1 filha1 = new ClasseFilha1();
    ClasseFilha2 filha2 = new ClasseFilha2();

    filha1.Metodo1();
    filha1.Metodo2();

    filha2.Metodo1();
    filha2.Metodo2();

    
    Calculadora calc = new Calculadora();

    calc.adicao();
    calc.subtracao();
    calc.divisao();
    calc.multiplicacao();

    }
}
