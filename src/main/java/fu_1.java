/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from fU
 */
class fu_1
implements ActionListener {
    final int G;
    final YB r;

    fu_1(YB yB, int n10) {
        this.r = yB;
        this.G = n10;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n10;
        block116: {
            int n11;
            block95: {
                int n12;
                block103: {
                    boolean bl;
                    block104: {
                        block105: {
                            boolean bl2;
                            block115: {
                                String string;
                                Object object;
                                File file;
                                String string2;
                                Serializable serializable;
                                block114: {
                                    boolean bl3;
                                    int n13;
                                    km_0 km_02;
                                    block106: {
                                        Object object2;
                                        block107: {
                                            block109: {
                                                a3 a32;
                                                block111: {
                                                    block113: {
                                                        boolean bl4;
                                                        block112: {
                                                            block110: {
                                                                block108: {
                                                                    String string3;
                                                                    Object object3;
                                                                    Object object4;
                                                                    kl_2 kl_22;
                                                                    km_0 km_03;
                                                                    Serializable serializable2;
                                                                    block96: {
                                                                        block97: {
                                                                            block98: {
                                                                                boolean bl5;
                                                                                block102: {
                                                                                    String string4;
                                                                                    Object object5;
                                                                                    block101: {
                                                                                        boolean bl6;
                                                                                        block99: {
                                                                                            block100: {
                                                                                                String string5;
                                                                                                Object object6;
                                                                                                Object object7;
                                                                                                kl_2 kl_23;
                                                                                                km_0 km_04;
                                                                                                block86: {
                                                                                                    block87: {
                                                                                                        block91: {
                                                                                                            boolean bl7;
                                                                                                            block94: {
                                                                                                                block93: {
                                                                                                                    block92: {
                                                                                                                        String string6;
                                                                                                                        tf_2 tf_22;
                                                                                                                        block88: {
                                                                                                                            block90: {
                                                                                                                                boolean bl8;
                                                                                                                                block89: {
                                                                                                                                    String string7;
                                                                                                                                    Object object8;
                                                                                                                                    km_0 km_05;
                                                                                                                                    a3 a33;
                                                                                                                                    n11 = 0;
                                                                                                                                    bl = F6.i();
                                                                                                                                    try {
                                                                                                                                        a33 = (a3)this.r.q.h();
                                                                                                                                    }
                                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                                    }
                                                                                                                                    a32 = a33;
                                                                                                                                    n10 = this.G;
                                                                                                                                    n12 = YB.M;
                                                                                                                                    if (!bl) break block86;
                                                                                                                                    if (n10 != n12) break block87;
                                                                                                                                    try {
                                                                                                                                        km_05 = (km_0)this.r.q.V();
                                                                                                                                    }
                                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                                    }
                                                                                                                                    km_02 = km_05;
                                                                                                                                    n13 = km_02.getSelectedRow();
                                                                                                                                    if (n13 <= -1) break block88;
                                                                                                                                    try {
                                                                                                                                        object8 = km_02.L(n13);
                                                                                                                                    }
                                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                                    }
                                                                                                                                    serializable2 = (tf_2)object8;
                                                                                                                                    try {
                                                                                                                                        string7 = (String)serializable2.k();
                                                                                                                                    }
                                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                                    }
                                                                                                                                    object2 = string7;
                                                                                                                                    serializable = new File((String)object2);
                                                                                                                                    bl8 = serializable.exists();
                                                                                                                                    if (!bl) break block89;
                                                                                                                                    if (!bl8) break block90;
                                                                                                                                    this.r.t = object2;
                                                                                                                                    bl8 = true;
                                                                                                                                }
                                                                                                                                n11 = bl8 ? 1 : 0;
                                                                                                                            }
                                                                                                                            if (bl) break block91;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            tf_22 = (tf_2)a32.f();
                                                                                                                        }
                                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                                        }
                                                                                                                        serializable2 = tf_22;
                                                                                                                        try {
                                                                                                                            string6 = (String)serializable2.k();
                                                                                                                        }
                                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                                        }
                                                                                                                        object2 = string6;
                                                                                                                        serializable = new File((String)object2);
                                                                                                                        bl7 = serializable.exists();
                                                                                                                        if (!bl) break block92;
                                                                                                                        if (!bl7) break block91;
                                                                                                                        bl7 = serializable.isDirectory();
                                                                                                                    }
                                                                                                                    if (!bl) break block93;
                                                                                                                    if (!bl7) break block91;
                                                                                                                    bl7 = serializable.isFile();
                                                                                                                }
                                                                                                                if (!bl) break block94;
                                                                                                                if (bl7) break block91;
                                                                                                                this.r.t = object2;
                                                                                                                bl7 = true;
                                                                                                            }
                                                                                                            n11 = bl7 ? 1 : 0;
                                                                                                        }
                                                                                                        if (bl) break block95;
                                                                                                    }
                                                                                                    n10 = this.G;
                                                                                                    n12 = YB.l;
                                                                                                }
                                                                                                if (!bl) break block96;
                                                                                                if (n10 != n12) break block97;
                                                                                                try {
                                                                                                    km_04 = (km_0)this.r.q.V();
                                                                                                }
                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                }
                                                                                                km_02 = km_04;
                                                                                                n13 = km_02.getSelectedRow();
                                                                                                if (n13 <= -1) break block98;
                                                                                                try {
                                                                                                    kl_23 = (kl_2)this.r.q.T();
                                                                                                }
                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                }
                                                                                                serializable2 = kl_23;
                                                                                                try {
                                                                                                    object7 = km_02.L(n13);
                                                                                                }
                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                }
                                                                                                object2 = object7;
                                                                                                bl6 = object2.getClass().equals(tf_2.class);
                                                                                                if (!bl) break block99;
                                                                                                if (!bl6) break block100;
                                                                                                try {
                                                                                                    object6 = km_02.L(n13);
                                                                                                }
                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                }
                                                                                                serializable = (tf_2)object6;
                                                                                                try {
                                                                                                    string5 = (String)serializable.k();
                                                                                                }
                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                }
                                                                                                string2 = string5;
                                                                                                file = new File(string2);
                                                                                                if (file.exists()) {
                                                                                                    try {
                                                                                                        a32.j((Object)string2, true, true);
                                                                                                    }
                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                    }
                                                                                                }
                                                                                                if (bl) break block98;
                                                                                            }
                                                                                            object5 = object2.getClass();
                                                                                            if (!bl) break block101;
                                                                                            bl6 = object5.equals(ck_2.class);
                                                                                        }
                                                                                        if (bl6) {
                                                                                            try {
                                                                                                object5 = km_02.L(n13);
                                                                                            }
                                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                                throw invocationTargetException.getTargetException();
                                                                                            }
                                                                                        }
                                                                                        break block98;
                                                                                    }
                                                                                    serializable = (ck_2)object5;
                                                                                    try {
                                                                                        string4 = (String)serializable.d();
                                                                                    }
                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                        throw invocationTargetException.getTargetException();
                                                                                    }
                                                                                    string2 = string4;
                                                                                    file = new File(string2);
                                                                                    bl5 = file.exists();
                                                                                    if (!bl) break block102;
                                                                                    if (!bl5) break block98;
                                                                                    this.r.t = string2;
                                                                                    bl5 = true;
                                                                                }
                                                                                n11 = bl5 ? 1 : 0;
                                                                            }
                                                                            if (bl) break block95;
                                                                        }
                                                                        n10 = this.G;
                                                                        n12 = YB.j;
                                                                    }
                                                                    if (!bl) break block103;
                                                                    if (n10 != n12) break block104;
                                                                    try {
                                                                        km_03 = (km_0)this.r.q.V();
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    km_02 = km_03;
                                                                    n13 = km_02.getSelectedRow();
                                                                    if (n13 <= -1) break block105;
                                                                    try {
                                                                        kl_22 = (kl_2)this.r.q.T();
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    serializable2 = kl_22;
                                                                    try {
                                                                        object4 = km_02.L(n13);
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    object2 = object4;
                                                                    bl3 = object2.getClass().equals(tf_2.class);
                                                                    if (!bl) break block106;
                                                                    if (!bl3) break block107;
                                                                    try {
                                                                        object3 = km_02.L(n13);
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    serializable = (tf_2)object3;
                                                                    try {
                                                                        string3 = (String)serializable.k();
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                    string2 = string3;
                                                                    file = new File(string2);
                                                                    bl4 = file.exists();
                                                                    if (!bl) break block108;
                                                                    if (bl4) {
                                                                        try {
                                                                            bl4 = (Boolean)vk_0.g();
                                                                        }
                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                            throw invocationTargetException.getTargetException();
                                                                        }
                                                                    }
                                                                    break block109;
                                                                }
                                                                if (!bl) break block110;
                                                                if (bl4) {
                                                                    try {
                                                                        bl4 = (Boolean)lk_0.C(file);
                                                                    }
                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                        throw invocationTargetException.getTargetException();
                                                                    }
                                                                }
                                                                break block111;
                                                            }
                                                            if (!bl) break block112;
                                                            if (!bl4) break block113;
                                                            this.r.t = string2;
                                                            bl4 = true;
                                                        }
                                                        n11 = bl4 ? 1 : 0;
                                                        if (bl) break block109;
                                                    }
                                                    try {
                                                        a32.j((Object)string2, true, true);
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    if (bl) break block109;
                                                }
                                                try {
                                                    a32.j((Object)string2, true, true);
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                            }
                                            if (bl) break block105;
                                        }
                                        object = object2.getClass();
                                        if (!bl) break block114;
                                        bl3 = object.equals(ck_2.class);
                                    }
                                    if (bl3) {
                                        try {
                                            object = km_02.L(n13);
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                    }
                                    break block105;
                                }
                                serializable = (ck_2)object;
                                try {
                                    string = (String)serializable.d();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                string2 = string;
                                file = new File(string2);
                                bl2 = file.exists();
                                if (!bl) break block115;
                                if (!bl2) break block105;
                                this.r.t = string2;
                                bl2 = true;
                            }
                            n11 = bl2 ? 1 : 0;
                        }
                        if (bl) break block95;
                    }
                    n10 = this.G;
                    if (!bl) break block116;
                    n12 = YB.g;
                }
                if (n10 == n12) {
                    try {
                        this.r.j();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
            }
            n10 = n11;
        }
        if (n10 != 0) {
            this.r.N = YB.O;
            ((YB)this.r).setVisible(false);
        }
    }
}

