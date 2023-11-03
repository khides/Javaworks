import java.util.List;



class JSample9_1{
  public static void main(String[] args){
    String msg1 = "Hello"; //ダブルクォーテーションは文字列を表す

    char[] c = {'B', 'y', 'e'}; //シングルクォーテーションはcharを表す
    String msg2 = new String(c);

    String msg3 = new String(msg1);

    System.out.println(msg1);
    System.out.println(msg2);
    System.out.println(msg3);
  }
}

// 文字列に別の文字列を代入する
class JSample9_2{
  public static void main(String[] args){
    String msg1 = "Hello"; //一度生成したら、変更できないので
    String msg2 = msg1;

    System.out.println(msg1);
    System.out.println(msg2);

    System.out.println("----");

    msg2 = "Bye!"; //代入は、新しい文字列を作ることを意味する

    System.out.println(msg1);
    System.out.println(msg2);
  }
}

// 数値を文字列に変換する
// 数値のwrapperクラスのメソッドを使用する
class JSample9_3{
  public static void main(String[] args){
    int i = 10;
    long l = 12L;
    double d = 7.82;
    boolean b = true;

    String si = Integer.valueOf(i).toString(); //wrapperクラスに文字列変換メソッドが用意してあるので、それを使用
    String sl = Long.valueOf(l).toString();
    String sd = Double.valueOf(d).toString();
    String sb = Boolean.valueOf(b).toString();

    System.out.println(si);
    System.out.println(sl);
    System.out.println(sd);
    System.out.println(sb);
  }
}
// 文字列のwrapperクラスのメソッドを使う
class JSample9_4{
  public static void main(String[] args){
    int i = 10;
    short s = 21;
    long l = 12L;
    double d = 7.82;
    boolean b = true;

    String si = String.valueOf(i); //Stringクラスに文字列化のメソッドが用意されている
    String ss = String.valueOf(s);
    String sl = String.valueOf(l);
    String sd = String.valueOf(d);
    String sb = String.valueOf(b);

    System.out.println(si);
    System.out.println(ss);
    System.out.println(sl);
    System.out.println(sd);
    System.out.println(sb);
  }
}
// 連結すると自動的に文字列化が行われる
class JSample9_5{
  public static void main(String[] args){
    int i = 10;
    long l = 12L;
    double d = 7.82;
    boolean b = true;

    String si = "" + i;
    String sl = "" + l;
    String sd = "" + d;
    String sb = "" + b;

    System.out.println(si);
    System.out.println(sl);
    System.out.println(sd);
    System.out.println(sb);
  }
}


// 文字列を数値に変換する
// 数値のwrapperクラスの関数を使用する
class JSample9_6{
  public static void main(String[] args){
    String si = "42";
    String sd = "2.84";
    String sb = "false";

    int i = Integer.parseInt(si);
    double d = Double.parseDouble(sd);
    boolean b = Boolean.parseBoolean(sb);

    System.out.println(i);
    System.out.println(d);
    System.out.println(b);
  }
}
// 数値のwrapperクラスのメソッドを使用する
// 一度wrapperクラスにキャストする
class JSample9_7{
  public static void main(String[] args){
    String si = "42";
    String sd = "2.84";
    String sb = "false";

    int i = Integer.valueOf(si).intValue();
    double d = Double.valueOf(sd).doubleValue();
    boolean b = Boolean.valueOf(sb).booleanValue();

    System.out.println(i);
    System.out.println(d);
    System.out.println(b);
  }
}

// wrapperクラスのコンストラクタを使用する
class JSample9_8{
    public static void main(String[] args) {
        String str = "24";
        Integer i = new Integer(str); //非推奨
        int num = i.intValue();
        System.out.println(num);
    }
}

// 文字列と文字列を比較する
class JSample9_9{
  public static void main(String[] args){
    String msg1 = "Hello";
    String msg2 = new String(msg1);

    System.out.println(msg1 == msg2);  //参照型なので、値が同じでも、参照先が異なる
    System.out.println(msg1.equals(msg2)); //値を比較する方法
  }
}
// ただし、文字列リテラルで文字列を生成した場合のみ、==で比較可能
class JSample9_10{
    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "Hello";

        System.out.println(msg1 == msg2);  // true
    }
}

// 文字列と文字列の大きさを比較する
class JSample9_11{
  public static void main(String[] args){
    String str1 = "東京都港区";
    String str2 = "東京都港区";
    String str3 = "東京都";
    String str4 = "東京都中央区";

    System.out.println(str1.compareTo(str2));
    System.out.println(str1.compareTo(str3));
    System.out.println(str1.compareTo(str4));
    System.out.println(str1.charAt(3) + ":" + Integer.toString(str1.charAt(3)));
    System.out.println(str4.charAt(3) + ":" + Integer.toString(str4.charAt(3)));
  }
}


// 文字列の長さを取得する
class JSample9_12{
  public static void main(String[] args){
    String msg1 = "Hello";
    String msg2 = "東京都港区赤坂";

    System.out.println(msg1 + "の長さは " + msg1.length());
    System.out.println(msg2 + "の長さは " + msg2.length());
  }
}
//サロゲートペア
// 一文字で二文字分の文字コードを使用する文字は長さが２になる
class JSample9_13{
    public static void main(String[] args) {
        String msg = "𪛊";
        System.out.println(msg.length());  // 2
    }
}

// 文字列の文字の数を取得する
class JSample9_14{
  public static void main(String[] args){
    String msg1 = "東京都港区赤坂";
    String msg2 = "𪛊あ";
    // サロゲートペアがある場合でも正しく文字数が出力される
    System.out.println(msg1.codePointCount(0, msg1.length()));
    System.out.println(msg2.codePointCount(0, msg2.length()));
  }
}


// 文字列から指定した文字のインデックスを取得する
class JSample9_15{
  public static void main(String[] args){
    String msg = "東京都港区赤坂";

    for (int i = 0; i < msg.length(); i++){
      System.out.println( i + ":" + msg.charAt(i)); //.charAt(index)
    }
  }
}

// 文字列から指定したインデックスのUnicodeコードポイントを取得する
class JSample9_16{
  public static void main(String[] args){
    String msg = "東京都港区赤坂";

    for (int i = 0; i < msg.length(); i++){
      System.out.println( i + ":" + msg.codePointAt(i));
    }
  }
}

// インデックスで部分文字列を取得する
class JSample9_17{
  public static void main(String[] args){
    String msg = "東京都港区赤坂";

    System.out.println(msg.substring(3, 5)); //substring(begin, end) endは含まない
    System.out.println(msg.substring(5, 7));
    System.out.println(msg.substring(3));
  }
}

// 文章の前後にある空白文字を取り除く
// trimメソッド
class JSample9_18{
  public static void main(String[] args){
    String msg1 = " AB CD ";
    String msg2 = "\tAB CD\n";
    String msg3 = "　AB CD　";

    System.out.println("[" + msg1 + "]");
    System.out.println("[" + msg1.trim() + "]");
    System.out.println("[" + msg2 + "]");
    System.out.println("[" + msg2.trim() + "]");
    System.out.println("[" + msg3 + "]");
    System.out.println("[" + msg3.trim() + "]");
  }
}

// stripメソッド
class JSample9_19{
  public static void main(String[] args){
    String msg = "　AB CD　";

    System.out.println("[" + msg + "]");
    System.out.println("[" + msg.strip() + "]");
    System.out.println("[" + msg.stripLeading() + "]"); //前の空白文字を取り除く
    System.out.println("[" + msg.stripTrailing() + "]"); //後の空白文字を取り除く
  }
}

// 文字列に含まれる文字を大文字または小文字に変換する
class JSample9_20{
  public static void main(String[] args){
    String str1 = "TeaCup";
    String str2 = "Ｍｏｕｓｅ";

    System.out.println(str1);
    System.out.println(str1.toUpperCase());
    System.out.println(str1.toLowerCase());

    System.out.println(str2);
    System.out.println(str2.toUpperCase());
    System.out.println(str2.toLowerCase());
  }
}

// 文字列の最後に文字列を連結する
class JSample9_21{
  public static void main(String[] args){
    String str = "東京都";

    System.out.println(str.concat("港区赤坂"));
    System.out.println(str + "港区赤坂");
  }
}

// 文字列の一部を別の文字列に置換する
class JSample9_22{
  public static void main(String[] args){
    String str1 = "Herro Java";
    System.out.println(str1);
    System.out.println(str1.replace('r', 'l'));

    String str2= "東京都港区";
    System.out.println(str2);
    System.out.println(str2.replace("港区", "中央区"));
  }
}

// 指定した区切り文字で複数の文字列を連結する
class JSample9_23{
  public static void main(String[] args){
    String str1 = String.join("-", "Apple", "Grape", "Melon");
    System.out.println(str1);

    List<String> strings = List.of("One", "Two", "Three");
    String str2 = String.join(" * ", strings); //第二引数はiterableであればなんでも良い（Listでも可）
    System.out.println(str2);
  }
}


// 文字列の中で指定した文字や文字列のインデックスを取得する
// 文字のインデックスを探す
class JSample9_24{
  public static void main(String[] args){
    String str = "Hello World";
    System.out.println(str.indexOf((int)'o')); //最初に出てくるインデックス
    System.out.println(str.lastIndexOf((int)'o')); //最後に出てくるインデックス
  }
}
// 文字列のインデックスを探す
class JSample9_25{
  public static void main(String[] args){
    String str = "東京都と京都府";

    System.out.println(str.indexOf("京都"));
    System.out.println(str.lastIndexOf("京都"));
  }
}

// 文字列全体が正規表現パターンとマッチするか調べる
class JSample9_26{
  public static void main(String[] args){
    String str1 = "airplane.png";
    String str2 = "lemon.png";
    String str3 = "apple.jpeg";
    String regex = "a.+png$"; 
    //a から始まり、任意の文字が 1 回以上続き、 png が続く文字列とマッチするパターン

    System.out.println(str1.matches(regex));
    System.out.println(str2.matches(regex));
    System.out.println(str3.matches(regex));
  }
}

// 文字列を正規表現パターンを使って分割する
class JSample9_27{
  public static void main(String[] args){
    String regex  = ";|:";
    String str = "赤色:青色;黄色:;";

    String[] result = str.split(regex, 0); //分割の回数に制限をなくす(0)
    for (int i = 0 ; i < result.length; i++){
      System.out.println("[" + result[i] + "]");
    }

    System.out.println("-- --");

    result = str.split(regex, -1); //分割の回数に制限をなくすが、空白文字も含めて分割してしまう
    for (int i = 0 ; i < result.length; i++){
      System.out.println("[" + result[i] + "]");
    }

    System.out.println("-- --");

    result = str.split(regex, 2);
    for (int i = 0 ; i < result.length; i++){
      System.out.println("[" + result[i] + "]");
    }
  }
}

// 文字列の中の正規表現とマッチする部分を置換する
