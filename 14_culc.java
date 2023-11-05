// 入力されたデータの読み取り
class dentaku1{
  public static void main(String args[]){
    int val1 = 0;  /* 最初の数字 */
    int val2 = 0;  /* 次の数字 */
    String ope;    /* 演算子 */

    if (args.length != 3){
      System.out.println("Usage : java dentaku 数値 演算子 数値");
      System.out.println("演算子は kake waru tasu hiku の4つです");
      System.exit(0);  /* プログラムを終了する */
    }

    val1 = Integer.parseInt(args[0]);
    val2 = Integer.parseInt(args[2]);
    ope = args[1];

    System.out.println("入力された式は " + val1 + " " + ope + " " + val2 + " です");
  }
}

// 演算子のチェック
class dentaku2{
  public static void main(String args[]){
    int val1 = 0;  /* 最初の数字 */
    int val2 = 0;  /* 次の数字 */
    String ope;    /* 演算子 */

    if (args.length != 3){
      System.out.println("Usage : java dentaku 数値 演算子 数値");
      System.out.println("演算子は kake waru tasu hiku の4つです");
      System.exit(0);  /* プログラムを終了する */
    }

    val1 = Integer.parseInt(args[0]);
    val2 = Integer.parseInt(args[2]);
    ope = args[1];

    String opeStr[] = {"kake", "waru", "tasu", "hiku"};
    boolean errFlag = true;

    for (int i = 0 ; i < 4 ; i++){
      if (ope.equals(opeStr[i])){
        errFlag = false;
      }
    }

    if (errFlag == true){
      System.out.println("演算子は kake waru tasu hiku の4つです");
      System.exit(0);  /* プログラムを終了する */
    }

    System.out.println("入力された式は " + val1 + " " + ope + " " + val2 + " です");
  }
}


// 数値のチェック
class dentaku3{
  public static void main(String args[]){
    int val1 = 0;  /* 最初の数字 */
    int val2 = 0;  /* 次の数字 */
    String ope;    /* 演算子 */

    if (args.length != 3){
      System.out.println("Usage : java dentaku 数値 演算子 数値");
      System.out.println("演算子は kake waru tasu hiku の4つです");
      System.exit(0);  /* プログラムを終了する */
    }

    try{ //エラー処理
      val1 = Integer.parseInt(args[0]); //文字列を数値に変換する
      val2 = Integer.parseInt(args[2]);
    }catch(NumberFormatException e){
      System.out.println("Usage : java dentaku 数値 演算子 数値");
      System.out.println("数値でない値が入力されています");
      System.exit(0);  /* プログラムを終了する */
    }

    ope = args[1];

    String opeStr[] = {"kake", "waru", "tasu", "hiku"};
    boolean errFlag = true;

    for (int i = 0 ; i < 4 ; i++){
      if (ope.equals(opeStr[i])){
        errFlag = false;
      }
    }

    if (errFlag == true){
      System.out.println("演算子は kake waru tasu hiku の4つです");
      System.exit(0);  /* プログラムを終了する */
    }

    System.out.println("入力された式は " + val1 + " " + ope + " " + val2 + " です");
  }
}


// 完成版
class dentaku4{
  public static void main(String args[]){
    int val1 = 0;  /* 最初の数字 */
    int val2 = 0;  /* 次の数字 */
    String ope;    /* 演算子 */
    int kekka;     /* 結果を格納 */

    if (args.length != 3){
      errDisp("引数は3個入力して下さい");
    }

    try{
      val1 = Integer.parseInt(args[0]);
      val2 = Integer.parseInt(args[2]);
    }catch(NumberFormatException e){
      errDisp("数値でない値が入力されています");
    }

    ope = args[1];

    String opeStr[] = {"kake", "waru", "tasu", "hiku"};
    boolean errFlag = true;

    for (int i = 0 ; i < 4 ; i++){
      if (ope.equals(opeStr[i])){
        errFlag = false;
      }
    }

    if (errFlag == true){
      errDisp("演算子は kake waru tasu hiku の4つです");
    }

    if (ope.equals("kake")){
      kekka = val1 * val2;
    }else if (ope.equals("tasu")){
      kekka = val1 + val2;
    }else if (ope.equals("hiku")){
      kekka = val1 - val2;
    }else{
      if (val2 == 0){
        errDisp("0 で割ろうとしました");
      }

      kekka = val1 / val2;
    }

    System.out.println("入力された式は " + val1 + " " + ope + " " + val2 + " です");
    System.out.println("計算結果は " + kekka + " です");
  }

  private static void errDisp(String errStr){
    System.out.println("Usage : java dentaku 数値 演算子 数値");
    System.out.println(errStr);
    System.exit(0);  /* プログラムを終了する */
  }
}