package training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GeneratedBookFileTest {

    @Test
    void generate() {
        var file = new GeneratedBookFile(new Book("Java", 2022));
        var content = file.generate();
        System.out.println(content);
        assertTrue(content.contains("Java"));
    }
}