package lab5;

public class Paragraf extends AbstractElement implements AlignStrategy {
	String text;
	Paragraf() { }
	Paragraf(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	public void setAlignStrategy(RightAlign rightAlign) {
		// TODO Auto-generated method stub
		
	}

}