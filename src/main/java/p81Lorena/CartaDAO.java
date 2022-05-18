package p81Lorena;

import EjerciciosUT8BasedeDatos.tarea8A.Conexion;

import java.sql.*;
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
            ResultSet res = st.executeQuery("select * from carta");
            // Ahora construimos la lista, recorriendo el ResultSet y mapeando los datos
            while (res.next()) {
                CartaVO p = new CartaVO();
                // Recogemos los datos de la carta, guardamos en un objeto
                p.setPk(res.getInt("pk"));
                p.setContenido(res.getString("contenido"));
                p.setRecordado(res.getBoolean("recordado"));
                //Añadimos el objeto a la lista
                lista.add(p);
            }
        }
        return lista;
    }

    @Override
    public CartaVO findByPk(int pk) throws SQLException {
        ResultSet res = null;
        CartaVO carta = new CartaVO();
        String sql = "select * from carta where pk=?";
        try (PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setInt(1, pk);

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

            // Nos posicionamos en el primer registro del Resultset. Sólo debe haber una fila
            // si existe esa pk
            if (res.next()) {
                // Recogemos los datos de la carta, guardamos en un objeto
                carta.setPk(res.getInt("pk"));
                carta.setContenido(res.getString("contenido"));
                carta.setRecordado(res.getBoolean("recordado"));
                return carta;
            }

            return null;
        }
    }

    @Override
    public int insertCarta(CartaVO carta) throws SQLException {
            int numFilas = 0;
            String sql = "insert into carta values (?,?,?)";
            if (findByPk(carta.getPk()) != null) {
                // Existe un registro con esa pk
                // No se hace la inserción
                return numFilas;
            } else {
                // Instanciamos el objeto PreparedStatement para inserción
                // de datos. Sentencia parametrizada
                try (PreparedStatement prest = con.prepareStatement(sql)) {
                    // Establecemos los parámetros de la sentencia
                    prest.setInt(1, carta.getPk());
                    prest.setString(2, carta.getContenido());
                    prest.setBoolean(3, carta.isRecordado());
                    numFilas = prest.executeUpdate();
                }
                return numFilas;
            }
    }

    @Override
    public int insertCarta(List<CartaVO> lista) throws SQLException {
        int numFilas = 0;
        for (CartaVO tmp : lista) {
            numFilas += insertCarta(tmp);
        }
        return numFilas;
    }

    @Override
    public int deleteCarta(CartaVO p) throws SQLException {
        String sql = "delete from carta";
        int nfilas = 0;
        // Preparamos el borrado de datos  mediante un Statement
        // No hay parámetros en la sentencia SQL
        try (Statement st = con.createStatement()) {
            // Ejecución de la sentencia
            nfilas = st.executeUpdate(sql);
        }
        // El borrado se realizó con éxito, devolvemos filas afectadas
        return nfilas;
    }

    @Override
    public int deleteCarta() throws SQLException {
        String sql = "delete from carta";
        int nfilas = 0;
        // Preparamos el borrado de datos  mediante un Statement
        // No hay parámetros en la sentencia SQL
        try (Statement st = con.createStatement()) {
            // Ejecución de la sentencia
            nfilas = st.executeUpdate(sql);
        }
        // El borrado se realizó con éxito, devolvemos filas afectadas
        return nfilas;
    }


    @Override
    public int updateCarta(int pk, CartaVO nuevosDatos) throws SQLException {
        int numFilas = 0;
        String sql = "update carta set contenido = ?, recordado = ? where pk=?";

        if (findByPk(pk) == null) {
            // La carta a actualizar no existe
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setString(1, nuevosDatos.getContenido());
                prest.setBoolean(2, nuevosDatos.isRecordado());
                prest.setInt(3, pk);

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }
    }

    public int cambiarAOlvidado(int pk) throws SQLException {
        int res = 0;
        boolean is = false;
        // Dos ?, uno para newName y otro para oldName
        String sql = "{call cambiar-A-Olvidado (?,?)}";
        // Preparamos la llamada al procedimiento almacenado
        try (CallableStatement call = con.prepareCall(sql)) {
            // Establecemos parámetros a pasar al procedimiento
            call.setInt(1, pk);
            call.setBoolean(2, is);
            // Ejecutamos el procedimiento
            res = call.executeUpdate();
        }
        return res;
    }
}
