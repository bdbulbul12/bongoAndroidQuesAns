//1) Write a function that detects
//if two strings are anagram e.g. ‘bleat’ and ‘table’
//are anagrams but ‘eat’ and ‘tar’ are not.

package bongo;

import java.util.Scanner;


public class AnagramDemo {
    
     static boolean isAnagram(String a, String b) {
       

        a=a.toUpperCase();
        b=b.toUpperCase();
        boolean res = false;
        StringBuilder c= new StringBuilder(b);

        if(a.length()==b.length()){
            for(int i=0; i<a.length();i++){
                for(int j=0; j<c.length();j++){
                    if(a.charAt(i)==c.charAt(j)){
                            c.deleteCharAt(j);
                        if(i==a.length()-1 && c.length()==0){
                            res=true;
                            break;
                        }
                        break;

                    }

                }
            }
        }return res;
   
   }
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean res = isAnagram(a, b);
        System.out.println( (res) ? "Anagrams" : "Not Anagrams" );
    }
}