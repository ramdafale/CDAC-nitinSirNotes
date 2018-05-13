package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class CityDAOimpl implements CityDAO {

	@Autowired
	HibernateTemplate template;
	
	@Override
	public void addCity(Citymaster city) {
		System.out.println("save city");
		template.save(city);
	}

	/*@Override
	public List<Citymaster> getAllCities() {
		@SuppressWarnings("unchecked")
		List<Citymaster> cityList=template.find("from CityMaster");
		return cityList;
	}*/

	@Override
	public List getAllCities(int id) {
		@SuppressWarnings("unchecked")
	//	select k.mvName from Movie k where k.actorName = ?
		List cityList=template.find("select k.cityname from Citymaster k where k.statemaster.stateid="+id+"");
		return cityList;
	}

}
