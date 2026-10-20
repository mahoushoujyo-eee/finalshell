/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * Renamed from f8
 */
class f8_0
implements Runnable {
    HashMap X;
    final yt_1 l;
    private static final long[] a;
    private static final Long[] b;

    f8_0(yt_1 yt_12) {
        this.l = yt_12;
        this.X = new HashMap();
    }

    @Override
    public void run() {
        int n10;
        Object object;
        ArrayList<Object> arrayList;
        ky_2[] ky_2Array;
        block12: {
            HashMap<Long, Object> hashMap;
            ThreadMXBean threadMXBean;
            block11: {
                Set<Thread> set = Thread.getAllStackTraces().keySet();
                ky_2Array = yt_1.c();
                Iterator<Thread> iterator = set.iterator();
                threadMXBean = ManagementFactory.getThreadMXBean();
                arrayList = new ArrayList<Object>();
                HashMap hashMap2 = new HashMap();
                while (iterator.hasNext()) {
                    object = iterator.next();
                    arrayList.add(object);
                    hashMap = hashMap2;
                    if (ky_2Array != null) {
                        hashMap.put(((Thread)object).getId(), object);
                        if (ky_2Array != null) continue;
                    }
                    break block11;
                }
                hashMap = new HashMap<Long, Object>();
            }
            object = hashMap;
            for (Object object2 : arrayList) {
                long l2;
                block14: {
                    Long l3;
                    HashMap hashMap2;
                    block13: {
                        l2 = 0L;
                        hashMap2 = (HashMap)this.X;
                        l3 = ((Thread)object2).getId();
                        if (ky_2Array == null) break block13;
                        n10 = hashMap2.containsKey(l3);
                        if (ky_2Array == null) break block12;
                        if (n10 == 0) break block14;
                        hashMap2 = (HashMap)this.X;
                        l3 = ((Thread)object2).getId();
                    }
                    l2 = (Long)hashMap2.get(l3);
                }
                long l4 = threadMXBean.getThreadCpuTime(((Thread)object2).getId());
                long l5 = l4 - l2;
                ((HashMap)object).put(((Thread)object2).getId(), l5);
                if (l4 > 0L) {
                    // empty if block
                }
                ((HashMap)this.X).put(((Thread)object2).getId(), l4);
                if (ky_2Array != null) continue;
            }
            Collections.sort(arrayList, new ta_1(this, (HashMap)object));
            n10 = 1;
        }
        int n11 = n10;
        for (Thread thread : arrayList) {
            long l6 = (Long)((HashMap)object).get(thread.getId());
            long l7 = l6 / f8_0.a(11498, 3548592707169661807L) / f8_0.a(229, 245575733783437153L);
            if (l7 > 0L) {
                // empty if block
            }
            if (n11 >= 5) {
                // empty if block
            }
            ++n11;
            if (ky_2Array != null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6714615678991258939L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "^Gn\u00b6D\u0014\u00c9\u00b2l\u00109&~\u00e9e\u00bc";
        int n11 = "^Gn\u00b6D\u0014\u00c9\u00b2l\u00109&~\u00e9e\u00bc".length();
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
        int n11 = (n10 ^ (int)l2 ^ 0x1F84) & Short.MAX_VALUE;
        if (b[n11] == null) {
            f8_0.b[n11] = a[n11] ^ l2;
        }
        return b[n11];
    }
}

