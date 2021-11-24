package com.mycompany.myapp09.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("memberDao")
public class MemberDAO {
	@Autowired
	private SqlSessionTemplate SqlSessionTemplate;
	
	public int idCheck(String memberId) throws Exception {
		return SqlSessionTemplate.selectOne("Member.idCheck", memberId);
	}
}
