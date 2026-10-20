/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.pc_0;
import com.pw_1;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from lN
 */
public class ln_1
extends ln_2 {
    String v;
    byte[] j;
    boolean o;
    pw_1 T;
    private static int x;

    public ln_1() {
        this.o = false;
    }

    public String P() {
        return (String)this.v;
    }

    public void v(String string) {
        this.v = string;
    }

    public byte[] p() {
        return (byte[])this.j;
    }

    public void X(byte[] byArray) {
        this.j = byArray;
        try {
            Object object;
            try {
                object = om_2.m(this);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.T = object;
        }
        catch (pc_0 pc_02) {
            pc_02.printStackTrace();
        }
    }

    @Override
    public ln_2 B() {
        return new ln_1();
    }

    public boolean s() {
        return this.o;
    }

    public void F(boolean bl) {
        this.o = bl;
    }

    public pw_1 h() {
        return (pw_1)this.T;
    }

    public void Q(pw_1 pw_12) {
        this.T = pw_12;
    }

    public static void O(int n10) {
        x = n10;
    }

    public static int A() {
        return x;
    }

    public static int v() {
        int n10 = ln_1.A();
        if (n10 == 0) {
            return 117;
        }
        return 0;
    }

    static {
        if (ln_1.A() != 0) {
            ln_1.O(107);
        }
    }
}

