    package lab7_douglasrivera;

import javax.swing.JProgressBar;
import javax.swing.JSpinner;

public class administrarCombustible extends Thread {

    private JProgressBar progBar_c;
    private JProgressBar progBar_d;
    private JSpinner sp_consumo;
    private boolean avanzar;
    private boolean vive;

    public administrarCombustible(JProgressBar progBar_c,
            JProgressBar progBar_d, JSpinner sp_consumo) {
        this.progBar_c = progBar_c;
        this.progBar_d = progBar_d;
        this.sp_consumo = sp_consumo;
        avanzar = true;
        vive = true;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                int d = 1;
                if (progBar_d.getValue() > 0) {
                    d = progBar_d.getValue();
                }
                progBar_c.setValue(progBar_c.getMaximum()
                        - d / (Integer.parseInt(
                                sp_consumo.getValue().toString()))
                );
            }//FIN IF
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
        }

    }

}
