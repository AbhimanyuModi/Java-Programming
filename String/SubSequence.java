public class SubSequence 
{
	public static void main(String[] args) {
		String s="abcd";//a,b,c,d,a,ab,ac,ad,bc,bd,cd,abc,acd,bcd,abcd
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			System.out.print(ch[i]+" ");
			for(int j=i+1;j<s.length();j++)
			{
				System.out.print((char)(ch[i])+""+(char)(ch[j])+" ");
				for(int k=j+1;k<s.length();k++)
					System.out.print((char)(ch[i])+""+(char)(ch[j])+(char)(ch[k])+" ");
			}
		}
		System.out.println(s);
	}
}
