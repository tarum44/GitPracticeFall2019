package day1;

public class StringPractice {
    public static void main(String[] args){
        System.out.println("Hello World");
        String str="Java is fun";
        System.out.println(str);

        char [] chars=str.toCharArray();
        String reversestr="";
        for(int i=chars.length-1;i>=0;i--){
            reversestr += chars[i];
        }
        System.out.println("reversestr = " + reversestr);
    }
}
