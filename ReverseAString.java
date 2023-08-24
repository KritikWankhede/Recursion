package Recursion;

public class ReverseAString {
    //    public static void main(String[] args) {
//        String word="Hello I am Kritik.";
//        reverse(word,word.length()-1);
//    }
//    static void reverse(String word,int num){
//        if(word.length()==0 || num<0){
//            return;
//        }
//        System.out.print(word.charAt(num));
//        reverse(word,num-1);
//    }
//}
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverseString(s,0,s.length-1);
    }


        static void reverseString(char[] s,int start,int end) {
            if(end<start){
                System.out.println(s);
                return;
            }
                char temp = s[start];
                s[start] = s[end];
                s[end] = temp;

               reverseString(s,start+1,end-1);


        }

}


