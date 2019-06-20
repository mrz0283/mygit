package com.im.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.dao.InvitationDao;
import com.im.pojo.Invitation;
import com.im.service.InvitationService;
@Service
public class InvitationServiceImpl implements InvitationService {

	@Resource
	private InvitationDao invitationDao;

    /**
	 * 查询所有
	 */

	public List<Invitation> find(){
		return invitationDao.find();
	}
	/**
	 * 根据帖子编号查询帖子
	 * @param id
	 * @return
	 */
	
	public Invitation findById(int id){
		return invitationDao.findById(id);
	}
	/**
	 * 添加帖子
	 * @param invitation
	 * @return
	 */
	
	public boolean insert(Invitation invitation){
		return invitationDao.insert(invitation)>0 ? true : false;
	}
	/**
	 * 删除帖子
	 * @param ids
	 * @return
	 */
	
	public boolean delete(int[] ids){
		return invitationDao.delete(ids)>0 ? true : false;
	}
	/**
	 * 修改（更新）帖子
	 * @param invitation
	 * @return
	 */
	
	public boolean update(Invitation invitation){
		return invitationDao.update(invitation)>0 ? true : false;
	}
	/**
	 * 模糊查询
	 * @param title
	 * @return
	 */
	public List<Invitation> search(String title) {
		return invitationDao.search(title);
	}
	
}
