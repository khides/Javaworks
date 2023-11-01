// 文字リテラル
class JSample3_1{
  public static void main(String[] args){
    System.out.println('a');
    System.out.println(0x0061); //文字コード（2進数）
    System.out.println('\u0061');
  }
}

// エスケープシーケンス
class JSample3_2{
  public static void main(String[] args){
    System.out.println('\'');
    System.out.println("私の名前は\"鈴木\"です");
    System.out.println("この魚の値段は\\250です");
  }
}

/*
エスケープシーケンス一覧
\b      バックスペース
\t      水平タブ
\n      改行
\r      復帰
\f      改ページ
\'      シングルクオーテーション
\"      ダブルクオーテーション
\\      \文字
\ooo    8進数の文字コードが表す文字
\ｕhhhh  16進数の文字コードが表す文字
*/



// 整数リテラル
class JSample3_3{
  public static void main(String[] args){
    System.out.println(123);
    System.out.println(0x3F01);
    System.out.println(45 + 75);
  }
}


// 浮動小数点リテラル
class JSample3_4{
  public static void main(String[] args){
    System.out.println(18.225);
    System.out.println(5.23e3);
    System.out.println(1.816e10);
    System.out.println(7.5e-2);
    System.out.println(2.712e-6);
    System.out.println(3.52 + 17.4);
  }
}

// 整数リテラルのサフィックス
class JSample3_5{
  public static void main(String[] args){
    System.out.println(2200000000L); //long型（intより大きな数値を扱える）
  }
}

// 浮動小数点リテラルのサフィックス
class JSample3_6{
    public static void main(String[] args) {
        System.out.println(3.2); //double型
        System.err.println(3.2D);//double型
        System.out.println(3.2F);//float型
    }
}

// 数値リテラルに桁区切り文字を記述する
class JSample3_7{
  public static void main(String[] args){
    System.out.println(1_234_567); //_で桁区切りをする（出力には反映されない）
    System.out.println(0b10_11_01_10);
  }
}


// 論理値リテラル
class JSample3_8{
  public static void main(String[] args){
    System.out.println(10 > 7);
    System.out.println(5 == 4);
  }
}