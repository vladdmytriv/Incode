import io.restassured.response.Response;
import org.junit.Test;
import starter.stepdefinitions.SearchStepDefinitions;

public class ProductTests {

    @Test
    public void test(){
        Response response = new SearchStepDefinitions().heCallsEndpoint("//waarkoop-server.herokuapp.com/api/v1/search/demo/apple");
        String string;

    }
}
