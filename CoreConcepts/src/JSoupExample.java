import javax.swing.text.Document;

import org.jsoup.*;
public class JSoupExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://www.radioshack.com/";
		Document doc=(Document) Jsoup.connect(url);
		

	}

}
