/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class Y2
implements ActionListener {
    final FK y;
    private static final long a;

    Y2(FK fK2) {
        this.y = fK2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void actionPerformed(ActionEvent var1_1) {
        block22: {
            block21: {
                block20: {
                    block18: {
                        block19: {
                            try {
                                v0 = (Long)this.y.a();
                            }
                            catch (InvocationTargetException v1) {
                                throw v1.getTargetException();
                            }
                            var3_2 = System.currentTimeMillis() - v0;
                            var2_3 = FK.i();
                            v2 = ((FK)this.y).isVisible();
                            if (var2_3 != null) break block18;
                            if (v2 == 0) break block19;
                            try {
                                this.y.o();
                            }
                            catch (InvocationTargetException v3) {
                                throw v3.getTargetException();
                            }
                            if (var2_3 == null) break block20;
                        }
                        v2 = (cfr_temp_0 = var3_2 - Y2.a) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                    }
                    if (var2_3 == null) {
                        if (v2 > 0) {
                            try {
                                this.y.Z();
                            }
                            catch (InvocationTargetException v4) {
                                throw v4.getTargetException();
                            }
                            try {
                                this.y.Q();
                            }
                            catch (InvocationTargetException v5) {
                                throw v5.getTargetException();
                            }
                        } else {
                            ** GOTO lbl39
                        }
                    }
                    break block21;
                }
                v6 = (FK)this.y;
                if (var2_3 != null) break block22;
                v2 = (int)v6.P;
            }
            if (v2 != 0) {
                try {
                    this.y.f(true);
                }
                catch (InvocationTargetException v7) {
                    throw v7.getTargetException();
                }
            }
            v6 = (FK)this.y;
        }
        try {
            v8 = (Rectangle)v6.S();
        }
        catch (InvocationTargetException v9) {
            throw v9.getTargetException();
        }
        var5_4 = v8;
        ((FK)this.y).setBounds(var5_4);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7647438739696825250L;
        a = 0x6A2129041130B358L ^ l2;
    }
}

