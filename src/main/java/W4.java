/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

public class W4 {
    public String V;
    long u;
    long S;
    long B;
    long Q;
    private static final String a;
    private static final long b;

    public W4(String string) {
        this.V = string;
        try {
            this.v();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void v() {
        block17: {
            String[] stringArray;
            String[] stringArray2;
            String[] stringArray3;
            String[] stringArray4;
            String string;
            String[] stringArray5;
            String string2;
            String string3;
            String[] stringArray6;
            block15: {
                block16: {
                    String[] stringArray7;
                    String[] stringArray8;
                    String string4;
                    String[] stringArray9;
                    String string5 = W2.F();
                    this.V = ((String)this.V).trim();
                    String string6 = string5;
                    String string7 = (String)this.V;
                    if (string6 != null) {
                        if (string7.equals("")) {
                            return;
                        }
                        string7 = (String)this.V;
                    }
                    try {
                        stringArray9 = (String[])lk_0.B(string7);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    stringArray6 = stringArray9;
                    string3 = string4 = stringArray6[0];
                    if (string6 == null) break block15;
                    if (!string3.contains(a)) break block16;
                    string2 = stringArray6[1];
                    try {
                        stringArray8 = (String[])lk_0.v(string2);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    stringArray5 = stringArray8;
                    this.u = Long.parseLong(stringArray5[1]);
                    long l2 = Long.parseLong(stringArray5[(int)b]);
                    this.S = this.u - l2;
                    string = stringArray6[2];
                    try {
                        stringArray7 = (String[])lk_0.v(string);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    stringArray4 = stringArray7;
                    this.B = Long.parseLong(stringArray4[1]);
                    this.Q = Long.parseLong(stringArray4[2]);
                    if (string6 != null) break block17;
                }
                string3 = stringArray6[1];
            }
            string2 = string3;
            try {
                stringArray3 = (String[])lk_0.v(string2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            stringArray5 = stringArray3;
            this.u = Long.parseLong(stringArray5[1]);
            String string8 = stringArray6[2];
            try {
                stringArray2 = (String[])lk_0.v(string8);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String[] stringArray10 = stringArray2;
            this.S = Long.parseLong(stringArray10[2]);
            string = stringArray6[3];
            try {
                stringArray = (String[])lk_0.v(string);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            stringArray4 = stringArray;
            this.B = Long.parseLong(stringArray4[1]);
            this.Q = Long.parseLong(stringArray4[2]);
        }
    }

    public long r() {
        return this.u;
    }

    public void o(long l2) {
        this.u = l2;
    }

    public long a() {
        return this.S;
    }

    public void i(long l2) {
        this.S = l2;
    }

    public long R() {
        return this.B;
    }

    public void a(long l2) {
        this.B = l2;
    }

    public long Z() {
        return this.Q;
    }

    public void V(long l2) {
        this.Q = l2;
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
                char[] cArray3 = "GN\tf\u0004\u0019\u0005J]".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 81;
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
                            n17 = 119;
                            break;
                        }
                        case 1: {
                            n17 = 105;
                            break;
                        }
                        case 2: {
                            n17 = 57;
                            break;
                        }
                        case 3: {
                            n17 = 94;
                            break;
                        }
                        case 4: {
                            n17 = 57;
                            break;
                        }
                        case 5: {
                            n17 = 41;
                            break;
                        }
                        default: {
                            n17 = 54;
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
        a = new String(cArray).intern();
        long l2 = 4868874321259095430L;
        b = 0xBEE968616AB6580L ^ l2;
    }
}

