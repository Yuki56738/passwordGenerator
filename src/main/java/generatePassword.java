import java.security.SecureRandom;

import static java.lang.System.out;

public class generatePassword {
    private static SecureRandom random= new SecureRandom();
    private static final String NUMERIC ="0123456789";
    public static String generatePassword(int len, String dic){
        String result ="";
        for (int i=0;i<len;i++){
            int index = random.nextInt(dic.length());
            result += dic.charAt(index);
        }
        return result;
    }
    public static void main(String[] args){
        out.println(generatePassword(8, NUMERIC));

    }
}
