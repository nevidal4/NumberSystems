import java.io.*;
import java.util.Scanner;
/**Class for Decimal numbers
 * @author Andrews Samuel
 * @version 2/3/17
 */
public class Decimal{
 StringBuilder hex=new StringBuilder(8);
 StringBuilder bin=new StringBuilder(40);
 int dec=0;
 PrintWriter printie;
 Scanner scannie=new Scanner(System.in);
 /**
  */
 public Decimal(PrintWriter pw){
  printie=pw;
 }
 public void decToBin(){
  inDec();
  toBin();
  outBin();
 }
 public void decToHex(){
  inDec();
  toHex();
  outHex();
 }
 private void inDec(){
  System.out.print("Enter a positive integer:\n");
  printie.print("Enter a positive integer:\n");
  dec=scannie.nextInt();
  printie.print(dec+"\n");
 }
 private void toBin(){
  int num=dec;
  int remainder;
  while(0<num){
   remainder=num%2;
   bin.append(""+remainder);
   num/=2;
  }
  for(int i=bin.length();i<32;++i)
   bin.append("0");
  for(int i=0;i<bin.length();++i){
   if(i%5==0)
    bin.insert(i," ");
  }
  bin.reverse();
  }
 private void toHex(){
  int num=dec;
  int remainder;
  while(0<num){
   remainder=num%16;
   if(remainder<10)
    hex.append(""+remainder);
   else{
    switch(remainder){
     case 10:hex.append("A");break;
     case 11:hex.append("B");break;
	 case 12:hex.append("C");break;
	 case 13:hex.append("D");break;
	 case 14:hex.append("E");break;
	 case 15:hex.append("F");break;
    }
   }
   num/=16;
  }
  for(int i=hex.length();i<8;++i)
   hex.append("0");
  hex.reverse();
 }
 private void outBin(){
  System.out.print(bin+"\n");
  printie.print(bin+"\n");
  bin.delete(0,bin.length());
 }
  private void outHex(){
  System.out.print(hex+"\n");
  printie.print(hex+"\n");
  hex.delete(0,hex.length());
 }
}