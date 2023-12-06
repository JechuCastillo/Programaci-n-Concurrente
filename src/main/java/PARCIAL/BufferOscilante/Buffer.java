/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARCIAL.BufferOscilante;

/**
 *
 * @author jesus
 */
public class Buffer {

    private int insertar[] = new int[100];
    private int extraer[] = new int[100];
    private int oscilar[];

    public Buffer(int ins[], int ext[]) {
        this.insertar = ins;
        this.extraer = ext;
    }

}
