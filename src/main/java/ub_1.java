/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.pa_1;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.KeyStroke;

/*
 * Renamed from uB
 */
class ub_1
implements KeyListener {
    boolean S;
    final pa_1 O;
    final F_ s;
    private static final long[] a;
    private static final Integer[] b;
    private static final long c;

    ub_1(F_ f_2, pa_1 pa_12) {
        this.s = f_2;
        this.O = pa_12;
        this.S = false;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        block28: {
            int n10;
            int n11;
            block30: {
                String[] stringArray;
                block29: {
                    block24: {
                        block25: {
                            F_ f_2;
                            block26: {
                                dv_0 dv_02;
                                block27: {
                                    block23: {
                                        block21: {
                                            block22: {
                                                int n12;
                                                boolean bl;
                                                stringArray = F_.F();
                                                try {
                                                    bl = (Boolean)this.s.A();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                if (!bl) {
                                                    return;
                                                }
                                                KeyStroke keyStroke = KeyStroke.getKeyStrokeForEvent(keyEvent);
                                                n11 = keyStroke.getModifiers();
                                                if (stringArray == null) break block21;
                                                if (n11 != 0) break block22;
                                                n11 = n12 = keyEvent.getKeyCode();
                                                n10 = ub_1.a(12946, 2137176971674416974L);
                                                if (stringArray == null) break block23;
                                                if (n11 == n10) {
                                                    F_ f_3 = (F_)this.s;
                                                    if (stringArray != null) {
                                                        long l2;
                                                        if (f_3.hc == ub_1.a(12946, 2137176971674416974L) && (l2 = System.currentTimeMillis() - this.s.hz) < c) {
                                                            ((pa_1)this.O).X().O().requestFocus();
                                                        }
                                                        f_3 = (F_)this.s;
                                                    }
                                                    f_3.hz = System.currentTimeMillis();
                                                }
                                            }
                                            this.s.hc = keyEvent.getKeyCode();
                                            n11 = keyEvent.getKeyCode();
                                        }
                                        n10 = ub_1.a(6928, 1265977075100802760L);
                                    }
                                    if (stringArray == null) break block24;
                                    if (n11 != n10) break block25;
                                    this.s.hv = true;
                                    this.s.hp = System.currentTimeMillis();
                                    f_2 = (F_)this.s;
                                    if (stringArray == null) break block26;
                                    if (!f_2.isVisible()) break block27;
                                    try {
                                        this.s.o();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    if (stringArray != null) break block28;
                                }
                                try {
                                    dv_02 = (dv_0)F_.E(this.s);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                dv_02.setText("");
                                f_2 = (F_)this.s;
                            }
                            try {
                                f_2.R();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (stringArray != null) break block28;
                        }
                        n11 = keyEvent.getKeyCode();
                        n10 = ub_1.a(28753, 67497304671171978L);
                    }
                    if (stringArray == null) break block29;
                    if (n11 == n10) break block28;
                    n11 = keyEvent.getKeyCode();
                    n10 = ub_1.a(22334, 2058444445699740391L);
                }
                if (stringArray == null) break block30;
                if (n11 == n10) break block28;
                n11 = keyEvent.getKeyCode();
                n10 = ub_1.a(1767, 7955502263690576696L);
            }
            if (n11 == n10) {
                // empty if block
            }
        }
        this.s.hc = keyEvent.getKeyCode();
        this.s.hE = keyEvent.isControlDown();
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block5: {
            int n10;
            int n11;
            block4: {
                String[] stringArray = F_.F();
                this.s.he = keyEvent.getKeyCode();
                String[] stringArray2 = stringArray;
                int n12 = keyEvent.getKeyCode();
                KeyStroke keyStroke = KeyStroke.getKeyStrokeForEvent(keyEvent);
                n11 = n12;
                n10 = ub_1.a(2070, 1820936551941754312L);
                if (stringArray2 == null) break block4;
                if (n11 == n10) break block5;
                n11 = keyStroke.getModifiers();
                n10 = ub_1.a(4548, 6973595155736482841L);
            }
            if ((n11 & n10) != 0) {
                this.S = true;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                block8: {
                    var2 = 2221912735667580633L;
                    var8_1 = new long[7];
                    var5_2 = 0;
                    var6_3 = "\u00e2\u0019Z\u00f6\u00d2o:@\u00b1.>\u00ff\u0089\u00ad\u0099\u0086]\u00cd4\u00c3\u00c6v-\u00eb\u00c6\u0019r\u00c3\u0012b\u00a3\u0000\u00fa\u0090u\u00efT\u00ae\u00fc\u0016";
                    var7_4 = "\u00e2\u0019Z\u00f6\u00d2o:@\u00b1.>\u00ff\u0089\u00ad\u0099\u0086]\u00cd4\u00c3\u00c6v-\u00eb\u00c6\u0019r\u00c3\u0012b\u00a3\u0000\u00fa\u0090u\u00efT\u00ae\u00fc\u0016".length();
                    var4_5 = 0;
                    while (true) {
                        var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                        v0 = var8_1;
                        v1 = var5_2++;
                        v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                        v3 = -1;
                        break block8;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        var6_3 = "\u00cd\u00a5Q\u00d4\\J0\u0018w%s(\u0087Y[H";
                        var7_4 = "\u00cd\u00a5Q\u00d4\\J0\u0018w%s(\u0087Y[H".length();
                        var4_5 = 0;
                        while (true) {
                            var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                            v0 = var8_1;
                            v1 = var5_2++;
                            v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                            v3 = 0;
                            break block8;
                            break;
                        }
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        break block9;
                        break;
                    }
                }
                v4 = v2 ^ var2;
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl38:
                    // 1 sources

                    ** continue;
                }
            }
            ub_1.a = var8_1;
            ub_1.b = new Integer[7];
            break block10;
lbl43:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 2449060489221272086L;
        ** while (true)
        ub_1.c = 2449060489221272546L ^ var0_7;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x45DD;
        if (b[n11] == null) {
            ub_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

