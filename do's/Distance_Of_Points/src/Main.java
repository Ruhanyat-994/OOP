public class Main {
    public static void main(String[] args) {
        Points a = new Points();
        a.x = 2;
        a.y = 3;
        Points b = new Points();
        b.x = 2;
        b.y = 5;
        System.out.println(a.distance(a,b));


    }
}
