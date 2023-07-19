<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script>
        var date = new Date();
        confirm("La fecha es : " + date.getDate() + "/"+(date.getMonth()+1)+"/"+ date.getFullYear() );
    </script>
    <title>Document</title>
</head>
<body>
    
    <h2>La fecha es: <c:out value="${date}"/></h2>
    <h1><a href="index">Volver</a></h1>
</body>
</html>