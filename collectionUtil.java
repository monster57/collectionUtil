import java.io.*;
import java.util.*;


interface ListMapper{
	 Integer mapFuncRef(Integer ele , int index , List<Integer> list);
}

public class CollectionUtil{
	public static List<E> map(List <E>list , ListMapper funcRef ){
		List <E> result = new <E>ArrayList();
		int index = 0;
		for(E ele : list){
			E new_ele = funcRef.mapFuncRef(ele , index++ , list );
			result.add(new_ele);
		}
		return result;
	}
}