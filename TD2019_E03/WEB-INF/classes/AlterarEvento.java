import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class AlterarEvento extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        PrintWriter out = response.getWriter();
		out.println("<html><head><title>El Kuursal</title></head>");
		out.println("<body background= Cortinas.jpg");
		out.println("<p align=center>");
		out.println("<font color=WHITE size=10>Seleccione El Evento Que Desee Cambiar</font>");
		out.println("</p>");
		
		out.println("<p align=center>");
		out.println("<table>");
        
		for (int i=0;i<SalaInfo.v.size();i++){
			String sala=SalaInfo.v.elementAt(i).nombre;
			String evento=SalaInfo.v.elementAt(i).evento;
			Double precio=SalaInfo.v.elementAt(i).precio;
			out.println("<tr>");
			
            out.println("<td><font color=WHITE size=8 ><b>Pelicula:</b><font color=YELLOW>"+evento+"</font></font></td>");
            out.println("<td><font color=WHITE size=8 ><b>Precio:</b><font color=YELLOW>"+precio+"</font></font></td>");
            out.println("<td><form method=GET action=EditarEvento><input type=hidden name=num value="+i+"><input type=submit value=Editar></td>");
			out.println("</form>");
			out.println("</tr>");
			out.println("<br>");
		}
		
		out.println("</table>");
		out.println("<a href='index.html'><font color=WHITE size=8>Panatalla Inicial</font></a>");
		out.println("</body>");
		out.println("</html>");
    }
}