package com.kiraitami.placassinesp.models;


public class Result {
    private String CodigoSituacao;
    private String Situacao;
    private String Modelo;
    private String Marca;
    private float Ano;
    private float AnoModelo;
    private String Placa;
    private String Data;
    private String Uf;
    private String Municipio;
    private String Chassi;
    private String DataAtualizacaoCaracteristicasVeiculo;
    private String DataAtualizacaoRouboFurto;
    private String DataAtualizacaoAlarme;


    // Getter Methods

    public String getCodigoSituacao() {
        return CodigoSituacao;
    }

    public String getSituacao() {
        return Situacao;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public float getAno() {
        return Ano;
    }

    public float getAnoModelo() {
        return AnoModelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public String getData() {
        return Data;
    }

    public String getUf() {
        return Uf;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public String getChassi() {
        return Chassi;
    }

    public String getDataAtualizacaoCaracteristicasVeiculo() {
        return DataAtualizacaoCaracteristicasVeiculo;
    }

    public String getDataAtualizacaoRouboFurto() {
        return DataAtualizacaoRouboFurto;
    }

    public String getDataAtualizacaoAlarme() {
        return DataAtualizacaoAlarme;
    }

    // Setter Methods

    public void setCodigoSituacao(String CodigoSituacao) {
        this.CodigoSituacao = CodigoSituacao;
    }

    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setAno(float Ano) {
        this.Ano = Ano;
    }

    public void setAnoModelo(float AnoModelo) {
        this.AnoModelo = AnoModelo;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public void setUf(String Uf) {
        this.Uf = Uf;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public void setChassi(String Chassi) {
        this.Chassi = Chassi;
    }

    public void setDataAtualizacaoCaracteristicasVeiculo(String DataAtualizacaoCaracteristicasVeiculo) {
        this.DataAtualizacaoCaracteristicasVeiculo = DataAtualizacaoCaracteristicasVeiculo;
    }

    public void setDataAtualizacaoRouboFurto(String DataAtualizacaoRouboFurto) {
        this.DataAtualizacaoRouboFurto = DataAtualizacaoRouboFurto;
    }

    public void setDataAtualizacaoAlarme(String DataAtualizacaoAlarme) {
        this.DataAtualizacaoAlarme = DataAtualizacaoAlarme;
    }
}