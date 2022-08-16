package Entidades;

public class Setor {
    //atributos
    private long id;
    private String nome;
    private int telefone;

    //Construtor
    public Setor() {
    }

    //Gets e Sets
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
