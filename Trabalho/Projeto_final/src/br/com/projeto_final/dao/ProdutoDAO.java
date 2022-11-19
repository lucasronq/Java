
package br.com.projeto_final.dao;

import java.sql.*;
import br.com.projeto_final.dto.ProdutoDTO;
import br.com.projeto_final.dto.FornecedorDTO;

public class ProdutoDAO {
    
    /**
     * Método Construtor da classe
     */
    public ProdutoDAO(){
    }
    
    private ResultSet rs = null;
    
    private Statement stmt = null;
    
    public boolean inserirProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO){
        try{
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Instancia o Statement que sera responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            
            //Comando SQL que sera executado no banco de dados
            String comando = "Insert into produto (nome_prod, desc_prod, cod_bar_prod, "
                    + "p_custo_prod, p_venda_prod, id_for) values ( "
                    + "'" + produtoDTO.getNome_prod()+ "', "
                    + "'" + produtoDTO.getDesc_prod()+ "', "
                    + "'" + produtoDTO.getCod_bar_prod()+ "', "
                    + produtoDTO.getP_custo_prod()+ ", "
                    + produtoDTO.getP_venda_prod()+ ", "
                    + fornecedorDTO.getId_for()+ ") ";
            
            //Executa o comando SQL no banco de dados
            stmt.execute(comando.toUpperCase());
            // Da um commit no banco de dados
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        }//Caso tenha algum erro no codigo acima é enviado uma mensagem no
         //console com o que esta acontecendo
        catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }//Independente de dar erro ou não ele vai fechar o banco de dados.
        finally{
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método inserirProduto
    
    public boolean alterarProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO){
        try{
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que é responsável por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            
            //Comando SQL que sera executado no banco de dados
            String comando = "Update produto set "
                    + "nome_prod = '" + produtoDTO.getNome_prod()+ "', "
                    + "desc_prod = '" + produtoDTO.getDesc_prod()+ "', "
                    + "cod_bar_prod = '" + produtoDTO.getCod_bar_prod()+ "', "
                    + "p_custo_prod = " + produtoDTO.getP_custo_prod()+ ", "
                    + "p_venda_prod = " + produtoDTO.getP_venda_prod()+ ", "
                    + "id_for = " + fornecedorDTO.getId_for()+ " "
                    + "where id_prod = " + produtoDTO.getId_prod();
            
            //Executa o comando SQL no banco de dados
            stmt.execute(comando.toUpperCase());
            //Da um commit no banco de dados
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        }//Caso tenha algum erro no codigo acima é enviado uma mensagem no
         //console com o que esta acontecendo
        catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }//Independente de dar erro ou não ele vai fechar o banco de dados.
        finally{
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }     
    }//Fecha o metodo alterarProduto
    
    public boolean excluirProduto(ProdutoDTO produtoDTO){
        try{
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que é responsável por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Delete from produto where id_prod = "
                             + produtoDTO.getId_prod();
            
            //Executa o comando SQL no banco de Dados
            stmt.execute(comando);
            //Da um commit no banco de dados
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        }//Caso tenha algum erro no codigo acima é enviado uma mensagem no
         //console com o que esta acontecendo
        catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }//Independente de dar erro ou não ele vai fechar o banco de dados.
        finally{
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }   
    }//Fecha o método excluirProduto
    
    public ResultSet consultarProduto(ProdutoDTO produtoDTO, int opcao){
        try{
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que é responsável por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "";
            
            switch (opcao){
                case 1:
                    comando = "Select p.* "+
                              "from produto p "+
                              "where p.nome_prod ilike '" + produtoDTO.getNome_prod()+ "%' " +
                              "order by p.nome_prod";
                break;
                case 2:
                    comando = "Select p.*, f.nome_for, f.id_for "+
                              "from produto p, fornecedor f " +
                              "where p.id_for =  f.id_for and " +
                              "p.id_prod = " + produtoDTO.getId_prod();
                break;
            }
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        }//Caso tenha algum erro no codigo acima é enviado uma mensagem no
         //console com o que esta acontecendo
        catch(Exception e){
            System.out.println(e.getMessage());
            return rs;
        }
    }
}
