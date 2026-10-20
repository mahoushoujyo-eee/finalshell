/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B9;
import com.CV;
import com.DI;
import com.E0;
import com.E5;
import com.FK;
import com.GD;
import com.IR;
import com.I_;
import com.KB;
import com.KI;
import com.KO;
import com.OT;
import com.Q9;
import com.QP;
import com.S3;
import com.SB;
import com.SU;
import com.SY;
import com.WZ;
import com.XC;
import com.XE;
import com.XH;
import com.XP;
import com.YP;
import com.YT;
import com._D;
import com._y_0;
import com.a6;
import com.a7;
import com.aD;
import com.aG;
import com.aR;
import com.ab_0;
import com.am_0;
import com.bl_0;
import com.bs_0;
import com.c;
import com.ca_2;
import com.cs_1;
import com.d__0;
import com.dc_1;
import com.dv_1;
import com.dz_2;
import com.ep_0;
import com.et_0;
import com.et_1;
import com.gj_0;
import com.hb_0;
import com.im_2;
import com.iy_1;
import com.j_0;
import com.ky_2;
import com.le_0;
import com.lg_0;
import com.lg_1;
import com.lt_0;
import com.ly_2;
import com.n__0;
import com.no_1;
import com.nt_0;
import com.ny_2;
import com.oo_0;
import com.oq_2;
import com.ov_2;
import com.ox_1;
import com.pd_1;
import com.pe_1;
import com.pr_0;
import com.rp_1;
import com.ru_1;
import com.rx_2;
import com.sc_0;
import com.sd_0;
import com.ua_0;
import com.wf_1;
import com.wg_0;
import com.wq_0;
import com.ws_0;
import com.wu_0;
import com.wz_1;
import com.xf_1;
import com.xn_2;
import com.ya_1;
import com.yk_0;
import com.yo_1;
import com.yu_0;
import com.yu_1;
import com.yw_0;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.geom.AffineTransform;
import java.awt.im.InputMethodRequests;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.text.AttributedCharacterIterator;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.BoundedRangeModel;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.pA
 */
public class pa_1
extends JComponent
implements dv_1,
cs_1,
ClipboardOwner,
D2 {
    private static Logger cl;
    public static double z;
    private Font c_;
    private Font ck;
    private Font cL;
    private Font Z;
    private int cW = 0;
    private int cJ = 0;
    public Dimension c4 = new Dimension();
    private boolean cd;
    public OT N;
    private boolean cq = false;
    private E0 cc = null;
    private YT x = YT.MOUSE_REPORTING_NONE;
    private XE c0 = null;
    private ru_1 u = null;
    private a6 v;
    private xn_2 c;
    private rx_2 t;
    private im_2 V;
    private ov_2 cY;
    private d__0 w = new d__0(this);
    private BoundedRangeModel i = new DefaultBoundedRangeModel(0, pa_1.a(5921, 385034442389622210L), 0, pa_1.a(5921, 385034442389622210L));
    private boolean X = true;
    protected int P;
    List cT = new CopyOnWriteArrayList();
    private String j = pa_1.a(8956, -13003);
    private cs_1 R;
    private String cf;
    private Timer cF;
    private AtomicInteger D = new AtomicInteger(0);
    private AtomicBoolean Q = new AtomicBoolean(true);
    private int cK = pa_1.a(1039, 8977415319888338665L);
    private int c5 = pa_1.a(24345, 3875527706677560814L);
    private ab_0 cE;
    private WZ l;
    private ya_1 cV = null;
    private int Y = 0;
    private I_ c2 = new I_(this);
    private ox_1 B;
    private wq_0 W;
    private volatile boolean r;
    private boolean T = false;
    private boolean cz;
    @Nullable
    private YP a;
    @Nullable
    private YP cp;
    private ru_1 e = null;
    private int F = 0;
    private int cy = 0;
    IR s;
    zB cv;
    boolean n = false;
    int c6 = -1;
    String cH;
    _y_0 L;
    kx_2 O;
    nY cM;
    K3 d;
    KeyEvent cr;
    long E;
    boolean g;
    boolean o;
    Object f;
    StringBuffer cs;
    long M;
    XE K;
    boolean cj;
    DI S;
    Y3 q;
    lt_2 m;
    int cw;
    long h;
    boolean cQ;
    static HashMap J;
    pr_0 H;
    boolean k;
    boolean c8;
    boolean A;
    ChangeListener p;
    Clipboard G;
    boolean cS;
    int U;
    gH b;
    int I;
    long C;
    public long ce;
    float y;
    long cb;
    boolean ca;
    private static final String[] ab;
    private static final String[] bb;
    private static final long[] db;
    private static final Integer[] eb;
    private static final long[] fb;
    private static final Long[] gb;

    public pa_1(@NotNull rx_2 rx_22, @NotNull im_2 im_22, @NotNull ov_2 ov_22) {
        int n10 = _y_0.M();
        try {
            kx_2 kx_22;
            Object object;
            this.cH = "";
            this.g = false;
            this.o = false;
            this.f = new Object();
            this.cs = new StringBuffer();
            this.cj = false;
            this.H = new pr_0(this);
            this.k = false;
            this.c8 = false;
            this.A = false;
            try {
                object = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                kx_22 = (kx_2)object.Z();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.O = kx_22;
            this.cS = false;
            this.U = 0;
            this.I = -1;
            this.y = 1.0f;
            this.ca = true;
            this.t = rx_22;
            this.V = im_22;
            this.cY = ov_22;
            this.N = new OT(im_22.B(), im_22.O());
            this.cK = this.t.n();
            this.v = this.U();
            this.l(true);
            this.enableEvents(pa_1.b(14408, 3559354844437830389L));
            this.enableInputMethods(true);
            im_22.P(this::repaint);
            im_22.Y(this::repaint);
            this.m = new lt_2(this, this);
            try {
                this.m.Q(true);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (ky_2.F() != null) {
                _y_0.W(++n10);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw pa_1.a(illegalStateException);
        }
    }

    public void k() {
        block7: {
            boolean bl;
            ArrayList<KeyListener> arrayList = new ArrayList<KeyListener>();
            int n10 = _y_0.M();
            for (KeyListener keyListener : this.cT) {
                block8: {
                    try {
                        try {
                            try {
                                bl = keyListener.getClass().equals(I_.class);
                                if (n10 == 0) break block7;
                                if (n10 == 0) break block8;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            if (!bl) break block8;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        arrayList.add(keyListener);
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                if (n10 != 0) continue;
            }
            bl = this.cT.removeAll(arrayList);
        }
        this.addKeyListener(new I_(this));
    }

    public OT v() {
        return this.N;
    }

    public boolean V() {
        return this.g;
    }

    public void e(boolean bl) {
        block5: {
            boolean bl2;
            block4: {
                int n10 = _y_0.M();
                try {
                    pa_1 pa_12;
                    try {
                        pa_12 = this;
                        bl2 = bl;
                        if (n10 == 0) break block4;
                        pa_12.g = bl2;
                        if (bl) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    pa_12 = this;
                    bl2 = false;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            pa_12.o = bl2;
        }
    }

    public boolean g() {
        return this.o;
    }

    public void b(boolean bl) {
        if (bl) {
            // empty if block
        }
        this.o = bl;
        if (!bl) {
            // empty if block
        }
    }

    public Y3 Z() {
        return this.q;
    }

    public void F(Y3 y3) {
        this.q = y3;
    }

    public KeyEvent c() {
        return this.cr;
    }

    public void X(KeyEvent keyEvent) {
        this.cr = keyEvent;
    }

    public long Z() {
        return this.E;
    }

    public void u(long l2) {
        this.E = l2;
    }

    public void C() {
        this.cr = null;
        this.E = 0L;
        this.g = false;
        this.o = false;
        this.cq = false;
    }

    public void l() {
        this.G();
    }

    public void D() {
        this.b();
        this.Q();
        this.setPreferredSize(new Dimension(this.g(), this.J()));
        this.setFocusable(true);
        this.enableInputMethods(true);
        this.setDoubleBuffered(true);
        this.setFocusTraversalKeysEnabled(false);
        this.addMouseMotionListener(new hb_0(this));
        this.addMouseWheelListener(new B9(this));
        this.addMouseListener(new yu_1(this));
        this.addComponentListener(new sc_0(this));
        this.addFocusListener(new CV(this));
        this.p = new wg_0(this);
        this.i.addChangeListener(this.p);
        this.J();
    }

    void z(int n10, int n11) {
        JPopupMenu jPopupMenu = this.C();
        jPopupMenu.show(this, n10, n11);
    }

    JPopupMenu C() {
        JMenuItem jMenuItem;
        JMenuItem jMenuItem2;
        JMenuItem jMenuItem3;
        JMenuItem jMenuItem4;
        JMenuItem jMenuItem5;
        JPopupMenu jPopupMenu = new JPopupMenu();
        try {
            jMenuItem5 = (JMenuItem)xK.T(US.S, (Object)new oo_0(this, pa_1.a(8954, -25906)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        jPopupMenu.add(jMenuItem5);
        try {
            jMenuItem4 = (JMenuItem)xK.T(US.v, (Object)new yk_0(this, pa_1.a(8947, -25754)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        jPopupMenu.add(jMenuItem4);
        try {
            jMenuItem3 = (JMenuItem)xK.T(0, (Object)new oq_2(this, pa_1.a(8958, 28867)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        jPopupMenu.add(jMenuItem3);
        jPopupMenu.addSeparator();
        try {
            jMenuItem2 = (JMenuItem)xK.T(US.Q, (Object)new Q9(this, pa_1.a(8944, -26558)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        jPopupMenu.add(jMenuItem2);
        jPopupMenu.addSeparator();
        try {
            jMenuItem = (JMenuItem)xK.T(US.h, (Object)new GD(this, pa_1.a(8957, 24712)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        jPopupMenu.add(jMenuItem);
        jPopupMenu.addSeparator();
        JMenuItem jMenuItem6 = new JMenuItem(pa_1.a(8949, 5939));
        jMenuItem6.setForeground(new Color(pa_1.a(5895, 7533047664870002152L), 0, pa_1.a(17063, 1733742218729281603L)));
        jPopupMenu.add(jMenuItem6);
        jMenuItem6.addActionListener(new lt_0(this));
        return jPopupMenu;
    }

    public void v() {
        block8: {
            pa_1 pa_12;
            block7: {
                int n10 = _y_0.y();
                this.L.Q();
                int n11 = n10;
                try {
                    try {
                        pa_12 = this;
                        if (n11 != 0) break block7;
                        if (pa_12.u == null) break block8;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    pa_12 = this;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            String string = pa_12.J();
            try {
                if (string != null) {
                    this.L.l(string);
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw pa_1.a(illegalStateException);
            }
        }
    }

    public void r() {
        this.requestFocus();
        this.r(this.C());
    }

    public void y() {
        block8: {
            String string;
            String string2;
            block6: {
                int n10 = _y_0.y();
                this.requestFocus();
                int n11 = n10;
                this.A(false);
                string2 = this.J();
                try {
                    block7: {
                        try {
                            try {
                                string = string2;
                                if (n11 != 0) break block6;
                                if (string == null) break block7;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            this.r(string2);
                            if (n11 == 0) break block8;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    string = this.C();
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            string2 = string;
            this.r(string2);
        }
    }

    public boolean A(boolean bl) {
        block9: {
            boolean bl2;
            block10: {
                block11: {
                    ru_1 ru_12;
                    int n10;
                    block8: {
                        int n11 = _y_0.M();
                        this.requestFocus();
                        n10 = n11;
                        try {
                            try {
                                ru_12 = this.u;
                                if (n10 == 0) break block8;
                                if (ru_12 == null) break block9;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            ru_12 = this.u;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    KB kB = ru_12.K(this.N.R());
                    try {
                        try {
                            this.r((XE)kB.X, (XE)kB.S);
                            bl2 = bl;
                            if (n10 == 0) break block10;
                            if (!bl2) break block11;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        this.V();
                        this.repaint();
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                bl2 = true;
            }
            return bl2;
        }
        return false;
    }

    void e() {
        SwingUtilities.invokeLater(new lg_0(this));
    }

    void V() {
        this.u = null;
        this.N();
    }

    /*
     * Unable to fully structure code
     */
    public void N() {
        block22: {
            block19: {
                block20: {
                    block21: {
                        var1_1 = _y_0.y();
                        try {
                            try {
                                try {
                                    v0 = this;
                                    if (var1_1 != 0) break block19;
                                    if (v0.isShowing()) {
                                    }
                                    ** GOTO lbl64
                                }
                                catch (IllegalStateException v1) {
                                    throw pa_1.a(v1);
                                }
                                v0 = this;
                                if (var1_1 != 0) break block19;
                            }
                            catch (IllegalStateException v2) {
                                throw pa_1.a(v2);
                            }
                            if (v0.u != null) {
                            }
                            ** GOTO lbl64
                        }
                        catch (IllegalStateException v3) {
                            throw pa_1.a(v3);
                        }
                        var2_2 = this.u.e().r - this.i.getValue() + 1;
                        var3_3 = new XE(this.u.e().q * this.c4.width, var2_2 * this.c4.height);
                        var4_4 = new XE(this.K.q + pa_1.a(18426, 2303050399558163741L), var3_3.r + pa_1.a(12242, 1489795501300364599L));
                        var5_5 = new Rectangle();
                        var5_5.x = var4_4.q;
                        var5_5.y = var4_4.r;
                        var5_5.width = this.q.getPreferredSize().width;
                        var5_5.height = this.q.getPreferredSize().height;
                        var6_6 = this;
                        try {
                            try {
                                v4 = var5_5.x + var5_5.width;
                                v5 = var6_6.getWidth();
                                if (var1_1 != 0) break block20;
                                if (v4 <= v5) break block21;
                            }
                            catch (IllegalStateException v6) {
                                throw pa_1.a(v6);
                            }
                            var5_5.x = var6_6.getWidth() - var5_5.width;
                        }
                        catch (IllegalStateException v7) {
                            throw pa_1.a(v7);
                        }
                    }
                    v4 = var2_2;
                    v5 = this.N.c();
                }
                try {
                    if (v4 == v5) {
                        var5_5.y -= this.c4.height + this.q.getPreferredSize().height + 3;
                    }
                }
                catch (IllegalStateException v8) {
                    throw pa_1.a(v8);
                }
                try {
                    try {
                        this.q.A(var5_5);
                    }
                    catch (InvocationTargetException v9) {
                        throw v9.getTargetException();
                    }
                    this.W();
                    if (var1_1 == 0) break block22;
lbl64:
                    // 3 sources

                    v0 = this;
                }
                catch (IllegalStateException v10) {
                    throw pa_1.a(v10);
                }
            }
            v0.x();
        }
    }

    void x() {
        this.q.setVisible(false);
        this.cj = false;
    }

    void W() {
        this.q.setVisible(true);
    }

    void Q() {
        this.G = Toolkit.getDefaultToolkit().getSystemClipboard();
    }

    String J() {
        String string;
        block13: {
            Object object;
            KB kB;
            block15: {
                int n10;
                block14: {
                    ru_1 ru_12;
                    block12: {
                        string = null;
                        n10 = _y_0.M();
                        try {
                            try {
                                ru_12 = this.u;
                                if (n10 == 0) break block12;
                                if (ru_12 == null) break block13;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            ru_12 = this.u;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    kB = ru_12.K(this.N.R());
                    try {
                        try {
                            object = kB.X;
                            if (n10 == 0) break block14;
                            if (object == null) break block13;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        object = kB.S;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                try {
                    try {
                        if (n10 == 0) break block15;
                        if (object == null) break block13;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    object = kB.X;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            string = a7.v((XE)object, (XE)kB.S, this.V);
        }
        return string;
    }

    protected void r(XE xE2, XE xE3) {
        block12: {
            XE xE4;
            int n10;
            block10: {
                block11: {
                    block9: {
                        block8: {
                            n10 = _y_0.y();
                            try {
                                xE4 = xE2;
                                if (n10 != 0) break block8;
                                if (xE4 == null) break block9;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            xE4 = xE3;
                        }
                        try {
                            if (n10 != 0) break block10;
                            if (xE4 != null) break block11;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    return;
                }
                xE4 = xE2;
            }
            String string = a7.v(xE4, xE3, this.V);
            try {
                if (n10 != 0 || string.length() == 0) break block12;
            }
            catch (IllegalStateException illegalStateException) {
                throw pa_1.a(illegalStateException);
            }
            try {
                this.C(new StringSelection(string));
            }
            catch (IllegalStateException illegalStateException) {
                cl.error(pa_1.a(8946, -25108), illegalStateException);
            }
        }
    }

    protected void C(StringSelection stringSelection) {
        block9: {
            Clipboard clipboard;
            block8: {
                Clipboard clipboard2;
                int n10;
                block6: {
                    block7: {
                        Clipboard clipboard3 = Toolkit.getDefaultToolkit().getSystemClipboard();
                        n10 = _y_0.M();
                        try {
                            try {
                                clipboard2 = clipboard3;
                                if (n10 == 0) break block6;
                                if (clipboard2 == null) break block7;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            clipboard3.setContents(stringSelection, this);
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    clipboard2 = Toolkit.getDefaultToolkit().getSystemSelection();
                }
                Clipboard clipboard4 = clipboard2;
                try {
                    clipboard = clipboard4;
                    if (n10 == 0) break block8;
                    if (clipboard == null) break block9;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                clipboard = clipboard4;
            }
            clipboard.setContents(stringSelection, this);
        }
    }

    void K() {
        KeyEvent keyEvent = new KeyEvent(this, pa_1.a(22342, 1641791032517774729L), System.currentTimeMillis(), 0, pa_1.a(3818, 4017640413363442733L), (char)pa_1.a(3818, 4017640413363442733L));
        this.dispatchEvent(keyEvent);
    }

    /*
     * Loose catch block
     */
    protected void r(String string) {
        block6: {
            String string2;
            block7: {
                string2 = string;
                int n10 = _y_0.y();
                if (n10 != 0) break block6;
                try {
                    block8: {
                        if (string2 != null) break block7;
                        break block8;
                        catch (RuntimeException runtimeException) {
                            throw pa_1.a(runtimeException);
                        }
                    }
                    return;
                }
                catch (RuntimeException runtimeException) {
                    throw pa_1.a(runtimeException);
                }
            }
            try {
                this.cc.D(string2);
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
        }
    }

    public void x(String string, boolean bl) {
        this.v(string, bl, true);
    }

    public void v(String string, boolean bl, boolean bl2) {
        try {
            yt_1.F.J(new wz_1(this, string, bl2, bl));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    protected String A() throws IOException, UnsupportedFlavorException {
        try {
            return (String)this.G.getData(DataFlavor.stringFlavor);
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Override
    public void addKeyListener(KeyListener keyListener) {
        block5: {
            List list;
            block4: {
                int n10 = _y_0.M();
                try {
                    try {
                        list = this.cT;
                        if (n10 == 0) break block4;
                        if (list == null) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    list = this.cT;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            list.add(keyListener);
        }
    }

    public void b() {
        block4: {
            Iterator iterator = J.keySet().iterator();
            int n10 = _y_0.y();
            while (iterator.hasNext()) {
                BufferedImage bufferedImage = (BufferedImage)J.get(iterator.next());
                try {
                    bufferedImage.getGraphics().dispose();
                    if (n10 == 0) {
                        if (n10 == 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            J.clear();
            this.m();
            this.A();
        }
    }

    private void m() {
        Font font;
        Object object;
        Font font2;
        Object object2;
        K3 k3;
        nl_0 nl_02;
        Object object3;
        BufferedImage bufferedImage;
        try {
            bufferedImage = (BufferedImage)lk_0.W(1, 1);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        BufferedImage bufferedImage2 = bufferedImage;
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        try {
            object3 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            nl_02 = (nl_0)object3.U();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        nl_0 nl_03 = nl_02;
        try {
            k3 = (K3)nl_03.t();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.d = k3;
        try {
            object2 = this.d.D();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            font2 = (Font)object2.l();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Font font3 = font2;
        graphics2D.setFont(font3);
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        float f10 = 1.0f;
        this.c4.width = fontMetrics.charWidth((char)pa_1.a(18708, 7183158727673697250L));
        int n10 = fontMetrics.getHeight();
        this.c4.height = (int)Math.ceil((float)n10 * f10);
        this.cJ = Math.max(0, (this.c4.height - n10) / 2 * 2);
        this.F = fontMetrics.getDescent();
        this.F = (int)((float)this.F + f10);
        ++this.F;
        try {
            object = this.d.a();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            font = (Font)object.l();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Font font4 = font;
        graphics2D.setFont(font4);
        this.cy = fontMetrics.getDescent();
        int n11 = 2;
        this.F += n11;
        this.cy += n11;
        this.cd = pa_1.g(fontMetrics);
        if (!this.cd) {
            // empty if block
        }
        bufferedImage2.flush();
        graphics2D.dispose();
    }

    void k(@NotNull wq_0 wq_02) {
        this.W = wq_02;
    }

    @NotNull
    protected a6 U() {
        return new KI();
    }

    public xn_2 q() {
        return this.c;
    }

    @Override
    public void repaint() {
        this.Q.set(true);
    }

    private void h() {
        super.repaint();
    }

    protected void d() {
        this.L();
        this.A();
    }

    protected void L() {
        this.c_ = this.s();
        this.cL = this.c_.deriveFont(1);
        this.ck = this.c_.deriveFont(2);
        this.Z = this.c_.deriveFont(3);
        this.m();
    }

    public void A(@NotNull JScrollBar jScrollBar) {
        this.b();
        this.Q();
        this.L();
        this.setPreferredSize(new Dimension(this.g(), this.J()));
        this.setFocusable(true);
        this.enableInputMethods(true);
        this.setDoubleBuffered(true);
        this.setFocusTraversalKeysEnabled(false);
        this.addMouseMotionListener(new XH(this));
        this.addMouseWheelListener(arg_0 -> this.lambda$init$0(jScrollBar, arg_0));
        this.addMouseListener(new wu_0(this));
        this.addComponentListener(new dz_2(this));
        this.addHierarchyListener(new et_1(this));
        this.cz = this.t.w();
        this.addFocusListener(new FK(this));
        this.i.addChangeListener(this::lambda$init$1);
        this.J();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean B(@NotNull MouseEvent mouseEvent) {
        int n10;
        int n11;
        block6: {
            int n12 = _y_0.y();
            try {
                try {
                    try {
                        n11 = this.Y;
                        n10 = pa_1.a(13238, 1922841304603175238L);
                        if (n12 != 0) break block6;
                        if (n11 != n10) return 0 != 0;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    n11 = mouseEvent.getButton();
                    if (n12 != 0) return n11 != 0;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                n10 = 1;
            }
            catch (IllegalStateException illegalStateException) {
                throw pa_1.a(illegalStateException);
            }
        }
        if (n11 != n10) return 0 != 0;
        return 1 != 0;
    }

    protected void i(@NotNull MouseWheelEvent mouseWheelEvent, @NotNull JScrollBar jScrollBar) {
        MouseWheelEvent mouseWheelEvent2;
        block15: {
            block16: {
                block13: {
                    int n10;
                    block14: {
                        int n11;
                        block12: {
                            n11 = _y_0.y();
                            try {
                                try {
                                    n10 = mouseWheelEvent.isShiftDown();
                                    if (n11 != 0) break block12;
                                    if (n10 != 0) break block13;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                n10 = mouseWheelEvent.getUnitsToScroll();
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (n11 != 0) break block14;
                                    if (n10 == 0) break block13;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                mouseWheelEvent2 = mouseWheelEvent;
                                if (n11 != 0) break block15;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            double d2 = Math.abs(mouseWheelEvent2.getPreciseWheelRotation()) - 0.01;
                            n10 = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    if (n10 >= 0) break block16;
                }
                return;
            }
            this.b(mouseWheelEvent.getUnitsToScroll());
            mouseWheelEvent2 = mouseWheelEvent;
        }
        mouseWheelEvent2.consume();
    }

    /*
     * Unable to fully structure code
     */
    private void u(@NotNull Point var1_1, boolean var2_2) {
        block41: {
            block40: {
                block39: {
                    block36: {
                        block37: {
                            block38: {
                                block32: {
                                    block33: {
                                        block34: {
                                            block35: {
                                                block42: {
                                                    block31: {
                                                        block30: {
                                                            var4_3 = this.t(var1_1);
                                                            var5_4 = this.S(var4_3);
                                                            var3_5 = _y_0.M();
                                                            try {
                                                                v0 = var5_4;
                                                                if (var3_5 == 0) break block30;
                                                                if (v0 == null) break block31;
                                                            }
                                                            catch (IllegalStateException v1) {
                                                                throw pa_1.a(v1);
                                                            }
                                                            v0 = var5_4;
                                                        }
                                                        v2 = v0.g();
                                                        break block42;
                                                    }
                                                    v2 = null;
                                                }
                                                var6_6 = v2;
                                                var7_7 = yo_1.e(var6_6);
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (var3_5 == 0) break block32;
                                                                if (var7_7 == this.B) break block33;
                                                            }
                                                            catch (IllegalStateException v3) {
                                                                throw pa_1.a(v3);
                                                            }
                                                            v4 = this.B;
                                                            if (var3_5 == 0) break block34;
                                                        }
                                                        catch (IllegalStateException v5) {
                                                            throw pa_1.a(v5);
                                                        }
                                                        if (v4 == null) break block35;
                                                    }
                                                    catch (IllegalStateException v6) {
                                                        throw pa_1.a(v6);
                                                    }
                                                    this.B.a();
                                                }
                                                catch (IllegalStateException v7) {
                                                    throw pa_1.a(v7);
                                                }
                                            }
                                            v4 = var7_7;
                                        }
                                        if (v4 != null) {
                                            var8_8 = this.j(var4_3, var5_4);
                                            var7_7.a(this, this.C(var8_8));
                                        }
                                    }
                                    this.B = var7_7;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var3_5 == 0) break block36;
                                                if (var5_4 == null) break block37;
                                            }
                                            catch (IllegalStateException v8) {
                                                throw pa_1.a(v8);
                                            }
                                            v9 = var5_4.i();
                                            v10 = KO.ALWAYS;
                                            if (var3_5 == 0) break block38;
                                        }
                                        catch (IllegalStateException v11) {
                                            throw pa_1.a(v11);
                                        }
                                        if (v9 != v10) {
                                        }
                                        ** GOTO lbl90
                                    }
                                    catch (IllegalStateException v12) {
                                        throw pa_1.a(v12);
                                    }
                                    v9 = var5_4.i();
                                    v10 = KO.HOVER;
                                }
                                catch (IllegalStateException v13) {
                                    throw pa_1.a(v13);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (v9 != v10) break block37;
                                        v14 = (int)var2_2;
                                        if (var3_5 == 0) break block39;
                                    }
                                    catch (IllegalStateException v15) {
                                        throw pa_1.a(v15);
                                    }
                                    if (v14 == 0) break block37;
                                }
                                catch (IllegalStateException v16) {
                                    throw pa_1.a(v16);
                                }
lbl90:
                                // 2 sources

                                this.x(pa_1.a(19833, 335476109381261230L));
                                this.cV = var5_4.g();
                                return;
                            }
                            catch (IllegalStateException v17) {
                                throw pa_1.a(v17);
                            }
                        }
                        this.cV = null;
                    }
                    try {
                        v18 = this;
                        if (var3_5 == 0) break block40;
                        v14 = v18.Y;
                    }
                    catch (IllegalStateException v19) {
                        throw pa_1.a(v19);
                    }
                }
                try {
                    if (v14 == 0) break block41;
                    this.x(0);
                    v18 = this;
                }
                catch (IllegalStateException v20) {
                    throw pa_1.a(v20);
                }
            }
            v18.repaint();
        }
    }

    @NotNull
    private ws_0 j(@NotNull le_0 le_02, @NotNull yw_0 yw_02) {
        int n10;
        int n11;
        int n12 = _y_0.y();
        for (n11 = le_02.N(); n11 > 0; --n11) {
            try {
                if (yw_02 != this.V.l(n11 - 1, le_02.G())) break;
                if (n12 == 0) continue;
                break;
            }
            catch (IllegalStateException illegalStateException) {
                throw pa_1.a(illegalStateException);
            }
        }
        for (n10 = le_02.N(); n10 < this.V.B() - 1; ++n10) {
            try {
                if (yw_02 != this.V.l(n10 + 1, le_02.G())) break;
                if (n12 == 0) continue;
                break;
            }
            catch (IllegalStateException illegalStateException) {
                throw pa_1.a(illegalStateException);
            }
        }
        return new ws_0(le_02.G(), n11, n10);
    }

    private void J(Component component, boolean bl) {
        block3: {
            PointerInfo pointerInfo;
            block2: {
                PointerInfo pointerInfo2 = MouseInfo.getPointerInfo();
                int n10 = _y_0.M();
                try {
                    pointerInfo = pointerInfo2;
                    if (n10 == 0) break block2;
                    if (pointerInfo == null) break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                pointerInfo = pointerInfo2;
            }
            Point point = pointerInfo.getLocation();
            SwingUtilities.convertPointFromScreen(point, component);
            this.u(point, bl);
        }
    }

    @Nullable
    private yw_0 s(@NotNull Point point) {
        return this.S(this.t(point));
    }

    @Nullable
    private yw_0 S(@Nullable le_0 le_02) {
        block20: {
            int n10;
            int n11;
            int n12;
            block23: {
                block22: {
                    block21: {
                        le_0 le_03;
                        block19: {
                            n12 = _y_0.y();
                            try {
                                le_03 = le_02;
                                if (n12 != 0) break block19;
                                if (le_03 == null) break block20;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            le_03 = le_02;
                        }
                        try {
                            try {
                                n11 = le_03.N();
                                if (n12 != 0) break block21;
                                if (n11 < 0) break block20;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            n11 = le_02.N();
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    try {
                        try {
                            n10 = this.V.B();
                            if (n12 != 0) break block22;
                            if (n11 >= n10) break block20;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        n11 = le_02.G();
                        n10 = -this.V.H();
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                try {
                    try {
                        if (n12 != 0) break block23;
                        if (n11 < n10) break block20;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    n11 = le_02.G();
                    n10 = this.V.O();
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            if (n11 <= n10) {
                YP yP;
                block24: {
                    YP yP2 = this.V.l(le_02.N(), le_02.G());
                    try {
                        try {
                            yP = yP2;
                            if (n12 != 0) break block24;
                            if (!(yP instanceof yw_0)) break block20;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        yP = yP2;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                return (yw_0)yP;
            }
        }
        return null;
    }

    private void x(int n10) {
        block5: {
            block4: {
                int n11 = _y_0.y();
                try {
                    try {
                        if (n11 != 0) break block4;
                        if (n10 == this.Y) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    this.Y = n10;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            this.setCursor(new Cursor(this.Y));
        }
    }

    private void J() {
        gH gH2;
        try {
            gH2 = (gH)yt_1.F.V((Object)new bl_0(this), pa_1.a(10759, 3200006095109402836L) / this.cK);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.b = gH2;
    }

    public boolean m(MouseEvent mouseEvent) {
        boolean bl;
        block8: {
            block10: {
                int n10 = _y_0.M();
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    bl = this.t.Z();
                                    if (n10 == 0) break block8;
                                    if (bl) break block9;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                bl = this.X();
                                if (n10 == 0) break block8;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            if (bl != mouseEvent.isShiftDown()) break block10;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    bl = true;
                    break block8;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean b(MouseEvent mouseEvent) {
        boolean bl;
        block8: {
            block7: {
                int n10;
                block6: {
                    n10 = _y_0.M();
                    try {
                        try {
                            bl = this.X();
                            if (n10 == 0) break block6;
                            if (!bl) break block7;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        bl = mouseEvent.isShiftDown();
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                try {
                    if (n10 == 0) break block8;
                    if (bl) break block7;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    protected boolean W() {
        return QP.D();
    }

    public void V(int n10) {
        this.c5 = n10;
    }

    public void t(ab_0 ab_02) {
        this.cE = ab_02;
    }

    public void z(WZ wZ) {
        this.l = wZ;
        this.repaint();
    }

    public WZ f() {
        return this.l;
    }

    @Nullable
    public WZ I() {
        return this.b(false);
    }

    @Nullable
    public WZ e() {
        return this.b(true);
    }

    @Nullable
    protected WZ b(boolean bl) {
        block15: {
            block19: {
                pa_1 pa_12;
                block17: {
                    pe_1 pe_12;
                    boolean bl2;
                    int n10;
                    block16: {
                        WZ wZ;
                        block14: {
                            n10 = _y_0.y();
                            try {
                                try {
                                    wZ = this.l;
                                    if (n10 != 0) break block14;
                                    if (wZ == null) break block15;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                wZ = this.l;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                        }
                        try {
                            bl2 = wZ.B().isEmpty();
                            if (n10 != 0) break block16;
                            if (bl2) break block15;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        bl2 = bl;
                    }
                    try {
                        pe_12 = bl2 ? this.l.T() : this.l.U();
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    pe_1 pe_13 = pe_12;
                    try {
                        block18: {
                            try {
                                try {
                                    this.e = new ru_1(new XE(pe_13.s().q, pe_13.s().r - this.V.H()), new XE(pe_13.E().q, pe_13.E().r - this.V.H()));
                                    pa_12 = this;
                                    if (n10 != 0) break block17;
                                    if (pa_12.e.N().r >= this.H().O() / 2) break block18;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                this.i.setValue(this.e.N().r - this.H().O() / 2);
                                if (n10 == 0) break block19;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                        }
                        pa_12 = this;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                pa_12.i.setValue(0);
            }
            this.repaint();
            return this.l;
        }
        return null;
    }

    @Override
    public void W(YT yT) {
        this.x = yT;
    }

    private boolean X() {
        boolean bl;
        try {
            bl = this.x != YT.MOUSE_REPORTING_NONE;
        }
        catch (IllegalStateException illegalStateException) {
            throw pa_1.a(illegalStateException);
        }
        return bl;
    }

    private void R() {
        int n10 = 1;
        int n11 = this.w.T.r - 1;
        try {
            if (n11 + n10 >= this.i.getValue() + this.i.getExtent()) {
                this.i.setValue(0);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw pa_1.a(illegalStateException);
        }
    }

    private void f() {
        this.b(-this.N.c());
    }

    private void q() {
        this.b(this.N.c());
    }

    private void p() {
        this.b(-1);
    }

    private void t() {
        this.b(1);
    }

    private void b(int n10) {
        this.i.setValue(this.i.getValue() + n10);
    }

    protected Font s() {
        return this.t.Z();
    }

    @NotNull
    private XE z(Point point) {
        le_0 le_02 = this.t(point);
        return new XE(le_02.N(), le_02.G());
    }

    @NotNull
    private le_0 t(@NotNull Point point) {
        int n10 = Math.min((point.x - this.p()) / this.c4.width, this.U() - 1);
        n10 = Math.max(0, n10);
        int n11 = Math.min(point.y / this.c4.height, this.L() - 1) + this.P;
        return new le_0(n11, n10);
    }

    private void u(@Nullable XE xE2, @Nullable XE xE3, boolean bl) {
        XE xE4;
        block9: {
            block10: {
                block8: {
                    int n10;
                    block7: {
                        n10 = _y_0.M();
                        try {
                            xE4 = xE2;
                            if (n10 == 0) break block7;
                            if (xE4 == null) break block8;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        xE4 = xE3;
                    }
                    try {
                        if (n10 == 0) break block9;
                        if (xE4 != null) break block10;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                return;
            }
            xE4 = xE2;
        }
        String string = a7.v(xE4, xE3, this.V);
        try {
            if (string.length() != 0) {
                this.v.L(string, bl);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw pa_1.a(illegalStateException);
        }
    }

    private void w(boolean bl) {
        String string = this.v.y(bl);
        int n10 = _y_0.y();
        try {
            if (string == null) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw pa_1.a(runtimeException);
        }
        try {
            pa_1 pa_12;
            block12: {
                boolean bl2;
                block10: {
                    block11: {
                        try {
                            bl2 = QP.l;
                            if (n10 != 0) break block10;
                            if (bl2) break block11;
                        }
                        catch (RuntimeException runtimeException) {
                            throw pa_1.a(runtimeException);
                        }
                        string = string.replace(pa_1.a(8959, -23958), "\n");
                    }
                    string = string.replace((char)pa_1.a(3818, 4017640413363442733L), (char)pa_1.a(17557, 477768683314601593L));
                    try {
                        pa_12 = this;
                        if (n10 != 0) break block12;
                        bl2 = pa_12.r;
                    }
                    catch (RuntimeException runtimeException) {
                        throw pa_1.a(runtimeException);
                    }
                }
                if (bl2) {
                    string = pa_1.a(8952, -12528) + string + pa_1.a(8955, -25606);
                }
                pa_12 = this;
            }
            pa_12.cc.s(string, true);
        }
        catch (RuntimeException runtimeException) {
            cl.info("", runtimeException);
        }
    }

    @Nullable
    private String C() {
        return this.v.y(false);
    }

    protected void l(Graphics2D graphics2D, BufferedImage bufferedImage, int n10, int n11, ImageObserver imageObserver) {
        graphics2D.drawImage(bufferedImage, n10, n11, bufferedImage.getWidth(), bufferedImage.getHeight(), imageObserver);
    }

    protected BufferedImage L(int n10, int n11) {
        return new BufferedImage(n10, n11, 1);
    }

    @Nullable
    public OT n() {
        OT oT;
        block6: {
            block5: {
                int n10;
                int n11;
                int n12;
                block4: {
                    n12 = (this.getWidth() - this.p()) / this.c4.width;
                    n11 = this.getHeight() / this.c4.height;
                    int n13 = _y_0.y();
                    try {
                        n10 = n11;
                        if (n13 != 0) break block4;
                        if (n10 <= 0) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    n10 = n12;
                }
                try {
                    if (n10 <= 0) break block5;
                    oT = new OT(n12, n11);
                    break block6;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            oT = null;
        }
        return oT;
    }

    private void G() {
        SwingUtilities.invokeLater(new ny_2(this));
    }

    private void A() {
        SwingUtilities.invokeLater(new yu_0(this));
    }

    public void v(E0 e0) {
        this.cc = e0;
        this.A();
    }

    public void G(@NotNull KeyListener keyListener) {
        this.cT.add(keyListener);
    }

    public void q(@NotNull KeyListener keyListener) {
        this.cT.remove(keyListener);
    }

    @Override
    public void c(@NotNull OT oT, wf_1 wf_12, int n10, int n11, no_1 no_12) {
        block9: {
            pa_1 pa_12;
            block10: {
                block11: {
                    int n12;
                    block8: {
                        n12 = _y_0.y();
                        try {
                            try {
                                if (n12 != 0) break block8;
                                if (oT.equals(this.N)) break block9;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            this.V.h(oT, wf_12, n10, n11, no_12, this.u);
                            this.N = oT;
                            this.setPreferredSize(new Dimension(this.g(), this.J()));
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    try {
                        try {
                            pa_12 = this;
                            if (n12 != 0) break block10;
                            if (pa_12.c == null) break block11;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        SwingUtilities.invokeLater(() -> this.lambda$requestResize$2(wf_12));
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                pa_12 = this;
            }
            SwingUtilities.invokeLater(pa_12::lambda$requestResize$3);
        }
    }

    public void H(xn_2 xn_22) {
        this.c = xn_22;
    }

    private float S() {
        rx_2 rx_22;
        block10: {
            pa_1 pa_12;
            block8: {
                block9: {
                    int n10 = _y_0.M();
                    try {
                        try {
                            try {
                                try {
                                    pa_12 = this;
                                    if (n10 == 0) break block8;
                                    if (!pa_12.V.T()) break block9;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                rx_22 = this.t;
                                if (n10 == 0) break block10;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            if (!rx_22.a()) break block9;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        return 1.0f;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                pa_12 = this;
            }
            rx_22 = pa_12.t;
        }
        return rx_22.N();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean g(FontMetrics var0) {
        block20: {
            var2_1 = 1;
            var3_2 = -1;
            var4_3 = 0;
            var1_4 = _y_0.y();
            while (var4_3 < pa_1.a(20807, 1566352125640494002L)) {
                block23: {
                    block22: {
                        block24: {
                            block25: {
                                block21: {
                                    try {
                                        try {
                                            try {
                                                v0 = Character.isValidCodePoint(var4_3);
                                                if (var1_4 != 0) break block20;
                                                if (var1_4 != 0) break block21;
                                            }
                                            catch (IllegalStateException v1) {
                                                throw pa_1.a(v1);
                                            }
                                            if (v0 == 0) break block22;
                                        }
                                        catch (IllegalStateException v2) {
                                            throw pa_1.a(v2);
                                        }
                                        v3 = (char)var4_3;
                                    }
                                    catch (IllegalStateException v4) {
                                        throw pa_1.a(v4);
                                    }
                                }
                                var5_5 = v3;
                                try {
                                    if (var1_4 != 0) break block23;
                                    if (!pa_1.p((char)var5_5)) break block22;
                                }
                                catch (IllegalStateException v5) {
                                    throw pa_1.a(v5);
                                }
                                var6_6 = var0.charWidth((char)var5_5);
                                try {
                                    try {
                                        try {
                                            try {
                                                v6 = var3_2;
                                                if (var1_4 != 0) break block24;
                                                if (v6 != -1) {
                                                }
                                                ** GOTO lbl60
                                            }
                                            catch (IllegalStateException v7) {
                                                throw pa_1.a(v7);
                                            }
                                            v8 = var6_6;
                                            if (var1_4 != 0) break block25;
                                        }
                                        catch (IllegalStateException v9) {
                                            throw pa_1.a(v9);
                                        }
                                        if (v8 == var3_2) break block22;
                                    }
                                    catch (IllegalStateException v10) {
                                        throw pa_1.a(v10);
                                    }
                                    v8 = 0;
                                }
                                catch (IllegalStateException v11) {
                                    throw pa_1.a(v11);
                                }
                            }
                            var2_1 = v8;
                            try {
                                if (var1_4 == 0) break;
lbl60:
                                // 2 sources

                                v6 = var6_6;
                            }
                            catch (IllegalStateException v12) {
                                throw pa_1.a(v12);
                            }
                        }
                        var3_2 = v6;
                    }
                    ++var4_3;
                }
                if (var1_4 == 0) continue;
            }
            v0 = var2_1;
        }
        return (boolean)v0;
    }

    private static boolean p(char c2) {
        return Character.isLetterOrDigit(c2);
    }

    protected void W(Graphics graphics) {
        block9: {
            Object object;
            Graphics2D graphics2D;
            block10: {
                block11: {
                    Graphics graphics2;
                    int n10;
                    block8: {
                        n10 = _y_0.y();
                        try {
                            try {
                                graphics2 = graphics;
                                if (n10 != 0) break block8;
                                if (!(graphics2 instanceof Graphics2D)) break block9;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            graphics2 = graphics;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    graphics2D = (Graphics2D)graphics2;
                    try {
                        try {
                            object = this.t;
                            if (n10 != 0) break block10;
                            if (!object.D()) break block11;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        object = RenderingHints.VALUE_TEXT_ANTIALIAS_ON;
                        break block10;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                object = RenderingHints.VALUE_TEXT_ANTIALIAS_OFF;
            }
            rx_2 rx_22 = object;
            RenderingHints renderingHints = new RenderingHints(RenderingHints.KEY_TEXT_ANTIALIASING, rx_22);
            graphics2D.setRenderingHints(renderingHints);
        }
    }

    @Override
    @NotNull
    public Color getBackground() {
        return this.r(this.cY.c());
    }

    @NotNull
    private Color r(@NotNull et_0 et_02) {
        return lg_1.H(this.R().o(et_02));
    }

    @Override
    @NotNull
    public Color getForeground() {
        return this.s(this.cY.A());
    }

    @NotNull
    private Color s(@NotNull et_0 et_02) {
        return lg_1.H(this.R().Y(et_02));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void paintComponent(Graphics var1_1) {
        block26: {
            block27: {
                block28: {
                    block24: {
                        block23: {
                            block22: {
                                var3_2 = System.currentTimeMillis();
                                var2_3 = _y_0.y();
                                try {
                                    try {
                                        if (var2_3 != 0) break block22;
                                        if (dd_1.x) {
                                        }
                                        ** GOTO lbl22
                                    }
                                    catch (IllegalStateException v0) {
                                        throw pa_1.a(v0);
                                    }
                                    try {
                                        this.m.a(var1_1);
                                    }
                                    catch (InvocationTargetException v1) {
                                        throw v1.getTargetException();
                                    }
                                }
                                catch (IllegalStateException v2) {
                                    throw pa_1.a(v2);
                                }
                            }
                            try {
                                if (var2_3 == 0) break block23;
lbl22:
                                // 2 sources

                                this.h(var1_1);
                            }
                            catch (IllegalStateException v3) {
                                throw pa_1.a(v3);
                            }
                        }
                        try {
                            block25: {
                                try {
                                    try {
                                        try {
                                            v4 = this;
                                            if (var2_3 != 0) break block24;
                                            if (v4.V.u()) break block25;
                                        }
                                        catch (IllegalStateException v5) {
                                            throw pa_1.a(v5);
                                        }
                                        v4 = this;
                                        if (var2_3 != 0) break block24;
                                    }
                                    catch (IllegalStateException v6) {
                                        throw pa_1.a(v6);
                                    }
                                    if (!v4.cS) break block26;
                                }
                                catch (IllegalStateException v7) {
                                    throw pa_1.a(v7);
                                }
                            }
                            v4 = this;
                        }
                        catch (IllegalStateException v8) {
                            throw pa_1.a(v8);
                        }
                    }
                    try {
                        try {
                            if (var2_3 != 0) break block27;
                            if (v4.L == null) break block28;
                        }
                        catch (IllegalStateException v9) {
                            throw pa_1.a(v9);
                        }
                        this.L.l();
                    }
                    catch (IllegalStateException v10) {
                        throw pa_1.a(v10);
                    }
                }
                this.V.d(false);
                v4 = this;
            }
            v4.cS = false;
        }
    }

    private void g() {
        this.a = null;
        this.cp = null;
    }

    @NotNull
    private YP Y(@NotNull YP yP) {
        aG aG2;
        block10: {
            aG aG3;
            block11: {
                int n10;
                block9: {
                    pa_1 pa_12;
                    block8: {
                        n10 = _y_0.M();
                        try {
                            try {
                                pa_12 = this;
                                if (n10 == 0) break block8;
                                if (!pa_12.t.m()) break block9;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            pa_12 = this;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    return pa_12.y(yP);
                }
                aG3 = yP.n();
                YP yP2 = this.J();
                try {
                    try {
                        aG3.j(yP2.s());
                        aG3.c(yP2.K());
                        aG2 = aG3;
                        if (n10 == 0) break block10;
                        if (!(aG2 instanceof am_0)) break block11;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    return ((am_0)aG3).I(true);
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            aG2 = aG3;
        }
        return aG2.y();
    }

    @NotNull
    private YP J() {
        YP yP;
        block2: {
            YP yP2;
            block3: {
                yP2 = this.a;
                int n10 = _y_0.M();
                try {
                    yP = yP2;
                    if (n10 == 0) break block2;
                    if (yP != null) break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                this.a = yP2 = this.t.z();
            }
            yP = yP2;
        }
        return yP;
    }

    @NotNull
    private YP m() {
        YP yP;
        block2: {
            YP yP2;
            block3: {
                yP2 = this.cp;
                int n10 = _y_0.M();
                try {
                    yP = yP2;
                    if (n10 == 0) break block2;
                    if (yP != null) break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                this.cp = yP2 = this.t.i();
            }
            yP = yP2;
        }
        return yP;
    }

    @NotNull
    private YP Z(@NotNull YP yP) {
        YP yP2 = yP.q();
        YP yP3 = this.t.i();
        yP2.d(yP3.s());
        yP2.p(yP3.K());
        yP2.t(true);
        return yP2;
    }

    private void d(Graphics2D graphics2D) {
        block5: {
            int n10;
            block4: {
                int n11 = _y_0.M();
                try {
                    try {
                        n10 = this.e();
                        if (n11 == 0) break block4;
                        if (n10 == 0) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    n10 = (this.w.Q() + 1) * this.c4.width + this.p();
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            int n12 = n10;
            int n13 = this.w.O() + 1;
            int n14 = n13 * this.c4.height - 3;
            int n15 = this.cf.length() * this.c4.width;
            graphics2D.setColor(this.getBackground());
            graphics2D.fillRect(n12, (n13 - 1) * this.c4.height - 3, n15, this.c4.height);
            graphics2D.setColor(this.getForeground());
            graphics2D.setFont(this.c_);
            graphics2D.drawString(this.cf, n12, n14);
            Stroke stroke = graphics2D.getStroke();
            BasicStroke basicStroke = new BasicStroke(1.0f, 1, 1, 0.0f, new float[]{0.0f, 2.0f, 0.0f, 2.0f}, 0.0f);
            graphics2D.setStroke(basicStroke);
            graphics2D.drawLine(n12, n14, n12 + n15, n14);
            graphics2D.setStroke(stroke);
        }
    }

    private boolean e() {
        int n10;
        block8: {
            block7: {
                String string;
                int n11;
                block6: {
                    n11 = _y_0.y();
                    try {
                        try {
                            string = this.cf;
                            if (n11 != 0) break block6;
                            if (string == null) break block7;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        string = this.cf;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                try {
                    n10 = string.length();
                    if (n11 != 0) break block8;
                    if (n10 <= 0) break block7;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                n10 = 1;
                break block8;
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    private boolean l(int n10, int n11) {
        boolean bl;
        block8: {
            block7: {
                ru_1 ru_12;
                int n12;
                block6: {
                    n12 = _y_0.M();
                    try {
                        try {
                            ru_12 = this.u;
                            if (n12 == 0) break block6;
                            if (ru_12 == null) break block7;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        ru_12 = this.u;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                try {
                    bl = ru_12.s(new XE(n10, n11));
                    if (n12 == 0) break block8;
                    if (!bl) break block7;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void processKeyEvent(KeyEvent keyEvent) {
        this.T(keyEvent);
        this.J(keyEvent.getComponent(), keyEvent.isControlDown());
    }

    /*
     * Unable to fully structure code
     */
    public void T(@NotNull KeyEvent var1_1) {
        block21: {
            block22: {
                block20: {
                    var3_2 = var1_1.getID();
                    var2_3 = _y_0.M();
                    try {
                        v0 = var3_2;
                        v1 = pa_1.a(24511, 3000836296369685831L);
                        if (var2_3 == 0) break block20;
                        if (v0 == v1) {
                        }
                        ** GOTO lbl23
                    }
                    catch (IllegalStateException v2) {
                        throw pa_1.a(v2);
                    }
                    for (KeyListener var5_5 : this.cT) {
                        try {
                            var5_5.keyPressed(var1_1);
                            if (var2_3 != 0) {
                                if (var2_3 != 0) continue;
                                break;
                            }
                            break block21;
                        }
                        catch (IllegalStateException v3) {
                            throw pa_1.a(v3);
                        }
                    }
                    try {
                        if (var2_3 != 0) break block21;
lbl23:
                        // 2 sources

                        v0 = var3_2;
                        v1 = pa_1.a(16267, 2428879593885115768L);
                    }
                    catch (IllegalStateException v4) {
                        throw pa_1.a(v4);
                    }
                }
                try {
                    if (var2_3 == 0) break block22;
                    if (v0 == v1) {
                    }
                    ** GOTO lbl47
                }
                catch (IllegalStateException v5) {
                    throw pa_1.a(v5);
                }
                for (KeyListener var5_5 : this.cT) {
                    try {
                        var5_5.keyTyped(var1_1);
                        if (var2_3 != 0) {
                            if (var2_3 != 0) continue;
                            break;
                        }
                        break block21;
                    }
                    catch (IllegalStateException v6) {
                        throw pa_1.a(v6);
                    }
                }
                try {
                    if (var2_3 != 0) break block21;
lbl47:
                    // 2 sources

                    v0 = var3_2;
                    v1 = pa_1.a(4335, 3355617550698351165L);
                }
                catch (IllegalStateException v7) {
                    throw pa_1.a(v7);
                }
            }
            if (v0 == v1) {
                for (KeyListener var5_5 : this.cT) {
                    var5_5.keyReleased(var1_1);
                    if (var2_3 != 0) continue;
                }
            }
        }
    }

    public int g() {
        return this.c4.width * this.N.R() + this.p();
    }

    public int J() {
        return this.c4.height * this.N.c();
    }

    @Override
    public int U() {
        return this.N.R();
    }

    @Override
    public int L() {
        return this.N.c();
    }

    @Override
    public String U() {
        return this.j;
    }

    @Override
    @Nullable
    public xf_1 k() {
        return lg_1.l(this.getForeground());
    }

    @Override
    @Nullable
    public xf_1 T() {
        return lg_1.l(this.getBackground());
    }

    protected int p() {
        return 0;
    }

    public void N(iy_1 iy_12) {
        this.addMouseListener(new SU(this, iy_12));
        this.addMouseWheelListener(arg_0 -> this.lambda$addTerminalMouseListener$4(iy_12, arg_0));
        this.addMouseMotionListener(new SB(this, iy_12));
    }

    @NotNull
    KeyListener I() {
        return this.c2;
    }

    private int P() {
        int n10;
        block4: {
            block5: {
                int n11 = _y_0.y();
                try {
                    try {
                        n10 = this.c5;
                        if (n11 != 0) break block4;
                        if (n10 == this.t.b()) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    this.V(this.t.b());
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            n10 = this.c5;
        }
        return n10;
    }

    protected void w(Graphics2D graphics2D, BufferedImage bufferedImage, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17) {
        graphics2D.drawImage(bufferedImage, n10, n11, n12, n13, n14, n15, n16, n17, null);
    }

    @NotNull
    private YP y(@NotNull YP yP) {
        YP yP2;
        block15: {
            et_0 et_02;
            aG aG2;
            block13: {
                int n10;
                block14: {
                    boolean bl;
                    SY sY;
                    aG aG3;
                    block11: {
                        block12: {
                            aG2 = new aG(yP);
                            n10 = _y_0.M();
                            try {
                                aG3 = aG2;
                                sY = SY.INVERSE;
                                bl = yP.v(SY.INVERSE);
                                if (n10 == 0) break block11;
                                if (bl) break block12;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            bl = true;
                            break block11;
                        }
                        bl = false;
                    }
                    try {
                        try {
                            aG3.c(sY, bl);
                            et_02 = yP.K();
                            if (n10 == 0) break block13;
                            if (et_02 != null) break block14;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        aG2.c(this.cY.A());
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                try {
                    yP2 = yP;
                    if (n10 == 0) break block15;
                    et_02 = yP2.s();
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            try {
                if (et_02 == null) {
                    aG2.j(this.cY.c());
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw pa_1.a(illegalStateException);
            }
            yP2 = aG2.y();
        }
        return yP2;
    }

    private void I(int n10, int n11, YP yP, j_0 j_02, Graphics2D graphics2D, boolean bl) {
        this.z(n10, n11, yP, j_02, graphics2D, true, bl, true);
    }

    private void r(int n10, int n11, YP yP, j_0 j_02, Graphics2D graphics2D) {
        this.I(n10, n11, yP, j_02, graphics2D, false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void z(int var1_1, int var2_2, YP var3_3, j_0 var4_4, Graphics2D var5_5, boolean var6_6, boolean var7_7, boolean var8_8) {
        block146: {
            block145: {
                block139: {
                    block140: {
                        block143: {
                            block144: {
                                block141: {
                                    block131: {
                                        block132: {
                                            block137: {
                                                block138: {
                                                    block136: {
                                                        block147: {
                                                            block133: {
                                                                block134: {
                                                                    block135: {
                                                                        block128: {
                                                                            block129: {
                                                                                block130: {
                                                                                    block127: {
                                                                                        block125: {
                                                                                            block126: {
                                                                                                block124: {
                                                                                                    block123: {
                                                                                                        block122: {
                                                                                                            block118: {
                                                                                                                block119: {
                                                                                                                    block120: {
                                                                                                                        block116: {
                                                                                                                            block117: {
                                                                                                                                block115: {
                                                                                                                                    block113: {
                                                                                                                                        block114: {
                                                                                                                                            var10_9 = var1_1 * this.c4.width;
                                                                                                                                            var9_10 = _y_0.y();
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    v0 = var2_2 * this.c4.height;
                                                                                                                                                    v1 = var6_6;
                                                                                                                                                    if (var9_10 != 0) break block113;
                                                                                                                                                    if (v1 == 0) break block114;
                                                                                                                                                }
                                                                                                                                                catch (IllegalStateException v2) {
                                                                                                                                                    throw pa_1.a(v2);
                                                                                                                                                }
                                                                                                                                                v3 = 0;
                                                                                                                                                break block115;
                                                                                                                                            }
                                                                                                                                            catch (IllegalStateException v4) {
                                                                                                                                                throw pa_1.a(v4);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v1 = this.cJ;
                                                                                                                                    }
                                                                                                                                    v3 = v1 / 2;
                                                                                                                                }
                                                                                                                                var11_11 = v0 + v3;
                                                                                                                                var12_12 = sd_0.s(var4_4.r(), var4_4.o(), var4_4.length(), this.t.L());
                                                                                                                                try {
                                                                                                                                    v5 = this.c4.height;
                                                                                                                                    v6 = var6_6;
                                                                                                                                    if (var9_10 != 0) break block116;
                                                                                                                                    if (v6 == 0) break block117;
                                                                                                                                }
                                                                                                                                catch (IllegalStateException v7) {
                                                                                                                                    throw pa_1.a(v7);
                                                                                                                                }
                                                                                                                                v6 = 0;
                                                                                                                                break block116;
                                                                                                                            }
                                                                                                                            v6 = this.cJ;
                                                                                                                        }
                                                                                                                        var13_13 = Math.min(v5 - v6, this.getHeight() - var11_11);
                                                                                                                        var14_14 = Math.min(var12_12 * this.c4.width, this.getWidth() - var10_9);
                                                                                                                        try {
                                                                                                                            v8 = var3_3 instanceof yw_0;
                                                                                                                            if (var9_10 != 0) break block118;
                                                                                                                            if (v8 == 0) break block119;
                                                                                                                        }
                                                                                                                        catch (IllegalStateException v9) {
                                                                                                                            throw pa_1.a(v9);
                                                                                                                        }
                                                                                                                        var15_15 = (yw_0)var3_3;
                                                                                                                        try {
                                                                                                                            block121: {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    v10 = var15_15;
                                                                                                                                                    if (var9_10 != 0) break block120;
                                                                                                                                                    if (v10.i() == KO.ALWAYS) break block121;
                                                                                                                                                }
                                                                                                                                                catch (IllegalStateException v11) {
                                                                                                                                                    throw pa_1.a(v11);
                                                                                                                                                }
                                                                                                                                                v8 = (int)this.e(var15_15);
                                                                                                                                                if (var9_10 != 0) break block118;
                                                                                                                                            }
                                                                                                                                            catch (IllegalStateException v12) {
                                                                                                                                                throw pa_1.a(v12);
                                                                                                                                            }
                                                                                                                                            if (v8 == 0) break block119;
                                                                                                                                        }
                                                                                                                                        catch (IllegalStateException v13) {
                                                                                                                                            throw pa_1.a(v13);
                                                                                                                                        }
                                                                                                                                        v10 = var15_15;
                                                                                                                                        if (var9_10 != 0) break block120;
                                                                                                                                    }
                                                                                                                                    catch (IllegalStateException v14) {
                                                                                                                                        throw pa_1.a(v14);
                                                                                                                                    }
                                                                                                                                    if (v10.i() != KO.HOVER) break block119;
                                                                                                                                }
                                                                                                                                catch (IllegalStateException v15) {
                                                                                                                                    throw pa_1.a(v15);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v10 = var15_15.k();
                                                                                                                        }
                                                                                                                        catch (IllegalStateException v16) {
                                                                                                                            throw pa_1.a(v16);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var3_3 = v10;
                                                                                                                }
                                                                                                                v8 = var10_9;
                                                                                                            }
                                                                                                            try {
                                                                                                                if (var9_10 != 0) break block122;
                                                                                                                if (v8 >= 0) {
                                                                                                                }
                                                                                                                ** GOTO lbl124
                                                                                                            }
                                                                                                            catch (IllegalStateException v17) {
                                                                                                                throw pa_1.a(v17);
                                                                                                            }
                                                                                                            v8 = var10_9;
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (var9_10 != 0) break block123;
                                                                                                                if (v8 <= this.getWidth()) {
                                                                                                                }
                                                                                                                ** GOTO lbl124
                                                                                                            }
                                                                                                            catch (IllegalStateException v18) {
                                                                                                                throw pa_1.a(v18);
                                                                                                            }
                                                                                                            v8 = var11_11;
                                                                                                        }
                                                                                                        catch (IllegalStateException v19) {
                                                                                                            throw pa_1.a(v19);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        if (var9_10 != 0) break block124;
                                                                                                        if (v8 >= 0) {
                                                                                                        }
                                                                                                        ** GOTO lbl124
                                                                                                    }
                                                                                                    catch (IllegalStateException v20) {
                                                                                                        throw pa_1.a(v20);
                                                                                                    }
                                                                                                    v8 = var11_11;
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var9_10 != 0) break block125;
                                                                                                        if (v8 <= this.getHeight()) break block126;
                                                                                                    }
                                                                                                    catch (IllegalStateException v21) {
                                                                                                        throw pa_1.a(v21);
                                                                                                    }
lbl124:
                                                                                                    // 4 sources

                                                                                                    return;
                                                                                                }
                                                                                                catch (IllegalStateException v22) {
                                                                                                    throw pa_1.a(v22);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                v23 = (Color)this.cM.F();
                                                                                            }
                                                                                            catch (InvocationTargetException v24) {
                                                                                                throw v24.getTargetException();
                                                                                            }
                                                                                            var5_5.setColor(v23);
                                                                                            v8 = 0;
                                                                                        }
                                                                                        var15_16 = v8;
                                                                                        var16_17 = true;
                                                                                        try {
                                                                                            v25 = var3_3.v(SY.INVERSE);
                                                                                            if (var9_10 != 0) break block127;
                                                                                            if (v25 == 0) break block128;
                                                                                        }
                                                                                        catch (IllegalStateException v26) {
                                                                                            throw pa_1.a(v26);
                                                                                        }
                                                                                        var15_16 = 1;
                                                                                        try {
                                                                                            v27 = (Color)this.cM.N();
                                                                                        }
                                                                                        catch (InvocationTargetException v28) {
                                                                                            throw v28.getTargetException();
                                                                                        }
                                                                                        var5_5.setColor(v27);
                                                                                        try {
                                                                                            v29 = yt_1.i();
                                                                                        }
                                                                                        catch (InvocationTargetException v30) {
                                                                                            throw v30.getTargetException();
                                                                                        }
                                                                                        try {
                                                                                            v31 = v29.h();
                                                                                        }
                                                                                        catch (InvocationTargetException v32) {
                                                                                            throw v32.getTargetException();
                                                                                        }
                                                                                        try {
                                                                                            v25 = (int)((Boolean)v31.J()).booleanValue();
                                                                                        }
                                                                                        catch (InvocationTargetException v33) {
                                                                                            throw v33.getTargetException();
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        if (var9_10 != 0) break block129;
                                                                                        if (v25 == 0) break block130;
                                                                                    }
                                                                                    catch (IllegalStateException v34) {
                                                                                        throw pa_1.a(v34);
                                                                                    }
                                                                                    var17_18 = var5_5.getColor();
                                                                                    var5_5.setColor(pa_1.C(var17_18, pa_1.a(6012, 5448107624863829411L)));
                                                                                }
                                                                                v25 = var3_3.r();
                                                                            }
                                                                            try {
                                                                                if (var9_10 != 0) break block131;
                                                                                if (v25 == 0) break block132;
                                                                            }
                                                                            catch (IllegalStateException v35) {
                                                                                throw pa_1.a(v35);
                                                                            }
                                                                            var17_18 = pa_1.C(new Color(this.R().Q(this.cY.A(var3_3.K())).p()), pa_1.a(15929, 2442573579829159122L));
                                                                            var5_5.setColor(pa_1.C(var17_18, pa_1.a(3619, 8118941228298376377L)));
                                                                            if (var9_10 == 0) break block132;
                                                                        }
                                                                        var17_18 = pa_1.C(new Color(this.R().Q(this.cY.R(var3_3.Z())).p()), pa_1.a(3619, 8118941228298376377L));
                                                                        try {
                                                                            v36 = yt_1.i();
                                                                        }
                                                                        catch (InvocationTargetException v37) {
                                                                            throw v37.getTargetException();
                                                                        }
                                                                        try {
                                                                            v38 = v36.h();
                                                                        }
                                                                        catch (InvocationTargetException v39) {
                                                                            throw v39.getTargetException();
                                                                        }
                                                                        try {
                                                                            v40 = (Boolean)v38.J();
                                                                        }
                                                                        catch (InvocationTargetException v41) {
                                                                            throw v41.getTargetException();
                                                                        }
                                                                        if (v40) break block147;
                                                                        var18_19 = var3_3.Z();
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v42 = var3_3.w();
                                                                                    if (var9_10 != 0) break block133;
                                                                                    if (v42 != 0) break block134;
                                                                                }
                                                                                catch (IllegalStateException v43) {
                                                                                    throw pa_1.a(v43);
                                                                                }
                                                                                v44 = var18_19;
                                                                                if (var9_10 != 0) break block135;
                                                                            }
                                                                            catch (IllegalStateException v45) {
                                                                                throw pa_1.a(v45);
                                                                            }
                                                                            if (v44 == null) break block134;
                                                                        }
                                                                        catch (IllegalStateException v46) {
                                                                            throw pa_1.a(v46);
                                                                        }
                                                                        v44 = var18_19;
                                                                    }
                                                                    try {
                                                                        v42 = v44.q();
                                                                        if (var9_10 != 0) break block133;
                                                                        if (v42 == -1) {
                                                                        }
                                                                        break block134;
                                                                    }
                                                                    catch (IllegalStateException v47) {
                                                                        throw pa_1.a(v47);
                                                                    }
                                                                    try {
                                                                        v48 = (Color)this.cM.F();
                                                                    }
                                                                    catch (InvocationTargetException v49) {
                                                                        throw v49.getTargetException();
                                                                    }
                                                                    var17_18 = v48;
                                                                }
                                                                v42 = var3_3.equals(YP.r);
                                                            }
                                                            if (v42 != 0) {
                                                                try {
                                                                    v50 = (Color)this.cM.F();
                                                                }
                                                                catch (InvocationTargetException v51) {
                                                                    throw v51.getTargetException();
                                                                }
                                                                var17_18 = v50;
                                                            }
                                                            var5_5.setColor(var17_18);
                                                            var5_5.fillRect(var10_9, var11_11, var14_14, var13_13);
                                                            if (var9_10 == 0) break block132;
                                                        }
                                                        var18_19 = var3_3.Z();
                                                        try {
                                                            v52 = var18_19;
                                                            if (var9_10 != 0) break block136;
                                                            if (v52 != null) {
                                                            }
                                                            ** GOTO lbl278
                                                        }
                                                        catch (IllegalStateException v53) {
                                                            throw pa_1.a(v53);
                                                        }
                                                        v52 = var18_19;
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v25 = v52.q();
                                                                    if (var9_10 != 0) break block137;
                                                                    if (v25 == -1) break block138;
                                                                }
                                                                catch (IllegalStateException v54) {
                                                                    throw pa_1.a(v54);
                                                                }
lbl278:
                                                                // 2 sources

                                                                v25 = (int)var3_3.equals(YP.r);
                                                                if (var9_10 != 0) break block137;
                                                            }
                                                            catch (IllegalStateException v55) {
                                                                throw pa_1.a(v55);
                                                            }
                                                            if (v25 != 0) break block138;
                                                        }
                                                        catch (IllegalStateException v56) {
                                                            throw pa_1.a(v56);
                                                        }
                                                        var5_5.setColor(var17_18);
                                                        var5_5.fillRect(var10_9, var11_11, var14_14, var13_13);
                                                    }
                                                    catch (IllegalStateException v57) {
                                                        throw pa_1.a(v57);
                                                    }
                                                }
                                                v25 = (int)var3_3.w();
                                            }
                                            try {
                                                try {
                                                    if (var9_10 != 0) break block131;
                                                    if (v25 == 0) break block132;
                                                }
                                                catch (IllegalStateException v58) {
                                                    throw pa_1.a(v58);
                                                }
                                                var5_5.setColor(var17_18);
                                                var5_5.fillRect(var10_9, var11_11, var14_14, var13_13);
                                            }
                                            catch (IllegalStateException v59) {
                                                throw pa_1.a(v59);
                                            }
                                        }
                                        v25 = var7_7;
                                    }
                                    try {
                                        block142: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (var9_10 != 0) break block139;
                                                            if (v25 != 0) break block140;
                                                        }
                                                        catch (IllegalStateException v60) {
                                                            throw pa_1.a(v60);
                                                        }
                                                        v61 = var3_3.u();
                                                        if (var9_10 != 0) break block141;
                                                    }
                                                    catch (IllegalStateException v62) {
                                                        throw pa_1.a(v62);
                                                    }
                                                    if (!v61) break block142;
                                                }
                                                catch (IllegalStateException v63) {
                                                    throw pa_1.a(v63);
                                                }
                                                var5_5.fillRect(var10_9, var11_11, var14_14, var13_13);
                                                if (var9_10 == 0) break block140;
                                            }
                                            catch (IllegalStateException v64) {
                                                throw pa_1.a(v64);
                                            }
                                        }
                                        try {
                                            v65 = yt_1.i();
                                        }
                                        catch (InvocationTargetException v66) {
                                            throw v66.getTargetException();
                                        }
                                        try {
                                            v67 = v65.h();
                                        }
                                        catch (InvocationTargetException v68) {
                                            throw v68.getTargetException();
                                        }
                                        try {
                                            v61 = (Boolean)v67.J();
                                        }
                                        catch (InvocationTargetException v69) {
                                            throw v69.getTargetException();
                                        }
                                    }
                                    catch (IllegalStateException v70) {
                                        throw pa_1.a(v70);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (var9_10 != 0) break block143;
                                            if (!v61) break block144;
                                        }
                                        catch (IllegalStateException v71) {
                                            throw pa_1.a(v71);
                                        }
                                        v25 = var15_16;
                                        if (var9_10 != 0) break block139;
                                    }
                                    catch (IllegalStateException v72) {
                                        throw pa_1.a(v72);
                                    }
                                    if (v25 == 0) break block140;
                                }
                                catch (IllegalStateException v73) {
                                    throw pa_1.a(v73);
                                }
                            }
                            v61 = false;
                        }
                        var16_17 = v61;
                        var5_5.fillRect(var10_9, var11_11, var14_14, var13_13);
                    }
                    v25 = var4_4.Y();
                }
                if (v25 != 0) {
                    return;
                }
                var17_18 = pa_1.C(new Color(this.R().Q(this.cY.A(var3_3.K())).p()), pa_1.a(3619, 8118941228298376377L));
                try {
                    try {
                        var5_5.setColor(pa_1.C(var17_18, pa_1.a(3619, 8118941228298376377L)));
                        this.R(var1_1, var2_2, var4_4, var3_3, var5_5, var16_17, var8_8);
                        v74 = var3_3.v(SY.UNDERLINED);
                        if (var9_10 != 0) break block145;
                        if (v74 == 0) break block146;
                    }
                    catch (IllegalStateException v75) {
                        throw pa_1.a(v75);
                    }
                    v74 = (var2_2 + 1) * this.c4.height - this.cJ / 2 - this.cW;
                }
                catch (IllegalStateException v76) {
                    throw pa_1.a(v76);
                }
            }
            var18_20 = v74;
            var19_21 = var18_20 - 2;
            var5_5.drawLine(var10_9, var19_21, (var1_1 + var12_12) * this.c4.width + this.p(), var19_21);
        }
    }

    static Color F(xf_1 xf_12, int n10) {
        Color color = new Color(xf_12.U(), xf_12.K(), xf_12.E(), n10);
        return color;
    }

    static Color C(Color color, int n10) {
        Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), n10);
        return color2;
    }

    private boolean e(@NotNull yw_0 yw_02) {
        boolean bl;
        try {
            bl = this.cV == yw_02.g();
        }
        catch (IllegalStateException illegalStateException) {
            throw pa_1.a(illegalStateException);
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void R(int var1_1, int var2_2, @NotNull j_0 var3_3, @NotNull YP var4_4, @NotNull Graphics2D var5_5, boolean var6_6, boolean var7_7) {
        block101: {
            block98: {
                block100: {
                    block99: {
                        block96: {
                            block97: {
                                block117: {
                                    block95: {
                                        block94: {
                                            var9_8 = 1;
                                            var10_9 = 0;
                                            var8_10 = _y_0.y();
                                            var11_11 = 0;
                                            try {
                                                try {
                                                    v0 = this.t.s();
                                                    if (var8_10 != 0) break block94;
                                                    if (!v0) break block95;
                                                }
                                                catch (IllegalStateException v1) {
                                                    throw pa_1.a(v1);
                                                }
                                                v0 = var4_4.v(SY.BOLD);
                                            }
                                            catch (IllegalStateException v2) {
                                                throw pa_1.a(v2);
                                            }
                                        }
                                        if (!v0) break block95;
                                        var12_12 = sd_0.G(var3_3);
                                        if (var8_10 == 0) break block117;
                                    }
                                    var12_12 = var3_3;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v3 = (Color)this.cM.L();
                                                    }
                                                    catch (InvocationTargetException v4) {
                                                        throw v4.getTargetException();
                                                    }
                                                    var5_5.setColor(v3);
                                                    v5 = var4_4.v(SY.INVERSE);
                                                    if (var8_10 != 0) break block96;
                                                    if (v5 != 0) {
                                                    }
                                                    ** GOTO lbl92
                                                }
                                                catch (IllegalStateException v6) {
                                                    throw pa_1.a(v6);
                                                }
                                                v5 = var4_4.a();
                                                if (var8_10 != 0) break block97;
                                            }
                                            catch (IllegalStateException v7) {
                                                throw pa_1.a(v7);
                                            }
                                            if (v5 != 0) {
                                            }
                                            ** GOTO lbl67
                                        }
                                        catch (IllegalStateException v8) {
                                            throw pa_1.a(v8);
                                        }
                                        v5 = (int)var4_4.r();
                                        if (var8_10 == 0) {
                                        }
                                        ** GOTO lbl122
                                    }
                                    catch (IllegalStateException v9) {
                                        throw pa_1.a(v9);
                                    }
                                    if (v5 == 0) break block98;
                                }
                                catch (IllegalStateException v10) {
                                    throw pa_1.a(v10);
                                }
                                var13_13 = pa_1.C(new Color(this.R().Q(this.cY.A(var4_4.s())).p()), pa_1.a(3619, 8118941228298376377L));
                                try {
                                    var5_5.setColor(var13_13);
                                    if (var8_10 == 0) break block98;
lbl67:
                                    // 2 sources

                                    v5 = var4_4.r();
                                }
                                catch (IllegalStateException v11) {
                                    throw pa_1.a(v11);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (var8_10 == 0) {
                                            if (v5 != 0) {
                                            }
                                            break block98;
                                        }
                                        ** GOTO lbl122
                                    }
                                    catch (IllegalStateException v12) {
                                        throw pa_1.a(v12);
                                    }
                                    try {
                                        v13 = (Color)this.cM.F();
                                    }
                                    catch (InvocationTargetException v14) {
                                        throw v14.getTargetException();
                                    }
                                    var5_5.setColor(v13);
                                    if (var8_10 == 0) break block98;
                                }
                                catch (IllegalStateException v15) {
                                    throw pa_1.a(v15);
                                }
lbl92:
                                // 2 sources

                                v5 = var4_4.r();
                            }
                            catch (IllegalStateException v16) {
                                throw pa_1.a(v16);
                            }
                        }
                        try {
                            try {
                                if (var8_10 != 0) break block99;
                                if (v5 != 0) break block100;
                            }
                            catch (IllegalStateException v17) {
                                throw pa_1.a(v17);
                            }
                            v5 = var4_4.w();
                        }
                        catch (IllegalStateException v18) {
                            throw pa_1.a(v18);
                        }
                    }
                    try {
                        if (var8_10 == 0) {
                            if (v5 == 0) break block98;
                        }
                        ** GOTO lbl122
                    }
                    catch (IllegalStateException v19) {
                        throw pa_1.a(v19);
                    }
                }
                var13_13 = pa_1.C(new Color(this.R().Q(this.cY.A(var4_4.K())).p()), pa_1.a(3619, 8118941228298376377L));
                var5_5.setColor(var13_13);
            }
            do lbl-1000:
            // 3 sources

            {
                block115: {
                    block116: {
                        block110: {
                            block111: {
                                block118: {
                                    block114: {
                                        block112: {
                                            block113: {
                                                block108: {
                                                    block109: {
                                                        block106: {
                                                            block107: {
                                                                block104: {
                                                                    block105: {
                                                                        block102: {
                                                                            block103: {
                                                                                v5 = var10_9 + var9_8;
lbl122:
                                                                                // 4 sources

                                                                                if (v5 > var3_3.length()) break;
                                                                                var13_14 = '\u0000';
                                                                                var14_15 = var12_12.r()[var3_3.o() + var10_9];
                                                                                try {
                                                                                    try {
                                                                                        if (var8_10 != 0) break block101;
                                                                                        v20 = var12_12.r()[var3_3.o() + var10_9];
                                                                                        if (var8_10 != 0) break block102;
                                                                                    }
                                                                                    catch (IllegalStateException v21) {
                                                                                        throw pa_1.a(v21);
                                                                                    }
                                                                                    if (v20 != pa_1.a(15592, 5014524581788788246L)) break block103;
                                                                                }
                                                                                catch (IllegalStateException v22) {
                                                                                    throw pa_1.a(v22);
                                                                                }
                                                                                var10_9 += var9_8;
                                                                                var11_11 += var9_8;
                                                                                var13_14 = '\u0001';
                                                                            }
                                                                            v20 = var13_14;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (var8_10 != 0) break block104;
                                                                                if (v20 == '\u0000') break block105;
                                                                            }
                                                                            catch (IllegalStateException v23) {
                                                                                throw pa_1.a(v23);
                                                                            }
                                                                            if (var8_10 == 0) ** GOTO lbl-1000
                                                                        }
                                                                        catch (IllegalStateException v24) {
                                                                            throw pa_1.a(v24);
                                                                        }
                                                                    }
                                                                    try {
                                                                        v25 = this;
                                                                        if (var8_10 != 0) break block106;
                                                                        v20 = (char)v25.k;
                                                                    }
                                                                    catch (IllegalStateException v26) {
                                                                        throw pa_1.a(v26);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (v20 != '\u0000') break block107;
                                                                                v25 = this;
                                                                                if (var8_10 != 0) break block106;
                                                                            }
                                                                            catch (IllegalStateException v27) {
                                                                                throw pa_1.a(v27);
                                                                            }
                                                                            if (v25.c8) break block107;
                                                                        }
                                                                        catch (IllegalStateException v28) {
                                                                            throw pa_1.a(v28);
                                                                        }
                                                                        if (!var7_7) break block107;
                                                                    }
                                                                    catch (IllegalStateException v29) {
                                                                        throw pa_1.a(v29);
                                                                    }
                                                                    this.H.h(var14_15, var1_1 + var11_11, var2_2, sd_0.U(var14_15, false));
                                                                }
                                                                catch (IllegalStateException v30) {
                                                                    throw pa_1.a(v30);
                                                                }
                                                            }
                                                            v25 = this;
                                                        }
                                                        var15_16 = v25.q(var3_3.charAt(var10_9 + var9_8 - 1), var4_4);
                                                        var5_5.setFont(var15_16);
                                                        var16_17 = var5_5.getFontMetrics(var15_16).getDescent();
                                                        var16_17 = this.F;
                                                        try {
                                                            try {
                                                                v31 = this.d.D();
                                                            }
                                                            catch (InvocationTargetException v32) {
                                                                throw v32.getTargetException();
                                                            }
                                                            try {
                                                                v33 = (Font)v31.M();
                                                            }
                                                            catch (InvocationTargetException v34) {
                                                                throw v34.getTargetException();
                                                            }
                                                            v35 = var15_16.getName().equals(v33.getName());
                                                            if (var8_10 != 0) break block108;
                                                            if (v35 != 0) {
                                                            }
                                                            break block109;
                                                        }
                                                        catch (IllegalStateException v36) {
                                                            throw pa_1.a(v36);
                                                        }
                                                        try {
                                                            v37 = this.d.D();
                                                        }
                                                        catch (InvocationTargetException v38) {
                                                            throw v38.getTargetException();
                                                        }
                                                        try {
                                                            v39 = (Integer)v37.A();
                                                        }
                                                        catch (InvocationTargetException v40) {
                                                            throw v40.getTargetException();
                                                        }
                                                        var16_17 = v39;
                                                        ++var16_17;
                                                    }
                                                    v35 = (var2_2 + 1) * this.c4.height - this.cJ / 2 - var16_17 + 4;
                                                }
                                                var17_18 = v35;
                                                var18_19 = (var1_1 + var11_11) * this.c4.width;
                                                try {
                                                    v41 = var6_6;
                                                    if (var8_10 != 0) break block110;
                                                    if (v41 == 0) break block111;
                                                }
                                                catch (IllegalStateException v42) {
                                                    throw pa_1.a(v42);
                                                }
                                                var19_20 = var5_5.getColor();
                                                var20_22 = var5_5.getFontMetrics();
                                                var21_23 = var20_22.charWidth(var14_15);
                                                var22_24 = var20_22.getHeight();
                                                if (var14_15 == pa_1.a(17162, 6332241477127166453L)) break block118;
                                                var23_25 = pa_1.s(var19_20);
                                                var24_26 = var23_25 = new Color(var23_25.getRed(), var23_25.getGreen(), var23_25.getBlue(), pa_1.a(3619, 8118941228298376377L));
                                                var25_27 = var23_25.getRed() * var23_25.getGreen() * var23_25.getBlue();
                                                var26_28 = var14_15 + var15_16.getName() + "" + var15_16.getStyle() + "" + var15_16.getSize() + var25_27;
                                                var27_29 = var10_9;
                                                var28_30 = 4;
                                                var29_31 = null;
                                                try {
                                                    v43 = pa_1.J;
                                                    v44 = var26_28;
                                                    if (var8_10 != 0) break block112;
                                                    if (v43.containsKey(v44)) break block113;
                                                }
                                                catch (IllegalStateException v45) {
                                                    throw pa_1.a(v45);
                                                }
                                                try {
                                                    v46 = (BufferedImage)lk_0.u((int)((float)(var21_23 + var28_30 * 2) * this.y), (int)((float)(var22_24 + var28_30 * 2) * this.y));
                                                }
                                                catch (InvocationTargetException v47) {
                                                    throw v47.getTargetException();
                                                }
                                                var29_31 = v46;
                                                var30_32 = new XC(this, var24_26, var15_16, var22_24, var28_30, var12_12, var3_3, var27_29, var9_8);
                                                var31_33 = var29_31.createGraphics();
                                                var32_34 = new lt_2(null, (D2)var30_32);
                                                try {
                                                    var32_34.Q(true);
                                                }
                                                catch (InvocationTargetException v48) {
                                                    throw v48.getTargetException();
                                                }
                                                try {
                                                    var32_34.w(var31_33, this.y, var29_31.getWidth(), var29_31.getHeight());
                                                }
                                                catch (InvocationTargetException v49) {
                                                    throw v49.getTargetException();
                                                }
                                                try {
                                                    v50 = (BufferedImage)lk_0.t((Object)var29_31, (float)var28_30);
                                                }
                                                catch (InvocationTargetException v51) {
                                                    throw v51.getTargetException();
                                                }
                                                var29_31 = v50;
                                                try {
                                                    v52 = (BufferedImage)lk_0.u(var29_31.getWidth(), var29_31.getHeight());
                                                }
                                                catch (InvocationTargetException v53) {
                                                    throw v53.getTargetException();
                                                }
                                                var33_35 = v52;
                                                var34_36 = var33_35.createGraphics();
                                                for (var35_37 = 0; var35_37 < 4; ++var35_37) {
                                                    try {
                                                        var34_36.drawImage((Image)var29_31, 0, 0, null);
                                                        if (var8_10 == 0) {
                                                            if (var8_10 == 0) continue;
                                                            break;
                                                        }
                                                        break block114;
                                                    }
                                                    catch (IllegalStateException v54) {
                                                        throw pa_1.a(v54);
                                                    }
                                                }
                                                var34_36.dispose();
                                                var29_31 = var33_35;
                                                pa_1.J.put(var26_28, var29_31);
                                                break block114;
                                            }
                                            v43 = pa_1.J;
                                            v44 = var26_28;
                                        }
                                        var29_31 = (BufferedImage)v43.get(v44);
                                    }
                                    var30_32 = var5_5.getTransform();
                                    var31_33 = new AffineTransform(1.0, 0.0, 0.0, 1.0, var30_32.getTranslateX(), var30_32.getTranslateY());
                                    var5_5.setTransform((AffineTransform)var31_33);
                                    var5_5.drawImage((Image)var29_31, (int)((float)(var18_19 - var28_30) * this.y), (int)((float)(var17_18 - var22_24 - var28_30) * this.y), null);
                                    var32_34 = new AffineTransform((double)this.y, 0.0, 0.0, (double)this.y, var30_32.getTranslateX(), var30_32.getTranslateY());
                                    var5_5.setTransform((AffineTransform)var32_34);
                                }
                                var5_5.setColor(var19_20);
                            }
                            v41 = var14_15;
                        }
                        try {
                            v55 = pa_1.a(17162, 6332241477127166453L);
                            if (var8_10 != 0) break block115;
                            if (v41 == v55) break block116;
                        }
                        catch (IllegalStateException v56) {
                            throw pa_1.a(v56);
                        }
                        var19_21 = var18_19;
                        var5_5.drawChars(var12_12.r(), var3_3.o() + var10_9, var9_8, var19_21, var17_18);
                    }
                    var11_11 += var9_8;
                    v41 = var10_9;
                    v55 = var9_8;
                }
                var10_9 = v41 + v55;
            } while (var8_10 == 0);
            var5_5.setClip(null);
        }
    }

    public static Color s(Color color) {
        float f10 = (float)(color.getRed() + color.getGreen() + color.getBlue()) / 3.0f;
        try {
            if (f10 < 90.0f) {
                return Color.white;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw pa_1.a(illegalStateException);
        }
        Color color2 = Color.black;
        return color2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean B(char c2) {
        int n10;
        boolean bl;
        block6: {
            int n11 = _y_0.y();
            try {
                try {
                    try {
                        bl = c2;
                        n10 = pa_1.a(22270, 4742328348634565651L);
                        if (n11 != 0) break block6;
                        if (bl < n10) return false;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    bl = c2;
                    if (n11 != 0) return bl;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                n10 = pa_1.a(29844, 6503920570390933088L);
            }
            catch (IllegalStateException illegalStateException) {
                throw pa_1.a(illegalStateException);
            }
        }
        if (bl > n10) return false;
        return true;
    }

    protected Font q(char c2, YP yP) {
        boolean bl;
        Font font;
        Font font2;
        block56: {
            boolean bl2;
            block57: {
                Font font3;
                block58: {
                    char c3;
                    um_2 um_22;
                    int n10;
                    um_2 um_23;
                    block55: {
                        char c4;
                        um_2 um_24;
                        block54: {
                            block52: {
                                block53: {
                                    um_2 um_25;
                                    block59: {
                                        um_2 um_26;
                                        block50: {
                                            block51: {
                                                um_2 um_27;
                                                um_2 um_28;
                                                um_2 um_29;
                                                try {
                                                    um_29 = (um_2)this.d.D();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                um_23 = um_29;
                                                try {
                                                    um_28 = (um_2)this.d.a();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                um_25 = um_28;
                                                n10 = _y_0.M();
                                                try {
                                                    um_27 = (um_2)this.d.R();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                um_24 = um_27;
                                                um_22 = null;
                                                Object var8_8 = null;
                                                c3 = '\u0000';
                                                char c5 = c2;
                                                try {
                                                    Font font4;
                                                    um_26 = um_23;
                                                    if (n10 == 0) break block50;
                                                    try {
                                                        font4 = (Font)um_26.V();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    if (!font4.canDisplay(c2)) break block51;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw pa_1.a(illegalStateException);
                                                }
                                                um_22 = um_23;
                                                break block59;
                                            }
                                            um_26 = um_24;
                                        }
                                        um_22 = um_26;
                                    }
                                    try {
                                        try {
                                            Font font5;
                                            try {
                                                c4 = pa_1.B(c2);
                                                if (n10 == 0) break block52;
                                                if (c4 != '\u0000') {
                                                }
                                                break block53;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw pa_1.a(illegalStateException);
                                            }
                                            try {
                                                font5 = (Font)um_25.V();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            c4 = (char)(font5.canDisplay(c2) ? 1 : 0);
                                            if (n10 == 0) break block52;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw pa_1.a(illegalStateException);
                                        }
                                        if (c4 == '\u0000') break block53;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw pa_1.a(illegalStateException);
                                    }
                                    um_22 = um_25;
                                }
                                c4 = c2;
                            }
                            try {
                                try {
                                    if (n10 == 0) break block54;
                                    if (c4 != pa_1.a(21066, 5011282699961747627L)) break block55;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                c4 = '\u0000';
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                        }
                        c3 = c4;
                        um_22 = um_24;
                    }
                    font2 = null;
                    font3 = null;
                    font = null;
                    Font font6 = null;
                    if (c3 != '\u0000') {
                        Font font7;
                        Font font8;
                        Font font9;
                        Font font10;
                        try {
                            font10 = (Font)um_23.M();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        font2 = font10;
                        try {
                            font9 = (Font)um_23.M();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        font3 = font9;
                        try {
                            font8 = (Font)um_23.M();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        font = font8;
                        try {
                            font7 = (Font)um_23.M();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        font6 = font7;
                    } else {
                        Font font11;
                        Font font12;
                        Font font13;
                        Font font14;
                        try {
                            font14 = (Font)um_22.V();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        font2 = font14;
                        try {
                            font13 = (Font)um_22.l();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        font3 = font13;
                        try {
                            font12 = (Font)um_22.F();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        font = font12;
                        try {
                            font11 = (Font)um_22.A();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        font6 = font11;
                    }
                    boolean bl3 = yP.v(SY.BOLD);
                    bl2 = yP.v(SY.ITALIC);
                    try {
                        try {
                            try {
                                bl = bl3;
                                if (n10 == 0) break block56;
                                if (!bl) break block57;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            if (!bl2) break block58;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        return font6;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                return font3;
            }
            bl = bl2;
        }
        try {
            if (bl) {
                return font;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw pa_1.a(illegalStateException);
        }
        return font2;
    }

    private static int P(char[] cArray, int n10, int n11) {
        int n12;
        block8: {
            int n13 = n10;
            int n14 = _y_0.y();
            for (int i2 = n10; i2 < n11; ++i2) {
                block7: {
                    try {
                        int n15;
                        char[] cArray2;
                        try {
                            try {
                                cArray2 = cArray;
                                n15 = i2;
                                if (n14 != 0) break block7;
                                n12 = cArray2[n15];
                                if (n14 != 0) break block8;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            if (n12 == pa_1.a(15592, 5014524581788788246L)) continue;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        cArray2 = cArray;
                        n15 = n13++;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                cArray2[n15] = cArray[i2];
                if (n14 == 0) continue;
            }
            Arrays.fill(cArray, n13, n11, (char)pa_1.a(15592, 5014524581788788246L));
            n12 = n13;
        }
        return n12;
    }

    private static int C(char[] cArray, @NotNull BreakIterator breakIterator, int n10, int n11) {
        int n12;
        block17: {
            int n13 = _y_0.M();
            while (pa_1.g(cArray, n10, n11)) {
                block20: {
                    int n14;
                    int n15;
                    block21: {
                        int n16;
                        block18: {
                            n15 = breakIterator.next();
                            try {
                                try {
                                    block19: {
                                        try {
                                            try {
                                                try {
                                                    n12 = n15;
                                                    if (n13 == 0) break block17;
                                                    n16 = -1;
                                                    if (n13 == 0) break block18;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw pa_1.a(illegalStateException);
                                                }
                                                if (n12 != n16) break block19;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw pa_1.a(illegalStateException);
                                            }
                                            if (n13 != 0) break;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw pa_1.a(illegalStateException);
                                        }
                                    }
                                    n14 = n15 - n11;
                                    if (n13 == 0) break block20;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                n16 = 1;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (n14 != n16) break block21;
                                    n14 = pa_1.z(cArray, n11) ? 1 : 0;
                                    if (n13 == 0) break block20;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                if (n14 != 0) break block21;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            breakIterator.previous();
                            if (n13 != 0) break;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    n10 = n11;
                    n14 = n11 = n15;
                }
                if (n13 != 0) continue;
            }
            n12 = n11;
        }
        return n12;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean g(char[] cArray, int n10, int n11) {
        int n12;
        int c2;
        block18: {
            int n13;
            block16: {
                block17: {
                    block14: {
                        block15: {
                            n13 = _y_0.M();
                            try {
                                try {
                                    c2 = n11 - n10;
                                    if (n13 == 0) break block14;
                                    if (c2 <= 1) break block15;
                                    return true;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                        }
                        c2 = pa_1.T(cArray, n10, n11) ? 1 : 0;
                    }
                    try {
                        try {
                            if (n13 == 0) break block16;
                            if (c2 == 0) break block17;
                            return true;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                c2 = n11;
            }
            try {
                try {
                    try {
                        n12 = cArray.length;
                        if (n13 == 0) break block18;
                        if (c2 >= n12) return 0 != 0;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    c2 = cArray[n11];
                    if (n13 == 0) return c2 != 0;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                n12 = pa_1.a(29388, 6863381746941913136L);
            }
            catch (IllegalStateException illegalStateException) {
                throw pa_1.a(illegalStateException);
            }
        }
        if (c2 != n12) return 0 != 0;
        return 1 != 0;
    }

    private static boolean z(char[] cArray, int n10) {
        int c2;
        block16: {
            block17: {
                int n11;
                block14: {
                    block15: {
                        block12: {
                            block13: {
                                n11 = _y_0.y();
                                try {
                                    try {
                                        c2 = pa_1.T(cArray, n10, n10 + 1);
                                        if (n11 != 0) break block12;
                                        if (c2 == 0) break block13;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw pa_1.a(illegalStateException);
                                    }
                                    return true;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                            }
                            c2 = cArray[n10];
                        }
                        try {
                            try {
                                if (n11 != 0) break block14;
                                if (c2 != pa_1.a(15592, 5014524581788788246L)) break block15;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            return true;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    c2 = cArray[n10];
                }
                try {
                    try {
                        if (n11 != 0) break block16;
                        if (Character.UnicodeBlock.of(c2) != Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_ARROWS) break block17;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    c2 = 1;
                    break block16;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            c2 = 0;
        }
        return c2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean T(char[] cArray, int n10, int n11) {
        int n12;
        int n13;
        int n14;
        int n15;
        block26: {
            n15 = _y_0.y();
            try {
                n14 = n11 - n10;
                if (n15 != 0) return n14 != 0;
                if (n14 != 1) return 0 != 0;
            }
            catch (IllegalStateException illegalStateException) {
                throw pa_1.a(illegalStateException);
            }
            n13 = cArray[n10];
            try {
                try {
                    block27: {
                        try {
                            int n16;
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    n14 = n13;
                                                    if (n15 != 0) return n14 != 0;
                                                    if (n14 < pa_1.a(15264, 3501731966444118345L)) return 0 != 0;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw pa_1.a(illegalStateException);
                                                }
                                                n16 = n13;
                                                if (n15 != 0) return n16 != 0;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw pa_1.a(illegalStateException);
                                            }
                                            if (n16 <= pa_1.a(16451, 1099435533531568775L)) return 1 != 0;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw pa_1.a(illegalStateException);
                                        }
                                        n14 = n13;
                                        n12 = pa_1.a(10783, 1332219417578647807L);
                                        if (n15 != 0) break block26;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw pa_1.a(illegalStateException);
                                    }
                                    if (n14 < n12) break block27;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                n16 = n13;
                                if (n15 != 0) return n16 != 0;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            if (n16 <= pa_1.a(3208, 8849915831524169288L)) return 1 != 0;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    n14 = n13;
                    if (n15 != 0) return n14 != 0;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                n12 = pa_1.a(9989, 5082574847427919325L);
            }
            catch (IllegalStateException illegalStateException) {
                throw pa_1.a(illegalStateException);
            }
        }
        try {
            try {
                try {
                    if (n14 < n12) return 0 != 0;
                    n14 = n13;
                    if (n15 != 0) return n14 != 0;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                if (n14 > pa_1.a(8697, 3217464807087094578L)) return 0 != 0;
                return 1 != 0;
            }
            catch (IllegalStateException illegalStateException) {
                throw pa_1.a(illegalStateException);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw pa_1.a(illegalStateException);
        }
    }

    @NotNull
    private Color p(@NotNull YP yP) {
        Color color = this.s(this.cY.A(yP.O()));
        if (yP.v(SY.DIM)) {
            Color color2 = this.r(this.cY.R(yP.Z()));
            color = new Color((color.getRed() + color2.getRed()) / 2, (color.getGreen() + color2.getGreen()) / 2, (color.getBlue() + color2.getBlue()) / 2, color.getAlpha());
        }
        return color;
    }

    @NotNull
    protected Font h(char[] cArray, int n10, int n11, @NotNull YP yP) {
        Font font;
        block25: {
            boolean bl;
            block22: {
                boolean bl2;
                block23: {
                    block24: {
                        int n12;
                        block20: {
                            boolean bl3;
                            block21: {
                                bl3 = yP.v(SY.BOLD);
                                n12 = _y_0.M();
                                bl2 = yP.v(SY.ITALIC);
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        bl = bl3;
                                                        if (n12 == 0) break block20;
                                                        if (!bl) break block21;
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        throw pa_1.a(illegalStateException);
                                                    }
                                                    bl = this.t.s();
                                                    if (n12 == 0) break block20;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw pa_1.a(illegalStateException);
                                                }
                                                if (!bl) break block21;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw pa_1.a(illegalStateException);
                                            }
                                            bl = XP.U(cArray[n10]);
                                            if (n12 == 0) break block20;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw pa_1.a(illegalStateException);
                                        }
                                        if (!bl) break block21;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw pa_1.a(illegalStateException);
                                    }
                                    return this.c_;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                            }
                            bl = bl3;
                        }
                        try {
                            try {
                                try {
                                    if (n12 == 0) break block22;
                                    if (!bl) break block23;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                if (!bl2) break block24;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            font = this.Z;
                            break block25;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    font = this.cL;
                    break block25;
                }
                bl = bl2;
            }
            try {
                font = bl ? this.ck : this.c_;
            }
            catch (IllegalStateException illegalStateException) {
                throw pa_1.a(illegalStateException);
            }
        }
        return font;
    }

    private S3 R() {
        S3 s3;
        Object object;
        Object object2;
        Object object3;
        try {
            object3 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = object3.Z();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            s3 = (S3)object.e();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return s3;
    }

    private void D(Graphics2D graphics2D, int n10, int n11) {
        graphics2D.setColor(this.getBackground());
        graphics2D.fillRect(0, n11, this.getWidth(), this.getHeight() - n11);
        graphics2D.fillRect(n10, 0, this.getWidth() - n10, this.getHeight());
    }

    @Override
    public void l(int n10, int n11, int n12) {
        this.D.addAndGet(n12);
        this.u = null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void S() {
        block5: {
            int n10 = _y_0.M();
            this.V.w();
            int n11 = n10;
            try {
                int n12 = this.V.H();
                try {
                    if (n11 == 0 || n12 <= 0) break block5;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                int n13 = this.N.c();
                this.i.setRangeProperties(-n12, n12 + n13, -n12, n13, false);
                nt_0 nt_02 = new nt_0(this, n12, n13);
                this.V.P(nt_02);
                this.i.addChangeListener(new ly_2(this, nt_02));
            }
            finally {
                this.V.h();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void l(boolean var1_1) {
        block23: {
            block20: {
                block22: {
                    block21: {
                        block18: {
                            block19: {
                                var3_2 = this.D.getAndSet(0);
                                var2_3 = _y_0.y();
                                try {
                                    try {
                                        try {
                                            v0 = var3_2;
                                            if (var2_3 != 0) break block18;
                                            if (v0 != 0) break block19;
                                        }
                                        catch (IllegalStateException v1) {
                                            throw pa_1.a(v1);
                                        }
                                        v0 = (int)var1_1;
                                        if (var2_3 != 0) break block18;
                                    }
                                    catch (IllegalStateException v2) {
                                        throw pa_1.a(v2);
                                    }
                                    if (v0 != 0) break block19;
                                }
                                catch (IllegalStateException v3) {
                                    throw pa_1.a(v3);
                                }
                                return;
                            }
                            try {
                                v4 = this;
                                if (var2_3 != 0) break block20;
                                v0 = (int)v4.X;
                            }
                            catch (IllegalStateException v5) {
                                throw pa_1.a(v5);
                            }
                        }
                        if (v0 == 0) ** GOTO lbl56
                        var4_4 = this.i.getValue();
                        var5_5 = this.V.H();
                        try {
                            try {
                                if (var2_3 != 0) break block21;
                                if (var4_4 == 0) {
                                }
                                ** GOTO lbl49
                            }
                            catch (IllegalStateException v6) {
                                throw pa_1.a(v6);
                            }
                            this.i.setRangeProperties(0, this.N.c(), -var5_5, this.N.c(), false);
                        }
                        catch (IllegalStateException v7) {
                            throw pa_1.a(v7);
                        }
                    }
                    try {
                        if (var2_3 == 0) break block22;
lbl49:
                        // 2 sources

                        this.i.setRangeProperties(Math.min(Math.max(var4_4 + var3_2, -var5_5), this.N.c()), this.N.c(), -var5_5, this.N.c(), false);
                    }
                    catch (IllegalStateException v8) {
                        throw pa_1.a(v8);
                    }
                }
                try {
                    if (var2_3 == 0) break block23;
lbl56:
                    // 2 sources

                    v4 = this;
                }
                catch (IllegalStateException v9) {
                    throw pa_1.a(v9);
                }
            }
            v4.i.setRangeProperties(0, this.N.c(), 0, this.N.c(), false);
        }
    }

    @Override
    public void x(int n10, int n11) {
        this.w.z(n10);
        this.w.J(n11);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void e(rp_1 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 3[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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
    public void I() {
        try {
            if (this.t.p()) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw pa_1.a(illegalStateException);
        }
    }

    @Nullable
    public Rectangle u(@NotNull bs_0 bs_02) {
        block8: {
            int n10;
            int n11;
            block7: {
                dc_1 dc_12 = bs_02.A();
                int n12 = _y_0.y();
                n11 = this.V.R(dc_12);
                try {
                    try {
                        n10 = n11;
                        if (n12 != 0) break block7;
                        if (n10 < 0) break block8;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    n10 = bs_02.L() ? 1 : 0;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            try {
                if (n10 == 0) {
                    return this.C(new ws_0(n11, bs_02.m(), bs_02.r() + 1));
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw pa_1.a(illegalStateException);
            }
        }
        return null;
    }

    @NotNull
    private Rectangle C(@NotNull ws_0 ws_02) {
        Point point = new Point(ws_02.I() * this.c4.width + this.p(), ws_02.k() * this.c4.height);
        return new Rectangle(point, new Dimension(this.c4.width * ws_02.j(), this.c4.height));
    }

    @Deprecated
    public BoundedRangeModel B() {
        return this.i;
    }

    @NotNull
    public BoundedRangeModel u() {
        return this.i;
    }

    public im_2 H() {
        return this.V;
    }

    public ru_1 f() {
        return this.u;
    }

    @Override
    public boolean H() {
        return this.t.L();
    }

    @Override
    public void z(boolean bl) {
        this.r = bl;
    }

    public ua_0 k() {
        return this.V.x();
    }

    @Override
    public void G(boolean bl) {
        this.w.d(bl);
    }

    @NotNull
    protected JPopupMenu S(@NotNull cs_1 cs_12) {
        JPopupMenu jPopupMenu = new JPopupMenu();
        aD.m(jPopupMenu, cs_12);
        return jPopupMenu;
    }

    @NotNull
    private cs_1 A(@Nullable ya_1 ya_12, @NotNull MouseEvent mouseEvent) {
        ca_2 ca_22 = yo_1.G(ya_12);
        try {
            if (ca_22 != null) {
                return new gj_0(this, ca_22, mouseEvent);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw pa_1.a(illegalStateException);
        }
        return this;
    }

    @Override
    public void x(boolean bl) {
        this.X = bl;
        if (this.X) {
            // empty if block
        }
        SwingUtilities.invokeLater(this::lambda$setScrollingEnabled$7);
    }

    @Override
    public void N(boolean bl) {
        this.w.a(bl);
    }

    public d__0 O() {
        return this.w;
    }

    public pd_1 n() {
        return this.cc;
    }

    @Override
    public void Y(String string) {
        block5: {
            xn_2 xn_22;
            block4: {
                this.j = string;
                int n10 = _y_0.y();
                try {
                    try {
                        xn_22 = this.c;
                        if (n10 != 0) break block4;
                        if (xn_22 == null) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    xn_22 = this.c;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            xn_22.z(this.j);
        }
    }

    @Override
    public List n() {
        return List.of(new aD(this.t.V(), this::lambda$getActions$8).c(this::L), new aR(this, this.t.f(), this::r).u(pa_1.a(20337, 7489253290795128302L)), new aD(this.t.y(), this::lambda$getActions$9).u(pa_1.a(25435, 3457714252384172427L)).c(this::lambda$getActions$10), new aD(this.t.Z(), this::lambda$getActions$11), new aD(this.t.J(), this::lambda$getActions$12).u(pa_1.a(21323, 3818715481401969031L)).c(this::lambda$getActions$13).P(true), new aD(this.t.z(), this::lambda$getActions$14).c(this::lambda$getActions$15).P(true), new aD(this.t.m(), this::lambda$getActions$16).c(this::lambda$getActions$17), new aD(this.t.K(), this::lambda$getActions$18).c(this::lambda$getActions$19).P(true), new aD(this.t.H(), this::lambda$getActions$20));
    }

    public void E() {
        this.u = new ru_1(new XE(0, -this.V.H()), new XE(this.N.R(), this.V.k()));
    }

    @NotNull
    private Boolean L() {
        String string = this.l();
        if (string != null) {
            try {
                URI uRI = new URI(string);
                uRI.toURL();
                return true;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return false;
    }

    @Nullable
    private String l() {
        block13: {
            Object object;
            KB kB;
            block14: {
                ru_1 ru_12;
                int n10;
                block12: {
                    n10 = _y_0.M();
                    try {
                        try {
                            ru_12 = this.u;
                            if (n10 == 0) break block12;
                            if (ru_12 == null) break block13;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        ru_12 = this.u;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                kB = ru_12.K(this.N.R());
                try {
                    block15: {
                        try {
                            try {
                                try {
                                    object = kB.X;
                                    if (n10 == 0) break block14;
                                    if (object != null) break block15;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                object = kB.S;
                                if (n10 == 0) break block14;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            if (object == null) break block13;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    object = kB.X;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            return a7.v((XE)object, (XE)kB.S, this.V);
        }
        return null;
    }

    protected boolean C() {
        boolean bl;
        block7: {
            block8: {
                int n10 = _y_0.y();
                try {
                    bl = Desktop.isDesktopSupported();
                    if (n10 != 0) break block7;
                    if (!bl) break block8;
                }
                catch (Exception exception) {
                    throw pa_1.a(exception);
                }
                try {
                    String string = this.l();
                    try {
                        if (string != null) {
                            Desktop.getDesktop().browse(new URI(string));
                        }
                    }
                    catch (Exception exception) {
                        throw pa_1.a(exception);
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            bl = false;
        }
        return bl;
    }

    public void n() {
        this.X(true);
    }

    /*
     * Unable to fully structure code
     */
    protected void X(boolean var1_1) {
        block19: {
            block20: {
                block21: {
                    block22: {
                        block18: {
                            var2_2 = _y_0.M();
                            try {
                                try {
                                    v0 = this.V;
                                    if (var2_2 == 0) break block18;
                                    if (v0.T()) break block19;
                                }
                                catch (IllegalStateException v1) {
                                    throw pa_1.a(v1);
                                }
                                v0 = this.V;
                            }
                            catch (IllegalStateException v2) {
                                throw pa_1.a(v2);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            v0.c();
                                            v3 = this;
                                            if (var2_2 == 0) break block20;
                                            if (v3.cE == null) break block21;
                                        }
                                        catch (IllegalStateException v4) {
                                            throw pa_1.a(v4);
                                        }
                                        v5 = var1_1;
                                        if (var2_2 == 0) break block22;
                                    }
                                    catch (IllegalStateException v6) {
                                        throw pa_1.a(v6);
                                    }
                                    if (v5 != 0) {
                                    }
                                    ** GOTO lbl55
                                }
                                catch (IllegalStateException v7) {
                                    throw pa_1.a(v7);
                                }
                                v3 = this;
                                if (var2_2 == 0) break block20;
                            }
                            catch (IllegalStateException v8) {
                                throw pa_1.a(v8);
                            }
                            v5 = v3.cE.I();
                        }
                        catch (IllegalStateException v9) {
                            throw pa_1.a(v9);
                        }
                    }
                    if (v5 <= 0) break block21;
                    var3_3 = this.V.D(this.cE.I() - 1);
                    try {
                        this.V.W();
                        this.cE.q(0);
                        this.w.J(1);
                        this.V.j(var3_3);
                        if (var2_2 != 0) break block21;
lbl55:
                        // 2 sources

                        this.V.W();
                        this.cE.i(0);
                        this.cE.q(1);
                        this.w.z(0);
                        this.w.J(1);
                    }
                    catch (IllegalStateException v10) {
                        throw pa_1.a(v10);
                    }
                }
                this.i.setValue(0);
                this.l(true);
                v3 = this;
            }
            v3.P = this.i.getValue();
        }
    }

    @Override
    public cs_1 c() {
        return this.R;
    }

    @Override
    public void Y(cs_1 cs_12) {
        this.R = cs_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean u(KeyEvent var1_1) {
        block118: {
            block95: {
                var2_2 = _y_0.y();
                v0 = this.e();
                if (var2_2 != 0) ** GOTO lbl17
                try {
                    block119: {
                        if (v0 == 0) break block95;
                        break block119;
                        catch (Exception v1) {
                            throw pa_1.a(v1);
                        }
                    }
                    return false;
                }
                catch (Exception v2) {
                    throw pa_1.a(v2);
                }
            }
            try {
                block117: {
                    block115: {
                        block116: {
                            block139: {
                                block138: {
                                    block137: {
                                        block101: {
                                            block113: {
                                                block114: {
                                                    block135: {
                                                        block134: {
                                                            block102: {
                                                                block104: {
                                                                    block103: {
                                                                        block112: {
                                                                            block110: {
                                                                                block111: {
                                                                                    block132: {
                                                                                        block131: {
                                                                                            block109: {
                                                                                                block129: {
                                                                                                    block108: {
                                                                                                        block107: {
                                                                                                            block106: {
                                                                                                                block105: {
                                                                                                                    block126: {
                                                                                                                        block125: {
                                                                                                                            block99: {
                                                                                                                                block100: {
                                                                                                                                    block98: {
                                                                                                                                        block96: {
                                                                                                                                            block97: {
                                                                                                                                                block120: {
                                                                                                                                                    v0 = var1_1.getKeyCode();
lbl17:
                                                                                                                                                    // 2 sources

                                                                                                                                                    var3_3 = v0;
                                                                                                                                                    var4_5 = var1_1.getKeyChar();
                                                                                                                                                    this.cr = var1_1;
                                                                                                                                                    v3 = var3_3;
                                                                                                                                                    v4 = pa_1.a(14606, 7639814560544170960L);
                                                                                                                                                    if (var2_2 != 0) break block96;
                                                                                                                                                    if (v3 != v4) break block97;
                                                                                                                                                    break block120;
                                                                                                                                                    catch (Exception v5) {
                                                                                                                                                        throw pa_1.a(v5);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    block121: {
                                                                                                                                                        v3 = var4_5;
                                                                                                                                                        v4 = pa_1.a(8389, 6054907174772357660L);
                                                                                                                                                        if (var2_2 != 0) break block96;
                                                                                                                                                        break block121;
                                                                                                                                                        catch (Exception v6) {
                                                                                                                                                            throw pa_1.a(v6);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (v3 != v4) break block97;
                                                                                                                                                }
                                                                                                                                                catch (Exception v7) {
                                                                                                                                                    throw pa_1.a(v7);
                                                                                                                                                }
                                                                                                                                                this.cc.L(new byte[]{pa_1.a(28490, 2987198948788467087L)}, true);
                                                                                                                                                return true;
                                                                                                                                            }
                                                                                                                                            v3 = var4_5;
                                                                                                                                            v4 = pa_1.a(17162, 6332241477127166453L);
                                                                                                                                        }
                                                                                                                                        if (var2_2 != 0) break block98;
                                                                                                                                        try {
                                                                                                                                            block122: {
                                                                                                                                                if (v3 != v4) break block99;
                                                                                                                                                break block122;
                                                                                                                                                catch (Exception v8) {
                                                                                                                                                    throw pa_1.a(v8);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            v3 = var1_1.getModifiersEx();
                                                                                                                                            v4 = pa_1.a(10243, 1355689121900311257L);
                                                                                                                                        }
                                                                                                                                        catch (Exception v9) {
                                                                                                                                            throw pa_1.a(v9);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    v10 = v3 & v4;
                                                                                                                                    if (var2_2 != 0) break block100;
                                                                                                                                    try {
                                                                                                                                        block123: {
                                                                                                                                            if (!v10) break block99;
                                                                                                                                            break block123;
                                                                                                                                            catch (Exception v11) {
                                                                                                                                                throw pa_1.a(v11);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        this.cc.L(new byte[]{0}, true);
                                                                                                                                        v10 = true;
                                                                                                                                    }
                                                                                                                                    catch (Exception v12) {
                                                                                                                                        throw pa_1.a(v12);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                return v10;
                                                                                                                            }
                                                                                                                            var5_6 = this.cc.O(var3_3, var1_1.getModifiers());
                                                                                                                            if (var5_6 == null) break block101;
                                                                                                                            try {
                                                                                                                                block124: {
                                                                                                                                    v13 = var1_1.getModifiers();
                                                                                                                                    if (var2_2 != 0) break block102;
                                                                                                                                    break block124;
                                                                                                                                    catch (Exception v14) {
                                                                                                                                        throw pa_1.a(v14);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (v13 != 0) break block103;
                                                                                                                            }
                                                                                                                            catch (Exception v15) {
                                                                                                                                throw pa_1.a(v15);
                                                                                                                            }
                                                                                                                            var6_7 = this.L.G();
                                                                                                                            try {
                                                                                                                                if (var2_2 != 0) break block104;
                                                                                                                                if (var6_7 == null) break block103;
                                                                                                                            }
                                                                                                                            catch (Exception v16) {
                                                                                                                                throw pa_1.a(v16);
                                                                                                                            }
                                                                                                                            var7_8 = var6_7.H();
                                                                                                                            try {
                                                                                                                                if (var2_2 != 0) break block104;
                                                                                                                                if (var7_8 == null) break block103;
                                                                                                                            }
                                                                                                                            catch (Exception v17) {
                                                                                                                                throw pa_1.a(v17);
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                v18 = yt_1.i();
                                                                                                                            }
                                                                                                                            catch (InvocationTargetException v19) {
                                                                                                                                throw v19.getTargetException();
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                v20 = v18.g();
                                                                                                                            }
                                                                                                                            catch (InvocationTargetException v21) {
                                                                                                                                throw v21.getTargetException();
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                v22 = var7_8.g();
                                                                                                                            }
                                                                                                                            catch (InvocationTargetException v23) {
                                                                                                                                throw v23.getTargetException();
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                v24 = (lv_2)v20.S(v22);
                                                                                                                            }
                                                                                                                            catch (InvocationTargetException v25) {
                                                                                                                                throw v25.getTargetException();
                                                                                                                            }
                                                                                                                            var7_8 = v24;
                                                                                                                            var8_9 = 0;
                                                                                                                            v26 = var3_3;
                                                                                                                            v27 = pa_1.a(2182, 1305540605763424855L);
                                                                                                                            if (var2_2 != 0) break block105;
                                                                                                                            if (v26 == v27) ** GOTO lbl151
                                                                                                                            break block125;
                                                                                                                            catch (Exception v28) {
                                                                                                                                throw pa_1.a(v28);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v13 = var3_3;
                                                                                                                        if (var2_2 != 0) break block102;
                                                                                                                        break block126;
                                                                                                                        catch (Exception v29) {
                                                                                                                            throw pa_1.a(v29);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        block127: {
                                                                                                                            if (v13 != pa_1.a(14606, 7639814560544170960L)) break block103;
                                                                                                                            break block127;
                                                                                                                            catch (Exception v30) {
                                                                                                                                throw pa_1.a(v30);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v26 = var3_3;
                                                                                                                        v27 = pa_1.a(2182, 1305540605763424855L);
                                                                                                                    }
                                                                                                                    catch (Exception v31) {
                                                                                                                        throw pa_1.a(v31);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    if (var2_2 != 0) break block106;
                                                                                                                    if (v26 == v27) {
                                                                                                                    }
                                                                                                                    ** GOTO lbl173
                                                                                                                }
                                                                                                                catch (Exception v32) {
                                                                                                                    throw pa_1.a(v32);
                                                                                                                }
                                                                                                                try {
                                                                                                                    v33 = (Integer)var7_8.H();
                                                                                                                }
                                                                                                                catch (InvocationTargetException v34) {
                                                                                                                    throw v34.getTargetException();
                                                                                                                }
                                                                                                                var8_9 = v33;
                                                                                                                if (var2_2 == 0) break block107;
lbl173:
                                                                                                                // 2 sources

                                                                                                                try {
                                                                                                                    block128: {
                                                                                                                        v26 = var3_3;
                                                                                                                        if (var2_2 != 0) break block108;
                                                                                                                        break block128;
                                                                                                                        catch (Exception v35) {
                                                                                                                            throw pa_1.a(v35);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v27 = pa_1.a(14606, 7639814560544170960L);
                                                                                                                }
                                                                                                                catch (Exception v36) {
                                                                                                                    throw pa_1.a(v36);
                                                                                                                }
                                                                                                            }
                                                                                                            if (v26 == v27) {
                                                                                                                try {
                                                                                                                    v37 = (Integer)var7_8.l();
                                                                                                                }
                                                                                                                catch (InvocationTargetException v38) {
                                                                                                                    throw v38.getTargetException();
                                                                                                                }
                                                                                                                var8_9 = v37;
                                                                                                            }
                                                                                                        }
                                                                                                        v26 = var8_9;
                                                                                                    }
                                                                                                    if (var2_2 != 0) break block109;
                                                                                                    if (v26 != 0) ** GOTO lbl211
                                                                                                    break block129;
                                                                                                    catch (Exception v39) {
                                                                                                        throw pa_1.a(v39);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    block130: {
                                                                                                        this.cc.a(new byte[]{pa_1.a(9982, 7045004594113887292L)});
                                                                                                        this.cc.a(pa_1.a(8950, 20754).getBytes(pa_1.a(8948, 22757)));
                                                                                                        if (var2_2 == 0) break block110;
                                                                                                        break block130;
                                                                                                        catch (Exception v40) {
                                                                                                            throw pa_1.a(v40);
                                                                                                        }
                                                                                                    }
                                                                                                    v26 = var8_9;
                                                                                                }
                                                                                                catch (Exception v41) {
                                                                                                    throw pa_1.a(v41);
                                                                                                }
                                                                                            }
                                                                                            v42 = 1;
                                                                                            if (var2_2 != 0) break block111;
                                                                                            if (v26 != v42) ** GOTO lbl232
                                                                                            break block131;
                                                                                            catch (Exception v43) {
                                                                                                throw pa_1.a(v43);
                                                                                            }
                                                                                        }
                                                                                        this.cc.a(new byte[]{pa_1.a(14606, 7639814560544170960L)});
                                                                                        if (var2_2 == 0) break block110;
                                                                                        break block132;
                                                                                        catch (Exception v44) {
                                                                                            throw pa_1.a(v44);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        block133: {
                                                                                            v26 = var8_9;
                                                                                            if (var2_2 != 0) break block112;
                                                                                            break block133;
                                                                                            catch (Exception v45) {
                                                                                                throw pa_1.a(v45);
                                                                                            }
                                                                                        }
                                                                                        v42 = 2;
                                                                                    }
                                                                                    catch (Exception v46) {
                                                                                        throw pa_1.a(v46);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    if (v26 == v42) {
                                                                                        this.cc.a(new byte[]{pa_1.a(2182, 1305540605763424855L)});
                                                                                    }
                                                                                }
                                                                                catch (Exception v47) {
                                                                                    throw pa_1.a(v47);
                                                                                }
                                                                            }
                                                                            this.cc.K();
                                                                            v26 = 1;
                                                                        }
                                                                        return (boolean)v26;
                                                                    }
                                                                    this.cc.L(var5_6, true);
                                                                }
                                                                v13 = this.t.F();
                                                            }
                                                            if (var2_2 != 0) break block113;
                                                            if (v13 == 0) break block114;
                                                            break block134;
                                                            catch (Exception v48) {
                                                                throw pa_1.a(v48);
                                                            }
                                                        }
                                                        v13 = pa_1.u(var3_3);
                                                        if (var2_2 != 0) break block113;
                                                        break block135;
                                                        catch (Exception v49) {
                                                            throw pa_1.a(v49);
                                                        }
                                                    }
                                                    try {
                                                        block136: {
                                                            if (v13 == 0) break block114;
                                                            break block136;
                                                            catch (Exception v50) {
                                                                throw pa_1.a(v50);
                                                            }
                                                        }
                                                        this.R();
                                                    }
                                                    catch (Exception v51) {
                                                        throw pa_1.a(v51);
                                                    }
                                                }
                                                v13 = 1;
                                            }
                                            return (boolean)v13;
                                        }
                                        v52 = pa_1.W(var1_1);
                                        if (var2_2 != 0) break block115;
                                        if (!v52) break block116;
                                        break block137;
                                        catch (Exception v53) {
                                            throw pa_1.a(v53);
                                        }
                                    }
                                    v52 = Character.isDefined(var4_5);
                                    if (var2_2 != 0) break block115;
                                    break block138;
                                    catch (Exception v54) {
                                        throw pa_1.a(v54);
                                    }
                                }
                                if (!v52) break block116;
                                break block139;
                                catch (Exception v55) {
                                    throw pa_1.a(v55);
                                }
                            }
                            try {
                                block140: {
                                    v52 = this.t.A();
                                    if (var2_2 != 0) break block115;
                                    break block140;
                                    catch (Exception v56) {
                                        throw pa_1.a(v56);
                                    }
                                }
                                if (!v52) break block116;
                            }
                            catch (Exception v57) {
                                throw pa_1.a(v57);
                            }
                            this.cc.s(new String(new char[]{pa_1.a(19061, 3405883887614087355L), pa_1.l(var1_1)}), true);
                            return true;
                        }
                        v52 = Character.isISOControl(var4_5);
                    }
                    if (var2_2 != 0) break block117;
                    try {
                        block141: {
                            if (!v52) break block118;
                            break block141;
                            catch (Exception v58) {
                                throw pa_1.a(v58);
                            }
                        }
                        v52 = this.n(var1_1);
                    }
                    catch (Exception v59) {
                        throw pa_1.a(v59);
                    }
                }
                return v52;
            }
            catch (Exception var3_4) {
                pa_1.cl.error(pa_1.a(8945, -12734), var3_4);
            }
        }
        return false;
    }

    private static char l(@NotNull KeyEvent keyEvent) {
        char c2;
        block4: {
            block5: {
                int n10 = _y_0.y();
                try {
                    try {
                        c2 = keyEvent.getModifiersEx() & pa_1.a(23895, 3985978740999931822L);
                        if (n10 != 0) break block4;
                        if (c2 == '\u0000') break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    return Character.toUpperCase((char)keyEvent.getKeyCode());
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            c2 = Character.toLowerCase((char)keyEvent.getKeyCode());
        }
        return c2;
    }

    private static boolean W(@NotNull KeyEvent keyEvent) {
        int n10;
        block18: {
            block15: {
                int n11;
                block17: {
                    int n12;
                    block16: {
                        block14: {
                            n12 = keyEvent.getModifiersEx();
                            n11 = _y_0.y();
                            try {
                                try {
                                    n10 = n12 & pa_1.a(9381, 8054169350329351806L);
                                    if (n11 != 0) break block14;
                                    if (n10 == 0) break block15;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                n10 = n12 & pa_1.a(30026, 6131735450241626033L);
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                        }
                        try {
                            try {
                                if (n11 != 0) break block16;
                                if (n10 != 0) break block15;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            n10 = n12 & pa_1.a(20807, 1566352125640494002L);
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    try {
                        try {
                            if (n11 != 0) break block17;
                            if (n10 != 0) break block15;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        n10 = n12 & pa_1.a(13931, 6217271788376272022L);
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                try {
                    if (n11 != 0) break block18;
                    if (n10 != 0) break block15;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                n10 = 1;
                break block18;
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    private boolean n(@NotNull KeyEvent keyEvent) {
        int n10;
        block24: {
            block25: {
                int n11;
                block22: {
                    char[] cArray;
                    block23: {
                        char c2;
                        block20: {
                            block21: {
                                n11 = _y_0.M();
                                try {
                                    try {
                                        try {
                                            try {
                                                c2 = pa_1.W(keyEvent);
                                                if (n11 == 0) break block20;
                                                if (c2 == '\u0000') break block21;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw pa_1.a(illegalStateException);
                                            }
                                            c2 = (char)(this.t.A() ? 1 : 0);
                                            if (n11 == 0) break block20;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw pa_1.a(illegalStateException);
                                        }
                                        if (c2 == '\u0000') break block21;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw pa_1.a(illegalStateException);
                                    }
                                    return false;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                            }
                            c2 = keyEvent.getKeyChar();
                        }
                        char c3 = c2;
                        cArray = new char[]{c3};
                        try {
                            try {
                                try {
                                    try {
                                        n10 = c3;
                                        if (n11 == 0) break block22;
                                        if (n10 != pa_1.a(21196, 6893532493504497744L)) break block23;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw pa_1.a(illegalStateException);
                                    }
                                    n10 = keyEvent.getModifiersEx() & pa_1.a(21903, 4275880943809482574L);
                                    if (n11 == 0) break block22;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                if (n10 == 0) break block23;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            return false;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    this.cc.s(new String(cArray), true);
                    n10 = this.t.F() ? 1 : 0;
                }
                try {
                    try {
                        if (n11 == 0) break block24;
                        if (n10 == '\u0000') break block25;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    this.R();
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            n10 = '\u0001';
        }
        return n10 != 0;
    }

    private static boolean u(int n10) {
        int n11;
        block48: {
            block50: {
                int n12 = _y_0.y();
                try {
                    block49: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    n11 = n10;
                                                                                                                    if (n12 != 0) break block48;
                                                                                                                    if (n11 == pa_1.a(20934, 5639302271626824463L)) break block49;
                                                                                                                }
                                                                                                                catch (IllegalStateException illegalStateException) {
                                                                                                                    throw pa_1.a(illegalStateException);
                                                                                                                }
                                                                                                                n11 = n10;
                                                                                                                if (n12 != 0) break block48;
                                                                                                            }
                                                                                                            catch (IllegalStateException illegalStateException) {
                                                                                                                throw pa_1.a(illegalStateException);
                                                                                                            }
                                                                                                            if (n11 == pa_1.a(15830, 4679694503128606480L)) break block49;
                                                                                                        }
                                                                                                        catch (IllegalStateException illegalStateException) {
                                                                                                            throw pa_1.a(illegalStateException);
                                                                                                        }
                                                                                                        n11 = n10;
                                                                                                        if (n12 != 0) break block48;
                                                                                                    }
                                                                                                    catch (IllegalStateException illegalStateException) {
                                                                                                        throw pa_1.a(illegalStateException);
                                                                                                    }
                                                                                                    if (n11 == pa_1.a(31909, 2355902596028819057L)) break block49;
                                                                                                }
                                                                                                catch (IllegalStateException illegalStateException) {
                                                                                                    throw pa_1.a(illegalStateException);
                                                                                                }
                                                                                                n11 = n10;
                                                                                                if (n12 != 0) break block48;
                                                                                            }
                                                                                            catch (IllegalStateException illegalStateException) {
                                                                                                throw pa_1.a(illegalStateException);
                                                                                            }
                                                                                            if (n11 == pa_1.a(30466, 701018757644938732L)) break block49;
                                                                                        }
                                                                                        catch (IllegalStateException illegalStateException) {
                                                                                            throw pa_1.a(illegalStateException);
                                                                                        }
                                                                                        n11 = n10;
                                                                                        if (n12 != 0) break block48;
                                                                                    }
                                                                                    catch (IllegalStateException illegalStateException) {
                                                                                        throw pa_1.a(illegalStateException);
                                                                                    }
                                                                                    if (n11 == pa_1.a(10091, 9214893830608436662L)) break block49;
                                                                                }
                                                                                catch (IllegalStateException illegalStateException) {
                                                                                    throw pa_1.a(illegalStateException);
                                                                                }
                                                                                n11 = n10;
                                                                                if (n12 != 0) break block48;
                                                                            }
                                                                            catch (IllegalStateException illegalStateException) {
                                                                                throw pa_1.a(illegalStateException);
                                                                            }
                                                                            if (n11 == pa_1.a(19709, 5495874836332729879L)) break block49;
                                                                        }
                                                                        catch (IllegalStateException illegalStateException) {
                                                                            throw pa_1.a(illegalStateException);
                                                                        }
                                                                        n11 = n10;
                                                                        if (n12 != 0) break block48;
                                                                    }
                                                                    catch (IllegalStateException illegalStateException) {
                                                                        throw pa_1.a(illegalStateException);
                                                                    }
                                                                    if (n11 == pa_1.a(14606, 7639814560544170960L)) break block49;
                                                                }
                                                                catch (IllegalStateException illegalStateException) {
                                                                    throw pa_1.a(illegalStateException);
                                                                }
                                                                n11 = n10;
                                                                if (n12 != 0) break block48;
                                                            }
                                                            catch (IllegalStateException illegalStateException) {
                                                                throw pa_1.a(illegalStateException);
                                                            }
                                                            if (n11 == pa_1.a(3818, 4017640413363442733L)) break block49;
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            throw pa_1.a(illegalStateException);
                                                        }
                                                        n11 = n10;
                                                        if (n12 != 0) break block48;
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        throw pa_1.a(illegalStateException);
                                                    }
                                                    if (n11 == pa_1.a(27623, 314566508295155990L)) break block49;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw pa_1.a(illegalStateException);
                                                }
                                                n11 = n10;
                                                if (n12 != 0) break block48;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw pa_1.a(illegalStateException);
                                            }
                                            if (n11 == pa_1.a(26961, 7495493721258455949L)) break block49;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw pa_1.a(illegalStateException);
                                        }
                                        n11 = n10;
                                        if (n12 != 0) break block48;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw pa_1.a(illegalStateException);
                                    }
                                    if (n11 == pa_1.a(590, 1313863485245102260L)) break block49;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                n11 = n10;
                                if (n12 != 0) break block48;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            if (n11 != pa_1.a(3444, 1495277792869619617L)) break block50;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    n11 = 1;
                    break block48;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            n11 = 0;
        }
        return n11 != 0;
    }

    /*
     * Loose catch block
     */
    private boolean f(KeyEvent keyEvent) {
        boolean bl;
        block10: {
            block11: {
                int n10;
                block8: {
                    block9: {
                        n10 = _y_0.M();
                        bl = this.e();
                        if (n10 == 0) break block8;
                        try {
                            block12: {
                                if (!bl) break block9;
                                break block12;
                                catch (Exception exception) {
                                    throw pa_1.a(exception);
                                }
                            }
                            return false;
                        }
                        catch (Exception exception) {
                            throw pa_1.a(exception);
                        }
                    }
                    bl = Character.isISOControl(keyEvent.getKeyChar());
                }
                try {
                    if (n10 == 0) break block10;
                    if (bl) break block11;
                }
                catch (Exception exception) {
                    throw pa_1.a(exception);
                }
                try {
                    return this.n(keyEvent);
                }
                catch (Exception exception) {
                    cl.error(pa_1.a(8951, 719), exception);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    boolean Z(KeyEvent var1_1) {
        block66: {
            block67: {
                block64: {
                    block65: {
                        block61: {
                            block53: {
                                block59: {
                                    block57: {
                                        block56: {
                                            block54: {
                                                block52: {
                                                    var3_2 = 1;
                                                    var4_3 = KeyStroke.getKeyStrokeForEvent(var1_1);
                                                    var2_4 = _y_0.y();
                                                    try {
                                                        v0 = (zG)xK.w(var4_3);
                                                    }
                                                    catch (InvocationTargetException v1) {
                                                        throw v1.getTargetException();
                                                    }
                                                    var5_5 = v0;
                                                    try {
                                                        v2 = var5_5;
                                                        if (var2_4 != 0) break block52;
                                                        if (v2 == null) break block53;
                                                    }
                                                    catch (IllegalStateException v3) {
                                                        throw pa_1.a(v3);
                                                    }
                                                    var3_2 = 0;
                                                    v2 = var5_5;
                                                }
                                                try {
                                                    v4 = (Integer)v2.K();
                                                }
                                                catch (InvocationTargetException v5) {
                                                    throw v5.getTargetException();
                                                }
                                                var6_6 = v4;
                                                try {
                                                    block55: {
                                                        try {
                                                            try {
                                                                v6 = var6_6;
                                                                v7 = US.S;
                                                                if (var2_4 != 0) break block54;
                                                                if (v6 != v7) break block55;
                                                            }
                                                            catch (IllegalStateException v8) {
                                                                throw pa_1.a(v8);
                                                            }
                                                            this.A(false);
                                                            if (var2_4 == 0) break block53;
                                                        }
                                                        catch (IllegalStateException v9) {
                                                            throw pa_1.a(v9);
                                                        }
                                                    }
                                                    v6 = var6_6;
                                                    v7 = US.v;
                                                }
                                                catch (IllegalStateException v10) {
                                                    throw pa_1.a(v10);
                                                }
                                            }
                                            try {
                                                if (var2_4 != 0) break block56;
                                                if (v6 == v7) {
                                                }
                                                ** GOTO lbl61
                                            }
                                            catch (IllegalStateException v11) {
                                                throw pa_1.a(v11);
                                            }
                                            this.y();
                                            var3_2 = 0;
                                            try {
                                                if (var2_4 == 0) break block53;
lbl61:
                                                // 2 sources

                                                v6 = var6_6;
                                                v7 = US.Q;
                                            }
                                            catch (IllegalStateException v12) {
                                                throw pa_1.a(v12);
                                            }
                                        }
                                        try {
                                            block58: {
                                                try {
                                                    try {
                                                        if (var2_4 != 0) break block57;
                                                        if (v6 != v7) break block58;
                                                    }
                                                    catch (IllegalStateException v13) {
                                                        throw pa_1.a(v13);
                                                    }
                                                    this.v();
                                                    if (var2_4 == 0) break block53;
                                                }
                                                catch (IllegalStateException v14) {
                                                    throw pa_1.a(v14);
                                                }
                                            }
                                            v6 = var6_6;
                                            v7 = US.V;
                                        }
                                        catch (IllegalStateException v15) {
                                            throw pa_1.a(v15);
                                        }
                                    }
                                    try {
                                        try {
                                            block60: {
                                                try {
                                                    try {
                                                        if (var2_4 != 0) break block59;
                                                        if (v6 == v7) {
                                                        }
                                                        break block60;
                                                    }
                                                    catch (IllegalStateException v16) {
                                                        throw pa_1.a(v16);
                                                    }
                                                    try {
                                                        this.L.x().g();
                                                    }
                                                    catch (InvocationTargetException v17) {
                                                        throw v17.getTargetException();
                                                    }
                                                    if (var2_4 == 0) break block53;
                                                }
                                                catch (IllegalStateException v18) {
                                                    throw pa_1.a(v18);
                                                }
                                            }
                                            v6 = var6_6;
                                            if (var2_4 != 0) break block61;
                                        }
                                        catch (IllegalStateException v19) {
                                            throw pa_1.a(v19);
                                        }
                                        v7 = US.Z;
                                    }
                                    catch (IllegalStateException v20) {
                                        throw pa_1.a(v20);
                                    }
                                }
                                if (v6 == v7) {
                                    block62: {
                                        var7_7 = this.L.G();
                                        try {
                                            block63: {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v21 = var7_7.t();
                                                                if (var2_4 != 0) break block62;
                                                                if (v21) break block63;
                                                            }
                                                            catch (IllegalStateException v22) {
                                                                throw pa_1.a(v22);
                                                            }
                                                            v21 = var7_7.i();
                                                            if (var2_4 != 0) break block62;
                                                        }
                                                        catch (IllegalStateException v23) {
                                                            throw pa_1.a(v23);
                                                        }
                                                        if (v21) break block63;
                                                    }
                                                    catch (IllegalStateException v24) {
                                                        throw pa_1.a(v24);
                                                    }
                                                    this.L.O();
                                                    if (var2_4 == 0) break block53;
                                                }
                                                catch (IllegalStateException v25) {
                                                    throw pa_1.a(v25);
                                                }
                                            }
                                            v21 = true;
                                        }
                                        catch (IllegalStateException v26) {
                                            throw pa_1.a(v26);
                                        }
                                    }
                                    var3_2 = (int)v21;
                                }
                            }
                            v6 = var1_1.isAltDown();
                        }
                        try {
                            try {
                                try {
                                    if (var2_4 != 0) break block64;
                                    if (v6 != 0) break block65;
                                }
                                catch (IllegalStateException v27) {
                                    throw pa_1.a(v27);
                                }
                                v28 = var1_1.isMetaDown();
                                if (var2_4 != 0) break block66;
                            }
                            catch (IllegalStateException v29) {
                                throw pa_1.a(v29);
                            }
                            if (v28 == 0) break block67;
                        }
                        catch (IllegalStateException v30) {
                            throw pa_1.a(v30);
                        }
                    }
                    v6 = 0;
                }
                var3_2 = v6;
            }
            v28 = var3_2;
        }
        if (v28 == 0) {
            // empty if block
        }
        return (boolean)var3_2;
    }

    boolean i(KeyEvent keyEvent) {
        boolean bl;
        block23: {
            block24: {
                block29: {
                    block30: {
                        pa_1 pa_12;
                        block31: {
                            long l2;
                            int n10;
                            int n11;
                            block28: {
                                int n12;
                                block25: {
                                    block27: {
                                        int n13;
                                        block26: {
                                            KeyStroke keyStroke = KeyStroke.getKeyStrokeForEvent(keyEvent);
                                            n12 = _y_0.y();
                                            try {
                                                bl = keyStroke.getModifiers();
                                                if (n12 != 0) break block23;
                                                if (bl) break block24;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw pa_1.a(illegalStateException);
                                            }
                                            n13 = keyEvent.getKeyCode();
                                            try {
                                                int n10 = n13;
                                                n10 = pa_1.a(31892, 8207080409332213258L);
                                                if (n12 != 0) break block25;
                                                if (n11 != n10) break block26;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw pa_1.a(illegalStateException);
                                            }
                                            l2 = System.currentTimeMillis() - this.h;
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            int n10 = this.cw;
                                                            n10 = pa_1.a(24823, 4846036050657573434L);
                                                            if (n12 != 0) break block25;
                                                            if (n11 != n10) break block26;
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            throw pa_1.a(illegalStateException);
                                                        }
                                                        n11 = this.cQ ? 1 : 0;
                                                        if (n12 != 0) break block27;
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        throw pa_1.a(illegalStateException);
                                                    }
                                                    if (n11 == 0) break block26;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw pa_1.a(illegalStateException);
                                                }
                                                this.e();
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw pa_1.a(illegalStateException);
                                            }
                                        }
                                        n11 = n13;
                                    }
                                    n10 = pa_1.a(6575, 3845226340508205932L);
                                }
                                try {
                                    try {
                                        try {
                                            if (n12 != 0) break block28;
                                            if (n11 != n10) break block29;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw pa_1.a(illegalStateException);
                                        }
                                        pa_12 = this;
                                        if (n12 != 0) break block30;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw pa_1.a(illegalStateException);
                                    }
                                    int n10 = pa_12.I;
                                    n10 = pa_1.a(12242, 1489795501300364599L);
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                            }
                            if (n11 == n10) {
                                l2 = System.currentTimeMillis() - this.C;
                                try {
                                    dv_0 dv_02;
                                    if (l2 >= pa_1.b(13230, 6702412725534740752L)) break block31;
                                    try {
                                        dv_02 = (dv_0)this.L.H().r();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    dv_02.requestFocus();
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                            }
                        }
                        pa_12 = this;
                    }
                    pa_12.C = System.currentTimeMillis();
                }
                this.I = keyEvent.getKeyCode();
            }
            bl = true;
        }
        return bl;
    }

    public boolean u() {
        long l2;
        block4: {
            block5: {
                long l3 = System.currentTimeMillis() - this.ce;
                int n10 = _y_0.M();
                try {
                    try {
                        long l4 = l3 - pa_1.b(26412, 8347743596245845392L);
                        l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                        if (n10 == 0) break block4;
                        if (l2 <= 0) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    return false;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            l2 = 1;
        }
        return (boolean)l2;
    }

    public pr_0 N() {
        return this.H;
    }

    public void Y(pr_0 pr_02) {
        this.H = pr_02;
    }

    private void T() {
        this.w(false);
    }

    private void P() {
        this.w(true);
    }

    public void b(boolean bl, boolean bl2) {
        block9: {
            block10: {
                ru_1 ru_12;
                int n10;
                block8: {
                    n10 = _y_0.M();
                    try {
                        try {
                            ru_12 = this.u;
                            if (n10 == 0) break block8;
                            if (ru_12 == null) break block9;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        ru_12 = this.u;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                KB kB = ru_12.K(this.N.R());
                try {
                    try {
                        this.u((XE)kB.X, (XE)kB.S, bl2);
                        if (n10 == 0) break block10;
                        if (!bl) break block9;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    this.u = null;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            this.repaint();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean r(@Nullable KeyEvent var1_1) {
        block23: {
            block24: {
                block22: {
                    block21: {
                        block20: {
                            block19: {
                                block18: {
                                    var2_2 = _y_0.y();
                                    try {
                                        v0 = var1_1;
                                        if (var2_2 != 0) break block18;
                                        if (v0 != null) {
                                        }
                                        ** GOTO lbl-1000
                                    }
                                    catch (IllegalStateException v1) {
                                        throw pa_1.a(v1);
                                    }
                                    v0 = var1_1;
                                }
                                try {
                                    try {
                                        try {
                                            v2 = v0.getKeyCode();
                                            v3 = pa_1.a(28249, 7117702566464058511L);
                                            if (var2_2 != 0) break block19;
                                            if (v2 == v3) {
                                            }
                                            ** GOTO lbl-1000
                                        }
                                        catch (IllegalStateException v4) {
                                            throw pa_1.a(v4);
                                        }
                                        v2 = var1_1.getModifiersEx();
                                        if (var2_2 != 0) break block20;
                                    }
                                    catch (IllegalStateException v5) {
                                        throw pa_1.a(v5);
                                    }
                                    v3 = pa_1.a(20807, 1566352125640494002L);
                                }
                                catch (IllegalStateException v6) {
                                    throw pa_1.a(v6);
                                }
                            }
                            if (v2 == v3) {
                                v2 = 1;
                            } else lbl-1000:
                            // 3 sources

                            {
                                v2 = false;
                            }
                        }
                        var3_3 = v2;
                        try {
                            try {
                                if (!var3_3 || this.u != null) break block21;
                            }
                            catch (IllegalStateException v7) {
                                throw pa_1.a(v7);
                            }
                            v8 = true;
                            break block22;
                        }
                        catch (IllegalStateException v9) {
                            throw pa_1.a(v9);
                        }
                    }
                    v8 = false;
                }
                var4_4 = v8;
                try {
                    this.b(var3_3, false);
                    v10 = var4_4;
                    if (var2_2 != 0) break block23;
                    if (v10) break block24;
                }
                catch (IllegalStateException v11) {
                    throw pa_1.a(v11);
                }
                v10 = true;
                break block23;
            }
            v10 = false;
        }
        return v10;
    }

    private void i() {
        this.b(false, true);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void processInputMethodEvent(InputMethodEvent var1_1) {
        block27: {
            block23: {
                var3_2 = var1_1.getCommittedCharacterCount();
                var2_3 = _y_0.M();
                try {
                    try {
                        if (var2_3 == 0) break block23;
                        if (var3_2 > 0) {
                        }
                        ** GOTO lbl65
                    }
                    catch (IllegalStateException v0) {
                        throw pa_1.a(v0);
                    }
                    this.cf = null;
                }
                catch (IllegalStateException v1) {
                    throw pa_1.a(v1);
                }
            }
            if ((var4_4 = var1_1.getText()) != null) {
                block24: {
                    var5_5 = new StringBuilder();
                    var6_6 = var4_4.first();
                    while (var3_2 > 0) {
                        block25: {
                            block26: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v2 = var6_6;
                                                    if (var2_3 == 0) break block24;
                                                    if (var2_3 == 0) break block25;
                                                }
                                                catch (IllegalStateException v3) {
                                                    throw pa_1.a(v3);
                                                }
                                                if (v2 < pa_1.a(12678, 4931331269067123566L)) break block26;
                                            }
                                            catch (IllegalStateException v4) {
                                                throw pa_1.a(v4);
                                            }
                                            v5 = var6_6;
                                            if (var2_3 == 0) break block25;
                                        }
                                        catch (IllegalStateException v6) {
                                            throw pa_1.a(v6);
                                        }
                                        if (v5 == pa_1.a(15152, 2459836026063495597L)) break block26;
                                    }
                                    catch (IllegalStateException v7) {
                                        throw pa_1.a(v7);
                                    }
                                    var5_5.append(var6_6);
                                }
                                catch (IllegalStateException v8) {
                                    throw pa_1.a(v8);
                                }
                            }
                            v5 = var4_4.next();
                        }
                        var6_6 = v5;
                        --var3_2;
                        if (var2_3 != 0) continue;
                    }
                    v2 = var5_5.length();
                }
                try {
                    if (v2 > 0) {
                        this.cc.s(var5_5.toString(), true);
                    }
                }
                catch (IllegalStateException v9) {
                    throw pa_1.a(v9);
                }
            }
            try {
                if (var2_3 != 0) break block27;
lbl65:
                // 2 sources

                this.cf = pa_1.y(var1_1.getText());
            }
            catch (IllegalStateException v10) {
                throw pa_1.a(v10);
            }
        }
    }

    private static String y(@Nullable AttributedCharacterIterator attributedCharacterIterator) {
        int n10 = _y_0.y();
        try {
            if (attributedCharacterIterator == null) {
                return null;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw pa_1.a(illegalStateException);
        }
        StringBuilder stringBuilder = new StringBuilder();
        char c2 = attributedCharacterIterator.first();
        while (c2 != pa_1.a(10414, 6876554608234541644L)) {
            block12: {
                char c3;
                block13: {
                    try {
                        try {
                            try {
                                try {
                                    c3 = c2;
                                    if (n10 != 0) break block12;
                                    if (c3 < pa_1.a(17162, 6332241477127166453L)) break block13;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                c3 = c2;
                                if (n10 != 0) break block12;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            if (c3 == pa_1.a(14606, 7639814560544170960L)) break block13;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        stringBuilder.append(c2);
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                }
                c3 = c2 = attributedCharacterIterator.next();
            }
            if (n10 == 0) continue;
        }
        return stringBuilder.toString();
    }

    @Override
    public InputMethodRequests getInputMethodRequests() {
        return new n__0(this, null);
    }

    public void H() {
        this.cF.stop();
    }

    @Override
    public void h(Graphics graphics) {
        block41: {
            block42: {
                pa_1 pa_12;
                block43: {
                    String string;
                    Object object;
                    int n10;
                    int n11;
                    block37: {
                        int n12;
                        Graphics2D graphics2D;
                        block38: {
                            Object object2;
                            Graphics2D graphics2D2;
                            String string2;
                            d__0 d__02;
                            YP yP;
                            KB kB;
                            int n13;
                            block44: {
                                block40: {
                                    Object object3;
                                    block39: {
                                        int n14;
                                        block35: {
                                            block36: {
                                                nY nY2;
                                                long l2 = System.currentTimeMillis();
                                                this.H.S();
                                                try {
                                                    nY2 = (nY)this.O.F();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                this.cM = nY2;
                                                graphics2D = (Graphics2D)graphics;
                                                this.y = (float)graphics2D.getTransform().getScaleX();
                                                int n15 = _y_0.M();
                                                graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
                                                n11 = n15;
                                                try {
                                                    try {
                                                        Object object4;
                                                        Object object5;
                                                        Color color;
                                                        try {
                                                            color = (Color)this.cM.F();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        graphics2D.setColor(color);
                                                        try {
                                                            object5 = yt_1.i();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        try {
                                                            object4 = object5.h();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        try {
                                                            n14 = ((Boolean)object4.J()).booleanValue();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        if (n11 == 0) break block35;
                                                        if (n14 != 0) break block36;
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        throw pa_1.a(illegalStateException);
                                                    }
                                                    graphics2D.fillRect(0, 0, this.getWidth(), this.getHeight());
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw pa_1.a(illegalStateException);
                                                }
                                            }
                                            this.V.q(this.P, this.N.c(), new ep_0(this, graphics2D));
                                            n14 = this.w.O();
                                        }
                                        n13 = n14;
                                        try {
                                            n12 = this.P + this.L();
                                            if (n11 == 0) break block37;
                                            if (n12 <= n13) break block38;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw pa_1.a(illegalStateException);
                                        }
                                        n10 = this.w.Q();
                                        kB = this.V.X(n10, n13);
                                        try {
                                            try {
                                                object3 = kB.S;
                                                if (n11 == 0) break block39;
                                                if (object3 == null) break block40;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw pa_1.a(illegalStateException);
                                            }
                                            object3 = kB.S;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw pa_1.a(illegalStateException);
                                        }
                                    }
                                    yP = (YP)object3;
                                    break block44;
                                }
                                yP = this.cY.U();
                            }
                            object = yP;
                            YP yP2 = this.Y((YP)object);
                            boolean bl = this.l(n10, n13);
                            try {
                                d__02 = this.w;
                                string2 = ((Character)kB.X).toString();
                                graphics2D2 = graphics2D;
                                object2 = bl ? yP2 : object;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            d__02.Z(string2, graphics2D2, (YP)object2);
                        }
                        this.d(graphics2D);
                        this.D(graphics2D, this.getWidth(), this.getHeight());
                        n12 = n10 = 0;
                    }
                    while (n10 < this.V.O()) {
                        int n16 = this.V.O() - 1 - n10;
                        object = this.V.D(n16);
                        try {
                            ++n10;
                            if (n11 != 0) {
                                if (n11 != 0) continue;
                                break;
                            }
                            break block41;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    try {
                        pa_12 = this;
                        if (n11 == 0) break block42;
                        if (pa_12.cv == null) break block43;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    KeyEvent keyEvent = this.L.O().c();
                    try {
                        if (n11 == 0) break block41;
                        if (keyEvent == null) break block43;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    int n17 = keyEvent.getKeyCode();
                    try {
                        if (n11 == 0) break block41;
                        if (n17 == pa_1.a(20863, 7415982398466050957L)) {
                        }
                        break block43;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    try {
                        string = (String)this.cv.W();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    object = string;
                }
                pa_12 = this;
            }
            pa_12.cb = System.currentTimeMillis();
        }
    }

    private YP S(YP yP) {
        YP yP2 = yP.q();
        YP yP3 = this.t.Y();
        yP2.d(yP3.s());
        yP2.p(yP3.K());
        yP2.t(true);
        yP2.Z(true);
        return yP2;
    }

    @Override
    public void lostOwnership(Clipboard clipboard, Transferable transferable) {
    }

    public _y_0 X() {
        return this.L;
    }

    public void U(_y_0 _y_02) {
        this.L = _y_02;
    }

    public IR d() {
        return this.s;
    }

    public void Y(IR iR) {
        this.s = iR;
    }

    boolean E() {
        return this.ca;
    }

    public void o() {
        pa_1 pa_12;
        block17: {
            block18: {
                int n10;
                block19: {
                    block20: {
                        n10 = _y_0.y();
                        try {
                            try {
                                try {
                                    try {
                                        pa_12 = this;
                                        if (n10 != 0) break block17;
                                        if (!pa_12.ca) break block18;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw pa_1.a(illegalStateException);
                                    }
                                    pa_12 = this;
                                    if (n10 != 0) break block19;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                if (pa_12.l == null) break block20;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            this.l.Y();
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    this.ca = false;
                    this.i.removeChangeListener(this.p);
                    pa_12 = this;
                }
                try {
                    try {
                        if (n10 != 0) break block17;
                        if (pa_12.b != null) {
                        }
                        break block18;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    try {
                        this.b.Z();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            try {
                lk_0.C(this);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            pa_12 = this;
        }
        pa_12.Z();
    }

    public void j() {
        this.c_ = null;
        this.ck = null;
        this.cL = null;
        this.Z = null;
        this.c4 = null;
        this.N = null;
        this.cc = null;
        this.x = null;
        this.c0 = null;
        this.u = null;
        this.v = null;
        this.c = null;
        this.t = null;
        this.V = null;
        this.cY = null;
        this.w = null;
        this.i = null;
        this.cT = null;
        this.j = null;
        this.R = null;
        this.cf = null;
        this.cF = null;
        this.D = null;
        this.Q = null;
        this.cE = null;
        this.l = null;
        this.cV = null;
        this.c2 = null;
        this.B = null;
        this.W = null;
        this.a = null;
        this.cp = null;
        this.e = null;
        this.s = null;
        this.cv = null;
        this.cH = null;
        this.L = null;
        this.O = null;
        this.cM = null;
        this.d = null;
        this.cr = null;
        this.f = null;
        this.cs = null;
        this.K = null;
        this.S = null;
        this.q = null;
        this.m = null;
        this.H = null;
        this.p = null;
        this.G = null;
        this.b = null;
    }

    public void Z() {
        try {
            yt_1.F.W((Object)new _D(this), dd_1.y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    private boolean lambda$getActions$20(KeyEvent keyEvent) {
        this.t();
        return true;
    }

    private Boolean lambda$getActions$19() {
        boolean bl;
        block2: {
            block3: {
                int n10 = _y_0.M();
                try {
                    bl = this.V.T();
                    if (n10 == 0) break block2;
                    if (bl) break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    private boolean lambda$getActions$18(KeyEvent keyEvent) {
        this.p();
        return true;
    }

    private Boolean lambda$getActions$17() {
        boolean bl;
        block2: {
            block3: {
                int n10 = _y_0.M();
                try {
                    bl = this.V.T();
                    if (n10 == 0) break block2;
                    if (bl) break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    private boolean lambda$getActions$16(KeyEvent keyEvent) {
        this.q();
        return true;
    }

    private Boolean lambda$getActions$15() {
        boolean bl;
        block2: {
            block3: {
                int n10 = _y_0.M();
                try {
                    bl = this.V.T();
                    if (n10 == 0) break block2;
                    if (bl) break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    private boolean lambda$getActions$14(KeyEvent keyEvent) {
        this.f();
        return true;
    }

    private Boolean lambda$getActions$13() {
        boolean bl;
        block2: {
            block3: {
                int n10 = _y_0.y();
                try {
                    bl = this.V.T();
                    if (n10 != 0) break block2;
                    if (bl) break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    private boolean lambda$getActions$12(KeyEvent keyEvent) {
        this.n();
        return true;
    }

    private boolean lambda$getActions$11(KeyEvent keyEvent) {
        this.E();
        return true;
    }

    private Boolean lambda$getActions$10() {
        boolean bl;
        try {
            bl = this.C() != null;
        }
        catch (IllegalStateException illegalStateException) {
            throw pa_1.a(illegalStateException);
        }
        return bl;
    }

    private boolean lambda$getActions$9(KeyEvent keyEvent) {
        this.T();
        return true;
    }

    private boolean lambda$getActions$8(KeyEvent keyEvent) {
        return this.C();
    }

    private void lambda$setScrollingEnabled$7() {
        block6: {
            boolean bl;
            block5: {
                int n10 = _y_0.M();
                this.l(true);
                int n11 = n10;
                try {
                    try {
                        bl = this.T;
                        if (n11 == 0) break block5;
                        if (bl == this.V.T()) break block6;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    this.T = this.V.T();
                    bl = this.t.a();
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            if (bl) {
                Timer timer = new Timer(pa_1.a(3818, 4017640413363442733L), pa_1::lambda$setScrollingEnabled$5);
                timer.addActionListener(arg_0 -> this.lambda$setScrollingEnabled$6(timer, arg_0));
                timer.start();
            }
        }
    }

    private void lambda$setScrollingEnabled$6(Timer timer, ActionEvent actionEvent) {
        this.d();
        timer.stop();
    }

    private static void lambda$setScrollingEnabled$5(ActionEvent actionEvent) {
    }

    private void lambda$addTerminalMouseListener$4(iy_1 iy_12, MouseWheelEvent mouseWheelEvent) {
        block25: {
            Object object;
            int n10;
            block28: {
                block27: {
                    int n11;
                    block26: {
                        block24: {
                            block22: {
                                block23: {
                                    n10 = _y_0.y();
                                    try {
                                        try {
                                            try {
                                                n11 = this.t.t();
                                                if (n10 != 0) break block22;
                                                if (n11 == 0) break block23;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw pa_1.a(illegalStateException);
                                            }
                                            n11 = this.b(mouseWheelEvent);
                                            if (n10 != 0) break block22;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw pa_1.a(illegalStateException);
                                        }
                                        if (n11 == 0) break block23;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw pa_1.a(illegalStateException);
                                    }
                                    this.u = null;
                                    object = this.z(mouseWheelEvent.getPoint());
                                    iy_12.i(object.q, object.r, new E5(mouseWheelEvent));
                                }
                                n11 = this.V.T();
                            }
                            try {
                                try {
                                    if (n10 != 0) break block24;
                                    if (n11 == 0) break block25;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw pa_1.a(illegalStateException);
                                }
                                n11 = this.t.b();
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                        }
                        try {
                            try {
                                if (n10 != 0) break block26;
                                if (n11 == 0) break block25;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            n11 = mouseWheelEvent.getWheelRotation();
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                    }
                    if (n11 >= 0) break block27;
                    object = this.cc.O(pa_1.a(17221, 1421851152661535119L), 0);
                    if (n10 == 0) break block28;
                }
                object = this.cc.O(pa_1.a(11902, 8749279593381508278L), 0);
            }
            for (int i2 = 0; i2 < Math.abs(mouseWheelEvent.getUnitsToScroll()); ++i2) {
                try {
                    this.cc.J((byte[])object);
                    if (n10 == 0) {
                        if (n10 == 0) continue;
                        break;
                    }
                    break block25;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            mouseWheelEvent.consume();
        }
    }

    private void lambda$requestResize$3() {
        this.l(true);
    }

    private void lambda$requestResize$2(wf_1 wf_12) {
        this.c.c(wf_12);
    }

    private void lambda$init$1(ChangeEvent changeEvent) {
        pa_1 pa_12;
        block8: {
            block9: {
                this.P = this.i.getValue();
                this.cS = true;
                int n10 = _y_0.y();
                try {
                    try {
                        try {
                            try {
                                pa_12 = this;
                                if (n10 != 0) break block8;
                                if (pa_12.u == null) break block9;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw pa_1.a(illegalStateException);
                            }
                            pa_12 = this;
                            if (n10 != 0) break block8;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw pa_1.a(illegalStateException);
                        }
                        if (!pa_12.q.isVisible()) break block9;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    this.N();
                    this.q.getParent().doLayout();
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            pa_12 = this;
        }
        pa_12.repaint();
    }

    private void lambda$init$0(JScrollBar jScrollBar, MouseWheelEvent mouseWheelEvent) {
        block5: {
            MouseWheelEvent mouseWheelEvent2;
            pa_1 pa_12;
            block4: {
                int n10 = _y_0.y();
                try {
                    try {
                        pa_12 = this;
                        mouseWheelEvent2 = mouseWheelEvent;
                        if (n10 != 0) break block4;
                        if (!pa_12.m(mouseWheelEvent2)) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw pa_1.a(illegalStateException);
                    }
                    pa_12 = this;
                    mouseWheelEvent2 = mouseWheelEvent;
                }
                catch (IllegalStateException illegalStateException) {
                    throw pa_1.a(illegalStateException);
                }
            }
            pa_12.i(mouseWheelEvent2, jScrollBar);
        }
    }

    static boolean Z(pa_1 pa_12, KeyEvent keyEvent) {
        return pa_12.u(keyEvent);
    }

    static boolean Y(pa_1 pa_12, KeyEvent keyEvent) {
        return pa_12.f(keyEvent);
    }

    static XE x(pa_1 pa_12, Point point) {
        return pa_12.z(point);
    }

    static ru_1 e(pa_1 pa_12) {
        return pa_12.u;
    }

    static XE A(pa_1 pa_12) {
        return pa_12.c0;
    }

    static XE f(pa_1 pa_12, XE xE2) {
        pa_12.c0 = xE2;
        return pa_12.c0;
    }

    static ru_1 t(pa_1 pa_12, ru_1 ru_12) {
        pa_12.u = ru_12;
        return pa_12.u;
    }

    static rx_2 S(pa_1 pa_12) {
        return pa_12.t;
    }

    static void Z(pa_1 pa_12, int n10) {
        pa_12.b(n10);
    }

    static im_2 T(pa_1 pa_12) {
        return pa_12.V;
    }

    static void I(pa_1 pa_12) {
        pa_12.A();
    }

    static d__0 D(pa_1 pa_12) {
        return pa_12.w;
    }

    static BoundedRangeModel y(pa_1 pa_12) {
        return pa_12.i;
    }

    static String r(pa_1 pa_12) {
        return pa_12.C();
    }

    static E0 A(pa_1 pa_12) {
        return pa_12.cc;
    }

    static void f(pa_1 pa_12, Point point, boolean bl) {
        pa_12.u(point, bl);
    }

    static ox_1 c(pa_1 pa_12) {
        return pa_12.B;
    }

    static ox_1 M(pa_1 pa_12, ox_1 ox_12) {
        pa_12.B = ox_12;
        return pa_12.B;
    }

    static boolean D(pa_1 pa_12, MouseEvent mouseEvent) {
        return pa_12.B(mouseEvent);
    }

    static yw_0 C(pa_1 pa_12, Point point) {
        return pa_12.s(point);
    }

    static void O(pa_1 pa_12) {
        pa_12.i();
    }

    static boolean C(pa_1 pa_12, boolean bl) {
        pa_12.cz = bl;
        return pa_12.cz;
    }

    static void Z(pa_1 pa_12, Component component, boolean bl) {
        pa_12.J(component, bl);
    }

    static void H(pa_1 pa_12, boolean bl) {
        pa_12.l(bl);
    }

    static AtomicBoolean p(pa_1 pa_12) {
        return pa_12.Q;
    }

    static void V(pa_1 pa_12) {
        pa_12.h();
    }

    static Logger t() {
        return cl;
    }

    static boolean H(pa_1 pa_12) {
        return pa_12.cq;
    }

    static boolean u(pa_1 pa_12, boolean bl) {
        pa_12.cq = bl;
        return pa_12.cq;
    }

    static wq_0 H(pa_1 pa_12) {
        return pa_12.W;
    }

    static int k(pa_1 pa_12) {
        return pa_12.P();
    }

    static YP Y(pa_1 pa_12, YP yP) {
        return pa_12.y(yP);
    }

    static ov_2 Z(pa_1 pa_12) {
        return pa_12.cY;
    }

    static Color t(pa_1 pa_12, et_0 et_02) {
        return pa_12.r(et_02);
    }

    static void M(pa_1 pa_12, int n10, int n11, j_0 j_02, YP yP, Graphics2D graphics2D, boolean bl, boolean bl2) {
        pa_12.R(n10, n11, j_02, yP, graphics2D, bl, bl2);
    }

    static void G(pa_1 pa_12, int n10, int n11, YP yP, j_0 j_02, Graphics2D graphics2D) {
        pa_12.r(n10, n11, yP, j_02, graphics2D);
    }

    static WZ o(pa_1 pa_12) {
        return pa_12.l;
    }

    static YP a(pa_1 pa_12, YP yP) {
        return pa_12.Z(yP);
    }

    static ru_1 Y(pa_1 pa_12) {
        return pa_12.e;
    }

    static YP l(pa_1 pa_12, YP yP) {
        return pa_12.S(yP);
    }

    static YP S(pa_1 pa_12, YP yP) {
        return pa_12.Y(yP);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block33: {
            block32: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                var21 = new String[15];
                                var19_1 = 0;
                                var18_2 = "\u0098\u00be\u0081#\u0018Q@\u00ac'\t_\u00b8\u00e4f\u0083+m\u0012\u008ac\u0007\u008a\u009b\u0086\u0004I\u0083\u001c\u0087\u00a9\u0014&\u0013\u0004\u0012\u00ef\u00b6\u00e1\u00aa\u0005\u00e0d\u00ee-\u00da\u0006\u8b89\u7f34\u8048\u669f\u56c3\u7208\u0018\u009aN\u00d1\u00f2\u00e4\u00a1\u00ee\u00a7v\u008a\u0092q\u00053\u00e1R\u0086\u000e\u0097\u00eeI\u00f5|d\u0002\u7c8f\u8ddf\u0002\u67de\u62a2%A\u00f3k\u00f8B\u0083\u00f3\u00e9qL1n;\u00baD}O52\u00e0\u00cb-\u00868z\u008fSNhR\u0098#\u00de\u00e0\u00ba\u00e6\u00a3\u0004\u7c68\u8d7e\u9053\u4e85\u00029\u000f\b\u00cf\u009f\u0089\u0082\u0005\u00c0q\u000f\u0004\u6eba\u7aa4\u7f3d\u5b2c\u0002\u5961\u52af";
                                var20_3 = "\u0098\u00be\u0081#\u0018Q@\u00ac'\t_\u00b8\u00e4f\u0083+m\u0012\u008ac\u0007\u008a\u009b\u0086\u0004I\u0083\u001c\u0087\u00a9\u0014&\u0013\u0004\u0012\u00ef\u00b6\u00e1\u00aa\u0005\u00e0d\u00ee-\u00da\u0006\u8b89\u7f34\u8048\u669f\u56c3\u7208\u0018\u009aN\u00d1\u00f2\u00e4\u00a1\u00ee\u00a7v\u008a\u0092q\u00053\u00e1R\u0086\u000e\u0097\u00eeI\u00f5|d\u0002\u7c8f\u8ddf\u0002\u67de\u62a2%A\u00f3k\u00f8B\u0083\u00f3\u00e9qL1n;\u00baD}O52\u00e0\u00cb-\u00868z\u008fSNhR\u0098#\u00de\u00e0\u00ba\u00e6\u00a3\u0004\u7c68\u8d7e\u9053\u4e85\u00029\u000f\b\u00cf\u009f\u0089\u0082\u0005\u00c0q\u000f\u0004\u6eba\u7aa4\u7f3d\u5b2c\u0002\u5961\u52af".length();
                                var17_4 = 3;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 28;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block28;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = " \u00c8\u0083\u00ddE\u00dc\u0006\u00b2<\u00d1C\u000e\u000f";
                                    var20_3 = " \u00c8\u0083\u00ddE\u00dc\u0006\u00b2<\u00d1C\u000e\u000f".length();
                                    var17_4 = 6;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 70;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block28;
                                        break;
                                    }
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block29;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl85
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 107;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 98;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 46;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 6;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 59;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 97;
                                            break;
                                        }
                                        default: {
                                            v15 = 12;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
                                    v8 = v11;
                                    if (v11 != 0) break;
                                    v11 = v8;
                                    v9 = v9;
                                    v14 = v8;
                                    v12 = v9;
                                    v13 = v8;
                                }
lbl85:
                                // 2 sources

                                v16 = v9;
                                v10 = v10;
                            } while (v10 > var22_6);
                            v4 = new String(v16);
                            switch (v3) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl95:
                                // 1 sources

                                ** continue;
                            }
                        }
                        pa_1.ab = var21;
                        pa_1.bb = new String[15];
                        var8_7 = 2055102573854366655L;
                        var14_8 = new long[69];
                        var11_9 = 0;
                        var12_10 = "\u0013y\u0004|\u008c\u00838\u0010\u0001\u0018\u00e6\u00c0\u00f5\u008f\u0096\u00d4\u00a2\u008b\u00eb\u00cb\u0094Sh\u0011\u00b0\u00c0\u0081M\u00c3\u00ce&\u0001\u00ab\u0091\u00bd\u0014\u00d3.)\u00e6\tj\u00c1\n\u00e4\u00ac\u00a7\u00c1P\u0018\u00be].\u00d2\u0006\b\u00adV6\u0001\u00cf\u00d1\u00a1\u008d\u00ac\u00ba\u00979\u00e9mosE\u0001d\u001bq\u00d8L\u001d\u00c9%\u00a2=\u00da#}\u00eb\u00a80h5\u00ff\u0012\u008c<\u0080\u00e2pr$\u00e5\u0090\u0010ky\u00caW\u00d9\u0080(\u0083\u0011q\r\u00a2\u00ff\u00bdbd]\u00f0\u00ea\u00d1\u0085\u00f4\t\u00e0q\u00b0\u00e2\u0014\u00c8\u00e2K\u001f%U\u001dq\u00d30W\u00a7\u008cK\u00c6\u00ac|\u00abRs.\u000et\u00ee\u00d3\u00ba\u00e1\u0097\u0014\u00f6Y\u00a7\u0006JB\u0016W\u00a1GJ\u00fc+\u0080\u00e2\u00b7M\u00b5\u00827\u0080\u00af!\u00ddS\u0091\u0096\u00a2\u00caP\u0096\u00ac\u00c9\u00f9sO\u00c0\u00bc\u00877\u00fd\u008bHb\\\u008f\u0098\u009e\u00b2\u00ae\u0003\u00e6\u0003\u00e17-\nx\u0015\u00fc`n\u001ej\u00ca\u00ef\u00f2:\u00b3\u00a7\u0098\u0089\u00a1\u008d\u00c8\u00d1c\u0018\u00c2]ks\b]\u008e-\u00d9\u0085i\u001b]^4\u00d5\u00f1\u0006\n=\u00d4\u00f5h]\u00a92\u00a4\u00b0\u00cb\u00ef\u00bcBj\u00fd\u00c7\u00d8N\u00c3\u00cb\u0013\u008f&\u00b7+\u0098I\u00ad7i/\u0090\u0085\u0096\u00fa\u00f0\u0083*\u0011s N\u0093\u00c6\u00d4\u000e\u0091B_bi\u00a2_imp3\u0005\u00d0\u001b\u00dcQ\u009b\u00a7\u00b4\u00c8\u0003\u00a8H\n\u0080|\u00a0Jz'\u00df\u00a5\u00a4d\u00ce:\u00a6\u0017\u00eaz\u00ed\u00ba\u000eR\u0092nP\u008d\u00bf\u0086\u00ee]\"\u008a\u00d08\u00a4\u0003\u000b\u00b78#?W\b,\u00ac\u00fe\u0093\u00c6\u00b2\u00f5\u008c\u00d1\u00b0\u00f3\u0092\u00bej\u008d}\u00b0\u0011\u00f9\u0085\u00dbvt\u00dbM\u001fuw=\u0016C\u00a9:\u000e\u0017\u0006QE\u00cb\u00f3k\u0082\u00c5\u00df4\u0019\u00ac1\u00c4\u00fa\u0004\u009e\nM3\u008f\u0003\u00dc\u00f6\u00c8\u00ec?\u0092}\u00941\u0093y\u00110\u00f1\u0087S\u008b\u00fe\u00ad\u001c\u009a\u00fa7\u0082q\u00c9L\u008c\u0085d\u001c\u007fp\u00a2\u00ee\u00e8\u00c6\u00a9\u00c8\u00b7Z\u00e7\u00bc\u00e0Cj\u0006\u008c\u0017\u00afqo.\u0099\u00bct\u00e5?\u0085\u00f1V\f\r\u00b5;\u0096\u0007x\u0016-oe(+p3\u008bh\u0010\u0013\u00c8\u000f\u009b\u00d3t\u0088\u00b3[\u0017\u00d72\u00c4\u00fd\u00a7X>\u00dc\u00f9%PN\u0012\u0013\u00aa\u008b\u00bb\u0089fS\u008f";
                        var13_11 = "\u0013y\u0004|\u008c\u00838\u0010\u0001\u0018\u00e6\u00c0\u00f5\u008f\u0096\u00d4\u00a2\u008b\u00eb\u00cb\u0094Sh\u0011\u00b0\u00c0\u0081M\u00c3\u00ce&\u0001\u00ab\u0091\u00bd\u0014\u00d3.)\u00e6\tj\u00c1\n\u00e4\u00ac\u00a7\u00c1P\u0018\u00be].\u00d2\u0006\b\u00adV6\u0001\u00cf\u00d1\u00a1\u008d\u00ac\u00ba\u00979\u00e9mosE\u0001d\u001bq\u00d8L\u001d\u00c9%\u00a2=\u00da#}\u00eb\u00a80h5\u00ff\u0012\u008c<\u0080\u00e2pr$\u00e5\u0090\u0010ky\u00caW\u00d9\u0080(\u0083\u0011q\r\u00a2\u00ff\u00bdbd]\u00f0\u00ea\u00d1\u0085\u00f4\t\u00e0q\u00b0\u00e2\u0014\u00c8\u00e2K\u001f%U\u001dq\u00d30W\u00a7\u008cK\u00c6\u00ac|\u00abRs.\u000et\u00ee\u00d3\u00ba\u00e1\u0097\u0014\u00f6Y\u00a7\u0006JB\u0016W\u00a1GJ\u00fc+\u0080\u00e2\u00b7M\u00b5\u00827\u0080\u00af!\u00ddS\u0091\u0096\u00a2\u00caP\u0096\u00ac\u00c9\u00f9sO\u00c0\u00bc\u00877\u00fd\u008bHb\\\u008f\u0098\u009e\u00b2\u00ae\u0003\u00e6\u0003\u00e17-\nx\u0015\u00fc`n\u001ej\u00ca\u00ef\u00f2:\u00b3\u00a7\u0098\u0089\u00a1\u008d\u00c8\u00d1c\u0018\u00c2]ks\b]\u008e-\u00d9\u0085i\u001b]^4\u00d5\u00f1\u0006\n=\u00d4\u00f5h]\u00a92\u00a4\u00b0\u00cb\u00ef\u00bcBj\u00fd\u00c7\u00d8N\u00c3\u00cb\u0013\u008f&\u00b7+\u0098I\u00ad7i/\u0090\u0085\u0096\u00fa\u00f0\u0083*\u0011s N\u0093\u00c6\u00d4\u000e\u0091B_bi\u00a2_imp3\u0005\u00d0\u001b\u00dcQ\u009b\u00a7\u00b4\u00c8\u0003\u00a8H\n\u0080|\u00a0Jz'\u00df\u00a5\u00a4d\u00ce:\u00a6\u0017\u00eaz\u00ed\u00ba\u000eR\u0092nP\u008d\u00bf\u0086\u00ee]\"\u008a\u00d08\u00a4\u0003\u000b\u00b78#?W\b,\u00ac\u00fe\u0093\u00c6\u00b2\u00f5\u008c\u00d1\u00b0\u00f3\u0092\u00bej\u008d}\u00b0\u0011\u00f9\u0085\u00dbvt\u00dbM\u001fuw=\u0016C\u00a9:\u000e\u0017\u0006QE\u00cb\u00f3k\u0082\u00c5\u00df4\u0019\u00ac1\u00c4\u00fa\u0004\u009e\nM3\u008f\u0003\u00dc\u00f6\u00c8\u00ec?\u0092}\u00941\u0093y\u00110\u00f1\u0087S\u008b\u00fe\u00ad\u001c\u009a\u00fa7\u0082q\u00c9L\u008c\u0085d\u001c\u007fp\u00a2\u00ee\u00e8\u00c6\u00a9\u00c8\u00b7Z\u00e7\u00bc\u00e0Cj\u0006\u008c\u0017\u00afqo.\u0099\u00bct\u00e5?\u0085\u00f1V\f\r\u00b5;\u0096\u0007x\u0016-oe(+p3\u008bh\u0010\u0013\u00c8\u000f\u009b\u00d3t\u0088\u00b3[\u0017\u00d72\u00c4\u00fd\u00a7X>\u00dc\u00f9%PN\u0012\u0013\u00aa\u008b\u00bb\u0089fS\u008f".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block30;
                            break;
                        }
lbl112:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u0007H\u0085)0\u00ad\u00bamY\u008e\u00e1n\u00f3k\u000f\u00f9";
                            var13_11 = "\u0007H\u0085)0\u00ad\u00bamY\u008e\u00e1n\u00f3k\u000f\u00f9".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block30;
                                break;
                            }
                            break;
                        }
lbl125:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block31;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
                    switch (v20) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl136:
                        // 1 sources

                        ** continue;
                    }
                }
                pa_1.db = var14_8;
                pa_1.eb = new Integer[69];
                var0_14 = 3141786312796678947L;
                var6_15 = new long[3];
                var3_16 = 0;
                var4_17 = "X@\u00fa\u0093\u00fc(\u00afG\u001a\u00fc\u0080^\u0002&y\u00dev\u009a\u001e\u00dd\u0085\u00e0{\u00c7";
                var5_18 = "X@\u00fa\u0093\u00fc(\u00afG\u001a\u00fc\u0080^\u0002&y\u00dev\u009a\u001e\u00dd\u0085\u00e0{\u00c7".length();
                var2_19 = 0;
                while (true) {
                    break block32;
                    break;
                }
lbl148:
                // 1 sources

                while (true) {
                    var6_15[v22] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block33;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
            v22 = var3_16++;
            ** while (true)
        }
        pa_1.fb = var6_15;
        pa_1.gb = new Long[3];
        pa_1.cl = LoggerFactory.getLogger(pa_1.class);
        pa_1.z = 0.05;
        pa_1.J = new HashMap<K, V>();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x22F6) & 0xFFFF;
        if (bb[n12] == null) {
            int n13;
            int n14;
            char[] cArray = ab[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 29;
                    break;
                }
                case 1: {
                    n14 = 254;
                    break;
                }
                case 2: {
                    n14 = 132;
                    break;
                }
                case 3: {
                    n14 = 116;
                    break;
                }
                case 4: {
                    n14 = 120;
                    break;
                }
                case 5: {
                    n14 = 231;
                    break;
                }
                case 6: {
                    n14 = 24;
                    break;
                }
                case 7: {
                    n14 = 197;
                    break;
                }
                case 8: {
                    n14 = 28;
                    break;
                }
                case 9: {
                    n14 = 27;
                    break;
                }
                case 10: {
                    n14 = 237;
                    break;
                }
                case 11: {
                    n14 = 238;
                    break;
                }
                case 12: {
                    n14 = 22;
                    break;
                }
                case 13: {
                    n14 = 228;
                    break;
                }
                case 14: {
                    n14 = 235;
                    break;
                }
                case 15: {
                    n14 = 206;
                    break;
                }
                case 16: {
                    n14 = 112;
                    break;
                }
                case 17: {
                    n14 = 42;
                    break;
                }
                case 18: {
                    n14 = 83;
                    break;
                }
                case 19: {
                    n14 = 169;
                    break;
                }
                case 20: {
                    n14 = 81;
                    break;
                }
                case 21: {
                    n14 = 66;
                    break;
                }
                case 22: {
                    n14 = 179;
                    break;
                }
                case 23: {
                    n14 = 233;
                    break;
                }
                case 24: {
                    n14 = 201;
                    break;
                }
                case 25: {
                    n14 = 23;
                    break;
                }
                case 26: {
                    n14 = 104;
                    break;
                }
                case 27: {
                    n14 = 190;
                    break;
                }
                case 28: {
                    n14 = 76;
                    break;
                }
                case 29: {
                    n14 = 102;
                    break;
                }
                case 30: {
                    n14 = 222;
                    break;
                }
                case 31: {
                    n14 = 60;
                    break;
                }
                case 32: {
                    n14 = 227;
                    break;
                }
                case 33: {
                    n14 = 64;
                    break;
                }
                case 34: {
                    n14 = 85;
                    break;
                }
                case 35: {
                    n14 = 174;
                    break;
                }
                case 36: {
                    n14 = 240;
                    break;
                }
                case 37: {
                    n14 = 13;
                    break;
                }
                case 38: {
                    n14 = 30;
                    break;
                }
                case 39: {
                    n14 = 122;
                    break;
                }
                case 40: {
                    n14 = 141;
                    break;
                }
                case 41: {
                    n14 = 34;
                    break;
                }
                case 42: {
                    n14 = 18;
                    break;
                }
                case 43: {
                    n14 = 253;
                    break;
                }
                case 44: {
                    n14 = 90;
                    break;
                }
                case 45: {
                    n14 = 217;
                    break;
                }
                case 46: {
                    n14 = 84;
                    break;
                }
                case 47: {
                    n14 = 129;
                    break;
                }
                case 48: {
                    n14 = 82;
                    break;
                }
                case 49: {
                    n14 = 26;
                    break;
                }
                case 50: {
                    n14 = 31;
                    break;
                }
                case 51: {
                    n14 = 226;
                    break;
                }
                case 52: {
                    n14 = 153;
                    break;
                }
                case 53: {
                    n14 = 32;
                    break;
                }
                case 54: {
                    n14 = 207;
                    break;
                }
                case 55: {
                    n14 = 124;
                    break;
                }
                case 56: {
                    n14 = 198;
                    break;
                }
                case 57: {
                    n14 = 215;
                    break;
                }
                case 58: {
                    n14 = 187;
                    break;
                }
                case 59: {
                    n14 = 149;
                    break;
                }
                case 60: {
                    n14 = 195;
                    break;
                }
                case 61: {
                    n14 = 8;
                    break;
                }
                case 62: {
                    n14 = 242;
                    break;
                }
                case 63: {
                    n14 = 92;
                    break;
                }
                case 64: {
                    n14 = 50;
                    break;
                }
                case 65: {
                    n14 = 191;
                    break;
                }
                case 66: {
                    n14 = 14;
                    break;
                }
                case 67: {
                    n14 = 250;
                    break;
                }
                case 68: {
                    n14 = 219;
                    break;
                }
                case 69: {
                    n14 = 150;
                    break;
                }
                case 70: {
                    n14 = 114;
                    break;
                }
                case 71: {
                    n14 = 136;
                    break;
                }
                case 72: {
                    n14 = 1;
                    break;
                }
                case 73: {
                    n14 = 185;
                    break;
                }
                case 74: {
                    n14 = 17;
                    break;
                }
                case 75: {
                    n14 = 155;
                    break;
                }
                case 76: {
                    n14 = 164;
                    break;
                }
                case 77: {
                    n14 = 61;
                    break;
                }
                case 78: {
                    n14 = 39;
                    break;
                }
                case 79: {
                    n14 = 19;
                    break;
                }
                case 80: {
                    n14 = 77;
                    break;
                }
                case 81: {
                    n14 = 134;
                    break;
                }
                case 82: {
                    n14 = 200;
                    break;
                }
                case 83: {
                    n14 = 160;
                    break;
                }
                case 84: {
                    n14 = 0;
                    break;
                }
                case 85: {
                    n14 = 163;
                    break;
                }
                case 86: {
                    n14 = 5;
                    break;
                }
                case 87: {
                    n14 = 249;
                    break;
                }
                case 88: {
                    n14 = 111;
                    break;
                }
                case 89: {
                    n14 = 101;
                    break;
                }
                case 90: {
                    n14 = 33;
                    break;
                }
                case 91: {
                    n14 = 91;
                    break;
                }
                case 92: {
                    n14 = 208;
                    break;
                }
                case 93: {
                    n14 = 63;
                    break;
                }
                case 94: {
                    n14 = 55;
                    break;
                }
                case 95: {
                    n14 = 58;
                    break;
                }
                case 96: {
                    n14 = 131;
                    break;
                }
                case 97: {
                    n14 = 45;
                    break;
                }
                case 98: {
                    n14 = 44;
                    break;
                }
                case 99: {
                    n14 = 203;
                    break;
                }
                case 100: {
                    n14 = 142;
                    break;
                }
                case 101: {
                    n14 = 193;
                    break;
                }
                case 102: {
                    n14 = 241;
                    break;
                }
                case 103: {
                    n14 = 16;
                    break;
                }
                case 104: {
                    n14 = 245;
                    break;
                }
                case 105: {
                    n14 = 12;
                    break;
                }
                case 106: {
                    n14 = 139;
                    break;
                }
                case 107: {
                    n14 = 74;
                    break;
                }
                case 108: {
                    n14 = 11;
                    break;
                }
                case 109: {
                    n14 = 183;
                    break;
                }
                case 110: {
                    n14 = 2;
                    break;
                }
                case 111: {
                    n14 = 165;
                    break;
                }
                case 112: {
                    n14 = 182;
                    break;
                }
                case 113: {
                    n14 = 166;
                    break;
                }
                case 114: {
                    n14 = 97;
                    break;
                }
                case 115: {
                    n14 = 145;
                    break;
                }
                case 116: {
                    n14 = 15;
                    break;
                }
                case 117: {
                    n14 = 123;
                    break;
                }
                case 118: {
                    n14 = 106;
                    break;
                }
                case 119: {
                    n14 = 59;
                    break;
                }
                case 120: {
                    n14 = 214;
                    break;
                }
                case 121: {
                    n14 = 109;
                    break;
                }
                case 122: {
                    n14 = 230;
                    break;
                }
                case 123: {
                    n14 = 168;
                    break;
                }
                case 124: {
                    n14 = 21;
                    break;
                }
                case 125: {
                    n14 = 178;
                    break;
                }
                case 126: {
                    n14 = 88;
                    break;
                }
                case 127: {
                    n14 = 72;
                    break;
                }
                case 128: {
                    n14 = 67;
                    break;
                }
                case 129: {
                    n14 = 48;
                    break;
                }
                case 130: {
                    n14 = 151;
                    break;
                }
                case 131: {
                    n14 = 196;
                    break;
                }
                case 132: {
                    n14 = 232;
                    break;
                }
                case 133: {
                    n14 = 234;
                    break;
                }
                case 134: {
                    n14 = 157;
                    break;
                }
                case 135: {
                    n14 = 133;
                    break;
                }
                case 136: {
                    n14 = 110;
                    break;
                }
                case 137: {
                    n14 = 51;
                    break;
                }
                case 138: {
                    n14 = 43;
                    break;
                }
                case 139: {
                    n14 = 211;
                    break;
                }
                case 140: {
                    n14 = 236;
                    break;
                }
                case 141: {
                    n14 = 180;
                    break;
                }
                case 142: {
                    n14 = 212;
                    break;
                }
                case 143: {
                    n14 = 99;
                    break;
                }
                case 144: {
                    n14 = 46;
                    break;
                }
                case 145: {
                    n14 = 87;
                    break;
                }
                case 146: {
                    n14 = 181;
                    break;
                }
                case 147: {
                    n14 = 36;
                    break;
                }
                case 148: {
                    n14 = 189;
                    break;
                }
                case 149: {
                    n14 = 167;
                    break;
                }
                case 150: {
                    n14 = 49;
                    break;
                }
                case 151: {
                    n14 = 239;
                    break;
                }
                case 152: {
                    n14 = 100;
                    break;
                }
                case 153: {
                    n14 = 9;
                    break;
                }
                case 154: {
                    n14 = 205;
                    break;
                }
                case 155: {
                    n14 = 255;
                    break;
                }
                case 156: {
                    n14 = 188;
                    break;
                }
                case 157: {
                    n14 = 135;
                    break;
                }
                case 158: {
                    n14 = 146;
                    break;
                }
                case 159: {
                    n14 = 140;
                    break;
                }
                case 160: {
                    n14 = 3;
                    break;
                }
                case 161: {
                    n14 = 154;
                    break;
                }
                case 162: {
                    n14 = 175;
                    break;
                }
                case 163: {
                    n14 = 173;
                    break;
                }
                case 164: {
                    n14 = 148;
                    break;
                }
                case 165: {
                    n14 = 247;
                    break;
                }
                case 166: {
                    n14 = 137;
                    break;
                }
                case 167: {
                    n14 = 7;
                    break;
                }
                case 168: {
                    n14 = 47;
                    break;
                }
                case 169: {
                    n14 = 246;
                    break;
                }
                case 170: {
                    n14 = 156;
                    break;
                }
                case 171: {
                    n14 = 80;
                    break;
                }
                case 172: {
                    n14 = 70;
                    break;
                }
                case 173: {
                    n14 = 127;
                    break;
                }
                case 174: {
                    n14 = 172;
                    break;
                }
                case 175: {
                    n14 = 96;
                    break;
                }
                case 176: {
                    n14 = 68;
                    break;
                }
                case 177: {
                    n14 = 210;
                    break;
                }
                case 178: {
                    n14 = 229;
                    break;
                }
                case 179: {
                    n14 = 244;
                    break;
                }
                case 180: {
                    n14 = 171;
                    break;
                }
                case 181: {
                    n14 = 130;
                    break;
                }
                case 182: {
                    n14 = 204;
                    break;
                }
                case 183: {
                    n14 = 248;
                    break;
                }
                case 184: {
                    n14 = 73;
                    break;
                }
                case 185: {
                    n14 = 225;
                    break;
                }
                case 186: {
                    n14 = 144;
                    break;
                }
                case 187: {
                    n14 = 20;
                    break;
                }
                case 188: {
                    n14 = 118;
                    break;
                }
                case 189: {
                    n14 = 121;
                    break;
                }
                case 190: {
                    n14 = 170;
                    break;
                }
                case 191: {
                    n14 = 158;
                    break;
                }
                case 192: {
                    n14 = 159;
                    break;
                }
                case 193: {
                    n14 = 194;
                    break;
                }
                case 194: {
                    n14 = 176;
                    break;
                }
                case 195: {
                    n14 = 213;
                    break;
                }
                case 196: {
                    n14 = 65;
                    break;
                }
                case 197: {
                    n14 = 25;
                    break;
                }
                case 198: {
                    n14 = 79;
                    break;
                }
                case 199: {
                    n14 = 108;
                    break;
                }
                case 200: {
                    n14 = 177;
                    break;
                }
                case 201: {
                    n14 = 71;
                    break;
                }
                case 202: {
                    n14 = 4;
                    break;
                }
                case 203: {
                    n14 = 252;
                    break;
                }
                case 204: {
                    n14 = 35;
                    break;
                }
                case 205: {
                    n14 = 192;
                    break;
                }
                case 206: {
                    n14 = 202;
                    break;
                }
                case 207: {
                    n14 = 199;
                    break;
                }
                case 208: {
                    n14 = 41;
                    break;
                }
                case 209: {
                    n14 = 78;
                    break;
                }
                case 210: {
                    n14 = 38;
                    break;
                }
                case 211: {
                    n14 = 10;
                    break;
                }
                case 212: {
                    n14 = 162;
                    break;
                }
                case 213: {
                    n14 = 95;
                    break;
                }
                case 214: {
                    n14 = 117;
                    break;
                }
                case 215: {
                    n14 = 113;
                    break;
                }
                case 216: {
                    n14 = 125;
                    break;
                }
                case 217: {
                    n14 = 138;
                    break;
                }
                case 218: {
                    n14 = 220;
                    break;
                }
                case 219: {
                    n14 = 147;
                    break;
                }
                case 220: {
                    n14 = 93;
                    break;
                }
                case 221: {
                    n14 = 98;
                    break;
                }
                case 222: {
                    n14 = 40;
                    break;
                }
                case 223: {
                    n14 = 216;
                    break;
                }
                case 224: {
                    n14 = 89;
                    break;
                }
                case 225: {
                    n14 = 143;
                    break;
                }
                case 226: {
                    n14 = 224;
                    break;
                }
                case 227: {
                    n14 = 184;
                    break;
                }
                case 228: {
                    n14 = 56;
                    break;
                }
                case 229: {
                    n14 = 119;
                    break;
                }
                case 230: {
                    n14 = 69;
                    break;
                }
                case 231: {
                    n14 = 251;
                    break;
                }
                case 232: {
                    n14 = 223;
                    break;
                }
                case 233: {
                    n14 = 105;
                    break;
                }
                case 234: {
                    n14 = 161;
                    break;
                }
                case 235: {
                    n14 = 75;
                    break;
                }
                case 236: {
                    n14 = 126;
                    break;
                }
                case 237: {
                    n14 = 62;
                    break;
                }
                case 238: {
                    n14 = 186;
                    break;
                }
                case 239: {
                    n14 = 94;
                    break;
                }
                case 240: {
                    n14 = 218;
                    break;
                }
                case 241: {
                    n14 = 53;
                    break;
                }
                case 242: {
                    n14 = 221;
                    break;
                }
                case 243: {
                    n14 = 209;
                    break;
                }
                case 244: {
                    n14 = 37;
                    break;
                }
                case 245: {
                    n14 = 54;
                    break;
                }
                case 246: {
                    n14 = 86;
                    break;
                }
                case 247: {
                    n14 = 152;
                    break;
                }
                case 248: {
                    n14 = 6;
                    break;
                }
                case 249: {
                    n14 = 57;
                    break;
                }
                case 250: {
                    n14 = 103;
                    break;
                }
                case 251: {
                    n14 = 107;
                    break;
                }
                case 252: {
                    n14 = 115;
                    break;
                }
                case 253: {
                    n14 = 52;
                    break;
                }
                case 254: {
                    n14 = 243;
                    break;
                }
                default: {
                    n14 = 128;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            pa_1.bb[n12] = new String(cArray).intern();
        }
        return bb[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1ADE;
        if (eb[n11] == null) {
            pa_1.eb[n11] = (int)(db[n11] ^ l2);
        }
        return eb[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x62BC) & Short.MAX_VALUE;
        if (gb[n11] == null) {
            pa_1.gb[n11] = fb[n11] ^ l2;
        }
        return gb[n11];
    }
}

