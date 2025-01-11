package com.iterasys;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class AreaTest {

        CalcularArea calcularArea = new CalcularArea();
        float areaAtual;


    @Test
    public void calculaAreaQuadrado(){
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

    @ParameterizedTest
    @CsvSource(value = {
            "5, 5, 25.0",
            "4, 3, 12.0",
            "6, 9, 54.0"
    }, delimiter = ',')
    public void calculaAreaRetanguloDDT(float base, float altura, float areaEsperada){

        areaAtual = calcularArea.calcularAreaRetangulo(base, altura);
        assertEquals(areaEsperada, areaAtual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "csv/triangulo.csv", numLinesToSkip = 1, delimiter = ',')
    public void calcularAreaTriangulo(float base, float altura, float areaEsperada){
        areaAtual = calcularArea.calcularAreaTriangulo(base, altura);
        assertEquals(areaAtual, areaEsperada);
    }
}
