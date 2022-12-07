package com.devcontainer;

import static spark.Spark.*;
import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Autos obj=new Autos();
        obj.setName("Subaru WRX STI");
        obj.setYear(2017);
        Cars objCars = new Cars();
        objCars.addAutos(obj);

        get("/hello", (req, res) -> {
            res.type("application/json");
            JSONObject jsonObject=new JSONObject(obj);
            return "{\"message\":\"Custom 404\"}";
        });
        post("/hello", (req, res) -> {;
        res.type("application/json");
        return req.body();
    });
}}

