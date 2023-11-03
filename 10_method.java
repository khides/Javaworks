// メソッドの定義
class JSample10_1{
  public static void main(String args[]){
    hello();
    bye();
    hellobye();
  }

  private static void hello(){ //JSample10_1の中だけで使用する場合 private, staticの中で使用する場合static 
    System.out.println("こんにちは。");
  }

  private static void bye(){
    System.out.println("さようなら。");
  }

  private static void hellobye(){
    hello();
    bye();
  }
}


// 引数
class JSample10_2{
  public static void main(String args[]){
    int num1, num2;

    num1 = 10;
    num2 = 8;
    keisan(num1, num2);

    num1 = 23;
    keisan(num1, 7);

    keisan(15, 22);
  }

  private static void keisan(int n1, int n2){
    System.out.println("num1 = " + n1 + ",num2 = " + n2);
    System.out.println("num1 + num2 = " + (n1 + n2));
    System.out.println("num1 - num2 = " + (n1 - n2));
  }
}

class JSample10_3{
  public static void main(String args[]){
    int num = 8;
    int array[] = {10, 4};

    System.out.println("num = " + num);
    System.out.println("array[0] = " + array[0]);

    henkou(num, array);

    System.out.println("num = " + num); //intは値型なので、変更されない
    System.out.println("array[0] = " + array[0]); //配列は参照型なので、変更される
  }

  private static void henkou(int num, int array[]){
    num = 5;
    array[0] = 12;
  }
}


// オーバーロード
class JSample10_4{
  public static void main(String args[]){
    System.out.println(plus(10, 7));
    System.out.println(plus(3.2, 4));
    System.out.println(plus(7, 1.223));
    System.out.println(plus(5.08, 2.4));
  }

  private static int plus(int n1, int n2){
    System.out.println("int + int");
    return n1 + n2;
  }

  private static double plus(int n1, double d1){
    System.out.println("int + double");
    return n1 + d1;
  }

  private static double plus(double d1, int n1){
    System.out.println("double + int");
    return n1 + d1;
  }

  private static double plus(double d1, double d2){
    System.out.println("double + double");
    return d1 + d2;
  }
}

// 可変引数
class JSample10_5{
  public static void main(String args[]){
    System.out.println(sum(4, 10));
    System.out.println(sum(7, 2, 8));
    System.out.println(sum());
  }

  private static int sum(int... nums){
    int sum = 0;

    for (int i = 0; i < nums.length; i++){
      sum += nums[i];
    }

    return sum;
  }
}

// 固定引数と可変引数の組み合わせ
class JSample10_6{
  public static void main(String args[]){
    disp("[", "]", 10, 7, 8);
    disp("【", "】", 128, 76);
  }

  private static void disp(String sb, String sa, int... num){ 
    //固定引数は最初に、可変引数は最後に記述、可変引数は一つしか使えない
    for (int i = 0; i < num.length; i++){
      System.out.println(sb + num[i] + sa);
    }
  }
}