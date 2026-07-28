public class Stringmethods{
    public static void main(String []args){
        String name = "Zhea N";
        int length = name.length();
        char letter = name.charAt(0);
        int index =name.indexOf("h");
        int lastIndex= name.lastIndexOf("N");

        /*name = name.toLowerCase();*/
        /*name=name.toUpperCase();*/
        name=name.trim();
        name = name.replace("e", "h");


        System.out.println(name);
    }
}