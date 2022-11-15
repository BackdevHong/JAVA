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
        System.out.println("독수리가 양 날개를 쫙 펴고 날아다닙니다.");
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

        AnimalTest t = new AnimalTest();
        t.actAnimal(animalList);

    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }

//  Down Casting
    public void actAnimal(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            if(animal instanceof Human) {
                Human human = (Human) animal;
                human.readBook();
            } else if ( animal instanceof Tiger ) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            } else if ( animal instanceof Eagle ) {
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            } else {
                System.out.println("잘못된 타입입니다.");
            }
        }
    }
}