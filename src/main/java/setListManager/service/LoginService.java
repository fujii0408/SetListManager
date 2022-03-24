package setListManager.service;

import org.springframework.stereotype.Service;

import setListManager.model.User;

@Service
public interface LoginService {
	public User findLoginUser(String userName);

}
