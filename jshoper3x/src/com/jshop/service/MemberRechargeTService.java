package com.jshop.service;

import java.util.List;

import com.jshop.entity.MemberRechargeT;

public interface MemberRechargeTService {
	/**
	 * 增加充值账户余额
	 * @param mrt
	 */
	public void saveMemberRechargeT(MemberRechargeT mrt);
	/**
	 * 查询所有充值账户余额
	 * @param currentPage
	 * @param lineSize
	 * @return
	 */
	public List<MemberRechargeT>findAllMemberRechargeT(int currentPage,int lineSize);
	/**
	 * 统计查询所有充值账户余额
	 * @return
	 */
	public int countfindAllMemberRechargeT();
	/**
	 * 更新充值账户余额信息
	 * @param mrt
	 */
	public void updateMemberRechargeT(MemberRechargeT mrt);
	/**
	 * 删除充值账户信息
	 * @param strs
	 */
	public void delMemberRechargeT(String[]strs);
	
	
}
