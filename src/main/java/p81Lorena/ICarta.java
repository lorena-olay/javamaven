package p81Lorena;

import java.sql.SQLException;
import java.util.List;

public interface ICarta {


    // M�todo para obtener todos los registros de la tabla
    List<CartaVO> getAll() throws SQLException;

    // M�odo para obtener un registro a partir de la PK
    CartaVO findByPk(int pk) throws SQLException;

    // M�todo para insertar un registro
    int insertCarta (CartaVO persona) throws SQLException;

    // M�todo para insertar varios registros
    int insertCarta (List<CartaVO> lista) throws SQLException;

    // M�todo para borrar una persona
    int deleteCarta (CartaVO p) throws SQLException;

    // M�todo para borrar toda la tabla
    int deleteCarta() throws SQLException;

    // M�todo para modificar una carta. Se modifica a la persona que tenga esa 'pk'
    // con los nuevos datos que traiga la persona 'nuevosDatos'
    int updateCarta (int pk, CartaVO nuevosDatos) throws SQLException;

}

