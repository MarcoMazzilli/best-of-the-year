package org.java;

import java.util.ArrayList;

import org.java.pojo.Movie;
import org.java.pojo.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControllerMain {
	
	@GetMapping("/")
	public String homepage(Model model) {
		
		final String name = "Marco";
		
		model.addAttribute("name", name);
		
		return "index";
	}
	
	private ArrayList<Movie> getBestMovies() {
		
		ArrayList<Movie> movies = new ArrayList<Movie>();
		
		Movie m1 = new Movie("Quasi amici", 1);
		Movie m2 = new Movie("Interstellar", 2);
		Movie m3 = new Movie("Trainspotting", 3);
		
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		
		
		return movies;
	}
	
	@GetMapping("/movies")
	public String getMovies(Model model) {
		
		model.addAttribute("movies", getBestMovies());
		
		
		 return "movies";
	}
	
	private ArrayList<Song> getBestSongs() {
		
		ArrayList<Song> songs = new ArrayList<Song>();
		
		Song s1 = new Song("First date", 1);
		Song s2 = new Song("Stairway to Heaven", 2);
		Song s3 = new Song("WallaWalla", 3);
		
		songs.add(s1);
		songs.add(s2);
		songs.add(s3);
		
		
		return songs;
	}

	@GetMapping("/songs")
	public String getSongs(Model model) {
		
		model.addAttribute("songs", getBestSongs());
		
		
		 return "songs";
	}
	
	@GetMapping("/movies/{id}")
	public String movieDetails(@PathVariable int id, Model model) {
		
		Movie film = (Movie) getBestMovies()
			    .stream()
			    .filter(movie -> movie.getId() == id)
			    .findFirst()
			    .get();

		
		model.addAttribute("title", film.getName());
		
		
		return "movieDetails";
	}
	
	@GetMapping("/songs/{id}")
	public String songDetails(@PathVariable int id, Model model) {
		
		Song song = (Song) getBestSongs()
			    .stream()
			    .filter(movie -> movie.getId() == id)
			    .findFirst()
			    .get();

		
		model.addAttribute("title", song.getName());
		
		
		return "songDetails";
	}
}
