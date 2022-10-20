package com.digitalbook.util;

import com.digitalbook.Vo.UserVo;
import com.digitalbook.model.User;

public class UserTransFormationUtils {
	

	public static User mapVOToModel(UserVo userVo) {
		
		User user = new User();
		
		user.setFirstName(userVo.getFirstName());
		user.setLastName(userVo.getLastName());
		user.setUserEmail(userVo.getUserEmail());
		user.setPassword(userVo.getPassword());
		user.setAddress(userVo.getAddress());
		user.setCity(userVo.getCity());
		user.setPostalCode(userVo.getPassword());
		user.setPostalCode(userVo.getPostalCode());
		user.setSalutation(userVo.getSalutation());
		user.setMobileNumber(userVo.getMobileNumber());
		user.setCretedAt(userVo.getCretedAt());
		user.setUpdateAt(userVo.getUpdateAt());
		user.setUserName(userVo.getUserName());	
		user.setIs_active(userVo.getIs_active());
		return user;
	}

}
