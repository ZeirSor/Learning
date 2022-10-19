package WyjHK.Test1;

//实现一个宠物商店，
// 在宠物商店中可以有多种（由用户决定数量）宠物，
// 试表示出此种关系，
// 并要求可以根据宠物的关键字查找到相应的宠物信息。
// 所需要的宠物信息自行设计。

public class PetShop {

}

abstract class Pet {
    private String petType;
    private int age;

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", age=" + age +
                '}';
    }
}

class Dog extends Pet {
    public Dog() {
    }

    public Dog(String petType, int age) {
        this.setPetType(petType);
        this.setAge(age);
    }


}
