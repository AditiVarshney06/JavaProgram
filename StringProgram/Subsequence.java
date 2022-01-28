//a=AXY
//b=YADXCP,althought all elemet of a is on be it is not subsequence because order is not same in b
public class Subsequence {
    public static boolean isSubsequence(String str,String sub){
      int num=0,found=0;
      for(int i=0;i<sub.length();i++){
          for(int k=num;k<str.length();k++){
            if(sub.charAt(i)==str.charAt(k))
            {   num=k;
                found++;
                break;
            }    
        }
      }
      System.out.print(found);
      if(found==sub.length())
          return true;
      else 
          return false;
    }
    public static void main(String args[]){
    System.out.print(isSubsequence("laldflfsa","lsfat"));
    }
}
