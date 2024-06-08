public class Points {
    public int x;
    public int y;
    public double distance(Points a,Points b){
    return Math.sqrt((a.x-b.x)*(a.x-b.x) +(a.y-b.y)*(a.y-b.y) );

    }
}

