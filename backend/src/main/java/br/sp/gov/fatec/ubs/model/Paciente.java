package br.sp.gov.fatec.ubs.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nomeCompleto;
    private String nomeSocial;
    private String nomeMae;
    private String nomePai;
    private LocalDate dataNascimento;
    private String sexo;
    private String nacionalidade;
    private String municipioNascimento;
    private String racaCor;
    private String frequentaEscola;
    private String escolaridade;
    private String situacaoFamiliar;
    private String vinculoEstabelecido;
    private String cadastroEstabelecido;
    private String deficiencia;
    private String tipoDeficiencia;
    private String contatoCelular;
    private String contatoResidencial;
    private String contatoComercial;
    private String contatoEmail;
    private String origemEndereco;
    private String dadosEndereco;
    private String identidade;
    @Column(unique = true)
    private String cpf;
     
    public String getNomeCompleto() {
        return nomeCompleto;
    }
 
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
 
    public String getNomeSocial() {
        return nomeSocial;
    }
 
    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }
 
    public String getNomeMae() {
        return nomeMae;
    }
 
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
 
    public String getNomePai() {
        return nomePai;
    }
 
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }
 
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
 
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
 
    public String getSexo() {
        return sexo;
    }
 
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
 
    public String getNacionalidade() {
        return nacionalidade;
    }
 
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
 
    public String getMunicipioNascimento() {
        return municipioNascimento;
    }
 
    public void setMunicipioNascimento(String municipioNascimento) {
        this.municipioNascimento = municipioNascimento;
    }
 
    public String getRacaCor() {
        return racaCor;
    }
 
    public void setRacaCor(String racaCor) {
        this.racaCor = racaCor;
    }
 
    public String isFrequentaEscola() {
        return frequentaEscola;
    }
 
    public void setFrequentaEscola(String frequentaEscola) {
        this.frequentaEscola = frequentaEscola;
    }
 
    public String getEscolaridade() {
        return escolaridade;
    }
 
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
 
    public String getSituacaoFamiliar() {
        return situacaoFamiliar;
    }
 
    public void setSituacaoFamiliar(String situacaoFamiliar) {
        this.situacaoFamiliar = situacaoFamiliar;
    }
 
    public String getVinculoEstabelecido() {
        return vinculoEstabelecido;
    }
 
    public void setVinculoEstabelecido(String vinculoEstabelecido) {
        this.vinculoEstabelecido = vinculoEstabelecido;
    }
 
    public String getCadastroEstabelecido() {
        return cadastroEstabelecido;
    }
 
    public void setCadastroEstabelecido(String cadastroEstabelecido) {
        this.cadastroEstabelecido = cadastroEstabelecido;
    }
 
    public String getDeficiencia() {
        return deficiencia;
    }
 
    public void setDeficiencia(String deficiencia) {
        this.deficiencia = deficiencia;
    }
 
    public String getTipoDeficiencia() {
        return tipoDeficiencia;
    }
 
    public void setTipoDeficiencia(String tipoDeficiencia) {
        this.tipoDeficiencia = tipoDeficiencia;
    }
 
    public String getContatoCelular() {
        return contatoCelular;
    }
 
    public void setContatoCelular(String contatoCelular) {
        this.contatoCelular = contatoCelular;
    }
 
    public String getContatoResidencial() {
        return contatoResidencial;
    }
 
    public void setContatoResidencial(String contatoResidencial) {
        this.contatoResidencial = contatoResidencial;
    }
 
    public String getContatoComercial() {
        return contatoComercial;
    }
 
    public void setContatoComercial(String contatoComercial) {
        this.contatoComercial = contatoComercial;
    }
 
    public String getContatoEmail() {
        return contatoEmail;
    }
 
    public void setContatoEmail(String contatoEmail) {
        this.contatoEmail = contatoEmail;
    }
 
    public String getOrigemEndereco() {
        return origemEndereco;
    }
 
    public void setOrigemEndereco(String origemEndereco) {
        this.origemEndereco = origemEndereco;
    }
 
    public String getDadosEndereco() {
        return dadosEndereco;
    }
 
    public void setDadosEndereco(String dadosEndereco) {
        this.dadosEndereco = dadosEndereco;
    }
 
    public String getCpf() {
        return cpf;
    }
 
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
 
    public String getIdentidade() {
        return identidade;
    }
 
    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
