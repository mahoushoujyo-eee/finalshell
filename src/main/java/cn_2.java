/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from cn
 */
public class cn_2 {
    String n;
    String O;
    boolean g;
    boolean t;
    boolean L;
    int A;
    zh_0 r;
    KV U;
    HashSet N;

    public cn_2() {
        this.N = new HashSet();
    }

    public void V(String string) {
        ((HashSet)this.N).add(string);
    }

    public int G() {
        return ((HashSet)this.N).size();
    }

    public String B() {
        return (String)this.n;
    }

    public void a(String string) {
        block5: {
            String string2;
            cn_2 cn_22;
            block4: {
                int[] nArray = YQ.m();
                cn_22 = this;
                string2 = string;
                if (nArray == null) break block4;
                cn_22.n = string2;
                if (string == null) break block5;
                cn_22 = this;
                string2 = string;
            }
            try {
                cn_22.V(string2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public String c() {
        return (String)this.O;
    }

    public void Q(String string) {
        this.O = string;
    }

    public boolean E() {
        return this.g;
    }

    public void x(boolean bl) {
        this.g = bl;
    }

    public boolean B() {
        return this.L;
    }

    public void e(boolean bl) {
        this.L = bl;
    }

    public int Y() {
        return this.A;
    }

    public void n(int n10) {
        this.A = n10;
    }

    public zh_0 W() {
        return (zh_0)this.r;
    }

    public void n(zh_0 zh_02) {
        this.r = zh_02;
    }

    public boolean a() {
        return this.t;
    }

    public void L(boolean bl) {
        this.t = bl;
    }

    public KV C() {
        return (KV)this.U;
    }

    public void y(KV kV) {
        this.U = kV;
    }
}

