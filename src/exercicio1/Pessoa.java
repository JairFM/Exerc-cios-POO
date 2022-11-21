package exercicio1;
import java.util.Calendar;
public class Pessoa {
    
    private String nome;
    private String datadenascimento;
    private float altura;
    
    public void setname(String nomes) {
        
        nome = nomes;
    }
    
    public String getname() {
        
        return nome;
    }
    
    public void setdatanascimento(String datas) {
        
        datadenascimento = datas;
         
        
    }
    
    public String getdatanascimento() {
        
        return datadenascimento;
    }
    
        public void setaltura(float alturas) {
        
        altura = alturas;
    }
    
    public float getaltura() {
        
        return altura;
    }
    
        public void imprimir() {
        
        System.out.println("Dados da pessoa: ");
        System.out.println("Nome --> " + getname());
        System.out.println("Data de nascimento --> " + getdatanascimento());
        System.out.println("Altura --> " + getaltura());
    }
    
    public void calcularidade() {
        
        Calendar calendario = Calendar.getInstance();
        int dataactual = calendario.get(Calendar.YEAR);
        String datapart[] = datadenascimento.split("/");
        int anonascimento = Integer.parseInt(datapart[2]);
        int idadeactual = dataactual - anonascimento;
        
        System.out.println("Idade actual --> "+ idadeactual + " anos");
        
     
        
    }
    

}



