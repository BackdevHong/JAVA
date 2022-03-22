package downcasting;

import array.ArrayTest;

import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBooks(){
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal{
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }

    public void flying(){
        System.out.println("독수리가 날대를 쭉 펴고 멀리 날아갑니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();
//        if (hAnimal instanceof Human){
//            Human human = (Human)hAnimal; // 다운캐스팅
//            human.readBooks();
//        }


// AnimalTest test = new AnimalTest();
// test.moveAnimal(hAnimal);
// test.moveAnimal(tAnimal);
// test.moveAnimal(eAnimal);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        AnimalTest test = new AnimalTest();
        test.testDowncasting(animalList);

//        for (Animal animal : animalList){
//            animal.move();
//        }
    }

    public void testDowncasting(ArrayList<Animal> list){
        for (int i = 0; i < list.size(); i++){
            Animal animal = list.get(i);

            if ( animal instanceof Human ){
                Human human = (Human)animal;
                human.readBooks();
            } else if ( animal instanceof Tiger ){
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            } else if ( animal instanceof Eagle ){
                Eagle eagle = (Eagle)animal;
                eagle.flying();
            } else {
                System.err.println("에러");
            }
        }
    }

    // 하나의 코드가 여러 자료형이 구현이 되서 다른 실행이 이루어 지는 것을 우리는 폴리모피즘이라고 한다.

}
