package com.im.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.im.pojo.Invitation;

/**
 * @author mrz
 * @category 业务逻辑
 */
public interface InvitationService {
	

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
	public boolean insert(Invitation invitation);
	
	/**
	 * 删除帖子
	 * @param ids
	 * @return
	 */
	public boolean delete(int[] ids);
	
	/**
	 * 修改（更新）帖子
	 * @param invitation
	 * @return
	 */
	public boolean update(Invitation invitation);

	/**
	 * 模糊查询
	 * @param title
	 * @return
	 */
	public List<Invitation>search(String title);

	
}
