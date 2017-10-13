package br.org.testing.java.hello;

import java.util.Random;
import java.util.stream.IntStream;

import org.junit.Test;

import com.github.javafaker.Faker;

/**
 * @author thiago-amm
 * @version v1.0.0 13/10/2017
 * @since v1.0.0
 */
public class JavaFakerTest {
    
    @Test
    public void test() {
        Random random = new Random();
        Faker faker = new Faker(random);
        random.setSeed(System.currentTimeMillis());
        IntStream.range(0, 50).forEach(i -> {
            System.out.println(faker.name().fullName());
        });
    }
    
}
