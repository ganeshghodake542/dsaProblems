package Backtracking;


public class findSubset {

    public static void findSS(String str , int i, String ans){
        //base condition
        if(i==str.length()){
            System.out.println(ans);
            return;
        }


        //yess
        findSS(str, i+1, ans+str.charAt(i));
        //No
        findSS(str, i+1, ans);
    }

    public static void main(String[] args) {

        String str = "abc";
        findSS(str, 0, "");   
    }
    
}