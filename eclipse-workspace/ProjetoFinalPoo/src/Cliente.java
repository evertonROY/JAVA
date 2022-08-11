
public class Cliente {

    private int id;
    private String nome;
    private String cpf;

    
    public Cliente(int id, String nome, String cpf) {
        
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public Cliente() {
        
    
    }

    public void setCpf(String meuCpf) {
        this.cpf = meuCpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verficarCpf(String meuCpf) {
        // código
    }
}
