public class Rev_Word_Str 
{
	public static void main(String[] args) {
		String s="I Love my India";
		char ch[]=s.toCharArray();
		String str="";
		for(int i=ch.length-1;i>=0;i--)
		{
			int f=i;
			while(i>=0 && ch[i]!=' ')
			{
				i--;
			}
			int l=i+1;
			while(l<=f)
			{
				str=str+ch[l];
				l++;
			}
			if(i>=0)
				str=str+ch[i];
		}
		System.out.println(str);
	}
}
