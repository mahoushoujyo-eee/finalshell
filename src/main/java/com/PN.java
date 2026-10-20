/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QT;
import com._y_0;
import com.aW;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@Deprecated(forRemoval=true)
final class PN
implements aW,
KeyListener {
    private final Object K = new Object();
    private final QT b;
    private StringBuffer L;
    private boolean A;
    private static final long a;

    public PN(QT qT) {
        this.b = qT;
        this.A = true;
    }

    @Override
    public String k(String string) {
        this.A = false;
        String string2 = this.S(string, null);
        this.A = true;
        return string2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public String S(String var1_1, String var2_2) {
        var4_3 = this.K;
        synchronized (var4_3) {
            block9: {
                var3_4 = _y_0.y();
                this.b.a(var1_1);
                this.L = new StringBuffer();
                v0 = var2_2;
                if (var3_4 != 0) ** GOTO lbl25
                try {
                    block10: {
                        if (v0 == null) break block9;
                        break block10;
                        catch (InterruptedException v1) {
                            throw PN.a(v1);
                        }
                    }
                    this.L.append(var2_2);
                    this.b.a(var2_2);
                }
                catch (InterruptedException v2) {
                    throw PN.a(v2);
                }
            }
            try {
                v0 = this.K;
lbl25:
                // 2 sources

                v0.wait();
            }
            catch (InterruptedException var5_5) {
                var5_5.printStackTrace();
            }
            var5_6 = this.L.toString();
            this.L = null;
            return var5_6;
        }
    }

    @Override
    public void U(String string) {
        this.b.a(string);
        this.b.K();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int n10 = _y_0.M();
        Object object = this.L;
        if (n10 != 0) {
            if (object == null) {
                return;
            }
            object = this.K;
        }
        StringBuffer stringBuffer = object;
        synchronized (object) {
            int n11;
            block10: {
                int n12 = 0;
                n11 = keyEvent.getKeyCode();
                if (n10 != 0) {
                    switch (n11) {
                        case 8: {
                            n11 = this.L.length();
                            if (n10 != 0) {
                                if (n11 <= 0) break;
                                this.b.Q();
                                this.b.b(0);
                                this.L.deleteCharAt(this.L.length() - 1);
                                if (n10 != 0) break;
                            }
                            break block10;
                        }
                        case 10: {
                            this.b.K();
                            n12 = 1;
                        }
                    }
                    n11 = n12;
                }
            }
            if (n11 == 0) return;
            this.K.notifyAll();
            // ** MonitorExit[var3_3] (shouldn't be in output)
            return;
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        block6: {
            PN pN;
            char c2;
            block7: {
                int n10;
                block5: {
                    int n11 = _y_0.y();
                    if (this.L == null) {
                        return;
                    }
                    c2 = keyEvent.getKeyChar();
                    n10 = Character.getType(c2);
                    if (n11 != 0) break block5;
                    if (n10 == (int)a) break block6;
                    pN = this;
                    if (n11 != 0) break block7;
                    n10 = pN.A ? 1 : 0;
                }
                if (n10 != 0) {
                    this.b.k(Character.toString(c2));
                }
                pN = this;
            }
            pN.L.append(c2);
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8889063918216737247L;
        a = 0xFFADF098F0CF1D0L ^ l2;
    }
}

