/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.lz_1;
import com.pu_1;
import java.awt.Font;
import java.util.Map;

/*
 * Renamed from com.Hp
 */
public class hp_0 {
    private static final Map o = new lz_1();

    public static void c() {
        block3: {
            Map map;
            block2: {
                String string = FV.D();
                map = o;
                if (string != null) break block2;
                if (map == null) break block3;
                map = o;
            }
            map.clear();
        }
    }

    public static Font v(Font font, int n10, int n11) {
        Font font2;
        pu_1 pu_12 = hp_0.D(font, n10, n11);
        String string = FV.D();
        Font font3 = font2 = (Font)o.get(pu_12);
        if (string == null) {
            if (font3 == null) {
                font2 = font.deriveFont(n10, n11);
                o.put(pu_12, font2);
            }
            font3 = font2;
        }
        return font3;
    }

    protected static pu_1 D(Font font, int n10, int n11) {
        return new pu_1(font, n10, n11);
    }
}

