package com.seduc1.banco.entities;


import com.seduc1.banco.entities.enums.Genero;
import jakarta.persistence.*;

@Table(name ="tb_banco")
@Entity
public class Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private String cidade;
    private String tipoDeConta;
    private int idade;
    private Genero genero;
    private String foto;

    public Banco(){

    }

    public Banco(int id, String nome, String cpf, String email, String telefone, String endereco, String cidade, String tipoDeConta, int idade, Genero genero, String foto) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
        this.tipoDeConta = tipoDeConta;
        this.idade = idade;
        this.genero = genero;
        this.foto = foto;
    }

    public Banco(String nome, String cpf, String email, String telefone, String endereco, String cidade, String tipoDeConta, int idade, Genero genero, String foto) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
        this.tipoDeConta = tipoDeConta;
        this.idade = idade;
        this.genero = genero;
        this.foto = foto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public int getIdade() {
        return idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getFoto() {
        return foto;
    }
}


