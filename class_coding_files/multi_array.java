public class multi_array
    {
        public static void main(String[] args)
        {
            String [][] RESTAURANTS = {
            	{"Portillos", "Giordanos", "Grand Lux Cafe"},
            	{"Five Guys","Lou Malnati's", "The Purple Pig" },
            	{"Shake Shack", "Beggars Pizza", "Big Bowl" }
              };
              
              for(var i = 0; i < RESTAURANTS.length; i++){
                  //Inner Loop output the column
                  for(var x = 0; x < RESTAURANTS.length; x++){
                      System.out.println(RESTAURANTS[i][x]);
                  }
              }
        }
    }