package com.altamiro.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altamiro.todo.domain.Todo;
import com.altamiro.todo.repositories.TodoRepository;

@Service
public class DBServices {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot2 e Angular 11",
				sdf.parse("25/03/2022"), false);
		
		Todo t2 = new Todo(null, "Ler", "Ler livro de desenvolvimento pessoal",
				sdf.parse("25/03/2022"), true);

		Todo t3 = new Todo(null, "Exercício", "Praticar exercícios físicoa",
				sdf.parse("25/03/2021"), false);
		
		Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 minutos pela manhã",
				sdf.parse("27/03/2022"), true);


		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
