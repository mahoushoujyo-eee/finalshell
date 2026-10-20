/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pa_1;
import com.pv_2;

/*
 * Renamed from com.St
 */
class st_0
implements Runnable {
    final pa_1 h;
    final pv_2 p;
    private static final long[] a;
    private static final Long[] b;

    st_0(pv_2 pv_22, pa_1 pa_12) {
        this.p = pv_22;
        this.h = pa_12;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        var1_1 = pv_2.r();
        while (true) {
            block13: {
                block16: {
                    block15: {
                        block14: {
                            if (!this.p.N) break;
                            v0 = this.p.D;
                            if (var1_1 != null) ** GOTO lbl39
                            break block14;
                            catch (InterruptedException v1) {
                                throw st_0.a(v1);
                            }
                        }
                        if (v0 <= this.p.u) break block13;
                        break block15;
                        catch (InterruptedException v2) {
                            throw st_0.a(v2);
                        }
                    }
                    v0 = System.currentTimeMillis() - this.p.u;
                    if (var1_1 != null) ** GOTO lbl39
                    break block16;
                    catch (InterruptedException v3) {
                        throw st_0.a(v3);
                    }
                }
                try {
                    block17: {
                        if (v0 <= st_0.a(22532, 8434462274215841486L)) break block13;
                        break block17;
                        catch (InterruptedException v4) {
                            throw st_0.a(v4);
                        }
                    }
                    this.p.u = System.currentTimeMillis();
                    this.h.X().i();
                }
                catch (InterruptedException v5) {
                    throw st_0.a(v5);
                }
            }
            try {
                v0 = st_0.a(220, 7996534373689153047L);
lbl39:
                // 3 sources

                Thread.sleep(v0);
                continue;
            }
            catch (InterruptedException var2_2) {
                var2_2.printStackTrace();
                if (var1_1 != null) break;
                continue;
            }
            break;
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2750877374834824345L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "S .\u00a5\u00e5\u00a1\u00da3H\u00d4q\u00c0\u00f2A\u0002\u00ea";
        int n11 = "S .\u00a5\u00e5\u00a1\u00da3H\u00d4q\u00c0\u00f2A\u0002\u00ea".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Long[2];
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x56CA) & Short.MAX_VALUE;
        if (b[n11] == null) {
            st_0.b[n11] = a[n11] ^ l2;
        }
        return b[n11];
    }
}

