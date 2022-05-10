package chapters1to4;

public class UnicToUTF16 {
    public static void main(String[] args) {
        String code = "U+1F60F"; // 😏
        String binary = "1 1111 0110 0000 1111";   // substract 0x10000 from code because U+10000> are
        String binarySub = "1 11101 10000 01111";  // encoded using special 0xD800 - 0xDBFF code units

        String draft = "110110xxxxxxxxxx 110111xxxxxxxxxx";
        String utf16CodeBinary = "1101 1000 0011 1101  1101 1110 0000 1111";
        String utf16Code = "\uD83D\uDE0F";

        System.out.println(utf16Code);
    }
}
