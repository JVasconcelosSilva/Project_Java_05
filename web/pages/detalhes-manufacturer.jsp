<%-- 
    Document   : detalhes
    Created on : 11/05/2019, 11:44:13
    Author     : Jefferson V.
--%>

<%@page import="br.com.fatecpg.jdbc.Manufacturer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    </head>
    <style>
        img{
            width: 50px;
            margin-left: 20px;
        }
        .table{
            width: 800px;
            margin-top: 60px;
        }
        th{
            text-align: center;
        }
        td{
            text-align: center;
        }
        h2{
            margin-top: 100px;
        }
    </style>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-dark">
            <a class="navbar-brand" href="home.jsp" style="color: white"><img src="img/home4.png" alt=""></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#conteudoNavbarSuportado"
                    aria-controls="conteudoNavbarSuportado" aria-expanded="false" aria-label="Alterna navegação">
                <span class="navbar-toggler-icon"></span>
            </button>


        </nav>
        <%try {%>

        <% if (request.getParameter("id") != null) { %>
        <% int id = Integer.parseInt(request.getParameter("id"));%>
        <% String nome = (request.getParameter("nome"));%>
    <center>
        <h2><%=nome%> : Produtos</h2>
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">Produtos</th>
                </tr>
            </thead>
            <tbody>
                <%for (Manufacturer m : Manufacturer.getDetails(id)) {%>
                <tr>
                    <th><%= m.getProduto()%></th>

                </tr>
                <%}%>
            </tbody>
        </table>

    </center>    

    <%} else {%>
    <h1>Nenhum valor a ser exibido</h1>
    <%}%>

    <%} catch (Exception e) {%>
    <h3 style="color: red">Erro: <%= e.getMessage()%></h3>
    <%}%>
</body>
</html>
