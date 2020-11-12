package com.amumu.importT;

import com.amumu.domain.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Amumu
 * @create 2019/7/30 15:00
 */
public class ColorfactoryBean implements FactoryBean<Color> {
    @Override
    public Color getObject() throws Exception {
        return new Color();
    }
    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }
    @Override
    public boolean isSingleton() {
        return false;
    }
}
