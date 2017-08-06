package br.com.defensor.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.defensor.model.bean.Presidiario;
import br.com.defensor.model.dao.IPresidiarioDao;

/**
 * Classe controlador do presidiario
 * 
 * @author fernando
 *
 */
@Controller
public class PresidiarioController {

	@Autowired
	private IPresidiarioDao presidiarioDao;

	/**
	 * metodo que exibe o formulario
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("presidiario")
	public String setupForm(Map<String, Object> map) {
		map.put("presidiario", new Presidiario());
		map.put("presidiarios", this.presidiarioDao.findAll());

		return "form-presidiario";
	}

	/**
	 * metodo que recebe a acao do formulario
	 * @param presidiario
	 * @param result
	 * @param action
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "presidiario.do", method = RequestMethod.POST)
	public String doAction(@ModelAttribute Presidiario presidiario,
			BindingResult result, @RequestParam String action,
			Map<String, Object> map) {

		Presidiario presidiarioResult = new Presidiario();

		switch (action.toLowerCase()) {

		case "add":
			this.presidiarioDao.save(presidiario);
			break;

		case "edit":
			this.presidiarioDao.update(presidiario);
			break;

		case "search":
			Presidiario find = this.presidiarioDao.find(presidiario.getId());
			presidiarioResult = find != null ? find : presidiarioResult;
			break;

		case "delete":
			this.presidiarioDao.delete(presidiario);
			break;

		}

		map.put("presidiario", presidiarioResult);
		map.put("presidiarios", this.presidiarioDao.findAll());

		return "form-presidiario";
	}
}
