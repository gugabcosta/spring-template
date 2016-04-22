package br.com.gugabcosta.springtemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.gugabcosta.springtemplate.model.Pessoa;

@Controller
public class PessoaController {

	@RequestMapping(path="/pessoa")
	public String gerenciarPessoa(Model model){
		Pessoa pessoa = new Pessoa();
		pessoa.setPrimeiroNome("Gustavo");
		pessoa.setSegundoNome("Costa");
		pessoa.setIdade(30);
		model.addAttribute("pessoa", pessoa);
		return "pessoaView";
	}
	
	@RequestMapping(path="/")
	public String index(Model model){
		return "index";
	}
}
