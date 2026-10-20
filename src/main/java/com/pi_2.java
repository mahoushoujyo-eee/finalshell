/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.F2;
import com.ky_2;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.awt.Insets;
import java.util.StringTokenizer;

/*
 * Renamed from com.pi
 */
public class pi_2
extends AbstractSingleValueConverter {
    @Override
    public boolean canConvert(Class clazz) {
        return clazz.equals(Insets.class);
    }

    @Override
    public Object fromString(String string) {
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(string, ",", false);
            int n10 = Integer.parseInt(stringTokenizer.nextToken().trim());
            int n11 = Integer.parseInt(stringTokenizer.nextToken().trim());
            int n12 = Integer.parseInt(stringTokenizer.nextToken().trim());
            int n13 = Integer.parseInt(stringTokenizer.nextToken().trim());
            return new Insets(n10, n11, n12, n13);
        }
        catch (Throwable throwable) {
            try {
                int n14 = Integer.parseInt(string);
                return new Insets(n14, n14, n14, n14);
            }
            catch (Throwable throwable2) {
                return new Insets(0, 0, 0, 0);
            }
        }
    }

    @Override
    public String toString(Object object) {
        Insets insets = (Insets)object;
        int[] nArray = F2.T();
        String string = insets.top + "," + insets.left + "," + insets.bottom + "," + insets.right;
        if (nArray == null) {
            ky_2.K(new String[1]);
        }
        return string;
    }
}

