package gym.cn.dao.impl;

import gym.cn.dao.AccountDao;
import gym.cn.entity.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class accountDao implements AccountDao {
    private SqlSessionFactory factory;
    public accountDao(SqlSessionFactory factory){
        this.factory=factory;
    }

    @Override
    public List<Account> findAll() {
        //1.根据factory获取SqlSession对象
        SqlSession session= factory.openSession();
        //2.调用SqlSession中的方法，实现查询列表
        List<Account> users=session.selectList("gym.cn.dao.AccountDao.findAll");
        session.close();
        return users;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(Account record) {
        return 0;
    }

    @Override
    public Account selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Account record) {
        return 0;
    }
}
