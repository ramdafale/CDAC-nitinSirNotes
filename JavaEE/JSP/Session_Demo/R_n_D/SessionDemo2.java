<%-- <%@page session="false"%> --%>

<%
HttpSession session1=request.getSession(false);
if(session1==null)
{
	out.println("session does not exists");
}
else
{
	out.println("<br>"+session1.getAttribute("book"));
}
out.println("<br>"+session.getAttribute("book"));
session1.setAttribute("book","advjava");

%>
<%=session1.getAttribute("book")%>
<br>
<%=session.getAttribute("book")%>