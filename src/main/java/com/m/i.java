/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.FN;
import com.aL;
import com.m.K;
import com.m.s;
import com.rv_2;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTree;
import javax.swing.TransferHandler;

class i
extends MouseAdapter {
    final K Q;
    private static final long a;

    i(K k2) {
        this.Q = k2;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void mousePressed(MouseEvent var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        block13: {
            JTree jTree;
            block15: {
                K k2;
                String string;
                block14: {
                    block12: {
                        block11: {
                            long l2;
                            block10: {
                                long l3 = System.currentTimeMillis() - this.Q.r;
                                string = s.d();
                                long l4 = l3 - a;
                                l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                if (string == null) break block10;
                                if (l2 < 0) {
                                    return;
                                }
                                k2 = this.Q;
                                if (string == null) break block11;
                                l2 = (long)K.D(k2).getDragEnabled();
                            }
                            if (l2 == false) {
                                return;
                            }
                            k2 = this.Q;
                        }
                        if (string != null) {
                            if (k2.G != null) {
                                TransferHandler transferHandler = K.F(this.Q).getTransferHandler();
                                transferHandler.exportAsDrag(K.R(this.Q), mouseEvent, transferHandler.getSourceActions(K.t(this.Q)));
                                this.Q.G = null;
                            }
                            k2 = this.Q;
                        }
                        if (string == null) break block12;
                        if (!k2.y()) break block13;
                        k2 = this.Q;
                    }
                    if (string == null) break block14;
                    if (k2.n == null) break block13;
                    this.Q.q = mouseEvent.getPoint();
                    this.e(mouseEvent);
                    this.D();
                    k2 = this.Q;
                }
                jTree = K.v(k2);
                if (string == null) break block15;
                if (jTree.getVisibleRect().contains(mouseEvent.getPoint())) break block13;
                jTree = K.Y(this.Q);
            }
            jTree.scrollRectToVisible(new Rectangle(mouseEvent.getPoint(), new Dimension(0, 0)));
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block6: {
            block7: {
                K k2;
                String string;
                block5: {
                    string = s.d();
                    k2 = this.Q;
                    if (string != null) {
                        if (k2.G != null) {
                            this.Q.G = null;
                        }
                        k2 = this.Q;
                    }
                    if (string == null) break block5;
                    if (!k2.y()) break block6;
                    k2 = this.Q;
                }
                if (string == null) break block7;
                if (k2.n == null) break block6;
                this.Q.n = null;
                k2 = this.Q;
            }
            k2.q = null;
            this.D();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void e(MouseEvent var1_1) {
        block26: {
            block25: {
                block22: {
                    block23: {
                        block24: {
                            var3_2 = rv_2.t(new Point[]{this.Q.n, this.Q.q});
                            var4_3 = new ArrayList<Integer>();
                            var2_4 = s.d();
                            v0 = FN.y(var1_1);
                            if (var2_4 == null) break block23;
                            if (v0 == 0) break block24;
                            for (var5_5 = 0; var5_5 < K.n(this.Q).getRowCount(); ++var5_5) {
                                v1 = this.Q.G(var5_5).intersects(var3_2);
                                if (var2_4 != null) {
                                    if (var2_4 != null) {
                                        if (v1 == 0) continue;
                                        v2 = this.Q.P.contains(var5_5);
                                    }
                                    if (var2_4 == null || v2) continue;
                                    v2 = var4_3.add(var5_5);
                                    if (var2_4 != null) continue;
                                }
                                break block22;
                            }
                            var5_6 = this.Q.P.iterator();
                            while (var5_6.hasNext()) {
                                var6_9 = (Integer)var5_6.next();
                                var4_3.add(var6_9);
                                if (var2_4 != null) {
                                    if (var2_4 != null) continue;
                                }
                                ** GOTO lbl-1000
                            }
                            if (var2_4 != null) ** GOTO lbl-1000
                        }
                        v0 = FN.m(var1_1);
                    }
                    if (var2_4 == null) ** GOTO lbl58
                    if (v0 == 0) ** GOTO lbl-1000
                    var5_6 = new ArrayList<E>();
                    for (var6_9 = 0; var6_9 < K.j(this.Q).getRowCount(); ++var6_9) {
                        v1 = (int)this.Q.G(var6_9).intersects(var3_2);
                        if (var2_4 != null) {
                            if (var2_4 != null) {
                                if (v1 == 0) continue;
                                v3 = this.Q.P.contains(var6_9);
                            }
                            if (var2_4 == null) continue;
                            if (v3) {
                                var5_6.add(var6_9);
                                if (var2_4 != null) continue;
                            }
                            v3 = var4_3.add(var6_9);
                            if (var2_4 != null) continue;
                        }
                        break block22;
                    }
                    var6_10 = this.Q.P.iterator();
                    while (var6_10.hasNext()) {
                        var7_11 = (Integer)var6_10.next();
                        v1 = (int)var5_6.contains(var7_11);
                        if (var2_4 != null) {
                            if (var2_4 != null && v1 == 0) {
                                var4_3.add(var7_11);
                            }
                            if (var2_4 != null) continue;
                        }
                        break block22;
                    }
                    if (var2_4 == null) lbl-1000:
                    // 2 sources

                    {
                        v0 = var5_7 = 0;
lbl58:
                        // 3 sources

                        while (var5_7 < K.y(this.Q).getRowCount()) {
                            v1 = this.Q.G(var5_7).intersects(var3_2);
                            if (var2_4 != null) {
                                if (var2_4 != null && v1 != 0) {
                                    var4_3.add(var5_7);
                                }
                                ++var5_7;
                                if (var2_4 != null) continue;
                            }
                            break;
                        }
                    } else lbl-1000:
                    // 5 sources

                    {
                        v1 = aL.n(this.s(), var4_3);
                    }
                }
                if (var2_4 == null) break block25;
                if (v1 != 0) break block26;
                v1 = var4_3.size();
            }
            if (v1 > 0) {
                // empty if block
            }
            var5_8 = new int[]{1, 2, 3};
            K.I(this.Q).setSelectionRows(var5_8);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private List s() {
        ArrayList<Integer> arrayList;
        ArrayList<Integer> arrayList2;
        block4: {
            int[] nArray;
            String string;
            block3: {
                int[] nArray2;
                arrayList2 = new ArrayList<Integer>();
                string = s.d();
                nArray = nArray2 = K.p(this.Q).getSelectionRows();
                if (string == null) break block3;
                if (nArray == null) break block4;
                nArray = nArray2;
            }
            for (int n10 : nArray) {
                arrayList = arrayList2;
                if (string == null) return arrayList;
                arrayList.add(n10);
                if (string != null) continue;
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    private void D() {
        K.H(this.Q).repaint(K.a(this.Q).getVisibleRect());
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        this.v(mouseEvent);
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.z();
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        this.v(mouseEvent);
    }

    private void v(MouseEvent mouseEvent) {
        block8: {
            i i2;
            block4: {
                block5: {
                    String string;
                    block7: {
                        int n10;
                        int n11;
                        block6: {
                            string = s.d();
                            i2 = this;
                            if (string == null) break block4;
                            if (!K.G(i2.Q).isEnabled()) break block5;
                            i2 = this;
                            if (string == null) break block4;
                            if (!i2.Q.h) break block5;
                            n11 = this.Q.Y(mouseEvent.getPoint());
                            n10 = this.Q.g;
                            if (string == null) break block6;
                            if (n10 == n11) break block7;
                            n10 = this.Q.g;
                        }
                        int n12 = n10;
                        this.Q.g = n11;
                        this.I(n11);
                        this.I(n12);
                    }
                    if (string != null) break block8;
                }
                i2 = this;
            }
            i2.z();
        }
    }

    private void z() {
        int n10 = this.Q.g;
        this.Q.g = -1;
        this.I(n10);
    }

    private void I(int n10) {
        Rectangle rectangle;
        if (n10 != -1 && (rectangle = this.Q.A(n10)) != null) {
            K.i(this.Q).repaint(rectangle);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5344468874904520112L;
        a = 0x4A2B5E2021D0C5AEL ^ l2;
    }
}

