package Learn_String;

public class StringBufferDemo {

	public static void main(String[] args) {
		String name="kabil";//directly  possible to assume in ("")String is Immutable
		name.concat("dev");
		name=name.concat("dev");
	 	System.out.println(name);
//		StringBuffer sb="kabil";//not directly assume in ("")StringBuffer is Mutable
		StringBuffer sb=new StringBuffer("kabil");
		System.out.println(sb);//kabil
 		sb.append("dev");//append method is used to joint words into given object
		System.out.println(sb);//kabildev
		
		sb.reverse(); //its used to reverse the Name or given input
		System.out.println(sb);//vedlibak
		sb.insert(5,"_");//its used to insert anything in the method and put the index value 
		System.out.println(sb);//kabil_dev
		
		String name1="KARTHIKAKABILDEV";
		char[] name2=name1.toCharArray();
		for(int i=0;0<=name1.length()-1;i--) {
			System.out.println(name2[i]);
		}
		
		
		
		
	}

}
