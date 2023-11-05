// 正規表現の基本
import java.util.regex.*;

class JSample13_1{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("g..d"); //gから始まってdで終わる四文字のパターンを作成
        Matcher m = p.matcher("good"); //パターンマッチするかどうか調べるオブジェクトを生成
        System.out.println(m.matches());  // true
    }
}


// 正規表現パターンによるエスケープ処理
class JSample13_2{
  public static void main(String[] args){
    String regex = "a\\.b"; 
    // a.bの正規表現を生成
    // . は正規表現で特別な意味を持つので、\でエスケープする
    // \は文字列の中で、特別な意味を持つのでさらに\でエスケープする
    Pattern p = Pattern.compile(regex);

    Matcher m1 = p.matcher("a.b"); // マッチする
    System.out.println(m1.matches()); 

    Matcher m2 = p.matcher("axb"); //マッチしない
    System.out.println(m2.matches());
  }
}

// 文字列の中でメタ文字を使う
class JSample13_3{
    public static void main(String[] args) {
        String regex = "a\\db"; // \dで、０〜９の数値を表す
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("a1b");
        System.out.println(m.matches());
    }
}


// パターンの中をまとめてエスケープする
class JSample13_4{
  public static void main(String[] args){
    // String regex = "Q\\A.B.C.D\\E"; // \\Qパターン文字列\\Eで、パターンの中にある特別な意味を持つ文字を無視する
    String regex = Pattern.quote("A.B.C.D"); // quoteでも同じことができる

    Pattern p = Pattern.compile(regex);

    Matcher m1 = p.matcher("A.B.C.D");
    System.out.println(m1.matches());

    Matcher m2 = p.matcher("AABBCCDD");
    System.out.println(m2.matches());
  }
}


// PatternオブジェクトやMatcherオブジェクトを作成する
// 文字列の一部がパターンとマッチするかどうか調べる
class JSample13_5{
  public static void main(String[] args){
    String regex = "jpg$"; //末尾にjpgを持つパターンを作成する
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher("profile.jpg");

    if (m.find()){ //　文字が含まれるかどうかを調べるときは、matchesでなくfindを使う
      System.out.println("パターンにマッチします");
      System.out.println("マッチした部分は " + m.group() + " です");
    }else{
      System.out.println("パターンにマッチしません");
    }
  }
}

// 文字列全体がパターンとマッチするかどうか調べる
class JSample13_6{
  public static void main(String[] args){
    String regex = "S.*t"; // Sから始まり、任意の文字が０文字以上続いて、tで終わるパターン
    Pattern p = Pattern.compile(regex);

    Matcher m1 = p.matcher("JavaScript");
    System.out.println(m1.matches()); //全体がマッチするかどうか

    Matcher m2 = p.matcher("Script");
    System.out.println(m2.matches());

    Matcher m3 = p.matcher("Set");
    System.out.println(m3.matches());
  }
}

// 文字列の先頭からパターンにマッチするか調べる
class JSample13_7{
  public static void main(String[] args){
    String regex = "[0-9]{2}"; //任意の数字が二つ連続するパターン
    Pattern p = Pattern.compile(regex);

    String[] target = {"AAZ02", "75PPT", "ON24KM"};
    for (int i = 0 ; i < 3 ; i++){
      Matcher m = p.matcher(target[i]);
      if (m.lookingAt()){ // 先頭がマッチするかどうか
        System.out.println(target[i] + "は" + m.group() + "の部分とマッチしました");
      }else{
        System.out.println(target[i] + "はマッチしませんでした");
      }
    }
  }
}

// 文字列の中でパターンとマッチするかどうか調べる
class JSample13_8{
  public static void main(String[] args){
    String regex = "[0-9]{2}"; // 任意の数字が二連続するパターン
    Pattern p = Pattern.compile(regex);

    Matcher m = p.matcher("CODE24-11-75");
    if (m.find()){ // パターンが含まれるかどうか
      System.out.println("マッチしました");
      System.out.println(m.group());
    }
  }
}
// findメソッドを連続して使用する
class JSample13_9{
  public static void main(String[] args){
    String regex = "[0-9]{2}"; //任意の数字が二連続するパターン
    Pattern p = Pattern.compile(regex);

    Matcher m = p.matcher("CODE24-11-75");
    while (m.find()){ // findを連続して用いる
      System.out.println(m.group()); //パターンとマッチした部分文字列を取得する
    }
  }
}

// パターンとマッチした部分文字列の情報を取得する
class JSample13_10{
  public static void main(String[] args){
    String regex = ".区";
    Pattern p = Pattern.compile(regex);

    Matcher m = p.matcher("東京都港区赤坂");
    if (m.find()){
      System.out.println("Start : " + m.start()); //マッチした部分の最初のインデックス
      System.out.println("End   : " + m.end()); //マッチした部分の最後にインデックス
      System.out.println("Match : " + m.group()); //マッチした部分文字列
    }
  }
}


// 対象文字列の中のパターンと比較する範囲を設定する
class JSample13_11{
  public static void main(String[] args){
    String target = "dancer singer";

    String regex = "\\b.*?er"; //　単語境界＋任意の０文字以上４文字以下の文字
    Pattern p = Pattern.compile(regex);

    Matcher m1 = p.matcher(target);
    if (m1.find()){
      System.out.println(m1.group());
    }else{
       System.out.println("not match");     
    }

    Matcher m2 = p.matcher(target);
    m2.region(7, 13); //7から13文字目を比較範囲に設定する
    if (m2.find()){
      System.out.println(m2.group());
    }else{
       System.out.println("not match");     
    }
  }
}

// 設定したリージョンの開始と終了インデックスを取得する
class JSample13_12{
    public static void main(String[] args) {
        String regex = "\\b.*?er"; //　単語境界＋任意の０文字以上４文字以下の文字
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("dancer singer");
        m.region(7, 13);

        System.out.println(m.regionStart());  // 7
        System.out.println(m.regionEnd());    // 13
    }
}

// アンカー境界の設定を行う

