import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
    
    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }

    public void flying() {
        System.out.println("독수리가 양 날대를 쫙 펴고 날아다닙니다.");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        ArrayList<Animal> animalList = new ArrayList<>();

        animalList.add(eAnimal);
        animalList.add(tAnimal);
        animalList.add(hAnimal);

        for (Animal a : animalList) {
            a.move();
        }

//        AnimalTest t = new AnimalTest();

//        t.moveAnimal(hAnimal);
//        t.moveAnimal(tAnimal);
//        t.moveAnimal(eAnimal);
    }

//    public void moveAnimal(Animal animal) {
//        animal.move();
//    }
}