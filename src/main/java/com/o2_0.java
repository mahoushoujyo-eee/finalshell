/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cb_1;
import com.us_0;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Renamed from com.o2
 */
public final class o2_0 {
    public static int q;
    public static boolean l;
    private static Map j;
    private final Object W = new Object();
    private ExecutorService S = Executors.newFixedThreadPool(q);
    private static final String a;

    public static void y(us_0 us_02, int n10) {
        o2_0.f(us_02).B(n10);
    }

    public static void P(us_0 us_02, Runnable runnable) {
        o2_0.f(us_02).Y(runnable);
    }

    public static o2_0 f(us_0 us_02) {
        if (l) {
            return o2_0.b(us_02);
        }
        return o2_0.b(null);
    }

    private static o2_0 b(us_0 us_02) {
        o2_0 o2_02 = (o2_0)j.get(us_02);
        String[] stringArray = cb_1.C();
        o2_0 o2_03 = o2_02;
        if (stringArray != null) {
            if (o2_03 == null) {
                Object object = us_02;
                if (stringArray != null) {
                    if (object == null) {
                        o2_0.L();
                    }
                    o2_02 = new o2_0();
                    object = j.put(us_02, o2_02);
                }
            }
            o2_03 = o2_02;
        }
        return o2_03;
    }

    private static void L() {
        Iterator iterator = j.entrySet().iterator();
        String[] stringArray = cb_1.C();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            ((o2_0)entry.getValue()).A();
            if (stringArray != null) continue;
        }
    }

    private o2_0() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void B(int n10) {
        block10: {
            Object object = this.W;
            synchronized (object) {
                block9: {
                    String[] stringArray;
                    block8: {
                        ExecutorService executorService;
                        block7: {
                            stringArray = cb_1.C();
                            executorService = this.S;
                            if (stringArray == null) break block7;
                            if (executorService == null) break block8;
                            executorService = this.S;
                        }
                        executorService.shutdown();
                    }
                    if (n10 <= 0) break block9;
                    this.S = Executors.newFixedThreadPool(n10);
                    if (stringArray != null) break block10;
                }
                this.S = null;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void A() {
        Object object = this.W;
        synchronized (object) {
            String[] stringArray = cb_1.C();
            Object object2 = this.S;
            if (stringArray != null) {
                if (object2 != null) {
                    this.S.shutdown();
                }
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Y(Runnable runnable) {
        block7: {
            Object object = this.W;
            synchronized (object) {
                block6: {
                    ExecutorService executorService;
                    String[] stringArray;
                    block5: {
                        stringArray = cb_1.C();
                        executorService = this.S;
                        if (stringArray == null) break block5;
                        if (executorService == null) break block6;
                        executorService = this.S;
                    }
                    executorService.execute(runnable);
                    if (stringArray != null) break block7;
                }
                new Thread(runnable, a).start();
            }
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
                char[] cArray3 = "\tI\fVW\\j-_$MQ}}".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 122;
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
                            n17 = 50;
                            break;
                        }
                        case 1: {
                            n17 = 64;
                            break;
                        }
                        case 2: {
                            n17 = 15;
                            break;
                        }
                        case 3: {
                            n17 = 66;
                            break;
                        }
                        case 4: {
                            n17 = 78;
                            break;
                        }
                        case 5: {
                            n17 = 114;
                            break;
                        }
                        default: {
                            n17 = 98;
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
        long l2 = 6330822487199183311L;
        long l3 = 0x68EB0918D8FF1CBL ^ l2;
        q = (int)l3;
        l = true;
        j = new WeakHashMap();
    }
}

