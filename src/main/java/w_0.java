/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from w
 */
public class w_0 {
    int B;
    int s;
    int x;
    int G;
    int n;
    int l;
    boolean M = false;
    int X;

    w_0() {
    }

    float i() {
        float f10;
        block7: {
            int n10;
            block6: {
                String[] stringArray;
                int n11;
                block5: {
                    int n12;
                    block4: {
                        n11 = this.h() - this.C();
                        stringArray = QI.N();
                        n12 = n11;
                        if (stringArray == null) break block4;
                        if (n12 >= 0) break block5;
                        n12 = 0;
                    }
                    n11 = n12;
                }
                f10 = 0.0f;
                n10 = this.h();
                if (stringArray == null) break block6;
                if (n10 <= 0) break block7;
                n10 = n11;
            }
            f10 = (float)n10 / (float)this.h();
        }
        return f10;
    }

    float m() {
        float f10;
        block3: {
            int n10;
            block2: {
                f10 = 0.0f;
                String[] stringArray = QI.N();
                n10 = this.f();
                if (stringArray == null) break block2;
                if (n10 <= 0) break block3;
                n10 = this.L();
            }
            f10 = (float)n10 / (float)this.f();
        }
        return f10;
    }

    void h(int n10) {
        this.X += n10;
    }

    void m(int n10) {
        ++this.x;
        this.B += n10;
    }

    void z(int n10) {
        this.s += n10;
    }

    public int h() {
        return this.B;
    }

    public int e() {
        return this.x;
    }

    public int C() {
        return this.G;
    }

    public void K(int n10) {
        if (n10 > this.G) {
            this.G = n10;
        }
    }

    public int j() {
        return this.n;
    }

    public void t(int n10) {
        this.n = n10;
    }

    public int G() {
        return this.l;
    }

    public void W(int n10) {
        this.l = n10;
        this.M = true;
    }

    public boolean n() {
        return this.M;
    }

    public int L() {
        return this.X;
    }

    public void R(int n10) {
        this.X = n10;
    }

    public int f() {
        return this.s;
    }

    public void q(int n10) {
        this.s = n10;
    }
}

