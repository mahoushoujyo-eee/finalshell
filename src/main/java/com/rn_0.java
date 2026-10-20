/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pa_0;
import com.qm_0;
import com.up_0;
import java.awt.Component;
import java.awt.dnd.DragSource;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from com.Rn
 */
public class rn_0 {
    protected static Map c;
    protected static qm_0 f;
    protected static Object b;
    protected static BufferedImage W;
    protected static Component h;
    protected static up_0 F;
    protected static boolean x;
    private static int V;

    public static synchronized void z() {
        block3: {
            boolean bl;
            block2: {
                int n10 = rn_0.R();
                bl = x;
                if (n10 != 0) break block2;
                if (bl) break block3;
                bl = true;
            }
            x = bl;
            c = new HashMap();
            pa_0 pa_02 = new pa_0();
            DragSource.getDefaultDragSource().addDragSourceListener(pa_02);
            DragSource.getDefaultDragSource().addDragSourceMotionListener(pa_02);
        }
    }

    public static void h(up_0 up_02) {
        c.put(up_02.y(), up_02);
    }

    public static void F(up_0 up_02) {
        c.remove(up_02.y());
    }

    static {
        x = false;
        rn_0.i(114);
    }

    public static void i(int n10) {
        V = n10;
    }

    public static int Y() {
        return V;
    }

    public static int R() {
        int n10 = rn_0.Y();
        if (n10 == 0) {
            return 21;
        }
        return 0;
    }
}

