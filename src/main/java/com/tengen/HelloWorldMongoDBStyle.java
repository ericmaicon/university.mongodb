package com.tengen;

import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Created by ericmaicon on 01/02/15.
 */
public class HelloWorldMongoDBStyle {

    public static void main(String[] args) throws UnknownHostException {
        MongoCredential credential = MongoCredential.createMongoCRCredential("dev_plexisoft", "course", "Impenetrability_fretsaws".toCharArray());

        MongoClient client = new MongoClient(new ServerAddress("localhost", 27017), Arrays.asList(credential));

        DB database = client.getDB("course");
        DBCollection collection = database.getCollection("hello");

        DBObject document = collection.findOne();
        System.out.println(document);
    }
}
