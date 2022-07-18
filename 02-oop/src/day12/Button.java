package day12;

public class Button implements OnClickListener{

	private String name;
	
	public Button(String name) {
		this.name = name;
	}
	
	void display() {
		System.out.println("Font size: " + FONT_SIZE);
		System.out.println("Font family: " + FONT_FAMILY);
	}
	
	@Override
	public void onClick() {
		System.out.println(name + " click event");
		
	}

	@Override
	public void onDoubleClick() {
		System.out.println(name + " double click event");
		
	}

}
