package com.iterasys;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AreaTest {

        CalcularArea calcularArea = new CalcularArea();
        float areaAtual;


    @Test
    public void calculaAreaQuadradoTest(){
        float lado = 10;
        float areaEsperada = 100;

        areaAtual = calcularArea.calcularAreaQuadrado(lado);
        assertEquals(areaEsperada, areaAtual);
    }

    @Test
    public void calculaAreaRetangulo(){
        float base = 5;
        float altura = 6;
        float areaEsperada = 30;

        areaAtual = calcularArea.calcularAreaRetangulo(base, altura);
        assertEquals(areaEsperada, areaAtual);
    }

    @Test
    public void calculaAreaCirculo(){
        double raio = 4;
        double areaEsperada = 50.26548245743669;

        assertEquals(areaEsperada, calcularArea.calcularAreaCirculo(raio));

    }
    @Test
    public void calculaAreaTriangulo(){
        float base = 5;
        float altura = 6;
        float areaEsperada = 15;

        areaAtual = calcularArea.calcularAreaTriangulo(base, altura);
        assertEquals(areaEsperada,  areaAtual);
    }



}
