package week1.day1;

public class Mymobile {
public void makeCall(String mobileModel,float mobileWeight)
{  
	System.out.println(mobileModel);
	System.out.println(mobileWeight);
}
public void sendMgs(boolean fullCharged,int mobilecost)
{
	System.out.println(fullCharged);
	System.out.println(mobilecost);
}
public static void main(String[] args) {
	Mymobile mob=new Mymobile();
	mob.makeCall("apple13",250f);
	mob.sendMgs(true,50000);

}
}
