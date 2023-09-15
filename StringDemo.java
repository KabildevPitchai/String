package String;

public class StringDemo {

	public static void main(String[] args) {
		StringDemo obj=new StringDemo();
		
		 //obj.length();
	    //obj.concat();
	    //obj.Uppercase();'
	    //obj.Lowercase();
//	    obj.Striplead();
//      obj.striptrail();
//	    obj.trim();
//	    obj.contains();
//	    obj.subString();
//		obj.startswith();
//		obj.endswith();
		obj.split();
//		obj.replace();
//		obj.charArray();
//		obj.valueOf();
//		obj.Blank();
//		obj.empty();
//		obj.IndexOf();
//		obj.LastIndexOf();
		obj.equals();
		obj.equalsignorecase();
		obj.replaceFirst();
		obj.replaceAll();
		obj.CompareTo();
		obj.CompareToIgnoreCase();
	    
	  }
	 private void CompareToIgnoreCase() {
		 String s1 = "kiran";
		  String s2 = "kiran";
		  System.out.println(s1.compareToIgnoreCase(s2));//whatever u give in input get the diff between the character different ascii value in output
	}
	private void CompareTo() {
		 String s1 = "chandru";
		  String s2 = "Chandru";//compare two values character ascii value difference shows in output
		  System.out.println(s1.compareTo(s2));		 
	}
	private void replaceAll() {
		 String st="doni is indian cricketer & doni is a business man";
		 st=st.replaceAll("doni", "dhoni");
		 System.out.println(st);
	}
	private void replaceFirst() {
		String st="Kabildev";
		st = st.replaceFirst("K", "k");
		System.out.println(st);
		
	}
	private void equalsignorecase() {
		 String st= "kabildev";
		 String st2="kabildev";
		 System.out.println(st.equalsIgnoreCase(st2));
		 }
	private void equals() {
		String st= "kabildev";
		String st2="kabildev";
		 System.out.println(st.equals(st2));
		
	}   

	private void LastIndexOf() {
		String str="Kabildev";
		int index=str.lastIndexOf("l");
		System.out.println(index);
	}



	private void IndexOf() {
		String str="Kabildev";
		int index=str.indexOf('d');
		System.out.println(index);
	}



	private void empty() {
		  String a="";
		  System.out.println(a.isEmpty());//given String is empty it returns true orelse False
	}

	private void Blank() {
		  String a="  ";
		  System.out.println(a.isBlank());//the given input is blank it returns true orelse False
	}
	private void valueOf() {
		// TODO Auto-generated method stub
		
	}
	private void charArray() {
		  
		  
	}

	private void replace() {
		  String str="kabildev Loves Karthika";
		  System.out.println(str);
		  str=str.replace("Karthika","Kuyil");
		  System.out.println(str);
	}

	private void split() {
		  String str="kabildev Loves Karthika Kanmani";//given input (" ")will delete other all words are printed  like single word one by one
		  String s[]=str.split(" ");
		  for(int i=0;i<s.length;i++) {
			  System.out.println(s[i]);
		  }
	}

	private void endswith() {
		  String str="kabil dev";
		  boolean ends=str.endsWith("dev");//it given input is there in String shows true or false
		  System.out.println(ends);
	}

	private void startswith() {
		  String str="kabil dev";
		  boolean starts=str.startsWith("kabil");//it given input is there in String shows true or false
		  System.out.println(starts);
	}

	private void subString() {
		  String str="Hi how r u";
		  str=str.substring(3,7);//we give one index value-2  it show after the value of index output 
		  System.out.println(str);//if we give 2 value means it gives in between chars are shown
	}

	private void contains() {
		String str="     Hey dear how r u    ";
		  System.out.println(str.length());
		  System.out.println(str.contains("dear"));//given String is having the Keyword means its Returns Boolean
	}

	private void trim() {
		 String str="     Hey dear how r u    ";
		  System.out.println(str.length());
		  str=str.trim();//trimming the spaces in intial & final spaces of given String
		  System.out.println(str.length());
				
	}

	private void striptrail() {
		  String str="     Hey dear how r u    ";
		  System.out.println(str.length());
		  str=str.stripTrailing();//
		  System.out.println(str.length());//remove last spaces
	}

	private void Striplead() {
		  String str="     Hey dear how r u";
		  System.out.println(str.length());
		  str=str.stripLeading();
		  System.out.println(str.length());//remove first spaces 
	}

	private void Lowercase() {
	    String name = "KABILDEV";
	    System.out.println(name.toLowerCase());
	    
	    
	  }

	  private void Uppercase() {
	    
	    String name = "kabildev";
	    System.out.println(name.toUpperCase());
	  }

	  private void concat() {
	    String name = "Kabildev";
	    String name1 = "Loving forever ";
	    String name2 = "Karthika";
	    
	    System.out.println(name+name1+name2); // concat 
	    
	  }

	  private void length() {
	    
	  String name = "Kabildev";
	  System.out.println(name.length());
	    
	    
	  }

	}
		

	


