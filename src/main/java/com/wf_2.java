/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BX;
import com.QL;
import com.ao_0;
import com.at_0;
import com.hd_0;
import com.hu_0;
import com.ll_1;
import com.ne_1;
import java.awt.Rectangle;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;

/*
 * Renamed from com.wf
 */
public class wf_2
extends TransferHandler {
    protected final BX N;
    protected final hd_0 I;
    protected int g = -1;
    protected at_0 P = null;
    private static final long[] a;
    private static final Integer[] b;

    public wf_2(BX bX) {
        this.N = bX;
        this.I = bX.D();
    }

    @Override
    public int getSourceActions(JComponent jComponent) {
        return 2;
    }

    @Override
    public void exportAsDrag(JComponent jComponent, InputEvent inputEvent, int n10) {
        block3: {
            block4: {
                MouseEvent mouseEvent;
                int n11;
                int n12;
                String[] stringArray;
                block2: {
                    stringArray = BX.B();
                    n12 = inputEvent instanceof MouseEvent;
                    if (stringArray != null) break block2;
                    if (n12 == 0) break block3;
                    n12 = n10;
                }
                if (n12 != 2 || (n11 = this.I.indexAtLocation((mouseEvent = (MouseEvent)inputEvent).getX(), mouseEvent.getY())) == -1) break block3;
                at_0 at_02 = this.N.x(n11);
                if (stringArray != null) break block4;
                if (!at_02.K()) break block3;
                this.g = n11;
                this.P = at_02;
                super.exportAsDrag(jComponent, inputEvent, n10);
            }
            this.N.z().u();
        }
    }

    @Override
    protected Transferable createTransferable(JComponent jComponent) {
        block3: {
            wf_2 wf_22;
            block2: {
                String[] stringArray = BX.B();
                wf_22 = this;
                if (stringArray != null) break block2;
                if (wf_22.P == null) break block3;
                wf_22 = this;
            }
            wf_22.N.x(this.P);
            return new ll_1(this.P);
        }
        return null;
    }

    @Override
    protected void exportDone(JComponent jComponent, Transferable transferable, int n10) {
        block6: {
            wf_2 wf_22;
            int n11;
            block5: {
                QL qL = this.N.z();
                String[] stringArray = BX.B();
                n11 = qL.V();
                if (stringArray != null) break block5;
                if (n11 == 0 && qL.c(this.P.B()) == null) {
                    this.N.J(this.P, this.g);
                    this.N.q(this.P);
                }
                wf_22 = this;
                if (stringArray != null) break block6;
                n11 = wf_22.N.o();
            }
            if (n11 == 0) {
                this.N.z().Z(this.N);
            }
            this.g = -1;
            wf_22 = this;
        }
        wf_22.P = null;
    }

    /*
     * Loose catch block
     */
    @Override
    public boolean canImport(TransferHandler.TransferSupport transferSupport) {
        String[] stringArray = BX.B();
        try {
            boolean bl;
            block10: {
                block9: {
                    DataFlavor dataFlavor;
                    Transferable transferable;
                    block8: {
                        transferable = transferSupport.getTransferable();
                        dataFlavor = ll_1.q;
                        if (stringArray != null) break block8;
                        try {
                            block11: {
                                if (!transferable.isDataFlavorSupported(dataFlavor)) break block9;
                                break block11;
                                catch (Throwable throwable) {
                                    throw wf_2.a(throwable);
                                }
                            }
                            transferable = transferSupport.getTransferable();
                            dataFlavor = ll_1.q;
                        }
                        catch (Throwable throwable) {
                            throw wf_2.a(throwable);
                        }
                    }
                    try {
                        if (transferable.getTransferData(dataFlavor) == null) break block9;
                        bl = true;
                        break block10;
                    }
                    catch (Throwable throwable) {
                        throw wf_2.a(throwable);
                    }
                }
                bl = false;
            }
            return bl;
        }
        catch (Throwable throwable) {
            ne_1.g(this, throwable);
            return false;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean importData(TransferHandler.TransferSupport var1_1) {
        var2_2 = BX.B();
        try {
            block47: {
                block56: {
                    block48: {
                        block49: {
                            block54: {
                                block55: {
                                    block52: {
                                        block53: {
                                            block50: {
                                                block51: {
                                                    block58: {
                                                        block43: {
                                                            block46: {
                                                                block44: {
                                                                    block45: {
                                                                        var3_3 = var1_1.getTransferable().getTransferData(ll_1.q);
                                                                        var4_5 = (at_0)var3_3;
                                                                        var5_6 = var1_1.getDropLocation().getDropPoint();
                                                                        var6_7 = (hd_0)var1_1.getComponent();
                                                                        var7_8 = var6_7.N(var5_6);
                                                                        try {
                                                                            v0 = var7_8;
                                                                            if (var2_2 != null) break block43;
                                                                            if (v0 != -1) {
                                                                            }
                                                                            ** GOTO lbl43
                                                                        }
                                                                        catch (Throwable v1) {
                                                                            throw wf_2.a(v1);
                                                                        }
                                                                        var8_9 = var6_7.getBoundsAt(var7_8);
                                                                        v2 = var5_6.x;
                                                                        v3 = var8_9.x + var8_9.width / 2;
                                                                        if (var2_2 != null) break block44;
                                                                        try {
                                                                            block57: {
                                                                                if (v2 >= v3) break block45;
                                                                                break block57;
                                                                                catch (Throwable v4) {
                                                                                    throw wf_2.a(v4);
                                                                                }
                                                                            }
                                                                            v5 = var7_8;
                                                                            break block46;
                                                                        }
                                                                        catch (Throwable v6) {
                                                                            throw wf_2.a(v6);
                                                                        }
                                                                    }
                                                                    v2 = var7_8;
                                                                    v3 = 1;
                                                                }
                                                                v5 = v2 + v3;
                                                            }
                                                            var9_11 = v5;
                                                            try {
                                                                this.N.J(var4_5, var9_11);
                                                                this.N.q(var4_5);
                                                                this.e(this.N);
                                                                if (var2_2 == null) break block47;
lbl43:
                                                                // 2 sources

                                                                v0 = -1;
                                                            }
                                                            catch (Throwable v7) {
                                                                throw wf_2.a(v7);
                                                            }
                                                        }
                                                        var8_10 = v0;
                                                        v8 = this.N.z().X();
                                                        if (var2_2 != null) break block48;
                                                        if (v8 == 0) break block49;
                                                        break block58;
                                                        catch (Throwable v9) {
                                                            throw wf_2.a(v9);
                                                        }
                                                    }
                                                    try {
                                                        block59: {
                                                            v8 = var6_7.getTabCount();
                                                            if (var2_2 != null) break block48;
                                                            break block59;
                                                            catch (Throwable v10) {
                                                                throw wf_2.a(v10);
                                                            }
                                                        }
                                                        if (v8 <= 0) break block49;
                                                    }
                                                    catch (Throwable v11) {
                                                        throw wf_2.a(v11);
                                                    }
                                                    var9_11 = var6_7.getTabPlacement();
                                                    var10_13 = var6_7.getWidth();
                                                    var11_14 = var6_7.getHeight();
                                                    v8 = var9_11;
                                                    v12 = 1;
                                                    if (var2_2 != null) break block50;
                                                    try {
                                                        block60: {
                                                            if (v8 == v12) ** GOTO lbl91
                                                            break block60;
                                                            catch (Throwable v13) {
                                                                throw wf_2.a(v13);
                                                            }
                                                        }
                                                        v8 = (int)new Rectangle(0, 0, var10_13, wf_2.a(1079, 5403612209355369773L)).contains(var5_6);
                                                        if (var2_2 != null) break block51;
                                                    }
                                                    catch (Throwable v14) {
                                                        throw wf_2.a(v14);
                                                    }
                                                    if (v8 == 0) ** GOTO lbl91
                                                    var8_10 = 1;
                                                    try {
                                                        if (var2_2 == null) break block49;
lbl91:
                                                        // 3 sources

                                                        v8 = var9_11;
                                                    }
                                                    catch (Throwable v15) {
                                                        throw wf_2.a(v15);
                                                    }
                                                }
                                                v12 = 3;
                                            }
                                            if (var2_2 != null) break block52;
                                            try {
                                                block61: {
                                                    if (v8 == v12) ** GOTO lbl115
                                                    break block61;
                                                    catch (Throwable v16) {
                                                        throw wf_2.a(v16);
                                                    }
                                                }
                                                v8 = (int)new Rectangle(0, var11_14 - wf_2.a(10401, 5928364134527926714L), var10_13, wf_2.a(10401, 5928364134527926714L)).contains(var5_6);
                                                if (var2_2 != null) break block53;
                                            }
                                            catch (Throwable v17) {
                                                throw wf_2.a(v17);
                                            }
                                            if (v8 == 0) ** GOTO lbl115
                                            var8_10 = 3;
                                            try {
                                                if (var2_2 == null) break block49;
lbl115:
                                                // 3 sources

                                                v8 = var9_11;
                                            }
                                            catch (Throwable v18) {
                                                throw wf_2.a(v18);
                                            }
                                        }
                                        v12 = 2;
                                    }
                                    if (var2_2 != null) break block54;
                                    try {
                                        block62: {
                                            if (v8 == v12) ** GOTO lbl139
                                            break block62;
                                            catch (Throwable v19) {
                                                throw wf_2.a(v19);
                                            }
                                        }
                                        v8 = (int)new Rectangle(0, 0, wf_2.a(10401, 5928364134527926714L), var11_14).contains(var5_6);
                                        if (var2_2 != null) break block55;
                                    }
                                    catch (Throwable v20) {
                                        throw wf_2.a(v20);
                                    }
                                    if (v8 == 0) ** GOTO lbl139
                                    var8_10 = 2;
                                    try {
                                        if (var2_2 == null) break block49;
lbl139:
                                        // 3 sources

                                        v8 = var9_11;
                                    }
                                    catch (Throwable v21) {
                                        throw wf_2.a(v21);
                                    }
                                }
                                v12 = 4;
                            }
                            if (var2_2 != null) break block56;
                            try {
                                block63: {
                                    if (v8 == v12) break block49;
                                    break block63;
                                    catch (Throwable v22) {
                                        throw wf_2.a(v22);
                                    }
                                }
                                v8 = (int)new Rectangle(var10_13 - wf_2.a(10401, 5928364134527926714L), 0, wf_2.a(10401, 5928364134527926714L), var11_14).contains(var5_6);
                                if (var2_2 != null) break block48;
                            }
                            catch (Throwable v23) {
                                throw wf_2.a(v23);
                            }
                            if (v8 != 0) {
                                var8_10 = 4;
                            }
                        }
                        v8 = var8_10;
                    }
                    v12 = -1;
                }
                if (v8 == v12) ** GOTO lbl172
                var9_12 = this.N.z().e(this.N, var4_5, var8_10);
                try {
                    var9_12.q(var4_5);
                    this.e(var9_12);
                    if (var2_2 == null) break block47;
lbl172:
                    // 2 sources

                    this.N.O(var4_5);
                    this.N.q(var4_5);
                    this.e(this.N);
                }
                catch (Throwable v24) {
                    throw wf_2.a(v24);
                }
            }
            return true;
        }
        catch (Throwable var3_4) {
            ne_1.g(this, var3_4);
            return false;
        }
    }

    protected void e(BX bX) {
        SwingUtilities.invokeLater(new hu_0(this, bX));
    }

    public static void V(BX bX) {
        hd_0 hd_02 = bX.D();
        ao_0 ao_02 = new ao_0(bX, hd_02);
        hd_02.addMouseListener(ao_02);
        hd_02.addMouseMotionListener(ao_02);
        hd_02.setTransferHandler(new wf_2(bX));
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5516352564975145700L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "Ol\u009e\u009e\u0012\u009c\u0093v\u00e8?\u008e\u0013\u0091\u00bf\u00bf\u00e1";
        int n11 = "Ol\u009e\u009e\u0012\u009c\u0093v\u00e8?\u008e\u0013\u0091\u00bf\u00bf\u00e1".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x291B;
        if (b[n11] == null) {
            wf_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

