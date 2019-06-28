package com.example.demo.dozer;

import com.example.demo.dozer.domain.ContacterDO;
import com.example.demo.dozer.domain.vo.ContacterVO;
import org.dozer.DozerBeanMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DozerApplicationTests {

    //原创地址: https://blog.csdn.net/lp840312696/article/details/83748979
    //语雀地址: https://www.yuque.com/yuque_iq/geryog/cosuog
    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @Test
    public void contextLoads() {
        //接收参数 实体
        ContacterVO contacterVO = new ContacterVO();
        contacterVO.setName("23");

        //使用dozer进行转换
        ContacterDO contacterDO = dozerBeanMapper.map(contacterVO, ContacterDO.class);
        System.out.println(contacterDO.toString());

        ClassLoader classLoader = contacterVO.getClass().getClassLoader();
        System.out.println(classLoader);
        ClassLoader v = ContacterDO.class.getClassLoader();
        System.out.println(v);

        /*
        结果输出 :
            ContacterDO{name='23', sex='null', age=null, phone='null', location='null', dflag='null'}

            sun.misc.Launcher$AppClassLoader@18b4aac2

            sun.misc.Launcher$AppClassLoader@18b4aac2

            记住 类加载器最好是使用 系统加载器，我在项目中使用了热部署，出现了

            comXXX.Student cannot be cast to com.XXX.student

            自己转换自己异常？

            发现项目不同的类加载器加载导致

            org.springframework.boot.devtools.restart.classloader.RestartClassLoader@4bc032f

            org.springframework.boot.devtools.restart.classloader.RestartClassLoader@4bc032f

         */
    }

}
