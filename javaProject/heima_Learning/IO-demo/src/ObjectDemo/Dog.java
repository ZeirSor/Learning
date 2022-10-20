package ObjectDemo;

import java.io.Serializable;

class Dog implements Serializable {
    private String name;
    private int age;

    private static final long serialVersionUID = 1L;

    private static String nation;

    private transient String color;

    private Master master = new Master();

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + nation + " " + color + master;
    }
}

