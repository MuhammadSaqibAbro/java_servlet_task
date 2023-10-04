package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DemoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.write("<h1 style='color:blue; background-color:red'>Hello Welcome to Java EE</h1><br>");
		
		
		out.write("<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Student Registration Form</title>\r\n"
				+ "    <style>\r\n"
				+ "        body {\r\n"
				+ "            font-family: Arial, sans-serif;\r\n"
				+ "            background-color: #f2f2f2;\r\n"
				+ "        }\r\n"
				+ "        .container {\r\n"
				+ "            max-width: 500px;\r\n"
				+ "            margin: 0 auto;\r\n"
				+ "            padding: 20px;\r\n"
				+ "            background-color: #fff;\r\n"
				+ "            border-radius: 5px;\r\n"
				+ "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);\r\n"
				+ "        }\r\n"
				+ "        h2 {\r\n"
				+ "            text-align: center;\r\n"
				+ "            color: #333;\r\n"
				+ "        }\r\n"
				+ "        label {\r\n"
				+ "            display: block;\r\n"
				+ "            margin-bottom: 5px;\r\n"
				+ "            font-weight: bold;\r\n"
				+ "        }\r\n"
				+ "        input[type=\"text\"],\r\n"
				+ "        input[type=\"email\"],\r\n"
				+ "        input[type=\"date\"],\r\n"
				+ "        select {\r\n"
				+ "            width: 100%;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            margin-bottom: 10px;\r\n"
				+ "            border: 1px solid #ccc;\r\n"
				+ "            border-radius: 3px;\r\n"
				+ "        }\r\n"
				+ "        button {\r\n"
				+ "            background-color: #007bff;\r\n"
				+ "            color: #fff;\r\n"
				+ "            padding: 10px 20px;\r\n"
				+ "            border: none;\r\n"
				+ "            border-radius: 3px;\r\n"
				+ "            cursor: pointer;\r\n"
				+ "        }\r\n"
				+ "        button:hover {\r\n"
				+ "            background-color: #0056b3;\r\n"
				+ "        }\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <div class=\"container\">\r\n"
				+ "        <h2>Student Registration Form</h2>\r\n"
				+ "        <form action= 'Backendcoding'>\r\n"
				+ "            <label for=\"name\">Name:</label>\r\n"
				+ "            <input type=\"text\" id=\"name\" name=\"name\" required>\r\n"
				+ "\r\n"
				+ "            <label for=\"email\">Email:</label>\r\n"
				+ "            <input type=\"email\" id=\"email\" name=\"email\" required>\r\n"
				+ "\r\n"
				+ "            <label for=\"birthdate\">Date of Birth:</label>\r\n"
				+ "            <input type=\"date\" id=\"birthdate\" name=\"birthdate\" required>\r\n"
				+ "\r\n"
				+ "            <label for=\"gender\">Gender:</label>\r\n"
				+ "            <select id=\"gender\" name=\"gender\" required>\r\n"
				+ "                <option value=\"male\">Male</option>\r\n"
				+ "                <option value=\"female\">Female</option>\r\n"
				+ "                <option value=\"other\">Other</option>\r\n"
				+ "            </select>\r\n"
				+ "\r\n"
				+ "            <button type=\"submit\">Submit</button>\r\n"
				+ "        </form>\r\n"
				+ "    </div>\r\n"
				+ "</body>\r\n"
				+ "</html>");

		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
