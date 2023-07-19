<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
        var time = new Date();
        confirm("La hora es : " + time.getHours() + ":" + time.getMinutes());
    </script>
</head>

<body>
    <h1>La hora es: <c:out value="${name}"/>
        <script> var time = new Date();  </script>
    </h1>
    <h1><a href="index">Volver</a></h1>
</body>

</html>