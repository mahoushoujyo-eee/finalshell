/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ne_2;
import com.wb_0;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import javax.swing.AbstractCellEditor;
import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableCellEditor;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class mT
extends AbstractCellEditor
implements TableCellEditor {
    Object T;
    Object w;
    a3 Y;
    F6 s;
    ne_2 L;
    wb_0 z;
    JTable F;
    private static final String a;

    public mT() {
        this.L = new ne_2();
        this.z = new wb_0();
        ((ne_2)this.L).F(0);
        ((ne_2)this.L).v((wb_0)this.z);
        ((ne_2)this.L).addFocusListener(new dk_2(this));
    }

    public void O() {
        try {
            this.y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Object getCellEditorValue() {
        block56: {
            block55: {
                block57: {
                    block52: {
                        block54: {
                            block53: {
                                block50: {
                                    block51: {
                                        var1_1 = km_0.U();
                                        v0 = (ne_2)this.L;
                                        if (var1_1 != null) break block50;
                                        try {
                                            block58: {
                                                if (v0.isFocusOwner()) break block51;
                                                break block58;
                                                catch (Exception v1) {
                                                    throw mT.a(v1);
                                                }
                                            }
                                            return this.w;
                                        }
                                        catch (Exception v2) {
                                            throw mT.a(v2);
                                        }
                                    }
                                    v0 = (ne_2)this.L;
                                }
                                var2_2 = v0.getText();
                                var3_3 = var2_2 = var2_2.trim();
                                try {
                                    v3 = this.w.getClass().equals(ck_2.class);
                                    if (var1_1 != null) break block52;
                                    if (v3) {
                                    }
                                    ** GOTO lbl87
                                }
                                catch (Exception v4) {
                                    throw mT.a(v4);
                                }
                                var4_4 /* !! */  = (ck_2)this.w;
                                try {
                                    v5 = var4_4 /* !! */.d();
                                }
                                catch (InvocationTargetException v6) {
                                    throw v6.getTargetException();
                                }
                                try {
                                    v7 = (String)lk_0.B(v5, (Object)var2_2);
                                }
                                catch (InvocationTargetException v8) {
                                    throw v8.getTargetException();
                                }
                                var5_5 = v7;
                                try {
                                    v9 = (String)var4_4 /* !! */.d();
                                }
                                catch (InvocationTargetException v10) {
                                    throw v10.getTargetException();
                                }
                                var6_6 = v9;
                                try {
                                    v11 = var6_6.equals(var5_5);
                                    if (var1_1 != null) break block53;
                                    if (v11) break block54;
                                }
                                catch (Exception v12) {
                                    throw mT.a(v12);
                                }
                                v11 = true;
                            }
                            var7_7 = v11;
                            try {
                                v13 = (Boolean)var4_4 /* !! */.M();
                            }
                            catch (InvocationTargetException v14) {
                                throw v14.getTargetException();
                            }
                            if (!v13) ** GOTO lbl76
                            try {
                                v15 = (String)var4_4 /* !! */.d();
                            }
                            catch (InvocationTargetException v16) {
                                throw v16.getTargetException();
                            }
                            var8_10 = new File(v15);
                            try {
                                var8_10.renameTo(new File(var5_5));
                                if (var1_1 == null) break block54;
lbl76:
                                // 2 sources

                                try {
                                    yt_1.F.J(new ti_1(this, var6_6, var5_5, var3_3));
                                }
                                catch (InvocationTargetException v17) {
                                    throw v17.getTargetException();
                                }
                            }
                            catch (Exception v18) {
                                throw mT.a(v18);
                            }
                        }
                        if (var1_1 == null) break block55;
lbl87:
                        // 2 sources

                        try {
                            block59: {
                                v19 = this.w.getClass();
                                if (var1_1 != null) break block56;
                                break block59;
                                catch (Exception v20) {
                                    throw mT.a(v20);
                                }
                            }
                            v3 = v19.equals(tf_2.class);
                        }
                        catch (Exception v21) {
                            throw mT.a(v21);
                        }
                    }
                    if (!v3) break block55;
                    var4_4 /* !! */  = (tf_2)this.w;
                    try {
                        v22 = var4_4 /* !! */.k();
                    }
                    catch (InvocationTargetException v23) {
                        throw v23.getTargetException();
                    }
                    try {
                        v24 = (String)lk_0.B(v22, (Object)var2_2);
                    }
                    catch (InvocationTargetException v25) {
                        throw v25.getTargetException();
                    }
                    var5_5 = v24;
                    try {
                        v26 = (String)var4_4 /* !! */.k();
                    }
                    catch (InvocationTargetException v27) {
                        throw v27.getTargetException();
                    }
                    var6_6 = v26;
                    v19 = var6_6;
                    if (var1_1 != null) break block56;
                    try {
                        block60: {
                            if (v19.equals(var5_5)) break block55;
                            break block60;
                            catch (Exception v28) {
                                throw mT.a(v28);
                            }
                        }
                        try {
                            v29 = (Boolean)var4_4 /* !! */.z();
                        }
                        catch (InvocationTargetException v30) {
                            throw v30.getTargetException();
                        }
                        if (!v29) break block57;
                    }
                    catch (Exception v31) {
                        throw mT.a(v31);
                    }
                    try {
                        v32 = (String)var4_4 /* !! */.k();
                    }
                    catch (InvocationTargetException v33) {
                        throw v33.getTargetException();
                    }
                    var7_8 = new File(v32);
                    var7_8.renameTo(new File(var5_5));
                    if (var1_1 == null) break block55;
                }
                try {
                    try {
                        yt_1.F.J(new FG(this, var6_6, var5_5, var3_3, var4_4 /* !! */ ));
                    }
                    catch (InvocationTargetException v34) {
                        throw v34.getTargetException();
                    }
                }
                catch (Exception var7_9) {
                    var7_9.printStackTrace();
                }
            }
            v19 = this.w;
        }
        return v19;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n10, int n11) {
        Serializable serializable;
        Icon icon;
        String string;
        String string2;
        block13: {
            Icon icon2;
            String string3;
            Object object2;
            block12: {
                String string4 = km_0.U();
                this.w = object;
                string2 = a;
                string = string4;
                icon = null;
                object2 = this.w.getClass();
                if (string != null) break block12;
                if (!object2.equals(ck_2.class)) break block13;
                object2 = this.w;
            }
            serializable = (ck_2)object2;
            try {
                string3 = (String)serializable.a();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            string2 = string3;
            try {
                icon2 = (Icon)lk_0.e(serializable);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            icon = icon2;
        }
        mT mT2 = this;
        if (string == null) {
            if (mT2.w.getClass().equals(tf_2.class)) {
                Icon icon3;
                String string5;
                serializable = (tf_2)this.w;
                try {
                    string5 = (String)serializable.M();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                string2 = string5;
                try {
                    icon3 = (Icon)lk_0.R(serializable);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                icon = icon3;
            }
            mT2 = this;
        }
        serializable = (ne_2)mT2.L;
        ((ne_2)this.L).setText(string2);
        BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), 2);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        icon.paintIcon(null, graphics2D, 0, 0);
        graphics2D.dispose();
        ((wb_0)this.z).H(bufferedImage);
        ((ne_2)this.L).I(0, 3, 0, 0);
        ((ne_2)this.L).d(1, 4, 0, 0);
        SwingUtilities.invokeLater(new cj_2(this));
        return serializable;
    }

    public a3 y() {
        return (a3)this.Y;
    }

    public void A(a3 a32) {
        this.Y = a32;
    }

    public F6 u() {
        return (F6)this.s;
    }

    public void K(F6 f62) {
        this.s = f62;
    }

    public void g() {
        this.T = null;
        this.w = null;
        this.Y = null;
        this.s = null;
        this.L = null;
        this.z = null;
        this.F = null;
    }

    public void y() {
        try {
            yt_1.F.W((Object)new VI(this), dd_1.y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "CV`".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 2;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 126;
                            break;
                        }
                        case 1: {
                            n17 = 107;
                            break;
                        }
                        case 2: {
                            n17 = 93;
                            break;
                        }
                        case 3: {
                            n17 = 53;
                            break;
                        }
                        case 4: {
                            n17 = 80;
                            break;
                        }
                        case 5: {
                            n17 = 86;
                            break;
                        }
                        default: {
                            n17 = 100;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

