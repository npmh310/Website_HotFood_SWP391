<%-- 
    Document   : top.jsp
    Created on : May 16, 2023, 2:27:02 PM
    Author     : minhhieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Hot Food</title>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="description" content="Hot Food Template" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!-- Tạo logo ở title -->
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
        <link rel="stylesheet" type="text/css" href="styles/main_styles.css" />
        <link rel="stylesheet" type="text/css" href="styles/responsive.css" />
        <link rel="stylesheet" href="styles/myCss.css" />
        <style>
            /* Style the buttons that are used to open and close the accordion panel */
            .accordion {
               
                background-color: #fff;
                color: #444;
                cursor: pointer;
                padding: 18px;
                width: 100%;
                text-align: left;
                border: none;
                outline: none;
                transition: 0.4s;
            }

            /* Add a background color to the button if it is clicked on (add the .active class with JS), and when you move the mouse over it (hover) */
            .active, .accordion:hover {
                background-color: #fff;
                width: fit-content;
                height: fit-content;
                padding: 10px 10px 10px 10px;
            }

            /* Style the accordion panel. Note: hidden by default */
            .panel {
                padding: 10px 10px;
                background-color: white;
                display: none;
                overflow: hidden;
            }
        </style>
    </head>

    <body>
        <div class="super_container">
            <!-- Header -->


            <header class="header trans_300">
                <!-- Top Navigation -->

                <!-- Main Navigation -->

                <div class="main_nav_container">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-12 text-right">
                                <div class="logo_container">
                                    <a href="home">hot<span>food</span></a>
                                </div>
                                <nav class="navbar">
                                    <ul class="navbar_menu">
                                        <li><a href="home">home</a></li>
                                        <li><a href="#">Promotional</a></li>
                                        
                                        <li><a href="category">categories</a></li>
                                        <li><a href="#">best seller</a></li>

                                    </ul>
                                    <ul class="navbar_user">
                                        <li>
                                            <div class="input-group rounded">
                                                <button class="accordion"><i class="fa fa-search" aria-hidden="true"></i></button>
                                                <div class="panel">
                                                    <form action="search" method="post">
                                                        <input name="txt" type="text" placeholder="search" maxlength="40" 
                                                               style="width: 100px; font-family: unset !important; 
                                                               font-weight: normal; height: 28px; padding-left: 7px; font-size: 14px">
                                                    </form>
                                                </div>
                                            </div>
                                        </li>
                                        <li>
                                            <a href="login.jsp"
                                               ><i class="fa fa-user" aria-hidden="true"></i
                                                ></a>
                                        </li>
                                        <li class="checkout">
                                            <a href="cart.jsp">
                                                <i class="fa fa-shopping-cart" aria-hidden="true"></i>
                                                <span id="checkout_items" class="checkout_items"
                                                      >2</span
                                                >
                                            </a>
                                        </li>
                                    </ul>
                                    <div class="hamburger_container">
                                        <i class="fa fa-bars" aria-hidden="true"></i>
                                    </div>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </header>

            <div class="fs_menu_overlay"></div>
            <div class="hamburger_menu">
                <div class="hamburger_close">
                    <i class="fa fa-times" aria-hidden="true"></i>
                </div>
                <div class="hamburger_menu_content text-right">
                    <ul class="menu_top_nav">
                        <!-- <li class="menu_item has-children">
                                                    <a href="#">
                                                            usd
                                                            <i class="fa fa-angle-down"></i>
                                                    </a>
                                                    <ul class="menu_selection">
                                                            <li><a href="#">cad</a></li>
                                                            <li><a href="#">aud</a></li>
                                                            <li><a href="#">eur</a></li>
                                                            <li><a href="#">gbp</a></li>
                                                    </ul>
                                            </li> -->
                        <!-- <li class="menu_item has-children">
                                                    <a href="#">
                                                            English
                                                            <i class="fa fa-angle-down"></i>
                                                    </a>
                                                    <ul class="menu_selection">
                                                            <li><a href="#">French</a></li>
                                                            <li><a href="#">Italian</a></li>
                                                            <li><a href="#">German</a></li>
                                                            <li><a href="#">Spanish</a></li>
                                                    </ul>
                                            </li> -->
                        <li class="menu_item has-children">
                            <a href="#">
                                My Account
                                <i class="fa fa-angle-down"></i>
                            </a>
                            <ul class="menu_selection">
                                <li>
                                    <a href="#"
                                       ><i class="fa fa-sign-in" aria-hidden="true"></i>Sign In</a
                                    >
                                </li>
                                <li>
                                    <a href="#"
                                       ><i class="fa fa-user-plus" aria-hidden="true"></i
                                        >Register</a
                                    >
                                </li>
                            </ul>
                        </li>
                        <li class="menu_item"><a href="home">home</a></li>
                        <li class="menu_item"><a href="#">Promotional</a></li>
                       
                        <li class="menu_item"><a href="category">Categories</a></li>
                        <li class="menu_item"><a href="#">Best Seller</a></li>

                    </ul>
                </div>

            </div>


            <script>
                var acc = document.getElementsByClassName("accordion");
                var i;

                for (i = 0; i < acc.length; i++) {
                    acc[i].addEventListener("click", function () {
                        /* Toggle between adding and removing the "active" class,
                         to highlight the button that controls the panel */
                        this.classList.toggle("active");

                        /* Toggle between hiding and showing the active panel */
                        var panel = this.nextElementSibling;
                        if (panel.style.display === "block") {
                            panel.style.display = "none";
                        } else {
                            panel.style.display = "block";
                        }
                    });
                }
            </script>
    </body>

    