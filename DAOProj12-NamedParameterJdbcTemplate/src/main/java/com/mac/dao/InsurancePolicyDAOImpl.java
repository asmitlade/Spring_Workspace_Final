package com.mac.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mac.bo.InsurancePolicyBO;

@Repository("pDAO")
public class InsurancePolicyDAOImpl implements InsurancePolicyDAO {
	private static final String GET_POLICY_BY_ID = "SELECT POLICYID, POLICYNAME, TENURE, COMPANY, INITIALAMT FROM INSURANCEPOLICY WHERE POLICYID = :id";
	private static final String GET_POLICY_BY_NAME = "SELECT POLICYID, POLICYNAME, TENURE, COMPANY, INITIALAMT FROM INSURANCEPOLICY WHERE POLICYNAME IN (:name1, :name2, :name3)";
	private static final String INSERT_QUERY = "INSERT INTO INSURANCEPOLICY VALUES(:policyId, :policyName, :tenure, :company, :initialAmt)";
	
	@Autowired
	private NamedParameterJdbcTemplate npjt;

	public InsurancePolicyBO getPolicyById(int policyId) {
		//prepare param values
		Map<String, Object> paramMap = null;
		InsurancePolicyBO bo = null;
		paramMap = new HashMap<String, Object>();
		paramMap.put("id", policyId);
		//execute Query
		bo = npjt.queryForObject(GET_POLICY_BY_ID, paramMap, new PolicyRowMapper());
		return bo;
	}
	private class PolicyRowMapper implements RowMapper<InsurancePolicyBO>{

		public InsurancePolicyBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			InsurancePolicyBO pbo = new InsurancePolicyBO();
			pbo.setPolicyId(rs.getInt(1));
			pbo.setPolicyName(rs.getString(2));
			pbo.setTenure(rs.getInt(3));
			pbo.setCompany(rs.getString(4));
			pbo.setInitialAmt(rs.getFloat(5));
			return pbo;
		}
	}
	public List<InsurancePolicyBO> getDetailsByName(String name1, String name2, String name3) {
		List<InsurancePolicyBO> listBO = null;
		MapSqlParameterSource params = null;
		params = new MapSqlParameterSource();
		params.addValue("name1", name1);
		params.addValue("name2", name2);
		params.addValue("name3", name3);
		listBO = npjt.query(GET_POLICY_BY_NAME, params, rs->{
			List<InsurancePolicyBO> listBO1 = new ArrayList();
			while(rs.next()) {
				InsurancePolicyBO bo1 = new InsurancePolicyBO();
				bo1.setPolicyId(rs.getInt(1));
				bo1.setPolicyName(rs.getString(2));
				bo1.setTenure(rs.getInt(3));
				bo1.setCompany(rs.getString(4));
				bo1.setInitialAmt(rs.getFloat(5));
				listBO1.add(bo1);
			}
			return listBO1;
		});
		return listBO;
	}

	@Override
	public int insert(InsurancePolicyBO bo) {
		InsurancePolicyBO bo2 = null;
		BeanPropertySqlParameterSource bsp = null;
		int count = 0;
		bsp = new BeanPropertySqlParameterSource(bo);
		count = npjt.update(INSERT_QUERY, bsp);
		return count;
	}
}
