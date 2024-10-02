import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class duplicatein_hashmap {

	public static void main(String[] args) {
		String str = "I am keerthi akula I keerthi akula";

		Map<Integer, String> mp = new HashMap<Integer, String>();
		Map<String, Integer> mp2 = new Hashtable<String, Integer>();

		mp.put(1, "ak");
		mp.put(2, "pk");
		mp.put(1, "ck");

		// Hashmap allows keys and value as null, lastest value will be considered
		mp.put(3, null);
		mp.put(null, "test");
		mp.put(null, "duplciate");
		mp2.put("test", 1);
		mp2.put("test1", 10);
		mp2.put("test", 100);

		// null values are not allowed in key or values in hashtable
		// mp2.put("test3", null);
		System.out.println(mp.get(3));
		System.out.println(mp.get(null));
		// System.out.println(mp2.get("test3"));

	}

}
