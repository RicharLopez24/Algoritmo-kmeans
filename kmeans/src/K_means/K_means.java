/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_means;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Angel Ricardo Lopez Jimenez 
 * @author Caroline Araceli Albarrán Barragán 
 */
public class K_means {
    
    ArrayList<Integer> corPunX = new ArrayList<>();
    ArrayList<Integer> corPunY = new ArrayList<>();
    //cordenadas atractores
    ArrayList<Integer> corAtratX = new ArrayList<>();
    ArrayList<Integer> corAtratY = new ArrayList<>();
    
    ArrayList<Color> colorAtractor = new ArrayList<>();
    ArrayList<Color> clasesColor = new ArrayList<>();

    public ArrayList<Color> getClasesColor() {
        return clasesColor;
    }

    public void setClasesColor(ArrayList<Color> clasesColor) {
        this.clasesColor = clasesColor;
    }
    
    

    public ArrayList<Color> getColorAtractor() {
        return colorAtractor;
    }

    public void setColorAtractor(ArrayList<Color> colorAtractor) {
        this.colorAtractor = colorAtractor;
    }

    public ArrayList<Integer> getCorPunX() {
        return corPunX;
    }

    public void setCorPunX(ArrayList<Integer> corPunX) {
        this.corPunX = corPunX;
    }

    public ArrayList<Integer> getCorPunY() {
        return corPunY;
    }

    public void setCorPunY(ArrayList<Integer> corPunY) {
        this.corPunY = corPunY;
    }

    public ArrayList<Integer> getCorAtratX() {
        return corAtratX;
    }

    public void setCorAtratX(ArrayList<Integer> corAtratX) {
        this.corAtratX = corAtratX;
    }

    public ArrayList<Integer> getCorAtratY() {
        return corAtratY;
    }

    public void setCorAtratY(ArrayList<Integer> corAtratY) {
        this.corAtratY = corAtratY;
    }
    
    public void limpiar() {
        corAtratX.clear();
        corAtratY.clear();
        corPunX.clear();
        corPunY.clear();
        colorAtractor.clear();
        clasesColor.clear();
    }
  
    public float calcularDis( float x1, float y1, float x2, float y2){
        
        float d = 0;
       
        return d=(float) Math.sqrt( Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2) );         
      
    }
    
     public void puntosCor(int Np){
        Random r = new Random();
       
        for(int i=0; i < Np; i++){
            corPunX.add(r.nextInt(870)+5);
            corPunY.add(r.nextInt(540)+5); 
        }
        
    }
    
    
    
}
