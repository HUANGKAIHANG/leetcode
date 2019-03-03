package EmployeeImportance;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImportance {
	public static void main(String[] args) {
		Solution solution = new Solution();
		Employee e3 = new Employee();
		e3.id = 3;
		e3.importance = 3;
		Employee e2 = new Employee();
		e2.id = 2;
		e2.importance = 3;
		Employee e1 = new Employee();
		e1.id = 1;
		e1.importance = 5;
		List<Integer> sub1 = new ArrayList<>();
		sub1.add(2);
		sub1.add(3);
		e1.subordinates = sub1;

		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(solution.getImportance(list, e1.id));
	}
}

class Solution {
	int getImportance(List<Employee> employees, int id) {
		int importance = 0;
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).id == id) {
				importance = importance + employees.get(i).importance;
				if (employees.get(i).subordinates != null) {
					for (int j = 0; j < employees.get(i).subordinates.size(); j++) {
						importance = importance + getImportance(employees, employees.get(i).subordinates.get(j));
					}
				}
				break;
			}
		}
		return importance;
	}
}
