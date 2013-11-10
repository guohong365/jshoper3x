package com.jshop.service.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.jshop.dao.MemberRechargeTDao;
import com.jshop.entity.MemberRechargeT;
import com.jshop.service.MemberRechargeTService;
@Service("memberRechargeTService")
@Scope("prototype")
public class MemberRechargeTServiceImpl implements MemberRechargeTService {

	private MemberRechargeTDao memberRechargeTDao;
	
	
	public MemberRechargeTDao getMemberRechargeTDao() {
		return memberRechargeTDao;
	}

	public void setMemberRechargeTDao(MemberRechargeTDao memberRechargeTDao) {
		this.memberRechargeTDao = memberRechargeTDao;
	}

	@Override
	public void saveMemberRechargeT(MemberRechargeT mrt) {
		this.getMemberRechargeTDao().saveMemberRechargeT(mrt);

	}

	@Override
	public List<MemberRechargeT> findAllMemberRechargeT(int currentPage,
			int lineSize) {
		return this.getMemberRechargeTDao().findAllMemberRechargeT(currentPage, lineSize);
	}

	@Override
	public int countfindAllMemberRechargeT() {
		return this.getMemberRechargeTDao().countfindAllMemberRechargeT();
	}

	@Override
	public void updateMemberRechargeT(MemberRechargeT mrt) {
		this.getMemberRechargeTDao().updateMemberRechargeT(mrt);
	}

	@Override
	public void delMemberRechargeT(String[] strs) {
		this.getMemberRechargeTDao().delMemberRechargeT(strs);

	}

}
