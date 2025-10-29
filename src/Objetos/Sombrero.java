/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;
import Objetos.Utilidad.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.*;
import GameGFX.*;
import java.awt.Color;
import java.awt.Graphics;
import mariotest.*;
/**
 *
 * @author LENOVO
 */
public class Sombrero extends Item {
    private static final float WIDTH = 16f;
    private static final float HEIGHT = 16f;
    private static final int VALOR_PUNTOS = 500;
    
    public Sombrero(float x, float y, int scale, Handler handler) {
        super(x, y, WIDTH, HEIGHT, scale, handler, VALOR_PUNTOS);
        this.flotar = true;
        this.desapareceDespuesDeRecoger = true;
    }
    
    @Override
    protected void aplicarEfecto(Player player) {
        System.out.println("[SOMBRERO] ¡Recolectado!");
    }
    
    @Override
    protected void renderPlaceholder(Graphics g) {
        // Copa del sombrero
        g.setColor(Color.BLACK);
        g.fillRect((int)getX() + 4, (int)getY() + 2, 8, 8);
        // Ala
        g.fillRect((int)getX() + 2, (int)getY() + 9, 12, 3);
    }
}
