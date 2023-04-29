package com.example.Movies.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Movies.Model.Movies;
import com.example.Movies.Repository.MoviesRepository;

@Service
public class MoviesService {

	@Autowired
	MoviesRepository movieRepository; 
	
	public List<Movies> getAllMovies()
	{
		List<Movies> movieList=movieRepository.findAll();
		return movieList;
	}
	
	public Movies saveMovies(Movies m)
	{
	     Movies obj=movieRepository.save(m);
	     return obj;
	     //return studRepository.save(s);
	}
	
	public Movies updateMovies(Movies m)
	{
	     Movies obj=movieRepository.save(m);
	     return obj;
	     //return studRepository.save(s);
	}
	
	public void deleteMovies(String name)
	{
	    movieRepository.deleteById(name);
	}
	
	public Movies getMovies(String name)
	{
	    Movies m=movieRepository.findById(name).get();
	    return m;
	}
	
	public List<Movies> sortMovies(String field) 
	{
		//return movieRepository.findAll(Sort.by(Direction.DESC,field));
		return movieRepository.findAll(Sort.by(field));
		
	}
	

	public List<Movies> pagingAndSortingEmployees(int offset, int pageSize, String field) 
	{
		Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
		Page<Movies> movie=movieRepository.findAll(paging);
		return movie.getContent();
	}

	public List<Movies> fetchMoviesByNamePrefix(String prefix) 
	{	
		return movieRepository.findByNameStartingWith(prefix);
	}
	
	public List<Movies> fetchMoviesByNameSuffix(String suffix) 
	{	
		return movieRepository.findByNameEndingWith(suffix);
	}
	
	public List<Movies> getMoviesBylanguage(String lang,String name)
	{
		return movieRepository.getMoviesBylanguage(lang,name);
	}
}
