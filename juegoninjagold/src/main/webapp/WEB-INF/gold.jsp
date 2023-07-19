<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css">
        <title>Document</title>
    </head>

    <body>
        <div class="head">
            <h1>Your Gold:</h1>
            <h1 class="total">
                <c:out value="${gold}" />
            </h1>
        </div>
        <main>
            <form action="farm" method="post" class="farm">
                <h1>Farm</h1>
                <h2>(earns 10-20 gold)</h2>
                <button>Find Gold!</button>
            </form>
            <form action="cave" method="post" class="cave">
                <h1>Cave</h1>
                <h2>(earns 5-10 gold)</h2>
                <button>Find Gold!</button>
            </form>
            <form action="house" method="post" class="house">
                <h1>House</h1>
                <h2>(earns 2-5 gold)</h2>
                <button>Find Gold!</button>
            </form>
            <form action="casino" method="post" class="casino">
                <h1>Casino!</h1>
                <h2>(earns/ takes 0-50 gold)</h2>
                <button>Find Gold!</button>
            </form>
            <form action="spa" method="post" class="spa">
                <h1>Spa!</h1>
                <h2>(takes 5-20 gold)</h2>
                <button>Find Gold!</button>
            </form>
            <form action="reinicia" method="get" class="reinicia">
                <button>Volver a empezar?</button>
            </form>
        </main>
        <p class="titulo">Activities:</p>
        <div class="mensajes">
            <c:forEach var = "i" items="${lista}">
                <c:out value = "${i}"/><p>
            </c:forEach>
        </div>
    </body>

    </html>