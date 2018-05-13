<html>
  <%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
  <%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
   <f:view>
     <head><title>JSF Hello World</title></head>
     <body>
      <h:form id="helloForm">
        <h:outputLabel  value="Please enter your name"/>
        <h:panelGrid columns="2">
           <h:outputLabel  value="Name:"/>
           <h:inputText id ="name" value="#{person.name}"/>
           <h:commandButton value="Say Hello" action="sayHello"/>
           <h:commandButton value="Say Bye" action="sayBye"/>
        </h:panelGrid>
       </h:form>
     </body>
   </f:view>
</html> 
