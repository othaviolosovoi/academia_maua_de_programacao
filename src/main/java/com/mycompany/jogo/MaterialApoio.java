/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author mateu
 */
public class MaterialApoio {
    private String materialApoio;
    private String escopo;
    private int idMaterial;

    public String getMaterialApoio() {
        return materialApoio;
    }

    public void setMaterialApoio(String materialApoio) {
        this.materialApoio = materialApoio;
    }

    public String getEscopo() {
        return escopo;
    }

    public void setEscopo(String escopo) {
        this.escopo = escopo;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public MaterialApoio(String materialApoio, String escopo, int idMaterial) {
        this.materialApoio = materialApoio;
        this.escopo = escopo;
        this.idMaterial = idMaterial;
    }
}
