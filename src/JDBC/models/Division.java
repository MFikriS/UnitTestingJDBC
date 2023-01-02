package JDBC.models;

public class Division {
    private int Id;
    private String Name;
    private int regionId;

    public void setId(int Id){
        this.Id = Id;
    }

    public int getId(){
        return this.Id;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getName(){
        return this.Name;
    }

    public void setRegionId(int regionId){
        this.regionId = regionId;
    }

    public int getRegionId(){
        return this.regionId;
    }
}
