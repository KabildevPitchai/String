package String;

public class Reverse_name_interchange {
	
	String s="Kabil Dev";
	String s2=" ";
	String s3=" ";
	
	public static void main(String[] args) {
		Reverse_name_interchange r=new Reverse_name_interchange();
		r.name_reverse("");//Kabil Dev into Dev Kabil
		
		
	}

	private void name_reverse(String name) {
		
		
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)!=' ') {
				s2=s2+s.charAt(i);
			}
			else {
				name_reverse(s2);
				s2=" ";
			}
		}
		name_reverse(s2);
		System.out.println(s3);
		String s2=" ";
		for(int i=name.length()-1;i>=0;i--) {
			s3=s3+name.charAt(i);
		}
		s3=s3+" ";

		
		
	}

}
