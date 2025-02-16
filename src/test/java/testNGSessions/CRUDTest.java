package testNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CRUDTest {
	//Create  get  update  Delete
	
	public int createUser()
	{
		System.out.println("Create User");
		return 100;
	}
	public String getUserInfo(int userID)
	{
		return "user info";
	}
	public String updateUserInfo(int userId) {
		return "updated user info";
	}

	public String deleteUserInfo(int userId) {
		return "user is not found 404 error";
	}
	@Test
	public void createUserTest()
	{
		  int userid = createUser();
		  Assert.assertEquals(userid,100);
	}
	@Test
	public void getuserInfoTest()
	{
		int userId = createUser();
		String userInfo = getUserInfo(userId);
		Assert.assertEquals(userInfo,"user info");
	}
	@Test
	public void updateUserTest() {
		//create ---> userId -->updateUser(userId)-->getUser(userID)
		int userId = createUser();
		String updatedInfo = updateUserInfo(userId);
		String userInfo = getUserInfo(userId);
		Assert.assertTrue(updatedInfo.contains(userInfo));
	}
  
	@Test
	public void deleteUserTest() {
		//create ---> userId -->deleteUser(userId)--user not found
		int userId = createUser();
		String mesg = deleteUserInfo(userId);
		Assert.assertTrue(mesg.contains("404"));
	}

}
