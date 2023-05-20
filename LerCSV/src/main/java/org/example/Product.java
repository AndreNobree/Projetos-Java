package org.example;

import java.io.Serializable;

public class Product implements Serializable {
//    private static final long serialVersionUID = 1l;

    private String status;
    private Integer patrimonio;
    //    private String foto;
    private String descricao;
    private String marca;
    private String grupo;
    private String modelo;
    private String garantia;
    private String local;
    private String valorManu;
//    private String funcao;


    public Product (String status, Integer patrimonio, String descricao, String marca,String grupo,
                    String modelo, String garantia, String local, String valorManu){
        super();
        this.status = status;
        this.patrimonio = patrimonio;
//        this.foto = foto;
        this.descricao = descricao;
        this.marca = marca;
        this.grupo = grupo;
        this.modelo = modelo;
        this.garantia = garantia;
        this.local = local;
        this.valorManu = valorManu;
//        this.funcao = funcao;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Integer patrimonio) {
        this.patrimonio = patrimonio;
    }

//    public String getFoto() {
//        return foto;
//    }
//
//    public void setFoto(String foto) {
//        this.foto = foto;
//    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getValorManu() {
        return valorManu;
    }

    public void setValorManu(String valorManu) {
        this.valorManu = valorManu;
    }

//    public String getFuncao() {
//        return funcao;
//    }
//
//    public void setFuncao(String funcao) {
//        this.funcao = funcao;
//    }


    @Override
    public String toString() {
        return "PRODUTO{" +
                "status='" + status + '\'' +
                ", patrimonio=" + patrimonio +
//                ", foto=" + foto +
                ", descricao=" + descricao +
                ", marca=" + marca +
                ", grupo=" + grupo +
                ", modelo=" + modelo +
                ", garantia=" + garantia +
                ", local=" + local +
                ", valor=" + valorManu +
//                ", funcao=" + funcao +

                '}';
    }
}