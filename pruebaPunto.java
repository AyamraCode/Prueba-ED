
package prog4;


public class pruebaPunto {
    
   
    public static void main(String[] args) {
        
        punto p1 = new punto(3, 2.5);
        punto p2 = new punto(1, -1);
        p2.setX( p1.getX() );
        p2.setY( p1.getY() );
        System.out.println(p1 + " es igual a " + p2 + "? " + p1.equals(p2));
    }
}
