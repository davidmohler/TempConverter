package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

import model.TempConverter;

/**
 * Servlet implementation class getTempServlet
 */
@WebServlet("/getTempServlet")
public class getTempServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTempServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	String userTemp = request.getParameter("userTemp");
	String userCelsiusBoolean = request.getParameter("celsiusEntered");
	String trueString = "true";
	boolean celsiusToggle = false;
	if (userCelsiusBoolean != null && userCelsiusBoolean.equals(trueString)) {
		celsiusToggle = true;
	}
	
	TempConverter tempToConvert = new TempConverter(Integer.parseInt(userTemp), celsiusToggle);
	
	request.setAttribute("convertedTemp", tempToConvert);
	
	getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	
//	PrintWriter writer = response.getWriter();
//	writer.println ("You entered: " + userTemp.toString() + " degrees.");
//	writer.close();
	}

}
