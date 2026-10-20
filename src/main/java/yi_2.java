/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JRadioButtonMenuItem;

/*
 * Renamed from yi
 */
class yi_2
implements ActionListener {
    final JRadioButtonMenuItem l;
    final cg_0 u;

    yi_2(cg_0 cg_02, JRadioButtonMenuItem jRadioButtonMenuItem) {
        this.u = cg_02;
        this.l = jRadioButtonMenuItem;
    }

    /*
     * Loose catch block
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block45: {
            Object object;
            Object object2;
            lv_2 lv_22;
            Object object3;
            Object object4;
            Object object5;
            JRadioButtonMenuItem jRadioButtonMenuItem;
            block44: {
                boolean bl;
                block42: {
                    String[] stringArray;
                    block43: {
                        Object object6;
                        Object object7;
                        stringArray = KV.b();
                        try {
                            object7 = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object6 = object7.P();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            bl = (Boolean)object6.v();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (stringArray != null) break block42;
                        try {
                            Object object8;
                            block47: {
                                if (bl) break block43;
                                break block47;
                                catch (Exception exception) {
                                    throw yi_2.a(exception);
                                }
                            }
                            try {
                                object8 = yt_1.i();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                object8.g();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            return;
                        }
                        catch (Exception exception) {
                            throw yi_2.a(exception);
                        }
                    }
                    try {
                        jRadioButtonMenuItem = (JRadioButtonMenuItem)this.l;
                        if (stringArray != null) break block44;
                        bl = jRadioButtonMenuItem.isSelected();
                    }
                    catch (Exception exception) {
                        throw yi_2.a(exception);
                    }
                }
                try {
                    if (!bl) break block45;
                    jRadioButtonMenuItem = (JRadioButtonMenuItem)this.l;
                }
                catch (Exception exception) {
                    throw yi_2.a(exception);
                }
            }
            String string = jRadioButtonMenuItem.getText();
            try {
                object5 = this.u.r.h(string);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.u.r.x(object5);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.u.i(this.u.r, this.u.n);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object4 = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object3 = object4.g();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                lv_22 = (lv_2)object3.S(this.u.n);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            lv_2 lv_23 = lv_22;
            try {
                lv_23.f(string);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                try {
                    lv_23.A();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
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
                object.o(string);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

