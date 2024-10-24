package pkg1.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {
	@Autowired
	BookRepo br;
	
	@GetMapping("/add")
	public String addBook() {
		return "index";
	}
	
	@PostMapping("/success")
	public String getStatus(Model model, @ModelAttribute BookEntity be) {
		br.save(be);
		model.addAttribute("key1","Success");
		return "index2";
	}
}
