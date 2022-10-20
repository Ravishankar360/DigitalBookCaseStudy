package com.digitalbook.service;

import com.digitalbook.Vo.UserVo;
import com.digitalbook.model.User;

public interface UserService {
	
	public User createUser(UserVo userVo);

}
