<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method="POST" action="note">
            <h3>Title: </h3>
            <input type="text" name="title" value="${note.title}">
            <h3>Contents</h3>
            <input type="text" name="contents" value="${note.contents}">
        </form>
    <c:if test="${invalidEntry}">
        <p>Invalid Entry. Please enter both the title and the contents.</p>
    </c:if>
</body>
</html>
