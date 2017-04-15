package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.InsertEntityService;
import util.EntityIDFactory;
import entity.User;

public class RegisteServlet extends HttpServlet {

	InsertEntityService service = new InsertEntityService();
	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		User user = new User();
		String userID = EntityIDFactory.createId();;
		user.setUserID(userID);
		user.setPassword( request.getParameter("password"));
		user.setUserName(request.getParameter("userName"));
		System.out.println(request.getParameter("password"));
		System.out.println(request.getParameter("userName"));
		request.setAttribute("userID", userID);
		request.setAttribute("password", user.getPassword());
		request.setAttribute("userName", user.getUserName());
		request.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		try {
			service.insertEntity(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
