package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class LocationDAOImpl implements LocationDAO {

	@Autowired
	HibernateTemplate template;
	
	@Override
	public void addLocation(Locationmaster ref) {
		// TODO Auto-generated method stub
		template.save(ref);
	}

	@Override
	public List getAllLocations(String name) {
		@SuppressWarnings("unchecked")
		List mylist=template.find("select k.cityid from Citymaster k where k.cityname='"+name+"'");
		System.out.println("cityid is\t"+mylist.get(0));
		List locationList=template.find("select k.locname from Locationmaster k where k.citymaster.cityid="+mylist.get(0)+"");
		return locationList;
	}


}
