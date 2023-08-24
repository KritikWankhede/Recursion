package Recursion;

public class FirstCapital {
    public static void main(String[] args) {
     String word="kritik wankhede";
     char str=firstCaps(word,0);
     if(str==0 || str=='n'){
         System.out.println("No upperCase");
     }
     else{
         System.out.println(str);
     }

    }
    static char firstCaps(String word,int num){
        if(word.length()==0||num==word.length()){
            return 'n';
        }
        if(word.charAt(num)<='Z' && word.charAt(num)>='A'){

           return word.charAt(num);

        }
        else{
            return firstCaps(word,num+1);
        }


    }
}
