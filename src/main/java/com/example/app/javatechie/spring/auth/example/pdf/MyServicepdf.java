package com.example.app.javatechie.spring.auth.example.pdf;

import java.util.List;


import com.example.app.javatechie.spring.auth.example.pdf.DTOpdf;
import com.example.app.javatechie.spring.auth.example.pdf.Pdf;

public interface MyServicepdf {
	public String addpdf(DTOpdf DTOpdf);
	List <Pdf> findAll();
	Pdf findById(Integer id);
	Pdf save(Pdf pdf);

}
