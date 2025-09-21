package com.polymorphism.OOP4;

class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id * 31;  // simple formula
    }

    public static void main(String[] args) {
        Product p1 = new Product(1, "Pen");
        Product p2 = new Product(1, "Pen");

        System.out.println("HashCode p1: " + p1.hashCode());
        System.out.println("HashCode p2: " + p2.hashCode());
    }
}
