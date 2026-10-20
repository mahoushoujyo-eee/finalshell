/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cw_1;
import com.nl_1;
import com.nv_2;
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from com.Qy
 */
public class qy_0
implements cw_1 {
    private final Class x;
    private final Set k;
    private final Set t;
    private int Z;

    public qy_0(String[] stringArray) {
        this(null, stringArray);
    }

    public qy_0(Class clazz, String[] stringArray) {
        String string = nv_2.o();
        String string2 = string;
        this.k = new HashSet();
        this.t = new HashSet();
        this.Z = 0;
        this.x = clazz;
        String[] stringArray2 = stringArray;
        int n10 = stringArray2.length;
        int n11 = 0;
        while (n11 < n10) {
            String string3 = stringArray2[n11];
            if (string2 != null) {
                if (string3 != null) {
                    this.k.add(string3);
                }
                ++n11;
            }
            if (string2 != null) continue;
        }
    }

    public int T() {
        return this.Z;
    }

    public void i(int n10) {
        this.Z = n10;
    }

    public Class g() {
        return this.x;
    }

    public Set K() {
        return this.k;
    }

    public Set v() {
        return this.t;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean G(nl_1 var1_1, Object var2_2, String var3_3) {
        block14: {
            var4_4 = nv_2.o();
            if (var2_2 == null) {
                return true;
            }
            v0 = this;
            if (var4_4 == null) ** GOTO lbl13
            if (v0.x != null) {
                v1 = this.x.isInstance(var2_2);
                if (var4_4 != null) {
                    if (v1 == 0) {
                        return true;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = this;
lbl13:
                // 2 sources

                v1 = v0.t.contains(var3_3);
            }
            if (var4_4 != null) {
                if (v1 != 0) {
                    return false;
                }
                v1 = this.Z;
            }
            if (var4_4 != null) {
                if (v1 > 0) {
                    var5_5 = 0;
                    var6_6 = var1_1.W;
                    while (var6_6 != null) {
                        ++var5_5;
                        if (var4_4 != null) {
                            v1 = var5_5;
                            if (var4_4 == null) break block14;
                            if (v1 > this.Z) {
                                return false;
                            }
                            var6_6 = var6_6.M;
                        }
                        if (var4_4 != null) continue;
                    }
                }
                v1 = this.k.size();
            }
        }
        if (var4_4 == null) return (boolean)v1;
        if (v1 == 0) return (boolean)1;
        v1 = (int)this.k.contains(var3_3);
        if (var4_4 == null) return (boolean)v1;
        if (v1 == 0) return (boolean)0;
        return (boolean)1;
    }
}

