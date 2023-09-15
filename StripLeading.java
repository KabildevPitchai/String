package String;

public class StripLeading {

	public static void main(String[] args) {
		String s="   How Are You";//remove the Start spaces by using Stripleading method
		boolean first=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '&& first==false) 
			{
				continue;
			}
			else
			{
				first=true;//imp for space factor
				System.out.println(s.charAt(i));
			}
		}
	}

}
