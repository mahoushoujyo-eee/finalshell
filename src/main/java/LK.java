/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class LK
implements bk_0 {
    final ty_0 j;
    private static final String a;
    private static final long b;

    LK(ty_0 ty_02) {
        this.j = ty_02;
    }

    @Override
    public void d(xU xU2) {
        ArrayList arrayList = ((xE)this.j.i).B().C();
        try {
            this.j.U.v(((xE)this.j.i).B().C());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n10 = ((xE)this.j.i).B().y();
        try {
            this.j.U.e(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void a() {
        try {
            this.j.U.G(KV.d);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        System.out.println(a);
    }

    @Override
    public void j() {
        try {
            this.j.U.G(KV.R);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((ScheduledExecutorService)yt_1.p).schedule(new kw_1(this), b, TimeUnit.MILLISECONDS);
    }

    @Override
    public void V() {
        try {
            this.j.U.G(KV.d);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void w(List list, String string, String string2) {
        try {
            this.j.U.x(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.j.U.P(string2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.j.U.P(list);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
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
                char[] cArray3 = "\u8fa1\u7a73\t^%i\u673c\u52dc\u5610\u65d4\u5f37".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 65;
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
                            n17 = 60;
                            break;
                        }
                        case 1: {
                            n17 = 57;
                            break;
                        }
                        case 2: {
                            n17 = 56;
                            break;
                        }
                        case 3: {
                            n17 = 118;
                            break;
                        }
                        case 4: {
                            n17 = 10;
                            break;
                        }
                        case 5: {
                            n17 = 79;
                            break;
                        }
                        default: {
                            n17 = 112;
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
        long l2 = 5597601649716329163L;
        b = 0x4DAEAD0B05600D8BL ^ l2;
    }
}

