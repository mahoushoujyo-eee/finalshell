/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import org.apache.hc.client5.http.SystemDefaultDnsResolver;

/*
 * Renamed from bP
 */
class bp_1
extends SystemDefaultDnsResolver {
    final u5_0 k;
    private static final String a;

    bp_1(u5_0 u5_02) {
        this.k = u5_02;
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
            inetAddressArray = string.equals((String)this.k.D) ? super.resolve(string4) : super.resolve(string);
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
                char[] cArray3 = "@<\"j%PF9m\u000e^\bixb;\u001an,NjUX\u0007U\u0017xg@T\u001f2^YS\"?9\\>p@NC\u0004M\"9".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 6;
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
                            n17 = 16;
                            break;
                        }
                        case 1: {
                            n17 = 8;
                            break;
                        }
                        case 2: {
                            n17 = 75;
                            break;
                        }
                        case 3: {
                            n17 = 2;
                            break;
                        }
                        case 4: {
                            n17 = 104;
                            break;
                        }
                        case 5: {
                            n17 = 14;
                            break;
                        }
                        default: {
                            n17 = 47;
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

