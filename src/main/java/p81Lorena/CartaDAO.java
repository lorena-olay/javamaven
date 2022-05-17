package p81Lorena;

import EjerciciosUT8BasedeDatos.tarea8A.Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CartaDAO implements ICarta{
    private Connection con = null;
    public CartaDAO() {
        con = Conexion.getInstance();
    }

    @Override
    public List<CartaVO> getAll() throws SQLException {

        List<CartaVO> lista = new ArrayList<>();

        // Preparamos la consulta de datos mediante un objeto Statement
        // ya que no necesitamos parametrizar la sentencia SQL
        try (Statement st = con.createStatement()) {
            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            ResultSet res = st.executeQuery("select * from persona");
            // Ahora construimos la lista, recorriendo el ResultSet y mapeando los datos
            while (res.next()) {
                CartaVO p = new CartaVO();
                // Recogemos los datos de la persona, guardamos en un objeto
                p.setPk(res.getInt("pk"));
                p.setContenido(res.getString("contenido"));
                p.isRecordado(res.getBoolean("recordado"));

                //Añadimos el objeto a la lista
                lista.add(p);
            }
        }

        return lista;    }

    @Override
    public CartaVO findByPk(int pk) throws SQLException {
        return null;
    }

    @Override
    public int insertCarta(CartaVO persona) throws SQLException {
        return 0;
    }

    @Override
    public int insertCarta(List<CartaVO> lista) throws SQLException {
        return 0;
    }

    @Override
    public int deleteCarta(CartaVO p) throws SQLException {
        return 0;
    }

    @Override
    public int deleteCarta() throws SQLException {
        return 0;
    }

    @Override
    public int updateCarta(int pk, CartaVO nuevosDatos) throws SQLException {
        return 0;
    }
}
