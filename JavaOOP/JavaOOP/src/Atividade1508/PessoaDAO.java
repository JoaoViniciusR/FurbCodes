package Atividade1508;

import java.util.List;

public interface PessoaDAO {
    void salvar(Pessoa pessoa);

    List<Pessoa> listarTodos();

    void excluir(Pessoa pessoa);

    Pessoa buscarPorId(int id);
}