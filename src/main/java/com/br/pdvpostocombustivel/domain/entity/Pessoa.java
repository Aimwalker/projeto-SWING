package com.br.pdvpostocombustivel.domain.entity;

import java.util.Date;

public class Pessoa{

    private String Nome;
    private Date Datadenascimento;
    private Double CpfCnpj;
    private Integer Ctps;
    private Integer Idade;

    /**
     * @construtores: nome, datadenascimento, cpfCnpj, ctps
     */
    public Pessoa(String nome, Date datadenascimento, Integer cpfCnpj, Integer ctps) {
        Nome = nome;
        Idade = idade;
        Datadenascimento = datadenascimento;
        CpfCnpj = cpfCnpj;
        Ctps = ctps;
    }

    /**
     * @Getters: nomecompleto, idade, datadenascimento, cpfCnpj, ctps
     */
    public String getNome() {
        return Nome;
    }

    public Date getDatadenascimento() {
        return Datadenascimento;
    }

    public Integer getCpfCnpj() {
        return CpfCnpj;
    }

    public Integer getCtps() {
        return Ctps;
    }

    public Integer getIdade() {
        return Idade;
    }

    /**
     * @setters: nomecompleto, idade, datadenascimento, cpfCnpj, ctps
     */
    public void setNome(String nomecompleto) {
        Nome = nome;
    }

    public void setDatadenascimento(Date datadenascimento) {
        Datadenascimento = datadenascimento;
    }

    public void setCpfCnpj(Integer cpfCnpj) {
        CpfCnpj = cpfCnpj;
    }

    public void setCtps(Integer ctps) {
        Ctps = ctps;
    }

    public void setIdade(Integer idade) {
        Idade = idade;
    }
}