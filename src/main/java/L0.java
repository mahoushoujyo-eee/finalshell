/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class L0 {
    public long E;
    public long u;
    Thread A;
    int J;
    Vector B;
    QB Q;
    public int Y;
    public int L;

    public L0(int n10) {
        block3: {
            boolean bl = zD.d();
            this.Y = 0;
            boolean bl2 = bl;
            this.L = 0;
            this.J = n10;
            this.B = new Vector();
            for (int i2 = 0; i2 < n10; ++i2) {
                QB qB = new QB();
                if (!bl2) {
                    int n11 = i2;
                    if (bl2) continue;
                    if (n11 == 0) {
                        this.Q = qB;
                    }
                    n11 = ((Vector)this.B).add(qB) ? 1 : 0;
                    if (!bl2) continue;
                }
                break block3;
            }
            this.A = new tw_1(this);
            ((Thread)this.A).start();
        }
    }

    public void X() {
        ((Thread)this.A).interrupt();
    }

    public int S() {
        return this.Y;
    }

    public void P(int n10) {
        this.Y = n10;
    }

    public int a() {
        return this.L;
    }

    public void F(int n10) {
        this.L = n10;
    }

    void S() {
        block2: {
            int n10 = 0;
            boolean bl = zD.X();
            int n11 = 0;
            for (QB qB : (Vector)this.B) {
                n10 += qB.l;
                n11 += qB.C;
                if (bl) {
                    if (bl) continue;
                }
                break block2;
            }
            this.Y = (int)((float)n11 / (float)((Vector)this.B).size());
            this.L = (int)((float)n10) / ((Vector)this.B).size();
            ((Vector)this.B).remove(0);
        }
        QB qB = new QB();
        this.Q = qB;
        ((Vector)this.B).add(qB);
    }

    public void T(int n10) {
        L0 l0 = this;
        l0.u = l0.u + (long)n10;
        try {
            this.Q.y(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void N(int n10) {
        L0 l0 = this;
        l0.E = l0.E + (long)n10;
        try {
            this.Q.E(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void v() {
    }

    public void V() {
    }

    public void c(int n10) {
    }

    public void Z(int n10) {
    }
}

