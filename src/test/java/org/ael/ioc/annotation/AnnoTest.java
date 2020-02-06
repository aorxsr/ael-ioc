package org.ael.ioc.annotation;

import org.ael.ioc.core.DefaultIOC;
import org.ael.ioc.core.annotation.Bean;
import org.ael.ioc.core.annotation.Injection;
import org.ael.ioc.core.annotation.Service;
import org.ael.ioc.core.util.ClsUtil;
import org.junit.Test;

@Service
public class AnnoTest {

    @Injection
    private AnnoTest annoTest;

    @Test
    public void serviceTest() {
        Bean bean = AnnoTest.class.getAnnotation(Bean.class);
        System.out.println(bean);
        Bean bean1 = AnnoTest.class.getDeclaredAnnotation(Bean.class);
        System.out.println(bean1);
    }

    @Test
    public void defaultIocTest() {
        DefaultIOC defaultIOC = new DefaultIOC();
        defaultIOC.addBeanClss(Bean.class);
        defaultIOC.addBeanClss(Service.class);

        defaultIOC.init(ClsUtil.getClasses("org.ael.ioc"));

        Object bean = defaultIOC.getBean(DefaultIOC.class);
        System.out.println(bean);

    }
}
