/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G9;
import com.ld_2;
import java.lang.reflect.ParameterizedType;

/*
 * Renamed from com.e1
 */
public abstract class e1_0
implements ld_2 {
    private static String[] X;

    @Override
    public Class D() {
        try {
            return (Class)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    protected String q(G9 g92, Object[] objectArray) {
        return this.P(null, g92, objectArray);
    }

    protected String P(String string, G9 g92, Object[] objectArray) {
        return this.I(string, false, g92, objectArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    protected String I(String string, boolean bl, G9 g92, Object[] objectArray) {
        String string2;
        String string3 = g92.J(string, bl);
        String[] stringArray = e1_0.A();
        if (objectArray != null) {
            string2 = string3;
            if (stringArray == null) return string2;
            if (string2 != null) {
                string2 = this.B(string3, objectArray);
                return string2;
            }
        }
        string2 = string3;
        return string2;
    }

    private String B(String string, Object[] objectArray) {
        return String.format(string, objectArray);
    }

    public static void K(String[] stringArray) {
        X = stringArray;
    }

    public static String[] A() {
        return X;
    }

    static {
        if (e1_0.A() == null) {
            e1_0.K(new String[1]);
        }
    }
}

