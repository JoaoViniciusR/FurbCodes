import java.util.ArrayList;
import java.util.List;

class Revendedora {
    private List<Carro> carros;

    public Revendedora() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public List<Carro> carrosMaisCarosDoAno(int ano) {
        List<Carro> carrosMaisCaros = new ArrayList<>();
        double maiorPreco = Double.MIN_VALUE;

        for (Carro carro : carros) {
            if (carro.getAno() == ano) {
                if (carro.getPreco() > maiorPreco) {
                    carrosMaisCaros.clear();
                    carrosMaisCaros.add(carro);
                    maiorPreco = carro.getPreco();
                } else if (carro.getPreco() == maiorPreco) {
                    carrosMaisCaros.add(carro);
                }
            }
        }

        return carrosMaisCaros;
    }

    public List<Carro> carrosPorMarcaEPreco(String marca, double precoMin, double precoMax) {
        List<Carro> carrosFiltrados = new ArrayList<>();

        for (Carro carro : carros) {
            if (carro.getMarca().equals(marca) && carro.getPreco() >= precoMin && carro.getPreco() <= precoMax) {
                carrosFiltrados.add(carro);
            }
        }

        return carrosFiltrados;
    }

    public List<Carro> carrosMaisCarosEMaisBaratosPorLocal(int localizacao) {
        List<Carro> carrosMaisCarosEMaisBaratos = new ArrayList<>();
        double maiorPreco = Double.MIN_VALUE;
        double menorPreco = Double.MAX_VALUE;

        for (Carro carro : carros) {
            if (carro.getLocalizacao() == localizacao) {
                if (carro.getPreco() > maiorPreco) {
                    carrosMaisCarosEMaisBaratos.clear();
                    carrosMaisCarosEMaisBaratos.add(carro);
                    maiorPreco = carro.getPreco();
                } else if (carro.getPreco() == maiorPreco) {
                    carrosMaisCarosEMaisBaratos.add(carro);
                }

                if (carro.getPreco() < menorPreco) {
                    carrosMaisCarosEMaisBaratos.clear();
                    carrosMaisCarosEMaisBaratos.add(carro);
                    menorPreco = carro.getPreco();
                } else if (carro.getPreco() == menorPreco) {
                    carrosMaisCarosEMaisBaratos.add(carro);
                }
            }
        }

        return carrosMaisCarosEMaisBaratos;
    }
}