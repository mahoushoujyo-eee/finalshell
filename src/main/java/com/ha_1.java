/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hn_1;

/*
 * Renamed from com.hA
 */
public class ha_1
extends hn_1 {
    private int W;
    private int U;
    private static final long a;

    public ha_1() {
        this(-1, (int)a);
    }

    public ha_1(int n10, int n11) {
        this.O = true;
        this.W = n10;
        this.U = n11;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        String[] stringArray = W5.q();
        int n13 = n12;
        if (stringArray != null) {
            if (n13 == this.W) {
                return this.U;
            }
            n13 = n12;
        }
        return n13;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7900845767648081856L;
        a = 0x79C67FE682CFF7C0L ^ l2;
    }
}

