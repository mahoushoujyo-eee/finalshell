/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from d8
 */
public class d8_0 {
    Thread K;
    ArrayList l;
    ArrayList b;
    ThreadPoolExecutor f;
    ArrayList g;
    private static String c;
    private static final long[] a;
    private static final Integer[] d;
    private static final long e;

    public d8_0() {
        this.l = new ArrayList();
        this.b = new ArrayList();
        this.g = new ArrayList();
        SynchronousQueue<Runnable> synchronousQueue = new SynchronousQueue<Runnable>();
        this.f = new ThreadPoolExecutor(d8_0.a(10105, 8523259108155111408L), d8_0.a(186, 8351325949674262578L), e, TimeUnit.MILLISECONDS, synchronousQueue);
        this.K = new ue_0(this);
        ((Thread)this.K).start();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private synchronized void o() {
        v0 = d8_0.Q();
        ((ArrayList)this.g).clear();
        var1_1 = v0;
        var3_2 = ((ArrayList)this.l).iterator();
        if (var1_1 == null) ** GOTO lbl61
        block10: while (true) {
            block17: {
                block19: {
                    block20: {
                        block18: {
                            var2_3 = (gH)var3_2.next();
                            try {
                                v1 = ((Boolean)var2_3.r()).booleanValue();
                            }
                            catch (InvocationTargetException v2) {
                                throw v2.getTargetException();
                            }
                            if (var1_1 != null) ** GOTO lbl64
                            if (v1 != 0) break block17;
                            try {
                                v3 = (Long)var2_3.X();
                            }
                            catch (InvocationTargetException v4) {
                                throw v4.getTargetException();
                            }
                            cfr_temp_0 = System.currentTimeMillis() - v3;
                            v1 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                            if (var1_1 != null) ** GOTO lbl64
                            if (v1 < 0) break block17;
                            try {
                                v5 = (Integer)var2_3.X();
                            }
                            catch (InvocationTargetException v6) {
                                throw v6.getTargetException();
                            }
                            if (var1_1 != null) break block18;
                            if (v5 == gH.E) {
                                ((ArrayList)this.g).add(var2_3);
                            }
                            v7 = var2_3;
                            if (var1_1 == null) {
                                try {
                                    v5 = (int)((Boolean)v7.R()).booleanValue();
                                }
                                catch (InvocationTargetException v8) {
                                    throw v8.getTargetException();
                                }
                            }
                            break block19;
                        }
                        if (v5 == 0) break block20;
                        ((ArrayList)this.g).add(var2_3);
                        if (var1_1 == null) break block17;
                    }
                    v7 = var2_3;
                }
                try {
                    v7.j(true);
                }
                catch (InvocationTargetException v9) {
                    throw v9.getTargetException();
                }
                ((ThreadPoolExecutor)this.f).execute(new fh_2(this, var2_3));
            }
            do {
                v1 = var3_2.hasNext();
lbl64:
                // 3 sources

                if (v1 != 0) continue block10;
                ((ArrayList)this.l).removeAll((ArrayList)this.g);
            } while (var1_1 != null);
            break;
        }
    }

    public void J(Runnable runnable) {
        ((ThreadPoolExecutor)this.f).execute(runnable);
    }

    public synchronized gH W(Runnable runnable, int n10) {
        gH gH2 = new gH(runnable, gH.E);
        try {
            gH2.k(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            gH2.I(System.currentTimeMillis() + (long)n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((ArrayList)this.l).add(gH2);
        return gH2;
    }

    public synchronized gH V(Runnable runnable, int n10) {
        gH gH2 = new gH(runnable, gH.y);
        try {
            gH2.k(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            gH2.I(System.currentTimeMillis() + (long)n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((ArrayList)this.l).add(gH2);
        return gH2;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void E(Runnable[] runnableArray) throws Exception {
        Object object;
        ArrayList arrayList = new ArrayList();
        String string = d8_0.Q();
        Runnable[] runnableArray2 = runnableArray;
        int n10 = runnableArray.length;
        int n11 = 0;
        boolean bl = true;
        do {
            if (bl && !(bl = false) && string == null) continue;
            object = runnableArray2[n11];
            Future<?> future = ((ThreadPoolExecutor)this.f).submit((Runnable)object);
            arrayList.add(future);
            ++n11;
        } while (n11 < n10);
        Iterator iterator = arrayList.iterator();
        boolean bl2 = true;
        do {
            if (bl2 && !(bl2 = false) && string == null) continue;
            object = (Future)iterator.next();
            long l2 = System.currentTimeMillis();
            object.get();
        } while (iterator.hasNext());
        try {
            if (ky_2.F() == null) return;
            d8_0.U("mN1sNb");
            return;
        }
        catch (Exception exception) {
            throw d8_0.a(exception);
        }
    }

    public ThreadPoolExecutor h() {
        return (ThreadPoolExecutor)this.f;
    }

    public void P(ThreadPoolExecutor threadPoolExecutor) {
        this.f = threadPoolExecutor;
    }

    public static void U(String string) {
        c = string;
    }

    public static String Q() {
        return c;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3169038958883167846L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "2H\u008b\f\u00a1\u00a8i\u0088\u0002\u00cd\u00d8\u008d\u00b6L\u00cd\u00bc";
        int n11 = "2H\u008b\f\u00a1\u00a8i\u0088\u0002\u00cd\u00d8\u008d\u00b6L\u00cd\u00bc".length();
        int n12 = 0;
        d8_0.U(null);
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        d = new Integer[2];
        long l3 = 6768596462281022791L;
        e = 0x5DEEE29EF239FA57L ^ l3;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1089;
        if (d[n11] == null) {
            d8_0.d[n11] = (int)(a[n11] ^ l2);
        }
        return d[n11];
    }
}

