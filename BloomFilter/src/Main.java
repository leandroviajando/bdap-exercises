import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        BloomFilter bloomFilter = new BloomFilter(15, 3);

        try {
            File file = new File("data/users.txt");

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null)
                bloomFilter.add(line);
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }

        // Check if some strings are in the BloomFilter
        System.out.println(bloomFilter.check("Angelo00")); // true
        System.out.println(bloomFilter.check("ItzGarcyy")); // true
        System.out.println(bloomFilter.check("ShadowMystorm")); // false
        System.out.println(bloomFilter.check("Shad3454556")); // false
        System.out.println(bloomFilter.check("ShadowMystorm1234")); // false
    }
}
