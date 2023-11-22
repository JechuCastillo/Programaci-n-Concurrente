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
public class main {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(10);
        /**
         * Ejercicio: Un personaje de luz hace daño al muñeco y luego un
         * personaje de oscuridad ataca al muñeco debe mostrar al ganador (quien
         * ha hecho mas daño)
         *
         */
        Muñeco muñeco = new Muñeco(latch);
        PersonajeLuz luz = new PersonajeLuz(muñeco);
        PersonajeOscuridad oscuridad = new PersonajeOscuridad(muñeco);

        Thread hiloLuz = new Thread(luz);
        Thread hiloOscuridad = new Thread(oscuridad);
        hiloLuz.start();
        hiloOscuridad.start();
        try {
            latch.await();
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        muñeco.exponerGanador();
    }
}
