/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EE;
import com.HJ;
import com.SW;

/*
 * Renamed from com.kg
 */
public class kg_2 {
    protected static boolean K = false;

    public static synchronized void j() {
        block3: {
            boolean bl;
            block2: {
                int[] nArray = SW.P();
                bl = K;
                if (nArray == null) break block2;
                if (bl) break block3;
                bl = true;
            }
            K = bl;
            EE.m(new SW());
            EE.H(new HJ());
            EE.A();
        }
    }
}

