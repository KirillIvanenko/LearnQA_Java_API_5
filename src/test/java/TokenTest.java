import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import java.lang.Thread;

public class TokenTest {
    @Test
    public void tokenTest1() throws InterruptedException {

        for (int i = 0; i < 1; i++) {
            try {
                RestAssured.get("https://playground.learnqa.ru/ajax/api/longtime_job?token=QN1ozMzojMyAiNy0SMx0yMyAjM0").prettyPrint();
                Thread.sleep(20000);
                RestAssured.get("https://playground.learnqa.ru/ajax/api/longtime_job");
            } catch (InterruptedException e) {}

        }
    }

    @Test
    public void tokenTest2() {
        RestAssured.get("https://playground.learnqa.ru/ajax/api/longtime_job").prettyPrint();
        RestAssured.get("https://playground.learnqa.ru/ajax/api/longtime_job?token=QN1ozMzojMyAiNy0SMx0yMyAjM").prettyPrint();
    }
}
