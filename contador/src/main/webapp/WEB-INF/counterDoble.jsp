<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>
        Hola, haz ingresado <c:out value="${contador}"/> veces
    </h1>   
    <h2>
        <a href="index">volvamos a la pag inicial</a>
    </h2>
    <h2>
        <a href="reinicia">quieres reiniciar el contador?</a>
    </h2>
    
</body>
</html>