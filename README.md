"# Algorithm4Hobby" 

## ■ビームの反射アルゴリズム
jp.co.masaya.practice.paiza.Main11.java  
  
箱の高さHと幅W、および箱の内部の状態が与えられるので、箱の内部に向けてビームが撃たれてから箱の外部に飛び出るまでにビームが箱の中の区画を通過する回数を答えてください。  
 
### 入力フォーマット  
H W　　　#箱の高さ H , 幅 W  
s_1　　　#1列目の箱の状態を示した文字列  
s_2　　　#2列目の箱の状態を示した文字列  
...  
s_H　　　#H列目の箱の状態を示した文字列  
  
## ■落ちものシミュレーション  
jp.co.masaya.practice.paiza.Main12.java  
  
・ゲームは縦幅 H、横幅 W の長方形のフィールドで行われます。  
・ゲームが始まると、様々なサイズの長方形がフィールドの上方から一つずつ順番に落ちてきます。  
・落ちてくる長方形の直下に他の長方形もしくはフィールドの底辺がある場合、接触したとみなして長方形の位置は固定されます。  
  
上記の仕様に従って落ちてくる長方形の動きをシミュレーションしましょう。  
N 個の長方形が落ちてきた後のフィールドの状態を表示するプログラムを書いてください。  
  
### 入力フォーマット  
H W N  
h_1 w_1 x_1  
h_2 w_2 x_2  
...  
h_N w_N x_N  
  
・1 行目には 3 つの整数 H, W, N がこの順に半角スペース区切りで与えられます。  
　H はフィールドの縦幅を、W はフィールドの横幅を、 N は落ちてくる長方形の個数を表します。  
・続く N 行のうち i 行目 (1 ≦ i ≦ N) には i 番目に落ちてくる長方形のサイズと落ちてくる位置の情報が入力されます。  
　ここではこの長方形の縦幅 h_i、横幅 w_i、長方形の左端とフィールドの左端の距離 x_i がこの順に半角スペース区切りで与えられます (問題文中の図を参照)。  
・入力は合計で N + 1 行であり、入力最終行の最後に改行が 1 つ入ります。  
 
