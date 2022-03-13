

package cn.sm1234.article.dao;
import cn.sm1234.article.pojo.Article;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * 文章 dao
 */
public interface ArticleDao extends JpaRepository<Article,Integer>{
}