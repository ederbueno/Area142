package com.iterasys;

public class CalcularArea {


    public  float calcularAreaQuadrado(float lado){
            float areaQuadrado = lado * lado;
            System.out.println("Area do Quadrado eh: " + areaQuadrado);
            return areaQuadrado;
    }

    public float calcularAreaRetangulo(float base , float altura){
            float areaRetangulo = base * altura;
            System.out.println("Area do Retangulo eh: " + areaRetangulo);
            return areaRetangulo;
    }

    public Double calcularAreaCirculo(double raio){
            double areaCirculo = Math.PI * Math.pow(raio, 2);
            System.out.println("Area do Circulo eh: " + areaCirculo);
            return areaCirculo;
    }

    public Float calcularAreaTriangulo(float base , float altura){
            float areaTriangulo = (base * altura)/2;
            System.out.println("Area do Triangulo eh: " + areaTriangulo);
            return  areaTriangulo;
    }

}
