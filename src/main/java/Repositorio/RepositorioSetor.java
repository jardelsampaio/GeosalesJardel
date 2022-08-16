package repositorio;

import entidades.Setor;

import java.util.ArrayList;
import java.util.List;

public class RepositorioSetor implements IRepositorioSetor {

    //Array
    List<Setor> listaSetores = new ArrayList<Setor>();

    @Override
    public boolean salvarSetor(Setor setor) {
        try { //Tratamento de exceção para tratar erro
            listaSetores.add(setor);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    @Override
    public boolean deletarSetorPorID(Long id) {

    for (Setor setor : listaSetores) {

        if(setor.getId()==id){
            listaSetores.remove(setor);
        }
     }
        return false;
    }

    @Override
    public List<Setor> listarSetor() {
        return listaSetores;
    }

    @Override
    public boolean alterarSetor(long id, Setor setor) {
        boolean deuCerto = false;
        Setor setorAuxiiar = new Setor();
        for (Setor setor1 : listaSetores) {
            if(setor1.getId()==id){
                deuCerto = true;
                setorAuxiiar = setor1;
            }
        }
        listaSetores.remove(setorAuxiiar);
        listaSetores.add(setor);
        return deuCerto;
    }
}
