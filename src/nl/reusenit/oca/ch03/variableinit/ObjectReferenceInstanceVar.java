package nl.reusenit.oca.ch03.variableinit;

public class ObjectReferenceInstanceVar {

	private String title;
	public String getTitle() {
		return title;
	}
	
	public static void main(String[] args) {
		ObjectReferenceInstanceVar o = new ObjectReferenceInstanceVar();
		System.out.println("title = " + o.getTitle());
		String s = o.getTitle();
		/*
		 * String t = s.toLowerCase();
		 * 
		 * results in an runtime exception
		 */
		
		if (s != null) {					// compiles and runs
			String t = s.toLowerCase();
		}
		

	}

}
