<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
    <%@include file="templates/head.jsp"%>
<body>
	<!-- header-section-starts -->
	<div class="header">
            <div class="top-header">
			<div class="wrap">
                            
				<div class="header-right">
					<ul>
						<li>
							<i class="user"></i>
							<%if (session.getAttribute("userid")!=null){ %>
                                                        <a href="viewAccount.jsp"><%out.print(session.getAttribute("useremail"));%></a>
                                                        <%} else{ %>
                                                        <a href="login.jsp">Login</a>
                                                        <% } %>
						</li>
                                                
                                                <%if (session.getAttribute("userid")!=null){ %>
                                                <li>
							<i class="cart"></i>
							<a href="#">Shopping Cart</a>
						</li>
						<li class="last">5</li>
                                                <%}%>
                                                
						<li class="login">
							<i class="lock"></i>
							<%if (session.getAttribute("userid")!=null){ %>
							<a href="logout.jsp">Logout</a>
                                                        <%} else{ %>               
							<a href="register.jsp">Sign up</a>
                                                        <% } %>
						</li>
						
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="wrap">
                    <hr/>
    
			<div class="header-bottom">
				<div class="logo">
					<a href="index.jsp"><img src="images/logo-4227.png" class="img-responsive" alt="" /></a>
				</div>
				
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- header-section-ends -->
	<div class="wrap">
                    <%@include  file="templates\navigator.jsp" %>
		<!-- start main -->
<div class="main_bg">
	<div class="main">	   		           	         
		<!-- start span1_of_1 -->
			<div class="left_content">
			<div class="span_1_of_left">
				<div class="grid images_3_of_2">
						<ul id="etalage">
							<li>
								<a href="optionallink.html">
									<img class="etalage_thumb_image" src="images/d1.jpg" class="img-responsive" />
									<img class="etalage_source_image" src="images/d1.jpg" class="img-responsive" title="" />
								</a>
							</li>
							<li>
								<img class="etalage_thumb_image" src="images/d2.jpg" class="img-responsive" />
								<img class="etalage_source_image" src="images/d2.jpg" class="img-responsive" title="" />
							</li>
							<li>
								<img class="etalage_thumb_image" src="images/d3.jpg" class="img-responsive"  />
								<img class="etalage_source_image" src="images/d3.jpg"class="img-responsive"  />
							</li>
						    <li>
								<img class="etalage_thumb_image" src="images/d4.jpg" class="img-responsive"  />
								<img class="etalage_source_image" src="images/d4.jpg"class="img-responsive"  />
							</li>
						</ul>
						 <div class="clearfix"></div>		
				  </div>

			<!-- start span1_of_1 -->
			<div class="span1_of_1_des">
				  <div class="desc1">
					<h3>Lorem Ipsum is simply dummy text </h3>
					<p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.</p>
                                        
					<div class="available">
						<h4>Available Options :</h4>
						<ul>
							<li>Color:
								<select>
								<option>Silver</option>
								<option>Black</option>
								<option>Dark Black</option>
								<option>Red</option>
							</select></li>
							<li>Size:
								<select>
									<option>L</option>
									<option>XL</option>
									<option>S</option>
									<option>M</option>
								</select>
							</li>
							<li>Quality:
								<select>
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
									<option>5</option>
								</select>
							</li>
						</ul>
						<div class="btn_form">
							<form>
								<input type="submit" value="add to cart" title="" />
							</form>
						</div>
						<span class="span_right"><a href="#">login to save in wishlist </a></span>
						<div class="clearfix"></div>
					</div>
					
                                        <%-- start web service invocation --%><hr/>
    <%
    try {
	wss.ProductMgtWS_Service service = new wss.ProductMgtWS_Service();
	wss.ProductMgtWS port = service.getProductMgtWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.Long accountId = Long.valueOf(1L);
	java.lang.Long itemId = Long.valueOf(1L);
	java.lang.Double rating = Double.parseDouble(request.getParameter("mark"));
	java.lang.String content = request.getParameter("content");
	port.rateProduct(accountId, itemId, rating, content);
    } catch (Exception ex) {
	out.println("wrong");
    }
    %>
    <%-- end web service invocation --%><hr/>

		
			
			   	 </div>
			   	</div>
					<div class="clearfix"></div>
				</div>
                        <div class="device">
			   <div class="course_demo">
                               <table BORDER="1" CELLPADDING="5" CELLSPACING="5" class="flatTable">
                                   <thead>
                                       <tr class="headingTr">
                                           <th>
                                               <h3>Contents</h3>
                                           </th>
                                           <th>
                                               <h3>Marks</h3>
                                           </th>
                                       </tr>
                                   </thead>                                  
                                   <tbody>
                                        <%-- start web service invocation --%><hr/>
                <%
                try {
                    wss.ProductMgtWS_Service service = new wss.ProductMgtWS_Service();
                    wss.ProductMgtWS port = service.getProductMgtWSPort();
                     // TODO initialize WS operation arguments here
                    java.lang.Long itemId = Long.valueOf(1L);
                    // TODO process result here
                    java.util.List<wss.CommentEntity> result = port.viewAllCommentsOfProduct(itemId);                 
                    if(result.size()==0) {
                        out.println("<tr>Sorry, no comments so far..</tr>");
                        out.println("<h5>Overall Rating: 0.0</h5>");
                    }
                    
                    java.lang.String content;
                    java.lang.Double mark;
                    java.lang.Double average = 0.0;
                    
                    for(Object o: result){
                        mark = ((wss.CommentEntity) o).getRating();
                        content = ((wss.CommentEntity) o).getContents();
                        out.println("<tr>");
                        out.println("<td>" +content + "</td>");    
                        out.println("<td>" +mark + "</td>");
                        out.println("</tr>");
                        average += mark;
                    }
                    out.println("<h5>Overall Rating: </h5>" + String.format("%.2f", average/result.size()));
                } catch (Exception ex) {
                    out.println("<tr>Sorry, no comments so far..</tr>");
                    out.println(ex);
                }
                %>
                <%-- end web service invocation --%><hr/>
  
                                   </tbody>
                               </table>
	  </div>
	  </div>
                            <div class="device">
			<div class="course_demo">
		          <ul id="flexiselDemo">	
					<li>
						<div class="ipad text-center">
							<img src="images/phone.jpg" alt="" />
							<h4>Ipad Mini</h4>
							<h3>$499</h3>
							<ul>
								<li><i class="cart-1"></i></li>
								<li><a class="cart" href="#">Add To Cart</a></li>
							</ul>
							<div class="clearfix"></div>
							<ul>
								<li><i class="heart"></i></li>
								<li><a class="cart" href="#">Add To Wishlist</a></li>
							</ul>
						</div>
					</li>
					<li>
					<div class="ipad text-center">
							<img src="images/phone1.jpg" alt="" />
							<h4>Ipad Mini</h4>
							<h3>$499</h3>
							<ul>
								<li><i class="cart-1"></i></li>
								<li><a class="cart" href="#">Add To Cart</a></li>
							</ul>
							<div class="clearfix"></div>
							<ul>
								<li><i class="heart"></i></li>
								<li><a class="cart" href="#">Add To Wishlist</a></li>
							</ul>
						</div>
                                        </li>
					<li>
					<div class="ipad text-center">
							<img src="images/phone2.jpg" alt="" />
							<h4>Ipad Mini</h4>
							<h3>$499</h3>
							<ul>
								<li><i class="cart-1"></i></li>
								<li><a class="cart" href="#">Add To Cart</a></li>
							</ul>
							<div class="clearfix"></div>
							<ul>
								<li><i class="heart"></i></li>
								<li><a class="cart" href="#">Add To Wishlist</a></li>
							</ul>
						</div>
					</li>	
					<li>
					<div class="ipad text-center">
							<img src="images/phone3.jpg" alt="" />
							<h4>Ipad Mini</h4>
							<h3>$499</h3>
							<ul>
								<li><i class="cart-1"></i></li>
								<li><a class="cart" href="#">Add To Cart</a></li>
							</ul>
							<div class="clearfix"></div>
							<ul>
								<li><i class="heart"></i></li>
								<li><a class="cart" href="#">Add To Wishlist</a></li>
							</ul>
						</div>
					</li>	
					<li>
					<div class="ipad text-center">
							<img src="images/phone4.jpg" alt="" />
							<h4>Ipad Mini</h4>
							<h3>$499</h3>
							<ul>
								<li><i class="cart-1"></i></li>
								<li><a class="cart" href="#">Add To Cart</a></li>
							</ul>
							<div class="clearfix"></div>
							<ul>
								<li><i class="heart"></i></li>
								<li><a class="cart" href="#">Add To Wishlist</a></li>
							</ul>
						</div>
					</li>							    	  	       	   	  									    	  	       	   	    	
				</ul>
			</div>
		</div>
			   	</div>

	<div class="sub-cate single-subcate">
				<div class=" top-nav rsidebar span_1_of_left">
					<h3 class="cate">CATEGORIES</h3>
		 <ul class="menu">
		<li class="item1"><a href="#">Curabitur sapien<img class="arrow-img" src="images/arrow1.png" alt=""/> </a>
			<ul class="cute">
				<li class="subitem1"><a href="products.html">Cute Kittens </a></li>
				<li class="subitem2"><a href="products.html">Strange Stuff </a></li>
				<li class="subitem3"><a href="products.html">Automatic Fails </a></li>
			</ul>
		</li>
		<li class="item2"><a href="#">Dignissim purus <img class="arrow-img " src="images/arrow1.png" alt=""/></a>
			<ul class="cute">
				<li class="subitem1"><a href="products.html">Cute Kittens </a></li>
				<li class="subitem2"><a href="products.html">Strange Stuff </a></li>
				<li class="subitem3"><a href="products.html">Automatic Fails </a></li>
			</ul>
		</li>
		<li class="item3"><a href="#">Ultrices id du<img class="arrow-img img-arrow" src="images/arrow1.png" alt=""/> </a>
			<ul class="cute">
				<li class="subitem1"><a href="products.html">Cute Kittens </a></li>
				<li class="subitem2"><a href="products.html">Strange Stuff </a></li>
				<li class="subitem3"><a href="products.html">Automatic Fails</a></li>
			</ul>
		</li>
		<li class="item4"><a href="#">Cras iacaus rhone <img class="arrow-img img-left-arrow" src="images/arrow1.png" alt=""/></a>
			<ul class="cute">
				<li class="subitem1"><a href="products.html">Cute Kittens </a></li>
				<li class="subitem2"><a href="products.html">Strange Stuff </a></li>
				<li class="subitem3"><a href="products.html">Automatic Fails </a></li>
			</ul>
		</li>
				<li>
			<ul class="kid-menu">
				<li><a href="products.html">Tempus pretium</a></li>
				<li ><a href="product.html">Dignissim neque</a></li>
				<li ><a href="product.html">Ornared id aliquet</a></li>
			</ul>
		</li>
		<ul class="kid-menu ">
				<li><a href="products.html">Commodo sit</a></li>
				<li ><a href="products.html">Urna ac tortor sc</a></li>
				<li><a href="products.html">Ornared id aliquet</a></li>
				<li><a href="products.html">Urna ac tortor sc</a></li>
				<li ><a href="products.html">Eget nisi laoreet</a></li>
				<li><a href="products.html">Faciisis ornare</a></li>
				<li class="menu-kid-left"><a href="contact.html">Contact us</a></li>
			</ul>
	</ul>
					</div>
				<!--initiate accordion-->
		<script type="text/javascript">
			$(function() {
			    var menu_ul = $('.menu > li > ul'),
			           menu_a  = $('.menu > li > a');
			    menu_ul.hide();
			    menu_a.click(function(e) {
			        e.preventDefault();
			        if(!$(this).hasClass('active')) {
			            menu_a.removeClass('active');
			            menu_ul.filter(':visible').slideUp('normal');
			            $(this).addClass('active').next().stop(true,true).slideDown('normal');
			        } else {
			            $(this).removeClass('active');
			            $(this).next().stop(true,true).slideUp('normal');
			        }
			    });
			
			});
		</script>
					<div class=" chain-grid menu-chain text-center">
	   		     		<a href="single.html"><img class="img-responsive chain" src="images/phonei.jpg" alt=" " /></a>	   		     		
	   		     		<div class="grid-chain-bottom chain-watch">
		   		     		<span class="actual dolor-left-grid">300$</span>
		   		     		<span class="reducedfrom">500$</span>  
		   		     		<h6>Lorem ipsum dolor</h6>  		     			   		     										
	   		     		</div>
	   		     	</div>
	   		     	 <a class="view-all all-product" href="products.html">VIEW ALL PRODUCTS<span> </span></a> 	
					  <div class="clearfix"> </div>
			</div>
	 <div class="clearfix"> </div>
</div>
</div>
</div>	
                <%@include file="templates/footer.jsp"%>
</body>
</html>