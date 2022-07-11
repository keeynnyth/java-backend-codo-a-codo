package ar.com.codoacodo.controllers;

import java.io.IOException;

import ar.com.codoacodo.connection.AdministradorDeConexiones;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// herencia
// create controller es hijo de:
public class CreateController extends HttpServlet {
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// recibe los datos del front
	// en req viene los datos que manda el formulario html 
	// como clave, valor
	// va a pedir una conexion: AdministradorDeConexion.getConection()
	// luego se hace un insert en db > sql : inser into...
	
	String nombre = req.getParameter("nombre");
	String precio = req.getParameter("precio");
	String fechaCreacion = "";
	String imagen = req.getParameter("imagen"); 
	String codigo = req.getParameter("codigo");
	
	
	Connection con = AdministradorDeConexiones.getConnection();
	if (con !=null) {
		//insert en la db > SQL: INSERTE INTO....
		String sql = "INSERT INTO producto (nombre, precio,fecha_creacion,imagen,codigo)";
		 sql += "VALUES ('"+nombre+"',"+precio+",CURDATE(),'"+imagen+"','"+codigo+"')";
	}
}

}
