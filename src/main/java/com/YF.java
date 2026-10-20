/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.reflection.ReflectionConverter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.mapper.Mapper;
import com.u0;

public class YF
extends ReflectionConverter {
    public YF(Mapper mapper, ReflectionProvider reflectionProvider) {
        super(mapper, reflectionProvider);
    }

    @Override
    public boolean canConvert(Class clazz) {
        return u0.class.getCanonicalName().equals(clazz.getCanonicalName());
    }

    @Override
    public void marshal(Object object, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        u0 u02 = (u0)object;
        String[] stringArray = u0.P();
        for (int i2 = 0; i2 < u02.v(); ++i2) {
            Object object2 = u02.K(i2);
            hierarchicalStreamWriter.startNode(this.mapper.serializedClass(object2.getClass()));
            marshallingContext.convertAnother(object2);
            hierarchicalStreamWriter.endNode();
            Object object3 = u02.o(i2);
            hierarchicalStreamWriter.startNode(this.mapper.serializedClass(object3.getClass()));
            marshallingContext.convertAnother(object3);
            hierarchicalStreamWriter.endNode();
            if (stringArray != null) continue;
        }
    }

    @Override
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        u0 u02 = new u0();
        String[] stringArray = u0.P();
        int n10 = 0;
        Object object = null;
        while (hierarchicalStreamReader.hasMoreChildren()) {
            block5: {
                Class clazz;
                block4: {
                    block3: {
                        hierarchicalStreamReader.moveDown();
                        clazz = this.mapper.realClass(hierarchicalStreamReader.getNodeName());
                        if (stringArray == null) break block3;
                        if (n10 % 2 != 0) break block4;
                        object = unmarshallingContext.convertAnother(u02, clazz);
                    }
                    if (stringArray != null) break block5;
                }
                u02.A(object, unmarshallingContext.convertAnother(u02, clazz));
            }
            hierarchicalStreamReader.moveUp();
            ++n10;
            if (stringArray != null) continue;
        }
        return u02;
    }
}

