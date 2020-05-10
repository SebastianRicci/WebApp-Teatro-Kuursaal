import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ReembolsarEntradas extends HttpServlet {
    public void doGet (HttpServletRequest req, HttpServletResponse resp) 
    
	
		throws ServletException, IOException {
			
			
		
			PrintWriter out = resp.getWriter();
		
			out.println("<html>");
			out.println("<body background = Cortinas.jpg>");
			out.println("<p align=center>");
			out.println("<B><font color=WHITE size=12>Evento que desea reembolsar: </font></B>");
			out.println("</p>");
			
			out.println("<p align=center>");
			out.println("<TABLE>");
			
				for(int i=0 ; i<SalaInfo.v.size(); i++){
				out.println("<TR>");
				
					String evento = SalaInfo.v.elementAt(i).evento;
					String nombre = SalaInfo.v.elementAt(i).nombre;
				
					int num=i;
				
				
					out.println("<TD><font color=WHITE size=10> "+ nombre +"</font> </TD><TD><font color=YELLOW size=10> "+ evento +"</font> </TD>");
					out.println("<TD><form action = Reembolsar method = get><input type = submit value = Reembolsar><input type=hidden name=num value ="+ num +"></form></TD>");
					
				out.println("<TR>");
				}
			
			out.println("</TABLE>");
			out.println("</p>");
			
			out.println("<p align=center>");
			out.println("<A href = 'index.html'><font color=WHITE size=8>Pantalla Inicial </font></A></p>");
			out.println("</body>");
			out.println("</html>");
		}
}