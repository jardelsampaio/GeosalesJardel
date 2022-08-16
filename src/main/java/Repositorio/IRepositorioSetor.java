package Repositorio;

import Entidades.Setor;

import java.util.List;

public interface IRepositorioSetor {

    //4 funções básicas do Crud - variaveis
    public boolean salvarSetor(Setor setor);
    public boolean deletarSetorPorID(Long id);
    public List<Setor> listarSetor();
    public boolean alterarSetor(Setor setor);

}
