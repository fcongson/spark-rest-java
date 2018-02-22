import static spark.Spark.*;

public class UserEndpoint {

    public UserEndpoint() {
        setUpEndpoints();
    }

    private void setUpEndpoints() {
        post("/users", (request, response) -> {
            //...
            return "POST /users";
        });
        get("/users", (request, response) -> {
            //...
            return "GET /users";
        });
        get("/users/:id", (request, response) -> {
            //...
            return "GET /users/:id";
        });
        put("/users/:id", (request, response) -> {
            //...
            return "PUT /users/:id";
        });
        delete("/users/:id", (request, response) -> {
            //...
            return "DELETE /users/:id";
        });
        options("/users/:id", (request, response) -> {
            //...
            return "OPTIONS /users/:id";
        });
    }
}
