package com.persistence.sqlmapdao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;

public class BaseSqlMapDao extends SqlMapDaoTemplate {

  public BaseSqlMapDao(DaoManager daoManager) {
    super(daoManager);
  }
}
