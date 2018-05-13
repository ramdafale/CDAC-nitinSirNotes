package mypack;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class StateDAOImpl implements StateDAO {

	@Autowired
	HibernateTemplate template;
	
	@Override
	public void insert(Statemaster ref) {
		// TODO Auto-generated method stub
		template.save(ref);
	}

	@Override
	public List<Statemaster> getAllStates() {
		@SuppressWarnings("unchecked")
		List<Statemaster> stateSet=template.find("from Statemaster");
		return stateSet;
	}

}
