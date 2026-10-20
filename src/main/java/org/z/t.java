/*
 * Decompiled with CFR 0.152.
 */
package org.z;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.w.d;
import org.w.j;
import org.z.D;

public final class t {
    private static final Class E;
    private static final Method p;
    private static final Method w;
    private final Object a;

    private t(Object object) {
        this.a = object;
    }

    public static t c() {
        return new t(j.o(p, null, new Object[0]));
    }

    public Set W() {
        return (Set)t.N((Set)j.o(w, this.a, new Object[0]), new HashSet());
    }

    private static Collection N(Collection collection, Collection collection2) {
        for (Object e2 : collection) {
            collection2.add(new D(e2));
        }
        return collection2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\u0016>eO\u001f#5\u00128=C^+!\u0010:=c^+!\u0010:UG_+1\u000e\b\u00139@WB;1\u0011\u0007\u001a6}Jp#8";
            var5_3 = "\u0016>eO\u001f#5\u00128=C^+!\u0010:=c^+!\u0010:UG_+1\u000e\b\u00139@WB;1\u0011\u0007\u001a6}Jp#8".length();
            var2_4 = 29;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 89;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 37;
                            break;
                        }
                        case 1: {
                            v11 = 6;
                            break;
                        }
                        case 2: {
                            v11 = 74;
                            break;
                        }
                        case 3: {
                            v11 = 119;
                            break;
                        }
                        case 4: {
                            v11 = 104;
                            break;
                        }
                        case 5: {
                            v11 = 22;
                            break;
                        }
                        default: {
                            v11 = 13;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl67:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        t.E = d.Z(var0[0]);
        t.p = d.z(t.E, var0[1], new Class[0]);
        t.w = d.z(t.E, var0[2], new Class[0]);
    }
}

