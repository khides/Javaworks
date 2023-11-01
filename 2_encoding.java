// デフォルトエンコーディング
class JSample2_1{
    public static void main(String[] args) {
        System.out.println(System.getProperty("file.encoding")); //自身の環境のエンコーディング様式について
    }
}

class JSample2_2{
    public static void main(String[] args) {
        System.err.println("いい天気ですね");
    }
}

// ソースファイルのエンコーディングを指定してコンパイルする
// javac -eoncoding UTF-8 2_encoding.java
// javac -J-Dfile.encoding=エンコーディング名 ソースファイル名.java




// 実行環境のエンコーディングに合わせてプログラムを実行する
// java -Dfile.encoding=UTF-8 JSample4_1

