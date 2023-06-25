<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Admin page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1" >
        <link rel="stylesheet" href="styles/myCss.css" />
        <link rel="shortcut icon" type="image/png" href="assets/images/icon/favicon.ico">
        <link rel="stylesheet" href="styles/assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="styles/assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="styles/assets/css/themify-icons.css">
        <link rel="stylesheet" href="styles/assets/css/metisMenu.css">
        <link rel="stylesheet" href="styles/assets/css/owl.carousel.min.css">
        <link rel="stylesheet" href="styles/assets/css/slicknav.min.css">
        <!-- amchart css -->
        <link rel="stylesheet" href="https://www.amcharts.com/lib/3/plugins/export/export.css" type="text/css"
              media="all" />
        <!-- others css -->
        <link rel="stylesheet" href="styles/assets/css/typography.css">
        <link rel="stylesheet" href="styles/assets/css/default-css.css">
        <link rel="stylesheet" href="styles/assets/css/styles.css">
        <link rel="stylesheet" href="styles/assets/css/responsive.css">
        <!-- modernizr css -->
        <script src="assets/js/vendor/modernizr-2.8.3.min.js"></script>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="styles/main_styles.css" />
        <style>
           tbody th{
                font-weight: normal;
                font-size: 14px;
            }
        </style>
    </head>
    <body>
        <div class="page-container" style="height: 100%;width: 100%;margin: 0;display: table;">
            <!-- sidebar menu area start -->
            <div class="sidebar-menu" style="background-color: whitesmoke">
                <div class="sidebar" style="position: absolute; padding: 50px 200px;background-color: whitesmoke;margin: 0px 35px">
                    <div class="logo_container">
                        <a href="home">hot<span>food</span></a>
                    </div>
                </div>
                <div class="main-menu" style="margin-top: 60px">
                    <div class="menu-inner">
                        <nav style="padding-top: 70px">
                            <ul class="metismenu" id="menu">
                                <li><a href="product"><i class="fa fa-cutlery" aria-hidden="true"></i><span>Manage Product</span></a></li>
                                <li><a href="user"><i class="fa fa-user" aria-hidden="true"></i><span>Manage User</span></a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>

            <div class="main-content" style="background-color: white">
                <!-- header area start -->
                <div class="header-area">
                    <div class="row align-items-center">
                        <!-- nav and search button -->
                        <div class="col-md-6 col-sm-8 clearfix">
                            <div class="nav-btn pull-left">
                                <span></span>
                                <span></span>
                                <span></span>
                            </div>
                            <div class="search-box pull-left">
                                <form action="#">
                                    <input type="text" name="search" placeholder="Search..." required>
                                    <i class="fa fa-search" aria-hidden="true"></i>
                                </form>
                            </div>
                        </div>
                        <!-- profile info & task notification -->

                    </div>
                </div>
                <!-- header area end -->
                <!-- page title area start -->
                <div class="page-title-area" style="background-color: #F3F3F3">
                    <div class="row align-items-center">
                        <div class="col-sm-6">
                            <div class="breadcrumbs-area clearfix">
                                <h4 class="page-title pull-left">Management Page</h4>                              
                                <ul class="breadcrumbs pull-left">
                                    <li><span>Manage User</span></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-sm-6 clearfix">
                            <div class="user-profile pull-right" style="background-color: #fe4c50">
                                <img class="avatar user-thumb" src="styles/assets/download.png" alt="avatar">
                                <h4 class="user-name dropdown-toggle" data-toggle="dropdown">Hello, Tai!<i
                                        class="fa fa-angle-down"></i></h4>
                                <div class="dropdown-menu" style="width: fit-content">                                   
                                    <a class="dropdown-item" href="home">Log Out</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>      

                <div class="content" style="padding: 20px 30px">
                    <div class="table-wrapper" >
                        <!--                        <div class="table-title">
                                                    <div class="row">                                
                                                        <div class="col-12">
                                                            <ul class="metismenu d-flex" id="menu">
                                                                <li><a href="addAdminManager.jsp"><i class="fa fa-plus-circle" aria-hidden="true"></i><span>Add new admin/manager</span></a></li>
                                                                <li><a href="#"><i class="fa fa-trash-o" aria-hidden="true"></i><span>Delete</span></a></li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>-->
                        <table class="table table-striped table-hover">
                            <thead>
                                <tr>

                                    <th>ID</th>
                                    <th>Username</th>
                                    <th>Full name</th>
                                    <th>Phone number</th>                                   
                                    <th>Email</th>
                                    <th>Role</th>
                                    <th>Edit</th>
                                </tr>
                            <tbody>
                                <c:forEach items="${user}" var="p">
                                    <tr>                                       
                                        <th>${p.aId}</th>
                                        <th>${p.aUsername}</th>
                                        <th>${p.aFullname}</th> 
                                        <th>${p.aPhone}</th> 
                                        <th>${p.aEmail}</th>   
                                        <th>
                                            <c:choose>
                                                <c:when test="${p.aRole == 0}">
                                                    <p>Customer</p>
                                                </c:when>
                                                <c:when test="${p.aRole == 1}">
                                                    <p>Manager</p>
                                                </c:when>
                                                <c:otherwise>
                                                    <p>Admin</p>
                                                </c:otherwise>
                                            </c:choose>
                                        </th>
                                        <th>
                                            <a href="editUser?aid=${p.aId}"><i class="fa fa-pencil-square-o " aria-hidden="true"></i></a>
                                        </th>
                                        <th>
                                            <a href="DeleteUser?aid=${p.aId}"><i class="fa fa-trash-o " aria-hidden="true"></i></a>
                                        </th>
                                    </tr>    
                                </c:forEach>
                            </tbody>
                            </thead>
                        </table>
                    </div>
                </div>
            </div>



            <footer style="background-color: #f3f3f3;display: table-row;height: 0;">
                <div class="container">
                    <hr
                        _ngcontent-ng-cli-universal-c81=""
                        style="color: #c0c0c0; background-color: #c0c0c0"
                        />
                    <div class="row">
                        <div class="col-lg-3">
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
                        <div class="col-lg-9">
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







        <!-- jquery latest version -->
        <script src="styles/assets/js/vendor/jquery-2.2.4.min.js"></script>
        <!-- bootstrap 4 js -->
        <script src="styles/assets/js/popper.min.js"></script>
        <script src="styles/assets/js/bootstrap.min.js"></script>
        <script src="styles/assets/js/owl.carousel.min.js"></script>
        <script src="styles/assets/js/metisMenu.min.js"></script>
        <script src="styles/assets/js/jquery.slimscroll.min.js"></script>
        <script src="styles/assets/js/jquery.slicknav.min.js"></script>

        <!-- start chart js -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.min.js"></script>
        <!-- start highcharts js -->
        <script src="https://code.highcharts.com/highcharts.js"></script>
        <!-- start zingchart js -->
        <script src="https://cdn.zingchart.com/zingchart.min.js"></script>
        <script>
            zingchart.MODULESDIR = "https://cdn.zingchart.com/modules/";
            ZC.LICENSE = ["569d52cefae586f634c54f86dc99e6a9", "ee6b7db5b51705a13dc2339db3edaf6d"];
        </script>
        <!-- all line chart activation -->
        <script src="styles/assets/js/line-chart.js"></script>
        <!-- all pie chart -->
        <script src="styles/assets/js/pie-chart.js"></script>
        <!-- others plugins -->
        <script src="styles/assets/js/plugins.js"></script>
        <script src="styles/assets/js/scripts.js"></script>
    </body>

</html>