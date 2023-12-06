/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiParcial;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        int cantSocios = 4;
        Serie serie = new Serie();
        Filmador film = new Filmador(serie);
        Traductor t1 = new Traductor(serie,1);
        Traductor t2 = new Traductor(serie,2);
        Socio socio[] = new Socio[cantSocios];

        Thread filmador = new Thread(film);
        Thread hiloT1 = new Thread(t1);
        Thread hiloT2 = new Thread(t2);
        Thread hiloSocio[] = new Thread[cantSocios];
        filmador.start();
        hiloT1.start();
        hiloT2.start();
        for (int i = 0; i < cantSocios; i++) {
            socio[i] = new Socio(serie,i);
            hiloSocio[i] = new Thread(socio[i]);
            hiloSocio[i].start();
        }
    }
}
