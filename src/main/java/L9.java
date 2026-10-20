/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

public class L9 {
    String J;
    String i;
    boolean a;
    boolean N;
    boolean s;
    int L;
    zh_0 z;
    KV c;
    HashSet v;
    private static int[] k;

    public L9() {
        this.v = new HashSet();
    }

    public void c(String string) {
        ((HashSet)this.v).add(string);
    }

    public int C() {
        return ((HashSet)this.v).size();
    }

    public String o() {
        return (String)this.J;
    }

    public void u(String string) {
        block5: {
            String string2;
            L9 l9;
            block4: {
                int[] nArray = L9.X();
                l9 = this;
                string2 = string;
                if (nArray != null) break block4;
                l9.J = string2;
                if (string == null) break block5;
                l9 = this;
                string2 = string;
            }
            try {
                l9.c(string2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public String K() {
        return (String)this.i;
    }

    public void V(String string) {
        this.i = string;
    }

    public boolean y() {
        return this.a;
    }

    public void V(boolean bl) {
        this.a = bl;
    }

    public boolean s() {
        return this.s;
    }

    public void g(boolean bl) {
        this.s = bl;
    }

    public int O() {
        return this.L;
    }

    public void l(int n10) {
        this.L = n10;
    }

    public zh_0 F() {
        return (zh_0)this.z;
    }

    public void P(zh_0 zh_02) {
        this.z = zh_02;
    }

    public boolean i() {
        return this.N;
    }

    public void y(boolean bl) {
        this.N = bl;
    }

    public KV r() {
        return (KV)this.c;
    }

    public void E(KV kV) {
        this.c = kV;
    }

    public static void A(int[] nArray) {
        k = nArray;
    }

    public static int[] X() {
        return k;
    }

    static {
        if (L9.X() != null) {
            L9.A(new int[3]);
        }
    }
}

