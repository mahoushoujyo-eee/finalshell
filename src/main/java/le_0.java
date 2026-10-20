/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/*
 * Renamed from Le
 */
class le_0
implements MouseListener {
    final JMenuItem K;
    final JMenuItem x;
    final JPopupMenu i;
    final xc_0 Y;

    le_0(xc_0 xc_02, JMenuItem jMenuItem, JMenuItem jMenuItem2, JPopupMenu jPopupMenu) {
        this.Y = xc_02;
        this.K = jMenuItem;
        this.x = jMenuItem2;
        this.i = jPopupMenu;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void mousePressed(MouseEvent var1_1) {
        block59: {
            block63: {
                block62: {
                    block61: {
                        block60: {
                            block58: {
                                block51: {
                                    block52: {
                                        block56: {
                                            block57: {
                                                block55: {
                                                    block54: {
                                                        block53: {
                                                            block49: {
                                                                block50: {
                                                                    var3_2 = 1;
                                                                    var2_3 = uo_0.k();
                                                                    var4_4 = true;
                                                                    v0 = var1_1.getButton();
                                                                    if (!var2_3) break block49;
                                                                    if (v0 == 1) break block50;
                                                                    v1 = var1_1.getButton();
                                                                    v2 = 3;
                                                                    if (!var2_3) break block51;
                                                                    if (v1 != v2) break block52;
                                                                }
                                                                v0 = ((uo_0)this.Y.M).rowAtPoint(var1_1.getPoint());
                                                            }
                                                            var5_5 = v0;
                                                            var6_6 = ((uo_0)this.Y.M).convertRowIndexToModel(var5_5);
                                                            if (var1_1.getButton() == 3) {
                                                                // empty if block
                                                            }
                                                            ((uo_0)this.Y.M).getSelectionModel().setSelectionInterval(var6_6, var6_6);
                                                            v1 = var5_5;
                                                            v2 = -1;
                                                            if (!var2_3) break block51;
                                                            if (v1 <= v2) break block52;
                                                            try {
                                                                v3 = (ArrayList)this.Y.t.O();
                                                            }
                                                            catch (InvocationTargetException v4) {
                                                                throw v4.getTargetException();
                                                            }
                                                            v5 = var7_7 = (li_1)v3.get(var6_6);
                                                            if (var2_3) {
                                                                if (v5 == null) {
                                                                    return;
                                                                }
                                                                this.Y.u = var6_6;
                                                                try {
                                                                    v6 = (Integer)var7_7.m();
                                                                }
                                                                catch (InvocationTargetException v7) {
                                                                    throw v7.getTargetException();
                                                                }
                                                                this.Y.S = v6;
                                                                v5 = var7_7;
                                                            }
                                                            try {
                                                                v8 = (u8_0)v5.P();
                                                            }
                                                            catch (InvocationTargetException v9) {
                                                                throw v9.getTargetException();
                                                            }
                                                            var8_8 = v8;
                                                            if (var1_1.getButton() != 1) ** GOTO lbl-1000
                                                            try {
                                                                v10 = (dg_1)this.Y.U.z();
                                                            }
                                                            catch (InvocationTargetException v11) {
                                                                throw v11.getTargetException();
                                                            }
                                                            var9_9 = v10;
                                                            try {
                                                                v12 = (Integer)var7_7.m();
                                                            }
                                                            catch (InvocationTargetException v13) {
                                                                throw v13.getTargetException();
                                                            }
                                                            try {
                                                                v14 = (t3_0)var9_9.z(v12);
                                                            }
                                                            catch (InvocationTargetException v15) {
                                                                throw v15.getTargetException();
                                                            }
                                                            var10_10 = v14;
                                                            if (!var2_3) break block53;
                                                            if (var10_10 != null) {
                                                                try {
                                                                    v16 = var9_9.e();
                                                                }
                                                                catch (InvocationTargetException v17) {
                                                                    throw v17.getTargetException();
                                                                }
                                                                try {
                                                                    v16.X(var10_10);
                                                                }
                                                                catch (InvocationTargetException v18) {
                                                                    throw v18.getTargetException();
                                                                }
                                                            }
                                                            ** GOTO lbl-1000
                                                        }
                                                        if (!var2_3) lbl-1000:
                                                        // 2 sources

                                                        {
                                                            v19 = var8_8;
                                                            if (var2_3) {
                                                                if (v19 != null) {
                                                                    try {
                                                                        var9_9.N(var8_8);
                                                                    }
                                                                    catch (InvocationTargetException v20) {
                                                                        throw v20.getTargetException();
                                                                    }
                                                                } else {
                                                                    ** GOTO lbl-1000
                                                                }
                                                            }
                                                        } else lbl-1000:
                                                        // 5 sources

                                                        {
                                                            v19 = var8_8;
                                                        }
                                                        try {
                                                            v21 = (String)v19.M();
                                                        }
                                                        catch (InvocationTargetException v22) {
                                                            throw v22.getTargetException();
                                                        }
                                                        if (!var2_3) break block54;
                                                        if (v21 != null) {
                                                            try {
                                                                v21 = (String)var8_8.M();
                                                            }
                                                            catch (InvocationTargetException v23) {
                                                                throw v23.getTargetException();
                                                            }
                                                        }
                                                        break block55;
                                                    }
                                                    if (!var2_3) break block56;
                                                    if (!v21.equals("")) break block57;
                                                }
                                                var4_4 = false;
                                            }
                                            try {
                                                v21 = (String)var8_8.q();
                                            }
                                            catch (InvocationTargetException v24) {
                                                throw v24.getTargetException();
                                            }
                                        }
                                        if (v21 == null) {
                                            var3_2 = 0;
                                        }
                                    }
                                    v1 = var1_1.getButton();
                                    if (!var2_3) break block58;
                                    v2 = 3;
                                }
                                if (v1 != v2) break block59;
                                v1 = var3_2;
                            }
                            if (v1 == 0) break block60;
                            ((JMenuItem)this.K).setEnabled(true);
                            if (var2_3) break block61;
                        }
                        ((JMenuItem)this.K).setEnabled(false);
                    }
                    if (!var4_4) break block62;
                    ((JMenuItem)this.x).setEnabled(true);
                    if (var2_3) break block63;
                }
                ((JMenuItem)this.x).setEnabled(false);
            }
            ((JPopupMenu)this.i).show((uo_0)this.Y.M, var1_1.getX(), var1_1.getY());
        }
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

