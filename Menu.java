import java.io.*;
import java.util.Scanner;
/**Write a description of class Menu here.
 * @author Andrews Samuel 
 * @version 2/3/17
 */
public class Menu{
    PrintWriter printie;
    int selector;
    Scanner scannie=new Scanner(System.in);
    /**Constructor for objects of class Menu
     */
    public Menu(PrintWriter pw)
    {
     printie=pw;
     selector=0;
    }
    public void display(){
     System.out.print("To convert a decimal to binary enter 1\nTo convert a decimal to hexidecimal enter 2\n"
                     +"To convert a binary to decimal enter 3\nTo convert a binary to hexidecimal enter 4\n"
                     +"To convert a hexadecimal to decimal enter 5\nTo convert a hexadecimal to binary enter 6\n"
                     +"If you are all done, enter 7\n");
    }
    public void setSelection(){
     selector=scannie.nextInt();
     printie.print(selector+"\n");
    }
    public int getSelection(){
     return selector;
    }
}