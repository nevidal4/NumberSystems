import java.io.*;
import java.util.Scanner;
public class Binary{
 String bin;
 StringBuilder hex=new StringBuilder(8);
 int dec=0;
 PrintWriter printie;
 Scanner scannie=new Scanner(System.in);
 /**Constructor for objects of class Binary
 */
 public Binary(PrintWriter pw){
  printie=pw;
 }
 public void binToDec(){
  inBin();
  toDec();
  outDec();
 }
 public void binToHex(){
  inBin();
  toHex();
  outHex();
 }
 private void inBin(){
  System.out.print("Enter 32 bit binary:\n");
  bin=scannie.next();
  printie.print(bin+"\n");
 }
 private void toHex()throws StringIndexOutOfBoundsException{
  String section;
  for(int i=0;i*4<bin.length();++i){
   section=bin.substring(i*4,(i+1)*4);
   if(section.equals("0000"))
    hex.append('0');
   else if(section.equals("0001"))
    hex.append('1');
   else if(section.equals("0010"))
    hex.append('2');
   else if(section.equals("0011"))
    hex.append('3');
   else if(section.equals("0100"))
    hex.append('4');
   else if(section.equals("0101"))
    hex.append('5');
   else if(section.equals("0110"))
    hex.append('6');
   else if(section.equals("0111"))
    hex.append('7');
   else if(section.equals("1000"))
    hex.append('8');
   else if(section.equals("1001"))
    hex.append('9');
   else if(section.equals("1010"))
    hex.append('A');
   else if(section.equals("1011"))
    hex.append('B');
   else if(section.equals("1100"))
    hex.append('C');
   else if(section.equals("1101"))
    hex.append('D');
   else if(section.equals("1110"))
    hex.append('E');
   else
    hex.append('F');
  }
  for(int i=hex.length();i<8;++i)
   hex.insert(0,"0");
 }
 private void toDec(){
  String temp=new StringBuilder(bin).reverse().toString();
  for(int exp=0;exp<temp.length();++exp){
   if(temp.charAt(exp)=='1'){
    dec+=Math.pow(2,exp);
   }
  }
 }
 private void outHex(){
  System.out.print(hex+"\n");
  printie.print(hex+"\n");
  hex.delete(0,hex.length());
 }
 private void outDec(){
  System.out.print(dec+"\n");
  printie.print(dec+"\n");
  dec=0;
 }
}