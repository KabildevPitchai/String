package String;

public class Letter_printing_using_String {

	public static void main(String[] args) {
		Letter_printing_using_String l=new Letter_printing_using_String();
		l.Letter_printing();
		l.letter_printing_Anothermethod();
	}

	private void letter_printing_Anothermethod() {
		String s="A6B4";
	
		for (int i = 0; i < s.length()-1; i+=2) {
			  
			  char first = s.charAt(i);//A6B4
			  
			  char num = s.charAt(i+1);//6 4
			  
			  for (int ch = '1'; ch <=num; ch++) 
			  {
			    System.out.print(first+" ");
			  }
		}
		
	}

	private void Letter_printing() {
		String s="A6B4";
			char letter=s.charAt(0);//A
			char num=s.charAt(1);//6
			for(char ch='1';ch<=num;ch++) {
				System.out.print(letter+" ");
			}
			System.out.println();
		}
	}


