package com.example.app.javatechie.spring.auth.example.pdf;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.javatechie.spring.auth.example.pdf.DTOpdf;
import com.example.app.javatechie.spring.auth.example.pdf.Pdf;
import com.example.app.javatechie.spring.auth.example.pdf.MyServicepdf;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/pdf")
public class pdfController {
	  @Autowired
	   public MyServicepdf MyServicepdf;

	  
	  
	    @PostMapping("/save")
	    public String savepdf(@RequestBody DTOpdf DTOpdf) {
	    	String id=MyServicepdf.addpdf(DTOpdf);
	    	return id;      
	    }
	    
	    
	    @GetMapping
	    public List<Pdf> getAll() {
	        return MyServicepdf.findAll();
	    }
	    
	    @ResponseBody
	    @GetMapping("{id}")
	    public Pdf get(@PathVariable("id") Integer id) {
	    	return MyServicepdf.findById(id);

	    }
	    

}