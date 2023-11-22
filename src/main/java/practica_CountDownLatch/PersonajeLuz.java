/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_CountDownLatch;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jesus
 */
public class PersonajeLuz implements Runnable {

    private Muñeco munieco;

    public void run() {
        for (int i = 1; i <= 5; i++) {
            this.munieco.ataqueLuz();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PersonajeLuz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public PersonajeLuz(Muñeco munieco) {
        this.munieco = munieco;
    }

}
