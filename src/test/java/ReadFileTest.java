import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author ZhangMinlei
 * @description
 * @date 2023-08-11 16:46
 */
public class ReadFileTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Files.newInputStream(Paths.get("C:\\Users\\ZHANGMINLEI\\Desktop\\a.txt"));
        int count = 0;
        while ((count = inputStream.read()) != -1) {
            System.out.print((char) count);
        }
        inputStream.close();

        outPutFile();
    }

    public static void outPutFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\ZHANGMINLEI\\Desktop\\a.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        String s = "111~";
        bufferedOutputStream.flush();
        bufferedOutputStream.write(s.getBytes());
        bufferedOutputStream.close();
    }
}
