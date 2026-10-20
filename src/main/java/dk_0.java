/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Dk
 */
public class dk_0 {
    km_0 r;

    dk_0(km_0 km_02) {
        this.r = km_02;
    }

    public void K(KeyEvent keyEvent) {
        block31: {
            Serializable serializable;
            String string;
            Object object;
            int n10;
            int n11;
            int n12;
            kl_2 kl_22;
            String string2;
            String string3;
            block37: {
                int n13;
                block29: {
                    int n14;
                    block30: {
                        kl_2 kl_23;
                        string3 = km_0.U();
                        if (keyEvent.getModifiers() > 0) {
                            return;
                        }
                        string2 = (keyEvent.getKeyChar() + "").toLowerCase();
                        try {
                            kl_23 = (kl_2)this.r.U();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        kl_22 = kl_23;
                        n14 = string2.length();
                        if (string3 != null) break block30;
                        if (n14 != 1) break block31;
                        n14 = ((km_0)this.r).getRowCount();
                    }
                    n12 = n14;
                    int n15 = ((km_0)this.r).getSelectedRow();
                    int n16 = 0;
                    n11 = n15 + 1;
                    while (n11 < n12) {
                        block36: {
                            boolean bl;
                            block35: {
                                block34: {
                                    block32: {
                                        block33: {
                                            String string4;
                                            Object object2;
                                            n10 = ((km_0)this.r).convertRowIndexToModel(n11);
                                            try {
                                                object2 = kl_22.G(n10);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            object = object2;
                                            string = "";
                                            n13 = object.getClass().equals(ck_2.class) ? 1 : 0;
                                            if (string3 != null) break block29;
                                            if (string3 != null) break block32;
                                            if (n13 == 0) break block33;
                                            serializable = (ck_2)object;
                                            try {
                                                string4 = (String)serializable.a();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            string = string4;
                                            if (string3 == null) break block34;
                                        }
                                        bl = object.getClass().equals(tf_2.class);
                                    }
                                    if (string3 != null) break block35;
                                    if (bl) {
                                        String string5;
                                        serializable = (tf_2)object;
                                        try {
                                            string5 = (String)serializable.M();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        string = string5;
                                    }
                                }
                                string = string.toLowerCase();
                                if (string3 != null) break block36;
                                bl = string.startsWith(string2);
                            }
                            if (bl) {
                                try {
                                    this.r.c(n11);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                n16 = 1;
                                if (string3 == null) break;
                            }
                            ++n11;
                        }
                        if (string3 == null) continue;
                    }
                    n13 = n16;
                }
                if (string3 != null) break block37;
                if (n13 != 0) break block31;
                n13 = n11 = 0;
            }
            while (n11 < n12) {
                block42: {
                    boolean bl;
                    block41: {
                        block40: {
                            block38: {
                                block39: {
                                    String string6;
                                    Object object3;
                                    n10 = ((km_0)this.r).convertRowIndexToModel(n11);
                                    try {
                                        object3 = kl_22.G(n10);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    object = object3;
                                    string = "";
                                    bl = object.getClass().equals(ck_2.class);
                                    if (string3 != null) break block38;
                                    if (!bl) break block39;
                                    serializable = (ck_2)object;
                                    try {
                                        string6 = (String)serializable.a();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    string = string6;
                                    if (string3 == null) break block40;
                                }
                                bl = object.getClass().equals(tf_2.class);
                            }
                            if (string3 != null) break block41;
                            if (bl) {
                                String string7;
                                serializable = (tf_2)object;
                                try {
                                    string7 = (String)serializable.M();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                string = string7;
                            }
                        }
                        string = string.toLowerCase();
                        if (string3 != null) break block42;
                        bl = string.startsWith(string2);
                    }
                    if (bl) {
                        try {
                            this.r.c(n11);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (string3 == null) break;
                    }
                    ++n11;
                }
                if (string3 == null) continue;
            }
        }
    }
}

