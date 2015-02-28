import java.io.*;
import java.util.*;


interface ListMapper<E>{
	 E mapFuncRef(E ele , int index , List<E> list);
	
}
interface ListFilter<E>{
	 Boolean filterFuncRef(E ele , int index , List<E> list);
}
public class CollectionUtil<E>{
	public static<E> List<E> map(List <E>list , ListMapper funcRef ){
		List <E> result = new <E>ArrayList();
		int index = 0;
		for(E ele : list){
			E new_ele =(E)funcRef.mapFuncRef(ele , index++ , list );
			result.add(new_ele);
		}
		return result;
	}
	public static<E> List<E> filter(List<E> list, ListFilter funcRef){
		List <E> result = new <E>ArrayList();
		int index = 0;
		for(E ele:list){
			Boolean new_ele = (Boolean)funcRef.filterFuncRef(ele , index++ , list);
			if(new_ele){
				result.add(list.get(index-1));
			}
		}
		return result;
	}
}

