package com.myprograms.app;

//Json imports
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;


public class App {

    public static void main( String[] args ){
    
    JSONParser parse = new JSONParser();
    
    try{
        Object obj = parse.parse(new FileReader("restaurants.json"));

        JSONObject jo = (JSONObject) obj;

        JSONArray restaurants = (JSONArray) jo.get("restaurant list");

        Iterator itr = restaurants.iterator();

        Iterator<Map.Entry> itr2; 

        //int count = 0;
        while(itr.hasNext()){

            itr2 = ((Map) itr.next()).entrySet().iterator();
            
            while(itr2.hasNext()){
                Map.Entry pair = itr2.next();
                //System.out.println(pair.getKey() + " : " + pair.getValue());

                JSONObject info = (JSONObject)pair.getValue();

                System.out.println(". name: " + (String) info.get("name"));
                 //count++;
            }

        }

        


    } catch(Exception e){
        e.printStackTrace();
    }


    }

}
