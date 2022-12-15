public class Sub_String 
{
	public static void main(String[] args) {
		String s="abcd";//a,b,c,d,ab,bc,cd,abc,bcd,abcd
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
			for(int j=i+1;j<ch.length;j++)
			{
				System.out.print(ch[i]+""+ch[j]+" ");
				for(int k=j+1;k<ch.length;k++)
				{
					System.out.print(ch[i]+""+ch[j]+""+ch[k]+" ");
					break;
				}
				break;
			}
		}
		System.out.print(s);
	}
}
