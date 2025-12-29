class ItemBiblioteca {
    protected String titulo;
    protected String autor;
    protected int anoDePublicacao;
    protected boolean disponivel = true;

    public ItemBiblioteca(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public void emprestar() {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        if (disponivel == true) {
            return true;
        } else {
            return false;
        }
    }

    public void exibirDetalhes() {
        System.out.println("Tipo: Item Genérico");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoDePublicacao);

        if (disponivel == true) {
            System.out.println("Disponível: sim");
        } else {
            System.out.println("Disponível: não");
        }

        System.out.println();
    }
}

class Livro extends ItemBiblioteca {
    private int numeroDePaginas;

    public Livro(String titulo, String autor, int anoDePublicacao, boolean disponivel, int numeroDePaginas) {
        super(titulo, autor, anoDePublicacao);
        this.disponivel = disponivel;
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo: Livro");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoDePublicacao);
        System.out.println("Paginas: " + numeroDePaginas);

        if (disponivel == true) {
            System.out.println("Disponível: sim");
        } else {
            System.out.println("Disponível: não");
        }

        System.out.println();
    }
        
}

class Revista extends ItemBiblioteca {
	private int edicao;

	public Revista(String titulo, String autor, int anoDePublicacao, boolean disponivel, int edicao) {
		super(titulo, autor, anoDePublicacao);
		this.disponivel = disponivel;
		this.edicao = edicao;
	}
	
	@Override
    public void exibirDetalhes() {
        System.out.println("Tipo: Livro");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoDePublicacao);
        System.out.println("Edicao: " + edicao);

        if (disponivel == true) {
            System.out.println("Disponível: sim");
        } else {
            System.out.println("Disponível: não");
        }

        System.out.println();
    }
	
	
}

class Biblioteca {
	private static final int CAPACIDADE_MAXIMA = 10;
	private ItemBiblioteca[] acervo = new ItemBiblioteca[CAPACIDADE_MAXIMA];
	private int totalDeItens;
	
	public void adicionaItem(ItemBiblioteca item) {
		for (int i=0; i<acervo.length; i++) {
			if (acervo[i] != null) {
				if (i == acervo.length) {
					System.out.println("Erro: Acervo da biblioteca esta cheio.");
				}
			}
			else {
				acervo[i] = item;
				System.out.println("Item adicionado com sucesso.");
				return;
			}
		}
	}
	
	public void listarItens() {
		System.out.println(" --- Acervo da Biblioteca ---");
		ItemBiblioteca item = new ItemBiblioteca();
	}
	
}
