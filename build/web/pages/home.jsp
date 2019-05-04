<%-- 
    Document   : home
    Created on : 03/05/2019, 20:46:54
    Author     : Manoel Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Home</title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template -->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/grayscale.min.css" rel="stylesheet">
        <link href="css/grayscale.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    </head>

    <body id="page-top">

        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger" href="#page-top">Projeto 5</a>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    Menu
                    <i class="fas fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#clientes">Clientes</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#fornecedores">Fornecedores</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#signup">Informações</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <!-- Header -->
        <header class="masthead">
            <div class="container d-flex h-100 align-items-center">
                <div class="mx-auto text-center">
                    <h1 class="mx-auto my-0 text-uppercase">Projeto 5</h1>
                    <h2 class="text-white-50 mx-auto mt-2 mb-5">Consulta a um servidor de Banco de Dados JavaDB.</h2>
                </div>
            </div>
        </header>

        <!-- Clientes -->
        <section id="clientes" class="projects-section bg-light" style="margin-top: -50px">
            <div class="container">

                <!-- Featured Project Row -->
                <div class="row align-items-center no-gutters mb-4 mb-lg-5">
                    <div class="col-xl-8 col-lg-7">
                        <img class="img-fluid mb-3 mb-lg-0" src="img/clientes2.jpg" alt="">
                    </div>
                    <div class="col-xl-4 col-lg-5">
                        <div class="featured-text text-center text-lg-left">
                            <h4>Clientes</h4>
                            <p class="text-black-50 mb-0">Nossos clientes são fundamentais para o progresso de nossa organização. A cada nova parceria, um novo laço de amizade e confiança!</p>
                            <button type="button" class="btn btn-dark" style="margin-top: 40px; margin-left: 70px">Consultar</button>
                        </div>
                    </div>
                </div>      
        </section>

        <!-- Fornecedores -->
        <section id="fornecedores" class="projects-section bg-light">
            <div class="container" style=" margin-top: -150px;">

                <!-- Featured Project Row -->
                <div class="row align-items-center no-gutters mb-4 mb-lg-5">
                    <div class="col-xl-8 col-lg-7">
                        <img class="img-fluid mb-3 mb-lg-0" src="img/fornecedores.png" alt="">
                    </div>
                    <div class="col-xl-4 col-lg-5">
                        <div class="featured-text text-center text-lg-left">
                            <h4>Fornecedores</h4>
                            <p class="text-black-50 mb-0">Os fornecedores são os que nos ajudam a estar em dia com nossos clientes, sem eles não seríamos o mesmo. Sempre atribuímos parte do nosso sucesso a eles.</p>
                            <button type="button" class="btn btn-dark" style="margin-top: 40px; margin-left: 70px">Consultar</button>
                        </div>
                    </div>
                </div>      
        </section>



        <!-- Informações Section -->
        <section id="signup" class="signup-section bg-black">
            <div class="container">

                <div class="row">

                    <div class="col-md-4 mb-3 mb-md-0">
                        <div class="card py-4 h-100">
                            <div class="card-body text-center">
                                <i class="fas fa-map-marked-alt text-primary mb-2"></i>
                                <h4 class="text-uppercase m-0">Manoel Victor</h4>
                                <hr class="my-4">
                                <center>
                                    <div class="circle">
                                        <a href="https://github.com/ManoelRodriguez"><img src="img/Manoel.jpeg"></a>
                                    </div>
                                </center>
                                <div class="small text-black-50">Análise e Desenvolvimento de Sistemas, Fatec</div>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 mb-3 mb-md-0">
                        <div class="card py-4 h-100">
                            <div class="card-body text-center">
                                <i class="fas fa-map-marked-alt text-primary mb-2"></i>
                                <h4 class="text-uppercase m-0">Jefferson V.</h4>
                                <hr class="my-4">
                                <center>
                                    <div class="circle">
                                        <a href="https://github.com/JVasconcelosSilva"><img src="img/Jefferson-Foto.jpg"></a>
                                    </div>
                                </center>
                                <div class="small text-black-50">Análise e Desenvolvimento de Sistemas, Fatec</div>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 mb-3 mb-md-0">
                        <div class="card py-4 h-100">
                            <div class="card-body text-center">
                                <i class="fas fa-mobile-alt text-primary mb-2"></i>
                                <h4 class="text-uppercase m-0">Telefone</h4>
                                <hr class="my-4">
                                <div class="small text-black-50">+55 (13) 99902-8832</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- Footer -->
        <footer class="bg-black small text-center text-white-50">
            <div class="container">
                Copyright &copy; Fatec 2019
            </div>
        </footer>

        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Plugin JavaScript -->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for this template -->
        <script src="js/grayscale.min.js"></script>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

    </body>

</html>
