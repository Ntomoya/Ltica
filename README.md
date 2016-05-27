# Raspberry Pi GPIO
javaでのGPIO制御のテスト
## 動作環境
Raspberry Pi Model B (Revision 1.0)  
raspbian 8.0
## 使用ライブラリ
pi4j
### pi4jのインストール
Lticaディレクトリ内にインストール  
`$ wget http://pi4j.googlecode.com/files/pi4j-1.0-SNAPSHOT.zip`  
解凍  
`$ unzip pi4j-1.0-SNAPSHOT.zip`
### コンパイル, 実行
`$ javac -cp .:pi4j/pi4j-1.0-SNAPSHOT/lib/* hoge.java`  
`$ sudo java -cp .:pi4j/pi4j-1.0-SNAPSHOT/lib/* hoge`
