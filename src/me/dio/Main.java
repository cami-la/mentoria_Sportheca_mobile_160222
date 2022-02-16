package me.dio;

import me.dio.entities.Endereco;
import me.dio.entities.Gerente;
import me.dio.entities.OperadorCaixa;
import me.dio.entities.Vendedor;

public class Main {

    public static void main(String[] args) {
        //Endereco endereco = new Endereco();
        Endereco endereco =
            new Endereco("Rua funcionário",
                "Complemento endereço funcionário", "bairro funcionário");

        String rua = endereco.getRua();
        System.out.println(rua);

        endereco.setRua("Rua do funcionário Fulano");
        String rua1 = endereco.getRua();

        System.out.println(rua1);
        System.out.println(endereco);
        System.out.println("--------");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Camila Vendedora");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);

        vendedor.calculaBonificacao(5d);

        System.out.println(vendedor);
        System.out.println("--------");

        OperadorCaixa operadorCaixa =
            new OperadorCaixa("Camila Op Caixa", "789.456.123-00", 2000d, endereco);

        //OperadorCaixa OperadorCaixa2 = new OperadorCaixa();
        System.out.println(operadorCaixa);
        System.out.println("--------");

        Gerente gerente = new Gerente();
        gerente.setNome("Camila Gerente");
        gerente.setDocumento("456.123.789-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);

        System.out.println(gerente);


    }
}
