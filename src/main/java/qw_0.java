/*
 * Decompiled with CFR 0.152.
 */
import com.E0;
import com._y_0;
import com.c;
import com.fv_0;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Qw
 */
class qw_0
implements Runnable {
    final int L;
    final boolean M;
    final ka_1 s;
    private static final long[] a;
    private static final Integer[] b;

    qw_0(ka_1 ka_12, int n10, boolean bl) {
        this.s = ka_12;
        this.L = n10;
        this.M = bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        Object object = this.s.k;
        synchronized (object) {
            block47: {
                Object object2;
                block48: {
                    int n10;
                    int n11;
                    int n12;
                    uo_0 uo_02;
                    block53: {
                        ky_2[] ky_2Array;
                        block54: {
                            int n13;
                            uo_0 uo_03;
                            Object object3;
                            Object object4;
                            t3_0 t3_02;
                            Object object5;
                            Object object6;
                            int n14;
                            _y_0 _y_02;
                            U u10;
                            block52: {
                                _y_0 _y_03;
                                F8 f82;
                                block51: {
                                    int n15;
                                    E0 e0;
                                    block49: {
                                        block50: {
                                            _y_0 _y_04;
                                            block43: {
                                                block44: {
                                                    _y_0 _y_05;
                                                    F8 f83;
                                                    block46: {
                                                        block45: {
                                                            F8 f84;
                                                            _y_0 _y_06;
                                                            U u11;
                                                            Object object7;
                                                            Object object8;
                                                            Object object9;
                                                            ky_2Array = ka_1.y();
                                                            try {
                                                                object9 = yt_1.i();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            try {
                                                                object8 = object9.O();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            try {
                                                                object7 = object8.G();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            try {
                                                                u11 = (U)object7.D();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            u10 = u11;
                                                            try {
                                                                _y_06 = (_y_0)u10.n();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            _y_04 = _y_02 = _y_06;
                                                            if (ky_2Array != null) break block43;
                                                            if (_y_04 != null) break block44;
                                                            try {
                                                                f84 = (F8)u10.q();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            f83 = f82 = f84;
                                                            if (ky_2Array != null) break block45;
                                                            if (f83 == null) break block44;
                                                            f83 = f82;
                                                        }
                                                        if (ky_2Array != null) break block46;
                                                        if (!f83.getClass().equals(CT.class)) break block44;
                                                        f83 = f82;
                                                    }
                                                    CT cT = (CT)f83;
                                                    try {
                                                        _y_05 = (_y_0)cT.t();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    _y_02 = _y_05;
                                                }
                                                _y_04 = _y_02;
                                            }
                                            f82 = _y_04;
                                            object2 = _y_02;
                                            if (ky_2Array != null) break block47;
                                            if (object2 == null) break block48;
                                            _y_03 = _y_02.N();
                                            object2 = _y_03;
                                            if (ky_2Array != null) break block47;
                                            if (object2 == null) break block48;
                                            fv_0 fv_02 = _y_03.s();
                                            object2 = fv_02;
                                            if (ky_2Array != null) break block47;
                                            if (!object2.K()) break block48;
                                            this.s.L = this.L;
                                            e0 = _y_03.C();
                                            n14 = this.L;
                                            n15 = ka_1.a;
                                            if (ky_2Array != null) break block49;
                                            if (n14 != n15) break block50;
                                            e0.J(new byte[]{qw_0.a(5763, 3690308460118861557L)});
                                            if (ky_2Array == null) break block51;
                                        }
                                        n14 = this.L;
                                        if (ky_2Array != null) break block52;
                                        n15 = ka_1.O;
                                    }
                                    if (n14 == n15) {
                                        e0.J(new byte[]{qw_0.a(3197, 7253195782167591946L)});
                                    }
                                }
                                try {
                                    this.s.k();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    _y_02.M().r(this.L);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    yt_1.F.J(new to_1(this, _y_03, (_y_0)f82));
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                object2 = this;
                                if (ky_2Array != null) break block47;
                                n14 = object2.M ? 1 : 0;
                            }
                            if (n14 == 0) break block48;
                            try {
                                object6 = u10.o();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                object5 = _y_02.a().v();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                t3_02 = (t3_0)object6.w(object5);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            t3_0 t3_03 = t3_02;
                            object2 = t3_03;
                            if (ky_2Array != null) break block47;
                            if (object2 == null) break block48;
                            try {
                                object4 = t3_03.P();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            CT cT = (CT)object4;
                            try {
                                object3 = cT.g();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                uo_03 = (uo_0)object3.W();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            uo_02 = uo_03;
                            uo_02.getRowSorter().getSortKeys();
                            try {
                                n13 = (Integer)uo_02.J();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            n12 = n13;
                            n11 = this.L;
                            n10 = ka_1.a;
                            if (ky_2Array != null) break block53;
                            if (n11 != n10) break block54;
                            if (n12 == 2) break block48;
                            uo_02.getRowSorter().toggleSortOrder(2);
                            if (ky_2Array == null) break block48;
                        }
                        object2 = this;
                        if (ky_2Array != null) break block47;
                        n11 = object2.L;
                        n10 = ka_1.O;
                    }
                    if (n11 == n10 && n12 != 3) {
                        uo_02.getRowSorter().toggleSortOrder(3);
                    }
                }
                object2 = object;
            }
            // ** MonitorExit[v16] (shouldn't be in output)
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7375297637567895925L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00df0V3\u0015\u0003\u00ff\u00cd[6\u00db\u00c5\u009av\u00e5/";
        int n11 = "\u00df0V3\u0015\u0003\u00ff\u00cd[6\u00db\u00c5\u009av\u00e5/".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7076;
        if (b[n11] == null) {
            qw_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

