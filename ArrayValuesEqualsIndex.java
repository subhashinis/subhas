
import java.util.Scanner;
class  ArrayValuesEqualsIndex{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int times=0;
int n=0;
System.out.println("Enter the number of array Elements:");
n=s.nextInt();
System.out.println("Enter the array elements:");
int arr[]=new int[n];
for(int i=0;i<arr.length;i++){
arr[i]=s.nextInt();}
for(int i=0;i<arr.length;i++){
if(i==arr[i]){
System.out.println(i+" index has same value as array "+arr[i]);
times++;}}
if(times==0){
System.out.println(" No array values as same as index");
}
}}
