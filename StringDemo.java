package Learn_String;

public class StringDemo {

	public static void main(String[] args) {
		//String
		StringDemo sd=new StringDemo();
		String s="kabil"; // String only can Did the work without using "New keyword"
		String s2=new String("kabil");
		
		
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s));
//		System.out.println(System.identityHashCode(sd));
		
		String lastMovie1="bigil";
		String lastMovie2="mersal";
	 	String lastMovie3="don";
		String lastMovie4="don";
		String lastMovie5="king";
		String lastMovie6="don";
		String lastMovie7="don";

		System.out.println(System.identityHashCode(lastMovie1));
		System.out.println(System.identityHashCode(lastMovie2));
		System.out.println(System.identityHashCode(lastMovie3));
		System.out.println(System.identityHashCode(lastMovie4));
		System.out.println(System.identityHashCode(lastMovie5));
		System.out.println(System.identityHashCode(lastMovie6));
		System.out.println(System.identityHashCode(lastMovie7));
		
		String name1="Kabil";
		String name2=new String ("Asha");
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		String name="Kabildevpitchai";
		int count=0;
		System.out.println(name.length());
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a')
				count++;
			System.out.println(name.charAt(i));
		}
		System.out.println(name);
		System.out.println(count);
		System.out.println(name.indexOf('i'));
		
		/*System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(4));*/
		
		//Comparing TWO NAMES
		
		String name3="kabil dev";
		String name4=" Kabildev";
		System.out.println(name3.length());
		for(int i=0;i<name3.length();i++) {
			if(name3.charAt(i)=='a');
			count++;
			System.out.println(name3.charAt(i));
		}
		System.out.println(name3.compareTo(name4));//compare both 
		System.out.println(name3.compareToIgnoreCase(name4));
		System.out.println(name3.concat("pitchai"));//concat is used add some text with STRING to use it
		//name=name.concat("abc");
		System.out.println(name.contains("bil"));//given text is present in the STRING its shows TRUE
		System.out.println(name3.endsWith("dev"));//check the word is present in the STRING shows TRUE
		System.out.println(name3.equals(name4));//Equals the both STRINGS is it both are equal it shows TRUE
		System.out.println(name3.equalsIgnoreCase(name4));
		System.out.println(name3.lastIndexOf('a'));//use single text using single quote('')
		System.out.println(name3.lastIndexOf("ism"));//use more than two text using double quotes("")
		System.out.println(name3.replace('k', 'm'));//k letter change into m to use replace method
		System.out.println(name3.substring(6));
		System.out.println(name3.substring(5, 8));
		
		char[] ch=name3.toCharArray();
		for(int i=0;i<ch.length;i++) 
			System.out.println(ch[i]);
		
		System.out.println(name3.toLowerCase());//change all the words into LOWERCASE
//		System.out.println(name3.toUpperCase());//change all the words into UPPERCASE
		System.out.println(name3.trim());//its use to remove the space to used it " kabil" into "kabil"
		
		String date="30-07-2023";
		String [] dt=date.split("-");
		for(int i=0;i<dt.length;i++)
			System.out.println(dt[i]);
		
		String[] ar= name3.split(" ");
		for(int i=0;i<ar.length;i++)
		System.out.println(ar[i]);

		
		

	}

}



//Without using New keyword in String object can be stored in  heap memory
//with using new keyword in String object can be stored in same(String constant pool) heap memory but in different allot of memory
//hashcode can be overrided but identityhashcode cant override because its final
//in String class we can't use the "hashcode method "becoz its a not static method it varies so must use "Identityhashcode"

//In ARRAY we use LENGTH is A FIELD(VARIABLE) but in STRING its LENGTH is a METHOD(LENGTH METHOD)


