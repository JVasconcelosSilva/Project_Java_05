<%-- 
    Document   : detalhes-customers
    Created on : 11/05/2019, 15:29:19
    Author     : Andr0id
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="br.com.fatecpg.jdbc.Customer"%>
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

        footer{
            position:absolute;
            bottom:0;
            width:100%;
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
        <%DecimalFormat df = new DecimalFormat("#,###.00");%>
        <% int id = Integer.parseInt(request.getParameter("id"));%>
        <% String nome = (request.getParameter("nome"));%>
    <center>
        <h2><%=nome%> : Lista de Compras</h2>
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">Produtos</th>
                    <th scope="col">Qtde.</th>
                    <th scope="col">Vl. Unit.</th>
                </tr>
            </thead>
            <tbody>
                <%for (Customer m : Customer.getDetails(id)) {%>
                <tr>
                    <th><%=m.getProdutos()%></th>
                    <th><%=m.getQtde()%></th>
                    <th>R$ <%=df.format(m.getValor())%></th>
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


    <center>
        <footer>
            <hr/>
            <p>Copyright &copy; Fatec 2019</p>
        </footer>
    </center>

</body>
</html>
