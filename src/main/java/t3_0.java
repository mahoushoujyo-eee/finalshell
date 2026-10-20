/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from t3
 */
public class t3_0 {
    bq_0 F;
    F8 I;
    String U;
    int C;
    boolean g;
    F6 w;
    Object O;
    _y_0 Z;
    int q;
    boolean b;
    aM h;

    public t3_0(String string) {
        this.g = false;
        this.U = string;
    }

    public void c() {
        try {
            this.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void n() {
        try {
            this.F.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void e() {
        try {
            this.F.Q(this);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public String r() {
        return (String)this.U;
    }

    public void I(String string) {
        this.U = string;
    }

    public int C() {
        return this.C;
    }

    public void E(int n10) {
        this.C = n10;
    }

    public bq_0 k() {
        return (bq_0)this.F;
    }

    public void g(bq_0 bq_02) {
        this.F = bq_02;
    }

    public F8 P() {
        return (F8)this.I;
    }

    public void h(F8 f82) {
        this.I = f82;
    }

    public boolean t() {
        return this.g;
    }

    public void b(boolean bl) {
        this.g = bl;
    }

    public Object l() {
        return this.O;
    }

    public void j(Object object) {
        this.O = object;
    }

    public _y_0 S() {
        return (_y_0)this.Z;
    }

    public void D(_y_0 _y_02) {
        this.Z = _y_02;
    }

    public int w() {
        return this.q;
    }

    public void C(int n10) {
        this.q = n10;
    }

    public boolean V() {
        return this.b;
    }

    public void X(boolean bl) {
        this.b = bl;
    }

    public aM Z() {
        return (aM)this.h;
    }

    public void p(aM aM2) {
        this.h = aM2;
    }

    public void p() {
        this.F = null;
        this.I = null;
        this.U = null;
        this.w = null;
        this.O = null;
        this.Z = null;
        this.h = null;
    }

    public void G() {
        try {
            yt_1.F.W((Object)new yi_0(this), dd_1.y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

