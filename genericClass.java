/**
 * House<T,V>
 */ 
// Generic is a way to parameterize a class, method, or interface.
//< T > is a conventional letter that stands for "Type", and it refers to the concept of Generics in Java. You can use any letter, but you'll see that 'T' is widely preferred.



 class House<T,V> {
    T doorNumber;
    V streetName;
    
    public House(T doorNumber, V streetName){
        this.doorNumber = doorNumber;
        this.streetName = streetName;
    }
    public void print(){
        System.out.println("Live in "+this.doorNumber+" "+ this.streetName);
    }
}

public class genericClass {

    public static void main(String[] args) {
        House<Integer, String> mainHouse = new House(12, "PM road");
        mainHouse.print();
    }
    
}
