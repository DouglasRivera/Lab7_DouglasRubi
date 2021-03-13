/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_douglasrivera;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;

/**
 *
 * @author river
 */
public class Naves extends Thread implements Serializable {
    String Nombre;
    String Identificador;
    int Cant_Personas;
    int Tiempo;
    int Astro_Abordo;
    int TiempoAterrizaje;
    int Velocidad;
    int Distancia;
    private boolean avanzar;
    private boolean vive;
    private JSpinner JSpinner_Consumo;
    private JProgressBar progBar_Combustible;
    private JProgressBar progBar_TanqueReserva;
    
    private static final long SerialVersionUID = 555L;

    public Naves() {
    }

    public JSpinner getJSpinner_Consumo() {
        return JSpinner_Consumo;
    }

    public void setJSpinner_Consumo(JSpinner JSpinner_Consumo) {
        this.JSpinner_Consumo = JSpinner_Consumo;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JProgressBar getProgBar_Combustible() {
        return progBar_Combustible;
    }

    public void setProgBar_Combustible(JProgressBar progBar_Combustible) {
        this.progBar_Combustible = progBar_Combustible;
    }

    public JProgressBar getProgBar_TanqueReserva() {
        return progBar_TanqueReserva;
    }

    public void setProgBar_TanqueReserva(JProgressBar progBar_TanqueReserva) {
        this.progBar_TanqueReserva = progBar_TanqueReserva;
    }

    public Naves(String Nombre, String Identificador, int Cant_Personas, int Tiempo, int Astro_Abordo, int TiempoAterrizaje, int Velocidad, int Distancia) {
        this.Nombre = Nombre;
        this.Identificador = Identificador;
        this.Cant_Personas = Cant_Personas;
        this.Tiempo = Tiempo;
        this.Astro_Abordo = Astro_Abordo;
        this.TiempoAterrizaje = TiempoAterrizaje;
        this.Velocidad = Velocidad;
        this.Distancia = Distancia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    public int getCant_Personas() {
        return Cant_Personas;
    }

    public void setCant_Personas(int Cant_Personas) {
        this.Cant_Personas = Cant_Personas;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public int getAstro_Abordo() {
        return Astro_Abordo;
    }

    public void setAstro_Abordo(int Astro_Abordo) {
        this.Astro_Abordo = Astro_Abordo;
    }

    public int getTiempoAterrizaje() {
        return TiempoAterrizaje;
    }

    public void setTiempoAterrizaje(int TiempoAterrizaje) {
        this.TiempoAterrizaje = TiempoAterrizaje;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }

    @Override
    public void run() {
         while (vive) {
            if (avanzar) {
               int d = 1;
                if (Distancia > 0) {
                    d = Distancia;
                }
                progBar_Combustible.setValue(progBar_Combustible.getMaximum()
                        - d / (Integer.parseInt(
                                JSpinner_Consumo.getValue().toString()))
                );
                        try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Naves.class.getName()).log(Level.SEVERE, null, ex);
                    };
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    
}
