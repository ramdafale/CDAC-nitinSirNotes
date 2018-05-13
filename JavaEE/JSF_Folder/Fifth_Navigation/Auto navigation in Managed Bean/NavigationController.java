package mypack;
@ManagedBean(name = "navigationController")
public class NavigationController 
{
   public String moveToPage2()
   {
      return "page2";
   }
   public String moveToIndex()
   {
	return "index";
   }
}
