<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>


<html>
    <head>
        <title>用户页面</title>
        <%@ include file="/pages/common/header.jsp"%>
    </head>
    <body>
    <!--header-->
    
    
    
    <!--header-->
    <div class="header">
        <div class="container">
            <nav class="navbar navbar-default" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <h1 class="navbar-brand"><a href="index.action">猫狗大师</a></h1>
                </div>
                <!--navbar-header-->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="index.action" class="active">首页</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle " data-toggle="dropdown">宠物分类<b class="caret"></b></a>
                            <ul class="dropdown-menu multi-column columns-2">
                                <li>
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <h4>宠物分类</h4>
                                            <ul class="multi-column-dropdown">
    
                                                <li><a class="list" href="booktypes_list.action?pageNumber=1&btid=-1">全部系列</a></li>

                                            </ul>
                                        </div>
    
                                    </div>
    
                                </li>
    
                            </ul>
                        </li>
    
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle " data-toggle="dropdown">猫狗商城<b class="caret"></b></a>
                            <ul class="dropdown-menu multi-column columns-2">
                                <li>
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <h4>狗狗商品</h4>
                                            <ul class="multi-column-dropdown">
                                                <li><a class="list" href="booktypes_list.action?pageNumber=1&btid=-1">狗狗狗粮</a></li>

                                            </ul>
    
                                            <h4>猫猫商品</h4>
                                            <ul class="multi-column-dropdown">
                                                <li><a class="list" href="booktypes_list.action?pageNumber=1&btid=-1">猫猫猫粮</a></li>
    
                                                


                                                    <li><a class="list" href="booktypes_list.action?pageNumber=1&btid=9">悬疑推理小说</a></li>
                                                
                                                    <li><a class="list" href="booktypes_list.action?pageNumber=1&btid=10">中国当代小说</a></li>
                                                
                                            </ul>
    
                                        </div>
    
                                    </div>
    
                                </li>
    
                            </ul>
                        </li>
    
                        
                            
                            
                                <li><a href="order_list.action" >我的订单</a></li>
                                <li><a href="pages/user/user_center.jsp" >个人中心</a></li>
                                <li><a href="logout.action" >退出</a></li>


                    </ul>
                    <!--/.navbar-collapse-->
                </div>
                <!--//navbar-header-->
            </nav>
            <div class="header-info">
                <div class="header-right search-box">
                    <a href="javascript:;"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></a>
                    <div class="search">
                        <form class="navbar-form" action="search_books.action">
                            <input type="hidden" name="pageNumber" value="1"/>
                            <input type="text" class="form-control" name="keyword">
                            <button type="submit" class="btn btn-default " aria-label="Left Align">搜索</button>
                        </form>
                    </div>
                </div>
    
                <div class="header-right cart">
                    <a href="book_cart.jsp">
                        <span class="glyphicon glyphicon-shopping-cart " aria-hidden="true"><span class="card_num">4</span></span>
                    </a>
                </div>
                <div class="clearfix"> </div>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
    <!--//header--
    
    
    <!- banner-->
    
    <div class="banner">
        <div class="container">
            <h2 class="hdng"><a href="book_detail.action?bid=100002">增广贤文</a><span></span></h2>
            <p>今日精选推荐</p>
            <a class="banner_a" href="javascript:;" onclick="buy(100002)">立刻查看</a>
            <div class="banner-text">
                <a href="book_detail.action?bid=100002">
                    <img src="images/9787547715543_0.jpg" alt="增广贤文" width="350" height="350">
                </a>
            </div>
        </div>
    </div>
    
    <!--//banner-->
    
    <!--gallery-->
    <div class="gallery">
        <div class="container">
    
            <div class="alert alert-danger">
                <img src="images/dog.png"width="56" height="46">
                <span class="dog" style="position: absolute; top: 665px; font-size: 30px">汪星人</span>
            </div>
            <div class="gallery-grids">
                
                    <div class="col-md-4 gallery-grid glry-two">
                        <a href="book_detail.action?bid=100001">
                            <img src="images/9787559609274_0.jpg" class="img-responsive" alt="风格的要素" width="350" height="350"/>
                        </a>
                        <div class="gallery-info galrr-info-two">
                            <p>
                                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                                <a href="book_detail.action?bid=100001">查看详情</a>
                            </p>
                            <a class="shop" href="javascript:;" onclick="buy(100001)">立刻购买</a>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="galy-info">
                            <p>教育学 > 风格的要素</p>
                            <div class="galry">
                                <div class="prices">
                                    <h5 class="item_price">¥ 27.4</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                
                    <div class="col-md-4 gallery-grid glry-two">
                        <a href="book_detail.action?bid=100007">
                            <img src="images/9787300202105_0.jpg" class="img-responsive" alt="逻辑学导论" width="350" height="350"/>
                        </a>
                        <div class="gallery-info galrr-info-two">
                            <p>
                                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                                <a href="book_detail.action?bid=100007">查看详情</a>
                            </p>
                            <a class="shop" href="javascript:;" onclick="buy(100007)">立刻购买</a>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="galy-info">
                            <p>教育学 > 逻辑学导论</p>
                            <div class="galry">
                                <div class="prices">
                                    <h5 class="item_price">¥ 76.7</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                
                    <div class="col-md-4 gallery-grid glry-two">
                        <a href="book_detail.action?bid=100009">
                            <img src="images/9787117270137_0.jpg" class="img-responsive" alt="人格心理学" width="350" height="350"/>
                        </a>
                        <div class="gallery-info galrr-info-two">
                            <p>
                                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                                <a href="book_detail.action?bid=100009">查看详情</a>
                            </p>
                            <a class="shop" href="javascript:;" onclick="buy(100009)">立刻购买</a>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="galy-info">
                            <p>教育学 > 人格心理学</p>
                            <div class="galry">
                                <div class="prices">
                                    <h5 class="item_price">¥ 44.1</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                
                    <div class="col-md-4 gallery-grid glry-two">
                        <a href="book_detail.action?bid=100018">
                            <img src="images/9787558603600_0.jpg" class="img-responsive" alt="中国画白描基础" width="350" height="350"/>
                        </a>
                        <div class="gallery-info galrr-info-two">
                            <p>
                                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                                <a href="book_detail.action?bid=100018">查看详情</a>
                            </p>
                            <a class="shop" href="javascript:;" onclick="buy(100018)">立刻购买</a>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="galy-info">
                            <p>教育学 > 中国画白描基础</p>
                            <div class="galry">
                                <div class="prices">
                                    <h5 class="item_price">¥ 28.4</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                
                    <div class="col-md-4 gallery-grid glry-two">
                        <a href="book_detail.action?bid=100021">
                            <img src="images/9787500940449_0.jpg" class="img-responsive" alt="运动生理学" width="350" height="350"/>
                        </a>
                        <div class="gallery-info galrr-info-two">
                            <p>
                                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                                <a href="book_detail.action?bid=100021">查看详情</a>
                            </p>
                            <a class="shop" href="javascript:;" onclick="buy(100021)">立刻购买</a>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="galy-info">
                            <p>教育学 > 运动生理学</p>
                            <div class="galry">
                                <div class="prices">
                                    <h5 class="item_price">¥ 67.5</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                
                    <div class="col-md-4 gallery-grid glry-two">
                        <a href="book_detail.action?bid=100036">
                            <img src="images/9787213080708_0.jpg" class="img-responsive" alt="明朝那些事儿" width="350" height="350"/>
                        </a>
                        <div class="gallery-info galrr-info-two">
                            <p>
                                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                                <a href="book_detail.action?bid=100036">查看详情</a>
                            </p>
                            <a class="shop" href="javascript:;" onclick="buy(100036)">立刻购买</a>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="galy-info">
                            <p>中国古代史 > 明朝那些事儿</p>
                            <div class="galry">
                                <div class="prices">
                                    <h5 class="item_price">¥ 147.0</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                
            </div>
            <div class="clearfix"></div>
            <div class="alert alert-info">
                <img src="images/cat.png"width="56" height="46">
                <span class="dog" style="position: absolute; top: 1540px; font-size: 30px">喵星人
                </span>
            </div>
            <div class="gallery-grids">
                
                    <div class="col-md-3 gallery-grid ">
                        <a href="book_detail.action?bid=100005">
                            <img src="images/9787117266611_0.jpg" class="img-responsive" alt="病理生理学"/>
                        </a>
                        <div class="gallery-info">
                            <p>
                                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                                <a href="book_detail.action?bid=100005">查看详情</a>
                            </p>
                            <a class="shop" href="javascript:;" onclick="buy(100005)">立刻购买</a>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="galy-info">
                            <p>教育学 > 病理生理学</p>
                            <div class="galry">
                                <div class="prices">
                                    <h5 class="item_price">¥ 52.2</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                
                    <div class="col-md-3 gallery-grid ">
                        <a href="book_detail.action?bid=100012">
                            <img src="images/9787111554783_0.jpg" class="img-responsive" alt="攻读研究生必知必会"/>
                        </a>
                        <div class="gallery-info">
                            <p>
                                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                                <a href="book_detail.action?bid=100012">查看详情</a>
                            </p>
                            <a class="shop" href="javascript:;" onclick="buy(100012)">立刻购买</a>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="galy-info">
                            <p>教育学 > 攻读研究生必知必会</p>
                            <div class="galry">
                                <div class="prices">
                                    <h5 class="item_price">¥ 52.4</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                
                    <div class="col-md-3 gallery-grid ">
                        <a href="book_detail.action?bid=100017">
                            <img src="images/9787302273288_0.jpg" class="img-responsive" alt="色彩构成"/>
                        </a>
                        <div class="gallery-info">
                            <p>
                                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                                <a href="book_detail.action?bid=100017">查看详情</a>
                            </p>
                            <a class="shop" href="javascript:;" onclick="buy(100017)">立刻购买</a>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="galy-info">
                            <p>教育学 > 色彩构成</p>
                            <div class="galry">
                                <div class="prices">
                                    <h5 class="item_price">¥ 42.0</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                
                    <div class="col-md-3 gallery-grid ">
                        <a href="book_detail.action?bid=100022">
                            <img src="images/9787500919919_0.jpg" class="img-responsive" alt="运动训练学"/>
                        </a>
                        <div class="gallery-info">
                            <p>
                                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                                <a href="book_detail.action?bid=100022">查看详情</a>
                            </p>
                            <a class="shop" href="javascript:;" onclick="buy(100022)">立刻购买</a>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="galy-info">
                            <p>教育学 > 运动训练学</p>
                            <div class="galry">
                                <div class="prices">
                                    <h5 class="item_price">¥ 33.8</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                
                    <div class="col-md-3 gallery-grid ">
                        <a href="book_detail.action?bid=100037">
                            <img src="images/9787101052978_0.jpg" class="img-responsive" alt="三国志"/>
                        </a>
                        <div class="gallery-info">
                            <p>
                                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                                <a href="book_detail.action?bid=100037">查看详情</a>
                            </p>
                            <a class="shop" href="javascript:;" onclick="buy(100037)">立刻购买</a>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="galy-info">
                            <p>中国古代史 > 三国志</p>
                            <div class="galry">
                                <div class="prices">
                                    <h5 class="item_price">¥ 38.7</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                
                    <div class="col-md-3 gallery-grid ">
                        <a href="book_detail.action?bid=100038">
                            <img src="images/9787553807430_0.jpg" class="img-responsive" alt="资治通鉴"/>
                        </a>
                        <div class="gallery-info">
                            <p>
                                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                                <a href="book_detail.action?bid=100038">查看详情</a>
                            </p>
                            <a class="shop" href="javascript:;" onclick="buy(100038)">立刻购买</a>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="galy-info">
                            <p>中国古代史 > 资治通鉴</p>
                            <div class="galry">
                                <div class="prices">
                                    <h5 class="item_price">¥ 260.0</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                
                    <div class="col-md-3 gallery-grid ">
                        <a href="book_detail.action?bid=100039">
                            <img src="images/9787514352894_0.jpg" class="img-responsive" alt="山海经"/>
                        </a>
                        <div class="gallery-info">
                            <p>
                                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                                <a href="book_detail.action?bid=100039">查看详情</a>
                            </p>
                            <a class="shop" href="javascript:;" onclick="buy(100039)">立刻购买</a>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="galy-info">
                            <p>中国古代史 > 山海经</p>
                            <div class="galry">
                                <div class="prices">
                                    <h5 class="item_price">¥ 34.0</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                
                    <div class="col-md-3 gallery-grid ">
                        <a href="book_detail.action?bid=100047">
                            <img src="images/9787553474694_0.jpg" class="img-responsive" alt="福尔摩斯探案全集"/>
                        </a>
                        <div class="gallery-info">
                            <p>
                                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                                <a href="book_detail.action?bid=100047">查看详情</a>
                            </p>
                            <a class="shop" href="javascript:;" onclick="buy(100047)">立刻购买</a>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="galy-info">
                            <p>悬疑推理小说 > 福尔摩斯探案全集</p>
                            <div class="galry">
                                <div class="prices">
                                    <h5 class="item_price">¥ 110.0</h5>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                
            </div>
        </div>
    </div>
    <!--//gallery-->
    <!--subscribe-->
    <div class="subscribe"></div>
    <!--//subscribe-->
    
    
    <!--footer-->
    
    <!--footer-->
    <jsp:include page="pages/common/footer.jsp"></jsp:include>
    <!--//footer-->
    
    </body>
    </html>
    