package EmployeeImportance;

import java.util.List;

class Employee {
	// It's the unique id of each node;
	// unique id of this employee
	int id;
	// the importance value of this employee
	int importance;
	// the id of direct subordinates
	List<Integer> subordinates;
}
