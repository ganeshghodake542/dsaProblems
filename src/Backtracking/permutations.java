package Backtracking;

public class permutations {

    public static void Innerpermutations(String str , String ans) {
    
        //base 

        if (str.length() == 0 ){
            System.out.println(ans);
            return;
        }

        
        for(int i = 0 ; i<str.length() ; i++){
            char curr = str.charAt(i);
            String Remaning = str.substring(0 , i) + str.substring(i+1);
            Innerpermutations(Remaning, ans+curr);
        }
        
    }

    public static void main(String[] args) {

        String str = "abc";
        Innerpermutations(str, "");
        
    }
}
