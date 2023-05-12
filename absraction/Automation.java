package absraction;

public class Automation extends MultipleLanguage implements Language, TestTool {
	public void selenium() {
		System.out.println("selenium is a tool");
		
	}

	public void java() {
		System.out.println("selenium supports java");
	}

	@Override
	public void ruby() {
		System.out.println("selenim also supports ruby");
		
	}
	public static void main(String[] args) {
		Automation auto =new Automation();
		auto.python();
		auto.selenium();
		auto.java();
		auto.ruby();
		

	}

}
