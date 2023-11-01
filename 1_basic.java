// import を使う
import java.time.LocalDate;

class Hello {
  public static void main(String[] args) {
    String msg = "";
    msg += "Hello ";
    msg += "World!";
    System.out.println(msg);
  }
}

class Hello03{
  public static void main(String[] args){
    System.out.println("Hello");
    System.out.println("How are you?");
    System.out.println("Bye");
  }
}

/**
 * 1_basic
 */
class JSample1_3 {
  public static void main(String[] args) {
    LocalDate Id = LocalDate.now(); //LocalDateインスタンスを生成
    System.out.println(Id);
  }

}
