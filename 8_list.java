// 配列を生成する
class JSample8_1{
  public static void main(String[] args){
    int[] result = new int[3];

    result[0] = 75;
    result[1] = 88;
    result[2] = 82;

    for (int i = 0 ; i < 3 ; i++){
      System.out.println(result[i]);
    }
  }
}
// 配列は参照型のデータ型なので、変数には値を保存している場所が記憶される


// 配列の初期化
class JSample8_2{
  public static void main(String[] args){
    String[] str = {"Apple", "Orange", "Melon"}; //配列の初期化

    for (int i = 0; i < 3; i++){
      System.out.println(str[i]);
    }
  }
}
