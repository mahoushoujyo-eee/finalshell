/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FD;
import com.c8_0;
import com.cb_1;
import com.on_0;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.za
 */
public class za_0
implements on_0 {
    protected c8_0 F;
    protected Map R = new HashMap();
    protected boolean O = false;
    protected boolean z = false;
    protected boolean k = false;
    protected String A = "";

    public c8_0 W() {
        return this.F;
    }

    public void g(c8_0 c8_02) {
        String[] stringArray = cb_1.C();
        c8_0 c8_03 = c8_02;
        if (stringArray != null) {
            c8_03 = c8_03 != null ? c8_02 : new FD();
        }
        this.F = c8_03;
    }

    public boolean N() {
        return this.O;
    }

    public void u(boolean bl) {
        this.O = bl;
    }

    public boolean j() {
        return this.z;
    }

    public void Q(boolean bl) {
        this.z = bl;
    }

    public boolean T() {
        return this.k;
    }

    public void I(boolean bl) {
        this.k = bl;
    }

    public String W() {
        return this.A;
    }

    public void z(String string) {
        this.A = string;
    }

    public void A() {
        this.R.clear();
    }

    public void o(cb_1 cb_12) {
        this.x(cb_12.H());
    }

    public void x(String string) {
        this.R.remove(string);
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean r(cb_1 var1_1) {
        var2_2 = cb_1.C();
        v0 = this;
        if (var2_2 == null) ** GOTO lbl8
        if (v0.O) {
            v1 = this.A;
        } else {
            v0 = this;
lbl8:
            // 2 sources

            v1 = v0.A.toLowerCase();
        }
        var3_3 = v1;
        v2 = var3_3.equals("");
        if (var2_2 == null) return v2;
        if (v2 != false) return true;
        v2 = this.H(var1_1, var3_3);
        if (var2_2 == null) return v2;
        if (v2 == false) return false;
        return true;
    }

    protected boolean H(cb_1 cb_12, String string) {
        boolean bl;
        block6: {
            int n10;
            String[] stringArray = cb_1.C();
            int n11 = this.s(cb_12, string);
            if (stringArray != null) {
                if (n11 != 0) {
                    return true;
                }
                n11 = n10 = 0;
            }
            while (n10 < cb_12.getChildCount()) {
                block8: {
                    boolean bl2;
                    block7: {
                        bl = this.H(cb_12.T(n10), string);
                        if (stringArray == null) break block6;
                        if (stringArray == null) break block7;
                        if (!bl) break block8;
                        bl2 = true;
                    }
                    return bl2;
                }
                ++n10;
                if (stringArray != null) continue;
            }
            bl = false;
        }
        return bl;
    }

    protected boolean s(cb_1 cb_12, String string) {
        Boolean bl = (Boolean)this.R.get(cb_12.H());
        String[] stringArray = cb_1.C();
        Boolean bl2 = bl;
        if (stringArray != null) {
            if (bl2 == null) {
                bl = this.X(cb_12, string);
                this.R.put(cb_12.H(), bl);
            }
            bl2 = bl;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    protected boolean X(cb_1 var1_1, String var2_2) {
        var3_3 = cb_1.C();
        v0 = this;
        if (var3_3 == null) ** GOTO lbl8
        if (v0.O) {
            v1 = this.F.C(var1_1);
        } else {
            v0 = this;
lbl8:
            // 2 sources

            v1 = v0.F.C(var1_1).toLowerCase();
        }
        var4_4 = v1;
        v2 = this.z;
        if (var3_3 != null) {
            if (v2) {
                var5_5 = new StringTokenizer(var2_2, " ", false);
                while (var5_5.hasMoreTokens()) {
                    v3 = this.D(var4_4, var5_5.nextToken(), this.k);
                    while (v3) {
                        v3 = true;
                        if (var3_3 == null) continue;
                        return v3;
                    }
                }
                return false;
            }
            v2 = this.D(var4_4, var2_2, this.k);
        }
        return v2;
    }

    protected boolean D(String string, String string2, boolean bl) {
        String[] stringArray = cb_1.C();
        boolean bl2 = bl;
        if (stringArray != null) {
            bl2 = bl2 ? string.startsWith(string2) : string.contains(string2);
        }
        return bl2;
    }

    @Override
    public boolean n(Object object) {
        return this.r((cb_1)object);
    }
}

