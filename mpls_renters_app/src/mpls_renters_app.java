public class mpls_renters_app {
    public static void main(String[] args) throws Exception {
         //Allow the end user to create a Apartment or Profile
        profile profileOne = new profile(); //Creating an object instance - Instantiation

        profileOne.setName("Raul");
        profileOne.setEmail("rtejada@luc.edu");
        profileOne.setPreferredRegionOfCity("West");

        //Calling overloaded constructor that defines three parameters
        profile profileTwo = new profile("Joanne", "JMolas@luc.edu", "South");

        //Invoke the default constructor
        profile defaultConstructor = new profile();

        System.out.println(profileOne);
        System.out.println(profileTwo);
        System.out.println(defaultConstructor);


        System.out.println(profileOne.getEmail());
    }
}
