/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GA;
import com.IW;
import com.lz_0;
import com.og_2;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;

public final class WO {
    private static final Map W;
    private static final String a;

    public static void t(JComponent jComponent, og_2 og_22) {
        WeakHashMap<og_2, IW> weakHashMap;
        og_2 og_23;
        int[] nArray;
        block10: {
            block11: {
                block9: {
                    nArray = lz_0.M();
                    if (jComponent == null) break block9;
                    og_23 = og_22;
                    if (nArray != null) break block10;
                    if (og_23 != null) break block11;
                }
                return;
            }
            og_23 = W.get(jComponent);
        }
        WeakHashMap<og_2, IW> weakHashMap2 = weakHashMap = (WeakHashMap<og_2, IW>)((Object)og_23);
        if (nArray == null) {
            if (weakHashMap2 == null) {
                weakHashMap = new WeakHashMap<og_2, IW>(1);
                W.put(jComponent, weakHashMap);
            }
            weakHashMap2 = W;
        }
        if (!weakHashMap2.containsKey(og_22)) {
            og_22.A(jComponent);
            Boolean bl = og_22.d(jComponent);
            if (nArray == null) {
                if (bl != null) {
                    Boolean bl2 = bl;
                    if (nArray == null) {
                        bl2 = bl2 != false ? Boolean.TRUE : Boolean.FALSE;
                    }
                    LookAndFeel.installProperty(jComponent, a, bl2);
                }
                GA.i(jComponent);
            }
            WeakReference<JComponent> weakReference = new WeakReference<JComponent>(jComponent);
            WeakReference<og_2> weakReference2 = new WeakReference<og_2>(og_22);
            IW iW = new IW(weakReference, weakReference2);
            og_22.A(iW);
            weakHashMap.put(og_22, iW);
        }
    }

    public static void C(JComponent jComponent, og_2 og_22) {
        Map map;
        og_2 og_23;
        int[] nArray;
        block5: {
            block6: {
                block4: {
                    nArray = lz_0.M();
                    if (jComponent == null) break block4;
                    og_23 = og_22;
                    if (nArray != null) break block5;
                    if (og_23 != null) break block6;
                }
                return;
            }
            og_23 = W.get(jComponent);
        }
        Map map2 = map = (Map)((Object)og_23);
        if (nArray == null && map2 != null) {
            og_22.X(jComponent);
            map2 = map.remove(og_22);
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "!u\u0014om}".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 80;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 30;
                            break;
                        }
                        case 1: {
                            n17 = 85;
                            break;
                        }
                        case 2: {
                            n17 = 37;
                            break;
                        }
                        case 3: {
                            n17 = 78;
                            break;
                        }
                        case 4: {
                            n17 = 72;
                            break;
                        }
                        case 5: {
                            n17 = 72;
                            break;
                        }
                        default: {
                            n17 = 9;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        W = new WeakHashMap();
    }
}

