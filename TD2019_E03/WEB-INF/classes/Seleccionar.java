import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Seleccionar extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
		String numinfo=request.getParameter("num");
		int num=Integer.parseInt(numinfo);
        int filas=SalaInfo.v.elementAt(num).filas;
		int columnas=SalaInfo.v.elementAt(num).columnas;
		int [][] Ocup=SalaInfo.v.elementAt(num).Ocup;
		
		
			out.println("<html>");
			out.println("<body background = Cortinas.jpg>");
			out.println("<p align=center><font color=WHITE size=10>Elija sus Asientos</font></p>");
			out.println("<form method=GET action=Tickets><br>");
			out.println("<p align=center><table border=1>");
		
				for (int i=0;i<filas;i++){
				out.println("<tr>");
				for (int j=0;j<columnas;j++){
					if (Ocup[i][j]==0){
					out.println("<td><input type=checkbox name=Asiento"+i+"-"+j+"><font color=WHITE>"+i+"-"+j+"</font></input></td>");
					} else {
						out.println("<td><input type=checkbox name=Asiento"+i+"-"+j+" disabled checkbox><font color=WHITE>"+i+"-"+j+"</font></input></td>");
					}
				}
			out.println("</tr>");
		}
			out.println("</table>");
			out.println("<input type=hidden name=num value="+num+">");
			out.println("<p align=center><input type=submit value=Reservar></input>");
			out.println("</p>");
			out.println("</form>");
			out.println("<p align=center><a href='index.html'><font color=WHITE>Pantalla Inicial</font></a></p></body>");
			out.println("</html>");
		
    }
}