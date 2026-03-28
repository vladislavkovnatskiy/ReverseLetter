public class ReverseLetter {
    public static void main(String[] args) {
        String strInput = "J@va the be$t!123";
        String strOutput = reverseLetter(strInput);
        System.out.println(strOutput);
    }
    public static String reverseLetter(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        char[] output = new char[str.length()];
        int count = str.length()-1;
        for (int i = 0; i <= count; i++) {
            if((str.charAt(i)>= 65 && str.charAt(i)<= 90)||(str.charAt(i)>= 97 && str.charAt(i)<= 122)){
                //поиск буквы с конца
                for(; count > i; count--) {
                    if((str.charAt(count)>= 65 && str.charAt(count)<= 90)||(str.charAt(count)>= 97 && str.charAt(count)<= 122)){
                        break;
                    }
                    output[count] =  str.charAt(count);
                }
                char k = str.charAt(i);
                output[i] = str.charAt(count);
                output[count] = k;
                count = count - 1;
            } else  {
                output[i] = str.charAt(i);
            }
        }
        return new String(output);
    }
}
