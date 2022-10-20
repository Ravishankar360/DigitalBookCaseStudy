package com.digitalbook.Controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbook.Repository.UserRepository;
import com.digitalbook.Vo.UserVo;
import com.digitalbook.model.User;
import com.digitalbook.serviceImpl.UserServiceImpl;

import net.bytebuddy.asm.Advice.Return;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Autowired
	private UserRepository userRepo;

	@RequestMapping(value="/create" , method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody UserVo userVo ){
		JSONObject obj = new JSONObject();
		
		try {
			User isExist = userRepo.findByEmailUser(userVo.getUserEmail());
			if(isExist != null && isExist.getIs_active().equals(0)) {
				obj.put("data", "UserAccount is already available");
			}else {
				userServiceImpl.createUser(userVo);	
				obj.put("data", "User Account Successfully Created");
			}
		}catch(Exception e) {
			e.printStackTrace();
			obj.put("data", "Somthing went wrong");
			return new ResponseEntity<> (obj, HttpStatus.CONFLICT);
		}		
		return new ResponseEntity<> (obj,HttpStatus.OK);		
	}

}
