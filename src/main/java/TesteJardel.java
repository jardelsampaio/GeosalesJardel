import Entidades.Setor;
import Repositorio.RepositorioSetor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteJardel {
    private static RepositorioSetor rs = new RepositorioSetor();
    public static void main(String[] args) {

        popularArray();
        listarSetores();
        rs.deletarSetorPorID(2L);
        listarSetores();
        alterar();
        listarSetores();
    }

    public static void alterar(){

        Setor setor = new Setor();
        setor.setId(3);
        setor.setNome("Marketing");
        setor.setTelefone(76426789);
        rs.alterarSetor(setor);

    }
    public static void popularArray() {

            Setor setor1 = new Setor();
            setor1.setId(1);
            setor1.setNome("Desenvolvimento");
            setor1.setTelefone(996507380);
            rs.salvarSetor(setor1);

            Setor setor2 = new Setor();
            setor2.setId(2);
            setor2.setNome("Customer Service");
            setor2.setTelefone(88766574);
            rs.salvarSetor(setor2);

            Setor setor = new Setor();
            setor.setId(3);
            setor.setNome("Comercial");
            setor.setTelefone(89357574);
            rs.salvarSetor(setor);

        }

     public static void listarSetores(){
        List<Setor> lista = new ArrayList<Setor>();


        lista = rs.listarSetor();

        for (Setor setor : lista) {
            System.out.println("Id : "+setor.getId());
            System.out.println("Nome : "+setor.getNome());
            System.out.println("Telefone : "+setor.getTelefone());
            System.out.println("----------------------------------------------");
        }
    }
}
