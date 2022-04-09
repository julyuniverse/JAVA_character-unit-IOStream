import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("writer.txt")) {
            fw.write('A'); // 문자 하나 출력
            char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
            fw.write(buf); // 문자 배열 출력
            fw.write("안녕하세요"); // String 출력
            fw.write(buf, 1, 2); // 문자 배열의 일부 출력
            fw.write(65); // 문자 하나 출력
            fw.write("65"); // String 숫자를 그대로 출력
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("출력이 완료되었습니다.");

        // writer.txt 파일 내용
        // ABCDEFG안녕하세요CDA65
    }
}
