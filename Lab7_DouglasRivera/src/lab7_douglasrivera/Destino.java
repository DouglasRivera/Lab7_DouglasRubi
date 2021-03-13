/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_douglasrivera;

import java.io.Serializable;

/**
 *
 * @author river
 */
public class Destino implements Serializable  {
    String Lugar;
    String Nombre;
    int Distancia;
    String TipoSuperficie;
    int SaturacionOxigeno;
    
    private static final long SerialVersionUID = 234L;

    public Destino() {
    }

    public Destino(String Lugar, String Nombre, int Distancia, String TipoSuperficie, int SaturacionOxigeno) {
        this.Lugar = Lugar;
        this.Nombre = Nombre;
        this.Distancia = Distancia;
        this.TipoSuperficie = TipoSuperficie;
        this.SaturacionOxigeno = SaturacionOxigeno;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }

    public String getTipoSuperficie() {
        return TipoSuperficie;
    }

    public void setTipoSuperficie(String TipoSuperficie) {
        this.TipoSuperficie = TipoSuperficie;
    }

    public int getSaturacionOxigeno() {
        return SaturacionOxigeno;
    }

    public void setSaturacionOxigeno(int SaturacionOxigeno) {
        this.SaturacionOxigeno = SaturacionOxigeno;
    }
    
}
