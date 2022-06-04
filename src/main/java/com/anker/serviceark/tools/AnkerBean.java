package com.anker.serviceark.tools;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.beanutils.BeanUtilsBean;

import java.lang.reflect.InvocationTargetException;

@Log4j2
public class AnkerBean extends BeanUtilsBean {
    @Override
    public void copyProperty(Object dest, String name, Object value)
            throws InvocationTargetException, IllegalAccessException {
        if(value == null)   return;
        super.copyProperty(dest, name, value);
    }

    @Override
    public void copyProperties(Object dest, Object orig) throws InvocationTargetException, IllegalAccessException {
        super.copyProperties(dest, orig);
    }

    public static void copy(Object source, Object target){
        try {
            AnkerBean bean = new AnkerBean();
            bean.copyProperties(target, source);
        } catch (Exception e){
            log.error(e);
        }
    }
}
