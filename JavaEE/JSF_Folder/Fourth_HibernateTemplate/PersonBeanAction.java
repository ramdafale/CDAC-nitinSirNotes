package mypack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("personbeanaction")
public class PersonBeanAction
{
	@Autowired
	PersonDAO persondao;
	public void setPersondao(PersonDAO persondao) {
		System.out.println("inside setpersondao method");
		this.persondao = persondao;
	}

		        
	@Autowired
	private Person person;
	
	public Person getPerson() {
		return person;
	}

	/*public void setPerson(Person person) {
		System.out.println("inside setperson method");
		this.person = person;
	}*/

	public String addPerson()
	{
	
	persondao.savePerson(person);
		
        return "success";
	}
}












