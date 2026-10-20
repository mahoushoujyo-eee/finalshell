/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.KeyStroke;

public class zG {
    int m;
    int X;
    int S;
    String B;
    KeyStroke N;
    private static int[] e;

    public zG(int n10, String string, int n11, int n12) {
        this.m = n10;
        this.B = string;
        this.X = n11;
        this.S = n12;
        try {
            this.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void F() {
        this.N = KeyStroke.getKeyStroke(this.S, this.X);
    }

    public int m() {
        return this.X;
    }

    public void A(int n10) {
        this.X = n10;
    }

    public int p() {
        return this.S;
    }

    public void s(int n10) {
        this.S = n10;
    }

    public int K() {
        return this.m;
    }

    public void Y(int n10) {
        this.m = n10;
    }

    public String y() {
        return (String)this.B;
    }

    public void C(String string) {
        this.B = string;
    }

    public KeyStroke f() {
        return (KeyStroke)this.N;
    }

    public void h(KeyStroke keyStroke) {
        this.N = keyStroke;
    }

    public static void p(int[] nArray) {
        e = nArray;
    }

    public static int[] Z() {
        return e;
    }

    static {
        if (zG.Z() != null) {
            zG.p(new int[3]);
        }
    }
}

