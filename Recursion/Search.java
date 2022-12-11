public class Search
{
    public static void main(String[] args)
    {
	int ar[]={12,25,35,48,56,75,95};
	int n=search(ar,35);
	if(n==-1)
	     System.out.println("Not Pressent");
	else
	     System.out.println("Present at "+n);
    }
    public static int search(int a[],int ele)
    {
	return search(a,ele,0);
    }
    public static int search(int a[],int ele,int i)
    {
	if(i==a.length)
	      return -1;
	if(a[i]==ele)
	      return i;
	return search(a,ele,i+1);
    }
}