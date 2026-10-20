/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class YZ
implements ActionListener {
    final nx_0 H;

    YZ(nx_0 nx_02) {
        this.H = nx_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block16: {
            String string;
            block17: {
                String string2;
                block18: {
                    String string3;
                    tf_2 tf_22;
                    String string4;
                    block15: {
                        string4 = km_0.U();
                        nx_0 nx_02 = (nx_0)this.H;
                        if (string4 == null) {
                            if ((ck_2)nx_02.U != null) {
                                Object object;
                                try {
                                    object = this.H.U.d();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    lk_0.u(object);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                            nx_02 = (nx_0)this.H;
                        }
                        tf_22 = (tf_2)nx_02.P;
                        if (string4 != null) break block15;
                        if (tf_22 == null) break block16;
                        tf_22 = (tf_2)this.H.P;
                    }
                    try {
                        string3 = (String)tf_22.k();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    string = string2 = string3;
                    if (string4 != null) break block17;
                    if (string.equals("/")) break block18;
                    string = string2;
                    if (string4 != null) break block17;
                    if (!string.endsWith("/")) {
                        string2 = string2 + "/";
                    }
                }
                string = string2;
            }
            try {
                lk_0.u(string);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

