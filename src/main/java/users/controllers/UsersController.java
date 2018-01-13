package users.controllers;

import static spark.Spark.get;

public class UsersController {

  public static void greetUser() {
    get("/hello/:name ", (request, response) -> "Hello " + request.params(":name"));
  }

}
