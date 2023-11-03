// mainメソッドの引数はコマンドライン引数
class JSample11_1{
  public static void main(String args[]){
    System.out.println("「" + args[0] + "」");
  }
}

// コマンド引数の数を確認
class JSample11_2{
  public static void main(String args[]){
    if (args.length != 2){
      System.out.println("引数を2つ指定して下さい");
      System.out.println("JSample11_2 値1 値2");
      System.exit(1); //プログラム終了
    }

    System.out.println("「" + args[0] + "」");
    System.out.println("「" + args[1] + "」");
  }
}