// 変数
class JSample4_1{
  public static void main(String[] args){
  	int sum = 58 + 72 + 90;
    System.out.println("合計 " + sum);
    System.out.println("平均 " + sum / 3);
  }
}

// 変数の宣言
class JSample4_2{
  public static void main(String[] args){
    int old, height; //まとめて宣言できる
    // 宣言は必要（型推論はできない）
    old = 20;
    height = 184;

    System.out.println("年齢：" + old);
    System.out.println("身長：" + height);
  }
}

// 基本のデータ型
/*
boolean	true or false
char	16ビットUnicode文字 \u0000～\uFFFF
byte	8ビット整数 -128～127
short	16ビット整数 -32,768～32,767
int	32ビット整数 -2,147,483,648～2,147,483,647
long	64ビット整数 -9,223,372,036,854,775,808～9,223,372,036,854,775,807
float	32ビット単精度浮動小数点数
double	64ビット倍精度浮動小数点数
 */

class JSample4_3{
  public static void main(String[] args){
    int n = 100;
    long l = 12345678910L;
    double d = 3.14;
    float f = 3.14F;
    char c = '花';
    boolean b = true;

    System.out.println("n=" + n);
    System.out.println("l=" + l);
    System.out.println("d=" + d);
    System.out.println("f=" + f);
    System.out.println("c=" + c);
    System.out.println("b=" + b);
  }
} 


// 変数の初期化と代入
class JSample4_4{
  public static void main(String[] args){
    int old;
    String name;

    old = 24;
    name = "Tarou Yamada";

    System.out.println(old);
    System.out.println(name);
  }
}

// 型推論
class JSample4_5{
  public static void main(String[] args){
    var old = 24;
    var name = "Yamada";
    var height = 184L; //varをつけた時型推論が可能
    // var sex = null //型推論ができない

    System.out.println("年齢：" + old);
    System.out.println("氏名：" + name);
    System.out.println("身長：" + height);
  }
}

// 定数宣言final
class JSample4_6{
  public static void main(String[] args){
    final float TAX = 0.1F;

    float price = 800 * (1 + TAX);
    System.out.println("料金は" + price + "です");
  }
}

// 型のキャスト

/*　型のキャスト先
byte	short,int,long,float,double
short	int,long.float,double
int	long,float,double
long>	float,double
float	double
double	--
char	int,long,float,double
 */
class JSample4_7{
  public static void main(String[] args){
    float f = 10;
    double d = 1234L; //long型がdouble型にキャストされる

    System.out.println("f=：" + f);
    System.out.println("d=：" + d);
  }
}
// ただし誤差が発生する可能性がある
class JSample4_8{
  public static void main(String[] args){
    int i1 = 123456789;
    float f1 = i1;
    System.out.println("i1=：" + i1);
    System.out.println("f1=：" + f1);

    long l2 = 1234567890123456789L;
    float f2 = l2;
    double d2 = l2;

    System.out.println("l2=：" + l2);
    System.out.println("f2=：" + f2);
    System.out.println("d2=：" + d2);
  }
}


// 縮小変換
// 扱う範囲が小さい型にキャストする

class JSample4_9{
  public static void main(String[] args){
    double d = 123.0;
    int i = (int)d; //double型をint型に縮小キャストする
    float f = (float)d;

    System.out.println("d=：" + d);
    System.out.println("i=：" + i);
    System.out.println("f=：" + f);
  }
}
// ただし情報が落ちてしまう可能性がある
class JSample4_10{
  public static void main(String[] args){
    long l1 = 1234567890123456789L;
    int i1 = (int)l1;
    float f2 = 123.45f;
    int i2 = (int)f2;

    System.out.println("l1=：" + l1);
    System.out.println("i1=：" + i1);
    System.out.println("f2=：" + f2);
    System.out.println("i2=：" + i2);
  }
}

// Wrapperクラス
// 各データ型にはさまざまなメソッドを用意したWrapperクラスが用意されている
class JSample4_11{
  public static void main(String[] args){
    Integer i = Integer.valueOf(10); //int型のWrappeerクラスIntegerクラスを初期化
    int val = i.intValue(); //IntegerクラスのメソッドintValueを実行　戻り値はint型
    int val2 = i; //オートボクシング機能

    System.out.println("i = " + val);
    System.out.println("i = " + val2);
  }
}