/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import Objetos.Utilidad.*;
import GameGFX.*;
import Mapa.*;
import java.awt.Color;
import java.awt.Graphics;
import mariotest.*;

/**
 *
 * @author LENOVO
 */
public class BolsoDama extends Item {
    private static final float WIDTH = 16f;
    private static final float HEIGHT = 16f;
    private static final int VALOR_PUNTOS = 800;
    
    public BolsoDama(float x, float y, int scale, Handler handler) {
        super(x, y, WIDTH, HEIGHT, scale, handler, VALOR_PUNTOS);
        this.flotar = true;
        this.desapareceDespuesDeRecoger = true;
        //cargarSprites();
    }
    
    @Override
    protected void aplicarEfecto(Player player) {
        // Solo da puntos
        System.out.println("[BOLSO] ¡Recolectado!");
    }
    
    @Override
    protected void renderPlaceholder(Graphics g) {
        g.setColor(new Color(255, 192, 203)); // Rosa
        g.fillRect((int)getX() + 2, (int)getY() + 4, 12, 10);
        g.setColor(Color.BLACK);
        g.drawRect((int)getX() + 2, (int)getY() + 4, 12, 10);
        // Asa
        g.drawArc((int)getX() + 4, (int)getY(), 8, 6, 0, 180);
    }
}
