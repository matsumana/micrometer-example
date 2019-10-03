package info.matsumana.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import info.matsumana.example.entity.Todo;

@Mapper
public interface TodoRepository {

    @Select("""
    SELECT `id`, `title`, `detail`, `finished` FROM `todo` ORDER BY `id` DESC
    """)
    List<Todo> findAll();
}
