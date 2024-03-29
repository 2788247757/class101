package cn.itcast.repository;

import cn.itcast.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {
    List<Goods> findByTitle(String title);

    List<Goods> findByPriceBetween(double i, double i1);
}
