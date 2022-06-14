
import java.util.Scanner;


public class logic_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputline = input.nextLine();
        String[] arrayinput = inputline.trim().split(", "); /*รับค่า array มาแบบบรรทัดเดียวโดยให้ตัดลูกน้ำกับช่องว่าง*/
        int length_array = arrayinput.length;
        int arrayofdata[] = new int[length_array];
        for(int i=0;i<length_array;i++){
            arrayofdata[i] = Integer.parseInt(arrayinput[i]); /*เก็บค่าที่ผ่านการตัดคำลงในอาเรย์โดยแปลงเป็นตัวเลข*/
        }
        int right_sum = 0;
        int left_sum = 0;
        boolean check = true;
        
        for(int i=1;i<length_array;i++){ /*กำหนดให้เริ่มบวกตัวที่ 2 ไปจนตัวสุดท้ายเพราะถ้าเริ่มที่ตัวแรกจะไม่มีตัวเลขทางด้านซ้ายไว้เทียบค่า*/
            right_sum += arrayofdata[i]; /*เก็บค่าผลบวกไว้สำหรับลดค่า*/
        }
        
        for(int i=0,j=1;j<length_array;i++,j++){
            right_sum -= arrayofdata[j]; /*ทำการลดค่าจากผลบวกที่บวกไว้ลงไปเรื่อยๆ โดยให้เริ่มลดจากตัวที่ 2*/
            left_sum += arrayofdata[i]; /*ทำการเพิ่มค่าไปเรื่อยๆจากทางซ้าย โดยเริ่มที่ตัวแรกจากนั้นจึงนำมาเปรียบเทียบค่าไปพร้อมๆกัน*/
            
            if(left_sum==right_sum){
                System.out.println("middle index is "+j); /*ให้พิมพ์ตำแหน่งที่อยู่กึ่งกลางเมื่อผลบวกทั้ง 2 ข้างเท่ากัน*/
                check = false;
            }
        }
        if(check){
            System.out.println("index not found");
        }

    }
}
