package id.ac.poligon.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import id.ac.poligon.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, String> {

}

