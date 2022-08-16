package Repositorio;

import Entidades.Setor;

import java.util.ArrayList;
import java.util.List;

public class RepositorioSetor implements IRepositorioSetor {


    List<Setor> listaSetores = new ArrayList<Setor>();

    @Override
    public boolean salvarSetor(Setor setor) {
        try {
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
    public boolean alterarSetor(Setor setor) {

        for (Setor setor1 : listaSetores) {
            if(setor1.getId()==setor.getId()){

                listaSetores.remove(setor1);
                listaSetores.add(setor);
            }
        }
        return false;
    }
}
