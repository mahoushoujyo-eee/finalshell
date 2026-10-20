/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Jt
 */
class jt_0
implements MouseListener {
    final int Q;
    final YB s;

    jt_0(YB yB, int n10) {
        this.s = yB;
        this.Q = n10;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void mouseReleased(MouseEvent var1_1) {
        block36: {
            block38: {
                block39: {
                    block40: {
                        block41: {
                            block43: {
                                block42: {
                                    block37: {
                                        block35: {
                                            var2_2 = F6.i();
                                            v0 = var1_1.getClickCount();
                                            v1 = 2;
                                            if (!var2_2) break block35;
                                            if (v0 != v1) break block36;
                                            v0 = var1_1.getButton();
                                            v1 = 1;
                                        }
                                        if (!var2_2) break block37;
                                        if (v0 != v1) break block36;
                                        v2 = this;
                                        if (!var2_2) break block38;
                                        v0 = v2.Q;
                                        v1 = YB.g;
                                    }
                                    if (v0 == v1) break block39;
                                    var3_3 = ((km_0)this.s.A).getSelectedRow();
                                    if (var3_3 <= -1) break block40;
                                    try {
                                        v3 = this.s.A.L(var3_3);
                                    }
                                    catch (InvocationTargetException v4) {
                                        throw v4.getTargetException();
                                    }
                                    var4_4 = v3;
                                    v5 = var4_4.getClass().equals(ck_2.class);
                                    if (!var2_2) ** GOTO lbl58
                                    if (!v5) break block41;
                                    try {
                                        v6 = this.s.A.L(var3_3);
                                    }
                                    catch (InvocationTargetException v7) {
                                        throw v7.getTargetException();
                                    }
                                    var5_5 /* !! */  = (ck_2)v6;
                                    try {
                                        v8 = (String)var5_5 /* !! */.d();
                                    }
                                    catch (InvocationTargetException v9) {
                                        throw v9.getTargetException();
                                    }
                                    var6_6 = v8;
                                    var7_7 = new File(var6_6);
                                    if (!var2_2) break block42;
                                    if (!var7_7.exists()) break block43;
                                    this.s.t = var6_6;
                                    this.s.N = YB.O;
                                }
                                ((YB)this.s).setVisible(false);
                            }
                            if (var2_2) break block40;
                        }
                        v10 = var4_4.getClass();
                        if (var2_2) {
                            v5 = v10.equals(tf_2.class);
lbl58:
                            // 2 sources

                            if (v5) {
                                try {
                                    v10 = this.s.A.L(var3_3);
                                }
                                catch (InvocationTargetException v11) {
                                    throw v11.getTargetException();
                                }
                            }
                        } else {
                            var5_5 /* !! */  = (tf_2)v10;
                            try {
                                v12 = (String)var5_5 /* !! */.k();
                            }
                            catch (InvocationTargetException v13) {
                                throw v13.getTargetException();
                            }
                            var6_6 = v12;
                            var7_7 = new File(var6_6);
                            try {
                                v14 = (Boolean)vk_0.g();
                            }
                            catch (InvocationTargetException v15) {
                                throw v15.getTargetException();
                            }
                            if (var2_2) {
                                if (v14) {
                                    try {
                                        v14 = (Boolean)lk_0.C(var7_7);
                                    }
                                    catch (InvocationTargetException v16) {
                                        throw v16.getTargetException();
                                    }
                                }
                            } else if (v14) {
                                this.s.t = var6_6;
                                this.s.N = YB.O;
                                ((YB)this.s).setVisible(false);
                            }
                        }
                    }
                    if (var2_2) break block36;
                }
                v2 = this;
            }
            try {
                v2.s.j();
            }
            catch (InvocationTargetException v17) {
                throw v17.getTargetException();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }
}

