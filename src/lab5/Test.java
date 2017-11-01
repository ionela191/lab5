package lab5;



public class Test {
	public static void main(String[]args) {
		//Sectiune cap1=new Sectiune("capitolul1");
		Paragraf p1=new Paragraf("Paragraf de paragraf");
		
		p1.setAlignStrategy(new RightAlign());
		Paragraf p2=new Paragraf("Paragraf de paragraf");
		//p1.setAlign(new RightAlign);
		
		Sectiune s=new Sectiune(null);
		s.add(p1);
		s.add(p2);
	
	}

}
