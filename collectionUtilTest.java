import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;


class add2 implements ListMapper<Integer>{
	public Integer mapFuncRef(Integer ele , int index , List<Integer> list){
		return ele+2;
	}
}

class greaterThan5 implements ListFilter<Integer>{
	public Boolean filterFuncRef(Integer ele , int index , List<Integer> list){
		return ele>5;
	}
}
public class CollectionUtilTest{
	@Test
	public void map_returns_a_arraylist_of_element_increament_by_two(){
		ListMapper listmapper = new add2();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		List<Integer> result = CollectionUtil.map(list,listmapper);
		assertEquals(result.get(0),(Integer)3);
		assertEquals(result.get(1),(Integer)4);
		assertEquals(result.get(2),(Integer)5);

	}
	@Test
	public void filter_returns_a_arraylist_of_elements_greater_than_5(){
		ListFilter listFilter = new greaterThan5();
		List <Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(6);
		list.add(7);
		List<Integer> result = CollectionUtil.filter(list,listFilter);
		assertEquals(result.get(0),(Integer)6);
		assertEquals(result.get(1),(Integer)7);

	}	
}
