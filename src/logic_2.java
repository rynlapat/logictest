
import java.util.Scanner;

public class logic_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String wordreadfront = input.next();
        int length = wordreadfront.length();
        String wordreadback = "";

        for (int i = length - 1; i >= 0; i--) {
            wordreadback = wordreadback + wordreadfront.charAt(i); /*เก็บค่าคำที่ถูกอ่านกลับจากหลังมาหน้าว้ที่ตัวแปร*/
        }
        if (wordreadfront.equalsIgnoreCase(wordreadback)) { /*เทียบความเหมือนกันโดยไม่สนตัวพิมพ์เล็กหรือตัวพิมพ์ใหญ่*/
            System.out.println(wordreadfront + " is a palindrome");
        } else {
            System.out.println(wordreadfront + " isn't a palindrome");

        }

    }
}
