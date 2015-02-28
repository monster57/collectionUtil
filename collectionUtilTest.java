import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;


class add2 implements ListMapper<Integer , Integer>{
	public Integer mapFuncRef(Integer ele){
		return ele+2;
	}
}

class greaterThan5 implements ListFilter<Integer>{
	public Boolean filterFuncRef(Integer ele){
		return ele>5;
	}
}

class addArray implements ListReducer<Integer , Integer>{
	public Integer ReduceFuncRef(Integer ele , Integer initial){
		return initial+ele;
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
	@Test
	public void reduce_returns_a_value_of_that_the_result_of_the_array_addition(){
		ListReducer listReducer = new addArray();
		List <Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		Integer initial = 0;
		Integer result = CollectionUtil.reduce(list , listReducer , initial);

		assertEquals(result , (Integer)6 );
	}	
}
