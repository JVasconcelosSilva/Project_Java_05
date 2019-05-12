<%-- 
    Document   : customers
    Created on : 11/05/2019, 01:50:36
    Author     : Manoel Rodriguez
--%>

<%@page import="br.com.fatecpg.jdbc.Manufacturer"%>
<%@page import="br.com.fatecpg.jdbc.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Clientes</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
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
            footer{
                margin-top: 50px;
            }
        </style>

    </head>

    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-dark">
            <a class="navbar-brand" href="home.jsp" style="color: white"><img src="img/home4.png" alt=""></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#conteudoNavbarSuportado"
                    aria-controls="conteudoNavbarSuportado" aria-expanded="false" aria-label="Alterna navegação">
                <span class="navbar-toggler-icon"></span>
            </button>


        </nav>

        <%try {%>
    <center>
        <h2>Clientes</h2>
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nome</th>
                    <th scope="col">E-mail</th>
                    <th scope="col">Detalhes</th>
                </tr>
            </thead>
            <tbody>
                <%for (Customer c : Customer.getList()) {%>
                <tr>
                    <th><%= c.getId()%></th>
                    <td><%= c.getName()%></td>
                    <td><%= c.getEmail()%></td>
                    <td scope="col"><a href="detalhes-customers.jsp?id=<%=c.getId()%>&nome=<%=c.getName()%>">Lista de Compras</td>
                </tr>
                <%}%>
            </tbody>
        </table>

    </center>    
    <%} catch (Exception e) {%>
    <h3 style="color: red">Erro: <%= e.getMessage()%></h3>
    <%}%>
    <center>
        <footer>
            <hr/>
            <p>Copyright &copy; Fatec 2019</p>
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
                    integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
            crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
                    integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
            crossorigin="anonymous"></script>
        </footer>
    </center>
</body>

</html>
