class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  

  void init(){
    String s = "Titties";
    System.out.println(encryptone(s));
    System.out.println(encrypttwo(encryptone(s)));
    System.out.println(decrypttwo((encrypttwo(encryptone(s)))));
    
  }

  String encryptone(String s){
    String build = "";
    for(int i = s.length()-1;i>=0;i--){
      char a = s.charAt(i);
      build += a;
    }
    return build;
  }

  String decryptone(String s){
    String build = "";
    for(int i = s.length()-1;i>=0;i--){
      char a = s.charAt(i);
      build += a;
    }
    return build;
  }

  String encrypttwo(String s){
    String build = "";
    for(int i=0;i<s.length();i++){
      char character = s.charAt(i);
      if((i%2)== 0){
        int ascii = (int)character;
        ascii += 2;
        build += (char)ascii;

      }
      else{
        build += character;
      }


  }
  return build;
  }

    String decrypttwo(String s){
    String build = "";
    for(int i=0;i<s.length();i++){
      char character = s.charAt(i);
      if((i%2)== 0){
        int ascii = (int)character;
        ascii -= 2;
        build += (char)ascii;

      }
      else{
        build += character;
      }


  }
  return build;
  }


}