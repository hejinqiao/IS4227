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
		<!-- start login -->
		<section id="main">
	<div class="new-product">
				<div class="new-product-top">
				<div class="pag-nav">
					<ul class="p-list">
						<li><a href="index.jsp">Home</a></li> &nbsp;&nbsp;/&nbsp;
						<li class="act">&nbsp;Contact</li>
					</ul>
				</div>
                                    <%
                             java.lang.Long eId = Long.valueOf(request.getParameter("enquiryId"));
                             %>
				<div class="coats">
			        <h3 class="c-head">Reply Enquiry <%=eId%></h3>
		        </div>
					<div class="clearfix"></div>
				</div>
				<div class="singel_right">
			     <div class="lcontact span_1_of_contact">
                                 <div class="clearfix"></div>
				      <div class="contact-form">
                                            <form method="post" action="processPost.jsp">
                                                <p class="comment-form-author"><label for="author">Reply Message:</label>
                                                    <textarea name="content" value="Enter your reply here..." onfocus="this.value = '';" onblur="if (this.value === '') {this.value = 'Message';}">Enter your message here...</textarea>
                                                </p>
                                                <input type="hidden" name="enquiryId" value=<%=eId%>> 
                                                <input name="submit" type="submit" id="submit" value="Submit">
                                            </form>
				       </div>
			     </div>
			     <div class="contact_grid span_2_of_contact_right">
                                    <%-- start web service invocation --%><hr/>
    <%
    try {
	wss.EnquiryMgtWS_Service service = new wss.EnquiryMgtWS_Service();
	wss.EnquiryMgtWS port = service.getEnquiryMgtWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.Long adminId = Long.valueOf(1L);
	java.lang.Long enquiryId = Long.valueOf(request.getParameter("enquiryId"));
	// TODO process result here
	wss.EnquiryEntity result = port.viewOneEnquiry(adminId, enquiryId);
	java.lang.Long id = result.getId();
        java.lang.String content = result.getContent();
        java.lang.Boolean status = result.isReplied();
        java.lang.String dat = result.getDate().toString().substring(0, 10);
        java.lang.Long accountId = result.getAccountId();%>
                        <h3>Enquiry Details</h3>
                                        <div class="address">
                                            Reference ID : <%=id%>
					</div>
					<div class="address">
                                            Content: <%=content%>
					</div>
					<div class="address">
                                            Replied: <%=status%>
					</div>
                                        <div class="address">
                                            Submit Date: <%=dat%>
					</div><div class="address">
                                            Related Account: <%=accountId%>
					</div>
                                            <%
    } catch (Exception ex) {
	out.println("Sorry, no content can be retrived..");
    }
    %>
    <%-- end web service invocation --%><hr/>
 
					
		        </div>
		        <div class="clearfix"></div>
		    </div>
		  
			</div>
			<div class="clearfix"></div>
		</div>
                   <%@include file ="templates/footer.jsp"%>
</body>
</html>