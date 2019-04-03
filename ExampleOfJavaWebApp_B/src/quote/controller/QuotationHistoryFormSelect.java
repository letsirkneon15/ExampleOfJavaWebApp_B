package quote.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import quote.model.ManageQuotationHistory;
import quote.pojo.Usso_Quotation_History;

/**
 * Servlet implementation class HSCodeInformation
 */
@WebServlet("/QuotationHistoryFormSelect")
public class QuotationHistoryFormSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Context initContext;
	private Context envContext;
	private DataSource dataSource;
	private Connection conn;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		try{
			initContext = new InitialContext();
			envContext = (Context) initContext.lookup("java:/comp/env");
			dataSource = (DataSource) envContext.lookup("jdbc/aseanusr");
			conn = dataSource.getConnection();
			System.out.println("Connection: " + conn);
		}catch (NamingException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* Variables declaration */
		String newPage = "/MainPage.jsp";
		String firmCode = "20";
		String osaCode = "";
		String custCode = "";
		String globalAccountName = "";
		String action = "";
		/*int totalRecs = 0; */
		int frRowNum = 0;
		int toRowNum = 0;

		ArrayList <Usso_Quotation_History> quoteHisArr = new ArrayList<>();

		/* Retrieve session values from HsCodeSelection pojo */
		HttpSession session=request.getSession();

		if(session != null){		
			osaCode = (String) session.getAttribute("osaCode");
			custCode = (String) session.getAttribute("custCode");
			globalAccountName = (String) session.getAttribute("globalAccountName");
			System.out.println(" From Session --> osacode: " + osaCode + "custCode: " + custCode + "globalAccountName: " + globalAccountName);
		}

		/* Do this when submit button was clicked */
		action = request.getParameter("action");

		if(action != null){

			System.out.println("Action: " + action);
			if(action.equalsIgnoreCase("formPost")){
				osaCode = (String) request.getParameter("osaCode");
				custCode = (String) request.getParameter("custCode");
				globalAccountName = (String) request.getParameter("globalAccountName");		
				System.out.println(" From Action --> osacode: " + osaCode + "custCode: " + custCode + "globalAccountName: " + globalAccountName);
			}	
		}

		quoteHisArr = new ManageQuotationHistory().getQuoteHistArr(conn, firmCode, osaCode, custCode, 
				globalAccountName, frRowNum, toRowNum);
		
		session.setAttribute("quoteHisArr", quoteHisArr);
		session.setAttribute("osaCode", osaCode);
		session.setAttribute("custCode", custCode);
		session.setAttribute("globalAccountName", globalAccountName);
			
		/* do redirection */ 
		ServletContext sContext = getServletContext();
		RequestDispatcher rDispatcher = sContext.getRequestDispatcher(newPage);
		rDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding( "UTF-8" ); 
		doGet(request, response);
	}

}
