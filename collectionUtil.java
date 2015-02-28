import java.io.*;
import java.util.*;


interface ListMapper<E,K>{
	 K mapFuncRef(E ele );
	
}
interface ListFilter<E>{
	 Boolean filterFuncRef(E ele);
}
public class CollectionUtil<E>{
	public static<E,K> List<K> map(List <E>list , ListMapper funcRef ){
		List <K> result = new <K>ArrayList();
		int index = 0;
		for(E ele : list){
			K new_ele =(K)funcRef.mapFuncRef(ele);
			result.add(new_ele);
		}
		return result;
	}
	public static<E> List<E> filter(List<E> list, ListFilter funcRef){
		List <E> result = new <E>ArrayList();
		int index = 0;
		for(E ele:list){
			Boolean new_ele = (Boolean)funcRef.filterFuncRef(ele);
			if(new_ele){
				result.add(ele);
			}
		}
		return result;
	}
}

