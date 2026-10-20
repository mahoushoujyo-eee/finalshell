/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.w6_0;
import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;

/*
 * Renamed from com.Bm
 */
class bm_0
implements AWTEventListener {
    private static final long a;

    bm_0() {
    }

    @Override
    public void eventDispatched(AWTEvent aWTEvent) {
        block8: {
            KeyEvent keyEvent;
            block14: {
                int n10;
                KeyEvent keyEvent2;
                block12: {
                    String[] stringArray;
                    block13: {
                        block11: {
                            block10: {
                                AWTEvent aWTEvent2;
                                block9: {
                                    boolean bl;
                                    block7: {
                                        stringArray = GR.I();
                                        bl = w6_0.y;
                                        if (stringArray == null) break block7;
                                        if (!bl) break block8;
                                        aWTEvent2 = aWTEvent;
                                        if (stringArray == null) break block9;
                                        bl = aWTEvent2 instanceof KeyEvent;
                                    }
                                    if (!bl) break block8;
                                    aWTEvent2 = aWTEvent;
                                }
                                keyEvent2 = (KeyEvent)aWTEvent2;
                                n10 = keyEvent2.isConsumed();
                                if (stringArray == null) break block10;
                                if (n10 != 0) break block11;
                                n10 = keyEvent2.getID();
                            }
                            if (stringArray == null) break block12;
                            if (n10 == (int)a) break block13;
                        }
                        return;
                    }
                    keyEvent = keyEvent2;
                    if (stringArray == null) break block14;
                    n10 = w6_0.g(keyEvent) ? 1 : 0;
                }
                if (n10 == 0) {
                    return;
                }
                keyEvent = keyEvent2;
            }
            w6_0.m(keyEvent);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 181851864725441616L;
        a = 0x66C365BB6B3CDC1L ^ l2;
    }
}

