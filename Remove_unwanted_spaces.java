package String;

public class Remove_unwanted_spaces {
 
	public static void main(String[] args) {
		Remove_unwanted_spaces r=new Remove_unwanted_spaces();
//		r.remove_spaces();
		r.Short_method_remove_space();
		}

	private void Short_method_remove_space() {
		String s="How   are      you";
		boolean space=true;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				System.out.println(s.charAt(i));
				space=false;
			}
			else if(space==false) {
				System.out.println(s.charAt(i));
				space=true;
			}
		}
		
	}

	private void remove_spaces() {
		String s="How    are   you";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ')
			{
				System.out.println(s.charAt(i));
			}
			else {
				System.out.println(s.charAt(i));
				for(int j=i;j<s.length();j++) 
				{
				 	if(s.charAt(j)==' ') 
				 	{
						continue;
					}
					else 
					{
						i=j-1;
						break;
					}
				}
			}
			
		}
	} 

}
