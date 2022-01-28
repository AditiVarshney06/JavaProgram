public class DivideInNParts {
    //this will only print n letter at a line not less, so some letter will left
    public static void divide(String str,int n){
       int len=str.length();
       String s="";
       int start=0;
       int end=n;
       for(int i=start;i<(len/n);i++){
           s=str.substring(start,end);
           start+=n;
           end+=n;
           System.out.println(s);
       }
    }
    
    
    public static void main(String args[]){
      divide("aaaabbbbccccd",2);
    }    
}
