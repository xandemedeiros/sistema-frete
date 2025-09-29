package sistema_frete;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Frete ---");

        System.out.println("\nSIMULAÇÃO 1: ENTREGA DE 10KM");
        
        ServicoDeEntrega servico1 = new ServicoDeEntrega();
        
        Carro carro = new Carro("SDH4D46", 2022);
        Funcionario funcionario = new Funcionario("Alexandre Maciel"); 
        
        servico1.adicionarItem(carro);
        servico1.adicionarItem(funcionario);
        
        double distancia1 = 10.0;
        double custoTotal1 = servico1.calcularCustoTotal(distancia1);
        
        System.out.println("Nome do Entregador: " + funcionario.getNome());
        System.out.println("Cálculos:");
        System.out.printf(" - Custo do Carro: %.2fkm * R$ 1.25 = R$ %.2f\n", distancia1, carro.calcularCustoFrete(distancia1));
        System.out.printf(" - Custo do Funcionário: Fixo = R$ %.2f\n", funcionario.calcularCustoFrete(distancia1));
        System.out.printf("CUSTO TOTAL DA ENTREGA: R$ %.2f\n", custoTotal1);

        System.out.println("\nSIMULAÇÃO 2: ENTREGA DE 25KM");

        ServicoDeEntrega servico2 = new ServicoDeEntrega();

        Moto moto = new Moto("LOL9JK67", 2023);
        Autonomo autonomo = new Autonomo("Michael Jackson");

        servico2.adicionarItem(moto);
        servico2.adicionarItem(autonomo);

        double distancia2 = 25.0;
        double custoTotal2 = servico2.calcularCustoTotal(distancia2);
        
        System.out.println("Nome do Entregador: " + autonomo.getNome());
        System.out.println("Cálculos:");
        System.out.printf(" - Custo da Motocicleta: %.2fkm * R$ 0.45 = R$ %.2f\n", distancia2, moto.calcularCustoFrete(distancia2));
        System.out.printf(" - Custo do Autônomo: %.2fkm * R$ 0.95 = R$ %.2f\n", distancia2, autonomo.calcularCustoFrete(distancia2));
        System.out.printf("CUSTO TOTAL DA ENTREGA: R$ %.2f\n", custoTotal2);
    }
}
