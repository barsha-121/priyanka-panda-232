public class AddBinaryStrings {
    public static void main(String[] args) {
        
        String binary1 = "1011"; 
        String binary2 = "1101"; 
        
        String result = addBinary(binary1, binary2);

        System.out.println("Sum of binary strings: " + result);
    }

    public static String addBinary(String binary1, String binary2) {

        StringBuilder result = new StringBuilder();

        int carry = 0;

        int len1 = binary1.length();
        int len2 = binary2.length();

        while (len1 < len2) {
            binary1 = "0" + binary1;
            len1++;
        }

        while (len2 < len1) {
            binary2 = "0" + binary2;
            len2++;
        }

        for (int i = len1 - 1; i >= 0; i--) {
        
            int bit1 = binary1.charAt(i) - '0';
            int bit2 = binary2.charAt(i) - '0';
            int sum = bit1 + bit2 + carry;

            result.append(sum % 2);

            carry = sum / 2;
        }

        if (carry != 0) {
            result.append(carry);
        }
        
        return result.reverse().toString();
    }
}
