/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from Fr
 */
public class fr_0 {
    int C;
    int N;
    int R;
    int c;
    int q;
    int O;
    boolean z = false;
    int U;

    fr_0() {
    }

    float m() {
        float f10;
        block7: {
            int n10;
            block6: {
                ky_2[] ky_2Array;
                int n11;
                block5: {
                    int n12;
                    block4: {
                        n11 = this.R() - this.o();
                        ky_2Array = qm_0.J();
                        n12 = n11;
                        if (ky_2Array == null) break block4;
                        if (n12 >= 0) break block5;
                        n12 = 0;
                    }
                    n11 = n12;
                }
                f10 = 0.0f;
                n10 = this.R();
                if (ky_2Array == null) break block6;
                if (n10 <= 0) break block7;
                n10 = n11;
            }
            f10 = (float)n10 / (float)this.R();
        }
        return f10;
    }

    float y() {
        float f10;
        block3: {
            int n10;
            block2: {
                f10 = 0.0f;
                ky_2[] ky_2Array = qm_0.J();
                n10 = this.Q();
                if (ky_2Array == null) break block2;
                if (n10 <= 0) break block3;
                n10 = this.u();
            }
            f10 = (float)n10 / (float)this.Q();
        }
        return f10;
    }

    void h(int n10) {
        this.U += n10;
    }

    void A(int n10) {
        ++this.R;
        this.C += n10;
    }

    void q(int n10) {
        this.N += n10;
    }

    public int R() {
        return this.C;
    }

    public int y() {
        return this.R;
    }

    public int o() {
        return this.c;
    }

    public void C(int n10) {
        if (n10 > this.c) {
            this.c = n10;
        }
    }

    public int G() {
        return this.q;
    }

    public void H(int n10) {
        this.q = n10;
    }

    public int z() {
        return this.O;
    }

    public void g(int n10) {
        this.O = n10;
        this.z = true;
    }

    public boolean x() {
        return this.z;
    }

    public int u() {
        return this.U;
    }

    public void c(int n10) {
        this.U = n10;
    }

    public int Q() {
        return this.N;
    }

    public void D(int n10) {
        this.N = n10;
    }
}

