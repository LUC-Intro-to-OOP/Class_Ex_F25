public class profile {
    //Class properties
    private String name;
    private String email;
    private String preferredRegionOfCity;
    private String category;


    //Default Constructor
    public profile(){
        this.name = "N/A";
        this.email = "JDoe@email.com";
        this.preferredRegionOfCity = "N/A";
    }

    //Overload the default constructor
    public profile(String name, String email, String preferredRegion){
        this.name = name;
        this.email = email;
        preferredRegionOfCity = preferredRegion;
        assignCategory();
    }

    //Setter methods
    public void setName(String aName){
        name = aName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPreferredRegionOfCity(String region){
        preferredRegionOfCity = region;
    }

    //Getter Methods
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPrefferedRegion(){
        return preferredRegionOfCity;
    }

    //Working method
    private void assignCategory(){
        //algorithm
    }

    @Override
    public String toString(){
        return String.format(name + " " + email + " " + preferredRegionOfCity);
    }

}
