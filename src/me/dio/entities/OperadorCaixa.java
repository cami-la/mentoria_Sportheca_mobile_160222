package me.dio.entities;

import me.dio.entities.Endereco;
import me.dio.entities.FuncionarioCLT;

public class OperadorCaixa extends FuncionarioCLT {

  public OperadorCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
    super(nome, documento, valorSalario, endereco);
  }

  public OperadorCaixa() {
  }

  @Override
  public String toString() {
    return "OperadorCaixa{" +
        "nome='" + nome + '\'' +
        ", documento='" + documento + '\'' +
        ", valorSalario=" + valorSalario +
        ", endereco=" + endereco.getRua() +
        '}';
  }
}
