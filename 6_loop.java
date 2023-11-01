import java.util.Random;

// for文
class JSample6_1{
  public static void main(String[] args){
    int sum = 0;

    for (int i = 1; i <= 5; i++){
      System.out.println(i);
      sum += i;
    }

    System.out.println("合計=" + sum);
  }
}

class JSample6_2{
  public static void main(String[] args){
    int i;
    double d; //異なるデータ型をfor文の引数として使用する場合、for文の外に定義する必要がある

    for (i = 1, d = 2.4; i <= 5; i++, d += 0.1){
      System.out.println("i = " + i + ", d = " + d);
    }
  }
}

// while文の使いかた
class JSample6_3{
  public static void main(String[] args){
    int num = 1;

    while (num < 100){
      System.out.println("num = " + num);
      num *= 2;
    }
  }
}


// do-whileの使い方
class JSample6_4{
  public static void main(String[] args){
    int num;
    Random rand = new Random();

    System.out.println("6が出たら終わりです");

    do{
      num = rand.nextInt(6) + 1;
      System.out.println("no = " + num);
    }while (num != 6);
  }
}


// for-each文の使い方
class JSample6_5{
  public static void main(String[] args){
    String pref[] = {"北海道", "東京都", "神奈川県"};
    
    for (String str: pref){
      System.out.println(str);
    }
  }
}


// breakラベル
class JSample6_6{
  public static void main(String[] args){

    Outer:
    for (int i = 1; i < 5; i++){

    //   Inner:
      for (int j = 1; j < 5; j++){
        System.out.println("i * j = " + i * j);

        if (i * j > 10){
          break Outer; //外側のループをbreakする
        }
      }

      System.out.println("Next");
    }

    System.out.println("End");
  }
}


// continueラベル
class JSample6_7{
  public static void main(String[] args){

    Outer:
    for (int i = 1; i < 6; i++){

    //   Inner:
      for (int j = 1; j < 6; j++){
        if (i * j % 4 == 0){
          continue Outer; // 外側のループをcontinue
        }

        System.out.println(i + " * " + j + " = " + i * j);
      }

      System.out.println("Next");
    }

    System.out.println("End");
  }
}