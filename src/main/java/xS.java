/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JScrollPane;
import javax.swing.text.BadLocationException;
import org.jdesktop.swingx.JXList;

class xS
implements KeyListener {
    final boolean K;
    final FK I;
    private static final long[] a;
    private static final Integer[] b;

    xS(FK fK2, boolean bl) {
        this.I = fK2;
        this.K = bl;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        block24: {
            block22: {
                int n10;
                block23: {
                    String[] stringArray;
                    block20: {
                        block21: {
                            L1 l1;
                            block18: {
                                Object object;
                                int n11;
                                block19: {
                                    int n12;
                                    block17: {
                                        n12 = ((tq_2)this.I.s).getSelectedRow();
                                        stringArray = FK.i();
                                        l1 = null;
                                        n11 = n12;
                                        if (stringArray != null) break block17;
                                        if (n11 > -1) {
                                            try {
                                                n11 = (Integer)this.I.H.getRowCount();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                        }
                                        break block18;
                                    }
                                    if (stringArray != null) break block19;
                                    if (n11 <= 0) break block18;
                                    n11 = ((tq_2)this.I.s).convertRowIndexToModel(n12);
                                }
                                int n13 = n11;
                                try {
                                    object = this.I.H.getValueAt(n13, 0);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                l1 = (L1)object;
                            }
                            n10 = keyEvent.getKeyCode();
                            if (stringArray == null) {
                                if (n10 != xS.a(30132, 5192752616744954874L) || l1 != null) {
                                    // empty if block
                                }
                                n10 = keyEvent.getModifiers();
                            }
                            if (stringArray != null) break block20;
                            if (n10 != 0) break block21;
                            n10 = keyEvent.getKeyCode();
                            if (stringArray != null) break block20;
                            if (n10 == xS.a(12472, 440002088538533620L)) break block22;
                        }
                        n10 = keyEvent.getModifiers();
                    }
                    if (stringArray != null) break block23;
                    if (n10 != 0) break block24;
                    n10 = keyEvent.getKeyCode();
                }
                if (n10 != xS.a(9149, 6823313546869210614L)) break block24;
            }
            try {
                this.I.o();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void keyPressed(KeyEvent var1_1) {
        block298: {
            block358: {
                block343: {
                    block341: {
                        block342: {
                            block338: {
                                block339: {
                                    block340: {
                                        block335: {
                                            block337: {
                                                block336: {
                                                    block333: {
                                                        block334: {
                                                            block332: {
                                                                block320: {
                                                                    block331: {
                                                                        block329: {
                                                                            block327: {
                                                                                block330: {
                                                                                    block328: {
                                                                                        block326: {
                                                                                            block323: {
                                                                                                block325: {
                                                                                                    block324: {
                                                                                                        block321: {
                                                                                                            block322: {
                                                                                                                block318: {
                                                                                                                    block319: {
                                                                                                                        block315: {
                                                                                                                            block316: {
                                                                                                                                block317: {
                                                                                                                                    block312: {
                                                                                                                                        block313: {
                                                                                                                                            block314: {
                                                                                                                                                block310: {
                                                                                                                                                    block280: {
                                                                                                                                                        block281: {
                                                                                                                                                            block308: {
                                                                                                                                                                block309: {
                                                                                                                                                                    block303: {
                                                                                                                                                                        block307: {
                                                                                                                                                                            block305: {
                                                                                                                                                                                block306: {
                                                                                                                                                                                    block304: {
                                                                                                                                                                                        block302: {
                                                                                                                                                                                            block282: {
                                                                                                                                                                                                block283: {
                                                                                                                                                                                                    block301: {
                                                                                                                                                                                                        block300: {
                                                                                                                                                                                                            block299: {
                                                                                                                                                                                                                block294: {
                                                                                                                                                                                                                    block295: {
                                                                                                                                                                                                                        block296: {
                                                                                                                                                                                                                            block297: {
                                                                                                                                                                                                                                block355: {
                                                                                                                                                                                                                                    block354: {
                                                                                                                                                                                                                                        block293: {
                                                                                                                                                                                                                                            block285: {
                                                                                                                                                                                                                                                block291: {
                                                                                                                                                                                                                                                    block292: {
                                                                                                                                                                                                                                                        block290: {
                                                                                                                                                                                                                                                            block351: {
                                                                                                                                                                                                                                                                block288: {
                                                                                                                                                                                                                                                                    block289: {
                                                                                                                                                                                                                                                                        block287: {
                                                                                                                                                                                                                                                                            block286: {
                                                                                                                                                                                                                                                                                block284: {
                                                                                                                                                                                                                                                                                    block347: {
                                                                                                                                                                                                                                                                                        block346: {
                                                                                                                                                                                                                                                                                            block345: {
                                                                                                                                                                                                                                                                                                block344: {
                                                                                                                                                                                                                                                                                                    var3_2 = null;
                                                                                                                                                                                                                                                                                                    v0 = FK.i();
                                                                                                                                                                                                                                                                                                    this.I.N = true;
                                                                                                                                                                                                                                                                                                    var2_3 = v0;
                                                                                                                                                                                                                                                                                                    var4_4 = 0;
                                                                                                                                                                                                                                                                                                    this.I.E = false;
                                                                                                                                                                                                                                                                                                    v1 = var1_1.getKeyCode();
                                                                                                                                                                                                                                                                                                    v2 = xS.a(31750, 5018494235787207234L);
                                                                                                                                                                                                                                                                                                    if (var2_3 != null) break block280;
                                                                                                                                                                                                                                                                                                    if (v1 != v2) break block281;
                                                                                                                                                                                                                                                                                                    break block344;
                                                                                                                                                                                                                                                                                                    catch (BadLocationException v3) {
                                                                                                                                                                                                                                                                                                        throw xS.a(v3);
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                v4 = this.K;
                                                                                                                                                                                                                                                                                                if (var2_3 != null) break block282;
                                                                                                                                                                                                                                                                                                break block345;
                                                                                                                                                                                                                                                                                                catch (BadLocationException v5) {
                                                                                                                                                                                                                                                                                                    throw xS.a(v5);
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            if (v4 != 0) break block283;
                                                                                                                                                                                                                                                                                            break block346;
                                                                                                                                                                                                                                                                                            catch (BadLocationException v6) {
                                                                                                                                                                                                                                                                                                throw xS.a(v6);
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        v7 = ((FK)this.I).isVisible();
                                                                                                                                                                                                                                                                                        if (var2_3 != null) break block284;
                                                                                                                                                                                                                                                                                        break block347;
                                                                                                                                                                                                                                                                                        catch (BadLocationException v8) {
                                                                                                                                                                                                                                                                                            throw xS.a(v8);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                        block348: {
                                                                                                                                                                                                                                                                                            if (v7 == 0) break block285;
                                                                                                                                                                                                                                                                                            break block348;
                                                                                                                                                                                                                                                                                            catch (BadLocationException v9) {
                                                                                                                                                                                                                                                                                                throw xS.a(v9);
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        v7 = ((tq_2)this.I.s).getSelectedRow();
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    catch (BadLocationException v10) {
                                                                                                                                                                                                                                                                                        throw xS.a(v10);
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                var5_5 = v7;
                                                                                                                                                                                                                                                                                v11 = var5_5;
                                                                                                                                                                                                                                                                                if (var2_3 != null) break block286;
                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                    block349: {
                                                                                                                                                                                                                                                                                        if (v11 <= -1) break block287;
                                                                                                                                                                                                                                                                                        break block349;
                                                                                                                                                                                                                                                                                        catch (BadLocationException v12) {
                                                                                                                                                                                                                                                                                            throw xS.a(v12);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    v11 = ((tq_2)this.I.s).convertRowIndexToModel(var5_5);
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                catch (BadLocationException v13) {
                                                                                                                                                                                                                                                                                    throw xS.a(v13);
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            var6_11 = v11;
                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                v14 = this.I.H.getValueAt(var6_11, 0);
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            catch (InvocationTargetException v15) {
                                                                                                                                                                                                                                                                                throw v15.getTargetException();
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            var3_2 = (L1)v14;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        var6_11 = ((tq_2)this.I.s).convertRowIndexToModel(var5_5);
                                                                                                                                                                                                                                                                        v16 = (FK)this.I;
                                                                                                                                                                                                                                                                        v17 = ((tq_2)this.I.s).getRowCount() - var6_11;
                                                                                                                                                                                                                                                                        if (var2_3 != null) break block288;
                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                            block350: {
                                                                                                                                                                                                                                                                                if (v17 >= TI.K) break block289;
                                                                                                                                                                                                                                                                                break block350;
                                                                                                                                                                                                                                                                                catch (BadLocationException v18) {
                                                                                                                                                                                                                                                                                    throw xS.a(v18);
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            v17 = true;
                                                                                                                                                                                                                                                                            break block288;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        catch (BadLocationException v19) {
                                                                                                                                                                                                                                                                            throw xS.a(v19);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    v17 = false;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                v16.E = v17;
                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                    v20 = yt_1.i();
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                catch (InvocationTargetException v21) {
                                                                                                                                                                                                                                                                    throw v21.getTargetException();
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                    v22 = v20.P();
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                catch (InvocationTargetException v23) {
                                                                                                                                                                                                                                                                    throw v23.getTargetException();
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                    v24 = ((Boolean)v22.v()).booleanValue();
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                catch (InvocationTargetException v25) {
                                                                                                                                                                                                                                                                    throw v25.getTargetException();
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                if (var2_3 != null) break block290;
                                                                                                                                                                                                                                                                if (v24 != 0) break block291;
                                                                                                                                                                                                                                                                break block351;
                                                                                                                                                                                                                                                                catch (BadLocationException v26) {
                                                                                                                                                                                                                                                                    throw xS.a(v26);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                block352: {
                                                                                                                                                                                                                                                                    v27 = (FK)this.I;
                                                                                                                                                                                                                                                                    if (var2_3 != null) break block292;
                                                                                                                                                                                                                                                                    break block352;
                                                                                                                                                                                                                                                                    catch (BadLocationException v28) {
                                                                                                                                                                                                                                                                        throw xS.a(v28);
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                v24 = ((tq_2)v27.s).getRowCount() - var6_11;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            catch (BadLocationException v29) {
                                                                                                                                                                                                                                                                throw xS.a(v29);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                            if (v24 > TI.K) {
                                                                                                                                                                                                                                                                v27 = (FK)this.I;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            break block291;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        catch (BadLocationException v30) {
                                                                                                                                                                                                                                                            throw xS.a(v30);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                        v27.o();
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    catch (InvocationTargetException v31) {
                                                                                                                                                                                                                                                        throw v31.getTargetException();
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                        lk_0.n();
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    catch (InvocationTargetException v32) {
                                                                                                                                                                                                                                                        throw v32.getTargetException();
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                if (var3_2 == null) break block285;
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                    block353: {
                                                                                                                                                                                                                                                        v33 = var5_5;
                                                                                                                                                                                                                                                        if (var2_3 != null) break block293;
                                                                                                                                                                                                                                                        break block353;
                                                                                                                                                                                                                                                        catch (BadLocationException v34) {
                                                                                                                                                                                                                                                            throw xS.a(v34);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    if (v33 <= -1) break block285;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                catch (BadLocationException v35) {
                                                                                                                                                                                                                                                    throw xS.a(v35);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                var4_4 = 1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                this.I.a = true;
                                                                                                                                                                                                                                                ((dv_0)this.I.lD).setCaretPosition(((dv_0)this.I.lD).getDocument().getLength());
                                                                                                                                                                                                                                                v36 = (FK)this.I;
                                                                                                                                                                                                                                                if (var2_3 != null) break block294;
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                    v36.o();
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                catch (InvocationTargetException v37) {
                                                                                                                                                                                                                                                    throw v37.getTargetException();
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                v33 = var4_4;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            catch (BadLocationException v38) {
                                                                                                                                                                                                                                                throw xS.a(v38);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if (v33 == 0) ** GOTO lbl292
                                                                                                                                                                                                                                        v39 = (FK)this.I;
                                                                                                                                                                                                                                        if (var2_3 != null) break block295;
                                                                                                                                                                                                                                        break block354;
                                                                                                                                                                                                                                        catch (BadLocationException v40) {
                                                                                                                                                                                                                                            throw xS.a(v40);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        v41 = (Boolean)v39.r.G();
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (InvocationTargetException v42) {
                                                                                                                                                                                                                                        throw v42.getTargetException();
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (!v41) ** GOTO lbl278
                                                                                                                                                                                                                                    break block355;
                                                                                                                                                                                                                                    catch (BadLocationException v43) {
                                                                                                                                                                                                                                        throw xS.a(v43);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    block356: {
                                                                                                                                                                                                                                        v39 = (FK)this.I;
                                                                                                                                                                                                                                        if (var2_3 != null) break block295;
                                                                                                                                                                                                                                        break block356;
                                                                                                                                                                                                                                        catch (BadLocationException v44) {
                                                                                                                                                                                                                                            throw xS.a(v44);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        v45 = (Integer)v39.r.r();
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (InvocationTargetException v46) {
                                                                                                                                                                                                                                        throw v46.getTargetException();
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (v45 > -1) {
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    ** GOTO lbl278
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                catch (BadLocationException v47) {
                                                                                                                                                                                                                                    throw xS.a(v47);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    v48 = (String)this.I.r.H();
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                catch (InvocationTargetException v49) {
                                                                                                                                                                                                                                    throw v49.getTargetException();
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                var5_6 = v48;
                                                                                                                                                                                                                                if (var5_6 == null) break block296;
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    block357: {
                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                            v50 = yt_1.i();
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        catch (InvocationTargetException v51) {
                                                                                                                                                                                                                                            throw v51.getTargetException();
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                            v52 = v50.P();
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        catch (InvocationTargetException v53) {
                                                                                                                                                                                                                                            throw v53.getTargetException();
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                            v54 = (Boolean)v52.w();
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        catch (InvocationTargetException v55) {
                                                                                                                                                                                                                                            throw v55.getTargetException();
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if (v54) break block297;
                                                                                                                                                                                                                                        break block357;
                                                                                                                                                                                                                                        catch (BadLocationException v56) {
                                                                                                                                                                                                                                            throw xS.a(v56);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        this.I.o();
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (InvocationTargetException v57) {
                                                                                                                                                                                                                                        throw v57.getTargetException();
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        lk_0.n();
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (InvocationTargetException v58) {
                                                                                                                                                                                                                                        throw v58.getTargetException();
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                catch (BadLocationException v59) {
                                                                                                                                                                                                                                    throw xS.a(v59);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            var6_12 = ((dv_0)this.I.lD).getDocument();
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                var6_12.insertString(this.I.e, var5_6, null);
                                                                                                                                                                                                                                ((dv_0)this.I.lD).setCaretPosition(this.I.e + var5_6.length());
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (BadLocationException var7_16) {
                                                                                                                                                                                                                                var7_16.printStackTrace();
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            ((dv_0)this.I.lD).requestFocus();
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            if (var2_3 == null) break block298;
lbl278:
                                                                                                                                                                                                                            // 3 sources

                                                                                                                                                                                                                            v39 = (FK)this.I;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (BadLocationException v60) {
                                                                                                                                                                                                                            throw xS.a(v60);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            v39.k(var3_2);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (InvocationTargetException v61) {
                                                                                                                                                                                                                            throw v61.getTargetException();
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (var2_3 == null) break block298;
lbl292:
                                                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                                                        v36 = (FK)this.I;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (BadLocationException v62) {
                                                                                                                                                                                                                        throw xS.a(v62);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                var5_7 = ((dv_0)v36.lD).getText().trim();
                                                                                                                                                                                                                var6_13 = ((tq_2)this.I.s).getSelectedRow();
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    v63 = var5_7.equals("");
                                                                                                                                                                                                                    if (var2_3 != null) break block299;
                                                                                                                                                                                                                    if (v63 != 0) break block298;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (BadLocationException v64) {
                                                                                                                                                                                                                    throw xS.a(v64);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                v63 = var6_13;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        if (var2_3 != null) break block300;
                                                                                                                                                                                                                        if (v63 <= -1) break block298;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (BadLocationException v65) {
                                                                                                                                                                                                                        throw xS.a(v65);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v66 = (FK)this.I;
                                                                                                                                                                                                                    if (var2_3 != null) break block301;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (BadLocationException v67) {
                                                                                                                                                                                                                    throw xS.a(v67);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                v63 = (int)v66.lx;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (BadLocationException v68) {
                                                                                                                                                                                                                throw xS.a(v68);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            if (v63 == 0) break block298;
                                                                                                                                                                                                            v66 = (FK)this.I;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (BadLocationException v69) {
                                                                                                                                                                                                            throw xS.a(v69);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    ((dv_0)v66.lD).setText("");
                                                                                                                                                                                                    break block298;
                                                                                                                                                                                                }
                                                                                                                                                                                                v4 = ((FK)this.I).isVisible();
                                                                                                                                                                                            }
                                                                                                                                                                                            try {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    if (var2_3 != null) break block302;
                                                                                                                                                                                                    if (v4 == 0) break block303;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (BadLocationException v70) {
                                                                                                                                                                                                    throw xS.a(v70);
                                                                                                                                                                                                }
                                                                                                                                                                                                v4 = ((JXList)this.I.l1).getSelectedIndex();
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (BadLocationException v71) {
                                                                                                                                                                                                throw xS.a(v71);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        var5_8 = v4;
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                v72 = var5_8;
                                                                                                                                                                                                if (var2_3 != null) break block304;
                                                                                                                                                                                                if (v72 > -1) {
                                                                                                                                                                                                }
                                                                                                                                                                                                break block305;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (BadLocationException v73) {
                                                                                                                                                                                                throw xS.a(v73);
                                                                                                                                                                                            }
                                                                                                                                                                                            try {
                                                                                                                                                                                                v72 = (Integer)this.I.v.getSize();
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (InvocationTargetException v74) {
                                                                                                                                                                                                throw v74.getTargetException();
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (BadLocationException v75) {
                                                                                                                                                                                            throw xS.a(v75);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            if (var2_3 != null) break block306;
                                                                                                                                                                                            if (v72 <= 0) break block305;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (BadLocationException v76) {
                                                                                                                                                                                            throw xS.a(v76);
                                                                                                                                                                                        }
                                                                                                                                                                                        v72 = ((JXList)this.I.l1).convertIndexToModel(var5_8);
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (BadLocationException v77) {
                                                                                                                                                                                        throw xS.a(v77);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                var6_14 = v72;
                                                                                                                                                                                try {
                                                                                                                                                                                    v78 = (L1)this.I.v.Z(var6_14);
                                                                                                                                                                                }
                                                                                                                                                                                catch (InvocationTargetException v79) {
                                                                                                                                                                                    throw v79.getTargetException();
                                                                                                                                                                                }
                                                                                                                                                                                var3_2 = v78;
                                                                                                                                                                            }
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        if (var3_2 == null) break block303;
                                                                                                                                                                                        v80 = var5_8;
                                                                                                                                                                                        if (var2_3 != null) break block307;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (BadLocationException v81) {
                                                                                                                                                                                        throw xS.a(v81);
                                                                                                                                                                                    }
                                                                                                                                                                                    if (v80 <= -1) break block303;
                                                                                                                                                                                }
                                                                                                                                                                                catch (BadLocationException v82) {
                                                                                                                                                                                    throw xS.a(v82);
                                                                                                                                                                                }
                                                                                                                                                                                v80 = 1;
                                                                                                                                                                            }
                                                                                                                                                                            catch (BadLocationException v83) {
                                                                                                                                                                                throw xS.a(v83);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        var4_4 = v80;
                                                                                                                                                                    }
                                                                                                                                                                    this.I.a = true;
                                                                                                                                                                    var5_9 = ((dv_0)this.I.Z).getText();
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                v84 = ((Boolean)lk_0.Y(var5_9)).booleanValue();
                                                                                                                                                                            }
                                                                                                                                                                            catch (InvocationTargetException v85) {
                                                                                                                                                                                throw v85.getTargetException();
                                                                                                                                                                            }
                                                                                                                                                                            if (var2_3 != null) break block308;
                                                                                                                                                                            if (v84 != 0) break block309;
                                                                                                                                                                        }
                                                                                                                                                                        catch (BadLocationException v86) {
                                                                                                                                                                            throw xS.a(v86);
                                                                                                                                                                        }
                                                                                                                                                                        ((dv_0)this.I.lD).setCaretPosition(((dv_0)this.I.lD).getDocument().getLength());
                                                                                                                                                                    }
                                                                                                                                                                    catch (BadLocationException v87) {
                                                                                                                                                                        throw xS.a(v87);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                v84 = var4_4;
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    if (v84 == 0) ** GOTO lbl445
                                                                                                                                                                    try {
                                                                                                                                                                        this.I.k(var3_2);
                                                                                                                                                                    }
                                                                                                                                                                    catch (InvocationTargetException v88) {
                                                                                                                                                                        throw v88.getTargetException();
                                                                                                                                                                    }
                                                                                                                                                                    if (var2_3 == null) ** GOTO lbl923
                                                                                                                                                                }
                                                                                                                                                                catch (BadLocationException v89) {
                                                                                                                                                                    throw xS.a(v89);
                                                                                                                                                                }
lbl445:
                                                                                                                                                                // 2 sources

                                                                                                                                                                try {
                                                                                                                                                                    this.I.M();
                                                                                                                                                                }
                                                                                                                                                                catch (InvocationTargetException v90) {
                                                                                                                                                                    throw v90.getTargetException();
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            catch (BadLocationException v91) {
                                                                                                                                                                throw xS.a(v91);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        v1 = var1_1.getKeyCode();
                                                                                                                                                        v2 = xS.a(20226, 1188350688712233287L);
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        block311: {
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    if (var2_3 != null) break block310;
                                                                                                                                                                    if (v1 == v2) {
                                                                                                                                                                    }
                                                                                                                                                                    break block311;
                                                                                                                                                                }
                                                                                                                                                                catch (BadLocationException v92) {
                                                                                                                                                                    throw xS.a(v92);
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    this.I.o();
                                                                                                                                                                }
                                                                                                                                                                catch (InvocationTargetException v93) {
                                                                                                                                                                    throw v93.getTargetException();
                                                                                                                                                                }
                                                                                                                                                                if (var2_3 == null) break block298;
                                                                                                                                                            }
                                                                                                                                                            catch (BadLocationException v94) {
                                                                                                                                                                throw xS.a(v94);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        v1 = var1_1.getKeyCode();
                                                                                                                                                        v2 = xS.a(16788, 3608317187452346329L);
                                                                                                                                                    }
                                                                                                                                                    catch (BadLocationException v95) {
                                                                                                                                                        throw xS.a(v95);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                if (var2_3 != null) break block312;
                                                                                                                                                                if (v1 == v2) {
                                                                                                                                                                }
                                                                                                                                                                ** GOTO lbl528
                                                                                                                                                            }
                                                                                                                                                            catch (BadLocationException v96) {
                                                                                                                                                                throw xS.a(v96);
                                                                                                                                                            }
                                                                                                                                                            v97 = ((FK)this.I).isVisible();
                                                                                                                                                            if (var2_3 != null) break block313;
                                                                                                                                                        }
                                                                                                                                                        catch (BadLocationException v98) {
                                                                                                                                                            throw xS.a(v98);
                                                                                                                                                        }
                                                                                                                                                        if (v97 == 0) {
                                                                                                                                                        }
                                                                                                                                                        break block314;
                                                                                                                                                    }
                                                                                                                                                    catch (BadLocationException v99) {
                                                                                                                                                        throw xS.a(v99);
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        this.I.Z();
                                                                                                                                                    }
                                                                                                                                                    catch (InvocationTargetException v100) {
                                                                                                                                                        throw v100.getTargetException();
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                catch (BadLocationException v101) {
                                                                                                                                                    throw xS.a(v101);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            v97 = var1_1.getModifiers();
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                if (v97 != 0) break block298;
                                                                                                                                                try {
                                                                                                                                                    this.I.f();
                                                                                                                                                }
                                                                                                                                                catch (InvocationTargetException v102) {
                                                                                                                                                    throw v102.getTargetException();
                                                                                                                                                }
                                                                                                                                                if (var2_3 == null) break block298;
                                                                                                                                            }
                                                                                                                                            catch (BadLocationException v103) {
                                                                                                                                                throw xS.a(v103);
                                                                                                                                            }
lbl528:
                                                                                                                                            // 2 sources

                                                                                                                                            v1 = var1_1.getKeyCode();
                                                                                                                                            v2 = xS.a(28805, 1492044526203317967L);
                                                                                                                                        }
                                                                                                                                        catch (BadLocationException v104) {
                                                                                                                                            throw xS.a(v104);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            if (var2_3 != null) break block315;
                                                                                                                                                            if (v1 == v2) {
                                                                                                                                                            }
                                                                                                                                                            ** GOTO lbl604
                                                                                                                                                        }
                                                                                                                                                        catch (BadLocationException v105) {
                                                                                                                                                            throw xS.a(v105);
                                                                                                                                                        }
                                                                                                                                                        v106 = (FK)this.I;
                                                                                                                                                        if (var2_3 == null) {
                                                                                                                                                        }
                                                                                                                                                        break block316;
                                                                                                                                                    }
                                                                                                                                                    catch (BadLocationException v107) {
                                                                                                                                                        throw xS.a(v107);
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        v108 = (Boolean)v106.x();
                                                                                                                                                    }
                                                                                                                                                    catch (InvocationTargetException v109) {
                                                                                                                                                        throw v109.getTargetException();
                                                                                                                                                    }
                                                                                                                                                    if (!v108) {
                                                                                                                                                    }
                                                                                                                                                    ** GOTO lbl590
                                                                                                                                                }
                                                                                                                                                catch (BadLocationException v110) {
                                                                                                                                                    throw xS.a(v110);
                                                                                                                                                }
                                                                                                                                                v111 = ((FK)this.I).isVisible();
                                                                                                                                                if (var2_3 != null) break block317;
                                                                                                                                            }
                                                                                                                                            catch (BadLocationException v112) {
                                                                                                                                                throw xS.a(v112);
                                                                                                                                            }
                                                                                                                                            if (v111 == 0) break block298;
                                                                                                                                        }
                                                                                                                                        catch (BadLocationException v113) {
                                                                                                                                            throw xS.a(v113);
                                                                                                                                        }
                                                                                                                                        v111 = var1_1.getModifiers();
                                                                                                                                    }
                                                                                                                                    catch (BadLocationException v114) {
                                                                                                                                        throw xS.a(v114);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        if (v111 != 0) break block298;
                                                                                                                                        try {
                                                                                                                                            this.I.Y();
                                                                                                                                        }
                                                                                                                                        catch (InvocationTargetException v115) {
                                                                                                                                            throw v115.getTargetException();
                                                                                                                                        }
                                                                                                                                        if (var2_3 == null) break block298;
                                                                                                                                    }
                                                                                                                                    catch (BadLocationException v116) {
                                                                                                                                        throw xS.a(v116);
                                                                                                                                    }
lbl590:
                                                                                                                                    // 2 sources

                                                                                                                                    v106 = (FK)this.I;
                                                                                                                                }
                                                                                                                                catch (BadLocationException v117) {
                                                                                                                                    throw xS.a(v117);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v106.Y();
                                                                                                                                }
                                                                                                                                catch (InvocationTargetException v118) {
                                                                                                                                    throw v118.getTargetException();
                                                                                                                                }
                                                                                                                                if (var2_3 == null) break block298;
lbl604:
                                                                                                                                // 2 sources

                                                                                                                                v1 = var1_1.getKeyCode();
                                                                                                                                v2 = xS.a(15874, 1362405595735351370L);
                                                                                                                            }
                                                                                                                            catch (BadLocationException v119) {
                                                                                                                                throw xS.a(v119);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (var2_3 != null) break block318;
                                                                                                                            if (v1 != v2) break block319;
                                                                                                                            break block298;
                                                                                                                        }
                                                                                                                        catch (BadLocationException v120) {
                                                                                                                            throw xS.a(v120);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v1 = var1_1.getKeyCode();
                                                                                                                    v2 = xS.a(11439, 6713159034709308134L);
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (var2_3 != null) break block320;
                                                                                                                            if (v1 == v2) {
                                                                                                                            }
                                                                                                                            ** GOTO lbl776
                                                                                                                        }
                                                                                                                        catch (BadLocationException v121) {
                                                                                                                            throw xS.a(v121);
                                                                                                                        }
                                                                                                                        v122 = var1_1.getModifiers();
                                                                                                                        if (var2_3 != null) break block321;
                                                                                                                    }
                                                                                                                    catch (BadLocationException v123) {
                                                                                                                        throw xS.a(v123);
                                                                                                                    }
                                                                                                                    if (v122 == 0) break block322;
                                                                                                                }
                                                                                                                catch (BadLocationException v124) {
                                                                                                                    throw xS.a(v124);
                                                                                                                }
                                                                                                                return;
                                                                                                            }
                                                                                                            v122 = (int)this.K;
                                                                                                        }
                                                                                                        try {
                                                                                                            if (var2_3 != null) break block323;
                                                                                                            if (v122 == 0) {
                                                                                                            }
                                                                                                            ** GOTO lbl671
                                                                                                        }
                                                                                                        catch (BadLocationException v125) {
                                                                                                            throw xS.a(v125);
                                                                                                        }
                                                                                                        var5_10 = ((tq_2)this.I.s).getSelectedRow();
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (var2_3 != null) break block324;
                                                                                                                if (var5_10 > -1) {
                                                                                                                }
                                                                                                                break block325;
                                                                                                            }
                                                                                                            catch (BadLocationException v126) {
                                                                                                                throw xS.a(v126);
                                                                                                            }
                                                                                                            try {
                                                                                                                this.I.r.x();
                                                                                                            }
                                                                                                            catch (InvocationTargetException v127) {
                                                                                                                throw v127.getTargetException();
                                                                                                            }
                                                                                                        }
                                                                                                        catch (BadLocationException v128) {
                                                                                                            throw xS.a(v128);
                                                                                                        }
                                                                                                    }
                                                                                                    ((FT)this.I.H).fireTableRowsUpdated(var5_10, var5_10);
                                                                                                }
                                                                                                try {
                                                                                                    if (var2_3 == null) break block298;
lbl671:
                                                                                                    // 2 sources

                                                                                                    v122 = ((JXList)this.I.l1).locationToIndex(new Point(((JXList)c.c((long)369475678680292668L).get((Object)c.c((long)385041577063464455L).get((Object)this))).getVisibleRect().x, ((JXList)c.c((long)369475678680292668L).get((Object)c.c((long)385041577063464455L).get((Object)this))).getVisibleRect().y));
                                                                                                }
                                                                                                catch (BadLocationException v129) {
                                                                                                    throw xS.a(v129);
                                                                                                }
                                                                                            }
                                                                                            var5_10 = v122;
                                                                                            var5_10 = ((JXList)this.I.l1).getSelectedIndex();
                                                                                            var6_15 = 0;
                                                                                            try {
                                                                                                try {
                                                                                                    v130 = var5_10;
                                                                                                    v131 = -1;
                                                                                                    if (var2_3 != null) break block326;
                                                                                                    if (v130 > v131) {
                                                                                                    }
                                                                                                    ** GOTO lbl768
                                                                                                }
                                                                                                catch (BadLocationException v132) {
                                                                                                    throw xS.a(v132);
                                                                                                }
                                                                                                v130 = var5_10;
                                                                                                v131 = (this.I.J - 2) * this.I.lI;
                                                                                            }
                                                                                            catch (BadLocationException v133) {
                                                                                                throw xS.a(v133);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (var2_3 != null) break block327;
                                                                                                    if (v130 >= v131) {
                                                                                                    }
                                                                                                    ** GOTO lbl747
                                                                                                }
                                                                                                catch (BadLocationException v134) {
                                                                                                    throw xS.a(v134);
                                                                                                }
                                                                                                v135 = var5_10;
                                                                                                v136 = (this.I.J - 1) * this.I.lI;
                                                                                                if (var2_3 != null) break block328;
                                                                                            }
                                                                                            catch (BadLocationException v137) {
                                                                                                throw xS.a(v137);
                                                                                            }
                                                                                            if (v135 >= v136) {
                                                                                            }
                                                                                            ** GOTO lbl718
                                                                                        }
                                                                                        catch (BadLocationException v138) {
                                                                                            throw xS.a(v138);
                                                                                        }
                                                                                        var6_15 = (var5_10 + 1) % this.I.lI;
                                                                                        try {
                                                                                            if (var2_3 == null) break block329;
lbl718:
                                                                                            // 2 sources

                                                                                            v135 = var5_10 + this.I.lI;
                                                                                            try {
                                                                                                v136 = (Integer)this.I.v.getSize();
                                                                                            }
                                                                                            catch (InvocationTargetException v139) {
                                                                                                throw v139.getTargetException();
                                                                                            }
                                                                                        }
                                                                                        catch (BadLocationException v140) {
                                                                                            throw xS.a(v140);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        if (var2_3 != null) break block330;
                                                                                        if (v135 < v136) {
                                                                                        }
                                                                                        ** GOTO lbl738
                                                                                    }
                                                                                    catch (BadLocationException v141) {
                                                                                        throw xS.a(v141);
                                                                                    }
                                                                                    var6_15 = var5_10 + this.I.lI;
                                                                                    try {
                                                                                        if (var2_3 == null) break block329;
lbl738:
                                                                                        // 2 sources

                                                                                        v135 = var5_10 + 1;
                                                                                        v136 = this.I.lI;
                                                                                    }
                                                                                    catch (BadLocationException v142) {
                                                                                        throw xS.a(v142);
                                                                                    }
                                                                                }
                                                                                var6_15 = v135 % v136;
                                                                                try {
                                                                                    if (var2_3 == null) break block329;
lbl747:
                                                                                    // 2 sources

                                                                                    v130 = var5_10;
                                                                                    v131 = this.I.l2;
                                                                                }
                                                                                catch (BadLocationException v143) {
                                                                                    throw xS.a(v143);
                                                                                }
                                                                            }
                                                                            var6_15 = v130 + v131;
                                                                        }
                                                                        try {
                                                                            v144 = (Integer)this.I.v.getSize();
                                                                        }
                                                                        catch (InvocationTargetException v145) {
                                                                            throw v145.getTargetException();
                                                                        }
                                                                        if (var6_15 >= v144) break block331;
                                                                        var7_17 = ((JXList)this.I.l1).getCellBounds(var6_15, var6_15);
                                                                        try {
                                                                            ((JXList)this.I.l1).setSelectedIndex(var6_15);
                                                                            ((JXList)this.I.l1).scrollRectToVisible(var7_17);
                                                                            ((JScrollPane)this.I.W).scrollRectToVisible(var7_17);
                                                                            if (var2_3 == null) break block331;
lbl768:
                                                                            // 2 sources

                                                                            ((JXList)this.I.l1).setSelectedIndex(0);
                                                                        }
                                                                        catch (BadLocationException v146) {
                                                                            throw xS.a(v146);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (var2_3 == null) break block298;
lbl776:
                                                                            // 2 sources

                                                                            v1 = var1_1.getKeyCode();
                                                                            if (var2_3 != null) break block332;
                                                                        }
                                                                        catch (BadLocationException v147) {
                                                                            throw xS.a(v147);
                                                                        }
                                                                        v2 = xS.a(32082, 562566081126081309L);
                                                                    }
                                                                    catch (BadLocationException v148) {
                                                                        throw xS.a(v148);
                                                                    }
                                                                }
                                                                try {
                                                                    if (v1 != v2) break block298;
                                                                    v1 = var1_1.getModifiers();
                                                                }
                                                                catch (BadLocationException v149) {
                                                                    throw xS.a(v149);
                                                                }
                                                            }
                                                            try {
                                                                if (var2_3 != null) break block333;
                                                                if (v1 == 0) break block334;
                                                            }
                                                            catch (BadLocationException v150) {
                                                                throw xS.a(v150);
                                                            }
                                                            return;
                                                        }
                                                        v1 = (int)this.K;
                                                    }
                                                    try {
                                                        if (var2_3 != null) break block335;
                                                        if (v1 == 0) {
                                                        }
                                                        ** GOTO lbl832
                                                    }
                                                    catch (BadLocationException v151) {
                                                        throw xS.a(v151);
                                                    }
                                                    var5_10 = ((tq_2)this.I.s).getSelectedRow();
                                                    try {
                                                        try {
                                                            if (var2_3 != null) break block336;
                                                            if (var5_10 > -1) {
                                                            }
                                                            break block337;
                                                        }
                                                        catch (BadLocationException v152) {
                                                            throw xS.a(v152);
                                                        }
                                                        try {
                                                            this.I.r.j();
                                                        }
                                                        catch (InvocationTargetException v153) {
                                                            throw v153.getTargetException();
                                                        }
                                                    }
                                                    catch (BadLocationException v154) {
                                                        throw xS.a(v154);
                                                    }
                                                }
                                                ((FT)this.I.H).fireTableRowsUpdated(var5_10, var5_10);
                                            }
                                            try {
                                                if (var2_3 == null) break block298;
lbl832:
                                                // 2 sources

                                                v1 = ((JXList)this.I.l1).locationToIndex(new Point(((JXList)c.c((long)369475678680292668L).get((Object)c.c((long)385041577063464455L).get((Object)this))).getVisibleRect().x, ((JXList)c.c((long)369475678680292668L).get((Object)c.c((long)385041577063464455L).get((Object)this))).getVisibleRect().y));
                                            }
                                            catch (BadLocationException v155) {
                                                throw xS.a(v155);
                                            }
                                        }
                                        var5_10 = v1;
                                        v156 = (JXList)this.I.l1;
                                        if (var2_3 != null) break block358;
                                        var5_10 = v156.getSelectedIndex();
                                        if (var5_10 <= -1) ** GOTO lbl916
                                        var6_15 = 0;
                                        try {
                                            v157 = var5_10;
                                            v158 = this.I.lI;
                                            if (var2_3 != null) break block338;
                                            if (v157 < v158) {
                                            }
                                            ** GOTO lbl897
                                        }
                                        catch (BadLocationException v159) {
                                            throw xS.a(v159);
                                        }
                                        var6_15 = (this.I.J - 1) * this.I.l2 + var5_10 - 1;
                                        try {
                                            v160 = var6_15;
                                            if (var2_3 != null) break block339;
                                            try {
                                                v161 = (Integer)this.I.v.getSize();
                                            }
                                            catch (InvocationTargetException v162) {
                                                throw v162.getTargetException();
                                            }
                                            if (v160 < v161) break block340;
                                        }
                                        catch (BadLocationException v163) {
                                            throw xS.a(v163);
                                        }
                                        var6_15 = (this.I.J - 2) * this.I.l2 + var5_10 - 1;
                                    }
                                    v160 = var5_10;
                                }
                                try {
                                    try {
                                        try {
                                            if (var2_3 != null) break block341;
                                            if (v160 != 0) break block342;
                                        }
                                        catch (BadLocationException v164) {
                                            throw xS.a(v164);
                                        }
                                        v160 = this.I.J;
                                        v165 = 1;
                                        if (var2_3 != null) break block343;
                                    }
                                    catch (BadLocationException v166) {
                                        throw xS.a(v166);
                                    }
                                    if (v160 == v165) {
                                    }
                                    break block342;
                                }
                                catch (BadLocationException v167) {
                                    throw xS.a(v167);
                                }
                                try {
                                    v168 = (Integer)this.I.v.getSize();
                                }
                                catch (InvocationTargetException v169) {
                                    throw v169.getTargetException();
                                }
                                var6_15 = v168 - 1;
                                try {
                                    if (var2_3 == null) break block342;
lbl897:
                                    // 2 sources

                                    v157 = var5_10;
                                    v158 = this.I.l2;
                                }
                                catch (BadLocationException v170) {
                                    throw xS.a(v170);
                                }
                            }
                            var6_15 = v157 - v158;
                        }
                        v160 = var6_15;
                    }
                    v165 = -1;
                }
                if (v160 > v165) {
                    var7_17 = ((JXList)this.I.l1).getCellBounds(var6_15, var6_15);
                    ((JXList)this.I.l1).setSelectedIndex(var6_15);
                    ((JXList)this.I.l1).scrollRectToVisible(var7_17);
                    ((JScrollPane)this.I.W).scrollRectToVisible(var7_17);
                }
                try {
                    if (var2_3 == null) break block298;
lbl916:
                    // 2 sources

                    v156 = (JXList)this.I.l1;
                }
                catch (BadLocationException v171) {
                    throw xS.a(v171);
                }
            }
            v156.setSelectedIndex(0);
        }
        try {
            this.I.u(var1_1);
        }
        catch (InvocationTargetException v172) {
            throw v172.getTargetException();
        }
    }

    private static BadLocationException a(BadLocationException badLocationException) {
        return badLocationException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3882419036546259550L;
                var6_1 = new long[10];
                var3_2 = 0;
                var4_3 = "\u0004\u00e3\u0013\u00fbu\u0085E\u00a1l\u00000\u001cMI4\u00b8]r\u00e5\u001f\u00f2\u00b9\u00f9f\u009d\u00d6\u0080*!\u001d\u00f1\u00b4>\u00a9j\u00ea6\u0000\u00a8\u009f\u000f>\u00f0:\u00f3B\u00ba\u001d\u0082t\u00ffi\u00ce\u00b2'\u00a1\u00a8\u00dc\u00a7\u00bbS\u00e7\u00f4\u00b9";
                var5_4 = "\u0004\u00e3\u0013\u00fbu\u0085E\u00a1l\u00000\u001cMI4\u00b8]r\u00e5\u001f\u00f2\u00b9\u00f9f\u009d\u00d6\u0080*!\u001d\u00f1\u00b4>\u00a9j\u00ea6\u0000\u00a8\u009f\u000f>\u00f0:\u00f3B\u00ba\u001d\u0082t\u00ffi\u00ce\u00b2'\u00a1\u00a8\u00dc\u00a7\u00bbS\u00e7\u00f4\u00b9".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u008b,\u00c3\u0012\u008b\u00c5K\u0002\u0010\u009b\u000e\u00e5!\u00fc\u00f8\u0016";
                    var5_4 = "\u008b,\u00c3\u0012\u008b\u00c5K\u0002\u0010\u009b\u000e\u00e5!\u00fc\u00f8\u0016".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        xS.a = var6_1;
        xS.b = new Integer[10];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5E4D;
        if (b[n11] == null) {
            xS.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

