package com.miroshnichenco;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Servlet implementation class SimpleServletWitLoggin
 */
public class SimpleServletWitLoggin extends HttpServlet {

	private static final Log log = LogFactory.getLog(SimpleServletWitLoggin.class);
	private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    /**
     * Default constructor. 
     */
    public SimpleServletWitLoggin() {
    	super();
    	log.info("Creating Servlet  SimpleServletWitLoggin" );
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.info("Do GET...");
		response.setContentType(CONTENT_TYPE);
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head><title>Do GET...</title></head>");
	    out.println("<body>");
	    out.println("<p>The servlet has received a GET. This is the reply.</p>");
	    out.println("</body></html>");
	    out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.info("Do POST...");
		response.setContentType(CONTENT_TYPE);
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head><title>Do POST...</title></head>");
	    out.println("<body>");
	    out.println("<p>The servlet has received a POST. This is the reply.</p>");
	    out.println("</body></html>");
	    out.close();

	}

	@Override
	public String toString() {

		return new ToStringBuilder(this)
						.append("ServletName", this.getServletName())
						.append("ServletInfo", this.getServletInfo())
						.toString();
	}
	
	

}
