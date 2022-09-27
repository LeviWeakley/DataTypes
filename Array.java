
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array
{
    public static void main(String[] args) {
        String[] strArray={"Alpha","Bravo","Charlie", "Delta","Echo",};
        for (int i=0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        for(String value:strArray){
            System.out.print(value + " ");
        }
        System.out.println(" ");
        for(String value : strArray){
            System.out.print(value + "-");
        }
    }
}

