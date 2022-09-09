
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(); 
       
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o nome");
        String n = tc.nextLine();
        System.out.println("Digite o ano de nascimento");
        int ano = tc.nextInt();  
        
        p1.setNome(n);
        
        p1.setIdade(p1.calc(p1.getDataN()));
        
        System.out.println("Nome: " +p1.getNome() + " e idade: " +p1.getIdade());
    }
    
}
