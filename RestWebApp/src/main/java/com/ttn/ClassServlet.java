package com.ttn;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = " Servlet",
        urlPatterns = {"/exercise"}
)
public class ClassServlet extends HttpServlet
{
    @Override
    public void init() throws ServletException {
        System.out.println("In INIT Method");
    }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            PrintWriter out = resp.getWriter();
                String email = req.getParameter("email");
                String username = req.getParameter("username");
                String password = req.getParameter("password");
                resp.setContentType("text/html");

                    String str = "<html>";
                    str += "<head>";
                    str += "<style>";
                    str += "table , td ,th { ";
                    str += "border: 1px solid black;";
                    str += " }";
                    str += "</style>";
                    str += "</head>";
                    str += "<table style=\"width:50%\">";
                    str += "<tr>";
                    str += " <th>UserName</th>";
                    str += "<th>Email</th>";
                    str += "<th>Password</th>";
                    str += "</tr>";
                    str += " <tr>";
                    str += "<td>" + email + "</td>";
                    str += " <td> " + username + "</td>";
                    str += "<td>" + password + "</td>";
                    str += "</tr>";
                    str += "</table>";
                    str += "</html>";
                    out.write(str);
                    out.flush();


            }
    @Override
    public void destroy()
    {
        System.out.println("The destroy method of servlet is called only once");
    }


        }




