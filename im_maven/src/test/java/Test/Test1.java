package Test;
import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.im.dao.InvitationDao;
import com.im.pojo.Invitation;


public class Test1 {
	
	@Test
	public void test(){
		//加载配置文件
		String resource = "applicationContext-mybatis.xml";
		ApplicationContext context =  new ClassPathXmlApplicationContext(resource);
		//得到dao
		InvitationDao invitationDao = context.getBean(InvitationDao.class);
		System.out.println(invitationDao);
		//方法一查询所有帖子
		/*List<Invitation> list = invitationDao.find();
		System.out.println(list.size());
		for (Invitation item : list) {
			System.out.println(item.getId() + "\t" + item.getTitle());
		}*/
		
		//方法二根据地编号查询帖子
		/*Invitation Invitation = invitationDao.findById(22);
		System.out.println(Invitation.getTitle());*/
		
		//方法三增加帖子
		/*System.out.println("=================");
		Invitation invitation= new Invitation(0,"尚攀","在中软学java","张老师",new Timestamp(System.currentTimeMillis()));
		invitationDao.insert(invitation);
		System.out.println("+++++++++++++++++");
		List<Invitation> list = invitationDao.find();
		System.out.println(list.size());
		for (Invitation item : list) {
			System.out.println(item.getId() + "\t" + item.getTitle());
		}*/
		
		
		//方法四删除帖子
		//invitationDao.delete(new int[]{11,12});
		
		//方法五更新
		/*Invitation invitation = new Invitation(7, "陈晨光111学英语", "篮球场121", "张三121", new Timestamp(System.currentTimeMillis()));
		invitationDao.update(invitation);*/
			
		
	}
}
