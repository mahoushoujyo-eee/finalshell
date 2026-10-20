/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.H_;
import com._y_0;
import com.cs_1;
import com.ob_0;
import com.zT;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class aD {
    private final zT f;
    private final Predicate o;
    private Supplier s = aD::lambda$new$0;
    private Integer m = null;
    private boolean T = false;
    private boolean Y = false;

    public aD(@NotNull zT zT2, @NotNull Predicate predicate) {
        this.f = zT2;
        this.o = predicate;
    }

    public aD(@NotNull zT zT2) {
        this(zT2, aD::lambda$new$1);
    }

    @NotNull
    public zT l() {
        return this.f;
    }

    @Nullable
    public Integer D() {
        return this.m;
    }

    public boolean v(KeyEvent keyEvent) {
        boolean bl;
        block3: {
            Iterator iterator = this.f.j().iterator();
            int n10 = _y_0.M();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl2;
                    block4: {
                        KeyStroke keyStroke = (KeyStroke)iterator.next();
                        bl = keyStroke.equals(KeyStroke.getKeyStrokeForEvent(keyEvent));
                        if (n10 == 0) break block3;
                        if (n10 == 0) break block4;
                        if (!bl) break block5;
                        bl2 = true;
                    }
                    return bl2;
                }
                if (n10 != 0) continue;
            }
            bl = false;
        }
        return bl;
    }

    public boolean X(@Nullable KeyEvent keyEvent) {
        return (Boolean)this.s.get();
    }

    public boolean k(@Nullable KeyEvent keyEvent) {
        return this.o.test(keyEvent);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean G(@NotNull cs_1 cs_12, @NotNull KeyEvent keyEvent) {
        Iterator iterator = cs_12.n().iterator();
        int n10 = _y_0.M();
        while (iterator.hasNext()) {
            block6: {
                boolean bl;
                aD aD2;
                block5: {
                    aD2 = (aD)iterator.next();
                    boolean bl2 = aD2.v(keyEvent);
                    if (n10 == 0) return bl2;
                    if (n10 == 0) break block5;
                    if (!bl2) break block6;
                    bl = aD2.X(keyEvent);
                }
                if (n10 != 0) {
                    if (!bl) return false;
                    bl = aD2.k(keyEvent);
                }
                if (n10 == 0) return bl;
                if (!bl) return false;
                return true;
            }
            if (n10 != 0) continue;
        }
        cs_1 cs_13 = cs_12.c();
        if (n10 == 0) return aD.G(cs_13, keyEvent);
        if (cs_13 == null) return false;
        cs_13 = cs_12.c();
        return aD.G(cs_13, keyEvent);
    }

    @NotNull
    public String X() {
        return this.f.s();
    }

    public aD u(Integer n10) {
        this.m = n10;
        return this;
    }

    public aD c(@NotNull Supplier supplier) {
        this.s = supplier;
        return this;
    }

    public aD P(boolean bl) {
        this.T = bl;
        return this;
    }

    @NotNull
    private JMenuItem N() {
        JMenuItem jMenuItem = new JMenuItem(this.f.s());
        int n10 = _y_0.M();
        aD aD2 = this;
        if (n10 != 0) {
            if (aD2.m != null) {
                jMenuItem.setMnemonic(this.m);
            }
            aD2 = this;
        }
        if (!aD2.f.j().isEmpty()) {
            jMenuItem.setAccelerator((KeyStroke)this.f.j().get(0));
        }
        jMenuItem.addActionListener(this::lambda$toMenuItem$2);
        jMenuItem.setEnabled(this.X(null));
        return jMenuItem;
    }

    public boolean q() {
        return this.T;
    }

    public boolean V() {
        return this.Y;
    }

    public aD I(boolean bl) {
        this.Y = bl;
        return this;
    }

    public String toString() {
        return "'" + this.f.s() + "'";
    }

    public static void m(@NotNull JPopupMenu jPopupMenu, @NotNull cs_1 cs_12) {
        aD.r(cs_12, new H_(jPopupMenu));
    }

    public static void r(@NotNull cs_1 cs_12, @NotNull ob_0 ob_02) {
        List list = aD.k(cs_12);
        boolean bl = true;
        int n10 = _y_0.y();
        Iterator iterator = list.iterator();
        block0: while (true) {
            boolean bl2 = iterator.hasNext();
            block1: while (bl2) {
                cs_1 cs_13 = (cs_1)iterator.next();
                boolean bl3 = bl;
                if (n10 == 0) {
                    bl3 = !bl3;
                }
                boolean bl4 = bl3;
                bl = true;
                for (aD aD2 : cs_13.n()) {
                    block10: {
                        boolean bl5;
                        block11: {
                            boolean bl6;
                            block8: {
                                block9: {
                                    bl2 = aD2.V();
                                    if (n10 != 0) continue block1;
                                    if (n10 == 0) {
                                        if (bl2) continue;
                                        bl6 = bl4;
                                    }
                                    if (n10 != 0) break block8;
                                    if (bl6) break block9;
                                    bl5 = aD2.q();
                                    if (n10 != 0) break block10;
                                    if (!bl5) break block11;
                                }
                                ob_02.M();
                                bl6 = false;
                            }
                            bl4 = bl6;
                        }
                        ob_02.O(aD2);
                        bl5 = bl = false;
                    }
                    if (n10 == 0) continue;
                }
                if (n10 == 0) continue block0;
            }
            break;
        }
    }

    @NotNull
    private static List k(@NotNull cs_1 cs_12) {
        ArrayList<cs_1> arrayList;
        block2: {
            ArrayList<cs_1> arrayList2 = new ArrayList<cs_1>();
            int n10 = _y_0.y();
            for (cs_1 cs_13 = cs_12; cs_13 != null; cs_13 = cs_13.c()) {
                arrayList = arrayList2;
                if (n10 == 0) {
                    arrayList.add(0, cs_13);
                    if (n10 == 0) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    private void lambda$toMenuItem$2(ActionEvent actionEvent) {
        this.k(null);
    }

    private static boolean lambda$new$1(KeyEvent keyEvent) {
        return true;
    }

    private static Boolean lambda$new$0() {
        return true;
    }

    static JMenuItem z(aD aD2) {
        return aD2.N();
    }
}

