package com.driver;
public class Main {
    static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
    public static void main(String[] args){
        Product p = new Product();
        int product1 = p.product(3 , 4);
        int product2 = p.product(3 , 4 ,5);
        double product3 = p.product(3.14 , 2.12);
    }
}