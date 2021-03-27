package gym.cn.service.impl;

import gym.cn.dao.AccountDao;
import gym.cn.entity.Account;
import gym.cn.service.AccountService;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class accountService implements AccountService {
    // 1查询所有记录
   public List<Account> findAll() {return null;}

    // 2通过id删除记录
    public void deleteByPrimaryKey(String id) {}
    // 3插入记录
    public void insert(Account record) {}
    // 4通过id查找对象
    public Account selectByPrimaryKey(String id) {return null;}
    // 5更新Account
    public void updateByPrimaryKey(Account record) {}
    // 6转账功能 输入转出人id，转入人id，转账金额 实现转账

 @Override
 public void trans(String id, int money) {

 }


    @Override
    public void transfer(String remitterId, String remitteeId, int money) {
        trans(remitterId,-money);
        trans(remitteeId,money);
    }
}
