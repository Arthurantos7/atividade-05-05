package com.example.aula.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @NotBlank(message = "Telefone é obrigatório.")
    private String telefone;

    @NotBlank(message = "CPF é obrigatório")
    private String CPF;

    @NotBlank(message = "CEP é obrigatório")
    private String CEP;

    @NotBlank(message = "E-mail é obrigatório.")
    @Email(message = "Deve ser um e-mail válido.")
    private String email;

    @NotBlank(message = "Senha é obrigatória.")
    @Size(min = 3, message = "A senha deve ter no mínimo 3 caracteres.")
    private String senha;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String telefone, String CPF, String CEP, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.CEP = CEP;
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Telefone é obrigatório.") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "Telefone é obrigatório.") String Telefone) {this.telefone = telefone;}

    public @NotBlank(message = "CPF é obrigatório.") String getCPF() {
        return CPF;
    }

    public void setCPF(@NotBlank(message = "CPf é obrigatório.") String CPF) {
        this.CPF = CPF;
    }

    public @NotBlank(message = "CEP é obrigatório.") String getCEP() {
        return CEP;
    }

    public void setCEP(@NotBlank(message = "CEP é obrigatório.") String CEP) {
        this.CEP = CEP;
    }

    public @NotBlank(message = "E-mail é obrigatório.") @Email String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "E-mail é obrigatório.") @Email String email) {
        this.email = email;
    }

    public @NotBlank(message = "Senha é obrigatória.") @Size(min = 3, message = "A senha deve ter no mínimo 3 caracteres.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Senha é obrigatória.") @Size(min = 3, message = "A senha deve ter no mínimo 3 caracteres.") String senha) {
        this.senha = senha;
    }
}
