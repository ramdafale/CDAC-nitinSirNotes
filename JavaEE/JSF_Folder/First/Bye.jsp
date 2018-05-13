<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>
  <f:view>
      <head><title>GoodBye World!</title></head>
      <body>
       ${requestScope.person.name}
        <h:form>
            <h3>GoodBye,<h:outputText value="#{person.name}"/></h3>
            <h:commandLink id="Cancel" action="index">
                  <h:outputText value="Cancel"/>
             </h:commandLink>
        </h:form>
    </body>
  </f:view>
</html>


