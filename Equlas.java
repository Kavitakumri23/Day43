package com.polymorphism.OOP4;

    class Employee {
        int id;
        String name;

        Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        // Override equals() to compare Employee objects
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;  // same reference
            if (obj == null || getClass() != obj.getClass()) return false;

            Employee e = (Employee) obj;
            return id == e.id && name.equals(e.name);
        }

        public static void main(String[] args) {
            Employee e1 = new Employee(101, "Amit");
            Employee e2 = new Employee(101, "Amit");
            Employee e3 = new Employee(102, "Priya");

            System.out.println(e1.equals(e2)); // true
            System.out.println(e1.equals(e3)); // false
        }
    }