package controllers;

import static spark.Spark.get;

import spark.Request;
import spark.Response;

import models.User;
import utils.JsonUtil;

public class UsersController {

  public UsersController() {
    get("/hello",
        (Request req, Response res) -> {
          res.type("application/json");

          String name = req.queryParams("name");
          String lastName = req.queryParams("last_name");

          return new User(name, lastName);
        },
        JsonUtil::toJson
    );
  }
}
