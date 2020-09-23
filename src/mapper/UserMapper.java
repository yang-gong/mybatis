package mapper;

import java.util.List;

import entity.User;

public interface UserMapper {
	public User findUserById(int id) throws Exception;
	
	public List<User> findUserByUsername(String username) throws Exception;
	
	public void insertUser(User user)throws Exception; 
   public int deleteUser(int id) throws Exception;
   public void updateUser(User user)throws Exception; 
   public List<User>Usernameidbirthday()throws Exception; 
}
