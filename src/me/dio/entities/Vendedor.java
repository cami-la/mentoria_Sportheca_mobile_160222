package me.dio.entities;

import me.dio.entities.CalculaBonificacao;
import me.dio.entities.FuncionarioCLT;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
  private Double valorDaBonificacao;

  @Override
  public void calculaBonificacao(Double porcentagemBonificacao) {
    this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
  }

  @Override
  public String toString() {
    return "Vendedor{" +
        "nome='" + nome + '\'' +
        ", documento='" + documento + '\'' +
        ", valorSalario=" + valorSalario +
        ", endereco=" + endereco.getBairro() +
        ", valorDaBonificacao=" + valorDaBonificacao +
        '}';
  }
}
