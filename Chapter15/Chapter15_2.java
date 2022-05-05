package Chapter15;

//テキストファイルを読み読み込むためのクラス
//java.io => 入出力関連のクラス
//java.ioの部分をパッケージ（種類別の様々なクラスまとめてるもの）
import java.io.BufferedReader;
//バッファを介して書き込むための文字ストリームのクラス
import java.io.BufferedWriter;
//キーボードの入力エラー時の例外クラス
import java.io.IOException;
//java.ioの上位互換
//ファイル・システムへのインタフェースを提供し、ファイル・システム内のファイルやその他の
//オブジェクトにアクセスするためのオブジェクトのファクトリです
import java.nio.file.FileSystem;
//ファイルシステム用のファクトリメソッド。このクラスは
//デフォルトのファイルシステムおよびファクトリメソッドを取得してほかの種類のファイルシステムを構築するための getDefault メソッドを定義します。
import java.nio.file.FileSystems;
//このクラスは、ファイル、ディレクトリ、またはその他の種類のファイルを操作する
//staticメソッドだけで構成されます。
import java.nio.file.Files;
//ファイル・システム内のファイルを特定するために使用可能なオブジェクトです。
//通常、それはシステムに依存するファイル・パスを表します。
import java.nio.file.Path;

public class Chapter15_2 {
  public static void main(String[] args) {
    FileSystem fs = FileSystems.getDefault();
    // PathクラスのインスタンスをFileSystem.getPathメソッドで生成
    Path inputPath = fs.getPath("Chapter15/input.txt");
    Path outputPath = fs.getPath("Chapter15/output.txt");

    // Java7以降に追加された「try-with-resources」文で処理
    // Filesクラスを使用して、BufferedReaderクラスのインスタンスを生成
    // Filesクラスを使用して、BufferedWriterクラスのインスタンスを生成
    try (BufferedReader reader = Files.newBufferedReader(inputPath);
        BufferedWriter writer = Files.newBufferedWriter(outputPath);) {

      String line = null;
      // BufferedReader.readLineメソッドを使用して、1行づつ処理
      // 読み込む行がなくなるまでループ
      while ((line = reader.readLine()) != null) {
        // 文字数が5以外の場合はスキップ
        if (line.length() != 5) {
          continue;
        }
        // 読み込んだ1行を出力
        writer.write(line);
        // 改行がついてないので改行を出力
        writer.newLine();
      }

      // 例外処理を記述
      // printStackTraceで例外を出力
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      System.out.println("Output processing finished");
    }
  }
}

