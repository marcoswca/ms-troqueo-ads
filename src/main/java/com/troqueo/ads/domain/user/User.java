package com.troqueo.ads.domain.user;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class User {

    @Id
    public ObjectId _id;

    @Field("nome")
    public String nome;

    @Field("cpf")
    public String cpf;

    @Field("email")
    public String email;

    @Field("cnpj")
    public String cnpj;

    @Field("endereco")
    public Address endereco;

    @Field("telefone")
    public Phone telefone;

    public User() {

    }

    public User(ObjectId _id, String nome, String cpf, String email, String cnpj, Address endereco, Phone telefone) {
        this._id = _id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getEndereco() {
        return endereco;
    }

    public void setEndereco(Address endereco) {
        this.endereco = endereco;
    }

    public Phone getTelefone() {
        return telefone;
    }

    public void setTelefone(Phone telefone) {
        this.telefone = telefone;
    }
}
