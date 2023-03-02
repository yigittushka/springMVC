<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<body>

<h2>Dear Human, welcome on the page! </h2>
<br>
<%--Your name :  ${param.saveNamePeople}--%>

Your name : ${employee.name}
<br>
<br>
Your Surname : ${employee.surname}
<br>
<br>
Your Salary : ${employee.salary}
<br>
<br>
Your Department : ${employee.department}
<br>
<br>
Your car : ${employee.carBrend}
<br>
<br>
language(s) :
<ul>
    <c:forEach var="i"  items="${employee.languages}">
        <li> ${i} </li>

    </c:forEach>
</ul>
<br>
<br>
Phone number : ${employee.phoneNumber}
</body>

</html>