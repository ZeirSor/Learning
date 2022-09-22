package GenericsExercise1;

public abstract class Animal {
    private String name;
    private int age;

    public abstract void eat();

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


abstract class Cat extends Animal {

}

class Bosi extends Cat {
    @Override
    public void eat() {
        System.out.println("一只叫做" + this.getName() + "的，" + this.getAge() + "岁的波斯猫，正在吃小饼干");
    }
}

class Lihua extends Cat {
    @Override
    public void eat() {
        System.out.println("一只叫做" + this.getName() + "的，" + this.getAge() + "岁的狸花猫，正在吃鱼");
    }
}

abstract class Dog extends Animal {

}

class Tidy extends Dog {
    @Override
    public void eat() {
        System.out.println("一只叫做" + this.getName() + "的，" + this.getAge() + "岁的哈泰迪，正在吃骨头, 边吃边蹭");
    }
}

class HashQi extends Dog {
    @Override
    public void eat() {
        System.out.println("一只叫做" + this.getName() + "的，" + this.getAge() + "岁的哈士奇，正在吃骨头, 边吃边拆家");
    }
}