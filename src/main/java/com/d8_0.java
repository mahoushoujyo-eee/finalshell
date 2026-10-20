/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EP;
import com.ak_0;
import com.nl_1;
import com.nv_2;
import com.uh_0;
import com.ym_1;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Enumeration;

/*
 * Renamed from com.d8
 */
public class d8_0
implements ak_0 {
    public static d8_0 v;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    @Override
    public void u(nl_1 nl_12, Object object, Object object2, Type type, int n10) throws IOException {
        block29: {
            Object object3;
            Type type2;
            String string;
            ym_1 ym_12;
            block27: {
                Type type3;
                block28: {
                    boolean bl;
                    block26: {
                        block33: {
                            block25: {
                                block31: {
                                    ym_12 = nl_12.w;
                                    string = nv_2.o();
                                    if (string == null) break block31;
                                    try {
                                        block32: {
                                            if (object != null) break block25;
                                            break block32;
                                            catch (IOException iOException) {
                                                throw d8_0.a(iOException);
                                            }
                                        }
                                        ym_12.x(EP.WriteNullListAsEmpty);
                                    }
                                    catch (IOException iOException) {
                                        throw d8_0.a(iOException);
                                    }
                                }
                                return;
                            }
                            type2 = null;
                            bl = ym_12.I(EP.WriteClassName);
                            if (string == null) break block26;
                            if (!bl) break block27;
                            break block33;
                            catch (IOException iOException) {
                                throw d8_0.a(iOException);
                            }
                        }
                        try {
                            block34: {
                                type3 = type;
                                if (string == null) break block28;
                                break block34;
                                catch (IOException iOException) {
                                    throw d8_0.a(iOException);
                                }
                            }
                            bl = type3 instanceof ParameterizedType;
                        }
                        catch (IOException iOException) {
                            throw d8_0.a(iOException);
                        }
                    }
                    if (!bl) break block27;
                    type3 = type;
                }
                object3 = (ParameterizedType)type3;
                type2 = object3.getActualTypeArguments()[0];
            }
            object3 = (Enumeration)object;
            uh_0 uh_02 = nl_12.W;
            nl_12.N(uh_02, object, object2, 0);
            try {
                int n11 = 0;
                ym_12.T((char)d8_0.a(8884, 861100755141418962L));
                while (object3.hasMoreElements()) {
                    Object e2;
                    block30: {
                        e2 = object3.nextElement();
                        if (string == null) break block29;
                        try {
                            block35: {
                                if (n11++ == 0) break block30;
                                break block35;
                                catch (IOException iOException) {
                                    throw d8_0.a(iOException);
                                }
                            }
                            ym_12.T((char)d8_0.a(18938, 7062378330414396575L));
                        }
                        catch (IOException iOException) {
                            throw d8_0.a(iOException);
                        }
                    }
                    try {
                        if (e2 == null) {
                            ym_12.Y();
                            if (string != null) continue;
                        }
                    }
                    catch (IOException iOException) {
                        throw d8_0.a(iOException);
                    }
                    ak_0 ak_02 = nl_12.E(e2.getClass());
                    ak_02.u(nl_12, e2, n11 - 1, type2, 0);
                    if (string != null) continue;
                }
                ym_12.T((char)d8_0.a(25747, 7995816361652591092L));
            }
            finally {
                nl_12.W = uh_02;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3877611751213112810L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00e6\u00c1\u00e1P\u00da\u007f\u0004C\u00f6\u00d5Y\u00a3\u00cd\u00f6Bc\u00ba\u000e\u001e\u00a1\u00ba4)Y";
        int n11 = "\u00e6\u00c1\u00e1P\u00da\u007f\u0004C\u00f6\u00d5Y\u00a3\u00cd\u00f6Bc\u00ba\u000e\u001e\u00a1\u00ba4)Y".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[3];
        v = new d8_0();
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7D67;
        if (b[n11] == null) {
            d8_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

