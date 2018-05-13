package mypack;

import java.util.List;

public interface DeptDAO 
{
	List<Dept> getAllDept();
	void delete(int deptno);
}
