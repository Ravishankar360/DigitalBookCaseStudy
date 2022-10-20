package com.digitalbook.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbook.Repository.UserRepository;
import com.digitalbook.Vo.UserVo;
import com.digitalbook.model.User;
import com.digitalbook.service.UserService;
import com.digitalbook.util.UserTransFormationUtils;

import antlr.StringUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	public User createUser(UserVo userVo) {
		User user = UserTransFormationUtils.mapVOToModel(userVo);
	    User savedUser = userRepo.save(user);
		
		return savedUser;
	}

}
