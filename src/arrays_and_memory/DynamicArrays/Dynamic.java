package arrays_and_memory.DynamicArrays;

import java.util.ArrayList;

public class Dynamic {
    public static void main(String[] args) {
        String[] array = new String[3]; //linear array/static array with fixed size

        ArrayList<String> DynamicArray = new ArrayList<String>();
        DynamicArray dynamicArray = new DynamicArray(7);//cap = 10 default
        System.out.println(dynamicArray.capacity);



    }
    static boolean containsAddress(String[] locations, String streetName){
        for(int i = 0; i< locations.length; i++){
            if(streetName.equals(locations[i])){
                return true;
            }
        }
        return false;
    }
    static String findAddress(String[] streets, String address){
        for(int i = 0; i< streets.length; i++){
            if(address.equals(streets[i])){
                return "Street: " + address + " found in Element: " + i;
            }
        }
        return "";
    }
}
