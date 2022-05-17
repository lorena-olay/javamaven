package p81Lorena;

import java.sql.SQLException;
import java.util.List;

public interface ICarta {


    // Método para obtener todos los registros de la tabla
    List<CartaVO> getAll() throws SQLException;

    // Méodo para obtener un registro a partir de la PK
    CartaVO findByPk(int pk) throws SQLException;

    // Método para insertar un registro
    int insertCarta (CartaVO persona) throws SQLException;

    // Método para insertar varios registros
    int insertCarta (List<CartaVO> lista) throws SQLException;

    // Método para borrar una persona
    int deleteCarta (CartaVO p) throws SQLException;

    // Método para borrar toda la tabla
    int deleteCarta() throws SQLException;

    // Método para modificar una carta. Se modifica a la persona que tenga esa 'pk'
    // con los nuevos datos que traiga la persona 'nuevosDatos'
    int updateCarta (int pk, CartaVO nuevosDatos) throws SQLException;

}

