<%-- 
    Document   : purchase
    Created on : Jun 18, 2023, 5:15:50 PM
    Author     : minhhieu
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="header.jsp" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link
            rel="shortcut icon"
            href="images/logo-title4.png"
            type="image/x-icon"
            />
        <link
            rel="stylesheet"
            type="text/css"
            href="styles/bootstrap4/bootstrap.min.css"
            />
        <link
            href="plugins/font-awesome-4.7.0/css/font-awesome.min.css"
            rel="stylesheet"
            type="text/css"
            />
        <link
            rel="stylesheet"
            type="text/css"
            href="plugins/OwlCarousel2-2.2.1/owl.carousel.css"
            />
        <link
            rel="stylesheet"
            type="text/css"
            href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css"
            />
        <link
            rel="stylesheet"
            type="text/css"
            href="plugins/OwlCarousel2-2.2.1/animate.css"
            />
        <link
            rel="stylesheet"
            type="text/css"
            href="plugins/jquery-ui-1.12.1.custom/jquery-ui.css"
            />
        <link rel="stylesheet" type="text/css" href="purchase.css" />
        <link
            rel="stylesheet"
            type="text/css"
            href="styles/categories_responsive.css"
            />
        <link rel="preconnect" href="https://fonts.googleapis.com" />
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />

        <!-- font  -->

        <link rel="preconnect" href="https://fonts.googleapis.com" />
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
        <link href="https://fonts.googleapis.com/css2?family=Oswald:wght@600&display=swap"  rel="stylesheet"/>
        <link
            rel="stylesheet"
            type="text/css"
            href="styles/categories_styles.css"
            />
        <link
            rel="stylesheet"
            type="text/css"
            href="styles/categories_responsive.css"
            />
        <link rel="stylesheet" href="styles/purchase.css" />
        <style>
            h5{
                font-size: 15px;
            }
            .navbar_menu li a {
                display: block;
                color: #1e1e27;
                font-size: 16px;
                font-weight: 500;
                text-transform: uppercase;
                padding: 20px;
            }
            .logo_container a {
                font-size: 27px;
                color: #1e1e27;
                font-weight: 700;
                text-transform: uppercase;
            }
            .title h2{
                font-family: "Oswald", sans-serif;
                margin-left: 25px;
                letter-spacing: 1.5px;
                font-size: 35px;
            }
        </style>
    </head>
    <body>
        <div class="super_container">

            <!-- center -->
            <div class="container" style="min-height: 600px;
                 margin-top: 150px">
                <div class="title mb-5 d-flex justify-content-center" >
                    <h2 style="margin-left: 0px">PUR<span style="color: #fe4c50">CHASE</span></h2>
                </div>

                <div class="container mt-4">
                    <ul class="nav nav-tabs justify-content-center total-nav">
                        <li class="nav-item col-12 col-sm-6 col-md-3 own-item">
                            <a
                                class="nav-link active text-center link-item"
                                id="all-tab"
                                data-toggle="tab"
                                href="#all-content"
                                >All</a
                            >
                        </li>
                        <li class="nav-item col-12 col-sm-6 col-md-3 own-item">
                            <a
                                class="nav-link text-center link-item"
                                id="payment-tab"
                                data-toggle="tab"
                                href="#payment-content"
                                >Payment</a
                            >
                        </li>
                        <li class="nav-item col-12 col-sm-6 col-md-3 own-item">
                            <a
                                class="nav-link text-center link-item"
                                id="shipping-tab"
                                data-toggle="tab"
                                href="#shipping-content"
                                >Shipping</a
                            >
                        </li>
                        <li class="nav-item col-12 col-sm-6 col-md-3 own-item">
                            <a
                                class="nav-link text-center link-item"
                                id="completed-tab"
                                data-toggle="tab"
                                href="#completed-content"
                                >Completed</a
                            >
                        </li>
                    </ul>

                    <div class="tab-content mt-5 around-content ">
                        <div class="tab-pane fade show active" id="all-content">
                            <section>
                                <!--<div class="card-title pt-4">-->
                                <div class="container mt-3 total-product">
                                    <div class="col-12">
                                        <div id="accordion">
                                            <div class="card mb-3">
                                                <div
                                                    class="card-header"
                                                    role="tab"
                                                    id="peterhead"
                                                    data-toggle="collapse"
                                                    data-target="#1"
                                                    >
                                                    <div
                                                        class="header-product d-flex justify-content-between align-items-center overflow-hidden"
                                                        >
                                                        <div>
                                                            <h5 class="mb-0">Ngay 14 thang 6 NAM 2023</h5>
                                                        </div>
                                                        <div class="col-4 status ml-2">
                                                            <h5 style="text-align: end;
                                                                margin-bottom: 0">
                                                                PAYMENT
                                                            </h5>
                                                        </div>
                                                        <div class="d-flex mt-2 ml-md-0 overflow-hidden">
                                                            <h5>160.000d</h5>
                                                            <i
                                                                class="fa fa-angle-down ml-3"
                                                                aria-hidden="true"
                                                                ></i>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div
                                                    class="collapse container"
                                                    id="1"
                                                    data-parent="#accordion"
                                                    >
                                                    <div
                                                        class="card-body d-flex justify-content-between align-items-center overflow-hidden pb-3"
                                                        >
                                                        <div class="img-product col-md-2 ml-0 pl-0">
                                                            <img
                                                                src="images/banner_1.jpg"
                                                                alt=""
                                                                class="img-fluid rounded-0"
                                                                />
                                                        </div>
                                                        <div class="col-md-7">
                                                            <span class="name-product">3 san pham ga </span>
                                                        </div>

                                                        <div
                                                            class="col-md-2 d-flex justify-content-end overflow-hidden"
                                                            >
                                                            <span>50000</span>
                                                        </div>
                                                    </div>
                                                    <div
                                                        class="card-body d-flex justify-content-between align-items-center overflow-hidden pb-3"
                                                        >
                                                        <div class="img-product col-md-2 ml-0 pl-0">
                                                            <img
                                                                src="images/banner_1.jpg"
                                                                alt=""
                                                                class="img-fluid rounded-0"
                                                                />
                                                        </div>
                                                        <div class="col-md-7">
                                                            <span class="name-product">5 san pham ga </span>
                                                        </div>
                                                        <!-- <div class="center-status col-md-2 mr-1 pr-2 ml-3">
                                                          <span>Payment</span>
                                                        </div> -->
                                                        <div
                                                            class="col-md-2 d-flex justify-content-end overflow-hidden"
                                                            >
                                                            <span>150000</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- order2 -->
                                            <!--order 2-->
                                            <div class="card mb-3">
                                                <div
                                                    class="card-header"
                                                    role="tab"
                                                    id="peterhead"
                                                    data-toggle="collapse"
                                                    data-target="#2"
                                                    >
                                                    <div
                                                        class="header-product d-flex justify-content-between align-items-center overflow-hidden"
                                                        >
                                                        <div>
                                                            <h5 class="mb-0">Ngay 14 thang 6 NAM 2023</h5>
                                                        </div>
                                                        <div class="col-4 status ml-2">
                                                            <h5 style="text-align: end;
                                                                margin-bottom: 0">
                                                                SHIPPING
                                                            </h5>
                                                        </div>
                                                        <div class="d-flex mt-2 ml-md-0 overflow-hidden">
                                                            <h5>160.000d</h5>
                                                            <i
                                                                class="fa fa-angle-down ml-3"
                                                                aria-hidden="true"
                                                                ></i>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div
                                                    class="collapse container"
                                                    id="2"
                                                    data-parent="#accordion"
                                                    >
                                                    <div
                                                        class="card-body d-flex justify-content-between align-items-center overflow-hidden pb-3"
                                                        >
                                                        <div class="img-product col-md-2 ml-0 pl-0">
                                                            <img
                                                                src="images/banner_1.jpg"
                                                                alt=""
                                                                class="img-fluid rounded-0"
                                                                />
                                                        </div>
                                                        <div class="col-md-7">
                                                            <span class="name-product">3 san pham ga </span>
                                                        </div>

                                                        <div
                                                            class="col-md-2 d-flex justify-content-end overflow-hidden"
                                                            >
                                                            <span>50000</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </section>
                        </div>

                        <div class="tab-pane fade" id="payment-content">


                        </div>
                        <div class="tab-pane fade" id="shipping-content">
                            <h3>Shipping Content</h3>
                            <p>This is the content for the Shipping tab.</p>
                        </div>
                        <div class="tab-pane fade" id="completed-content">
                            <h3>Completed Content</h3>
                            <p>This is the content for the Completed tab.</p>
                        </div>
                    </div>
                </div>
            </div>
            <footer class="footer" style="background-color: #f3f3f3">
                <div class="container" style="margin-top: 50px">
                    <div class="row">
                        <div class="col-lg-6">
                            <div
                                class="footer_nav_container d-flex flex-sm-row flex-column align-items-center justify-content-lg-start justify-content-center text-center"
                                >
                                <ul class="footer_nav">
                                    <li><a href="#">Blog</a></li>
                                    <li><a href="#">FAQs</a></li>
                                    <li><a href="contact.html">Contact us</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div
                                class="footer_social d-flex flex-row align-items-center justify-content-lg-end justify-content-center"
                                >
                                <ul>
                                    <li>
                                        <a href="#"
                                           ><i class="fa fa-facebook" aria-hidden="true"></i
                                            ></a>
                                    </li>
                                    <li>
                                        <a href="#"
                                           ><i class="fa fa-twitter" aria-hidden="true"></i
                                            ></a>
                                    </li>
                                    <li>
                                        <a href="#"
                                           ><i class="fa fa-instagram" aria-hidden="true"></i
                                            ></a>
                                    </li>
                                    <li>
                                        <a href="#"
                                           ><i class="fa fa-skype" aria-hidden="true"></i
                                            ></a>
                                    </li>
                                    <li>
                                        <a href="#"
                                           ><i class="fa fa-pinterest" aria-hidden="true"></i
                                            ></a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </footer>
        </div>

        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="styles/bootstrap4/popper.js"></script>
        <script src="styles/bootstrap4/bootstrap.min.js"></script>
    </body>
</html>