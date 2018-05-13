import javax.script.*;

import java.io.*;

public class Test
 {
   public static void main(String args[])
   {
      ScriptEngineManager scriptEngineManager = new ScriptEngineManager(); 
      ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn"); 
    
     Object result = null;
      try 
      {
         nashorn.eval(new FileReader("script.js"));
         //get handle of JavaScript file’s context
Invocable invocable = (Invocable) nashorn;

//invoke function defined in the file’s context and pass the argument.
 result = invocable.invokeFunction ("fun1", "Mr. X",20);

//print the result and its type.
System.out.println (result);   
invocable.invokeFunction ("fun2");
      }
      catch(ScriptException e)
      {
         System.out.println("Error executing script: "+ e.getMessage());
      }
catch(Exception e)
      {
         e.printStackTrace();
      }
    System.out.println("Done");
   } 







}
