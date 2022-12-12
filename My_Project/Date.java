package My_Project;
import java.util.Scanner;
public class Date {
	int dd,mm,yy;
	int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	String dName[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Date(DD/MM/YYYY) ");
		int d1=sc.nextInt();
		int m1=sc.nextInt();
		int y1=sc.nextInt();
		Date dt1=new Date(d1,m1,y1);
		System.out.println("Enter 2nd Date(DD/MM/YYYY) ");
		int d2=sc.nextInt();
		int m2=sc.nextInt();
		int y2=sc.nextInt();
		Date dt2=new Date(d2,m2,y2);
		System.out.println("First Date "+dt1);
		System.out.println("Second Date "+dt2);
		int day=dt1.noOfDays()+dt2.noOfDays();
		System.out.println("Number of Days between these two Date is "+day);
		System.out.println(dt1+" Day Name is "+dt1.getDayName());
		System.out.println(dt2+" Day Name is "+dt2.getDayName());
	}

		
		public Date(int dd,int mm,int yy)
		{
			this.dd=dd;
			this.mm=mm;
			this.yy=yy;
			if(yy%4==0 && yy%100!=0 || yy%400==0)
				month[2]=29;
		}
		public int noOfDays()
		{
			int day=dd;
			int y=yy-1;
			day=day+y*365;
			day=day+y/4-y/100+y/400;
			for(int i=1;i<mm;i++)
			{
				day=day+month[i];
			}
			return day;
		}
		public String getDayName()
		{
			return dName[noOfDays()%7];
		}
		public String toString()
		{
			return dd+"/"+mm+"/"+yy;
		}
}
