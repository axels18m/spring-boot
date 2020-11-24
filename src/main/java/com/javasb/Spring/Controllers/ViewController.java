package com.javasb.Spring.Controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javasb.Spring.Models.Posts;

@Controller
@RequestMapping("/home")
public class ViewController 
{
	/* Types of GetMapping
	 * consumes:	JSON, texto plano, etc.
	 * headers:		Encabezado
	 * name:		Nombre del metodo
	 * params:		Parametros
	 * path:		Ruta de endpoint
	 * produces:	JSON
	*/
	@GetMapping(path = {"/", "/index"})
	public String index(Model m)
	{
		m.addAttribute("posts", this.getPosts());
		return "index"; /* index.html */
	}
	
	public List<Posts> getPosts()
	{
		ArrayList<Posts> post = new ArrayList<>();
		post.add(new Posts(1, "Curso de programacion", "Some quick example text to build on the card title and make up the bulk of the card's content.", "programming.png", new Date()));
		
		return post;
	}		
}
