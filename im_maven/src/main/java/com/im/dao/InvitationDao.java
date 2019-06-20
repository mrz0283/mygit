package com.im.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.im.pojo.Invitation;

/**
 * @author mrz
 * @category 帖子的数据访问接口
 */
public interface InvitationDao {
	
	/**
	 * 查询所有
	 */
	public List<Invitation> find();
	/**
	 * 根据帖子编号查询帖子
	 * @param id
	 * @return
	 */
	public Invitation findById(int id);
	
	/**
	 * 添加帖子
	 * @param invitation
	 * @return
	 */
	public int insert(Invitation invitation);
	
	/**
	 * 删除帖子
	 * @param ids
	 * @return
	 */
	public int delete(int[] ids);
	
	/**
	 * 修改（更新）帖子
	 * @param invitation
	 * @return
	 */
	public int update(Invitation invitation);
	
	/**
	 * 模糊查询
	 * @param title
	 * @return
	 */
	public List<Invitation>search(@Param("title")String title);

	
	
	
	

}
