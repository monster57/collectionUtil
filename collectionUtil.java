import java.io.*;
import java.util.*;


interface ListMapper<E,K>{
	 K mapFuncRef(E ele );
	
}
interface ListFilter<E>{
	 Boolean filterFuncRef(E ele);
}
interface ListReducer<E,K>{
	 K ReduceFuncRef(E ele , K initial);
}
public class CollectionUtil<E>{
	public static<E,K> List<K> map(List <E>list , ListMapper funcRef ){
		List <K> result = new <K>ArrayList();
		for(E ele : list){
			K new_ele =(K)funcRef.mapFuncRef(ele);
			result.add(new_ele);
		}
		return result;
	}
	public static<E> List<E> filter(List<E> list, ListFilter funcRef){
		List <E> result = new <E>ArrayList();
		for(E ele:list){
			Boolean new_ele = (Boolean)funcRef.filterFuncRef(ele);
			if(new_ele){
				result.add(ele);
			}
		}
		return result;
	}
	public static<E,K> 	K reduce(List<E> list, ListReducer<E,K> funcRef, K initial){
		for(E ele: list){
			 initial = funcRef.ReduceFuncRef(ele , initial);
		}
		return initial;	
	}
}

