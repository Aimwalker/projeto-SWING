package com.br.pdvpostocombustivel.domain.entity;

public class Contato {

    public String endereco;
    public String email;
    public Integer telefone;

    /**
     * @construtores: endereco, email, telefone
     */
    public Contato(String endereco, String email, Integer telefone) {
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    /**
     * @Getters: endereco,email,telefone;
     */
    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public Integer getTelefone() {
        return telefone;
    }

    /**
     * @Setters: endereco,email,telefone;
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }
}