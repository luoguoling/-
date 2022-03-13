
package cn.sm1234.article.controller;
import cn.sm1234.article.pojo.Article;
import cn.sm1234.article.pojo.Result;
import cn.sm1234.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * 文章 Controller
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    /**
     * 查询所有
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        return new Result(true," 查询成功",articleService.findAll());
    }
    /**
     * 查询一个
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable Integer id){
        return new Result(true," 查询成功",articleService.findById(id));
    }
/**
 * 添加
 */
@RequestMapping(method = RequestMethod.POST)
public Result add(@RequestBody Article article){
    articleService.add(article);
    return new Result(true," 添加成功");
}
    /**
     * 修改
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@RequestBody Article article,@PathVariable Integer id){
        article.setId(id);
        articleService.update(article);
        return new Result(true," 修改成功");
    }
    /**
     * 删除
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable Integer id){
        articleService.deleteById(id);
        return new Result(true," 删除成功");
    }
}