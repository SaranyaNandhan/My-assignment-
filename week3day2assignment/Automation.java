package week3day2assignment;

public class Automation extends MultipleLanguage implements TestTool{

	@Override
	public void Selenium() {
		System.out.println("Selenium is a tool to automate");
	}
	
public static void main(String[] args) {
		
		Automation a = new Automation();
		
	a.Java();
	a.javaScript();
	a.ruby();
	a.python();
	a.Selenium();
		

	}

}
