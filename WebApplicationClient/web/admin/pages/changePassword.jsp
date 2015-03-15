<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<!DOCTYPE html>


<%@include file="templates/Head.jsp" %>

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

<body>
    <%@include file="templates/Navigator.jsp" %>

    <div id="wrapper">
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Change Password</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->

                <div class="col-lg-12">
                    <div class="panel panel-default">

                        <div class="panel-body">
                            <div class="row">
                                <%
                                    String changeResult = request.getParameter("result");
                                    if (changeResult != null) {
                                        if (changeResult.equals("success")) { %>
                                         <div class="alert alert-success">
                                Change password success.
                            </div>
                                         <%
                                        } else {
                                        %>
                                         <div class="alert alert-danger">
                               Change password fail.
                            </div>  
                                         <%
                                        }

                                    }


                                %>
                                <div class="col-lg-6">
                                    <form name="frm" action="postpages/accMgt/changePWD.jsp" onsubmit="return validate();">
                                        <label>Current password:</label>
                                        <input class="form-control" name="current1" type="password" id="current1">
                                        <br>
                                        <label>Current password again:</label>
                                        <input class="form-control" name="current2" type="password" id="current2">
                                        <br>
                                        <label>New password:</label>
                                        <input class="form-control" name="newPassword" type="password">

                                        <br>
                                        <input type="submit" class="btn btn-default"/>

                                    </form>        
                                </div>
                            </div>
                        </div>   

                    </div>
                </div>    
            </div>
            <!-- /.container-fluid -->
        </div>>\
    </div>
    <script type="text/javascript">
        function validate()
        {
            var a = document.getElementById("current1");
            var b = document.getElementById("current2");
            var valid = true;
            if (a.value.length <= 0 || b.value.length <= 0)
            {
                alert("Don't leave the field empty.");
                valid = false;
            }
            else {
                if (a.value !== b.value) {
                    alert("Pls make sure two password you entered are the same.");
                    valid = false;
                }
            }
            return valid;
        }
        ;

    </script>
</body>

</html>
