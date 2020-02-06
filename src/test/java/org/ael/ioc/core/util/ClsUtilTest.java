package org.ael.ioc.core.util;


public class ClsUtilTest {

    public static void main(String[] args) {
        ClsUtil.getClasses("org")
                .forEach(cls -> System.out.println(cls.getName()));
    }

}
