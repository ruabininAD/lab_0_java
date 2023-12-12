import org.junit.Test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


import ru.spbstu.telematics.java.App;


public class AppTest {

    @Test
    public void testAppOutputFromFile() {
        try {
            // Запуск main метода
            String[] args = null;
            App.main(args);

            
            File outputFile = new File("output.txt");
            BufferedReader br = new BufferedReader(new FileReader(outputFile));
            StringBuilder output = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                output.append(line).append("\n");
            }
            br.close();

            String expectedOutput = "Array2DRowRealMatrix{{58.0,64.0},{139.0,154.0}}"; 
            assertEquals("Output from file doesn't match expected.", expectedOutput, output.toString().trim());

        } catch (IOException e) {
            e.printStackTrace();
            fail("Exception occurred: " + e.getMessage());
        }
    }
}
