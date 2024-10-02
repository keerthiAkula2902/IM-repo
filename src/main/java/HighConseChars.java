import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HighConseChars {

	public static void main(String[] args) {
		String str = "geekksforgggeeee";
		// System.out.println(str.length());
		String substr = "";
		int low = 0;
		Set s = new HashSet();
		for (int i = 0; i < str.length() - 1; i++) {
			int j = i + 1;
			while (str.charAt(i) == str.charAt(j)) {
				j++;
				if (j >= str.length()) {
					break;
				}

			}
			substr = str.substring(i, j);
			if (substr.length() > 1) {
				s.add(substr);
			}

		}
		System.out.println("*****");
		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
