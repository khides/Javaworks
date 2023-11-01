// 算術演算子
/*
(1) どちらかの値が double 型の場合は他の値を double 型に変換する
(2) どちらかの値が float 型の場合は他の値を float 型に変換する
(3) どちらかの値が long 型の場合は他の値を long 型に変換する
(4) (1)から(3)に該当しない場合は両方の値を int 型に変換する
 */

 class JSample5_1{ //0除算
  public static void main(String[] args){
    // double型やfloat型はエラーにならない
    System.out.println(10.0f / 0);
    System.out.println(10.0f % 0);
  }
}

// インクリメント演算子とデクリメント演算子
class JSample5_2{
    public static void main(String[] args) {
        // 後置と前置の違い
        int x1 = 5;
        int y1;

        y1 = x1++; 
        System.out.println("x1:" + x1);
        System.out.println("y1:" + y1);

        int x2 = 5;
        int y2;

        y2 = ++x2; 
        System.out.println("x2:" + x2);
        System.out.println("y2:" + y2);

    }
}

// ビット演算子
/*
&	a & b	a と b の論理積(ビットAND)
|	a | b	a と b の論理和(ビットOR)
^	a ^ b	a と b の排他的論理和(ビットXOR)
~	~a	a のビット反転(ビットNOT)
<<	a << n	a を 左へ n ビットシフト
>>	a >> n	a を 右へ n ビットシフト(符号有り)
>>>	a >>> n	a を 右へ n ビットシフト(符号無し)
 */
class JSample5_3{
  public static void main(String[] args){
    int i1 = 85 & 15;
    int i2 = 85 | 15;
    int i3 = 85 ^ 15;
    int i4 = ~85;

    System.out.println("85 & 15 = " + i1);
    System.out.println("85 | 15 = " + i2);
    System.out.println("85 ^ 15 = " + i3);
    System.out.println("~85 = " + i4);
  }
}


// 代入演算子
/*
+=	A += B	A = A + B と同じ
-=	A -= B	A = A - B と同じ
*=	A *= B	A = A * B と同じ
/=	A /= B	A = A / B と同じ
%=	A %= B	A = A % B と同じ
&=	A &= B	A = A & B と同じ
|=	A |= B	A = A | B と同じ
^=	A ^= B	A = A ^ B と同じ
<<=	A <<= B	A = A << B と同じ
>>=	A >>= B	A = A >> B と同じ
>>>=	A >>>= B	A = A >>> B と同じ
*/




// 関係演算子と等価演算子
class JSample5_4{
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,3};

        System.out.println(a == b); //配列は参照型のため、値が等しくても等価とはならない

    }
}


// 条件演算子
class JSample5_5{
  public static void main(String[] args){
    int score;

    score = 70;
    System.out.print("Score=" + score + ":");
    System.out.println(score > 70 ? "OK" : "NG");

    score = 84;
    System.out.print("Score=" + score + ":");
    System.out.println(score > 70 ? "OK" : "NG");
  }
}


// 文字列の連結
// StringBuilderを使った文字列の連結
class JSample5_6{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("XT");
        sb.append(3120);
        sb.append("-Y2");
        
        String name = sb.toString();
        System.out.println(name);
    }
}