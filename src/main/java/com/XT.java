/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.util.HashMap;

class XT
extends HashMap {
    XT(int n10) {
        super(n10);
        this.put(Boolean.TYPE, "Z");
        this.put(Character.TYPE, "C");
        this.put(Byte.TYPE, "B");
        this.put(Short.TYPE, "S");
        this.put(Integer.TYPE, "I");
        this.put(Long.TYPE, "J");
        this.put(Float.TYPE, "F");
        this.put(Double.TYPE, "D");
    }
}

