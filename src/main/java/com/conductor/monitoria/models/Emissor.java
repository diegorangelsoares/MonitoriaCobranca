package com.conductor.monitoria.models;

import org.hibernate.annotations.Entity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

/**
 * Classe que representa o emissor
 *
 * @author Diego Rangel
 */
@Entity
public class Emissor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String Nome;
    private String ResponsavelCobranca;
    private Date DataCadastro;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getResponsavelCobranca() {
        return ResponsavelCobranca;
    }

    public void setResponsavelCobranca(String responsavelCobranca) {
        ResponsavelCobranca = responsavelCobranca;
    }

    public Date getDataCadastro() {
        return DataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        DataCadastro = dataCadastro;
    }
}
