import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Reembolsar extends HttpServlet {
    public void doGet (HttpServletRequest req, HttpServletResponse resp) 
    
	
		throws ServletException, IOException{
		

 
		String numinfo = req.getParameter("num");
		int num =  Integer.parseInt(numinfo);
		
		
            Auditorio General=SalaInfo.v.elementAt(num);
			
			int filas = General.filas;
			int columnas = General.columnas; 
			
			for (int i=0; i<filas; i++){
				for(int j=0; j<columnas; j++){
				SalaInfo.v.elementAt(num).Ocup[i][j]= 0;
				}
			}
				
        
		
		PrintWriter out = resp.getWriter();
        SalaInfo.v.remove(num);
		
		out.println("<html>");
		out.println("<body background = Cortinas.jpg>");
		
		out.println("<p align=center>");
		out.println("<B><font color=WHITE size=14>Se han reembolsado todas las entradas</font></B>");
		out.println("</p>");
		
		
		out.println("<p align=center><A href = 'index.html'><font color=WHITE size=12>Pantalla Inicial</font></A></p>");
		
		out.println("</body>");
		out.println("</html>");
		}
}
		
		
		