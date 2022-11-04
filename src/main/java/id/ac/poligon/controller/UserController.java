package id.ac.poligon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import id.ac.poligon.dao.UserDao;
import id.ac.poligon.entity.User;

@RestController
public class UserController {
	@Autowired
	private UserDao ud;

	@GetMapping("/users")
	public Iterable<User> ambilSemua() {
		return ud.findAll();
	}
	@PostMapping("/users")
	public void simpan(@RequestBody User t_user) {
		ud.save(t_user);
	}
}