/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-10 07:33:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FlatWorldsDemo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>Flatworlds Demo</title>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\" integrity=\"sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb\" crossorigin=\"anonymous\">\r\n");
      out.write("  \t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("  \t<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular.min.js\"></script>\r\n");
      out.write("  \t <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  \t      <script src=\"http://code.jquery.com/jquery-1.9.1.js\"></script>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" />\r\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/css/bootstrap-combined.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        \r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/lib/w3-theme-teal.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    \r\n");
      out.write("  \t <style>\r\n");
      out.write("            .tree {\r\n");
      out.write("                min-height: 5px;\r\n");
      out.write("                padding: 19px;\r\n");
      out.write("                margin-bottom: 20px;\r\n");
      out.write("                background-color: #ffffff;\r\n");
      out.write("                border: 1px solid #999;\r\n");
      out.write("                -webkit-border-radius: 4px;\r\n");
      out.write("                -moz-border-radius: 4px;\r\n");
      out.write("                border-radius: 4px;\r\n");
      out.write("                -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.05);\r\n");
      out.write("                -moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.05);\r\n");
      out.write("                box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.05)\r\n");
      out.write("            }\r\n");
      out.write("            .tree li {\r\n");
      out.write("                list-style-type: none;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                padding: 10px 5px 0 5px;\r\n");
      out.write("                position: relative\r\n");
      out.write("            }\r\n");
      out.write("            .tree li::before,\r\n");
      out.write("            .tree li::after {\r\n");
      out.write("                content: '';\r\n");
      out.write("                left: -20px;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                right: auto\r\n");
      out.write("            }\r\n");
      out.write("            .tree li::before {\r\n");
      out.write("                border-left: 1px solid #999;\r\n");
      out.write("                bottom: 50px;\r\n");
      out.write("                height: 100%;\r\n");
      out.write("                top: 0;\r\n");
      out.write("                width: 1px\r\n");
      out.write("            }\r\n");
      out.write("            .tree li::after {\r\n");
      out.write("                border-top: 1px solid #999;\r\n");
      out.write("                height: 20px;\r\n");
      out.write("                top: 25px;\r\n");
      out.write("                width: 25px\r\n");
      out.write("            }\r\n");
      out.write("            .tree li span {\r\n");
      out.write("                -moz-border-radius: 5px;\r\n");
      out.write("                -webkit-border-radius: 5px;\r\n");
      out.write("                border: 1px solid #999;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                padding: 3px 8px;\r\n");
      out.write("                text-decoration: none\r\n");
      out.write("            }\r\n");
      out.write("            .tree li.parent_li>span {\r\n");
      out.write("                cursor: pointer\r\n");
      out.write("            }\r\n");
      out.write("            .tree>ul>li::before,\r\n");
      out.write("            .tree>ul>li::after {\r\n");
      out.write("                border: 0\r\n");
      out.write("            }\r\n");
      out.write("            .tree li:last-child::before {\r\n");
      out.write("                height: 30px\r\n");
      out.write("            }\r\n");
      out.write("            .tree li.parent_li>span:hover,\r\n");
      out.write("            .tree li.parent_li>span:hover+ul li span {\r\n");
      out.write("                background: #eee;\r\n");
      out.write("                border: 1px solid #94a0b4;\r\n");
      out.write("                color: #000\r\n");
      out.write("            }\r\n");
      out.write("            #dialog-window {\r\n");
      out.write("                height: 300px;\r\n");
      out.write("                border: 1px black solid;\r\n");
      out.write("            }\r\n");
      out.write("            #scrollable-content {\r\n");
      out.write("                height: 450px;\r\n");
      out.write("                overflow: auto;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write(" \r\n");
      out.write(" </script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    $(function() {\r\n");
      out.write("        $('.tree li:has(ul)').addClass('parent_li').find(' > span').attr('title', 'Collapse this branch');\r\n");
      out.write("        $('.tree li.parent_li > span').on('click', function(e) {\r\n");
      out.write("            var children = $(this).parent('li.parent_li').find(' > ul > li');\r\n");
      out.write("            if (children.is(\":visible\")) {\r\n");
      out.write("                children.hide('fast');\r\n");
      out.write("                $(this).attr('title', 'Expand this branch').find(' > i').addClass('icon-plus-sign').removeClass('icon-minus-sign');\r\n");
      out.write("            } else {\r\n");
      out.write("                children.show('fast');\r\n");
      out.write("                $(this).attr('title', 'Collapse this branch').find(' > i').addClass('icon-minus-sign').removeClass('icon-plus-sign');\r\n");
      out.write("            }\r\n");
      out.write("            e.stopPropagation();\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    angular.module('plunker', ['ui.bootstrap'])\r\n");
      out.write("    var app = angular.module('myApp', []);\r\n");
      out.write("\tapp.controller('myController', function($scope, $http) {\r\n");
      out.write("\t\t $scope.value = \"23\";\r\n");
      out.write("\t\t $scope.names = [\"equal to\", \"not equal to\", \"is blank\",\"is not blank\",\"greater than\",\"like\",\"greater than or equal\",\"less than or equal\"];\r\n");
      out.write("\t\t $scope.andOr = [\"AND\", \"OR\"];\r\n");
      out.write("\t\t $scope.column = [];\r\n");
      out.write("     \t$scope.condition = null;\r\n");
      out.write("     \t$scope.node=null;\r\n");
      out.write("\r\n");
      out.write("     \t$scope.setCurrent = function setCurrent(index) {\r\n");
      out.write("     \t    $scope.current = index;\r\n");
      out.write("     \t};\r\n");
      out.write("     \t\r\n");
      out.write("     \t$scope.setCurrentnode = function setCurrentnode(data) {\r\n");
      out.write("     \t\t//alert(data.name);\r\n");
      out.write("     \t    $scope.node = data.name;\r\n");
      out.write("     \t};\r\n");
      out.write("\r\n");
      out.write("     \t\r\n");
      out.write("\t\t \r\n");
      out.write("\t\tbuildEmptyTree();\r\n");
      out.write("\t     $scope.selectedNode = \"\";\r\n");
      out.write("\t    $scope.showNode = function(data) {\r\n");
      out.write("\t        return data.name;\r\n");
      out.write("\t     };\r\n");
      out.write("\t     $scope.tableview=function(){\r\n");
      out.write("\t    \t \r\n");
      out.write("\t     };\r\n");
      out.write("\r\n");
      out.write("\t  $scope.isClient = function(selectedNode) {\r\n");
      out.write("\r\n");
      out.write("\t         if (selectedNode == undefined) {\r\n");
      out.write("\t             return false;\r\n");
      out.write("\t         }\r\n");
      out.write("\r\n");
      out.write("\t         if (selectedNode.device_name != undefined) {\r\n");
      out.write("\t             return true;\r\n");
      out.write("\t         }\r\n");
      out.write("\r\n");
      out.write("\t         return false;\r\n");
      out.write("\t     };\r\n");
      out.write("\r\n");
      out.write("\t  function buildEmptyTree() {\r\n");
      out.write("\r\n");
      out.write("\t         $scope.displayTree =\r\n");
      out.write("\t             [{\r\n");
      out.write("\t             \"name\": \"Table\",\r\n");
      out.write("\t             \"type_name\": \"Node\",\r\n");
      out.write("\t             \"show\": true,\r\n");
      out.write("\t             \"nodes\": [{\r\n");
      out.write("\t                 \"name\": \"Demog\",\r\n");
      out.write("\t                 \"group_name\": \"Node-1\",\r\n");
      out.write("\t                 \"show\": true,\r\n");
      out.write("\t                 \"nodes\": [{\r\n");
      out.write("\t                     \"name\": \"STUDYID\",\r\n");
      out.write("\t                     \"device_name\": \"Node-1-1\",\r\n");
      out.write("\t                     \"show\": true,\r\n");
      out.write("\t                     \"nodes\": []\r\n");
      out.write("\t                 }, {\r\n");
      out.write("\t                     \"name\": \"USUBJID\",\r\n");
      out.write("\t                     \"device_name\": \"Node-1-2\",\r\n");
      out.write("\t                     \"show\": true,\r\n");
      out.write("\t                     \"nodes\": []\r\n");
      out.write("\t                 }, {\r\n");
      out.write("\t                     \"name\": \"AGE\",\r\n");
      out.write("\t                     \"device_name\": \"Node-1-3\",\r\n");
      out.write("\t                     \"show\": true,\r\n");
      out.write("\t                     \"nodes\": []\r\n");
      out.write("\t                 },\r\n");
      out.write("\t                 {\r\n");
      out.write("\t                     \"name\": \"RACE\",\r\n");
      out.write("\t                     \"device_name\": \"Node-1-4\",\r\n");
      out.write("\t                     \"show\": true,\r\n");
      out.write("\t                     \"nodes\": []\r\n");
      out.write("\t                 }]\r\n");
      out.write("\t             }, {\r\n");
      out.write("\t                 \"name\": \"AE\",\r\n");
      out.write("\t                 \"group_name\": \"Node-2\",\r\n");
      out.write("\t                 \"show\": true,\r\n");
      out.write("\t                 \"nodes\": [{\r\n");
      out.write("\t                     \"name\": \"STUDYID\",\r\n");
      out.write("\t                     \"device_name\": \"Node-2-1\",\r\n");
      out.write("\t                     \"show\": true,\r\n");
      out.write("\t                     \"nodes\": []\r\n");
      out.write("\t                 },{\r\n");
      out.write("\t                     \"name\": \"USUBJID\",\r\n");
      out.write("\t                     \"device_name\": \"Node-2-2\",\r\n");
      out.write("\t                     \"show\": true,\r\n");
      out.write("\t                     \"nodes\": []\r\n");
      out.write("\t                 },\r\n");
      out.write("\t                 {\r\n");
      out.write("\t                     \"name\": \"AETERM\",\r\n");
      out.write("\t                     \"device_name\": \"Node-2-3\",\r\n");
      out.write("\t                     \"show\": true,\r\n");
      out.write("\t                     \"nodes\": []\r\n");
      out.write("\t                 }\r\n");
      out.write("\t                 ]\r\n");
      out.write("\t             }, {\r\n");
      out.write("\t                 \"name\": \"Borg\",\r\n");
      out.write("\t                 \"group_name\": \"Node-3\",\r\n");
      out.write("\t                 \"show\": true,\r\n");
      out.write("\t                 \"nodes\": []\r\n");
      out.write("\t             }, {\r\n");
      out.write("\t                 \"name\": \"Fess\",\r\n");
      out.write("\t                 \"group_name\": \"Node-4\",\r\n");
      out.write("\t                 \"show\": true,\r\n");
      out.write("\t                 \"nodes\": []\r\n");
      out.write("\t             }]\r\n");
      out.write("\t         }];\r\n");
      out.write("\t         [{\r\n");
      out.write("\t             \"name\": \"Android\",\r\n");
      out.write("\t             \"type_name\": \"Android\",\r\n");
      out.write("\t             \"icon\": \"icon-android icon-3\",\r\n");
      out.write("\t             \"show\": true,\r\n");
      out.write("\t             \"nodes\": []\r\n");
      out.write("\t         }];\r\n");
      out.write("\t     }\r\n");
      out.write("\t\t $scope.records = [\r\n");
      out.write("\t\t                   /* {\r\n");
      out.write("\t\t                     \"source\" : \"employee.name\",\r\n");
      out.write("\t\t                     \"condition\":\"equal to\",\r\n");
      out.write("\t\t                     \"value\":\"23\",\r\n");
      out.write("\t\t                     \"braces\":\"(\"\r\n");
      out.write("\t\t                     \r\n");
      out.write("\t\t                   },\r\n");
      out.write("\t\t                   {\r\n");
      out.write("\t\t                \t   \"source\" : \"employee.age\",\r\n");
      out.write("\t\t\t                     \"condition\":\"gretter then\",\r\n");
      out.write("\t\t\t                     \"value\":\"43\",\r\n");
      out.write("\t\t\t                     \"braces\":\")\"\r\n");
      out.write("\t\t                   },\r\n");
      out.write("\t\t                   {\r\n");
      out.write("\t\t                \t   \"source\" : \"employee.DOB\",\r\n");
      out.write("\t\t\t                     \"condition\":\"less then\",\r\n");
      out.write("\t\t\t                     \"value\":\"20\",\r\n");
      out.write("\t\t\t                     \"braces\":\"(\"\r\n");
      out.write("\t\t                   },\r\n");
      out.write("\t\t                   {\r\n");
      out.write("\t\t                \t   \"source\" : \"employee.DOJ\",\r\n");
      out.write("\t\t\t                     \"condition\":\"less then equal to\",\r\n");
      out.write("\t\t\t                     \"value\":\"23\",\r\n");
      out.write("\t\t\t                     \"braces\":\")\"\r\n");
      out.write("\t\t                   } */\r\n");
      out.write("\t\t                 ]\r\n");
      out.write("\t\t $scope.add=function(){\r\n");
      out.write("\t\t     \t\r\n");
      out.write("\t\t     \t//$scope.tableview=false;\r\n");
      out.write("\t\t     \t\r\n");
      out.write("\t\t     \t$scope.records.push({ 'source':$scope.node, 'condition': $scope.current, 'value': $scope.value});\r\n");
      out.write("\t\t     \talert(\"test\");\r\n");
      out.write("\t\t     \talert($scope.node+\"__\"+$scope.condition+\"__\"+$scope.value);\r\n");
      out.write("\t\t      \t\r\n");
      out.write("\t\t     };\r\n");
      out.write("\t\t  });\r\n");
      out.write("\t\r\n");
      out.write("\t\t  // java script\r\n");
      out.write("\t\t\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body ng-app=\"myApp\" ng-controller=\"myController\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("         <div class=\"row\" style=\" margin-top: 80px;background-color: lightyellow;\">\r\n");
      out.write("           <div class=\"col-sm-4\">\r\n");
      out.write("           <label style=\"font-size:16px\">Source Columns</label>\r\n");
      out.write("           </div>\r\n");
      out.write("         <div class=\"col-sm-4\">\r\n");
      out.write("           <label style=\"font-size:16px\">Conditions</label>\r\n");
      out.write("         </div>\r\n");
      out.write("       <div class=\"col-sm-2\">\r\n");
      out.write("        <label style=\"font-size:16px;margin-left: -110px;\">Value</label>\r\n");
      out.write("       </div>\r\n");
      out.write("     <div class=\"col-sm-2\">      \r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\" style=\"margin-top: 5px;\" >\r\n");
      out.write("           <form ng-submit=\"add()\">\r\n");
      out.write("           <div class=\"col-sm-4\">\r\n");
      out.write("                  <div ng-style=\"{'overflow': 'auto','height':'325px'}\">\r\n");
      out.write("\r\n");
      out.write("                  <script type=\"text/ng-template\" id=\"tree_item_renderer\">\r\n");
      out.write("\r\n");
      out.write("                                <span ng-click=\"setCurrentnode(data)\">\r\n");
      out.write("         \r\n");
      out.write("             <i class=\"{{ switcher( isLeaf(data), '', 'icon-minus-sign' )}}\"></i> \r\n");
      out.write("            {{showNode(data)}}\r\n");
      out.write("            </span>\r\n");
      out.write("                                <!-- <a href=\"\">{{data.name}}</a> -->\r\n");
      out.write("\r\n");
      out.write("                                <ul class=\"some\" ng-show=\"data.show\">\r\n");
      out.write("\r\n");
      out.write("                                    <li ng-repeat=\"data in data.nodes\" class=\"parent_li\" ng-include=\"'tree_item_renderer'\" tree-node\"></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("\r\n");
      out.write("                            </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("               <div class=\"tree well\">\r\n");
      out.write("                 <ul>\r\n");
      out.write("                    <li ng-repeat=\"data in displayTree\"  ng-include=\"'tree_item_renderer'\"></li>\r\n");
      out.write("                 </ul>\r\n");
      out.write("               </div>\r\n");
      out.write("          </div>\r\n");
      out.write("           </div>\r\n");
      out.write("              <div class=\"col-sm-4\" style=\"overflow: auto; height: 400px\">\r\n");
      out.write("         <!-- <select ng-model=\"selectedName\" ng-options=\"x for x in names\" style=\"width: 250px;\" >\r\n");
      out.write("         </select> -->\r\n");
      out.write("            <ul class=\"list-group\">\r\n");
      out.write("                       <li ng-repeat=\"name in names\" ng-click=\"setCurrent(name)\" class=\"list-group-item list-group-item-action\">{{name}}</li>\r\n");
      out.write("             </ul>\r\n");
      out.write("             </div>\r\n");
      out.write("            <div class=\"col-sm-3\">\r\n");
      out.write("                       <input type=\"text\" id=\"value\" ng-model=\"value\" style=\"height: 35px\">\r\n");
      out.write("            </div>\r\n");
      out.write("             <div class=\"col-sm-1\" style=\"margin-left: 0px;\">  \r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-info\" ng-click=\"add()\" >ADD</button>    \r\n");
      out.write("             </div>\r\n");
      out.write("         </form>\r\n");
      out.write("     </div>\r\n");
      out.write("     <div class=\"row\" style=\"margin-top: 0px;border: 1px solid\">\r\n");
      out.write("     <div class=\"col-sm-12\" >\r\n");
      out.write("      <table class=\"table table-hover\">\r\n");
      out.write("            <thead>\r\n");
      out.write("              <tr style=\"background-color: lightyellow;\">\r\n");
      out.write("                <th>Order</th>\r\n");
      out.write("                <th>Source Column</th>\r\n");
      out.write("                <th>Condition</th>\r\n");
      out.write("                <th>Value</th>\r\n");
      out.write("                <th>AND/OR</th>\r\n");
      out.write("                <th>Braces</th>\r\n");
      out.write("                <th>Edit</th>\r\n");
      out.write("                <th>Delete</th>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("              <tr ng-repeat=\"record in records\">\r\n");
      out.write("                <td> {{$index+1}}</td>\r\n");
      out.write("                <td> {{record.source}} </td>\r\n");
      out.write("                <td>{{record.condition}}</td>\r\n");
      out.write("                 <td> {{record.value}}</td>\r\n");
      out.write("                <td>  <select ng-model=\"selectedAndOr\" ng-options=\"x for x in andOr\" style=\"width: 70px;\" >\r\n");
      out.write("         </select>\r\n");
      out.write("\r\n");
      out.write("                 </td>\r\n");
      out.write("                <td>\r\n");
      out.write("                <input type=\"text\" style=\"width: 70px;height: 30px\" ng-model=record.braces>\r\n");
      out.write("              </td>\r\n");
      out.write("                \r\n");
      out.write("                 <td><button style=\"font-size:14px;border: hidden;\"  data-toggle=\"modal\" data-target=\"#myModal\"><i class=\"fa fa-edit\" style=\"font-size:16px\"></i></button></td>\r\n");
      out.write("                 <td><button style=\"font-size:14px;border: hidden;\" ng-click=\"\"><i class=\"fa fa-trash-o\" style=\"font-size:16px\"></i></button></td>\r\n");
      out.write("              </tr>\t\r\n");
      out.write("              \t      \r\n");
      out.write("            </tbody>\r\n");
      out.write("          </table>\r\n");
      out.write("     </div>\r\n");
      out.write("     </div>\r\n");
      out.write("      <div class=\"row\" style=\"margin-top: 20px\">\r\n");
      out.write("     <div class=\"col-sm-12\" >\r\n");
      out.write("     <button type=\"button\" class=\"btn btn-info\" style=\"margin-left: 500px\">Generate SQL</button> \r\n");
      out.write("     </div>\r\n");
      out.write("     </div>\r\n");
      out.write("    <div class=\"row\" style=\"margin-top: 20px\">\r\n");
      out.write("     <div class=\"col-sm-3\">\r\n");
      out.write("      <label for=\"comment\">SQL/Custom SQL</label>\r\n");
      out.write("     </div>\r\n");
      out.write("     \r\n");
      out.write("       <div class=\"col-sm-5\">\r\n");
      out.write("               <textarea class=\"form-control\" rows=\"3\" id=\"comment\" style=\"margin-left:-95px;width: 500px\"></textarea>\r\n");
      out.write("        </div>\r\n");
      out.write("     <div class=\"col-sm-4\">\r\n");
      out.write("      <button type=\"button\" class=\"btn btn-info\" style=\"margin-left:0px\">Modify SQL</button> \r\n");
      out.write("     </div>\r\n");
      out.write("     </div>\r\n");
      out.write("      <div class=\"row\" style=\"margin-top: 20px\">\r\n");
      out.write("     <div class=\"col-sm-12\">\r\n");
      out.write("     <button type=\"button\" class=\"btn btn-info\" style=\"margin-left: 500px\">Generate SQL</button> \r\n");
      out.write("     </div>\r\n");
      out.write("     </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
