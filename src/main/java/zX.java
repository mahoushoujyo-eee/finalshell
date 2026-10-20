/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

public class zX {
    ArrayList R;
    ArrayList O;
    String d;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public static void main(String[] stringArray) {
        boolean bl;
        try {
            bl = (Boolean)new zX(a).R(zX.a(11769, 3652905388264958844L));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        System.out.println(bl);
    }

    public zX(String string) {
        this.R = new ArrayList();
        this.O = new ArrayList();
        this.d = string;
        try {
            this.W();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void W() {
        int n10 = 0;
        String[] stringArray = F_.F();
        for (int i2 = 0; i2 < ((String)this.d).length(); ++i2) {
            int n11;
            int n12 = n10;
            if (stringArray != null) {
                if (n12 != 0) {
                    ((ArrayList)this.R).add(i2);
                    n10 = 0;
                    if (stringArray != null) continue;
                }
                n12 = ((String)this.d).charAt(i2);
            }
            int n13 = n11 = n12;
            if (stringArray != null) {
                if (n13 == zX.a(31120, 8152296831967166228L)) {
                    n10 = 1;
                    try {
                        this.m(i2);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (stringArray != null) continue;
                }
                n13 = 0;
            }
            n10 = n13;
            if (stringArray != null) continue;
        }
    }

    public void m(int n10) {
        ((ArrayList)this.R).add(n10);
        ((ArrayList)this.R).add(n10 + 1);
        ((ArrayList)this.O).add(n10);
    }

    public boolean R(int n10) {
        int n11;
        block3: {
            int n12 = 0;
            Iterator iterator = ((ArrayList)this.R).iterator();
            String[] stringArray = F_.F();
            while (iterator.hasNext()) {
                block5: {
                    block4: {
                        int n13 = (Integer)iterator.next();
                        n11 = n10;
                        if (stringArray == null) break block3;
                        if (stringArray == null) break block4;
                        if (n11 != n13) break block5;
                        int n14 = n12 = 1;
                    }
                    if (stringArray != null) break;
                }
                if (stringArray != null) continue;
            }
            n11 = n12;
        }
        return n11 != 0;
    }

    public boolean q(int n10) {
        int n11;
        block3: {
            int n12 = 0;
            Iterator iterator = ((ArrayList)this.O).iterator();
            String[] stringArray = F_.F();
            while (iterator.hasNext()) {
                block5: {
                    block4: {
                        int n13 = (Integer)iterator.next();
                        n11 = n10;
                        if (stringArray == null) break block3;
                        if (stringArray == null) break block4;
                        if (n11 != n13) break block5;
                        int n14 = n12 = 1;
                    }
                    if (stringArray != null) break;
                }
                if (stringArray != null) continue;
            }
            n11 = n12;
        }
        return n11 != 0;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "\f/tuo,/\u001b*sbUo,".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 124;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
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
                            n17 = 17;
                            break;
                        }
                        case 1: {
                            n17 = 50;
                            break;
                        }
                        case 2: {
                            n17 = 105;
                            break;
                        }
                        case 3: {
                            n17 = 104;
                            break;
                        }
                        case 4: {
                            n17 = 79;
                            break;
                        }
                        case 5: {
                            n17 = 97;
                            break;
                        }
                        default: {
                            n17 = 53;
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
        long l2 = 4544509559427520432L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u00ffK\u00e7\u00d4t\u00fa\u00a8\u00f8\u00f4\u00ae0\u0093\u0011\u00af\u00fc\u00c4";
        int n19 = "\u00ffK\u00e7\u00d4t\u00fa\u00a8\u00f8\u00f4\u00ae0\u0093\u0011\u00af\u00fc\u00c4".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x684;
        if (c[n11] == null) {
            zX.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

