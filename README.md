# practice_test_refactoring

### 要求事項
　入力した文字列を区切り文字で分割して各数字の合計を出す。  
　ex) 「1,2,3」を入力すると「6」が返却される。
 - 区切り文字は（,）と（:）である。
 - カスタム区切り文字も指定できる。
    - カスタム区切り文字の指定方法は「//」と「¥n」の間に区切り文字を入れて入力する文字列の前につける。  
    ex) 「//;¥n1;2;3」を入力すると「6」が返却される。
 - 負数がある場合は「RuntimeException」で例外処理をする。
 - 空文字またはnullが入力されたら「0」を返却される。
