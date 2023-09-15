package String;

public class Striptrailing {

	public static void main(String[] args) {
		Striptrailing s=new Striptrailing();
		s.Strip_trailing();//remove last ending space form given String
	}
		private void Strip_trailing() {
	        
		      
		      String  name = "Subramani   ";
		      
		      int last = name.length()-1;
		      
		      for(int i = name.length()-1 ; i>=0; i--)
		      {
		        if(name.charAt(i) != ' ')
		        {
		          last = i;
		          
		          break ;
		        }
		      }
		        for(int i=0; i<=last; i++)
		        {
		          System.out.print(name.charAt(i));
		        }
		        
		      }
		        
	}


