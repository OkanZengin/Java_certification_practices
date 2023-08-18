package part_five;

public class Assignment {

	public static void main(String[] args) {
		String str = "We have a large inventory of things in our warehouse falling in "+
				"the category:apperal and the slightly "+
				"more in demand category:make-up along with the category:furniture and ..";
		printCategories(str);
	}
	public static void printCategories(String str) {

		String newstr = str;
		while(true) {
			int targeta = newstr.indexOf(":");
			newstr = newstr.substring(targeta+1);
			int targetb = newstr.indexOf(" ");
			String ctgry1 = newstr.substring(0,targetb);
			if (targeta==-1){
				break;
			}
			System.out.println(ctgry1);
		
		}
		
	}
	
}
