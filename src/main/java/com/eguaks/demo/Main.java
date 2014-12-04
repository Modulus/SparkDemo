package com.eguaks.demo;

import static spark.Spark.*;

/**
 * Created by Modulus on 04.12.2014.
 */
public class Main {
    public static void main(String[] args) {
        get("/", (req, res) -> "Hello World");

        post("/", (req, res) -> "Post called!");


        put("/", (req, res) -> "Post called!");

        delete("/", (req, res) -> "Delete called!");
    }
}
