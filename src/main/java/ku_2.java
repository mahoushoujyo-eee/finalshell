/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.util.Vector;

/*
 * Renamed from ku
 */
public class ku_2 {
    public long w;
    public long t;
    Thread a;
    int x;
    Vector l;
    cx_2 P;
    public int T = 0;
    public int j = 0;

    public ku_2() {
        this(2);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public ku_2(int n10) {
        boolean bl = cn_1.B();
        this.x = n10;
        this.l = new Vector();
        int n11 = 0;
        boolean bl2 = true;
        do {
            if (bl2 && !(bl2 = false) && !bl) continue;
            cx_2 cx_22 = new cx_2();
            int n12 = n11;
            if (!bl) {
                if (n12 == 0) {
                    this.P = cx_22;
                }
                n12 = this.l.add(cx_22) ? 1 : 0;
            }
            ++n11;
        } while (n11 < n10);
        this.a = new mu_0(this);
        this.a.start();
        if (ky_2.F() != null) {
            cn_1.y(!bl);
        }
    }

    public void c() {
        this.a.interrupt();
    }

    public int j() {
        return this.T;
    }

    public void w(int n10) {
        this.T = n10;
    }

    public int z() {
        return this.j;
    }

    public void p(int n10) {
        this.j = n10;
    }

    /*
     * Unable to fully structure code
     */
    void u() {
        var2_1 = 0;
        var1_2 = cn_1.B();
        var3_3 = 0;
        var5_4 = this.l.iterator();
        if (!var1_2) ** GOTO lbl12
        ky_2.K(new String[3]);
        block0: while (true) {
            var4_5 = (cx_2)var5_4.next();
            var2_1 += var4_5.t;
            do {
                var3_3 += var4_5.u;
lbl12:
                // 2 sources

                if (var5_4.hasNext()) continue block0;
                this.T = (int)((float)var3_3 / (float)this.l.size());
                this.j = (int)((float)var2_1) / this.l.size();
                this.l.remove(0);
                this.P = var4_5 = new cx_2();
                this.l.add(var4_5);
            } while (var1_2);
            break;
        }
    }

    public void j(int n10) {
        this.t += (long)n10;
        this.P.w(n10);
    }

    public void l(int n10) {
        this.w += (long)n10;
        this.P.b(n10);
    }

    public void B() {
    }

    public void W() {
    }

    public void W(int n10) {
    }

    public void A(int n10) {
    }
}

