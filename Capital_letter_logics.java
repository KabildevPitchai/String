package String;

public class Capital_letter_logics {

	public static void main(String[] args) {
		Capital_letter_logics obj=new Capital_letter_logics();  
		
		obj.chatAT();
        obj.Lower();
        obj.upper();
        obj.one_letter_one_letter_uppercase();
        obj.middle_letter_uppercase();
		obj.space_remove_program();
        obj.first_letter_cap_after_space();  
      }
      
      private void first_letter_cap_after_space()
      {
        String s = "subramani nivetha suvetha";
        
        for (int i = 0; i < s.length(); i++) 
        {
          char ch = s.charAt(i);      
            if(i==0) 
            {
            if(ch>='a' && ch<='z')
            System.out.print((char)(ch-32));
            }

          else if(ch == ' ')
          {
            
            System.out.print(ch);
          
            i++;
          
           ch = s.charAt(i);
          if(ch>='a' && ch<='z')
            
            System.out.print((char)(ch-32));}
          else
            
            System.out.print(ch);
      }  
        System.out.println();
    }

      private void space_remove_program() {
        {
          String s = "subramani nivetha suvetha";
          
          for (int i = 0; i < s.length(); i++) 
          {
            char ch = s.charAt(i);      
              if(i==0) 
              {
              if(ch>='a' && ch<='z')
              System.out.print((char)(ch-32));
              }

            else if(ch == ' ')
            {
              i++;
            
             ch = s.charAt(i);
            if(ch>='a' && ch<='z')
              
              System.out.print((char)(ch-32));}
            else
              
              System.out.print(ch);
        }  
          
      }
        System.out.println();
      }

        
      

      private void middle_letter_uppercase() {
        
              String s = "subramanis";
        
        for (int i = 0; i < s.length(); i++) 
        {
          char ch = s.charAt(i);
          
          if(i == 0|| i ==s.length()-1 || i == s.length()/2)
            
          {
            if(ch>='a' && ch<='z')
          
            System.out.print((char)(ch-32));
          
          }
          else
            
            System.out.print(ch);
          
        }
      
        System.out.println();
      }

      private void one_letter_one_letter_uppercase() {
        

        String s = "subramani";
        
        for (int i = 0; i < s.length(); i++) 
        {
          char ch = s.charAt(i);
          
          if(i % 2 == 0)
            
          {
            if(ch>='a' && ch<='z')
          
            System.out.print((char)(ch-32));
          
          }
          else
            
            System.out.print(ch);
          
        }
        System.out.println();
      }

      private void upper() {

        String s = "abcd 1234 !@#";
        
        for (int i = 0; i < s.length(); i++) 
        {
          char ch = s.charAt(i);
          
          if(ch>='a' && ch<='z')
            
            System.out.print((char)(ch-32));
          
          else
            
            System.out.print(ch);
          
        }
        System.out.println();
      }

      private void Lower() {
        
        String s = "ABCD 1234 !@#";
        
        for (int i = 0; i < s.length(); i++) 
        {
          char ch = s.charAt(i);
          
          if(ch>='A' && ch<='Z')
            
            System.out.print((char)(ch+32));
          
          else
            
            System.out.print(ch);
          
        }
        System.out.println();
      }

      private void chatAT() {
        
        String  S = "ABCD";
        
        char ch = S.charAt(0);
        
        System.out.println(ch);
        
        System.out.println((char) (ch+32));
        
  }
      

	}


