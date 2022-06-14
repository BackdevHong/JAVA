package abstractex;

public class Desktop extends Computer{
    @Override
    public void display() {
        System.out.println("DeakTop display");
    }

    @Override
    public void typing() {
        System.out.println( "DeskTop Typing" );
    }
}
