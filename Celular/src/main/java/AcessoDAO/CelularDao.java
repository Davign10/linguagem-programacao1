package AcessoDAO;

import com.example.celular.Celular;

import ConnectionFA.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


    public class CelularDao {
        public void salvar(Celular celular) throws Exception{
            String sql = "INSERT INTO celular (cor_celular, gigabyte_celular, modelo_celular, tamanho_celular, tela_celular ) VALUES (?, ?, ?, ?, ?)";
            Connection conn = null;
            PreparedStatement pstm = null;
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setString(1, celular.getCor());
            pstm.setString(2, celular.getGigabyte());
            pstm.setString(3, celular.getModelo());
            pstm.setString(4, celular.getTamanho());
            pstm.setString(5, celular.getTela());

            pstm.execute();

            if (pstm!=null){
                pstm.close();
            }

            if (conn != null){
                conn.close();
            }
        }
    }

