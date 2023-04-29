package com.example.Movies.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Movies.Model.Movies;

@Repository

public interface MoviesRepository extends JpaRepository<Movies,String>
{

	//positional parameter
		@Query("select s from Movies s where s.language=?1 and s.name=?2")
		public List<Movies> getMoviesBylanguage(String lang,String name);
		
		//named parameter
		@Query("select s from Movies s where s.language=:lang")
		public List<Movies> getMoviesBylanguage(String lang);
		
		//DML parameter
		@Query("delete from Movies s where s.name=?1")
		public int deleteMoviesByName(String name);
			
		List<Movies> findByNameStartingWith(String prefix);
		List<Movies> findByNameEndingWith(String suffix);
		List<Movies> findBylanguage(String lang);
}

