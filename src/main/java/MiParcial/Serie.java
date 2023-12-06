/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiParcial;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Serie {

    private int capituloEsp;
    private int capituloIng;
    private ReentrantLock filmar;
    private ReentrantLock traducir;
    private ReentrantLock mirar;
    private Condition hayQueTraducir;
    private Condition nuevoCapituloEs;
    private Condition nuevoCapituloEng;
    private int capitulosATraducir;

    public Serie() {
        this.capitulosATraducir = 0;
        this.capituloEsp = 0;
        this.capituloIng = 0;
        this.filmar = new ReentrantLock(true);
        this.traducir = new ReentrantLock(true);
        this.mirar = new ReentrantLock(true);
        this.hayQueTraducir = traducir.newCondition();
        this.nuevoCapituloEs = mirar.newCondition();
        this.nuevoCapituloEng = mirar.newCondition();
    }

    public void filmar() {
        this.mirar.lock();
        this.traducir.lock();
        this.capituloEsp++;
        System.out.println("Producimos un nuevo capitulo, CAPITULOS: " + this.capituloEsp);
        this.capitulosATraducir++;
        this.hayQueTraducir.signal();
        this.traducir.unlock();
        this.nuevoCapituloEs.signalAll();
        this.mirar.unlock();
    }

//    public void traducir() {
//        this.traducir.lock();
//        try {
//            while (this.capituloIng >= this.capituloEsp) {
//                this.hayQueTraducir.await();
//            }
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Serie.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        this.capituloIng++;
//        System.out.println("Nuevo capitulo en INGLES");
//        this.mirar.lock();
//        this.nuevoCapituloEng.signalAll();
//        this.mirar.unlock();
//        traducir.unlock();
//    }
    public void empezarAtraducir(int n) {
        this.traducir.lock();
        try {
            while (this.capitulosATraducir == 0) {
                System.out.println("Traductor: " + n + "Espera");
                this.hayQueTraducir.await();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Serie.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.traducir.unlock();
        }
    }

    public void terminarDeTraducir(int n) {
        this.mirar.lock();
        this.capitulosATraducir--;
        this.capituloIng++;
        System.out.println("Nuevo capitulo traducido por traductor:" + n + ", CAPITULOS INGLES" + this.capituloIng);
        this.nuevoCapituloEng.signalAll();
        this.mirar.unlock();
    }

    public void mirarIngles(int cantVisto, int num) {
        mirar.lock();
        try {
            while (cantVisto >= this.capituloIng) {
                this.nuevoCapituloEng.await();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Serie.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            mirar.unlock();
        }
    }

    public void mirarEspaniol(int cantVisto, int num) {
        mirar.lock();
        try {
            while (cantVisto >= this.capituloIng) {
                this.nuevoCapituloEs.await();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Serie.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            mirar.unlock();
        }
    }

}
