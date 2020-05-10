import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class VenderEvento extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
		out.println("<body background = Cortinas.jpg>");
		out.println("<p align=center><font color=WHITE size=14>Eventos</font></p>");
		out.println("<p align=center><table>");
        
        for (int i=0;i<SalaInfo.v.size();i++){
            String sala=SalaInfo.v.elementAt(i).nombre;
			String evento=SalaInfo.v.elementAt(i).evento;
            Double precio=SalaInfo.v.elementAt(i).precio;
			out.println("<tr>");
			out.println("<td><font color=WHITE size=10><b>Sala:</font> </b><font color=YELLOW size=10>"+sala+"</font></td>");
            out.println("<td><font color=WHITE size=10><b>Evento:</font></b><font color=YELLOW size=10>"+evento+"</font></td>");
            out.println("<td><font color=WHITE size=10><b>Precio:</font> </b><font color=YELLOW size=10>"+precio+"</font></td>");
            out.println("<td><form method=GET action=Seleccionar><input type=hidden name=num value="+i+"><input type=submit value=Vender></td></form></tr><br>");
            
		}
		out.println("</table><a href='index.html'><font color=WHITE size=8> Pantalla Inicial</font></a>");
		out.println("</body>");
		out.println("</html>");
		
    }
}