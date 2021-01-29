/*
Kasun De Zoysa @ UCSC
*/
import java.io.Serializable;


//Add the first Comment

//Added the second Comment


public class Car implements Serializable{
 private String no;
 private int year;

public Car(String n,int y){
 no=n;year=y;
}
public void getNo(){
 System.out.println("Reg. No: "+no);
}
public void getYear(){
 System.out.println("Reg. Year: "+year);
}
}
