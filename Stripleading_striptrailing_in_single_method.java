package String;

public class Stripleading_striptrailing_in_single_method {

	public static void main(String[] args) {
		Stripleading_striptrailing_in_single_method s=new Stripleading_striptrailing_in_single_method();
		s.stripleading_striptrailing_same_method();//front & back spaces removed by strip lead&trail method using in single method
	}
	 private void stripleading_striptrailing_same_method() {
	      String s = "   How Are you   ";
	        int start = 0, end = s.length()-1; 
	        boolean first = false, last = false; 
	        for(int i=start; i<s.length();i++)
	        {
	          if(s.charAt(i)==' ' && first == false)
	          {
	            
	          }
	          else
	          {
	            first = true; 
	            start = i; 
	          }
	          if(s.charAt(end)==' ' && last == false)
	          {
	            end--; 
	          }
	          else {
	            last = true; 
	          }
	          if(first==true && last == true)
	          {
	            System.out.println(end+" => end values");
	         
	            for(int j=start; j<=end;j++)
	              System.out.print(s.charAt(j));
	            break; 
	          }
	        }
	      }

}
