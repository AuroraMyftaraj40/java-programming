package day32_arrayas_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String catTypes = "bengal cat tabby cat persian cat no cat here";
         String[] catsArray = catTypes.split("cat");
        System.out.println("Number of cats: "+ (catsArray.length-1));

        for(String type : catsArray){
            System.out.println(type);
        }









            }
        }

