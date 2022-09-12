
public class genericMethod {

    public static <T> void print(T doorName){
        System.out.println("You live at house number: "+doorName);
    }
    
  public static void main(String[] args) {
     print(12);
     print("Bangladesh");

  }

}
