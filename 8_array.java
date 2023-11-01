import java.util.Arrays;  // java.util.Arraysのインポートが必要です


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

// 配列の長さを取得する
class JSample8_3{
  public static void main(String[] args){
    double[] num = new double[3];

    num[0] = 5.24;
    num[1] = 8.0;
    num[2] = 12.375;

    for (int i = 0; i < num.length; i++){ //.lengthで長さを取得する
      System.out.println("num[" + i + "] = " + num[i]);
    }
  }
}

// 多次元配列
class JSample8_4{
  public static void main(String[] args){
    int[][] num = new int[2][]; //多次元配列の生成　二行であることを明記

    num[0] = new int[3]; //一行目は整数型✖️３
    num[0][0] = 78;
    num[0][1] = 64;
    num[0][2] = 59;

    num[1] = new int[3]; //二行目も整数型✖️３
    num[1][0] = 58;
    num[1][1] = 92;
    num[1][2] = 82;
    
    for (int i = 0; i < 2; i++){
      for (int j = 0; j < 3; j++){
        System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
      }
    }
  }
}

// 多次元配列の初期化
class JSample8_5{
  public static void main(String[] args){
    int[][] num = {{87,54,67}, {76,92,48}}; //多次元配列の初期化をおこなう
    
    for (int i = 0; i < 2; i++){
      for (int j = 0; j < 3; j++){
        System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
      }
    }
  }
}


// 多次元配列の長さを取得する
class JSample8_6{
  public static void main(String[] args){
    int[][] num = {{87,54}, {76,92,48,58,84}};
    
    for (int i = 0; i < num.length; i++){ //外側の長さ（行の数）
      for (int j = 0; j < num[i].length; j++){ //内側の長さ（列の数）
        System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
      }
    }
  }
}




// 配列の全ての要素を指定した値で埋める
class JSample8_7{
  public static void main(String[] args){
    int[] a = new int[3];
    Arrays.fill(a, 10); //全ての要素を指定した値で埋める

    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
  }
}


// 配列のコピー
// Arrays.copyOfを用いる
class JSample8_8{
  public static void main(String[] args) {
    int[] src = {12, 24, 18};
    int[] dst = Arrays.copyOf(src, 3); //値をコピーしてくる 第二引数は先頭からいくつの要素をコピーしてくるか
    // ただ代入しただけでは、参照型のため、一方を変更すると、もう一方も変更されてしまう
    System.out.println("src[0] = " + src[0]);  // 12
    System.out.println("dst[0] = " + dst[0]);  // 12

    src[0] = 42;

    System.out.println("src[0] = " + src[0]);  // 42
    System.out.println("dst[0] = " + dst[0]);  // 12
  }
  
}
// System.arraycopyを用いる
class JSample8_9{
  public static void main(String[] args) {
    int[] src = {12, 24, 18};
    int[] dst = new int[3];

    System.arraycopy(src, 0, dst, 0, 3);

    System.out.println("src[0] = " + src[0]);  // 12
    System.out.println("dst[0] = " + dst[0]);  // 12

    src[0] = 42;

    System.out.println("src[0] = " + src[0]);  // 42
    System.out.println("dst[0] = " + dst[0]);  // 12
  }
}

// 格納されている変数も参照型の場合は上記方法でもうまくいかない
// そのため、以下の方法でdeepコピーする
class JSample8_10{
  public static void main(String[] args){

    MyTest[] src = {new MyTest(28), new MyTest(12)};
    MyTest[] dst = new MyTest[2];

    for (int i = 0; i < src.length; i++){
      // dst[i] = src[i];c //これだとあかん
      dst[i] = new MyTest(src[i].num); //これでOK
    }

    System.out.println("src[0] = " + src[0].num);  // 28
    System.out.println("dst[0] = " + dst[0].num);  // 28

    src[0].num = 41;

    System.out.println("src[0] = " + src[0].num);  // 41
    System.out.println("dst[0] = " + dst[0].num);  // 28
  }
}
class MyTest{ //MyTestはクラスなので参照型
  public int num;

  public MyTest(int n){ //初期化メソッド
    num = n;
  }
}


class JSample8_11{
  public static void main(String[] args){
    int[] src = {12, 24, 18, 35, 21};
    int[] dst = Arrays.copyOfRange(src, 1, 4); //２番目の要素から、4番目の要素をコピーしてくる

    System.out.println(Arrays.toString(src));
    System.out.println(Arrays.toString(dst));
  }
}

// 二つの配列を連結する
class JSample8_12{
  public static void main(String[] args){
    int[] src1 = {28, 14, 35, 19};
    int[] src2 = {17, 40, 23};
    int[] dst = new int[src1.length + src2.length]; //連結先の配列の初期化

    System.arraycopy(src1, 0, dst, 0, src1.length);  //前半をコピー
    System.arraycopy(src2, 0, dst, src1.length, src2.length);  //後半をコピー

    System.out.println(Arrays.toString(src1));
    System.out.println(Arrays.toString(src2));
    System.out.println(Arrays.toString(dst));
  }
}

// 二つの配列の要素を比較する
class JSample8_13{
  public static void main(String[] args){
    int[] a = {85, 78, 92};
    int[] b = a;
    int[] c = {85, 78, 92};

    System.out.println(a == b); 
    System.out.println(a == c);
    System.out.println(b == c);//参照型のため、値が同じでもだめ
    System.out.println(Arrays.equals(a, b)); //値を比較するならArrays.equalメソッドを用いる
    System.out.println(Arrays.equals(a, c));
    System.out.println(Arrays.equals(b, c));
  }
}

// 多次元配列の比較
class JSample11_2{
  public static void main(String[] args){
    int[][] a = {{10, 8} ,{9, 14}};
    int[][] b = a;
    int[][] c = {{10, 8}, {9, 14}};

    System.out.println(Arrays.equals(a, b));
    System.out.println(Arrays.equals(a, c));
    System.out.println(Arrays.equals(b, c));
    System.out.println(Arrays.deepEquals(a, b));
    System.out.println(Arrays.deepEquals(a, c));
    System.out.println(Arrays.deepEquals(b, c));
  }
}


// 要素を逆順に入れ替える
class JSample8_14{
  public static void main(String[] args){
    int[] src = {12, 24, 18, 31, 17};
    System.out.println(Arrays.toString(src)); //配列をprintするならstringにしてから

    for (int f = 0, l = src.length - 1; f < l; f++, l--){
      int temp = src[f];
      src[f]  = src[l];
      src[l] = temp;
    }

    System.out.println(Arrays.toString(src));
  }
}

// 配列をソートする
class JSample8_15{
  public static void main(String[] args){
    int[] src = {12, 24, 18, 35, 21};
    System.out.println(Arrays.toString(src));

    Arrays.sort(src); //ソートメソッド（可変メソッド）
    System.out.println(Arrays.toString(src));
  }
}

// 配列を文字列表現で取得する
class JSample8_16{
  public static void main(String[] args){
    double[] src = {3.75, 0.52, 14.1};

    System.out.println(src);
    System.out.println(Arrays.toString(src));
  }
}

// 多次元配列を文字列表現で取得する
class JSample8_17{
  public static void main(String[] args){
    int[][] src = {{32, 18}, {12, 27}};

    System.out.println(Arrays.toString(src));
    System.out.println(Arrays.deepToString(src)); //多次元配列を文字列にするメソッド
  }
}

