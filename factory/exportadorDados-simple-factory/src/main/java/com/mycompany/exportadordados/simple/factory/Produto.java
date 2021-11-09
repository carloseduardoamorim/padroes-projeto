/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exportadordados.simple.factory;

/**
 *
 * @author cadua
 */
class Produto {
    private int id;
    private String descricao;
    private String marca;
    private String modelo;
    private int estoque;

    public Produto() {
    }

    public Produto(int id, String descricao, String marca, String modelo, int estoque) {
        this.id = id;
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + 
                ", marca=" + marca + ", modelo=" + modelo + ", estoque=" 
                + estoque + '}';
    }
    
    
}