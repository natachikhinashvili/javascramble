import java.util.ArrayList; // import the ArrayList class

public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
      String fromstr1 = "";
      
      ArrayList<String> list = new ArrayList<>();
      ArrayList<String> list1 = new ArrayList<>();
      ArrayList<String> secstr = new ArrayList<>();

      
      for (int i = 0; i < str2.length(); i++) {
        list.add(String.valueOf(str2.charAt(i)));
      }
      
      for (int i = 0; i < str1.length(); i++) {
        list1.add(String.valueOf(str1.charAt(i)));
        secstr.add(String.valueOf(str1.charAt(i)));
      }
      
      first:
      for(String i : list){
        second:
        for(String j : secstr){
          if(j.equals(i)){
            secstr.remove(i);
            fromstr1+=j;
            break second;
          }
        }
      }
      return fromstr1.length() == str2.length();
    }
}