package control.ser.test;

import gym.cn.dao.AccountDao;
import gym.cn.dao.impl.accountDao;
import gym.cn.entity.Account;
import gym.cn.service.AccountService;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MybatisTest {
    private InputStream in;
    private AccountDao accountdao;
    private SqlSession sqlSession;
    private AccountService accountservice;
    @Before  // test方法执行之前执行
    public void init() throws IOException {
        //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建 SqlSessionFactory 的构建者对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        //4.使用 SqlSessionFactory 生产 SqlSession 对象
        sqlSession=factory.openSession(true);
        //3.使用工厂对象，创建dao对象
        accountdao =sqlSession.getMapper(AccountDao.class);
        accountservice =sqlSession.getMapper(AccountService.class);
    }
    @After // test方法执行之后执行
    public void destroy() throws IOException {
        //提交事务
        sqlSession.commit();
        //7.释放资源
        sqlSession.close();
        in.close();
    }
    @Test
    public void testFindAll() throws IOException {
        //6.使用代理对象执行查询所有方法
        List<Account> accounts = accountdao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void testDeleteByPrimaryKey() {
        accountdao.deleteByPrimaryKey("4");
    }

    @Test
    public void testInsert() throws ParseException {
        Date date1=new Date();//需要new一个Date对象
        Date date2=new Date();
        String string ="2020-11-23";//输入想要添加的生日
        String string2="2021-11-23";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); //设置日期格式  yyyy-MM-dd-HH-mm-ss这个是完整的
        date1 = dateFormat.parse(string);
        date2= dateFormat.parse(string2);
        Account record=new Account("4","tql",3000,date1,date2);
        accountdao.insert(record);
    }

    @Test
    public void testSelectByPrimaryKey() {
        Account account=accountdao.selectByPrimaryKey("4");
        System.out.println(account);
    }

    @Test
    public void testUpdateByPrimaryKey() throws ParseException {
        Date date1=new Date();//需要new一个Date对象
        Date date2=new Date();
        String string ="2020-5-15";//输入想要添加的生日
        String string2="2021-5-15";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); //设置日期格式  yyyy-MM-dd-HH-mm-ss这个是完整的
        date1 = dateFormat.parse(string);
        date2= dateFormat.parse(string2);
        Account record =new Account("4","jyj",5000,date1,date2);
        accountdao.updateByPrimaryKey(record);
    }

    @Test
    public void testTranfer() {
accountservice.transfer("4","1",1000);
    }
}
