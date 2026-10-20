/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BS;
import com.C2;
import com.D9;
import com.DI;
import com.E0;
import com.EO;
import com.FM;
import com.FR;
import com.HH;
import com.HN;
import com.IR;
import com.LN;
import com.NZ;
import com.PN;
import com.QT;
import com.SJ;
import com.SP;
import com.T1;
import com.TV;
import com.WZ;
import com.X_;
import com.a3;
import com.aD;
import com.aN;
import com.aZ;
import com.ap_0;
import com.bc_0;
import com.bq_0;
import com.c;
import com.c.y_0;
import com.cj_2;
import com.cs_1;
import com.dv_1;
import com.fv_0;
import com.gr_0;
import com.gv_0;
import com.hj_0;
import com.im_2;
import com.in_2;
import com.km_1;
import com.ky_2;
import com.ly_0;
import com.ov_2;
import com.pa_1;
import com.pr_0;
import com.rb_2;
import com.rx_2;
import com.sd_0;
import com.uO;
import com.uR;
import com.uS;
import com.ug_0;
import com.w8_0;
import com.wq_0;
import com.xf_1;
import com.xn_2;
import com.xv_2;
import com.xx_1;
import com.ym_0;
import com.yo_0;
import com.zr_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.lang.reflect.InvocationTargetException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com._y
 */
public class _y_0
extends F8
implements w8_0,
FM,
cs_1,
ms_0 {
    private static Logger w;
    protected pa_1 kj;
    protected JScrollBar v;
    protected IR O;
    protected AtomicBoolean kJ;
    private aZ j;
    private wq_0 W;
    protected D9 G;
    private PN kz;
    private cj_2 L;
    private E0 V;
    private Thread E;
    protected rx_2 kC;
    private cs_1 Z;
    private JLayeredPane b;
    private in_2 Q;
    private List kq;
    U kD;
    _y_0 U;
    _y_0 kk;
    s ks;
    boolean s;
    float k;
    int kP;
    int d;
    lv_2 C;
    String X;
    boolean kS;
    CB kL;
    ty_0 N;
    private ov_2 kl;
    km_1 kY;
    t3_0 kM;
    DI P;
    JPanel kW;
    gP kp;
    Y3 M;
    int h;
    int r;
    int kc;
    gP k8;
    ff_0 l;
    F_ x;
    dv_0 k7;
    gP kb;
    uc_0 I;
    int k2;
    static String i;
    public static BufferedImage z;
    public static BufferedImage Y;
    Dimension o;
    xx_1 m;
    int k0;
    int T;
    int a;
    boolean g;
    float y;
    public static RenderingHints n;
    int u;
    int t;
    int F;
    int B;
    Object A;
    boolean k5;
    y_0 J;
    JScrollBar e;
    bq_0 kN;
    BS kQ;
    String D;
    private static int S;
    private static final String[] ab;
    private static final String[] bb;
    private static final long[] eb;
    private static final Integer[] fb;

    public static synchronized void b() {
        String string;
        try {
            string = (String)lk_0.X(_y_0.n());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        i = string;
    }

    public static synchronized String l() {
        return i;
    }

    /*
     * Loose catch block
     */
    private static synchronized String n() {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        Object object;
        Object object2;
        u6_0 u6_02;
        StringBuffer stringBuffer;
        block38: {
            String string6;
            String string7;
            u6_0 u6_03;
            Object object3;
            stringBuffer = new StringBuffer();
            try {
                object3 = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                u6_03 = (u6_0)object3.h();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            u6_02 = u6_03;
            int n10 = _y_0.M();
            try {
                object2 = NetworkInterface.getNetworkInterfaces();
                HashSet<String> hashSet = new HashSet<String>();
                while (object2.hasMoreElements()) {
                    block41: {
                        String string8;
                        block45: {
                            StringBuilder stringBuilder;
                            block42: {
                                boolean bl;
                                byte[] byArray;
                                byte[] byArray2;
                                block40: {
                                    NetworkInterface networkInterface;
                                    block39: {
                                        object = object2.nextElement();
                                        if (n10 == 0) break block38;
                                        try {
                                            block47: {
                                                networkInterface = object;
                                                if (n10 == 0) break block39;
                                                break block47;
                                                catch (SocketException socketException) {
                                                    throw _y_0.a(socketException);
                                                }
                                            }
                                            if (networkInterface.isLoopback()) continue;
                                        }
                                        catch (SocketException socketException) {
                                            throw _y_0.a(socketException);
                                        }
                                        networkInterface = object;
                                    }
                                    byArray2 = networkInterface.getHardwareAddress();
                                    try {
                                        byArray = byArray2;
                                        if (n10 == 0) break block40;
                                        if (byArray == null) break block41;
                                    }
                                    catch (SocketException socketException) {
                                        throw _y_0.a(socketException);
                                    }
                                    byArray = byArray2;
                                }
                                try {
                                    bl = (Boolean)lk_0.B(byArray);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (bl) break block41;
                                StringBuilder stringBuilder2 = new StringBuilder();
                                for (int i2 = 0; i2 < byArray2.length; ++i2) {
                                    String string9;
                                    Object[] objectArray;
                                    String string10;
                                    block44: {
                                        block43: {
                                            stringBuilder = stringBuilder2;
                                            if (n10 == 0) break block42;
                                            try {
                                                block48: {
                                                    string10 = _y_0.a(-24866, -28985);
                                                    Object[] objectArray2 = new Object[2];
                                                    objectArray2[0] = byArray2[i2];
                                                    Object[] objectArray3 = objectArray2;
                                                    objectArray = objectArray2;
                                                    int n11 = 1;
                                                    if (i2 >= byArray2.length - 1) break block43;
                                                    break block48;
                                                    catch (SocketException socketException) {
                                                        throw _y_0.a(socketException);
                                                    }
                                                }
                                                string9 = "-";
                                                break block44;
                                            }
                                            catch (SocketException socketException) {
                                                throw _y_0.a(socketException);
                                            }
                                        }
                                        string9 = "";
                                    }
                                    objectArray3[n11] = string9;
                                    stringBuilder.append(String.format(string10, objectArray));
                                    if (n10 != 0) continue;
                                }
                                stringBuilder = stringBuilder2;
                            }
                            string8 = stringBuilder.toString().trim();
                            boolean bl = hashSet.contains(string8);
                            if (n10 == 0) break block45;
                            try {
                                block49: {
                                    if (bl) break block41;
                                    break block49;
                                    catch (SocketException socketException) {
                                        throw _y_0.a(socketException);
                                    }
                                }
                                bl = hashSet.add(string8);
                            }
                            catch (SocketException socketException) {
                                throw _y_0.a(socketException);
                            }
                        }
                        stringBuffer.append(string8 + "#");
                    }
                    if (n10 != 0) continue;
                    break;
                }
            }
            catch (SocketException socketException) {
                socketException.printStackTrace();
            }
            stringBuffer.append(_y_0.a(-24880, -10664));
            stringBuffer.append(System.getProperty(_y_0.a(-24876, 25261)) + _y_0.a(-24888, 22703));
            stringBuffer.append(System.getProperty(_y_0.a(-24889, -31630)) + _y_0.a(-24865, -23336));
            try {
                string7 = (String)u6_02.X();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            stringBuffer.append(string7 + _y_0.a(-24883, 26612));
            try {
                string6 = (String)u6_02.D();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            stringBuffer.append(string6 + _y_0.a(-24892, -22159));
        }
        try {
            string5 = (String)lk_0.Z(stringBuffer.toString());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        object2 = string5;
        try {
            string4 = (String)u6_02.D();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string3 = (String)u6_02.X();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string2 = (String)lk_0.Z(string4 + _y_0.b(29654, 3157404892382703694L) + "*" + string3);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        object = string2.substring(0, _y_0.b(24630, 1815819135368995772L));
        try {
            string = (String)u6_02.X();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        object2 = string + "@" + (String)object + ((String)object2).substring(0, _y_0.b(32369, 343410956083903968L));
        return object2;
    }

    public _y_0(@NotNull rx_2 rx_22) {
        this(_y_0.b(3778, 6574025406202793303L), _y_0.b(11731, 920127827315617359L), rx_22);
    }

    public _y_0(int n10, int n11, rx_2 rx_22) {
        dv_0 dv_02;
        Object object;
        Object object2;
        Object object3;
        int n12 = _y_0.M();
        this.kJ = new AtomicBoolean();
        this.kq = new CopyOnWriteArrayList();
        this.s = true;
        this.k = 0.6f;
        this.d = new Random().nextInt();
        this.kS = false;
        int n13 = n12;
        this.h = 1;
        this.r = _y_0.b(6739, 256056104267930056L);
        this.kc = this.h;
        this.k2 = new Random().nextInt();
        this.setBorder(null);
        this.U = this;
        this.m = new xx_1();
        this.T = 0;
        this.a = _y_0.b(22154, 6717061833032242433L);
        this.g = false;
        this.y = 1.0f;
        n = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        n.put(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        n.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        n.put(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        this.A = new Object();
        this.k5 = false;
        this.kN = null;
        this.D = _y_0.a(-24887, -2723);
        try {
            object3 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = object3.f();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.I();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.K(object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.kC = rx_22;
        ov_2 ov_22 = this.d();
        this.Q = new in_2(rx_22.F(), rx_22.u());
        im_2 im_22 = new im_2(n10, n11, ov_22, rx_22.X(), this.Q);
        this.Q.G(im_22);
        this.kj = this.F(this.kC, ov_22, im_22);
        this.O = new IR(this.kj, im_22, ov_22);
        this.O.G(this);
        this.kj.U(this);
        this.j = new aZ(this.O, im_22, rx_22);
        this.W = new wq_0(this.j);
        uO uO2 = new uO(this.W::Y, wq_0.p);
        this.W.L(uO2);
        this.kj.k(this.W);
        this.O.o(NZ.AltSendsEscape, this.kC.A());
        this.kj.N(this.O);
        this.kj.Y(this);
        this.kj.t(this.O);
        this.kz = this.k(this.O);
        this.kj.G(this.kz);
        this.v = this.t();
        this.b = new JLayeredPane();
        this.b.setFocusable(false);
        this.setFocusable(false);
        this.b.setLayout(new aN(null));
        this.b.add((Component)this.kj, aN.I);
        this.b.add((Component)this.v, aN.v);
        this.kY = new km_1();
        hj_0 hj_02 = new hj_0(this.kj);
        this.kY.H(hj_02);
        this.b.add((Component)this.kY, aN.I);
        this.setLayout(new MigLayout(_y_0.a(-24879, -10655), _y_0.a(-24874, -3498), _y_0.a(-24885, -21668)));
        this.add((Component)this.b, _y_0.a(-24882, -32262));
        this.kW = new SP();
        this.kW.setBackground(new Color(_y_0.b(15917, 8313445711006465456L), _y_0.b(26856, 2176266695700196215L), _y_0.b(26856, 2176266695700196215L)));
        this.kW.setLayout(new MigLayout(_y_0.a(-24890, -8855), _y_0.a(-24868, 18226), _y_0.a(-24886, 32178)));
        this.kW.setBorder(BorderFactory.createEmptyBorder(5, 0, _y_0.b(20368, 4292849074312186904L), 0));
        this.add((Component)this.kW, _y_0.a(-24895, -3344));
        this.kW.add((Component)new JLabel(), _y_0.a(-24896, 8599));
        try {
            dv_02 = (dv_0)lk_0.h((Object)_y_0.a(-24871, -29832), false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.k7 = dv_02;
        this.kW.add((Component)this.k7, _y_0.a(-24894, 9263));
        this.l = new ff_0(this.kj, this.k7);
        this.x = new F_(this.kj, this.l, this.k7);
        try {
            this.l.F(this.x);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.kp = _y_0.g("\uf0e7", true);
        this.kp.setToolTipText(_y_0.a(-24884, 4938));
        this.kp.setFocusable(false);
        this.kp.setFont((Font)fx_2.k);
        this.kp.V(0, 2, 2, 2);
        this.kp.addActionListener(new rb_2(this));
        this.kW.add(this.kp);
        gP gP2 = _y_0.g("\uf0c5", true);
        gP2.setToolTipText(_y_0.a(-24877, -9486));
        gP2.setFocusable(false);
        this.kW.add(gP2);
        gP2.addActionListener(new a3(this));
        gP gP3 = _y_0.g("\uf0ea", true);
        gP3.setToolTipText(_y_0.a(-24867, 3511));
        gP3.setFocusable(false);
        this.kW.add(gP3);
        gP3.addActionListener(new C2(this));
        RenderingHints renderingHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        gP gP4 = _y_0.g("\uf002", true);
        gP4.setToolTipText(_y_0.a(-24875, 22595));
        gP4.setFocusable(false);
        try {
            gP4.P(renderingHints);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.kW.add(gP4);
        gP4.addActionListener(new T1(this));
        gP gP5 = _y_0.g("\uf013", true);
        gP5.setToolTipText(_y_0.a(-24873, -12767));
        gP5.V(0, 0, 1, 0);
        gP5.setFont((Font)fx_2.k);
        gP5.setFocusable(false);
        try {
            gP5.P(renderingHints);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.kW.add(gP5);
        gP5.addActionListener(new FR(this));
        gP gP6 = _y_0.g("\uf07c", true);
        gP6.setFocusable(false);
        gP6.setToolTipText(_y_0.a(-24893, -20984));
        try {
            gP6.P(renderingHints);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        gP6.addActionListener(new zr_0(this));
        gP gP7 = _y_0.g("\uf04b", true);
        gP7.setToolTipText(_y_0.a(-24878, 24767));
        gP7.setFocusable(false);
        try {
            gP7.P(renderingHints);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        gP7.addActionListener(new TV(this));
        this.kb = _y_0.g("\uf062", true);
        this.kb.setToolTipText(_y_0.a(-24891, 102));
        this.kb.setFocusable(false);
        try {
            this.kb.P(renderingHints);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string = "\uf062";
        _y_0 _y_02 = this;
        if (n13 != 0) {
            boolean bl;
            Object object4;
            try {
                object4 = _y_02.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                bl = (Boolean)object4.l();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (bl) {
                string = "\uf063";
            }
            this.kb.setText(string);
            this.kW.add(this.kb);
            this.kb.addActionListener(new SJ(this));
            this.k8 = _y_0.g("\uf2d0", true);
            this.k8.setToolTipText(_y_0.a(-24881, -23814));
            this.k8.V(0, 0, 1, 0);
            this.k8.setFont((Font)fx_2.b);
            this.k8.setFocusable(false);
            try {
                this.k8.P(renderingHints);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.kW.add(this.k8);
            this.k8.addActionListener(new gr_0(this));
            this.kj.setVisible(true);
            this.r();
            this.setBackground(this.kj.getBackground());
            this.n();
            this.M();
            this.v.setModel(this.kj.u());
            this.kJ.set(false);
            this.kj.A(this.v);
            _y_02 = this;
        }
        _y_02.kj.setVisible(true);
        if (n13 == 0) {
            ky_2.K(new String[4]);
        }
    }

    public static void c(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        _y_0.v();
        z = bufferedImage2;
        Y = bufferedImage;
    }

    public void l() {
        this.repaint();
        this.kW.repaint();
    }

    public BufferedImage B(ap_0 ap_02, int n10, int n11) {
        BufferedImage bufferedImage;
        HashMap hashMap;
        String string = n10 + "-" + n11;
        int n12 = _y_0.M();
        try {
            hashMap = (HashMap)this.I.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        BufferedImage bufferedImage2 = bufferedImage = (BufferedImage)hashMap.get(string);
        if (n12 != 0) {
            if (bufferedImage2 == null) {
                HashMap hashMap2;
                BufferedImage bufferedImage3;
                BufferedImage bufferedImage4;
                int n13 = this.a + this.k0 / 2;
                try {
                    bufferedImage4 = (BufferedImage)lk_0.X(this.y, n13, 2 * n13);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                BufferedImage bufferedImage5 = bufferedImage4;
                Graphics2D graphics2D = (Graphics2D)bufferedImage5.getGraphics();
                double d2 = ap_02.n + ap_02.t;
                double d3 = ap_02.Q - this.a;
                double d4 = n13;
                double d5 = 2 * n13;
                try {
                    bufferedImage3 = (BufferedImage)this.I.D();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.Y(graphics2D, bufferedImage3, 0, 0, (int)((float)n13 * this.y), (int)((float)(2 * n13) * this.y), (int)d2, (int)d3, (int)(d2 + d4), (int)(d3 + d5), null);
                bufferedImage = bufferedImage5 = xx_1.C(bufferedImage5, true);
                graphics2D.dispose();
                try {
                    hashMap2 = (HashMap)this.I.S();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                hashMap2.put(string, bufferedImage);
            }
            bufferedImage2 = bufferedImage;
        }
        return bufferedImage2;
    }

    public BufferedImage W(ap_0 ap_02, int n10, int n11) {
        HashMap hashMap;
        String string = n10 + "-" + n11;
        try {
            hashMap = (HashMap)this.I.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        BufferedImage bufferedImage = (BufferedImage)hashMap.get(string);
        int n12 = _y_0.M();
        BufferedImage bufferedImage2 = bufferedImage;
        if (n12 != 0) {
            if (bufferedImage2 == null) {
                HashMap hashMap2;
                BufferedImage bufferedImage3;
                BufferedImage bufferedImage4;
                int n13 = this.a + this.k0 / 2;
                try {
                    bufferedImage4 = (BufferedImage)lk_0.X(this.y, n13, 2 * n13);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                BufferedImage bufferedImage5 = bufferedImage4;
                Graphics2D graphics2D = (Graphics2D)bufferedImage5.getGraphics();
                int n14 = ap_02.n - n13;
                int n15 = ap_02.Q - this.a;
                int n16 = n13;
                int n17 = 2 * n13;
                try {
                    bufferedImage3 = (BufferedImage)this.I.D();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.Y(graphics2D, bufferedImage3, 0, 0, (int)((float)n13 * this.y), (int)((float)(2 * n13) * this.y), n14, n15, n14 + n16, n15 + n17, null);
                if (n14 < 0) {
                    // empty if block
                }
                graphics2D.setColor(Color.yellow);
                bufferedImage = bufferedImage5 = xx_1.C(bufferedImage5, false);
                try {
                    hashMap2 = (HashMap)this.I.g();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                hashMap2.put(string, bufferedImage);
            }
            bufferedImage2 = bufferedImage;
        }
        return bufferedImage2;
    }

    public BufferedImage S(int n10) {
        HashMap hashMap;
        try {
            hashMap = (HashMap)this.I.u();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        BufferedImage bufferedImage = (BufferedImage)hashMap.get(n10);
        int n11 = _y_0.y();
        BufferedImage bufferedImage2 = bufferedImage;
        if (n11 == 0) {
            if (bufferedImage2 == null) {
                HashMap hashMap2;
                BufferedImage bufferedImage3;
                BufferedImage bufferedImage4;
                pr_0 pr_02 = this.kj.N();
                int n12 = n10 * this.k0 + hj_0.f.top;
                try {
                    bufferedImage4 = (BufferedImage)lk_0.X(this.y, this.getWidth(), this.k0 + this.a);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                bufferedImage = bufferedImage4;
                Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
                try {
                    bufferedImage3 = (BufferedImage)this.I.D();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.Y(graphics2D, bufferedImage3, 0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), 0, n12 + this.k0, bufferedImage.getWidth(), n12 + this.k0 + this.a, null);
                bufferedImage = xx_1.G(bufferedImage, true);
                graphics2D.dispose();
                try {
                    hashMap2 = (HashMap)this.I.u();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                hashMap2.put(n10, bufferedImage);
            }
            bufferedImage2 = bufferedImage;
        }
        return bufferedImage2;
    }

    public BufferedImage q(int n10) {
        HashMap hashMap;
        try {
            hashMap = (HashMap)this.I.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        BufferedImage bufferedImage = (BufferedImage)hashMap.get(n10);
        int n11 = _y_0.M();
        BufferedImage bufferedImage2 = bufferedImage;
        if (n11 != 0) {
            if (bufferedImage2 == null) {
                HashMap hashMap2;
                BufferedImage bufferedImage3;
                BufferedImage bufferedImage4;
                int n12 = n10 * this.k0 + hj_0.f.top;
                try {
                    bufferedImage4 = (BufferedImage)lk_0.X(this.y, this.getWidth(), this.k0 + this.a);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                bufferedImage = bufferedImage4;
                Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
                try {
                    bufferedImage3 = (BufferedImage)this.I.D();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.Y(graphics2D, bufferedImage3, 0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), 0, n12 + this.k0 - this.a, bufferedImage.getWidth(), n12 + this.k0, null);
                bufferedImage = xx_1.G(bufferedImage, false);
                try {
                    hashMap2 = (HashMap)this.I.o();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                hashMap2.put(n10, bufferedImage);
            }
            bufferedImage2 = bufferedImage;
        }
        return bufferedImage2;
    }

    public void Y(Graphics2D graphics2D, Image image, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, ImageObserver imageObserver) {
        graphics2D.drawImage(image, n10, n11, n12, n13, (int)((float)n14 * this.y), (int)((float)n15 * this.y), (int)((float)n16 * this.y), (int)((float)n17 * this.y), imageObserver);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void paintComponent(Graphics var1_1) {
        block72: {
            block102: {
                block79: {
                    block87: {
                        block86: {
                            block82: {
                                block85: {
                                    block83: {
                                        block84: {
                                            block80: {
                                                block81: {
                                                    block77: {
                                                        block78: {
                                                            block74: {
                                                                block75: {
                                                                    block76: {
                                                                        block73: {
                                                                            super.paintComponent(var1_1);
                                                                            var3_2 = (Graphics2D)var1_1;
                                                                            var2_3 = _y_0.y();
                                                                            this.y = (float)var3_2.getTransform().getScaleX();
                                                                            var4_4 = System.currentTimeMillis();
                                                                            var6_5 = 0;
                                                                            v0 = this.o;
                                                                            if (var2_3 != 0) break block73;
                                                                            if (v0 == null) break block74;
                                                                            v0 = this.getSize();
                                                                        }
                                                                        v1 = v0.width;
                                                                        if (var2_3 != 0) break block75;
                                                                        if (v1 != this.o.width) break block76;
                                                                        v2 = this.getSize().height;
                                                                        if (var2_3 != 0) break block77;
                                                                        if (v2 == this.o.height) break block78;
                                                                    }
                                                                    v1 = var6_5 = 1;
                                                                }
                                                                if (var2_3 == 0) break block78;
                                                            }
                                                            var6_5 = 1;
                                                        }
                                                        try {
                                                            v3 = yt_1.i();
                                                        }
                                                        catch (InvocationTargetException v4) {
                                                            throw v4.getTargetException();
                                                        }
                                                        try {
                                                            v5 = v3.h();
                                                        }
                                                        catch (InvocationTargetException v6) {
                                                            throw v6.getTargetException();
                                                        }
                                                        try {
                                                            v2 = (int)((Boolean)v5.J()).booleanValue();
                                                        }
                                                        catch (InvocationTargetException v7) {
                                                            throw v7.getTargetException();
                                                        }
                                                    }
                                                    if ((var7_6 = v2) == 0 || _y_0.z == null) break block79;
                                                    var3_2.setRenderingHints(_y_0.n);
                                                    this.u = (int)(this.y * (float)this.getWidth());
                                                    this.t = (int)(this.y * (float)this.getHeight());
                                                    v8 = var6_5;
                                                    if (var2_3 != 0) break block80;
                                                    if (v8 != 0) break block81;
                                                    v8 = (int)this.k5;
                                                    if (var2_3 != 0) break block80;
                                                    if (v8 == 0) break block82;
                                                }
                                                this.j();
                                                v8 = this.u;
                                            }
                                            try {
                                                v9 = (uc_0)zg_0.s(v8, this.t);
                                            }
                                            catch (InvocationTargetException v10) {
                                                throw v10.getTargetException();
                                            }
                                            v11 = var8_7 = v9;
                                            if (var2_3 != 0) break block83;
                                            if (v11 != null) break block84;
                                            try {
                                                v12 = (uc_0)zg_0.u((Object)_y_0.z, (Object)_y_0.Y, (Object)_y_0.n, this.u, this.t);
                                            }
                                            catch (InvocationTargetException v13) {
                                                throw v13.getTargetException();
                                            }
                                            this.I = v12;
                                            if (var2_3 == 0) break block85;
                                        }
                                        v11 = this.I = var8_7;
                                    }
                                    try {
                                        v11.q();
                                    }
                                    catch (InvocationTargetException v14) {
                                        throw v14.getTargetException();
                                    }
                                }
                                try {
                                    zg_0.o((Object)this.I, this.k2);
                                }
                                catch (InvocationTargetException v15) {
                                    throw v15.getTargetException();
                                }
                                this.F = this.u;
                                this.B = this.t;
                                this.k5 = false;
                                var6_5 = 0;
                            }
                            var8_8 = System.currentTimeMillis();
                            try {
                                v16 = (BufferedImage)this.I.V();
                            }
                            catch (InvocationTargetException v17) {
                                throw v17.getTargetException();
                            }
                            var3_2.drawImage(v16, 0, 0, this.getWidth(), this.getHeight(), this);
                            var10_10 = this.kj.N();
                            v18 = var10_10.j();
                            if (var2_3 != 0) break block86;
                            if (v18 == null) break block87;
                            v18 = var10_10.j();
                        }
                        var11_11 = v18.c();
                        this.k0 = var10_10.F();
                        var12_12 = var10_10.R();
                        for (var13_13 = 0; var13_13 < var11_11; ++var13_13) {
                            v19 = var14_14 = (ap_0)var12_12.get(var13_13);
                            if (var2_3 == 0) {
                                if (var2_3 == 0) {
                                    if (v19 == null && var2_3 == 0) continue;
                                    v20 = var14_14;
                                }
                                var15_15 = (v20.K - this.T) * var10_10.m() + hj_0.f.left;
                                var16_16 = var13_13 * var10_10.F() + hj_0.f.top;
                                var17_17 = (var14_14.J - var14_14.K + 1 + 2 * this.T) * var10_10.m();
                                var18_18 = var10_10.F();
                                var14_14.n = var15_15;
                                var14_14.Q = var16_16;
                                var14_14.t = var17_17;
                                var14_14.H = var18_18;
                                try {
                                    v21 = (BufferedImage)this.I.D();
                                }
                                catch (InvocationTargetException v22) {
                                    throw v22.getTargetException();
                                }
                                this.Y(var3_2, v21, var15_15, var16_16, var15_15 + var17_17, var16_16 + var18_18, var15_15, var16_16, var15_15 + var17_17, var16_16 + var18_18, null);
                                if (var2_3 == 0) continue;
                            }
                            ** GOTO lbl138
                        }
                        var13_13 = 0;
                        while (var13_13 < var11_11) {
                            block101: {
                                block89: {
                                    block90: {
                                        block91: {
                                            block97: {
                                                block98: {
                                                    block99: {
                                                        block100: {
                                                            block92: {
                                                                block93: {
                                                                    block96: {
                                                                        block94: {
                                                                            block95: {
                                                                                block88: {
                                                                                    var14_14 = (ap_0)var12_12.get(var13_13);
                                                                                    if (var2_3 != 0) break block72;
                                                                                    v19 = var14_14;
lbl138:
                                                                                    // 2 sources

                                                                                    if (var2_3 != 0) break block88;
                                                                                    if (v19 == null && var2_3 == 0) break block89;
                                                                                    v19 = var14_14;
                                                                                }
                                                                                var15_15 = v19.n;
                                                                                var16_16 = var14_14.Q;
                                                                                var17_17 = var14_14.t;
                                                                                var18_19 = this.a + this.k0 / 2;
                                                                                var19_21 = this.B(var14_14, var13_13, var14_14.J);
                                                                                var3_2.drawImage(var19_21, var15_15 + var17_17 - 1, var16_16 - this.a, var15_15 + var17_17 + var18_19 - 1, var16_16 - this.a + 2 * var18_19, 0, 0, var19_21.getWidth(), var19_21.getHeight(), null);
                                                                                var18_19 = this.a + this.k0 / 2;
                                                                                var19_21 = this.W(var14_14, var13_13, var14_14.K);
                                                                                var3_2.drawImage(var19_21, var15_15 - var18_19, var16_16 - this.a, var15_15, var16_16 - this.a + 2 * var18_19, 0, 0, var19_21.getWidth(), var19_21.getHeight(), null);
                                                                                var18_20 = this.S(var13_13);
                                                                                var19_21 = this.q(var13_13);
                                                                                var20_22 = (ap_0)var12_12.get(var13_13 - 1);
                                                                                var21_23 = (ap_0)var12_12.get(var13_13 + 1);
                                                                                var22_24 = 0;
                                                                                var23_25 = 0;
                                                                                var24_26 = 0;
                                                                                v23 = var21_23;
                                                                                if (var2_3 != 0) break block90;
                                                                                if (v23 == null) break block91;
                                                                                v24 = var25_27 = var21_23.J - var14_14.J;
                                                                                if (var2_3 != 0) break block92;
                                                                                if (v24 >= 0) break block93;
                                                                                var24_26 = var16_16 + this.k0;
                                                                                v25 = var14_14.K;
                                                                                if (var2_3 != 0) break block94;
                                                                                if (v25 >= var21_23.J) break block95;
                                                                                var22_24 = (var21_23.J + 1 + this.T) * var10_10.m() + hj_0.f.left;
                                                                                var23_25 = (var14_14.J - var21_23.J) * var10_10.m();
                                                                                if (var2_3 == 0) break block96;
                                                                            }
                                                                            var22_24 = var15_15;
                                                                            v25 = var17_17;
                                                                        }
                                                                        var23_25 = v25;
                                                                    }
                                                                    var24_26 = var16_16 + this.k0;
                                                                    var3_2.drawImage(var18_20, var22_24, var24_26, var22_24 + var23_25, var24_26 + this.a, var22_24, 0, var22_24 + var23_25, var18_20.getHeight(), null);
                                                                    if (var2_3 == 0) break block92;
                                                                }
                                                                var22_24 = (var14_14.V() + 1 + this.T) * var10_10.m() + hj_0.f.left;
                                                                var24_26 = var16_16 + this.k0 - this.a;
                                                                var23_25 = (var21_23.V() - var14_14.V()) * var10_10.m();
                                                                v24 = (int)var3_2.drawImage(var19_21, var22_24, var24_26, var22_24 + var23_25, var24_26 + this.a, var22_24, 0, var22_24 + var23_25, var19_21.getHeight(), null);
                                                            }
                                                            v26 = var25_27 = var21_23.K - var14_14.K;
                                                            if (var2_3 != 0) break block97;
                                                            if (v26 >= 0) break block98;
                                                            var24_26 = var16_16 + this.k0 - this.a;
                                                            var22_24 = var21_23.n;
                                                            v27 = var21_23.J;
                                                            if (var2_3 != 0) break block99;
                                                            if (v27 < var14_14.K) break block100;
                                                            var23_25 = (var14_14.K - var21_23.K) * var10_10.m();
                                                            if (var2_3 == 0) break block99;
                                                        }
                                                        v27 = var23_25 = var21_23.t;
                                                    }
                                                    if ((var26_29 = this.q(var13_13)) != null) {
                                                        var3_2.drawImage(var26_29, var22_24, var24_26, var22_24 + var23_25, var24_26 + this.a, var22_24, 0, var22_24 + var23_25, var18_20.getHeight(), null);
                                                    }
                                                    if (var2_3 == 0) break block91;
                                                }
                                                var22_24 = var15_15;
                                                var24_26 = var16_16 + this.k0;
                                                v26 = (var21_23.K - var14_14.K) * var10_10.m();
                                            }
                                            var23_25 = v26;
                                            var26_29 = this.S(var13_13);
                                            var3_2.drawImage(var26_29, var22_24, var24_26, var22_24 + var23_25, var24_26 + this.a, var22_24, 0, var22_24 + var23_25, var19_21.getHeight(), null);
                                        }
                                        v23 = var21_23;
                                    }
                                    if (var2_3 == 0) {
                                        if (v23 == null) {
                                            var24_26 = var16_16 + this.k0;
                                            var22_24 = var15_15;
                                            var23_25 = var17_17;
                                            var24_26 = var16_16 + this.k0;
                                            var3_2.drawImage(var18_20, var22_24, var24_26, var22_24 + var23_25, var24_26 + this.a, var22_24, 0, var22_24 + var23_25, var18_20.getHeight(), null);
                                        }
                                        v23 = var20_22;
                                    }
                                    if (v23 != null) break block89;
                                    var22_24 = var15_15;
                                    var24_26 = var16_16 - this.a;
                                    var23_25 = var17_17;
                                    var25_28 = this.q(var13_13 - 1);
                                    if (var2_3 != 0) break block101;
                                    if (var25_28 != null) {
                                        var3_2.drawImage(var25_28, var22_24, var24_26, var22_24 + var23_25, var24_26 + this.a, var22_24, 0, var22_24 + var23_25, var25_28.getHeight(), null);
                                    }
                                }
                                ++var13_13;
                            }
                            if (var2_3 == 0) continue;
                        }
                    }
                    if (var2_3 == 0) break block102;
                }
                try {
                    v28 = yt_1.i();
                }
                catch (InvocationTargetException v29) {
                    throw v29.getTargetException();
                }
                try {
                    v30 = v28.Z();
                }
                catch (InvocationTargetException v31) {
                    throw v31.getTargetException();
                }
                try {
                    v32 = (nY)v30.F();
                }
                catch (InvocationTargetException v33) {
                    throw v33.getTargetException();
                }
                var8_9 = v32;
                try {
                    v34 = (Color)var8_9.F();
                }
                catch (InvocationTargetException v35) {
                    throw v35.getTargetException();
                }
                var3_2.setColor(v34);
                var3_2.fillRect(0, 0, this.getWidth(), this.getHeight());
            }
            this.o = this.getSize();
        }
    }

    @Override
    public void repaint() {
        super.repaint();
    }

    private void s(String string) {
        WZ wZ = this.O.S(string, false);
        this.kj.z(wZ);
        this.G.o(wZ);
        this.v.repaint();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void i() {
        Object object = this.A;
        synchronized (object) {
            block17: {
                Object object2;
                block16: {
                    boolean bl;
                    int n10;
                    block15: {
                        boolean bl2;
                        block14: {
                            D9 d9;
                            block13: {
                                n10 = _y_0.M();
                                bl2 = false;
                                d9 = this.G;
                                if (n10 == 0) break block13;
                                if (d9 == null) break block14;
                                d9 = this.G;
                            }
                            bl = d9.l().isVisible();
                            if (n10 == 0) break block15;
                            if (!bl) break block14;
                            String string = this.G.I();
                            bl = string.equals("");
                            if (n10 == 0) break block15;
                            if (!bl) {
                                string = this.O(string);
                                this.s(string);
                                bl2 = true;
                            }
                        }
                        bl = bl2;
                    }
                    if (bl) break block16;
                    object2 = this.kj.f();
                    if (n10 == 0) break block17;
                    if (object2 != null) {
                        this.kj.z((WZ)null);
                        _y_0 _y_02 = this;
                        if (n10 != 0) {
                            if (_y_02.G != null) {
                                this.G.o(null);
                            }
                            _y_02 = this;
                        }
                        _y_02.v.repaint();
                    }
                }
                object2 = object;
            }
            // ** MonitorExit[v2] (shouldn't be in output)
            return;
        }
    }

    String O(String string) {
        String string2;
        block4: {
            String string3 = "";
            int n10 = 0;
            int n11 = _y_0.y();
            while (n10 < string.length()) {
                char c2 = string.charAt(n10);
                string2 = string3 + c2;
                if (n11 == 0) {
                    string3 = string2;
                    if (n11 == 0) {
                        if (sd_0.U(c2, true)) {
                            string3 = string3 + (char)_y_0.b(15029, 8833880272044423483L);
                        }
                        ++n10;
                    }
                    if (n11 == 0) continue;
                }
                break block4;
            }
            string2 = string3;
        }
        return string2;
    }

    void F() {
        block6: {
            uc_0 uc_02;
            block5: {
                int n10 = _y_0.M();
                uc_02 = this.I;
                if (n10 == 0) break block5;
                if (uc_02 == null) break block6;
                try {
                    this.I.a();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                uc_02 = this.I;
            }
            try {
                zg_0.G((Object)uc_02, this.k2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.I = null;
        }
    }

    void j() {
        block4: {
            uc_0 uc_02;
            block3: {
                int n10 = _y_0.M();
                uc_02 = this.I;
                if (n10 == 0) break block3;
                if (uc_02 == null) break block4;
                uc_02 = this.I;
            }
            try {
                zg_0.G((Object)uc_02, this.k2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.I = null;
        }
    }

    public static void v() {
        block6: {
            BufferedImage bufferedImage;
            block5: {
                int n10 = _y_0.y();
                bufferedImage = z;
                if (n10 == 0) {
                    if (bufferedImage != null) {
                        z.getGraphics().dispose();
                        z = null;
                    }
                    bufferedImage = Y;
                }
                if (n10 != 0) break block5;
                if (bufferedImage == null) break block6;
                bufferedImage = Y;
            }
            bufferedImage.getGraphics().dispose();
            Y = null;
        }
    }

    void T() {
        String string = "\uf062";
        int n10 = _y_0.y();
        _y_0 _y_02 = this;
        if (n10 == 0) {
            boolean bl;
            Object object;
            try {
                object = _y_02.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                bl = (Boolean)object.l();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (bl) {
                string = "\uf063";
            }
            _y_02 = this;
        }
        _y_02.kb.setText(string);
    }

    public void Y() {
        block5: {
            block7: {
                DI dI;
                block6: {
                    int n10;
                    DI dI2;
                    block4: {
                        dI2 = this.U.s().e();
                        n10 = _y_0.M();
                        dI = dI2;
                        if (n10 == 0) break block4;
                        if (dI == null) break block5;
                        dI = dI2;
                    }
                    if (n10 == 0) break block6;
                    if (!dI.t()) break block7;
                    dI = dI2;
                }
                dI.G();
            }
            try {
                this.kD.d(this.U);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Exception decompiling
     */
    public boolean O() {
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

    /*
     * Exception decompiling
     */
    public boolean V() {
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

    public void U() {
        block6: {
            _y_0 _y_02;
            block4: {
                block5: {
                    boolean bl;
                    int n10 = _y_0.y();
                    _y_02 = this;
                    if (n10 != 0) break block4;
                    try {
                        bl = (Boolean)_y_02.kD.o();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (!bl) break block5;
                    this.k8.setText("\uf2d2");
                    if (n10 == 0) break block6;
                }
                _y_02 = this;
            }
            _y_02.k8.setText("\uf2d0");
        }
    }

    public void d() {
        block5: {
            s s2;
            block4: {
                int n10 = _y_0.M();
                s2 = this.ks;
                if (n10 == 0) break block4;
                if (s2 == null) break block5;
                s2 = this.ks;
            }
            try {
                s2.X();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public void N() {
        block5: {
            s s2;
            block4: {
                int n10 = _y_0.y();
                s2 = this.ks;
                if (n10 != 0) break block4;
                if (s2 == null) break block5;
                s2 = this.ks;
            }
            try {
                s2.P();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public boolean x() {
        boolean bl;
        block6: {
            boolean bl2;
            block5: {
                DI dI;
                int n10;
                block4: {
                    bl2 = false;
                    DI dI2 = this.s().e();
                    n10 = _y_0.M();
                    dI = dI2;
                    if (n10 == 0) break block4;
                    if (dI == null) break block5;
                    dI = dI2;
                }
                bl = dI.t();
                if (n10 == 0) break block6;
                if (bl) {
                    bl2 = true;
                }
            }
            bl = bl2;
        }
        return bl;
    }

    public void f() {
        block3: {
            _y_0 _y_02;
            block2: {
                int n10 = _y_0.M();
                _y_02 = this;
                if (n10 == 0) break block2;
                if (!_y_02.x()) break block3;
                _y_02 = this;
            }
            _y_02.s().e().G();
        }
    }

    public boolean R() {
        boolean bl;
        block6: {
            boolean bl2;
            block5: {
                DI dI;
                int n10;
                DI dI2;
                block4: {
                    bl2 = false;
                    dI2 = this.s().e();
                    n10 = _y_0.y();
                    dI = dI2;
                    if (n10 != 0) break block4;
                    if (dI == null) break block5;
                    dI = dI2;
                }
                bl = dI.t();
                if (n10 != 0) break block6;
                if (bl) break block5;
                bl = dI2.i();
                if (n10 != 0) break block6;
                if (!bl) {
                    bl2 = true;
                }
            }
            bl = bl2;
        }
        return bl;
    }

    public void M() {
        block19: {
            t3_0 t3_02;
            block18: {
                int n10;
                block12: {
                    block14: {
                        block17: {
                            boolean bl;
                            block15: {
                                DI dI;
                                block16: {
                                    DI dI2;
                                    block13: {
                                        block11: {
                                            _y_0 _y_02;
                                            block10: {
                                                block9: {
                                                    cj_2 cj_22;
                                                    lv_2 lv_22;
                                                    block8: {
                                                        dI = null;
                                                        lv_22 = null;
                                                        n10 = _y_0.M();
                                                        cj_22 = this.L;
                                                        if (n10 == 0) break block8;
                                                        if (cj_22 == null) break block9;
                                                        cj_22 = this.L;
                                                    }
                                                    dI = cj_22.e();
                                                    lv_22 = this.L.E();
                                                }
                                                _y_02 = this;
                                                if (n10 == 0) break block10;
                                                if (_y_02.L != null) break block11;
                                                _y_02 = this;
                                            }
                                            _y_02.kp.setEnabled(false);
                                            if (n10 != 0) break block12;
                                        }
                                        dI2 = dI;
                                        if (n10 == 0) break block13;
                                        if (dI2 == null) break block14;
                                        dI2 = dI;
                                    }
                                    bl = dI2.t();
                                    if (n10 == 0) break block15;
                                    if (!bl) break block16;
                                    this.kp.setEnabled(true);
                                    this.kp.setForeground(new Color(_y_0.b(12885, 1876428350276104665L), _y_0.b(26856, 2176266695700196215L), _y_0.b(31572, 1260881872611489990L), _y_0.b(8626, 2804569102082335272L)));
                                    if (n10 != 0) break block12;
                                }
                                bl = dI.i();
                            }
                            if (!bl) break block17;
                            this.kp.setEnabled(false);
                            this.kp.setForeground(new Color(_y_0.b(28894, 8264491818421891923L), _y_0.b(9237, 1808066251772716956L), _y_0.b(31572, 1260881872611489990L), _y_0.b(16841, 4659263369232286278L)));
                            if (n10 != 0) break block12;
                        }
                        this.kp.setEnabled(true);
                        this.kp.setForeground(new Color(_y_0.b(10312, 2931098428869405656L), _y_0.b(15127, 6311930962237094020L), _y_0.b(16196, 5165013484950682845L), _y_0.b(19836, 3118598093948817131L)));
                        if (n10 != 0) break block12;
                    }
                    this.kp.setEnabled(true);
                }
                t3_02 = this.kM;
                if (n10 == 0) break block18;
                if (t3_02 == null) break block19;
                t3_02 = this.kM;
            }
            try {
                t3_02.e();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public void n() {
        block47: {
            _y_0 _y_02;
            block46: {
                boolean bl;
                Object object;
                Object object2;
                xf_1 xf_12;
                xf_1 xf_13;
                xf_1 xf_14;
                int n10;
                nY nY2;
                block43: {
                    Color color;
                    block45: {
                        block44: {
                            boolean bl2;
                            Object object3;
                            Object object4;
                            block41: {
                                _y_0 _y_03;
                                block42: {
                                    boolean bl3;
                                    U u10;
                                    block40: {
                                        xf_1 xf_15;
                                        nY nY3;
                                        Object object5;
                                        Object object6;
                                        this.k5 = true;
                                        try {
                                            object6 = yt_1.i();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        try {
                                            object5 = object6.Z();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        try {
                                            nY3 = (nY)object5.F();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        nY2 = nY3;
                                        n10 = _y_0.y();
                                        this.O().b();
                                        this.O().repaint();
                                        try {
                                            xf_15 = (xf_1)nY2.B();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        this.setBackground(new Color(xf_15.p()));
                                        _y_0 _y_04 = this;
                                        if (n10 == 0) {
                                            if (_y_04.q() != null) {
                                                Object object7;
                                                try {
                                                    object7 = this.q().G();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    object7.i();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                            }
                                            _y_04 = this;
                                        }
                                        u10 = _y_04.kD;
                                        if (n10 != 0) break block40;
                                        if (u10 == null) break block41;
                                        _y_03 = this;
                                        if (n10 != 0) break block42;
                                        u10 = _y_03.kD;
                                    }
                                    try {
                                        bl3 = (Boolean)u10.o();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    if (!bl3) break block41;
                                    _y_03 = this;
                                }
                                _y_03.setBorder(null);
                                if (n10 == 0) break block43;
                            }
                            color = new Color(_y_0.b(24277, 3885012068565589315L), _y_0.b(5102, 3033349893925785709L), _y_0.b(5102, 3033349893925785709L));
                            if (n10 != 0) break block44;
                            try {
                                object4 = yt_1.i();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                object3 = object4.h();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                bl2 = (Boolean)object3.B();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (!bl2) break block45;
                            this.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 0, color));
                        }
                        if (n10 == 0) break block43;
                    }
                    this.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, color));
                }
                try {
                    xf_14 = (xf_1)nY2.a();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.k7.setForeground(new Color(xf_14.p()));
                try {
                    xf_13 = (xf_1)nY2.B();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.k7.setBackground(new Color(xf_13.p()));
                _y_02 = this;
                if (n10 != 0) break block46;
                try {
                    xf_12 = (xf_1)nY2.a();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                _y_02.k7.setCaretColor(new Color(xf_12.p()));
                try {
                    object2 = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object = object2.h();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    bl = (Boolean)object.J();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (bl) break block47;
                _y_02 = this;
            }
            _y_02.j();
        }
    }

    public static gP g(String string, boolean bl) {
        gP gP2;
        try {
            gP2 = (gP)lk_0.M(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        gP gP3 = gP2;
        Color color = (Color)cy_1.W;
        int n10 = _y_0.y();
        if (n10 == 0) {
            if (bl) {
                color = new Color(_y_0.b(26856, 2176266695700196215L), _y_0.b(26856, 2176266695700196215L), _y_0.b(26856, 2176266695700196215L), _y_0.b(19621, 5901431551834427185L));
            }
            gP3.setForeground(color);
            gP3.t(new Color(_y_0.b(12483, 1771628594758185795L), _y_0.b(2448, 3933951253185907217L), _y_0.b(8171, 5117605362525002857L)));
            gP3.setBorder(BorderFactory.createEmptyBorder(0, 3, 0, 3));
        }
        return gP3;
    }

    public static gP K(String string) {
        return _y_0.g(string, false);
    }

    public JScrollBar G() {
        return this.v;
    }

    public ov_2 T() {
        return this.kl;
    }

    public void C() {
        this.kj.requestFocus();
    }

    protected JScrollBar t() {
        this.e = new JScrollBar();
        this.J = new ym_0(this);
        this.e.addAdjustmentListener(new gv_0(this));
        return this.e;
    }

    public void Z() {
        this.V.r().N();
        this.O.y();
        this.kj.C();
    }

    public void c() {
        this.V.r().s();
        this.O.l();
        this.kj.l();
    }

    protected ov_2 d() {
        ov_2 ov_22 = new ov_2();
        ov_22.t(this.kC.Q());
        return ov_22;
    }

    protected pa_1 F(@NotNull rx_2 rx_22, @NotNull ov_2 ov_22, @NotNull im_2 im_22) {
        return new pa_1(rx_22, im_22, ov_22);
    }

    @Deprecated(forRemoval=true)
    private PN k(IR iR) {
        return new PN(iR);
    }

    @Override
    public dv_1 g() {
        return this.O();
    }

    public pa_1 O() {
        return this.kj;
    }

    public wq_0 Y() {
        return this.W;
    }

    public void Y(@NotNull fv_0 fv_02) {
        uS uS2;
        block4: {
            block3: {
                fv_0 fv_03;
                int n10;
                block2: {
                    this.L = (cj_2)fv_02;
                    n10 = _y_0.y();
                    this.L.m(this);
                    fv_03 = fv_02;
                    if (n10 != 0) break block2;
                    if (!(fv_03 instanceof yo_0)) break block3;
                    fv_03 = fv_02;
                }
                List list = ((yo_0)fv_03).P();
                uS2 = ug_0.s(list);
                if (n10 == 0) break block4;
            }
            uS2 = uS.Unknown;
        }
        this.j.O(uS2);
        this.V = this.y(this.O, this.L);
        this.kj.v(this.V);
    }

    protected E0 y(@NotNull IR iR, @NotNull fv_0 fv_02) {
        return new E0(iR, fv_02, new HN(fv_02, this.W::O), this.W, this.kj);
    }

    @Override
    public fv_0 s() {
        return this.L;
    }

    @Override
    public QT O() {
        return this.O;
    }

    @Override
    public void N(int n10) {
        block4: {
            block3: {
                _y_0 _y_02;
                int n11;
                block2: {
                    n11 = _y_0.M();
                    _y_02 = this;
                    if (n11 == 0) break block2;
                    if (_y_02.kJ.get()) break block3;
                    this.E = new Thread(new ly_0(this, n10));
                    _y_02 = this;
                }
                _y_02.E.start();
                if (n11 != 0) break block4;
            }
            w.error(_y_0.a(-24872, -25555));
        }
    }

    public void W() {
        block3: {
            Thread thread;
            block4: {
                _y_0 _y_02;
                int n10;
                block2: {
                    n10 = _y_0.y();
                    _y_02 = this;
                    if (n10 != 0) break block2;
                    if (!_y_02.kJ.get()) break block3;
                    _y_02 = this;
                }
                thread = _y_02.E;
                if (n10 != 0) break block4;
                if (thread == null) break block3;
                thread = this.E;
            }
            thread.interrupt();
        }
    }

    public boolean I() {
        return this.kJ.get();
    }

    @Override
    public String c(LN lN, int n10) {
        return lN.W(this, n10);
    }

    @Override
    public im_2 b() {
        return this.kj.H();
    }

    @Override
    public boolean requestFocusInWindow() {
        return this.kj.requestFocusInWindow();
    }

    @Override
    public void requestFocus() {
        this.kj.requestFocus();
    }

    @Override
    public boolean v() {
        int n10 = _y_0.M();
        boolean bl = this.I();
        if (n10 != 0) {
            bl = !bl;
        }
        return bl;
    }

    @Override
    public void W(xn_2 xn_22) {
        this.kj.H(xn_22);
    }

    @Override
    public _y_0 f(fv_0 fv_02) {
        this.Y(fv_02);
        return this;
    }

    @Override
    public JComponent M() {
        return this;
    }

    @Override
    public void q() {
        int n10 = _y_0.y();
        _y_0 _y_02 = this;
        if (n10 == 0) {
            if (_y_02.kS) {
                try {
                    U.i.b(this.kj);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            this.W();
            try {
                this.x.D();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            _y_02 = this;
        }
        if (n10 == 0) {
            if (_y_02.V != null) {
                this.V.O();
            }
            _y_02 = this;
        }
        if (n10 == 0) {
            if (_y_02.L != null) {
                this.L.a();
            }
            _y_02 = this;
        }
        if (n10 == 0) {
            if (_y_02.O != null) {
                this.O.A();
            }
            _y_02 = this;
        }
        if (n10 == 0) {
            if (_y_02.kj != null) {
                this.kj.o();
            }
            try {
                this.M.K();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.l.D();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            _y_02 = this.kk;
        }
        if (n10 == 0) {
            if (_y_02 != null) {
                this.kk.q();
            }
            _y_02 = this;
        }
        if (n10 == 0) {
            if (_y_02.N != null) {
                try {
                    this.N.c();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            _y_02 = this;
        }
        if (n10 == 0) {
            if (_y_02.kL != null) {
                try {
                    this.kL.C();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            _y_02 = this;
        }
        if (n10 == 0) {
            if (_y_02.M != null) {
                try {
                    this.M.K();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            _y_02 = this;
        }
        s s2 = _y_02.q();
        if (n10 == 0) {
            if (s2 != null) {
                try {
                    s2.v();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            try {
                lk_0.C(this.b);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.j();
            try {
                lk_0.C(this.kY);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.J.C(this.e);
            try {
                lk_0.C(this.e);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                lk_0.C(this);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            System.gc();
            this.K();
        }
    }

    @Override
    public List n() {
        return List.of(new aD(this.kC.h(), this::lambda$getActions$0).u(_y_0.b(10740, 6265738062572415594L)));
    }

    public void l(String string) {
        this.G.J(string);
    }

    public void r() {
        int n10 = _y_0.y();
        _y_0 _y_02 = this;
        if (n10 == 0) {
            if (_y_02.kQ == null) {
                this.M = new Y3(this.kj);
                this.kQ = new BS(this.M);
                this.kj.F(this.M);
                EO eO = new EO(this);
                this.kY.b(this.kQ, eO);
            }
            this.kY.validate();
            _y_02 = this;
        }
        _y_02.kY.doLayout();
    }

    public void z() {
        this.kQ.setVisible(false);
    }

    void w() {
        bq_0 bq_02 = this.G.l();
        bq_02.setVisible(false);
        this.b.revalidate();
        this.b.repaint();
        this.G = null;
        this.kj.z((WZ)null);
        this.kj.requestFocusInWindow();
    }

    public void Q() {
        block7: {
            bq_0 bq_02;
            block8: {
                block9: {
                    D9 d9;
                    int n10;
                    block5: {
                        block6: {
                            int n11 = _y_0.y();
                            this.kj.requestFocus();
                            n10 = n11;
                            d9 = this.G;
                            if (n10 != 0) break block5;
                            if (d9 != null) break block6;
                            _y_0 _y_02 = this;
                            if (n10 == 0) {
                                if (_y_02.kN == null) {
                                    this.kN = new bq_0(this.U, this.kj);
                                    this.kN.requestFocus();
                                    this.kY.S(this.kN, 4, 1);
                                }
                                _y_02 = this;
                            }
                            _y_02.G = this.kN;
                            if (n10 == 0) break block7;
                        }
                        d9 = this.G;
                    }
                    bq_02 = d9.l();
                    if (n10 != 0) break block8;
                    if (!bq_02.r()) break block9;
                    this.G.l().setVisible(false);
                    this.kj.requestFocusInWindow();
                    if (n10 == 0) break block7;
                }
                bq_02 = this.G.l();
            }
            bq_02.setVisible(true);
        }
        this.kY.validate();
        this.kY.doLayout();
        this.G.l().requestFocus();
        this.kN.s();
    }

    @NotNull
    protected HH V() {
        return new xv_2(this);
    }

    private void W(String string, boolean bl) {
        WZ wZ = this.O.S(string, bl);
        this.kj.z(wZ);
        this.G.o(wZ);
        this.v.repaint();
    }

    @Override
    public cs_1 c() {
        return this.Z;
    }

    @Override
    public void Y(cs_1 cs_12) {
        this.Z = cs_12;
    }

    public String p() {
        return this.D;
    }

    public void o(String string) {
        this.D = string;
    }

    void s() {
        this.G.l().setVisible(false);
        this.kj.requestFocusInWindow();
        this.kN.s();
    }

    public U x() {
        return this.kD;
    }

    public void W(U u10) {
        this.kD = u10;
    }

    @Override
    public void M(yl_2 yl_22) {
        block5: {
            U u10;
            block4: {
                int n10 = _y_0.M();
                u10 = this.kD;
                if (n10 == 0) break block4;
                if (u10 == null) break block5;
                u10 = this.kD;
            }
            try {
                u10.M(yl_22);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public s q() {
        return this.ks;
    }

    public void K(s s2) {
        this.ks = s2;
    }

    public boolean u() {
        return this.s;
    }

    public void h(boolean bl) {
        this.s = bl;
    }

    public float H() {
        return this.k;
    }

    public void y(float f10) {
        this.k = f10;
    }

    public int O() {
        return this.kP;
    }

    public void M(int n10) {
        this.kP = n10;
    }

    public int N() {
        return this.d;
    }

    public lv_2 a() {
        return this.C;
    }

    public void H(lv_2 lv_22) {
        this.C = lv_22;
    }

    public IR J() {
        return this.O;
    }

    public boolean g() {
        return this.kS;
    }

    public void o(boolean bl) {
        block3: {
            block4: {
                _y_0 _y_02;
                int n10;
                block2: {
                    n10 = _y_0.y();
                    _y_02 = this;
                    if (n10 != 0) break block2;
                    _y_02.kS = bl;
                    if (!bl) break block3;
                    _y_02 = this;
                }
                if (n10 != 0) break block4;
                if (_y_02.kL != null) break block3;
                _y_02 = this;
            }
            _y_02.kL = new CB(this.U);
        }
    }

    public _y_0 N() {
        return this.kk;
    }

    public void W(_y_0 _y_02) {
        this.kk = _y_02;
    }

    public CB t() {
        return this.kL;
    }

    public void p(CB cB) {
        this.kL = cB;
    }

    public void V(ty_0 ty_02) {
        this.N = ty_02;
    }

    public ty_0 M() {
        return this.N;
    }

    @Override
    public t3_0 X() {
        return this.kM;
    }

    @Override
    public void U(t3_0 t3_02) {
        this.kM = t3_02;
    }

    public DI i() {
        return this.P;
    }

    public void t(DI dI) {
        this.P = dI;
    }

    public DI G() {
        DI dI;
        block3: {
            fv_0 fv_02;
            block2: {
                dI = null;
                int n10 = _y_0.M();
                fv_02 = this.U.s();
                if (n10 == 0) break block2;
                if (fv_02 == null) break block3;
                fv_02 = this.U.s();
            }
            dI = fv_02.e();
        }
        return dI;
    }

    @Override
    public void o() {
        this.kj.requestFocus();
    }

    public ff_0 o() {
        return this.l;
    }

    public void c(ff_0 ff_02) {
        this.l = ff_02;
    }

    public F_ H() {
        return this.x;
    }

    public void J(F_ f_2) {
        this.x = f_2;
    }

    @Deprecated
    @Nullable
    public E0 C() {
        return this.V;
    }

    public void A(bc_0 bc_02) {
        this.Q.p(bc_02);
    }

    @Override
    public void r(uR uR2) {
        this.kq.add(uR2);
    }

    @Override
    public void T(uR uR2) {
        this.kq.remove(uR2);
    }

    @Override
    public void h() {
        this.kj = null;
        this.v = null;
        this.O = null;
        this.kJ = null;
        this.j = null;
        this.W = null;
        this.G = null;
        this.kz = null;
        this.L = null;
        this.V = null;
        this.E = null;
        this.kC = null;
        this.Z = null;
        this.b = null;
        this.Q = null;
        this.kq = null;
        this.kD = null;
        this.U = null;
        this.kk = null;
        this.ks = null;
        this.C = null;
        this.X = null;
        this.kL = null;
        this.N = null;
        this.kl = null;
        this.kY = null;
        this.kM = null;
        this.P = null;
        this.kW = null;
        this.kp = null;
        this.M = null;
        this.k8 = null;
        this.l = null;
        this.x = null;
        this.k7 = null;
        this.kb = null;
        this.I = null;
        this.o = null;
        this.m = null;
        this.A = null;
        this.J = null;
        this.e = null;
        this.kN = null;
        this.kQ = null;
        this.D = null;
    }

    @Override
    public void K() {
        try {
            yt_1.F.W((Object)new X_(this), dd_1.y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    private boolean lambda$getActions$0(KeyEvent keyEvent) {
        this.Q();
        return true;
    }

    static JLayeredPane j(_y_0 _y_02) {
        return _y_02.b;
    }

    static cj_2 D(_y_0 _y_02) {
        return _y_02.L;
    }

    static PN q(_y_0 _y_02) {
        return _y_02.kz;
    }

    static E0 s(_y_0 _y_02) {
        return _y_02.V;
    }

    static Logger J() {
        return w;
    }

    static List f(_y_0 _y_02) {
        return _y_02.kq;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[30];
                        var11_1 = 0;
                        var10_2 = "bC\u00c1\u00eb3\u0002\u5eba\u6892\u0010\"\u00f5\u00e2.a\u009d\u00f1/\u00c3[*0\u00a3\u0006\u00d0\u000e\u0007\u0005\u00ab\u009d_~'\u009c\t\u00fc\u0018\u00f3e\u00aa\u0094\u0004<\u0016\u000f th\u00e8\u00d9%c\t\u00dd\u008bD\u0095%\u0092P\u000f\u00bb\u00fe\u001b\u00b9\u00b7\u000f\u00a2Eg=\u00f7\u00b7\u001a\u00f7\u00ff\u0004\u650b\u4e90\u7b26\u746a\u0002\u8fb1\u63cf\u0003\u009e\n\u008c\"!\u00eaH;\u00dd_\u00e3N\u00c8\u007fI\u00bd\u00c7\u00a6\u0019a~v5\u0000^\u00f5\u00f2:E4L\u00875\u0013=\u00ef\u000bS\u0002\u518d\u5cbe\u0003*v\u00cb\u0005\u00de+\u00f3\u00c0\u009c\u0005\u00c2C\u00c9\u0093\u0006\r\u00a5\u00ddN\u00ed0\nT\u0090\u00ceE\u0007h\u000e\u0007:\u00dfz\u00de\u0091\u00f7\u001d\u0002\u67d8\u621a\u0010\u007f\u00e4+\u009fP\u00ac\u00cb\u00ad\u0014(y:\u00cd\u00edbD\u0004\u8fc1\u635b\u5cf2\u600b\u0005P\u00be:\u00b4Q\u000e\u00dc\"=\u00d4\u009a\u00c2\u008e\u00c5,/\u00d7\u00b7\u001c\u00f7\u0002\u541b\u4ea9\u0002\u59bf\u52f0 \u001a}\u00d2Teh\u0006\u00d69\u00e6\u001a\u0088\f}1\u00fb\u00dc)b\u00acK\u0088\u00fb\u0080\u0084/rO\u0095\u0010\u008e?\u0002\u7c52\u8d48\u0006\u00f2\u00f0|&\u008a\u0006\u0004\u00d8\u00b9\u00c7F";
                        var12_3 = "bC\u00c1\u00eb3\u0002\u5eba\u6892\u0010\"\u00f5\u00e2.a\u009d\u00f1/\u00c3[*0\u00a3\u0006\u00d0\u000e\u0007\u0005\u00ab\u009d_~'\u009c\t\u00fc\u0018\u00f3e\u00aa\u0094\u0004<\u0016\u000f th\u00e8\u00d9%c\t\u00dd\u008bD\u0095%\u0092P\u000f\u00bb\u00fe\u001b\u00b9\u00b7\u000f\u00a2Eg=\u00f7\u00b7\u001a\u00f7\u00ff\u0004\u650b\u4e90\u7b26\u746a\u0002\u8fb1\u63cf\u0003\u009e\n\u008c\"!\u00eaH;\u00dd_\u00e3N\u00c8\u007fI\u00bd\u00c7\u00a6\u0019a~v5\u0000^\u00f5\u00f2:E4L\u00875\u0013=\u00ef\u000bS\u0002\u518d\u5cbe\u0003*v\u00cb\u0005\u00de+\u00f3\u00c0\u009c\u0005\u00c2C\u00c9\u0093\u0006\r\u00a5\u00ddN\u00ed0\nT\u0090\u00ceE\u0007h\u000e\u0007:\u00dfz\u00de\u0091\u00f7\u001d\u0002\u67d8\u621a\u0010\u007f\u00e4+\u009fP\u00ac\u00cb\u00ad\u0014(y:\u00cd\u00edbD\u0004\u8fc1\u635b\u5cf2\u600b\u0005P\u00be:\u00b4Q\u000e\u00dc\"=\u00d4\u009a\u00c2\u008e\u00c5,/\u00d7\u00b7\u001c\u00f7\u0002\u541b\u4ea9\u0002\u59bf\u52f0 \u001a}\u00d2Teh\u0006\u00d69\u00e6\u001a\u0088\f}1\u00fb\u00dc)b\u00acK\u0088\u00fb\u0080\u0084/rO\u0095\u0010\u008e?\u0002\u7c52\u8d48\u0006\u00f2\u00f0|&\u008a\u0006\u0004\u00d8\u00b9\u00c7F".length();
                        var9_4 = 5;
                        var8_5 = -1;
                        _y_0.W(0);
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 88;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00e3\u0005\u0003^b.2KL\u0097\u00c5\u0090\u00b4.\u0082\u00a62\u00e0[\u0016\u00a8Bm}\u00ca\u0002mE\u00d1\u009b9?\t\u00fe\u00b254\u00eb\u00aa\u00c1b\t\b\u00f3>\u00f4F\u008f`\u0015}\u0006\u0095\u00e9#)\u54b3\u4e7b\u8f1e\u519c\u00ee n\b\u536d\u51f7U\u00e2\u00a9u\u5206\u636c\"\fm\u00c6\u5375\u53d8\u0095\u00ca\u0094\t\u8d6a\u5f34x\u54ae\u4e08\u00c5\u00d08+\u5161\u95c6\u7a8f\u5385X\\";
                            var12_3 = "\u00e3\u0005\u0003^b.2KL\u0097\u00c5\u0090\u00b4.\u0082\u00a62\u00e0[\u0016\u00a8Bm}\u00ca\u0002mE\u00d1\u009b9?\t\u00fe\u00b254\u00eb\u00aa\u00c1b\t\b\u00f3>\u00f4F\u008f`\u0015}\u0006\u0095\u00e9#)\u54b3\u4e7b\u8f1e\u519c\u00ee n\b\u536d\u51f7U\u00e2\u00a9u\u5206\u636c\"\fm\u00c6\u5375\u53d8\u0095\u00ca\u0094\t\u8d6a\u5f34x\u54ae\u4e08\u00c5\u00d08+\u5161\u95c6\u7a8f\u5385X\\".length();
                            var9_4 = 55;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 46;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl86
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 69;
                                    break;
                                }
                                case 1: {
                                    v15 = 9;
                                    break;
                                }
                                case 2: {
                                    v15 = 106;
                                    break;
                                }
                                case 3: {
                                    v15 = 36;
                                    break;
                                }
                                case 4: {
                                    v15 = 74;
                                    break;
                                }
                                case 5: {
                                    v15 = 53;
                                    break;
                                }
                                default: {
                                    v15 = 29;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl86:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl96:
                        // 1 sources

                        ** continue;
                    }
                }
                _y_0.ab = var13;
                _y_0.bb = new String[30];
                var0_7 = 8281488511029061715L;
                var6_8 = new long[28];
                var3_9 = 0;
                var4_10 = "\u0011\u00c3j\u00801\u00d0\u0098\u0010\u00af-\u0017gA\u00cb\u00d4\u00bc9\u00eb\u00f4\u00caZ\u00fa\u00ca\u00b3\u00barOF\u00fe(q\u0099\u00a0=\u0095\u0089(D\u00c6\u0004T\u00d4\u00a9\u00a8\u008fUU\u0019)\u00a4O\u00bb|\u0018B\u007f\u00a4cN\"\u00ea\u00e4\u0083\u00de\u00e1\u00fa^\u0091\u00a1*\u00c3t\u00fb\u0092F\u00a6\u009e\u0006\u0015\u00bb`\u00a4\u0003$\u0097\u00e1\u0010\u0081\u0086(\"]\u00cd\u00b3\u00d0\u00e5\u00d4a\u0086\u009b\u00de\u0002'\u00f4\u00c5j\u0084\u00a5\u00d6A\u00e5T\u00e6\u001b\f-\u00e9\u00a8\u00b5\u00d3k\"\u009d2\u00ecZ&\u0006\u00ffS`\u0093{\u00e3\u00a4F3\u00bc{4D\u0015O\u0013O \u00c9lc[\u000b\u00e7Ne\u00b60ce=L\u00e4\u0093\u00ect\u00ff\u00f0Y\u009e\u0004\"\u0017\u00e5\u00e1u\u001bd\u00a0\u001e\u00a2\u00be\u00dc\u00d4\u00b1h\u00d2\u00ccM\u00b8YI*\u00dd\u00a7l\u00c2@g!\u00db\u00f1:\u00ba\u00da{\u000e\u0084\u00e2\u00f6";
                var5_11 = "\u0011\u00c3j\u00801\u00d0\u0098\u0010\u00af-\u0017gA\u00cb\u00d4\u00bc9\u00eb\u00f4\u00caZ\u00fa\u00ca\u00b3\u00barOF\u00fe(q\u0099\u00a0=\u0095\u0089(D\u00c6\u0004T\u00d4\u00a9\u00a8\u008fUU\u0019)\u00a4O\u00bb|\u0018B\u007f\u00a4cN\"\u00ea\u00e4\u0083\u00de\u00e1\u00fa^\u0091\u00a1*\u00c3t\u00fb\u0092F\u00a6\u009e\u0006\u0015\u00bb`\u00a4\u0003$\u0097\u00e1\u0010\u0081\u0086(\"]\u00cd\u00b3\u00d0\u00e5\u00d4a\u0086\u009b\u00de\u0002'\u00f4\u00c5j\u0084\u00a5\u00d6A\u00e5T\u00e6\u001b\f-\u00e9\u00a8\u00b5\u00d3k\"\u009d2\u00ecZ&\u0006\u00ffS`\u0093{\u00e3\u00a4F3\u00bc{4D\u0015O\u0013O \u00c9lc[\u000b\u00e7Ne\u00b60ce=L\u00e4\u0093\u00ect\u00ff\u00f0Y\u009e\u0004\"\u0017\u00e5\u00e1u\u001bd\u00a0\u001e\u00a2\u00be\u00dc\u00d4\u00b1h\u00d2\u00ccM\u00b8YI*\u00dd\u00a7l\u00c2@g!\u00db\u00f1:\u00ba\u00da{\u000e\u0084\u00e2\u00f6".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl113:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "#\u00f6\u00d2\u001b\u00ea\u00b2t`\u0084\u00ce\u00c26U\u00b7\u00f8\u00fd";
                    var5_11 = "#\u00f6\u00d2\u001b\u00ea\u00b2t`\u0084\u00ce\u00c26U\u00b7\u00f8\u00fd".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl126:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl137:
                // 1 sources

                ** continue;
            }
        }
        _y_0.eb = var6_8;
        _y_0.fb = new Integer[28];
        _y_0.w = LoggerFactory.getLogger(_y_0.class);
        _y_0.n = null;
    }

    public static void W(int n10) {
        S = n10;
    }

    public static int y() {
        return S;
    }

    public static int M() {
        int n10 = _y_0.y();
        if (n10 == 0) {
            return 36;
        }
        return 0;
    }

    private static SocketException a(SocketException socketException) {
        return socketException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF9EC4) & 0xFFFF;
        if (bb[n12] == null) {
            int n13;
            int n14;
            char[] cArray = ab[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 117;
                    break;
                }
                case 1: {
                    n14 = 254;
                    break;
                }
                case 2: {
                    n14 = 116;
                    break;
                }
                case 3: {
                    n14 = 228;
                    break;
                }
                case 4: {
                    n14 = 22;
                    break;
                }
                case 5: {
                    n14 = 144;
                    break;
                }
                case 6: {
                    n14 = 68;
                    break;
                }
                case 7: {
                    n14 = 214;
                    break;
                }
                case 8: {
                    n14 = 131;
                    break;
                }
                case 9: {
                    n14 = 24;
                    break;
                }
                case 10: {
                    n14 = 241;
                    break;
                }
                case 11: {
                    n14 = 222;
                    break;
                }
                case 12: {
                    n14 = 204;
                    break;
                }
                case 13: {
                    n14 = 129;
                    break;
                }
                case 14: {
                    n14 = 3;
                    break;
                }
                case 15: {
                    n14 = 114;
                    break;
                }
                case 16: {
                    n14 = 158;
                    break;
                }
                case 17: {
                    n14 = 86;
                    break;
                }
                case 18: {
                    n14 = 192;
                    break;
                }
                case 19: {
                    n14 = 164;
                    break;
                }
                case 20: {
                    n14 = 63;
                    break;
                }
                case 21: {
                    n14 = 210;
                    break;
                }
                case 22: {
                    n14 = 119;
                    break;
                }
                case 23: {
                    n14 = 236;
                    break;
                }
                case 24: {
                    n14 = 251;
                    break;
                }
                case 25: {
                    n14 = 132;
                    break;
                }
                case 26: {
                    n14 = 230;
                    break;
                }
                case 27: {
                    n14 = 125;
                    break;
                }
                case 28: {
                    n14 = 159;
                    break;
                }
                case 29: {
                    n14 = 10;
                    break;
                }
                case 30: {
                    n14 = 169;
                    break;
                }
                case 31: {
                    n14 = 180;
                    break;
                }
                case 32: {
                    n14 = 143;
                    break;
                }
                case 33: {
                    n14 = 235;
                    break;
                }
                case 34: {
                    n14 = 51;
                    break;
                }
                case 35: {
                    n14 = 140;
                    break;
                }
                case 36: {
                    n14 = 145;
                    break;
                }
                case 37: {
                    n14 = 232;
                    break;
                }
                case 38: {
                    n14 = 246;
                    break;
                }
                case 39: {
                    n14 = 101;
                    break;
                }
                case 40: {
                    n14 = 147;
                    break;
                }
                case 41: {
                    n14 = 110;
                    break;
                }
                case 42: {
                    n14 = 203;
                    break;
                }
                case 43: {
                    n14 = 8;
                    break;
                }
                case 44: {
                    n14 = 196;
                    break;
                }
                case 45: {
                    n14 = 218;
                    break;
                }
                case 46: {
                    n14 = 49;
                    break;
                }
                case 47: {
                    n14 = 29;
                    break;
                }
                case 48: {
                    n14 = 76;
                    break;
                }
                case 49: {
                    n14 = 102;
                    break;
                }
                case 50: {
                    n14 = 200;
                    break;
                }
                case 51: {
                    n14 = 209;
                    break;
                }
                case 52: {
                    n14 = 40;
                    break;
                }
                case 53: {
                    n14 = 55;
                    break;
                }
                case 54: {
                    n14 = 98;
                    break;
                }
                case 55: {
                    n14 = 75;
                    break;
                }
                case 56: {
                    n14 = 247;
                    break;
                }
                case 57: {
                    n14 = 91;
                    break;
                }
                case 58: {
                    n14 = 13;
                    break;
                }
                case 59: {
                    n14 = 122;
                    break;
                }
                case 60: {
                    n14 = 175;
                    break;
                }
                case 61: {
                    n14 = 166;
                    break;
                }
                case 62: {
                    n14 = 39;
                    break;
                }
                case 63: {
                    n14 = 19;
                    break;
                }
                case 64: {
                    n14 = 26;
                    break;
                }
                case 65: {
                    n14 = 34;
                    break;
                }
                case 66: {
                    n14 = 229;
                    break;
                }
                case 67: {
                    n14 = 202;
                    break;
                }
                case 68: {
                    n14 = 157;
                    break;
                }
                case 69: {
                    n14 = 170;
                    break;
                }
                case 70: {
                    n14 = 27;
                    break;
                }
                case 71: {
                    n14 = 135;
                    break;
                }
                case 72: {
                    n14 = 124;
                    break;
                }
                case 73: {
                    n14 = 90;
                    break;
                }
                case 74: {
                    n14 = 141;
                    break;
                }
                case 75: {
                    n14 = 118;
                    break;
                }
                case 76: {
                    n14 = 223;
                    break;
                }
                case 77: {
                    n14 = 32;
                    break;
                }
                case 78: {
                    n14 = 179;
                    break;
                }
                case 79: {
                    n14 = 224;
                    break;
                }
                case 80: {
                    n14 = 109;
                    break;
                }
                case 81: {
                    n14 = 100;
                    break;
                }
                case 82: {
                    n14 = 0;
                    break;
                }
                case 83: {
                    n14 = 7;
                    break;
                }
                case 84: {
                    n14 = 150;
                    break;
                }
                case 85: {
                    n14 = 41;
                    break;
                }
                case 86: {
                    n14 = 17;
                    break;
                }
                case 87: {
                    n14 = 59;
                    break;
                }
                case 88: {
                    n14 = 104;
                    break;
                }
                case 89: {
                    n14 = 225;
                    break;
                }
                case 90: {
                    n14 = 115;
                    break;
                }
                case 91: {
                    n14 = 73;
                    break;
                }
                case 92: {
                    n14 = 151;
                    break;
                }
                case 93: {
                    n14 = 126;
                    break;
                }
                case 94: {
                    n14 = 16;
                    break;
                }
                case 95: {
                    n14 = 189;
                    break;
                }
                case 96: {
                    n14 = 69;
                    break;
                }
                case 97: {
                    n14 = 201;
                    break;
                }
                case 98: {
                    n14 = 4;
                    break;
                }
                case 99: {
                    n14 = 95;
                    break;
                }
                case 100: {
                    n14 = 18;
                    break;
                }
                case 101: {
                    n14 = 248;
                    break;
                }
                case 102: {
                    n14 = 42;
                    break;
                }
                case 103: {
                    n14 = 205;
                    break;
                }
                case 104: {
                    n14 = 108;
                    break;
                }
                case 105: {
                    n14 = 77;
                    break;
                }
                case 106: {
                    n14 = 165;
                    break;
                }
                case 107: {
                    n14 = 207;
                    break;
                }
                case 108: {
                    n14 = 153;
                    break;
                }
                case 109: {
                    n14 = 183;
                    break;
                }
                case 110: {
                    n14 = 85;
                    break;
                }
                case 111: {
                    n14 = 123;
                    break;
                }
                case 112: {
                    n14 = 138;
                    break;
                }
                case 113: {
                    n14 = 78;
                    break;
                }
                case 114: {
                    n14 = 178;
                    break;
                }
                case 115: {
                    n14 = 97;
                    break;
                }
                case 116: {
                    n14 = 70;
                    break;
                }
                case 117: {
                    n14 = 245;
                    break;
                }
                case 118: {
                    n14 = 176;
                    break;
                }
                case 119: {
                    n14 = 64;
                    break;
                }
                case 120: {
                    n14 = 250;
                    break;
                }
                case 121: {
                    n14 = 186;
                    break;
                }
                case 122: {
                    n14 = 80;
                    break;
                }
                case 123: {
                    n14 = 130;
                    break;
                }
                case 124: {
                    n14 = 156;
                    break;
                }
                case 125: {
                    n14 = 53;
                    break;
                }
                case 126: {
                    n14 = 161;
                    break;
                }
                case 127: {
                    n14 = 84;
                    break;
                }
                case 128: {
                    n14 = 25;
                    break;
                }
                case 129: {
                    n14 = 173;
                    break;
                }
                case 130: {
                    n14 = 152;
                    break;
                }
                case 131: {
                    n14 = 255;
                    break;
                }
                case 132: {
                    n14 = 193;
                    break;
                }
                case 133: {
                    n14 = 47;
                    break;
                }
                case 134: {
                    n14 = 133;
                    break;
                }
                case 135: {
                    n14 = 121;
                    break;
                }
                case 136: {
                    n14 = 82;
                    break;
                }
                case 137: {
                    n14 = 242;
                    break;
                }
                case 138: {
                    n14 = 57;
                    break;
                }
                case 139: {
                    n14 = 160;
                    break;
                }
                case 140: {
                    n14 = 134;
                    break;
                }
                case 141: {
                    n14 = 15;
                    break;
                }
                case 142: {
                    n14 = 168;
                    break;
                }
                case 143: {
                    n14 = 44;
                    break;
                }
                case 144: {
                    n14 = 2;
                    break;
                }
                case 145: {
                    n14 = 21;
                    break;
                }
                case 146: {
                    n14 = 136;
                    break;
                }
                case 147: {
                    n14 = 50;
                    break;
                }
                case 148: {
                    n14 = 120;
                    break;
                }
                case 149: {
                    n14 = 38;
                    break;
                }
                case 150: {
                    n14 = 191;
                    break;
                }
                case 151: {
                    n14 = 93;
                    break;
                }
                case 152: {
                    n14 = 87;
                    break;
                }
                case 153: {
                    n14 = 28;
                    break;
                }
                case 154: {
                    n14 = 252;
                    break;
                }
                case 155: {
                    n14 = 139;
                    break;
                }
                case 156: {
                    n14 = 154;
                    break;
                }
                case 157: {
                    n14 = 231;
                    break;
                }
                case 158: {
                    n14 = 66;
                    break;
                }
                case 159: {
                    n14 = 99;
                    break;
                }
                case 160: {
                    n14 = 128;
                    break;
                }
                case 161: {
                    n14 = 187;
                    break;
                }
                case 162: {
                    n14 = 67;
                    break;
                }
                case 163: {
                    n14 = 74;
                    break;
                }
                case 164: {
                    n14 = 89;
                    break;
                }
                case 165: {
                    n14 = 220;
                    break;
                }
                case 166: {
                    n14 = 94;
                    break;
                }
                case 167: {
                    n14 = 52;
                    break;
                }
                case 168: {
                    n14 = 227;
                    break;
                }
                case 169: {
                    n14 = 215;
                    break;
                }
                case 170: {
                    n14 = 43;
                    break;
                }
                case 171: {
                    n14 = 11;
                    break;
                }
                case 172: {
                    n14 = 216;
                    break;
                }
                case 173: {
                    n14 = 54;
                    break;
                }
                case 174: {
                    n14 = 148;
                    break;
                }
                case 175: {
                    n14 = 149;
                    break;
                }
                case 176: {
                    n14 = 96;
                    break;
                }
                case 177: {
                    n14 = 105;
                    break;
                }
                case 178: {
                    n14 = 226;
                    break;
                }
                case 179: {
                    n14 = 213;
                    break;
                }
                case 180: {
                    n14 = 107;
                    break;
                }
                case 181: {
                    n14 = 172;
                    break;
                }
                case 182: {
                    n14 = 174;
                    break;
                }
                case 183: {
                    n14 = 177;
                    break;
                }
                case 184: {
                    n14 = 212;
                    break;
                }
                case 185: {
                    n14 = 14;
                    break;
                }
                case 186: {
                    n14 = 12;
                    break;
                }
                case 187: {
                    n14 = 106;
                    break;
                }
                case 188: {
                    n14 = 61;
                    break;
                }
                case 189: {
                    n14 = 155;
                    break;
                }
                case 190: {
                    n14 = 65;
                    break;
                }
                case 191: {
                    n14 = 167;
                    break;
                }
                case 192: {
                    n14 = 171;
                    break;
                }
                case 193: {
                    n14 = 185;
                    break;
                }
                case 194: {
                    n14 = 83;
                    break;
                }
                case 195: {
                    n14 = 199;
                    break;
                }
                case 196: {
                    n14 = 6;
                    break;
                }
                case 197: {
                    n14 = 35;
                    break;
                }
                case 198: {
                    n14 = 37;
                    break;
                }
                case 199: {
                    n14 = 79;
                    break;
                }
                case 200: {
                    n14 = 9;
                    break;
                }
                case 201: {
                    n14 = 56;
                    break;
                }
                case 202: {
                    n14 = 60;
                    break;
                }
                case 203: {
                    n14 = 111;
                    break;
                }
                case 204: {
                    n14 = 197;
                    break;
                }
                case 205: {
                    n14 = 243;
                    break;
                }
                case 206: {
                    n14 = 188;
                    break;
                }
                case 207: {
                    n14 = 208;
                    break;
                }
                case 208: {
                    n14 = 195;
                    break;
                }
                case 209: {
                    n14 = 162;
                    break;
                }
                case 210: {
                    n14 = 137;
                    break;
                }
                case 211: {
                    n14 = 62;
                    break;
                }
                case 212: {
                    n14 = 184;
                    break;
                }
                case 213: {
                    n14 = 190;
                    break;
                }
                case 214: {
                    n14 = 206;
                    break;
                }
                case 215: {
                    n14 = 240;
                    break;
                }
                case 216: {
                    n14 = 211;
                    break;
                }
                case 217: {
                    n14 = 20;
                    break;
                }
                case 218: {
                    n14 = 33;
                    break;
                }
                case 219: {
                    n14 = 45;
                    break;
                }
                case 220: {
                    n14 = 31;
                    break;
                }
                case 221: {
                    n14 = 194;
                    break;
                }
                case 222: {
                    n14 = 71;
                    break;
                }
                case 223: {
                    n14 = 46;
                    break;
                }
                case 224: {
                    n14 = 181;
                    break;
                }
                case 225: {
                    n14 = 1;
                    break;
                }
                case 226: {
                    n14 = 217;
                    break;
                }
                case 227: {
                    n14 = 5;
                    break;
                }
                case 228: {
                    n14 = 238;
                    break;
                }
                case 229: {
                    n14 = 127;
                    break;
                }
                case 230: {
                    n14 = 113;
                    break;
                }
                case 231: {
                    n14 = 142;
                    break;
                }
                case 232: {
                    n14 = 233;
                    break;
                }
                case 233: {
                    n14 = 103;
                    break;
                }
                case 234: {
                    n14 = 23;
                    break;
                }
                case 235: {
                    n14 = 48;
                    break;
                }
                case 236: {
                    n14 = 58;
                    break;
                }
                case 237: {
                    n14 = 221;
                    break;
                }
                case 238: {
                    n14 = 72;
                    break;
                }
                case 239: {
                    n14 = 253;
                    break;
                }
                case 240: {
                    n14 = 239;
                    break;
                }
                case 241: {
                    n14 = 198;
                    break;
                }
                case 242: {
                    n14 = 81;
                    break;
                }
                case 243: {
                    n14 = 92;
                    break;
                }
                case 244: {
                    n14 = 163;
                    break;
                }
                case 245: {
                    n14 = 146;
                    break;
                }
                case 246: {
                    n14 = 36;
                    break;
                }
                case 247: {
                    n14 = 234;
                    break;
                }
                case 248: {
                    n14 = 237;
                    break;
                }
                case 249: {
                    n14 = 249;
                    break;
                }
                case 250: {
                    n14 = 244;
                    break;
                }
                case 251: {
                    n14 = 30;
                    break;
                }
                case 252: {
                    n14 = 88;
                    break;
                }
                case 253: {
                    n14 = 112;
                    break;
                }
                case 254: {
                    n14 = 182;
                    break;
                }
                default: {
                    n14 = 219;
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
            _y_0.bb[n12] = new String(cArray).intern();
        }
        return bb[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4398;
        if (fb[n11] == null) {
            _y_0.fb[n11] = (int)(eb[n11] ^ l2);
        }
        return fb[n11];
    }
}

