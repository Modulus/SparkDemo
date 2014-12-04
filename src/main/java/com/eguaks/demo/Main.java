package com.eguaks.demo;

import static spark.Spark.get;

/**
 * Created by Modulus on 04.12.2014.
 */
public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
