package com.ThirdQuestion;

public class CircleArea {
    private float radius;

   public  CircleArea(){
        this.radius = 1.0f;

    }
   public CircleArea(float radius){
       this.radius = radius;
   }

    public float getRadius() {
        return this.radius;
    }
     public double getArea(){
       return Math.PI * this.radius * this.radius ; // we have to use double because PI is a double value
    }

    public static void main(String[] args) {
        CircleArea circle1 = new CircleArea(12);
        CircleArea circle2 = new CircleArea(45);
        CircleArea circle3 = new CircleArea(47);

        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
        System.out.println(circle3.getArea());
    }
}
