package setListManager.repository;

import org.apache.ibatis.annotations.Mapper;

import setListManager.model.User;

@Mapper
public interface UserMapper {
	public User findLoginUser(String userName);
}
