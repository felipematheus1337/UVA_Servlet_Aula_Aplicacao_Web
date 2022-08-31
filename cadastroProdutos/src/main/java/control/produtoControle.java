package control;

import java.io.IOException;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Produto;
import persistence.ProdutoDao;
import persistence.UtilsBanco;


@WebServlet({"/produtoControle","/incluirproduto","/alterarproduto","/listarprodutos","/consultarproduto","/excluirproduto"})
public class produtoControle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public produtoControle() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request,response);
	
	}
	
    protected void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = request.getServletPath();
		if(url.equals("/incluirproduto")) {
			incluir(request,response);
		}
		System.out.println(url);
	
	}
    
    protected void incluir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try {
    		
    	
    	String nome = request.getParameter("nome");
		String categoria = request.getParameter("categoria");
		String lojafisica = request.getParameter("lojafisica");
		String quantidade = request.getParameter("quantidade");
		String preco = request.getParameter("preco");
		String descricao = request.getParameter("descricao");
		String dataValidade = request.getParameter("datavalidade");
		
		
		
		
		Produto p = new Produto();
		p.setNome(nome);
		p.setDataValidade(UtilsBanco.converterData(dataValidade));
		p.setCategoria(Integer.parseInt(categoria));
		p.setPreco(Float.parseFloat(preco.replace(',', '.')));
		p.setQuantidade(Integer.parseInt(quantidade));
		p.setTemLojaFisica(lojafisica);
		p.setDescricao(descricao);
	
		
		ProdutoDao pd = new ProdutoDao();
		
		if(pd.incluirProdutoDB(p)) {
			request.setAttribute("msg", "<div class='alert-success'>Produto cadastrado com sucesso! </div>");
		} else {
			request.setAttribute("msg", "<div class='alert-warning'>Erro ao cadastrar produto! </div>");
		}
		
    	} catch (Exception e) {
    		e.printStackTrace();
    		request.setAttribute("msg", "<div class='alert-danger'>Erro ao cadastrar produto! </div>");
    		
    	} finally {
    		request.getRequestDispatcher("produto.jsp").forward(request,response);
    	}
		
		
	
	}

}
