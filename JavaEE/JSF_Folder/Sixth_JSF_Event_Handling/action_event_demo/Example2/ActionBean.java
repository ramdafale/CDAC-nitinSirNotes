package mypack;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="accbean")
@SessionScoped
public class ActionBean
{
 
  String buttonText = "Disable";

  public String getButtonText() {
    return buttonText;
  }

  public void setButtonText(String buttonText) {
    this.buttonText = buttonText;
  }
 
} 
