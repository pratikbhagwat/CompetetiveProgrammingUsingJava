package Flatten2DVector;

public class Tester {
    public static void main(String[] args) {
        Vector2D iterator = new Vector2D( new int[][] { new int[]{1,2},new int[]{3},new int[]{4} } );
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
    }
}
