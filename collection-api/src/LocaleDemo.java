import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {

	public static void main(String[] args) {
		//ResourceBundle lables = ResourceBundle.getBundle("labels");
		
		//ResourceBundle lables = ResourceBundle.getBundle("labels",Locale.FRANCE);   //for predefined locale
		
		Locale desi = new Locale("hi");
		ResourceBundle lables = ResourceBundle.getBundle("desi");		
		System.out.println(lables.getString("greeting"));
		System.out.println(lables.getString("message"));
	}

}
