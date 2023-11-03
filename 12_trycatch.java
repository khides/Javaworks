// 例外処理
class JSample12_1{
  public static void main(String args[]){
    int n[] = {18, 29, 36};

    System.out.println("開始します");

    try{
      for (int i = 0; i < 4; i++){
        System.out.println(n[i]);
      }
    }
    catch(ArrayIndexOutOfBoundsException e){
      String error = String.valueOf(e);
      System.err.println(error);
      System.out.println("配列の範囲を超えています");
    }

    System.out.println("終了しました");
  }
}

// try catch finally
class JSample12_2{
  public static void main(String args[]){
    disp(1);
    disp(2);
    disp(3);
  }

  private static void disp(int no){
    int n[] = {18, 29, 36};

    try{
      System.out.println(n[no]);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("配列の範囲を超えています");
      return;
    }
    finally{
     System.out.println("要素の出力を終了します。");
    }
  }
}