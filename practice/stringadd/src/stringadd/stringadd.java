package stringadd;

public class stringadd {

	static String addstring(String original,String add,int index)
	{
		String newstr = new String();
		for(int i=0;i<original.length();i++)
		{
			newstr=newstr+original.charAt(i);
			
			if(i==index)
			{
				newstr=newstr+add;
			}
		}
		return newstr;
	}
	public static void main(String[] args) {
		String original = "iacsd dac";
		String add = "PG ";
		int index = 5;
		
		System.out.println(addstring(original,add,index));
	}

}
