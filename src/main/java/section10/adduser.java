package section10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class adduser {

	public static void main(String[] args) {
		
		ArrayList <String> a = new ArrayList <String>();
        a.add("Kim");
        a.add("Neha");
        a.add("Simi");
        a.add("Simi");
        System.out.println(a);
        
        HashSet <String> b = new HashSet <String>();
        b.add("Kim");
        b.add("Neha");
        b.add("Simi");
        b.add("Neha");
        System.out.println(b);
        
        
        Map<Integer, String> c = new HashMap<Integer, String>();        
        c.put(0, "Kim");
        c.put(1, "Neha");
        c.put(2, "Simi");
        c.put(2, "Neha");
        System.out.println(c);
	}

}
