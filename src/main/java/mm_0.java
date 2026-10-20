/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.util.Vector;

/*
 * Renamed from mm
 */
public class mm_0 {
    public long A;
    public long K;
    Thread S;
    int q;
    Vector s;
    oh_2 Q;
    public int f = 0;
    public int F = 0;
    private static boolean Z;

    public static void K(String[] stringArray) {
        mm_0 mm_02 = new mm_0();
        W w2 = new W(mm_02);
        w2.start();
    }

    public mm_0() {
        this(2);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public mm_0(int n10) {
        this.q = n10;
        this.s = new Vector();
        boolean bl = mm_0.O();
        int n11 = 0;
        boolean bl2 = true;
        do {
            if (bl2 && !(bl2 = false) && bl) continue;
            oh_2 oh_22 = new oh_2();
            int n12 = n11;
            if (bl) {
                if (n12 == 0) {
                    this.Q = oh_22;
                }
                n12 = this.s.add(oh_22) ? 1 : 0;
            }
            ++n11;
        } while (n11 < n10);
        this.S = new WB(this);
        this.S.start();
        if (ky_2.F() != null) {
            mm_0.i(!bl);
        }
    }

    public void G() {
        this.S.interrupt();
    }

    public int H() {
        return this.f;
    }

    public void S(int n10) {
        this.f = n10;
    }

    public int p() {
        return this.F;
    }

    public void L(int n10) {
        this.F = n10;
    }

    /*
     * Unable to fully structure code
     */
    void M() {
        var2_1 = 0;
        var3_2 = 0;
        var1_3 = mm_0.Q();
        var5_4 = this.s.iterator();
        if (!var1_3) ** GOTO lbl12
        ky_2.K(new String[1]);
        block0: while (true) {
            var4_5 = (oh_2)var5_4.next();
            var2_1 += var4_5.K;
            do {
                var3_2 += var4_5.u;
lbl12:
                // 2 sources

                if (var5_4.hasNext()) continue block0;
                this.f = (int)((float)var3_2 / (float)this.s.size());
                this.F = (int)((float)var2_1) / this.s.size();
                this.s.remove(0);
                this.Q = var4_5 = new oh_2();
                this.s.add(var4_5);
            } while (var1_3);
            break;
        }
    }

    public void l(int n10) {
        this.K += (long)n10;
        this.Q.q(n10);
    }

    public void i(int n10) {
        this.A += (long)n10;
        this.Q.k(n10);
    }

    public void j() {
    }

    public void a() {
    }

    public void H(int n10) {
    }

    public void y(int n10) {
    }

    public static void i(boolean bl) {
        Z = bl;
    }

    public static boolean O() {
        return Z;
    }

    public static boolean Q() {
        boolean bl = mm_0.O();
        return !bl;
    }

    static {
        if (!mm_0.O()) {
            mm_0.i(true);
        }
    }
}

