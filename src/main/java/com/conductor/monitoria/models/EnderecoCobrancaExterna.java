package com.conductor.monitoria.models;

import org.hibernate.annotations.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe que representa o endereco de acesso ao parceiro de cobrança do emissor
 *
 * @author Diego Rangel
 */
@Entity
public class EnderecoCobrancaExterna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String endereco;
    public String token;
    public String Emissor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmissor() {
        return Emissor;
    }

    public void setEmissor(String emissor) {
        Emissor = emissor;
    }
}
