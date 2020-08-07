package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.GameManager;

@WebServlet("/RequestHandler")
public class RequestHandler extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public RequestHandler() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// parameter can be guess=<letter> or "newGame"
		// If no parameter then just redirect to gameDisplay

		// get "guess" parameter, if present guess that letter

		// else, get "newGame" parameter and start new game if present
		
		response.sendRedirect("gameDisplay.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
