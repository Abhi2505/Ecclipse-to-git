package day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LearnMap {
	static List<String>getpassnames(Map<String,Integer>input){
		List<String>list=new ArrayList<String>();
		for(String m:input.keySet()) {
			if(input.get(m)>=70) {
				list.add(m);
			}
		}
		for(Entry<String,Integer>ss:input.entrySet()) {
			if(ss.getValue()>=70)
				list.add(ss.getKey());
		}
		return list;
	}
	static Map<Character,Integer>charCount(String input){
		Map<Character,Integer>hm=new TreeMap<>();
		for(char c:input.toCharArray()) {
			if(!hm.containsKey(c)) {
				hm.put(c,1);
			}
			else {
				hm.put(c,hm.get(c)+1);
			}
		}
//		for(char c:input.toCharArray()) {
//			hm.put(c,hm.getOrDefault(c, 0)+1);
//		}
		return hm;
	}
	static Map<String,Integer> getfeedback(Map<String,Integer>eng,Map<String,Integer>math){
		Map<String,Integer>h=new TreeMap<>();
//		for(String s:math.keySet()) {
//			if(!h.containsKey(s)) {
//				h.put(s, math.get(s));
//			}
//			else {
//				h.put(s, math.get(s));
//			}
//		}
		h.putAll(math);
		for(String s:eng.keySet()) {
			if(!h.containsKey(s)) {
				h.put(s, eng.get(s));
			}
			else {
				h.put(s, Math.max(h.get(s),eng.get(s)));
			}
		}
		return h;
	}
public static void main(String[] args) {
	Map<String,Integer>english=new HashMap<String,Integer>();
	english.put("Sandy",90);
	english.put("Hiran",87);
	english.put("Puppy",76);
	english.put("Vedha",89);
	
	Map<String,Integer>math=new HashMap<String,Integer>();
	math.put("Azar", 90);
	math.put("Vedha", 92);
	math.put("Kiran", 78);
	math.put("Sandy", 85);
	System.out.println(getfeedback(english,math));
	String input="apple";
	//System.out.println(charCount(input));
	Map<String, Integer>names=new HashMap<String,Integer>();
	names.put("Ragav",71);
	names.put("Ravi",34);
	names.put("Mrunal",77);
	names.put("Rashi",87);
	names.put("Dipin",65);
	//System.out.println(getpassnames(names));
	HashMap<Integer, Integer>h=new HashMap<Integer, Integer>();
	h.put(1,21);
	h.put(12,211);
	h.put(112,221);
	h.put(13,2121);
	//unordered 
	//treemap key sorted
	Set<Integer>ks=h.keySet();
//	for(int k:ks) {
//		System.out.println(k);
//		
//	}
	//System.out.println(h.values());
//	for(Entry<Integer, Integer> es:h.entrySet()) {
//		//entry obj es points to eery entry dabba containing key and val 
//		System.out.println(es.getKey()+"ds"+es.getValue());
//	}
}
}
