package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("persondaoimpl")
@Transactional
public class PersonDAOImpl implements PersonDAO 
{
	@Autowired
	HibernateTemplate template;
	
	@Override
	public void savePerson(Person ref) 
	{
		template.save(ref);
	}
}
