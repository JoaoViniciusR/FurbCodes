package AtividadePesoAltura;

import java.util.ArrayList;
import java.util.List;

import AtividadePesoAltura.Enum.Categoria;

public class LutadorController {
    private List<Lutador> lutadores;

    public LutadorController() {
        lutadores = new ArrayList<>();
    }

    // Create
    public void cadastrarLutador(String nome, float peso) {
        Lutador novoLutador = new Lutador(nome, peso, Categoria.NAO_INFORMADO);
        lutadores.add(novoLutador);
    }

    // Read
    public Lutador buscarLutadorPorNome(String nome) {
        for (Lutador lutador : lutadores) {
            if (lutador.getNome().equals(nome)) {
                return lutador;
            }
        }
        return null;
    }

    public List<Lutador> listarLutadores() {
        return lutadores;
    }

    // Update
    public boolean atualizarPesoLutador(String nome, float novoPeso) {
        Lutador lutador = buscarLutadorPorNome(nome);
        if (lutador != null) {
            lutador.setPeso(novoPeso);
            return true;
        }
        return false;
    }

    // Delete
    public boolean removerLutador(String nome) {
        Lutador lutador = buscarLutadorPorNome(nome);
        if (lutador != null) {
            lutadores.remove(lutador);
            return true;
        }
        return false;
    }

    public Categoria doCategotia(String nome) {
        Lutador lutador = buscarLutadorPorNome(nome);
        if (lutador != null) {
            if (lutador.getPeso() < 55) {
                lutador.setCategoria(Categoria.PLUMA);
            } 
            else {
                if (lutador.getPeso() <= 64) {
                    lutador.setCategoria(Categoria.LEVE);
                } else if (lutador.getPeso() >= 65 && lutador.getPeso() <= 74) {
                    lutador.setCategoria(Categoria.MEIO_LEVE);
                } else if (lutador.getPeso() >= 75) {
                    lutador.setCategoria(Categoria.PESADO);
                }
            }

        }
        return lutador.getCategoria();
    }
}
