import java.lang.String;
public class Car{
int price;
String brand;
Car(int price,String brand)
{
this.price=price;
this.brand=brand
}
void setData(int price)
{
return price;
}
void setData(String brand)
{
return brand;
}
public String toString
{
return brand+" "price";
}
boolean object(object a){
Car c3 = (Car)a;
if(this.price==c3.price && this.brand.equals(c3.brand)
return true;
return false;
}
}
class Constructor
public static void main(String[]args){
Car c1=new Car(100000,"BMW");
Car c2=new Car(200000,"HYO");
Car c3=new Car(300000,"BMW");
Car c4=c3;
System.out.println(c1);
System.out.println(c2);
System.out.println(c3);
System.out.println(c4);
System.out.println(c4.equals(c3));
}
}





