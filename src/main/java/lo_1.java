/*
 * Decompiled with CFR 0.152.
 */
import com.O0;
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from lO
 */
public class lo_1
extends ln_2 {
    String w;
    private static final String c;

    public void K(O0 o0) {
        try {
            le_2.B((Object)this, (Object)o0);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void w() throws Exception {
        String string;
        try {
            string = (String)lk_0.p(this.w);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string2 = string;
        O0 o0 = O0.y(string2);
        try {
            this.K(o0);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void r() throws Exception {
        try {
            this.s(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void s(boolean bl) throws Exception {
        block12: {
            O0 o0;
            try {
                o0 = (O0)this.r();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            O0 o02 = o0;
            try {
                Object object;
                Object object2;
                try {
                    KT.M(this.w, (Object)(c + (String)this.O), o02);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (!bl) break block12;
                try {
                    object2 = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object = object2.Q();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object.G();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            catch (Exception exception) {
                throw lo_1.a(exception);
            }
        }
    }

    public O0 r() {
        O0 o0 = new O0();
        try {
            le_2.b((Object)this, (Object)o0);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return o0;
    }

    @Override
    public ln_2 B() {
        return new lo_1();
    }

    public String v() {
        return (String)this.w;
    }

    public void e(String string) {
        this.w = string;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\".l1\\\u000b:'.n3P\u001e:".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 116;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 48;
                            break;
                        }
                        case 1: {
                            n17 = 53;
                            break;
                        }
                        case 2: {
                            n17 = 116;
                            break;
                        }
                        case 3: {
                            n17 = 33;
                            break;
                        }
                        case 4: {
                            n17 = 77;
                            break;
                        }
                        case 5: {
                            n17 = 13;
                            break;
                        }
                        default: {
                            n17 = 17;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        c = new String(cArray).intern();
    }
}

