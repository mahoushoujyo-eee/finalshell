/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;

class B7
implements KeyListener {
    L1 W;
    final boolean R;
    final FK r;
    private static final long[] a;
    private static final Integer[] b;

    B7(FK fK2, boolean bl) {
        this.r = fK2;
        this.R = bl;
        this.W = null;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        block17: {
            FK fK2;
            block21: {
                block22: {
                    int n10;
                    String[] stringArray;
                    block20: {
                        int n11;
                        block19: {
                            block18: {
                                block16: {
                                    int n12;
                                    stringArray = FK.i();
                                    try {
                                        n12 = ((Boolean)this.r.A()).booleanValue();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    if (stringArray == null) {
                                        if (n12 == 0) {
                                            return;
                                        }
                                        n12 = ((tq_2)this.r.s).getSelectedRow();
                                    }
                                    int n13 = n12;
                                    n11 = this.R;
                                    if (stringArray != null) break block16;
                                    if (n11 != 0) break block17;
                                    n11 = keyEvent.getModifiers();
                                }
                                if (stringArray != null) break block18;
                                if (n11 != 0) break block17;
                                n11 = keyEvent.getKeyCode();
                            }
                            if (stringArray != null) break block19;
                            if (n11 != B7.a(20141, 8189760722115350579L)) break block17;
                            n11 = ((FK)this.r).isVisible() ? 1 : 0;
                        }
                        if (n11 == 0) {
                            // empty if block
                        }
                        if (this.R) break block17;
                        long l2 = System.currentTimeMillis() - this.r.R;
                        n10 = this.r.k;
                        if (stringArray != null) break block20;
                        if (n10 != B7.a(22529, 5405553293530154653L)) break block17;
                        try {
                            this.r.f(false);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            this.r.Z();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        fK2 = (FK)this.r;
                        if (stringArray != null) break block21;
                        n10 = fK2.isVisible() ? 1 : 0;
                    }
                    if (n10 != 0) break block22;
                    try {
                        this.r.Q();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (stringArray == null) break block17;
                }
                fK2 = (FK)this.r;
            }
            try {
                fK2.o();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block5: {
            FK fK2;
            block4: {
                String[] stringArray = FK.i();
                this.r.R = System.currentTimeMillis();
                String[] stringArray2 = stringArray;
                this.r.k = keyEvent.getKeyCode();
                fK2 = (FK)this.r;
                if (stringArray2 != null) break block4;
                fK2.N = true;
                if (keyEvent.getKeyCode() != B7.a(28338, 2849901760476180525L)) break block5;
                fK2 = (FK)this.r;
            }
            String string = ((dv_0)fK2.lD).getText().trim();
            try {
                this.r.L(string);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4905433317014324509L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = ";\u008a\u00e5\u0098\u00d7 \u0095<\u00eea{\u00e6\u00a7\u00f05:\u00c4x6s9O\u0083\u0092";
        int n11 = ";\u008a\u00e5\u0098\u00d7 \u0095<\u00eea{\u00e6\u00a7\u00f05:\u00c4x6s9O\u0083\u0092".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1E9E;
        if (b[n11] == null) {
            B7.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

