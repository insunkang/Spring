package di.constructor03;

public class MyoracleArticleDAO implements IArticleDAO {

	@Override
	public void insert(ArticleDTO article) {
		System.out.println("MyoracleArticleDAO");

	}

}
