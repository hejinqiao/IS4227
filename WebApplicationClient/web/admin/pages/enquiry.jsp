<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<!DOCTYPE html>


    <%@include file="templates/Head.jsp" %>
        
        <script src="../bower_components/bootstrap/dist/css/dataTables.bootstrap.css"></script>

        <!-- jQuery -->
        <script src="../bower_components/jquery/dist/jquery-1.11.1.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="../bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="../bower_components/metisMenu/dist/metisMenu.min.js"></script>

        <!-- DataTables JavaScript -->
        <script src="../bower_components/DataTables/media/js/jquery.dataTables.js"></script>
        <script src="../bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="../dist/js/sb-admin-2.js"></script>
        
         <script type="text/javascript">
            $(document).ready(function () {
              $('#dataTableID').dataTable({ 
                 "pagingType":"full_numbers"
                });
            });
            
            function geneServerTable(){
                
             var t =  $('#dataTableID').dataTable( {
                    "info":true,
                   "pagingType": "full_numbers"
                });
            }
        </script>  

    <body>
        
        <div id="wrapper">

            <%@include file="templates/Navigator.jsp" %>
            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Enquiry management</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Tables
                            </div>
                            <!-- /.panel-heading -->
                            <div class="panel-body">
                                <table id="dataTableID" class="table table-bordered table-hover table-striped" >
                                        <thead>
                                            <tr>
                                                <th>Enquiry ID</th>
                                                <th>User Email</th>
                                                <th>Content</th>
                                                <th>Is replied</th>
                                            </tr>
                                        </thead>
                                        <tbody>  
                                            <%-- start web service invocation --%>
                                            <%
                                                try { //get list of all accounts

                                                    wss.EnquiryWebService_Service service = new wss.EnquiryWebService_Service();
                                                    wss.EnquiryWebService port = service.getEnquiryWebServicePort();
                                                    // TODO process result here
                                                    System.err.println("Enquiry Webservice invoked");
                                                   // String adminId = (String) session.getAttribute("adminId");
                                                    Long adminId = Long.valueOf(1);
                                          
                                                    String result = port.viewAllEnquiry(adminId); 
                                                    JSONArray array = new JSONArray(result);
                                                    System.err.println("Array size is: " + array.length());
                                                    for (int i = 0; i < array.length(); i++) {
                                                        JSONObject obj = array.getJSONObject(i);
                                                        String accountEmail = obj.getString("email");
                                                        Long enquiryId = obj.getLong("enquiryId");
                                                        String content = obj.getString("content");
                                                        String replied = obj.getBoolean("repied")? "yes" : "no";
                                                        String rowNumber = (i % 2 == 0) ? "even" : "odd";

                                                        out.println("<tr class=\"" + rowNumber + " gradeX\">");
                                                        out.println("<td>" + enquiryId + "</td>");
                                                        out.println("<td>" + accountEmail + "</td>");
                                                        out.println("<td><a href=\"singleEnquiry.jsp?enquiryId="+enquiryId+"\">" + content + "</a></td>");
                                                        out.println("<td>" + replied + "</td>");
                                               
                                                        out.println("</tr>");
                                                    }
                                                } catch (Exception ex) {
                                                    // TODO handle custom exceptions here
                                                }
                                            %>
                                            <%-- end web service invocation --%>
                                        </tbody>
                                    </table>
                                    
                            </div>
                            <!-- /.panel-body -->
                        </div>
                        <!-- /.panel -->
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                
                <!-- /.row -->
            </div>
            <!-- /#page-wrapper -->

        </div>
        <!-- /#wrapper -->
         <!-- Page-Level Demo Scripts - Tables - Use for reference -->
       

    </body>

</html>
