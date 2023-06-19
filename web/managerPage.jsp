<%-- 
    Document   : managerPage
    Created on : Jun 19, 2023, 9:27:06 PM
    Author     : minhhieu
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
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
    <!-- font  -->

    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Oswald:wght@600&display=swap"
      rel="stylesheet"
    />

    <link rel="stylesheet" href="styles/managerPage.css " />
    <style></style>
  </head>
  <body>
    <div class="super_container">
      <!-- Header -->

      <header class="header trans_300">
        <!-- Top Navigation -->

        <!-- Main Navigation -->

        <!--  -->
        <div class="main_nav_container">
          <div class="container">
            <div class="row">
              <div class="col-3">
                <div class="logo_container">
                  <a href="index.html">hot<span>food</span></a>
                </div>
              </div>
              <div
                class="col-6 d-flex justify-content-center align-items-center"
              >
                <ul class="navbar_menu">
                  <li><a href="#" class="manager-center">manager order</a></li>
                </ul>
              </div>
              <div
                class="col-3 d-flex justify-content-end align-items-center profile-button"
              >
                <a href="#"
                  ><i class="fa fa-user" aria-hidden="true"></i>Hello, Minh
                  Hieu</a
                >
                <nav class="navbar">
                  <div class="hamburger_container">
                    <i class="fa fa-bars" aria-hidden="true"></i>
                  </div>
                </nav>
              </div>
            </div>
          </div>
        </div>
      </header>

      <div class="hamburger_menu">
        <div class="hamburger_close">
          <i class="fa fa-times" aria-hidden="true"></i>
        </div>
        <div class="hamburger_menu_content text-right">
          <ul class="menu_top_nav">
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
            <li class="menu_item">
              <a href="#">manager orrder</a>
            </li>
          </ul>
        </div>
      </div>

      <div class="super_container">
        <div
          class="container manager-order"
          style="height: 500px; margin-top: 200px"
        >
          <ul class="nav nav-tabs justify-content-center total-nav">
            <li class="nav-item col-12 col-sm-6 col-md-3 own-item">
              <a
                class="nav-link active text-center link-item"
                id="all-tab"
                data-toggle="tab"
                href="#confirming"
                >Confirming</a
              >
            </li>
            <li class="nav-item col-12 col-sm-6 col-md-3 own-item">
              <a
                class="nav-link text-center link-item"
                id="payment-tab"
                data-toggle="tab"
                href="#order-history"
                >Order history</a
              >
            </li>
          </ul>
          <div class="tab-content mt-5 around-content">
            <div class="tab-pane fade show active" id="confirming">
              <section>
                <div class="row d-flex justify-content-center align-content-center order-confirm" id="1">
                  <div class="col-md-2 infor-user d-flex align-content-center justify-content-center overflow-hidden"
                  >
                    <img
                      class="img-fluid rounded-0"
                      src="images/istockphoto-1223671392-612x612.jpg"
                      alt=""
                    />
                  </div>
                  <div class="col-md-3 infor-user d-flex align-content-center">
                    <span>Nguyen Phuoc Minh Hieu</span>
                  </div>
                  <div class="col-md-2 infor-user d-flex align-content-center">
                    <span>0905164454</span>
                  </div>
                  <div class="col-md-3 infor-user d-flex align-content-center">
                    <span>Dien Quang, Dien Ban, Quang Nam</span>
                  </div>
                  <div class="col-md-2 infor-user d-flex align-content-center">
                    <span>160.000d</span>
                  </div>
                </div>
              </section>

              <!-- modal  -->
              <div
                class="modal fade"
                id="modal1"
                tabindex="-1"
                role="dialog"
                aria-labelledby="myModalLabel"
                aria-hidden="true"
              >
                <div class="modal-dialog modal-lg mt-5" role="document">
                  <div class="modal-content ">
                    <!-- header  -->
                    <div class="modal-header">
                      <span class="modal-title header-user" id="myModalLabel"
                        >Nguyen Phuoc Minh Hieu's Orders</span
                      >
                      <button
                        type="button"
                        class="close"
                        data-dismiss="modal"
                        aria-label="Close"
                      >
                        <span aria-hidden="true">&times;</span>
                      </button>
                    </div>

                    <!-- body -->
                    <div class="modal-body">
                      <!-- Thêm nội dung thông tin người dùng vào đây -->
                      <div class="container total-product ">
                        <div class="row own-product h-50 ">
                          <div class="col-md-3 product-infor pb-2">
                           <img class="img-fluid rounded-0" src="images/product_8.png" alt="">
                          </div>
                          <div class="col-md-4 product-infor">
                           <span>Pizza</span>
                          </div>
                          <div class="col-md-2 product-infor">
                           <span>1</span>
                          </div>
                          <div class="col-md-3 product-infor">
                           100.000d
                          </div>
                         </div>
                         <div class="row own-product h-50">
                           <div class="col-md-3 product-infor pb-2">
                            <img class="img-fluid rounded-0" src="images/product_7.png" alt="">
                           </div>
                           <div class="col-md-4 product-infor">
                            <span>Hamburger</span>
                           </div>
                           <div class="col-md-2 product-infor">
                            <span>2</span>
                           </div>
                           <div class="col-md-3 product-infor">
                            250.000d
                           </div>
                          </div>
                      </div>
                      <div class="container product-price">
                        <div class="row d-flex justify-content-between discount-code">
                          <div class="col-5  ml-3">
                            <h5>DISCOUNT: HIEU300000</h5> 
                          </div>
                          <div class="col-4 mr-5 pr-2 d-flex align-content-center justify-content-end">
                            <h5>50.000</h5>
                          </div>
                        </div>
                        <div class="row mt-4 d-flex justify-content-between discount-code">
                          <div class="col-5  ml-3">
                            <h5>TOTAL PRICE: </h5> 
                          </div>
                          <div class="col-4 mr-5 pr-2 d-flex align-content-center justify-content-end">
                            <h5>200.000</h5>
                          </div>
                        </div>
                      </div>
                      
                     </div>
                    <div class="container footer-modal ">
                      <div class="row justify-content-center align-content-center">
                        <div class="col-3">
                          <button type="button" class="btn acp-btn" data-dismiss="modal">Accept</button>
                        </div>
                        <div class="col-3">
                          <button type="button" class="btn cancel-btn" data-dismiss="modal">Cancel</button>
                        </div>
                        
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <div class="tab-pane fade" id="order-history">
              <section>
                <div class="container mt-3">Hello</div>
              </section>
            </div>
          </div>
        </div>
        <!-- content -->

        <!-- Footer -->

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
    </div>
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="styles/bootstrap4/popper.js"></script>
    <script src="styles/bootstrap4/bootstrap.min.js"></script>
    <script src="plugins/Isotope/isotope.pkgd.min.js"></script>
    <script src="plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
    <script src="plugins/easing/easing.js"></script>
    <script src="plugins/jquery-ui-1.12.1.custom/jquery-ui.js"></script>
    <script src="js/categories_custom.js"></script>
    <script>
      // Khi phần tử có ID "1" được nhấp vào, hiển thị modal
      $('#1').click(function() {
        $('#modal1').modal('show');
      });
    </script>
  </body>
</html>

