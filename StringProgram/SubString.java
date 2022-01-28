//if str="abalduabcgie";
//is s ="abc" a substring of str;
public class SubString {
     public static void check(String str,String sub){
       for(int i=0;i<str.length()-sub.length()+1;i++){
           if(sub.equals(str.substring(i,sub.length()+i)))
               System.out.print(sub+" is a substring");
         String s=str.substring(i,sub.length()+i); 
         System.out.println(s);
       }
    }
    public static void main(String args[]){
    check("ajklmfjabksad","klm");
    }
}
