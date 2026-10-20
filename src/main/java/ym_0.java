/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Ym
 */
class ym_0
implements KeyListener {
    final yb_1 O;
    private static final long a;

    ym_0(yb_1 yb_12) {
        this.O = yb_12;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int n10;
        block13: {
            int n11;
            block14: {
                int n12;
                block15: {
                    block16: {
                        boolean bl;
                        int[] nArray;
                        block17: {
                            block18: {
                                int n13;
                                Object object;
                                Object object2;
                                nArray = yb_1.Y();
                                try {
                                    object2 = yt_1.i();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    object = object2.h();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    n13 = (Integer)object.I();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (nArray == null) {
                                    n13 = n13 == u6_0.nk ? 1 : 0;
                                }
                                int n14 = n13;
                                n11 = 0;
                                n10 = keyEvent.getKeyCode();
                                if (nArray != null) break block13;
                                if (n10 != (int)a) break block14;
                                n12 = n14;
                                if (nArray != null) break block15;
                                if (n12 == 0) break block16;
                                bl = keyEvent.isControlDown();
                                if (nArray != null) break block17;
                                if (bl) break block18;
                                n10 = keyEvent.isMetaDown() ? 1 : 0;
                                if (nArray != null) break block13;
                                if (n10 == 0) break block14;
                            }
                            bl = true;
                        }
                        n11 = bl ? 1 : 0;
                        if (nArray == null) break block14;
                    }
                    n12 = 1;
                }
                n11 = n12;
            }
            n10 = n11;
        }
        if (n10 != 0) {
            keyEvent.consume();
            try {
                this.O.x();
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
        long l2 = 786026515552509834L;
        a = 0x7C4BCD848B8B9F80L ^ l2;
    }
}

