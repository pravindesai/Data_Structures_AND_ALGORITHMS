package Common_Interview_Programs;

public class Reverse_a_String {
    public static void main(String[] args) {
        String str = "ABCDEFGH";
        String strRev = "";

        for (int i = str.length()-1; i>=0; i--){
            strRev = strRev+str.charAt(i);
        }

        System.out.println("Reversed String : "+strRev);
    }
}
