/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Fw
 */
public class fw_0
extends FK {
    WS eL;
    String ed;
    lj_2 eJ;
    private static final long[] cb;
    private static final Integer[] db;

    public fw_0(String string, WS wS, dv_0 dv_02) {
        super(dv_02, true);
        try {
            this.e(fw_0.b(29988, 1516009930303765884L), fw_0.b(19668, 4005540325463934093L));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.ed = string;
        this.eL = wS;
        try {
            this.R(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.t(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.f(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.G(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.K(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public lj_2 a() {
        return (lj_2)this.eJ;
    }

    public void t(lj_2 lj_22) {
        this.eJ = lj_22;
    }

    public String T() {
        return (String)this.ed;
    }

    public void Z(String string) {
        this.ed = string;
    }

    @Override
    public boolean p(L1 l1) {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected dx_2 k() {
        dx_2 dx_22 = null;
        int[] nArray = yb_1.Y();
        lj_2 lj_22 = (lj_2)this.eJ;
        if (nArray == null) {
            if (lj_22 == null) {
                return new dx_2();
            }
            lj_22 = (lj_2)this.eJ;
        }
        try {
            dx_2 dx_23 = (dx_2)lj_22.m(this.ed);
            return dx_23;
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    protected void L(String string) {
        boolean bl;
        try {
            bl = (Boolean)lk_0.Y(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (!bl) {
            Object object;
            L1 l1 = new L1("", string);
            try {
                object = this.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.h(l1);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    @Override
    protected void i(L1 l1, int n10) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        try {
            object4 = this.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object4.C(l1);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object3 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object3.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.Q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    protected void k(L1 l1) {
        String string;
        try {
            this.A(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string = (String)l1.A();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((dv_0)this.lD).setText(string);
        ((dv_0)this.lD).requestFocus();
    }

    @Override
    protected void u(KeyEvent keyEvent) {
    }

    @Override
    protected String c() {
        return ((dv_0)this.Z).getText().trim();
    }

    @Override
    public void Q(L1 l1, int n10) {
        try {
            this.k(l1);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.eL.q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    protected dx_2 n() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7541713775315075023L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = ";\u00a9$\n\u00a7\u0094\u00fa\u00d2<zXLT\u00ebC\u00bd";
        int n11 = ";\u00a9$\n\u00a7\u0094\u00fa\u00d2<zXLT\u00ebC\u00bd".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        cb = lArray;
        db = new Integer[2];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x859;
        if (db[n11] == null) {
            fw_0.db[n11] = (int)(cb[n11] ^ l2);
        }
        return db[n11];
    }
}

