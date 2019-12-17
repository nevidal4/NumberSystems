import java.io.*;
import java.util.Scanner;
/**Class for Hexadecimal numbers
 * @author Andrews Samuel
 * @version 2/3/17
 */
public class Hexadecimal{
 String hex;
 StringBuilder bin=new StringBuilder(32);
 int dec=0;
 PrintWriter printie;
 Scanner scannie=new Scanner(System.in);
 /**Constructor for objects of class Hexadecimal
  */
 public Hexadecimal(PrintWriter pw){
  printie=pw;
 }
 public void hexToDec(){
  inHex();
  toDec();
  outDec();
 }
 public void hexToBin(){
  inHex();
  toBin();
  outBin();
 }
 private void inHex(){
  System.out.print("Enter hexadecimal number:\n");
  hex=scannie.next().toUpperCase();
  printie.print(hex+"\n");
 }
 private void toBin(){
  for(int i=0;i<hex.length();++i){
   switch(hex.charAt(i)){
    case '0':bin.append("0000 ");break;
    case '1':bin.append("0001 ");break;
    case '2':bin.append("0010 ");break;
    case '3':bin.append("0011 ");break;
    case '4':bin.append("0100 ");break;
    case '5':bin.append("0101 ");break;
    case '6':bin.append("0110 ");break;
    case '7':bin.append("0111 ");break;
    case '8':bin.append("1000 ");break;
    case '9':bin.append("1001 ");break;
    case 'A':bin.append("1010 ");break;
    case 'B':bin.append("1011 ");break;
    case 'C':bin.append("1100 ");break;
    case 'D':bin.append("1101 ");break;
    case 'E':bin.append("1110 ");break;
    case 'F':bin.append("1111 ");break;
   }
  }
  for(int i=bin.length();i<40;i+=5)
   bin.insert(0,"0000 ");
 }
 private void toDec(){
  String temp=new StringBuilder(hex).reverse().toString();
  for(int exp=0;exp<temp.length();++exp){
   if((int)temp.charAt(exp)<10)
    dec+=(int)temp.charAt(exp)*Math.pow(16,exp);
   else{
    switch(temp.charAt(exp)){
     case 'A':dec+=10*Math.pow(16,exp);break;
     case 'B':dec+=11*Math.pow(16,exp);break;
     case 'C':dec+=12*Math.pow(16,exp);break;
     case 'D':dec+=13*Math.pow(16,exp);break;
     case 'E':dec+=14*Math.pow(16,exp);break;
     case 'F':dec+=15*Math.pow(16,exp);break;
    }
   }
  }
 }
 private void outBin(){
  System.out.print(bin+"\n");
  printie.print(bin+"\n");
  bin.delete(0,bin.length());
 }
  private void outDec(){
  System.out.print(dec+"\n");
  printie.print(dec+"\n");
  dec=0;
 }
}