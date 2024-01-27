
package prog4;

public class punto {
    
    public double x, y;
    
    //constructor
    public punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //getters
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    
    // setters 
    public void setX(double valorX){
        this.x = valorX;
    }
    public void setY(double valorY){
        this.y = valorY;
    }
    //sobreecritura de toString()
    public String toString(){
        return this.x + ", " + this.y;
    }
    //sobreescritura equals
    public boolean equals(punto p){
        if(p.x == this.x && p.y == this.y){
            return true;
        }else{
            return false;
        }
    }
    //metodo suma
    public punto suma(punto p){
    punto sumaPunto = new punto(p.x + this.x, p.y + this.y);
    return sumaPunto;
    }
}


