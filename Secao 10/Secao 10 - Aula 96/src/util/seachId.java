package util;

import java.util.List;
import entities.Employee;

public class seachId {
	public static int seach(List<Employee> list, int id) {
		for(int i=0; i<list.size(); i++) {		
			if(list.get(i).getId() == id)	//procura se há o id na lista
				return i;
		}
		return -1;
	}
}
