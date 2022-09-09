
import java.util.HashSet;
import java.util.Set;


public class Pessoa {
    //atributos ou características
     protected String nome;
     protected int idade;
     protected int dataN;
    
    //comportamentos ou metodos (funcao)
    public void setNome(String nome){
       this.nome = nome; 
       
       
       
    }
    
    public String getNome(){
        return nome;
    }
    
    
    int calc(int anoN){
        int idade = 2022 - anoN;
        return idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDataN() {
        return dataN;
    }
    public void setDataN(int dataN) {
        this.dataN = dataN;
    }
}
