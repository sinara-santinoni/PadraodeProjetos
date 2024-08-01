package ifsc.com.designpatterns.shape.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aluno
 */
public class Circulo implements FormaGeometrica {
    
    private static final double pi = 3.14;
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return pi*(raio*raio);
    }
}
