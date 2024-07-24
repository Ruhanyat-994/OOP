import java.util.Scanner;

public class EngineType implements Engine {
    @Override
    public void getEngineName() {
        Scanner Input = new Scanner(System.in);
        System.out.println("A. Power Engine\nB.Electric Engine\n");
        String engineName = Input.nextLine();
        System.out.println(engineName.toUpperCase());

    }


}
