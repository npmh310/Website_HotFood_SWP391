<%-- 
    Document   : single.jsp
    Created on : May 16, 2023, 2:09:08 PM
    Author     : minhhieu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>${product.pName}</title>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="description" content="Colo Shop Template" />
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
    <link rel="stylesheet" href="plugins/themify-icons/themify-icons.css" />
    <link
      rel="stylesheet"
      type="text/css"
      href="plugins/jquery-ui-1.12.1.custom/jquery-ui.css"
    />
    <link rel="stylesheet" type="text/css" href="styles/single_styles.css" />
    <link
      rel="stylesheet"
      type="text/css"
      href="styles/single_responsive.css"
    />
    <link rel="stylesheet" href="styles/myCss.css" />
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
                    <li><a href="home">Combo</a></li>
                    <li><a href="category">categories</a></li>
                    <li><a href="home">best seller</a></li>
                  </ul>
                  <ul class="navbar_user">
                    <li>
                      <a href="#"
                        ><i class="fa fa-search" aria-hidden="true"></i
                      ></a>
                    </li>
                    <li>
                      <a href="login.jsp"
                        ><i class="fa fa-user" aria-hidden="true"></i
                      ></a>
                    </li>
                    <li class="checkout">
                      <a href="#">
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
            <li class="menu_item"><a href="#">Combo</a></li>
            <li class="menu_item"><a href="category">Categories</a></li>
            <li class="menu_item"><a href="#">Best Seller</a></li>
          </ul>
        </div>
      </div>

      <div class="container single_product_container">
        <div class="row">
          <div class="col">
            <!-- Breadcrumbs -->

            <div class="breadcrumbs d-flex flex-row align-items-center">
              <ul>
                <li><a href="home">Home</a></li>
                <li>
                  <a href="category"
                    ><i class="fa fa-angle-right" aria-hidden="true"></i>All</a
                  >
                </li>
                <li class="active">
                  <a href="#"
                    ><i class="fa fa-angle-right" aria-hidden="true"></i>${product.pName}</a
                  >
                </li>
              </ul>
            </div>
          </div>
        </div>

        <div class="row">
          <div class="col-lg-7">
            <div class="single_product_pics">
              <div class="row">
                <div class="col-lg-9 image_col order-lg-2 order-1">
                  <div class="single_product_image">
                    <div
                      class="single_product_image_background"
                      style="background-image: url(${product.pImg})"
                    ></div>
                  </div>
                </div>
              </div>
            </div>
          </div>
                <div class="col-lg-5">
                  <div class="product_details">
                    <div class="product_details_title">
                      <h2>${product.pName}</h2>
                      <p>
                        ${product.pDetail}
                      </p>
                    </div>
                    <div
                      class="free_delivery d-flex flex-row align-items-center justify-content-center"
                    >
                      <span class="ti-truck"></span><span>free delivery</span>
                    </div>
                    <!--<div class="original_price">$629.99</div>-->
                    <div class="product_price">${product.pPrice}</div>
                    <!-- <ul class="star_rating">
                      <li><i class="fa fa-star" aria-hidden="true"></i></li>
                      <li><i class="fa fa-star" aria-hidden="true"></i></li>
                      <li><i class="fa fa-star" aria-hidden="true"></i></li>
                      <li><i class="fa fa-star" aria-hidden="true"></i></li>
                      <li><i class="fa fa-star-o" aria-hidden="true"></i></li>
                    </ul> -->
                    <!-- <div class="product_color">
                      <span>Select Color:</span>
                      <ul>
                        <li style="background: #e54e5d"></li>
                        <li style="background: #252525"></li>
                        <li style="background: #60b3f3"></li>
                      </ul>
                    </div> -->
                    <div
                      class="quantity d-flex flex-column flex-sm-row align-items-sm-center"
                    >
                      <span>Quantity:</span>
                      <div class="quantity_selector">
                        <span class="minus"
                          ><i class="fa fa-minus" aria-hidden="true"></i
                        ></span>
                        <span id="quantity_value">1</span>
                        <span class="plus"
                          ><i class="fa fa-plus" aria-hidden="true"></i
                        ></span>
                      </div>
                      <div class="red_button add_to_cart_button">
                        <a href="#">add to cart</a>
                      </div>
                      <div
                        class="product_favorite d-flex flex-column align-items-center justify-content-center"
                      ></div>
                    </div>
                  </div>
                </div>
        </div>
      </div>

      

      <!-- Benefit -->

      <!-- Benefit -->

            <div class="benefit">
                <div class="container">
                    <div class="row benefit_row">
                        <div class="col-lg-3 benefit_col">
                            <div class="benefit_item d-flex flex-row align-items-center">
                                <div class="benefit_icon">
                                    <i class="fa fa-truck" aria-hidden="true"></i>
                                </div>
                                <div class="benefit_content">
                                    <h6>free shipping</h6>
                                    <p>Free and fast food delivery</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 benefit_col">
                            <div class="benefit_item d-flex flex-row align-items-center">
                                <div class="benefit_icon">
                                    <i class="fa fa-money" aria-hidden="true"></i>
                                </div>
                                <div class="benefit_content">
                                    <h6>cach on delivery</h6>
                                    <p>The Internet Tend To Repeat</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 benefit_col">
                            <div class="benefit_item d-flex flex-row align-items-center">
                                <div class="benefit_icon">
                                    <i class="fa fa-user" aria-hidden="true"></i>
                                </div>
                                <div class="benefit_content">
                                    <h6>Friendly employee</h6>
                                    <p>Always bring you comfort</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 benefit_col">
                            <div class="benefit_item d-flex flex-row align-items-center">
                                <div class="benefit_icon">
                                    <i class="fa fa-clock-o" aria-hidden="true"></i>
                                </div>
                                <div class="benefit_content">
                                    <h6>opening all week</h6>
                                    <p>8AM - 10PM</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Footer -->

            <footer class="footer" style="background-color: #f3f3f3">
                <div class="container" style="margin-top: 50px">
                    <div class="row" style="margin-top: 50px">
                        <div style="margin-bottom: 30px; padding-top: 40px">Google Map</div>
                        <iframe
                            src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3835.863921098815!2d108.25836811464994!3d15.968481188943292!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3142116949840599%3A0x365b35580f52e8d5!2zxJDhuqFpIGjhu41jIEZQVCAoRlBUIHVuaXZlcnNpdHkp!5e0!3m2!1sen!2s!4v1679321561252!5m2!1sen!2s"
                            width="1100"
                            height="350"
                            style="border: 0; margin-bottom: 50px"
                            allowfullscreen=""
                            loading="lazy"
                            referrerpolicy="no-referrer-when-downgrade"
                            ></iframe>
                    </div>
                    <hr
                        _ngcontent-ng-cli-universal-c81=""
                        style="color: #c0c0c0; background-color: #c0c0c0"
                        />
                    <div class="row">
                        <div class="col-lg-6">
                            <div
                                class="footer_nav_container d-flex flex-sm-row flex-column align-items-center justify-content-lg-start justify-content-center text-center"
                                >
                                <ul class="footer_nav">
                                    <li><a href="#">Blog</a></li>
                                    <li><a href="#">FAQs</a></li>
                                    <li><a href="contact.jsp">Contact us</a></li>
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
    <script src="plugins/Isotope/isotope.pkgd.min.js"></script>
    <script src="plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
    <script src="plugins/easing/easing.js"></script>
    <script src="plugins/jquery-ui-1.12.1.custom/jquery-ui.js"></script>
    <script src="js/single_custom.js"></script>
  </body>
</html>