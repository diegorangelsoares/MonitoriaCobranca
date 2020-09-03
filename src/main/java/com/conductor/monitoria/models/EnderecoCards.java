package com.conductor.monitoria.models;

import org.hibernate.annotations.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe que representa o endereco de acesso ao cards do emissor
 *
 * @author Diego Rangel
 */
@Entity
public class EnderecoCards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String Endereco;
    public String Ip;
    public String Porta;
    public String Service;
    public String Usuario;
    public String Senha;
    public long IdEmissor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getIp() {
        return Ip;
    }

    public void setIp(String ip) {
        Ip = ip;
    }

    public String getPorta() {
        return Porta;
    }

    public void setPorta(String porta) {
        Porta = porta;
    }

    public String getService() {
        return Service;
    }

    public void setService(String service) {
        Service = service;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public long getIdEmissor() {
        return IdEmissor;
    }

    public void setIdEmissor(long idEmissor) {
        IdEmissor = idEmissor;
    }
}
