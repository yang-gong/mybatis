package test;



import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import entity.User;
import mapper.OrderCostm;
import mapper.UserMapper;

public class test {

//	public static void main(String[] args) throws IOException {
//
//		String resource = "SqlMapConfig.xml";
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//		SqlSession sqlSession = null;
//		try {
//			sqlSession = sqlSessionFactory.openSession();
//
//			// ID查询
//			// User user = sqlSession.selectOne("test.findUserById", 10);
//			// System.out.println(user.getUsername());
//
//			// name 模糊查询
//			// List<User> list = sqlSession.selectList("test.findUserByUsername", "张");
//			// System.out.println(list.size());
//
//			// 增加用户
////			User user =new User();
////			user.setUsername("张小明");
////			user.setAddress("河南郑州");
////			user.setSex("1");
////			user.setBirthday(new Date());
////			sqlSession.insert("test.insertUser", user);
////			//提交事务
////			sqlSession.commit();
//			// 删除用户
//			// sqlSession.delete("test.deleteUserById", 27);
//			// 提交事务
//			// sqlSession.commit();
//
//			// 更新用戶信息
//			User user = new User();
//			user.setId(16);
//			user.setUsername("张小明");
//			user.setAddress("河南郑州");
//			user.setSex("26");
//			user.setBirthday(new Date());
//			sqlSession.update("test.updateUser", user);
//			// 提交事务
//			sqlSession.commit();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (sqlSession != null) {
//				sqlSession.close();
//			}
//		}
//	}
	// Dao开发
	public static void main(String[] args) throws Exception {

		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);

		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession sqlSession = null;

		sqlSession = sqlSessionFactory.openSession();

		UserMapper usermapper = sqlSession.getMapper(UserMapper.class);

		// 根据id查询用户信息
		// System.out.println(usermapper.findUserById(10));
		// 模糊查询
		// System.out.println(usermapper.findUserByUsername("张三"));
		// 删除
		// usermapper.deleteUser(29);
		// 增加用户
//		User user = new User();
//		user.setUsername("小明");
//		user.setBirthday(new Date());
//		user.setSex("1");
//		user.setAddress("上海");
//		usermapper.insertUser(user);
		// 更新用戶信息
//		User user = new User();
//		user.setId(31);
//		user.setUsername("张小明");
//		user.setAddress("河南郑州");
//		user.setSex("26");
//		user.setBirthday(new Date());
//		usermapper.updateUser(user);
		OrderCostm orderCostm = sqlSession.getMapper(OrderCostm.class);
//		List<OrderCostm> list = orderCostm.findUserById();
//		System.out.println(list);
		
		System.out.println(orderCostm.findUserorderById().size());
		
//		List<User> list = usermapper.Usernameidbirthday();
//		System.out.println(list.size());
//
//		System.out.println(list.get(2).getUsername());
		sqlSession.commit();
		sqlSession.close();

	}

}
