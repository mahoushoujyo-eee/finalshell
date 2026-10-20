/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.LE;
import com.thoughtworks.xstream.converters.basic.StringConverter;

public class FX
extends StringConverter {
    @Override
    public Object fromString(String string) {
        return LE.o((String)super.fromString(string));
    }

    @Override
    public String toString(Object object) {
        return LE.E(super.toString(object));
    }
}

