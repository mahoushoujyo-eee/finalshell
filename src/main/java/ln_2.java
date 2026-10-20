/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ln
 */
public abstract class ln_2 {
    String y;
    protected String O;
    int S;
    protected String a;
    long Z;
    long G;
    long s;
    long U;
    long P;
    long b;
    long L;
    private static boolean R;

    public ln_2() {
        Object object;
        try {
            object = le_2.q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.O = object;
    }

    public abstract ln_2 B();

    public long c() {
        return this.Z;
    }

    public void Z(long l2) {
        this.Z = l2;
    }

    public long T() {
        return this.G;
    }

    public void x(long l2) {
        this.G = l2;
    }

    public long q() {
        return this.s;
    }

    public void G(long l2) {
        this.s = l2;
    }

    public int Y() {
        return this.S;
    }

    public void Z(int n10) {
        this.S = n10;
    }

    public long l() {
        return this.U;
    }

    public void J(long l2) {
        this.U = l2;
    }

    public String F() {
        return (String)this.a;
    }

    public void z(String string) {
        this.a = string;
    }

    public String g() {
        return (String)this.O;
    }

    public void p(String string) {
        this.O = string;
    }

    public String J() {
        return (String)this.y;
    }

    public void R(String string) {
        this.y = string;
    }

    public long w() {
        return this.P;
    }

    public void v(long l2) {
        this.P = l2;
    }

    public String toString() {
        String string;
        String string2;
        try {
            string2 = (String)this.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string = (String)this.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return string2 + " " + string;
    }

    public long y() {
        return this.b;
    }

    public void d(long l2) {
        this.b = l2;
    }

    public long b() {
        return this.L;
    }

    public void n(long l2) {
        this.L = l2;
    }

    public static void O(boolean bl) {
        R = bl;
    }

    public static boolean R() {
        return R;
    }

    public static boolean i() {
        boolean bl = ln_2.R();
        return !bl;
    }

    static {
        if (ln_2.R()) {
            ln_2.O(true);
        }
    }
}

