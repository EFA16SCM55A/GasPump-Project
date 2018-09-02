package Datastore;
import Factory.*;

public abstract class DataStore {
public static Factory af;
int total;
int total1;
float total2;
public int cash;
public int Pprice;
public int Sprice;
public int Rprice;
public int price;
public float tempa1;
public float tempb1;
public int tempc;
public int tempa2;
public int tempb2;
float Sprice1;
float Pprice1;
public  int type;

public float gettempb1() {
return tempb1;
}
public float gettempa1() {
return tempa1;
};
public float gettempb11() {
return tempb1;
}
public int gettempa2() {
return tempa2;
}
public int gettempb2() {
return tempb2;
}
public int gettempc1() {
return tempc;
}

public void setprice(int price1) {
	price=price1;
}
public void setRprice2(int temp1) {
	Rprice=temp1;
}
public void setSprice2(int price) {
	Sprice=price;

}
public void setPprice2(int price) {
	Pprice=price;
}

public int getprice() {
return price;
}
public int getRprice() {
return Rprice;
}
public int getPprice() {
return Pprice;
}
public int getSprice() {
return Sprice;
}
public float getPprice1() {
return Pprice;
}
public void setSprice1(float b) {
Sprice1=b;
}
public void setPprice1(float c) {
Pprice1=c;
}
public float getSprice1() {
return Sprice;
}
public int gettempc() {
return 0;
}
public float gettempd() {
return 0;
}
public int getc() {
return 0;
}
public void setc(int c) {
}
public float getd() {
return 0;
}
public void setcash(int cash) {
}
public float getprice1() {
return 0;
}
public int getprice2() {
return 0;
}
public void setprice(float price) {
}
public void setprice2(float price) {
}
public int gettempG() {
return 0;
}
public int gettempL() {
return 0;
}
public int getG() {
return 0;
}
public int getL() {
return 0;
}
public void setG(int c) {
}
public void setL(int c) {
}
public int gettotal() {

return total1;
}
public float gettotal2() {
return total2;
}
public void settotal(float t) {
	total2=t;
}

public void settotal2(int t) {
	total2=t;

}
public void setdata1(int t) {
	type=t;

}
public int getdata(){
	return type;
}
public int getcash() {
	// TODO Auto-generated method stub
	return cash;
}
}

