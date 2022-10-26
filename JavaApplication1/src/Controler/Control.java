package Controler;

import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author samue
 */
public class Control {
    
    public Control(){

    }
    
    public void Cadastrar(int cpf,String Nome,String Login,String Senha) throws SQLException, ClassNotFoundException{
        
        Connection conn;
        conn = Conexao.getInstance().getConnection();
        String sql="insert into cadastro(pk_cpf,nome,login,senha)values(?,?,?,?);";
        
        try(PreparedStatement smt=conn.prepareCall(sql)){
            
            smt.setInt(1, cpf);
            smt.setString(2, Nome);
            smt.setString(3, Login);
            smt.setString(4, Senha);
            
            smt.executeUpdate();
            
            smt.close();
            conn.close();
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
            
        }
            
        
    }
    public void CadastroLivro(String autor1,String autor2,String titulo,String ano,String assunto,int cdu,String palchave2,String cidade,String editora,int isbn,int num_edi,int num_pag,String palChave1,int tam,String titulo2) throws SQLException, ClassNotFoundException{
        
        Connection conn;
        conn = Conexao.getInstance().getConnection();
        String sql="insert into livros(pk_cdu,autor1,autor2,titulo,num_edi,cidade,editora,ano,titulo2,num_pag,tam,isbn,assunto,pal_chave1,pal_chave2)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        
        try(PreparedStatement smt=conn.prepareCall(sql)){
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,cdu);
            smt.setString(2,autor1);
            smt.setString(3,autor2);
            smt.setString(4,titulo);
            smt.setInt(5,num_edi);
            smt.setString(6,cidade);
            smt.setString(7,editora);
            smt.setString(8,ano);
            smt.setString(9,titulo2);
            smt.setInt(10,num_pag);
            smt.setInt(11,tam);
            smt.setInt(12,isbn);
            smt.setString(13, assunto);
            smt.setString(14,palChave1);
            smt.setString(15,palchave2);
            
            smt.executeUpdate();
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
                
    }
    
    public void CadastroPeriodicos(String autor1,String autor2,String titulo,String ano,String assunto,int cdu,String palchave2,String cidade,String editora,int isbn,int num_edi,int num_pag,String palChave1,int tam,String titulo2) throws SQLException, ClassNotFoundException{
        
        Connection conn;
        conn = Conexao.getInstance().getConnection();
        String sql="insert into periodicos(pk_cdu,autor1,autor2,titulo,num_edi,cidade,editora,ano,titulo2,num_pag,tam,isbn,assunto,pal_chave1,pal_chave2)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        
        try(PreparedStatement smt=conn.prepareCall(sql)){
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,cdu);
            smt.setString(2,autor1);
            smt.setString(3,autor2);
            smt.setString(4,titulo);
            smt.setInt(5,num_edi);
            smt.setString(6,cidade);
            smt.setString(7,editora);
            smt.setString(8,ano);
            smt.setString(9,titulo2);
            smt.setInt(10,num_pag);
            smt.setInt(11,tam);
            smt.setInt(12,isbn);
            smt.setString(13, assunto);
            smt.setString(14,palChave1);
            smt.setString(15,palchave2);
            
            smt.executeUpdate();
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
                
    }
    
    public void CadastroTCC(String autor1,String autor2,String titulo,String ano,String assunto,int cdu,String palchave2,String cidade,String editora,int isbn,int num_edi,int num_pag,String palChave1,int tam,String titulo2) throws SQLException, ClassNotFoundException{
        
        Connection conn;
        conn = Conexao.getInstance().getConnection();
        String sql="insert into tcc(pk_cdu,autor1,autor2,titulo,num_edi,cidade,editora,ano,titulo2,num_pag,tam,isbn,assunto,pal_chave1,pal_chave2)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        
        try(PreparedStatement smt=conn.prepareCall(sql)){
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,cdu);
            smt.setString(2,autor1);
            smt.setString(3,autor2);
            smt.setString(4,titulo);
            smt.setInt(5,num_edi);
            smt.setString(6,cidade);
            smt.setString(7,editora);
            smt.setString(8,ano);
            smt.setString(9,titulo2);
            smt.setInt(10,num_pag);
            smt.setInt(11,tam);
            smt.setInt(12,isbn);
            smt.setString(13, assunto);
            smt.setString(14,palChave1);
            smt.setString(15,palchave2);
            
            smt.executeUpdate();
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
                
    }
    
    public void CadastroRelatorios(String autor1,String autor2,String titulo,String ano,String assunto,int cdu,String palchave2,String cidade,String editora,int isbn,int num_edi,int num_pag,String palChave1,int tam,String titulo2) throws SQLException, ClassNotFoundException{
        
        Connection conn;
        conn = Conexao.getInstance().getConnection();
        String sql="insert into relatorios(pk_cdu,autor1,autor2,titulo,num_edi,cidade,editora,ano,titulo2,num_pag,tam,isbn,assunto,pal_chave1,pal_chave2)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        
        try(PreparedStatement smt=conn.prepareCall(sql)){
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,cdu);
            smt.setString(2,autor1);
            smt.setString(3,autor2);
            smt.setString(4,titulo);
            smt.setInt(5,num_edi);
            smt.setString(6,cidade);
            smt.setString(7,editora);
            smt.setString(8,ano);
            smt.setString(9,titulo2);
            smt.setInt(10,num_pag);
            smt.setInt(11,tam);
            smt.setInt(12,isbn);
            smt.setString(13, assunto);
            smt.setString(14,palChave1);
            smt.setString(15,palchave2);
            
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
                
    }
    
    public void CadastroMidias(String autor1,String autor2,String titulo,String ano,String assunto,int cdu,String palchave2,String cidade,String editora,int isbn,int num_edi,int num_pag,String palChave1,int tam,String titulo2) throws SQLException, ClassNotFoundException{
        
        Connection conn;
        conn = Conexao.getInstance().getConnection();
        String sql="insert into midias(pk_cdu,autor1,autor2,titulo,num_edi,cidade,editora,ano,titulo2,num_pag,tam,isbn,assunto,pal_chave1,pal_chave2)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        
        try(PreparedStatement smt=conn.prepareCall(sql)){
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,cdu);
            smt.setString(2,autor1);
            smt.setString(3,autor2);
            smt.setString(4,titulo);
            smt.setInt(5,num_edi);
            smt.setString(6,cidade);
            smt.setString(7,editora);
            smt.setString(8,ano);
            smt.setString(9,titulo2);
            smt.setInt(10,num_pag);
            smt.setInt(11,tam);
            smt.setInt(12,isbn);
            smt.setString(13, assunto);
            smt.setString(14,palChave1);
            smt.setString(15,palchave2);
            
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
                
    }
    
    public void CadastroCartazes(String autor1,String autor2,String titulo,String ano,String assunto,int cdu,String palchave2,String cidade,String editora,int isbn,int num_edi,int num_pag,String palChave1,int tam,String titulo2) throws SQLException, ClassNotFoundException{
        
        Connection conn;
        conn = Conexao.getInstance().getConnection();
        String sql="insert into cartazes(pk_cdu,autor1,autor2,titulo,num_edi,cidade,editora,ano,titulo2,num_pag,tam,isbn,assunto,pal_chave1,pal_chave2)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        
        try(PreparedStatement smt=conn.prepareCall(sql)){
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,cdu);
            smt.setString(2,autor1);
            smt.setString(3,autor2);
            smt.setString(4,titulo);
            smt.setInt(5,num_edi);
            smt.setString(6,cidade);
            smt.setString(7,editora);
            smt.setString(8,ano);
            smt.setString(9,titulo2);
            smt.setInt(10,num_pag);
            smt.setInt(11,tam);
            smt.setInt(12,isbn);
            smt.setString(13, assunto);
            smt.setString(14,palChave1);
            smt.setString(15,palchave2);
            
            smt.executeUpdate();

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
                
    }
    
    public void CadastroMapas(String autor1,String autor2,String titulo,String ano,String assunto,int cdu,String palchave2,String cidade,String editora,int isbn,int num_edi,int num_pag,String palChave1,int tam,String titulo2) throws SQLException, ClassNotFoundException{
        
        Connection conn;
        conn = Conexao.getInstance().getConnection();
        String sql="insert into mapas(pk_cdu,autor1,autor2,titulo,num_edi,cidade,editora,ano,titulo2,num_pag,tam,isbn,assunto,pal_chave1,pal_chave2)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        
        try(PreparedStatement smt=conn.prepareCall(sql)){
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,cdu);
            smt.setString(2,autor1);
            smt.setString(3,autor2);
            smt.setString(4,titulo);
            smt.setInt(5,num_edi);
            smt.setString(6,cidade);
            smt.setString(7,editora);
            smt.setString(8,ano);
            smt.setString(9,titulo2);
            smt.setInt(10,num_pag);
            smt.setInt(11,tam);
            smt.setInt(12,isbn);
            smt.setString(13, assunto);
            smt.setString(14,palChave1);
            smt.setString(15,palchave2);
            
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
                
    }
    public void pegaLivro(int CDU) throws ClassNotFoundException, SQLException{
        
        Connection conn;
        conn = Conexao.getInstance().getConnection();
        /*String sql="select from livros where pk_cdu=?";
        
        try(PreparedStatement smt=conn.prepareCall(sql)){
            
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,CDU);
            
                        
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }*/
        
        String sql = "delete from livros where pk_cdu=?";
        
        try(PreparedStatement smt=conn.prepareCall(sql)){
            
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,CDU);
            
                        
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
    }
    public void pegaPeriodicos(int CDU) throws ClassNotFoundException, SQLException{
        
        Connection conn;
        conn = Conexao.getInstance().getConnection();
        String sql="select *from livros where pk_cdu='?'";
        
        /*try(PreparedStatement smt=conn.prepareCall(sql)){
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,CDU);
                        
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }*/
        sql = "delete from periodicos where pk_cdu='?'";
        
        try(PreparedStatement smt=conn.prepareCall(sql)){
            
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,CDU);
            
                        
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
    }
    public void pegaMidias(int CDU) throws ClassNotFoundException, SQLException{
        
        Connection conn;
        conn = Conexao.getInstance().getConnection();
        String sql="select *from livros where pk_cdu='?'";
        
        /*try(PreparedStatement smt=conn.prepareCall(sql)){
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,CDU);
                        
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }*/
        sql = "delete from midias where pk_cdu='?'";
        
        try(PreparedStatement smt=conn.prepareCall(sql)){
            
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,CDU);
            
                        
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
    }
    public void pegaCartazes(int CDU) throws ClassNotFoundException, SQLException{
        
        Connection conn;
        conn = Conexao.getInstance().getConnection();
        String sql="select *from livros where pk_cdu='?'";
        
        /*try(PreparedStatement smt=conn.prepareCall(sql)){
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,CDU);
                        
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }*/
        sql = "delete from cartazes where pk_cdu='?'";
        
        try(PreparedStatement smt=conn.prepareCall(sql)){
            
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,CDU);
            
                        
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
    }
    public void pegaMapas(int CDU) throws ClassNotFoundException, SQLException{
        
        Connection conn;
        conn = Conexao.getInstance().getConnection();
        String sql="select *from livros where pk_cdu='?'";
        
        /*try(PreparedStatement smt=conn.prepareCall(sql)){
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,CDU);
                        
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }*/
        sql = "delete from mapas where pk_cdu='?'";
        
        try(PreparedStatement smt=conn.prepareCall(sql)){
            
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,CDU);
            
                        
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
    }
    public void pegaTcc(int CDU) throws ClassNotFoundException, SQLException{
        
        Connection conn;
        conn = Conexao.getInstance().getConnection();
        String sql="select *from livros where pk_cdu='?'";
        
        /*try(PreparedStatement smt=conn.prepareCall(sql)){
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,CDU);
                        
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }*/
        sql = "delete from tcc where pk_cdu='?'";
        
        try(PreparedStatement smt=conn.prepareCall(sql)){
            
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,CDU);
            
                        
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
    }
    public void pegaRelatorios(int CDU) throws ClassNotFoundException, SQLException{
        
        Connection conn;
        conn = Conexao.getInstance().getConnection();
        String sql="select *from livros where pk_cdu='?'";
        
        /*try(PreparedStatement smt=conn.prepareCall(sql)){
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,CDU);
                        
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }*/
        sql = "delete from relatorios where pk_cdu='?'";
        
        try(PreparedStatement smt=conn.prepareCall(sql)){
            
            
            JOptionPane.showMessageDialog(null, "Entrou!");
            smt.setInt(1,CDU);
            
                        
            smt.executeUpdate();

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
    }
    
    
    
}
