package secao13_heranca_polimorfismo.heranca.exercicio2.entities;

import secao13_heranca_polimorfismo.heranca.exercicio2.entities.enums.Color;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        super();
    }

    public Circle(Color color, double radius){
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
       return Math.PI*Math.pow(radius,2);
    }
}
