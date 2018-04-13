<%--
  Created by IntelliJ IDEA.
  User: Kamil
  Date: 2018-04-13
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet"
          href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Witaj</title>
</head>
<body>
    <section>
        <div class="jumbotron">
            <div class="container">
                <h1>${greeting}</h1>
                <p>${tagline}</p>
            </div>
        </div>
    </section>
</body>
</html>
