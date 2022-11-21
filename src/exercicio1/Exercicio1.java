

package exercicio1;
import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        
    String datanascimento;    
    String nome;
    float altura;
    
    
    Pessoa pessoa = new Pessoa();
    Scanner read = new Scanner (System.in);
        
        System.out.println("Informe o nome de uma pessoa");
        nome = read.nextLine();
        System.out.println("Informe a data de nascimendo (da/ma/aa)");
        datanascimento = read.nextLine();
        System.out.println("Informe a altura da pessoa");
        altura = read.nextFloat();
        
        
        pessoa.setname(nome);
        pessoa.setaltura(altura);
        pessoa.setdatanascimento(datanascimento);
        pessoa.imprimir();
        pessoa.calcularidade();
    }
    
}
