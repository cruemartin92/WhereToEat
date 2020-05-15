import java.util.Date;

public class Restaurant{

    private String name;
    private String type;
    private String city;
    private boolean fastFood;
    private int rating;
    private Date lastVisited;

    Restaurant(String name, String type, String city, boolean fastFood, int rating, Date lastVisited ){
        this.name = name;
        this.city = city;
        this.type = type;
        this.fastFood = fastFood;
        this.rating = rating;
        this.lastVisited = lastVisited;

    }


    //Getters and Setters
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setCity(String city){
        this.city =  city;
    }

    public String getCity(){
        return this.city;
    }

    public void setFastFood(boolean fastFood){
        this.fastFood = fastFood;
    }

    public boolean getFastFood(){
        return this.fastFood;
    }

    public void setRating(int rating){
        this.rating = rating;
    }

    public int getRating(){
        return this.rating;
    }

    public void setDate(Date lastVisited){
        this.lastVisited = lastVisited;
    }

    public Date getDate(){
        return this.lastVisited;
    }

}
