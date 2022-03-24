package setListManager.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import setListManager.model.User;
import setListManager.service.LoginService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private LoginService loginService;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		User loginUser = loginService.findLoginUser(userName);

		if(loginUser == null) {
			throw new UsernameNotFoundException("user not found");
		}

		return loginUser;
	}

}
