package setListManager.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import setListManager.model.User;
import setListManager.repository.UserMapper;
import setListManager.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User findLoginUser(String userName) {
		return userMapper.findLoginUser(userName);
	}

}
