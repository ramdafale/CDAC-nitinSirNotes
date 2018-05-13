<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>
  <f:view>
      <head><title>Hello World!</title></head>
      <body>
      ${requestScope.person.name}
      
        <h:form>
            <h3>Hello,<h:outputText value="#{person.name}"/></h3>
            <h:commandLink id="Cancel" action="index">
                  <h:outputText value="Cancel"/>
             </h:commandLink>
        </h:form>
    </body>
  </f:view>
</html>














