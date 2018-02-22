import static spark.Spark.get;

public class HelloWorldEndpoint {

    public HelloWorldEndpoint() {
        setUpEndpoints();
    }

    private void setUpEndpoints() {
        get("/hello", (req, res) -> "Hello, world");

        get("/hello/:name", (req, res) -> {
            return "Hello, " + req.params(":name");
        });
    }
}
