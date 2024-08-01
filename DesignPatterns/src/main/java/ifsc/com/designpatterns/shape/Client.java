/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsc.com.designpatterns.shape;

import ifsc.com.designpatterns.shape.model.Trabalhador;

/**
 *
 * @author aluno
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        /* Shape
        final Quadrado quadrado = new Quadrado(8);
        final double areaQuadrado = quadrado.calcularArea();
        System.out.println("Area do quadrado2: " + areaQuadrado);
        
        final Circulo circulo = new Circulo(4);
        final double areaCirculo = circulo.calcularArea();
        System.out.println("Area do circulo: " + areaCirculo);
        */
        
        final Trabalhador trabalhador = new Trabalhador(1, "Kaylaine", "feminino");
        trabalhador.trabalha();
    }
    
}
