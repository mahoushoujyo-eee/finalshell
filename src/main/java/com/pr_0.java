/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.OT;
import com.ap_0;
import com.pa_1;
import java.util.HashMap;

/*
 * Renamed from com.Pr
 */
public class pr_0 {
    HashMap N = new HashMap();
    pa_1 Q;
    private static final long a;

    public pr_0(pa_1 pa_12) {
        this.Q = pa_12;
    }

    public void S() {
        this.N.clear();
    }

    public synchronized void h(char c2, int n10, int n11, boolean bl) {
        String[] stringArray = ap_0.F();
        if (c2 != (int)a) {
            ap_0 ap_02;
            ap_0 ap_03 = ap_02 = (ap_0)this.N.get(n11);
            if (stringArray == null) {
                if (ap_03 == null) {
                    ap_02 = new ap_0(n11);
                    this.N.put(n11, ap_02);
                }
                ap_03 = ap_02;
            }
            ap_03.t(c2, n10, bl);
        }
    }

    public synchronized void w() {
    }

    public synchronized void Q() {
    }

    public OT j() {
        return this.Q.N;
    }

    public HashMap R() {
        return this.N;
    }

    public void F(HashMap hashMap) {
        this.N = hashMap;
    }

    public int m() {
        return this.Q.c4.width;
    }

    public int F() {
        return this.Q.c4.height;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3174967673158164865L;
        a = 0x5001455DEBF0E1A1L ^ l2;
    }
}

