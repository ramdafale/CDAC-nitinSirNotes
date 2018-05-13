package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class CustomerDAOImpl implements CustomerDAO 
{
	@Autowired
	private HibernateTemplate template;
	@Override
	public void add(Customer ref) {
		// TODO Auto-generated method stub
		template.save(ref);
	}

}
