/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class U5 {
    String S;
    String r;
    String G;
    int U;
    String T;
    int N;
    boolean E;
    long m;
    long z;
    long i;
    boolean K;
    String b;

    public U5() {
        this.E = true;
        this.K = true;
    }

    public String J() {
        return (String)this.S;
    }

    public void D(String string) {
        this.S = string;
    }

    public String v() {
        return (String)this.r;
    }

    public void z(String string) {
        this.r = string;
    }

    public String W() {
        return (String)this.G;
    }

    public void o(String string) {
        this.G = string;
    }

    public int V() {
        return this.U;
    }

    public void Z(int n10) {
        this.U = n10;
    }

    public String N() {
        return (String)this.T;
    }

    public void Y(String string) {
        this.T = string;
    }

    public int W() {
        return this.N;
    }

    public void j(int n10) {
        this.N = n10;
    }

    public boolean y() {
        return this.E;
    }

    public void l(boolean bl) {
        this.E = bl;
    }

    /*
     * Loose catch block
     */
    public String z() {
        String string;
        block16: {
            String string2;
            block17: {
                boolean bl;
                block18: {
                    string2 = "";
                    bl = ln_2.R();
                    try {
                        string = (String)this.v();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (bl) break block16;
                    if (string == null) break block17;
                    break block18;
                    catch (Exception exception) {
                        throw U5.a(exception);
                    }
                }
                try {
                    block19: {
                        String string3;
                        try {
                            string3 = (String)this.v();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        string = string3.trim();
                        if (bl) break block16;
                        break block19;
                        catch (Exception exception) {
                            throw U5.a(exception);
                        }
                    }
                    if (string.equals("")) break block17;
                }
                catch (Exception exception) {
                    throw U5.a(exception);
                }
                try {
                    String string4;
                    Object object;
                    try {
                        object = this.v();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        string4 = (String)DS.d(object);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    string2 = string4;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            string = string2;
        }
        return string;
    }

    public long L() {
        return this.m;
    }

    public void P(long l2) {
        this.m = l2;
    }

    public void y() {
        try {
            this.P(System.currentTimeMillis());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public long n() {
        return this.z;
    }

    public void Y(long l2) {
        this.z = l2;
    }

    public long T() {
        return this.i;
    }

    public void c(long l2) {
        this.i = l2;
    }

    public boolean n() {
        return this.K;
    }

    public void Z(boolean bl) {
        this.K = bl;
    }

    public String D() {
        return (String)this.b;
    }

    public void d(String string) {
        this.b = string;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

