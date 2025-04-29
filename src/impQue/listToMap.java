package impQue;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class listToMap {

private static List<Integer> asList;

public static void main(String[] args) {
	sortInAscOrder();
}

//listToMap

public static void listToMapmethod() {
	List<Integer> data=Arrays.asList(10,23,34,66);
	Map<Object, Object> datas=data.stream().collect(Collectors.toMap(s->s,s->1));
	datas.forEach((s,v)->System.out.println(v));
}


//count the charecters in String

public static void countChare() {
	String Value="Deepak Gullapalli";
		Map<Character, Integer> collect = Value.chars().mapToObj(d->(char) d).collect(Collectors.toMap(d->d,d->1,(d1,d2)->d1+d2, () -> new LinkedHashMap<>() ));
		collect.entrySet().stream().filter(ob->ob.getValue()==1).forEach(entry -> System.out.println("Character: " + entry.getKey()));
}



public static void findfirstRepeatedChar() {
	String Name="Deepak Gullapalli";
	Optional<Entry<Character, Integer>> findFirst = Name.chars().mapToObj(d->(char) d).collect(Collectors.toMap(d->d, d->1,(d1,d2)->d1+d2,()->new LinkedHashMap<>())).entrySet().stream().filter(d->d.getValue()>1).findFirst();
	System.out.println(findFirst.get().getKey());
}

public static void sortInAscOrder() {
	 List<Integer> dataList= Arrays.asList(10,22,32,2,11);
	 dataList.stream().sorted((o1,o2)->Integer.compare(o2,o1)).forEach(d->System.out.println(d));
}


}
