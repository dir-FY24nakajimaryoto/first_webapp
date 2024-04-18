package test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */

// 動作確認用URL: servletの変更ごとのTomcat再起動くそめんどいなあほ
// http://localhost:8080/first_webapp/HelloServlet
// - 左から順に、プロトコル、ホスト名、ポート、コンテキストパス、サーブレットパス（、クエリ・パラメータあああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああ）
// - コンテキストパス：プロジェクト名、サーブレットパス：URLマッピングのやつ（↓の@webservletでも見れる）
// -- クエリ・パラメータ：GET通信のみ、名前＝値でサーブレットにデータを渡せる
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		default: response.getWriter().append("Served at: ").append(request.getContextPath());
	    
	    // 「このサーブレットからレスポンスで戻すデータがUTF-8のHTMLである」と言ってる。あっそ
	    response.setContentType("text/html; charset=UTF-8");
	    
	    // getWriterで生成されるPrintwriter型のオブジェクトにHTMLの内容を教えてあげてるやっさしいんだね～～～～～～～～～～～～
		var out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>はじめてのサーブレットくだらね</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<こんにちは、サーブレットの世界へ帰れ>");
		out.println("</body>");
		out.println("</html>");
	}
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
