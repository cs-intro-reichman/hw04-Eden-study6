public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
       
        return  str.toLowerCase();
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
    if (str2.isEmpty()) {
        return true;
    }

    String newstr  = lowerCase(str1);
    String newstr2 = lowerCase(str2);

    if (newstr.length() < newstr2.length()) {
        return false;
    }

    if (newstr.length() >= newstr2.length()) {
        for (int start = 0; start <= newstr.length() - newstr2.length(); start++) {

            boolean match = true;

            for (int i = 0; i < newstr2.length(); i++) {
                if (newstr.charAt(start + i) != newstr2.charAt(i)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return true; 
            }
        }
    }

    return false;
}


}