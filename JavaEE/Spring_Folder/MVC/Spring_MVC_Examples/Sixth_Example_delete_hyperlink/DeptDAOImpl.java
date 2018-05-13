package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class DeptDAOImpl implements DeptDAO 
{
	@Autowired
	private HibernateTemplate template;
	
	public List<Dept> getAllDept() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Dept> mylist=(List<Dept>) template.find("from Dept");
		return mylist;
	}

	public void delete(int deptno) {
		// TODO Auto-generated method stub
		template.delete(template.get(Dept.class,deptno));
	}

}







