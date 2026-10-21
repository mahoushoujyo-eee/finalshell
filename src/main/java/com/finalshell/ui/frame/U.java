package com.finalshell.ui.frame;

import com.finalshell.core.AL;
import com.finalshell.core.Ah2;
import com.finalshell.core.CS3_2;
import com.finalshell.core.Cp4;
import com.finalshell.core.Fb2;
import com.finalshell.core.Fv2_2;
import com.finalshell.core.Fx4;
import com.finalshell.core.GH_2;
import com.finalshell.core.KD;
import com.finalshell.core.KV;
import com.finalshell.core.Kj2;
import com.finalshell.core.Kx4_2;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.M6;
import com.finalshell.core.Ms2;
import com.finalshell.core.NY;
import com.finalshell.core.QP;
import com.finalshell.core.Qe2_2;
import com.finalshell.core.T32;
import com.finalshell.core.TV;
import com.finalshell.core.Ty2;
import com.finalshell.core.Ty4;
import com.finalshell.core.U62;
import com.finalshell.core.XF;
import com.finalshell.core.XF3;
import com.finalshell.core.Y12_2;
import com.finalshell.core.Y9;
import com.finalshell.core.Yl4;
import com.finalshell.core.ZG_2;
import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.BB;
import com.finalshell.task.C3;
import com.finalshell.task.Dh4;
import com.finalshell.task.Fj2;
import com.finalshell.task.KF;
import com.finalshell.task.Ka4;
import com.finalshell.task.L02;
import com.finalshell.task.Mz2;
import com.finalshell.task.No2_2;
import com.finalshell.task.O7;
import com.finalshell.task.OM;
import com.finalshell.task.OZ3;
import com.finalshell.task.Qn2;
import com.finalshell.task.Ux2;
import com.finalshell.task.Wg2;
import com.finalshell.task.Xt2;
import com.finalshell.task.Yb2;
import com.finalshell.task.Ye4;
import com.finalshell.ui.adapter.Od2;
import com.finalshell.ui.dialog.C5;
import com.finalshell.ui.dialog.KQ;
import com.finalshell.ui.dialog.U1;
import com.finalshell.ui.listener.BK;
import com.finalshell.ui.listener.BK3;
import com.finalshell.ui.listener.Bo2;
import com.finalshell.ui.listener.ConfirmCloseWindowListener;
import com.finalshell.ui.listener.Connection2;
import com.finalshell.ui.listener.Dc2;
import com.finalshell.ui.listener.F62;
import com.finalshell.ui.listener.FJ;
import com.finalshell.ui.listener.FW;
import com.finalshell.ui.listener.Fd4;
import com.finalshell.ui.listener.Jd2;
import com.finalshell.ui.listener.LT;
import com.finalshell.ui.listener.LV;
import com.finalshell.ui.listener.Lf2;
import com.finalshell.ui.listener.Od4;
import com.finalshell.ui.listener.TP;
import com.finalshell.ui.listener.Tw4;
import com.finalshell.ui.listener.UP;
import com.finalshell.ui.listener.WO;
import com.finalshell.ui.listener.X62;
import com.finalshell.ui.listener.Y4;
import com.finalshell.ui.listener.Ys_4;
import com.finalshell.ui.listener.Z0;
import com.finalshell.ui.listener.Ze2;
import com.finalshell.ui.model.LS;
import com.finalshell.ui.panel.AE;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.CE;
import com.finalshell.ui.panel.CL;
import com.finalshell.ui.panel.CT;
import com.finalshell.ui.panel.Ch2;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.DG3;
import com.finalshell.ui.panel.F5;
import com.finalshell.ui.panel.F8;
import com.finalshell.ui.panel.FY3;
import com.finalshell.ui.panel.FilePanel;
import com.finalshell.ui.panel.Ge2;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.NetworkMonitorPanel;
import com.finalshell.ui.panel.Refresh;
import com.finalshell.ui.panel.UU;
import com.finalshell.ui.panel.X;
import com.finalshell.ui.panel.XT3;
import com.finalshell.ui.panel.YX3;
import com.finalshell.ui.panel.Yp4;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSplitPane;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import net.miginfocom.swing.MigLayout;

public class U extends JFrame implements CS3_2, Ms2, AL, Fb2 {
   public Random hP;
   public static Map m;
   public static KQ y;
   public static JDialog b;
   public int hH;
   public ConnectionProperty hr;
   public int hm;
   public JButton hU;
   public JToggleButton hi;
   public int z;
   public int hv;
   public boolean h4;
   public static String hI;
   public String hA;
   public UU hG;
   public AE d;
   public float W;
   public int hD;
   public int J;
   public static int H;
   public JPanel a;
   public JPanel h0;
   public int v;
   public NetworkMonitorPanel h1;
   public static Ah2 i;
   public ConnectionProperty hn;
   public Kx4_2 R;
   public static Ox4 K;
   public static UpdateFrame f;
   public JSplitPane r;
   public Yp4 D;
   public NY F;
   public long X;
   public boolean T;
   public Rectangle Y;
   public Rectangle A;
   public Rectangle B;
   public int t;
   public AM C;
   public Ge2 o;
   public KV Q;
   public F8 P;
   public F5 hp;
   public CT N;
   public CE w;
   public com.finalshell.core.C O;
   public JPanel q;
   public static String j;
   public static String c;
   public static String hY;
   public U1 e;
   public boolean I;
   public JMenu k;
   public JPopupMenu hb;
   public static C5 u;
   public com.finalshell.core.C l;
   public Color s;
   public Color g;
   public RenderingHints h;
   public JPanel ha;
   public JPanel hg;
   public int L;
   public int U;
   public Fx4 Z;
   public M6 hM;
   public GH_2 E;
   public SystemTray hW;
   public TrayIcon V;
   public long hQ;
   public long n;
   public boolean S;
   public static long p;
   public static long hc;
   public int x;
   public int hO;
   public long G;
   public static String M;
   public static String[] ab;
   public static String[] bb;
   public static long[] cb;
   public static Integer[] db;
   public static long[] eb;
   public static Long[] fb;

   public U() {
   super((String)Registry.lookupField(621025023751330046L).get(null));
      short var10000 = 1449;
      short var10001 = -14990;
      Random var10003 = new Random();
      long var2 = 333157993979426081L;
      Random var1 = var10003;
      Ref.s(333157993979426081L, var1, var2);
      Registry.lookupField(452823831949634916L).setInt(this, 1);
      Registry.lookupField(248116968555281679L).setInt(this, 0);
      Registry.lookupField(563734721953453048L).setInt(this, -1);
      Registry.lookupField(568929910594850224L).setInt(this, a(20630, 8580117942563997816L));
      Registry.lookupField(186662013160929535L).setBoolean(this, false);
      long var4 = 448114050954083005L;
      String var3 = "";
      Ref.s(448114050954083005L, var3, var4);
      Registry.lookupField(624618836428943420L).setFloat(this, 1.0F);
      Registry.lookupField(491767757682910516L).setInt(this, a(7618, 1402006728911439145L));
      Registry.lookupField(331537502062700338L).setInt(this, a(25099, 1307261021286185702L));
      long var6 = 394260004741714434L;
      Object var5 = null;
      Ref.s(394260004741714434L, var5, var6);
      Registry.lookupField(597383034860606442L).setBoolean(this, false);
      Registry.lookupField(478711441447310286L).setInt(this, 0);
      KV var10006 = new KV();
      long var8 = 305081152315023558L;
      KV var7 = var10006;
      Ref.s(305081152315023558L, var7, var8);
      Registry.lookupField(215457793551818098L).setBoolean(this, false);
      Color var10007 = new Color(a(17215, 5362272149277547463L), a(17215, 5362272149277547463L), a(17215, 5362272149277547463L));
      long var10 = 360309369918999825L;
      Color var9 = var10007;
      Ref.s(360309369918999825L, var9, var10);
      Color var10008 = new Color(a(18166, 2359152542876802590L), a(17215, 5362272149277547463L), a(6637, 1130080905756295431L));
      long var12 = 173925038705818380L;
      Color var11 = var10008;
      Ref.s(173925038705818380L, var11, var12);
      RenderingHints var10009 = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      long var14 = 460802416977433453L;
      RenderingHints var13 = var10009;
      Ref.s(460802416977433453L, var13, var14);
      Registry.lookupField(515873310631527540L).setInt(this, a(22423, 1750005948873314171L));
      Object var15 = 333157993979426081L;
      Registry.lookupField(361734294472086805L).setInt(this, ((Random)Ref.g(333157993979426081L, var15)).nextInt());
      Registry.lookupField(130882364772064219L).setLong(this, b(11436, 7702393800341353154L));
      Registry.packArgs(a((int)this, (int)this));
      long var17 = 517287540690064504L;
      Registry.lookupField(613893959659572417L).set(null, Ref.h2(517287540690064504L, var17));
      Registry.lookupField(202829774198583901L).setLong(this, System.currentTimeMillis());
      Registry.lookupField(329679096789927195L).setBoolean(this, false);
      Registry.lookupField(421784410847310645L).setInt(this, 0);
      Registry.lookupField(332112685849834742L).setInt(this, -1);
      Registry.lookupField(143884728914136480L).setLong(this, System.currentTimeMillis());
   }

   @Override
   public void setLocation(int var1, int var2) {
      super.setLocation(var1, var2);
   }

   public void s$void() {
      Registry.packArgs(this);
      long var1 = 214213921318960935L;
      Ref.h2(214213921318960935L, var1);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void a(boolean var1) {
      String[] var10000 = F8.y();
      long var3 = System.currentTimeMillis();
      String[] var2 = var10000;
      Registry.emptyArgs();
      long var11 = 270389152141252877L;
      Ref.h2(270389152141252877L, var11);
      U62 var10002 = (U62)(Registry.emptyArgs());
      long var14 = 306266403902896148L;
      Object[] var13 = var10002;
      var10002 = Ref.h(306266403902896148L, var13, var14);

      try {
         var10002 = (U62)var10002;
      } catch (InvocationTargetException var87) {
         throw var87.getTargetException();
      }

      U62 var5 = var10002;
      Rectangle var10003 = Registry.emptyArgs();
      long var16 = 625743137504778004L;
      Object[] var15 = var10003;
      var10003 = Ref.h(625743137504778004L, var15, var16);

      try {
         var10003 = (Rectangle)var10003;
      } catch (InvocationTargetException var86) {
         throw var86.getTargetException();
      }

      if (var2 == null) {
         if (var10003 == null) {
            this.setSize(Registry.lookupField(491767757682910516L).getInt(this), Registry.lookupField(331537502062700338L).getInt(this));
         }

         var10003 = var5;
         Object[] var10004 = Registry.emptyArgs();
         long var18 = 625743137504778004L;
         Object[] var17 = var10004;
         Ref.h(625743137504778004L, var17, var18);

         try {
            ;
         } catch (InvocationTargetException var85) {
            throw var85.getTargetException();
         }
      }

      label247: {
         label252: {
            Object var6 = var10003;
            var10003 = (Rectangle)var6;
            if (var2 == null) {
               if (var6 == null) {
                  break label252;
               }

               var10003 = (Rectangle)var6;
            }

            int var93 = var10003.x;
            if (var2 == null) {
               if (var10003.x < 0) {
                  ((Rectangle)var6).x = 0;
               }

               var93 = ((Rectangle)var6).y;
            }

            if (var2 == null) {
               if (var93 < 0) {
                  ((Rectangle)var6).y = 0;
               }

               var93 = ((Rectangle)var6).width;
            }

            label237: {
               label253: {
                  int var95 = a(6578, 5223317279511200083L);
                  if (var2 == null) {
                     if (var93 < var95) {
                        ((Rectangle)var6).width = a(6637, 1130080905756295431L);
                     }

                     var10003 = (Rectangle)var6;
                     if (var2 != null) {
                        break label253;
                     }

                     var93 = ((Rectangle)var6).height;
                     var95 = a(6637, 1130080905756295431L);
                  }

                  if (var93 >= var95) {
                     break label237;
                  }

                  var10003 = (Rectangle)var6;
               }

               var10003.height = a(6637, 1130080905756295431L);
            }

            this.setBounds((Rectangle)var6);
            if (var2 == null) {
               break label247;
            }
         }

         this.setLocationRelativeTo(null);
      }

      Boolean var96 = (Boolean)(Registry.emptyArgs());
      long var20 = 415812574498702866L;
      Object[] var19 = var96;
      var96 = Ref.h(415812574498702866L, var19, var20);

      try {
         var96 = (Boolean)var96;
      } catch (InvocationTargetException var84) {
         throw var84.getTargetException();
      }

      if (var2 == null) {
         if (var96 == null) {
            this.setExtendedState(this.getExtendedState() | a(1289, 6556516967129669109L));
         }

         var96 = var5;
         Object[] var10005 = Registry.emptyArgs();
         long var22 = 494397881178401642L;
         Object[] var21 = var10005;
         var10005 = Ref.h(494397881178401642L, var21, var22);

         try {
            var101 = (Integer)var10005;
         } catch (InvocationTargetException var83) {
            throw var83.getTargetException();
         }

         Registry.lookupField(422798444273828739L).setInt(null, var101);
         Object[] var10007 = Registry.emptyArgs();
         long var24 = 464484439037630890L;
         Object[] var23 = var10007;
         var10007 = Ref.h(464484439037630890L, var23, var24);

         try {
            var105 = (Integer)var10007;
         } catch (InvocationTargetException var82) {
            throw var82.getTargetException();
         }

         Registry.lookupField(305205303689351969L).setInt(var5, var105);
         long var25 = 187791590270141607L;
      }

      label256: {
         U62 var7 = var96;
         U var99 = Registry.lookupField(422798444273828739L).getInt(null);
         if (var2 == null) {
            if (var99 < var7) {
               Registry.lookupField(422798444273828739L).setInt(null, (int)var7);
            }

            var99 = this;
            Object var27 = 467883177032167383L;
            ((JSplitPane)Ref.g(467883177032167383L, var27)).setDividerLocation(Registry.lookupField(422798444273828739L).getInt(null));
            Registry.emptyArgs();
            long var29 = 270389152141252877L;
            Ref.h2(270389152141252877L, var29);
            Object[] var106 = Registry.emptyArgs();
            long var32 = 306266403902896148L;
            Object[] var31 = var106;
            Ref.h(306266403902896148L, var31, var32);

            try {
               ;
            } catch (InvocationTargetException var81) {
               throw var81.getTargetException();
            }

            if (var2 != null) {
               break label256;
            }

            Object[] var10008 = Registry.emptyArgs();
            long var34 = 577875833820570498L;
            Object[] var33 = var10008;
            var10008 = Ref.h(577875833820570498L, var33, var34);

            try {
            } catch (InvocationTargetException var80) {
               throw var80.getTargetException();
            }
         }

         if (var99 == null) {
            Object var35 = 575209039576190599L;
            ((Yp4)Ref.g(575209039576190599L, var35)).removeAll();
            Object var37 = 575209039576190599L;
            Yp4 var10006 = (Yp4)Ref.g(575209039576190599L, var37);
            Object var39 = 346229218997944282L;
            this.add((JPanel)Ref.g(346229218997944282L, var39), a(1470, 25276));
         }

         Registry.lookupField(388376917454860932L).get(null);
         Object[] var102 = Registry.packArgs(new Qn2(this), a(22329, 2348891917367250896L));
         long var42 = 201859364639460244L;
         Object[] var41 = var102;
         var102 = Ref.h(201859364639460244L, var41, var42);
         long var44 = 300693558895432032L;
         Object var43 = var102;
         Ref.s(300693558895432032L, var43, var44);
         Registry.emptyArgs();
         long var45 = 270389152141252877L;
         Ref.h2(270389152141252877L, var45);
         Object[] var108 = Registry.emptyArgs();
         long var48 = 306266403902896148L;
         Object[] var47 = var108;
         Ref.h(306266403902896148L, var47, var48);

         try {
            ;
         } catch (InvocationTargetException var79) {
            throw var79.getTargetException();
         }
      }

      ZG_2 var10009 = (ZG_2)(Registry.packArgs(Registry.lookupField(352852381340555056L).getInt(null)));
      long var50 = 487190762664997585L;
      Object[] var49 = var10009;
      var10009 = Ref.h(487190762664997585L, var49, var50);

      try {
         var10009 = (ZG_2)var10009;
      } catch (InvocationTargetException var78) {
         throw var78.getTargetException();
      }

      ZG_2 var8 = var10009;
      Registry.emptyArgs();
      long var51 = 270389152141252877L;
      Ref.h2(270389152141252877L, var51);
      Object[] var10011 = Registry.emptyArgs();
      long var54 = 306266403902896148L;
      Object[] var53 = var10011;
      Ref.h(306266403902896148L, var53, var54);
      ZG_2 var10012 = (ZG_2)(Registry.packArgs(Registry.lookupField(141251469139917674L).getInt(null)));
      long var56 = 487190762664997585L;
      Object[] var55 = var10012;
      var10012 = Ref.h(487190762664997585L, var55, var56);

      try {
         var10012 = (ZG_2)var10012;
      } catch (InvocationTargetException var77) {
         throw var77.getTargetException();
      }

      ZG_2 var9 = var10012;
      QP var10 = new QP(this, this, var8, var9);
      Registry.emptyArgs();
      long var57 = 270389152141252877L;
      Ref.h2(270389152141252877L, var57);
      Object[] var10014 = Registry.packArgs(this);
      long var60 = 459969040127248336L;
      Object[] var59 = var10014;
      Ref.h(459969040127248336L, var59, var60);

      try {
         ;
      } catch (InvocationTargetException var76) {
         throw var76.getTargetException();
      }

      label258: {
         label212: {
            if (var2 == null) {
               if (!Registry.lookupField(512549005631583976L).getBoolean(null)) {
                  break label212;
               }

               Object[] var10015 = Registry.packArgs(true);
               long var62 = 254006751159696560L;
               Object[] var61 = var10015;
               Ref.h(254006751159696560L, var61, var62);

               try {
                  ;
               } catch (InvocationTargetException var75) {
                  throw var75.getTargetException();
               }

               Object[] var10016 = Registry.packArgs(false);
               long var64 = 254006751159696560L;
               Object[] var63 = var10016;
               Ref.h(254006751159696560L, var63, var64);

               try {
                  ;
               } catch (InvocationTargetException var74) {
                  throw var74.getTargetException();
               }
            }

            if (var2 == null) {
               break label258;
            }
         }

         Object[] var113 = Registry.packArgs(var1);
         long var66 = 254006751159696560L;
         Object[] var65 = var113;
         Ref.h(254006751159696560L, var65, var66);

         try {
            ;
         } catch (InvocationTargetException var73) {
            throw var73.getTargetException();
         }
      }

      SwingUtilities.invokeLater(new Mz2(this));
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var114 = Registry.packArgs(new O7(this, var10));
      long var68 = 434592463220957006L;
      Object[] var67 = var114;
      Ref.h(434592463220957006L, var67, var68);

      try {
         ;
      } catch (InvocationTargetException var72) {
         throw var72.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var115 = Registry.packArgs(new Ka4(this));
      long var70 = 434592463220957006L;
      Object[] var69 = var115;
      Ref.h(434592463220957006L, var69, var70);

      try {
         ;
      } catch (InvocationTargetException var71) {
         throw var71.getTargetException();
      }
   }

   public void k$void() {
      Object var1 = 132798821314429637L;
      AE var10001 = (AE)Ref.g(132798821314429637L, var1);
      Object var3 = 132798821314429637L;
      this.setDividerLocation(((AE)Ref.g(132798821314429637L, var3)).getHeight());
      Object var5 = 132798821314429637L;
      ((AE)Ref.g(132798821314429637L, var5)).setDividerSize(0);
      this.validate();
      this.doLayout();
   }

   public void N(boolean var1) {
      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Ref.h2(270389152141252877L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 634817973682994708L;
      Object[] var5 = var10003;
      var10003 = Ref.h(634817973682994708L, var5, var6);
      long var8 = 564402720002801007L;
      Object var7 = var10003;
      Ref.s(564402720002801007L, var7, var8);
      Object var9 = 564402720002801007L;
      Ref.g(564402720002801007L, var9);
      Object[] var10006 = Registry.emptyArgs();
      long var12 = 240567170779145617L;
      Object[] var11 = var10006;
      var10006 = Ref.h(240567170779145617L, var11, var12);
      long var14 = 494886012324216737L;
      Object var13 = var10006;
      Ref.s(494886012324216737L, var13, var14);
      Registry.emptyArgs();
      long var15 = 270389152141252877L;
      Ref.h2(270389152141252877L, var15);
      Object[] var10009 = Registry.emptyArgs();
      long var18 = 399585344452154517L;
      Object[] var17 = var10009;
      var10009 = Ref.h(399585344452154517L, var17, var18);
      long var20 = 319704886150947677L;
      Object var19 = var10009;
      Ref.s(319704886150947677L, var19, var20);
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10010 = Registry.packArgs(new L02(this));
      long var22 = 434592463220957006L;
      Object[] var21 = var10010;
      Ref.h(434592463220957006L, var21, var22);

      try {
         ;
      } catch (InvocationTargetException var46) {
         throw var46.getTargetException();
      }

      F8.y();
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10012 = Registry.packArgs(new Yb2(this));
      long var24 = 434592463220957006L;
      Object[] var23 = var10012;
      Ref.h(434592463220957006L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var45) {
         throw var45.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10013 = Registry.packArgs(new Xt2(this));
      long var26 = 434592463220957006L;
      Object[] var25 = var10013;
      Ref.h(434592463220957006L, var25, var26);

      try {
         ;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      JPanel var10014 = new JPanel();
      long var28 = 346229218997944282L;
      JPanel var27 = var10014;
      Ref.s(346229218997944282L, var27, var28);
      Registry.lookupField(202829774198583901L).setLong(this, System.currentTimeMillis());
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var50 = Registry.packArgs(new BB(this));
      long var30 = 434592463220957006L;
      Object[] var29 = var50;
      Ref.h(434592463220957006L, var29, var30);

      try {
         ;
      } catch (InvocationTargetException var43) {
         throw var43.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10015 = Registry.packArgs(new Fj2(this));
      long var32 = 434592463220957006L;
      Object[] var31 = var10015;
      Ref.h(434592463220957006L, var31, var32);

      try {
         ;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10016 = Registry.packArgs(new KF(this));
      long var34 = 434592463220957006L;
      Object[] var33 = var10016;
      Ref.h(434592463220957006L, var33, var34);

      try {
         ;
      } catch (InvocationTargetException var41) {
         throw var41.getTargetException();
      }

      Object[] var10017 = Registry.emptyArgs();
      long var36 = 603983761173484132L;
      Object[] var35 = var10017;
      Ref.h(603983761173484132L, var35, var36);

      try {
         ;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      this.addWindowListener(new BK(this));
      this.addComponentListener(new Dc2(this));
      this.addWindowStateListener(new TV(this));
      if (this == null) {
         if ((Ah2)Registry.lookupField(440862887533695589L).get(null) == null) {
            Registry.lookupField(440862887533695589L).set(null, new Ah2());
         }

         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10018 = Registry.packArgs(new OM(this));
         long var38 = 434592463220957006L;
         Object[] var37 = var10018;
         Ref.h(434592463220957006L, var37, var38);

         try {
            ;
         } catch (InvocationTargetException var39) {
            throw var39.getTargetException();
         }

         this.addWindowListener(new X62(this));
         this.addWindowListener(new F62(this));
      }
   }

   public void f() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/F8.y ()[Ljava/lang/String;
      // 003: astore 1
      // 004: invokestatic java/awt/SystemTray.isSupported ()Z
      // 007: ifeq 184
      // 00a: new java/awt/PopupMenu
      // 00d: dup
      // 00e: invokespecial java/awt/PopupMenu.<init> ()V
      // 011: astore 2
      // 012: aload 0
      // 013: invokestatic java/awt/SystemTray.getSystemTray ()Ljava/awt/SystemTray;
      // 016: ldc2_w 573712784446116525
      // 019: astore 7
      // 01b: astore 6
      // 01d: ldc2_w 573712784446116525
      // 020: aload 6
      // 022: aload 7
      // 024: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 027: aload 0
      // 028: new java/awt/TrayIcon
      // 02b: dup
      // 02c: ldc2_w 582605604039442414
      // 02f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 032: aconst_null
      // 033: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 036: checkcast java/awt/Image
      // 039: sipush 1467
      // 03c: sipush 12520
      // 03f: invokestatic com/finalshell/ui/frame/U.a (II)Ljava/lang/String;
      // 042: aload 2
      // 043: invokespecial java/awt/TrayIcon.<init> (Ljava/awt/Image;Ljava/lang/String;Ljava/awt/PopupMenu;)V
      // 046: ldc2_w 282728648492890070
      // 049: astore 9
      // 04b: astore 8
      // 04d: ldc2_w 282728648492890070
      // 050: aload 8
      // 052: aload 9
      // 054: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 057: aload 0
      // 058: ldc2_w 282728648492890070
      // 05b: astore 10
      // 05d: ldc2_w 282728648492890070
      // 060: aload 10
      // 062: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 065: checkcast java/awt/TrayIcon
      // 068: bipush 1
      // 069: invokevirtual java/awt/TrayIcon.setImageAutoSize (Z)V
      // 06c: aload 0
      // 06d: ldc2_w 282728648492890070
      // 070: astore 12
      // 072: ldc2_w 282728648492890070
      // 075: aload 12
      // 077: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 07a: checkcast java/awt/TrayIcon
      // 07d: bipush 1
      // 07e: invokevirtual java/awt/TrayIcon.setImageAutoSize (Z)V
      // 081: aload 0
      // 082: ldc2_w 282728648492890070
      // 085: astore 14
      // 087: ldc2_w 282728648492890070
      // 08a: aload 14
      // 08c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 08f: checkcast java/awt/TrayIcon
      // 092: new com/finalshell/ui/listener/Bn4
      // 095: dup
      // 096: aload 0
      // 097: invokespecial com/finalshell/ui/listener/Bn4.<init> (Lcom/finalshell/ui/frame/U;)V
      // 09a: invokevirtual java/awt/TrayIcon.addMouseListener (Ljava/awt/event/MouseListener;)V
      // 09d: aload 0
      // 09e: ldc2_w 573712784446116525
      // 0a1: astore 16
      // 0a3: ldc2_w 573712784446116525
      // 0a6: aload 16
      // 0a8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ab: checkcast java/awt/SystemTray
      // 0ae: aload 0
      // 0af: ldc2_w 282728648492890070
      // 0b2: astore 18
      // 0b4: ldc2_w 282728648492890070
      // 0b7: aload 18
      // 0b9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0bc: checkcast java/awt/TrayIcon
      // 0bf: invokevirtual java/awt/SystemTray.add (Ljava/awt/TrayIcon;)V
      // 0c2: goto 0ca
      // 0c5: astore 3
      // 0c6: aload 3
      // 0c7: invokevirtual java/awt/AWTException.printStackTrace ()V
      // 0ca: new java/awt/MenuItem
      // 0cd: dup
      // 0ce: sipush 1409
      // 0d1: sipush 18804
      // 0d4: invokestatic com/finalshell/ui/frame/U.a (II)Ljava/lang/String;
      // 0d7: invokespecial java/awt/MenuItem.<init> (Ljava/lang/String;)V
      // 0da: astore 3
      // 0db: aload 3
      // 0dc: ldc2_w 395970988011231853
      // 0df: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e2: aconst_null
      // 0e3: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0e6: checkcast java/awt/Font
      // 0e9: invokevirtual java/awt/MenuItem.setFont (Ljava/awt/Font;)V
      // 0ec: new com/finalshell/ui/listener/Yb4
      // 0ef: dup
      // 0f0: aload 0
      // 0f1: invokespecial com/finalshell/ui/listener/Yb4.<init> (Lcom/finalshell/ui/frame/U;)V
      // 0f4: astore 4
      // 0f6: aload 3
      // 0f7: aload 1
      // 0f8: ifnonnull 133
      // 0fb: aload 4
      // 0fd: invokevirtual java/awt/MenuItem.addActionListener (Ljava/awt/event/ActionListener;)V
      // 100: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 103: ldc2_w 454647487873911743
      // 106: astore 20
      // 108: ldc2_w 454647487873911743
      // 10b: aload 20
      // 10d: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 110: checkcast java/lang/Boolean
      // 113: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 116: goto 11d
      // 119: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: ifeq 134
      // 120: goto 127
      // 123: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: aload 2
      // 128: aload 3
      // 129: invokevirtual java/awt/PopupMenu.add (Ljava/awt/MenuItem;)Ljava/awt/MenuItem;
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: pop
      // 134: goto 13e
      // 137: astore 4
      // 139: aload 4
      // 13b: invokevirtual java/lang/Exception.printStackTrace ()V
      // 13e: new java/awt/MenuItem
      // 141: dup
      // 142: sipush 1457
      // 145: sipush 1921
      // 148: invokestatic com/finalshell/ui/frame/U.a (II)Ljava/lang/String;
      // 14b: invokespecial java/awt/MenuItem.<init> (Ljava/lang/String;)V
      // 14e: astore 4
      // 150: aload 4
      // 152: ldc2_w 395970988011231853
      // 155: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 158: aconst_null
      // 159: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 15c: checkcast java/awt/Font
      // 15f: invokevirtual java/awt/MenuItem.setFont (Ljava/awt/Font;)V
      // 162: new com/finalshell/ui/listener/Js2
      // 165: dup
      // 166: aload 0
      // 167: invokespecial com/finalshell/ui/listener/Js2.<init> (Lcom/finalshell/ui/frame/U;)V
      // 16a: astore 5
      // 16c: aload 4
      // 16e: aload 5
      // 170: invokevirtual java/awt/MenuItem.addActionListener (Ljava/awt/event/ActionListener;)V
      // 173: aload 2
      // 174: aload 4
      // 176: invokevirtual java/awt/PopupMenu.add (Ljava/awt/MenuItem;)Ljava/awt/MenuItem;
      // 179: pop
      // 17a: goto 184
      // 17d: astore 5
      // 17f: aload 5
      // 181: invokevirtual java/lang/Exception.printStackTrace ()V
      // 184: return
   }

   public boolean l$boolean() {
      return Registry.lookupField(329679096789927195L).getBoolean(this);
   }

   public static void P() {
      Registry.lookupField(245459929255404945L).set(null, new JDialog());
      ((JDialog)Registry.lookupField(245459929255404945L).get(null)).setSize(0, 0);
      ((JDialog)Registry.lookupField(245459929255404945L).get(null)).setVisible(false);
   }

   public void h() {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 527731823251475298L;
      Object[] var3 = var10001;
      Ref.h(527731823251475298L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      Object[] var10002 = Registry.emptyArgs();
      long var6 = 494133230614533268L;
      Object[] var5 = var10002;
      Ref.h(494133230614533268L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      Object[] var10003 = Registry.packArgs(a(1468, -10247));
      long var8 = 519460332647460288L;
      Object[] var7 = var10003;
      Ref.h(519460332647460288L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Object[] var10004 = Registry.packArgs(true);
      long var10 = 125138821564397699L;
      Object[] var9 = var10004;
      Ref.h(125138821564397699L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      Object[] var10005 = Registry.emptyArgs();
      long var12 = 176235325809488947L;
      Object[] var11 = var10005;
      Ref.h(176235325809488947L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }
   }

   public void H(File var1, boolean var2) {
      Object var3 = 493158471773442262L;
      Object var10004 = Ref.g(493158471773442262L, var3);
      ArrayList var10005 = (ArrayList)(Registry.emptyArgs());
      long var6 = 230171768324088030L;
      Object[] var5 = var10005;
      var10005 = Ref.h(230171768324088030L, var5, var6);

      try {
         var10005 = (ArrayList)var10005;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      Object[] var10003 = Registry.packArgs(this, (boolean)var10004, var10005.size());
      long var8 = 303258325573791200L;
      Object[] var7 = var10003;
      Ref.h(303258325573791200L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public void w(File param1, boolean param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/F8.y ()[Ljava/lang/String;
      // 003: aconst_null
      // 004: astore 5
      // 006: bipush 0
      // 007: istore 6
      // 009: astore 4
      // 00b: aload 0
      // 00c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 00f: ldc2_w 179934491990092343
      // 012: astore 22
      // 014: astore 21
      // 016: ldc2_w 179934491990092343
      // 019: aload 21
      // 01b: aload 22
      // 01d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 020: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 023: goto 02a
      // 026: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 029: athrow
      // 02a: astore 7
      // 02c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 02f: ldc2_w 270389152141252877
      // 032: astore 23
      // 034: ldc2_w 270389152141252877
      // 037: aload 23
      // 039: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 03c: goto 043
      // 03f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 042: athrow
      // 043: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 046: ldc2_w 410905379772103887
      // 049: astore 26
      // 04b: astore 25
      // 04d: ldc2_w 410905379772103887
      // 050: aload 25
      // 052: aload 26
      // 054: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 057: goto 05e
      // 05a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: aload 1
      // 05f: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 062: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 065: ldc2_w 489768706953623433
      // 068: astore 28
      // 06a: astore 27
      // 06c: ldc2_w 489768706953623433
      // 06f: aload 27
      // 071: aload 28
      // 073: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 076: checkcast com/finalshell/core/Lv4_2
      // 079: goto 080
      // 07c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 07f: athrow
      // 080: astore 8
      // 082: aload 8
      // 084: invokestatic java/lang/System.currentTimeMillis ()J
      // 087: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 08a: ldc2_w 561144248899778332
      // 08d: astore 30
      // 08f: astore 29
      // 091: ldc2_w 561144248899778332
      // 094: aload 29
      // 096: aload 30
      // 098: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 09b: pop
      // 09c: goto 0a3
      // 09f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0a6: ldc2_w 270389152141252877
      // 0a9: astore 31
      // 0ab: ldc2_w 270389152141252877
      // 0ae: aload 31
      // 0b0: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0b3: goto 0ba
      // 0b6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0bd: ldc2_w 410905379772103887
      // 0c0: astore 34
      // 0c2: astore 33
      // 0c4: ldc2_w 410905379772103887
      // 0c7: aload 33
      // 0c9: aload 34
      // 0cb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ce: goto 0d5
      // 0d1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: aload 8
      // 0d7: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0da: ldc2_w 370860320396635908
      // 0dd: astore 36
      // 0df: astore 35
      // 0e1: ldc2_w 370860320396635908
      // 0e4: aload 35
      // 0e6: aload 36
      // 0e8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0eb: pop
      // 0ec: goto 0f3
      // 0ef: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f2: athrow
      // 0f3: aload 8
      // 0f5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0f8: ldc2_w 402271797068414482
      // 0fb: astore 38
      // 0fd: astore 37
      // 0ff: ldc2_w 402271797068414482
      // 102: aload 37
      // 104: aload 38
      // 106: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 109: checkcast java/lang/Integer
      // 10c: invokevirtual java/lang/Integer.intValue ()I
      // 10f: goto 116
      // 112: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 115: athrow
      // 116: istore 9
      // 118: iload 9
      // 11a: ldc2_w 590765520000496083
      // 11d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 120: aconst_null
      // 121: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 124: aload 4
      // 126: ifnonnull 2b4
      // 129: if_icmpne 2a1
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: aload 0
      // 134: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 137: ldc2_w 303756590022481369
      // 13a: astore 40
      // 13c: astore 39
      // 13e: ldc2_w 303756590022481369
      // 141: aload 39
      // 143: aload 40
      // 145: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 148: goto 14f
      // 14b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14e: athrow
      // 14f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 152: ldc2_w 230171768324088030
      // 155: astore 42
      // 157: astore 41
      // 159: ldc2_w 230171768324088030
      // 15c: aload 41
      // 15e: aload 42
      // 160: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 163: checkcast java/util/ArrayList
      // 166: goto 16d
      // 169: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 16c: athrow
      // 16d: invokevirtual java/util/ArrayList.size ()I
      // 170: aload 4
      // 172: ifnonnull 19a
      // 175: goto 17c
      // 178: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17b: athrow
      // 17c: ifeq 192
      // 17f: goto 186
      // 182: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 185: athrow
      // 186: aload 7
      // 188: ifnonnull 1a1
      // 18b: goto 192
      // 18e: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 191: athrow
      // 192: bipush 1
      // 193: goto 19a
      // 196: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 199: athrow
      // 19a: istore 6
      // 19c: aload 4
      // 19e: ifnull 21d
      // 1a1: aconst_null
      // 1a2: astore 10
      // 1a4: aload 7
      // 1a6: aload 4
      // 1a8: ifnonnull 1b7
      // 1ab: ifnull 1bf
      // 1ae: goto 1b5
      // 1b1: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b4: athrow
      // 1b5: aload 7
      // 1b7: invokevirtual com/finalshell/ui/panel/ConnectionProperty.s$Fv_2 ()Lcom/finalshell/core/Fv2_2;
      // 1ba: checkcast com/finalshell/core/Cj4
      // 1bd: astore 10
      // 1bf: aconst_null
      // 1c0: astore 11
      // 1c2: aload 10
      // 1c4: aload 4
      // 1c6: ifnonnull 1d5
      // 1c9: ifnull 1da
      // 1cc: goto 1d3
      // 1cf: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d2: athrow
      // 1d3: aload 10
      // 1d5: invokevirtual com/finalshell/core/Cj4.e ()Lcom/finalshell/crypto/ConnectHost;
      // 1d8: astore 11
      // 1da: aload 11
      // 1dc: aload 4
      // 1de: ifnonnull 1ed
      // 1e1: ifnull 21d
      // 1e4: goto 1eb
      // 1e7: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ea: athrow
      // 1eb: aload 11
      // 1ed: invokevirtual com/finalshell/crypto/ConnectHost.t$boolean ()Z
      // 1f0: aload 4
      // 1f2: ifnonnull 21b
      // 1f5: ifne 21a
      // 1f8: goto 1ff
      // 1fb: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fe: athrow
      // 1ff: aload 11
      // 201: invokevirtual com/finalshell/crypto/ConnectHost.i$boolean ()Z
      // 204: aload 4
      // 206: ifnonnull 21b
      // 209: goto 210
      // 20c: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20f: athrow
      // 210: ifeq 21d
      // 213: goto 21a
      // 216: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 219: athrow
      // 21a: bipush 1
      // 21b: istore 6
      // 21d: aconst_null
      // 21e: astore 10
      // 220: iload 2
      // 221: aload 4
      // 223: ifnonnull 235
      // 226: ifeq 233
      // 229: goto 230
      // 22c: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22f: athrow
      // 230: bipush 1
      // 231: istore 6
      // 233: iload 6
      // 235: ifeq 25d
      // 238: aload 0
      // 239: iload 3
      // 23a: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 23d: ldc2_w 373772676770569629
      // 240: astore 44
      // 242: astore 43
      // 244: ldc2_w 373772676770569629
      // 247: aload 43
      // 249: aload 44
      // 24b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 24e: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 251: goto 258
      // 254: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 257: athrow
      // 258: astore 10
      // 25a: goto 261
      // 25d: aload 7
      // 25f: astore 10
      // 261: iload 9
      // 263: ldc2_w 590765520000496083
      // 266: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 269: aconst_null
      // 26a: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 26d: if_icmpne 29c
      // 270: aload 0
      // 271: aload 10
      // 273: aload 1
      // 274: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 277: iload 6
      // 279: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 27c: ldc2_w 274870394042991893
      // 27f: astore 46
      // 281: astore 45
      // 283: ldc2_w 274870394042991893
      // 286: aload 45
      // 288: aload 46
      // 28a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 28d: pop
      // 28e: goto 295
      // 291: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 294: athrow
      // 295: goto 29c
      // 298: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29b: athrow
      // 29c: aload 4
      // 29e: ifnull 704
      // 2a1: iload 9
      // 2a3: ldc2_w 292712586650823274
      // 2a6: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2a9: aconst_null
      // 2aa: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 2ad: goto 2b4
      // 2b0: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b3: athrow
      // 2b4: if_icmpne 704
      // 2b7: aload 8
      // 2b9: astore 5
      // 2bb: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 2be: invokevirtual java/awt/Toolkit.getScreenSize ()Ljava/awt/Dimension;
      // 2c1: astore 10
      // 2c3: aload 5
      // 2c5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2c8: ldc2_w 412792667242934937
      // 2cb: astore 48
      // 2cd: astore 47
      // 2cf: ldc2_w 412792667242934937
      // 2d2: aload 47
      // 2d4: aload 48
      // 2d6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2d9: checkcast java/lang/Integer
      // 2dc: invokevirtual java/lang/Integer.intValue ()I
      // 2df: goto 2e6
      // 2e2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2e5: athrow
      // 2e6: istore 11
      // 2e8: aload 5
      // 2ea: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2ed: ldc2_w 435664632647390684
      // 2f0: astore 50
      // 2f2: astore 49
      // 2f4: ldc2_w 435664632647390684
      // 2f7: aload 49
      // 2f9: aload 50
      // 2fb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2fe: checkcast java/lang/Integer
      // 301: invokevirtual java/lang/Integer.intValue ()I
      // 304: goto 30b
      // 307: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 30a: athrow
      // 30b: istore 12
      // 30d: aload 10
      // 30f: getfield java/awt/Dimension.width I
      // 312: iload 11
      // 314: isub
      // 315: bipush 2
      // 316: idiv
      // 317: istore 13
      // 319: aload 10
      // 31b: getfield java/awt/Dimension.height I
      // 31e: iload 12
      // 320: isub
      // 321: bipush 2
      // 322: idiv
      // 323: istore 14
      // 325: aconst_null
      // 326: astore 15
      // 328: aload 5
      // 32a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 32d: ldc2_w 210756892633166167
      // 330: astore 52
      // 332: astore 51
      // 334: ldc2_w 210756892633166167
      // 337: aload 51
      // 339: aload 52
      // 33b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 33e: checkcast java/lang/Boolean
      // 341: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 344: goto 34b
      // 347: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 34a: athrow
      // 34b: ifeq 353
      // 34e: invokestatic java/io/File.listRoots ()[Ljava/io/File;
      // 351: astore 15
      // 353: ldc ""
      // 355: astore 16
      // 357: aload 5
      // 359: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 35c: ldc2_w 255973732097233937
      // 35f: astore 54
      // 361: astore 53
      // 363: ldc2_w 255973732097233937
      // 366: aload 53
      // 368: aload 54
      // 36a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 36d: checkcast java/lang/String
      // 370: goto 377
      // 373: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 376: athrow
      // 377: astore 17
      // 379: aload 17
      // 37b: astore 18
      // 37d: aload 18
      // 37f: ldc_w "@"
      // 382: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 385: aload 4
      // 387: ifnonnull 3c7
      // 38a: ifeq 3b8
      // 38d: goto 394
      // 390: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 393: athrow
      // 394: aload 18
      // 396: ldc_w "@"
      // 399: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 39c: istore 19
      // 39e: aload 18
      // 3a0: bipush 0
      // 3a1: iload 19
      // 3a3: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 3a6: astore 17
      // 3a8: aload 18
      // 3aa: iload 19
      // 3ac: bipush 1
      // 3ad: iadd
      // 3ae: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 3b1: astore 16
      // 3b3: aload 4
      // 3b5: ifnull 3f5
      // 3b8: aload 18
      // 3ba: ldc_w "\\"
      // 3bd: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 3c0: goto 3c7
      // 3c3: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c6: athrow
      // 3c7: aload 4
      // 3c9: ifnonnull 418
      // 3cc: ifeq 3f5
      // 3cf: goto 3d6
      // 3d2: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d5: athrow
      // 3d6: aload 18
      // 3d8: ldc_w "\\"
      // 3db: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 3de: istore 19
      // 3e0: aload 18
      // 3e2: bipush 0
      // 3e3: iload 19
      // 3e5: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 3e8: astore 16
      // 3ea: aload 18
      // 3ec: iload 19
      // 3ee: bipush 1
      // 3ef: iadd
      // 3f0: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 3f3: astore 17
      // 3f5: aload 5
      // 3f7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3fa: ldc2_w 581008912184751225
      // 3fd: astore 56
      // 3ff: astore 55
      // 401: ldc2_w 581008912184751225
      // 404: aload 55
      // 406: aload 56
      // 408: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 40b: checkcast java/lang/Boolean
      // 40e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 411: goto 418
      // 414: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 417: athrow
      // 418: aload 4
      // 41a: ifnonnull 460
      // 41d: ifne 463
      // 420: goto 427
      // 423: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 426: athrow
      // 427: aload 5
      // 429: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 42c: ldc2_w 603433831346798442
      // 42f: astore 58
      // 431: astore 57
      // 433: ldc2_w 603433831346798442
      // 436: aload 57
      // 438: aload 58
      // 43a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 43d: checkcast java/lang/String
      // 440: goto 447
      // 443: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 446: athrow
      // 447: aload 4
      // 449: ifnonnull 656
      // 44c: goto 453
      // 44f: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 452: athrow
      // 453: ldc_w "0"
      // 456: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 459: goto 460
      // 45c: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45f: athrow
      // 460: ifne 62f
      // 463: new java/lang/StringBuilder
      // 466: dup
      // 467: invokespecial java/lang/StringBuilder.<init> ()V
      // 46a: aload 5
      // 46c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 46f: ldc2_w 286931176286176762
      // 472: astore 60
      // 474: astore 59
      // 476: ldc2_w 286931176286176762
      // 479: aload 59
      // 47b: aload 60
      // 47d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 480: checkcast java/lang/String
      // 483: goto 48a
      // 486: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 489: athrow
      // 48a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 48d: sipush 1424
      // 490: sipush -18825
      // 493: invokestatic com/finalshell/ui/frame/U.a (II)Ljava/lang/String;
      // 496: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 499: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 49c: astore 19
      // 49e: aload 5
      // 4a0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4a3: ldc2_w 603433831346798442
      // 4a6: astore 62
      // 4a8: astore 61
      // 4aa: ldc2_w 603433831346798442
      // 4ad: aload 61
      // 4af: aload 62
      // 4b1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4b4: checkcast java/lang/String
      // 4b7: goto 4be
      // 4ba: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4bd: athrow
      // 4be: aload 4
      // 4c0: ifnonnull 51b
      // 4c3: ldc_w "0"
      // 4c6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4c9: ifne 50e
      // 4cc: goto 4d3
      // 4cf: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d2: athrow
      // 4d3: new java/lang/StringBuilder
      // 4d6: dup
      // 4d7: invokespecial java/lang/StringBuilder.<init> ()V
      // 4da: aload 5
      // 4dc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4df: ldc2_w 286931176286176762
      // 4e2: astore 64
      // 4e4: astore 63
      // 4e6: ldc2_w 286931176286176762
      // 4e9: aload 63
      // 4eb: aload 64
      // 4ed: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4f0: checkcast java/lang/String
      // 4f3: goto 4fa
      // 4f6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4f9: athrow
      // 4fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4fd: sipush 1471
      // 500: sipush -3722
      // 503: invokestatic com/finalshell/ui/frame/U.a (II)Ljava/lang/String;
      // 506: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 509: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 50c: astore 19
      // 50e: ldc2_w 311768198477767120
      // 511: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 514: aconst_null
      // 515: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 518: checkcast java/lang/String
      // 51b: ldc2_w 469230216286842026
      // 51e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 521: aconst_null
      // 522: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 525: aload 5
      // 527: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 52a: ldc2_w 380415140795833934
      // 52d: astore 66
      // 52f: astore 65
      // 531: ldc2_w 380415140795833934
      // 534: aload 65
      // 536: aload 66
      // 538: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 53b: goto 542
      // 53e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 541: athrow
      // 542: aload 5
      // 544: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 547: ldc2_w 255354522009994316
      // 54a: astore 68
      // 54c: astore 67
      // 54e: ldc2_w 255354522009994316
      // 551: aload 67
      // 553: aload 68
      // 555: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 558: checkcast java/lang/Integer
      // 55b: invokevirtual java/lang/Integer.intValue ()I
      // 55e: goto 565
      // 561: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 564: athrow
      // 565: aload 5
      // 567: ldc2_w 341315699110986526
      // 56a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 56d: aconst_null
      // 56e: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 571: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)[Ljava/lang/Object;
      // 574: ldc2_w 431876029874513089
      // 577: astore 69
      // 579: ldc2_w 431876029874513089
      // 57c: aload 69
      // 57e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 581: checkcast com/finalshell/core/XB_2
      // 584: goto 58b
      // 587: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 58a: athrow
      // 58b: astore 20
      // 58d: aload 19
      // 58f: bipush 1
      // 590: aload 5
      // 592: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 595: ldc2_w 195538594886366540
      // 598: astore 72
      // 59a: astore 71
      // 59c: ldc2_w 195538594886366540
      // 59f: aload 71
      // 5a1: aload 72
      // 5a3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5a6: checkcast java/lang/String
      // 5a9: goto 5b0
      // 5ac: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5af: athrow
      // 5b0: aload 17
      // 5b2: new java/lang/StringBuilder
      // 5b5: dup
      // 5b6: invokespecial java/lang/StringBuilder.<init> ()V
      // 5b9: sipush 1438
      // 5bc: sipush -19539
      // 5bf: invokestatic com/finalshell/ui/frame/U.a (II)Ljava/lang/String;
      // 5c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5c5: aload 20
      // 5c7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5ca: ldc2_w 238472531152875862
      // 5cd: astore 74
      // 5cf: astore 73
      // 5d1: ldc2_w 238472531152875862
      // 5d4: aload 73
      // 5d6: aload 74
      // 5d8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5db: checkcast java/lang/Integer
      // 5de: invokevirtual java/lang/Integer.intValue ()I
      // 5e1: goto 5e8
      // 5e4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5e7: athrow
      // 5e8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 5eb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5ee: aload 16
      // 5f0: iload 13
      // 5f2: iload 14
      // 5f4: iload 11
      // 5f6: iload 12
      // 5f8: aload 15
      // 5fa: aload 5
      // 5fc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5ff: ldc2_w 527408693245614383
      // 602: astore 76
      // 604: astore 75
      // 606: ldc2_w 527408693245614383
      // 609: aload 75
      // 60b: aload 76
      // 60d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 610: checkcast java/lang/Boolean
      // 613: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 616: goto 61d
      // 619: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 61c: athrow
      // 61d: invokestatic com/finalshell/core/Sx2.e (Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIII[Ljava/io/File;Z)V
      // 620: goto 62a
      // 623: astore 20
      // 625: aload 20
      // 627: invokevirtual java/lang/Exception.printStackTrace ()V
      // 62a: aload 4
      // 62c: ifnull 704
      // 62f: aload 5
      // 631: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 634: ldc2_w 286931176286176762
      // 637: astore 78
      // 639: astore 77
      // 63b: ldc2_w 286931176286176762
      // 63e: aload 77
      // 640: aload 78
      // 642: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 645: checkcast java/lang/String
      // 648: goto 64f
      // 64b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 64e: athrow
      // 64f: goto 656
      // 652: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 655: athrow
      // 656: bipush 1
      // 657: aload 5
      // 659: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 65c: ldc2_w 195538594886366540
      // 65f: astore 80
      // 661: astore 79
      // 663: ldc2_w 195538594886366540
      // 666: aload 79
      // 668: aload 80
      // 66a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 66d: checkcast java/lang/String
      // 670: goto 677
      // 673: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 676: athrow
      // 677: aload 17
      // 679: new java/lang/StringBuilder
      // 67c: dup
      // 67d: invokespecial java/lang/StringBuilder.<init> ()V
      // 680: aload 5
      // 682: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 685: ldc2_w 380415140795833934
      // 688: astore 82
      // 68a: astore 81
      // 68c: ldc2_w 380415140795833934
      // 68f: aload 81
      // 691: aload 82
      // 693: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 696: checkcast java/lang/String
      // 699: goto 6a0
      // 69c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 69f: athrow
      // 6a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6a3: ldc_w ":"
      // 6a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6a9: aload 5
      // 6ab: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 6ae: ldc2_w 255354522009994316
      // 6b1: astore 84
      // 6b3: astore 83
      // 6b5: ldc2_w 255354522009994316
      // 6b8: aload 83
      // 6ba: aload 84
      // 6bc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6bf: checkcast java/lang/Integer
      // 6c2: invokevirtual java/lang/Integer.intValue ()I
      // 6c5: goto 6cc
      // 6c8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6cb: athrow
      // 6cc: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6cf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6d2: aload 16
      // 6d4: iload 13
      // 6d6: iload 14
      // 6d8: iload 11
      // 6da: iload 12
      // 6dc: aload 15
      // 6de: aload 5
      // 6e0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 6e3: ldc2_w 527408693245614383
      // 6e6: astore 86
      // 6e8: astore 85
      // 6ea: ldc2_w 527408693245614383
      // 6ed: aload 85
      // 6ef: aload 86
      // 6f1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6f4: checkcast java/lang/Boolean
      // 6f7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 6fa: goto 701
      // 6fd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 700: athrow
      // 701: invokestatic com/finalshell/core/Sx2.e (Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIII[Ljava/io/File;Z)V
      // 704: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 707: ldc2_w 270389152141252877
      // 70a: astore 87
      // 70c: ldc2_w 270389152141252877
      // 70f: aload 87
      // 711: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 714: goto 71b
      // 717: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 71a: athrow
      // 71b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 71e: ldc2_w 306266403902896148
      // 721: astore 90
      // 723: astore 89
      // 725: ldc2_w 306266403902896148
      // 728: aload 89
      // 72a: aload 90
      // 72c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 72f: goto 736
      // 732: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 735: athrow
      // 736: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 739: ldc2_w 236705034508525556
      // 73c: astore 92
      // 73e: astore 91
      // 740: ldc2_w 236705034508525556
      // 743: aload 91
      // 745: aload 92
      // 747: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 74a: checkcast java/lang/Boolean
      // 74d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 750: goto 757
      // 753: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 756: athrow
      // 757: ifeq 76c
      // 75a: new com/finalshell/task/X5
      // 75d: dup
      // 75e: aload 0
      // 75f: invokespecial com/finalshell/task/X5.<init> (Lcom/finalshell/ui/frame/U;)V
      // 762: invokestatic javax/swing/SwingUtilities.invokeLater (Ljava/lang/Runnable;)V
      // 765: goto 76c
      // 768: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76b: athrow
      // 76c: return
   }

   @Override
   public void processWindowEvent(WindowEvent var1) {
      String[] var2 = F8.y();
      if (var2 == null) {
         Registry.emptyArgs();
         long var4 = 270389152141252877L;
         Ref.h2(270389152141252877L, var4);
         Object[] var10002 = Registry.emptyArgs();
         long var7 = 306266403902896148L;
         Object[] var6 = var10002;
         Ref.h(306266403902896148L, var6, var7);
         Object[] var10003 = Registry.emptyArgs();
         long var9 = 249847093911123285L;
         Object[] var8 = var10003;
         var10003 = Ref.h(249847093911123285L, var8, var9);

         try {
            var12 = (Boolean)var10003;
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         label34:
         if (var12) {
            int var13 = var1.getID();
            if (var2 == null) {
               if (var13 != a(30423, 4174033386881592874L)) {
                  break label34;
               }

               var13 = JOptionPane.showConfirmDialog(this, a(1452, -15361), a(1465, -18403), 0);
            }

            int var3 = var13;
            if (var3 != 0) {
               return;
            }
         }

         super.processWindowEvent(var1);
      }
   }

   public NY k$nY() {
      Object var1 = 290540599632617730L;
      return (NY)Ref.g(290540599632617730L, var1);
   }

   public void Z(NY var1) {
      long var3 = 290540599632617730L;
      Ref.s(290540599632617730L, var1, var3);
   }

   public Yp4 n$yp_4() {
      Object var1 = 575209039576190599L;
      return (Yp4)Ref.g(575209039576190599L, var1);
   }

   public void n(Yp4 var1) {
      long var3 = 575209039576190599L;
      Ref.s(575209039576190599L, var1, var3);
   }

   public void u$void() {
      Registry.lookupField(383251759444111355L).setLong(null, System.currentTimeMillis());
   }

   public void V() {
      ((Hashtable)Registry.lookupField(437649544414018819L).get(null))
         .put(Registry.lookupField(304769639644063862L).getInt(null), b(6827, 7846952360063419587L));
   }

   public void j() {
      String[] var10000 = F8.y();
      long var2 = System.currentTimeMillis() - Registry.lookupField(193840005716781234L).getLong(this);
      String[] var1 = var10000;
      if (var1 == null) {
         if (var2 >= 0L && var2 < b(6843, 491614487839655127L)) {








            long var13 = 415110337336862462L;
            Ref.s(415110337336862462L, this, var13);
         }

         Object var14 = 334734068447833544L;
         Object var10002 = Ref.g(334734068447833544L, var14);
         long var17 = 620488187317011732L;
         Object var16 = var10002;
         Ref.s(620488187317011732L, var16, var17);
         Rectangle var10003 = this.getBounds();
         long var19 = 334734068447833544L;
         Rectangle var18 = var10003;
         Ref.s(334734068447833544L, var18, var19);
      }
   }

   public void A() {
      F8.y();
      Registry.emptyArgs();
      long var4 = 270389152141252877L;
      Object var10002 = Ref.h2(270389152141252877L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 306266403902896148L;
      Object[] var6 = var10003;
      Ref.h(306266403902896148L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var46) {
         throw var46.getTargetException();
      }

      Object var1;
      label99: {
         var1 = var10002;
         if (var1 == null) {
            var10003 = Registry.packArgs(Registry.lookupField(597383034860606442L).getBoolean(this));
            long var9 = 492558090210172060L;
            Object[] var8 = var10003;
            Ref.h(492558090210172060L, var8, var9);

            try {
               ;
            } catch (InvocationTargetException var45) {
               throw var45.getTargetException();
            }

            if (!Registry.lookupField(597383034860606442L).getBoolean(this)) {
               Object[] var10004 = Registry.packArgs(this.getBounds());
               long var11 = 196018286726292473L;
               Object[] var10 = var10004;
               Ref.h(196018286726292473L, var10, var11);

               try {
                  ;
               } catch (InvocationTargetException var44) {
                  throw var44.getTargetException();
               }

               if (var1 == null) {
                  break label99;
               }
            }
         }

         Object var12 = 415110337336862462L;
         Object[] var48 = Registry.packArgs(Ref.g(415110337336862462L, var12));
         long var15 = 196018286726292473L;
         Object[] var14 = var48;
         Ref.h(196018286726292473L, var14, var15);

         try {
            ;
         } catch (InvocationTargetException var43) {
            throw var43.getTargetException();
         }
      }

      Object var16 = 467883177032167383L;
      Object[] var10006 = Registry.packArgs(((JSplitPane)Ref.g(467883177032167383L, var16)).getDividerLocation());
      long var19 = 509173332807679088L;
      Object[] var18 = var10006;
      Ref.h(509173332807679088L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      if (var1 == null) {
         Object var20 = 132798821314429637L;
         Ref.g(132798821314429637L, var20);
         Object[] var10008 = Registry.emptyArgs();
         long var23 = 608818074819783119L;
         Object[] var22 = var10008;
         var10008 = Ref.h(608818074819783119L, var22, var23);

         try {
         } catch (InvocationTargetException var41) {
            throw var41.getTargetException();
         }

         Object var24 = 132798821314429637L;
         if (this != ((AE)Ref.g(132798821314429637L, var24)).getHeight()) {
            Object var26 = 132798821314429637L;
            ((AE)Ref.g(132798821314429637L, var26)).getHeight();
            Object var28 = 132798821314429637L;
            Object var10012 = Ref.g(132798821314429637L, var28);
            Object[] var10013 = Registry.emptyArgs();
            long var31 = 608818074819783119L;
            Object[] var30 = var10013;
            var10013 = Ref.h(608818074819783119L, var30, var31);

            try {
               var51 = (Integer)var10013;
            } catch (InvocationTargetException var40) {
               throw var40.getTargetException();
            }

            int var3 = var10012 - var51 - Registry.lookupField(515873310631527540L).getInt(this);
            var10013 = Registry.packArgs(var3);
            long var33 = 635312012166914341L;
            Object[] var32 = var10013;
            Ref.h(635312012166914341L, var32, var33);

            try {
               ;
            } catch (InvocationTargetException var39) {
               throw var39.getTargetException();
            }
         }

         Registry.emptyArgs();
         long var34 = 270389152141252877L;
         Ref.h2(270389152141252877L, var34);
         Object[] var10011 = Registry.emptyArgs();
         long var37 = 578864097947885485L;
         Object[] var36 = var10011;
         Ref.h(578864097947885485L, var36, var37);

         try {
            ;
         } catch (InvocationTargetException var38) {
            throw var38.getTargetException();
         }
      }
   }

   public void z() {
      Registry.emptyArgs();
      long var1 = 270389152141252877L;
      Ref.h2(270389152141252877L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 292622089215767678L;
      Object[] var3 = var10002;
      Ref.h(292622089215767678L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void e() {
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 471028881269544104L;
      Object[] var1 = var10001;
      Ref.h(471028881269544104L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      Object[] var10002 = Registry.emptyArgs();
      long var4 = 464705958305749948L;
      Object[] var3 = var10002;
      Ref.h(464705958305749948L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Object[] var10003 = Registry.emptyArgs();
      long var6 = 191372337252275059L;
      Object[] var5 = var10003;
      Ref.h(191372337252275059L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void w() {
      String[] var1 = F8.y();
      if (var1 == null) {
         Registry.emptyArgs();
         long var3 = 270389152141252877L;
         Ref.h2(270389152141252877L, var3);
         Object[] var10002 = Registry.emptyArgs();
         long var6 = 306266403902896148L;
         Object[] var5 = var10002;
         Ref.h(306266403902896148L, var5, var6);
         Object[] var10003 = Registry.emptyArgs();
         long var8 = 249847093911123285L;
         Object[] var7 = var10003;
         var10003 = Ref.h(249847093911123285L, var7, var8);

         try {
            var20 = (Boolean)var10003;
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         if (var20) {
            int var2 = JOptionPane.showConfirmDialog(this, a(1443, -22723), a(1411, 11768), 0);
            if (var2 != 0) {
               return;
            }
         }

         Object[] var10004 = Registry.emptyArgs();
         long var10 = 471028881269544104L;
         Object[] var9 = var10004;
         Ref.h(471028881269544104L, var9, var10);

         try {
            ;
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

         Object[] var10005 = Registry.emptyArgs();
         long var12 = 464705958305749948L;
         Object[] var11 = var10005;
         Ref.h(464705958305749948L, var11, var12);

         try {
            ;
         } catch (InvocationTargetException var16) {
            throw var16.getTargetException();
         }

         Object[] var10006 = Registry.emptyArgs();
         long var14 = 191372337252275059L;
         Object[] var13 = var10006;
         Ref.h(191372337252275059L, var13, var14);

         try {
            ;
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }
      }
   }

   public void r() {
      F8.y();
      Object[] var10002 = Registry.emptyArgs();
      long var3 = 471028881269544104L;
      Object[] var2 = var10002;
      Ref.h(471028881269544104L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      if (this == null) {
         var10002 = Registry.emptyArgs();
         long var5 = 464705958305749948L;
         Object[] var4 = var10002;
         Ref.h(464705958305749948L, var4, var5);

         try {
            ;
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }

         Registry.emptyArgs();
         long var6 = 270389152141252877L;
         Ref.h2(270389152141252877L, var6);
         Object[] var10004 = Registry.emptyArgs();
         long var9 = 306266403902896148L;
         Object[] var8 = var10004;
         Ref.h(306266403902896148L, var8, var9);
         Object[] var10005 = Registry.emptyArgs();
         long var11 = 593871185714058018L;
         Object[] var10 = var10005;
         var10005 = Ref.h(593871185714058018L, var10, var11);

         try {
            var24 = (Boolean)var10005;
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         if (var24) {
            Object[] var10006 = Registry.packArgs(false);
            long var13 = 254006751159696560L;
            Object[] var12 = var10006;
            Ref.h(254006751159696560L, var12, var13);

            try {
               ;
            } catch (InvocationTargetException var17) {
               throw var17.getTargetException();
            }

            if (this == null) {
               return;
            }
         }
      }

      var10002 = Registry.emptyArgs();
      long var15 = 191372337252275059L;
      Object[] var14 = var10002;
      Ref.h(191372337252275059L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }

   public void R() {
      F8.y();
      Object var8 = 493158471773442262L;
      Object var10002 = Ref.g(493158471773442262L, var8);
      ArrayList var10003 = (ArrayList)(Registry.emptyArgs());
      long var11 = 230171768324088030L;
      Object[] var10 = var10003;
      var10003 = Ref.h(230171768324088030L, var10, var11);

      try {
         var10003 = (ArrayList)var10003;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      ArrayList var2 = var10003;
      Object var1 = var10002;

      for (T32 var4 : var2) {
         var10003 = Registry.emptyArgs();
         long var13 = 424156930953488367L;
         Object[] var12 = var10003;
         var10003 = Ref.h(424156930953488367L, var12, var13);

         try {
            var10003 = (F8)var10003;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         label52: {
            F8 var5 = var10003;
            F8 var21 = var5;
            if (var1 == null) {
               if (!var5.getClass().equals(ConnectionProperty.class)) {
                  break label52;
               }

               var21 = var5;
            }

            ConnectionProperty var6 = (ConnectionProperty)var21;
            ConnectHost var7 = var6.s$Fv_2().e();
            ConnectHost var22 = var7;
            if (var1 == null) {
               if (var7 == null) {
                  break label52;
               }

               var22 = var7;
            }

            var22.G();
         }

         if (var1 != null) {
            break;
         }
      }
   }

   public void X() {
      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Ref.h2(270389152141252877L, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 634817973682994708L;
      Object[] var5 = var10002;
      Ref.h(634817973682994708L, var5, var6);
      M6 var10003 = (M6)(Registry.emptyArgs());
      long var8 = 240567170779145617L;
      Object[] var7 = var10003;
      var10003 = Ref.h(240567170779145617L, var7, var8);

      try {
         var10003 = (M6)var10003;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      M6 var2 = var10003;
      F8.y();
      Object[] var10005 = Registry.packArgs(this);
      long var10 = 190074496529442240L;
      Object[] var9 = var10005;
      Ref.h(190074496529442240L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }

      Object var11 = 300693558895432032L;
      Ref.g(300693558895432032L, var11);
      Object[] var10006 = Registry.emptyArgs();
      long var14 = 624731062495880669L;
      Object[] var13 = var10006;
      Ref.h(624731062495880669L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }

      Object var15 = 493158471773442262L;
      Ref.g(493158471773442262L, var15);
      Object[] var10008 = Registry.emptyArgs();
      long var18 = 409034760944520307L;
      Object[] var17 = var10008;
      Ref.h(409034760944520307L, var17, var18);

      try {
         ;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      if (var2 == null) {
         Object var19 = 573712784446116525L;
         if ((SystemTray)Ref.g(573712784446116525L, var19) != null) {
            Object var21 = 573712784446116525L;
            SystemTray var10010 = (SystemTray)Ref.g(573712784446116525L, var21);
            Object var23 = 282728648492890070L;
            this.remove((TrayIcon)Ref.g(282728648492890070L, var23));
         }

         Object[] var44 = Registry.packArgs(false);
         long var26 = 254006751159696560L;
         Object[] var25 = var44;
         Ref.h(254006751159696560L, var25, var26);

         try {
            ;
         } catch (InvocationTargetException var35) {
            throw var35.getTargetException();
         }
      }

      this.dispose();
      Object[] var10009 = Registry.emptyArgs();
      long var28 = 434378456762125415L;
      Object[] var27 = var10009;
      var10009 = Ref.h(434378456762125415L, var27, var28);

      try {
         var43 = (Integer)var10009;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      if (var43 == 0) {
         Registry.emptyArgs();
         long var29 = 270389152141252877L;
         Ref.h2(270389152141252877L, var29);
         Object[] var10011 = Registry.emptyArgs();
         long var32 = 292622089215767678L;
         Object[] var31 = var10011;
         Ref.h(292622089215767678L, var31, var32);

         try {
            ;
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }
      }
   }

   @Override
   public void setVisible(boolean var1) {
      super.setVisible(var1);
   }

   public synchronized void t() {
      String[] var1 = F8.y();
      if (var1 == null) {
         Object var5 = 498692346592337143L;
         if ((NetworkMonitorPanel)Ref.g(498692346592337143L, var5) == null) {
            return;
         }

         Object var7 = 305081152315023558L;
         Ref.g(305081152315023558L, var7);
         Object[] var10003 = Registry.packArgs(this);
         long var10 = 449161193767360614L;
         Object[] var9 = var10003;
         Ref.h(449161193767360614L, var9, var10);

         try {
            ;
         } catch (InvocationTargetException var177) {
            throw var177.getTargetException();
         }
      }

      Object var11 = 395703699466617837L;
      Object var10001 = (F8)Ref.g(395703699466617837L, var11);
      if (var1 == null) {
         if (var10001 == null) {
            Object var13 = 498692346592337143L;
            Ref.g(498692346592337143L, var13);
            Object var15 = 305081152315023558L;
            Object[] var10004 = Registry.packArgs(Ref.g(305081152315023558L, var15), null);
            long var18 = 604541551035870242L;
            Object[] var17 = var10004;
            Ref.h(604541551035870242L, var17, var18);

            try {
               ;
            } catch (InvocationTargetException var176) {
               throw var176.getTargetException();
            }

            if (var1 == null) {
               return;
            }
         }

         var10001 = this;
         Object var19 = 395703699466617837L;
         F8 var10002 = (F8)Ref.g(395703699466617837L, var19);
      }

      var10001 = var10001.getClass().equals(ConnectionProperty.class);
      if (var1 == null) {
         if (var10001 == null) {
            if (var1 == null) {
               Object var21 = 208444474277099894L;
               if ((ConnectionProperty)Ref.g(208444474277099894L, var21) != null) {
                  label421: {
                     Object var23 = 208444474277099894L;
                     Ty2 var2 = ((ConnectionProperty)Ref.g(208444474277099894L, var23)).M$Ty_2();
                     if (var1 != null || var2 != null) {
                        KV var199 = (KV)(Registry.emptyArgs());
                        long var26 = 121632250293569146L;
                        Object[] var25 = var199;
                        var199 = Ref.h(121632250293569146L, var25, var26);

                        try {
                           var199 = (KV)var199;
                        } catch (InvocationTargetException var175) {
                           throw var175.getTargetException();
                        }

                        label396: {
                           KV var3 = var199;
                           if (var1 == null) {
                              if (var3 == null) {
                                 break label396;
                              }

                              Object[] var10005 = Registry.packArgs(this);
                              long var28 = 449161193767360614L;
                              Object[] var27 = var10005;
                              Ref.h(449161193767360614L, var27, var28);

                              try {
                                 ;
                              } catch (InvocationTargetException var174) {
                                 throw var174.getTargetException();
                              }
                           }

                           Object var29 = 208444474277099894L;
                           Object[] var10006 = Registry.packArgs(Ref.g(208444474277099894L, var29));
                           long var32 = 584673351562298838L;
                           Object[] var31 = var10006;
                           Ref.h(584673351562298838L, var31, var32);

                           try {
                              ;
                           } catch (InvocationTargetException var173) {
                              throw var173.getTargetException();
                           }

                           Object var33 = 498692346592337143L;
                           Ref.g(498692346592337143L, var33);
                           Object var35 = 208444474277099894L;
                           Lv4_2 var10010 = ((ConnectionProperty)Ref.g(208444474277099894L, var35)).a();
                           Object[] var10011 = Registry.emptyArgs();
                           long var38 = 292557478156152530L;
                           Object[] var37 = var10011;
                           Object[] var226 = Registry.packArgs(var10010, Ref.h(292557478156152530L, var37, var38));
                           long var40 = 604541551035870242L;
                           Object[] var39 = var226;
                           Ref.h(604541551035870242L, var39, var40);

                           try {
                              ;
                           } catch (InvocationTargetException var172) {
                              throw var172.getTargetException();
                           }
                        }

                        if (var1 == null) {
                           break label421;
                        }
                     }

                     Object var41 = 498692346592337143L;
                     Ref.g(498692346592337143L, var41);
                     Object var43 = 305081152315023558L;
                     Object[] var10013 = Registry.packArgs(Ref.g(305081152315023558L, var43), null);
                     long var46 = 604541551035870242L;
                     Object[] var45 = var10013;
                     Ref.h(604541551035870242L, var45, var46);

                     try {
                        ;
                     } catch (InvocationTargetException var171) {
                        throw var171.getTargetException();
                     }
                  }

                  if (var1 == null) {
                     return;
                  }
               }
            }

            Object var47 = 498692346592337143L;
            Ref.g(498692346592337143L, var47);
            Object var49 = 305081152315023558L;
            Object[] var202 = Registry.packArgs(Ref.g(305081152315023558L, var49), null);
            long var52 = 604541551035870242L;
            Object[] var51 = var202;
            Ref.h(604541551035870242L, var51, var52);

            try {
               ;
            } catch (InvocationTargetException var170) {
               throw var170.getTargetException();
            }

            if (var1 == null) {
               return;
            }
         }

         var10001 = this;
         Object var53 = 395703699466617837L;
         ((F8)Ref.g(395703699466617837L, var53)).getClass().equals(F5.class);
      }

      if (var1 == null) {
         if (var10001 == null) {
            Object var55 = 130734847106351886L;
            Ref.g(130734847106351886L, var55);
            KV var187 = (KV)(Registry.emptyArgs());
            long var58 = 222831659983477795L;
            Object[] var57 = var187;
            var187 = Ref.h(222831659983477795L, var57, var58);

            try {
               var187 = (KV)var187;
            } catch (InvocationTargetException var169) {
               throw var169.getTargetException();
            }

            KV var178 = var187;
            String var182 = null;
            Object var59 = 130734847106351886L;
            Ref.g(130734847106351886L, var59);
            Lv4_2 var207 = (Lv4_2)(Registry.emptyArgs());
            long var62 = 354946602891880038L;
            Object[] var61 = var207;
            var207 = Ref.h(354946602891880038L, var61, var62);

            try {
               var207 = (Lv4_2)var207;
            } catch (InvocationTargetException var168) {
               throw var168.getTargetException();
            }

            label399: {
               if (var1 == null) {
                  if (var207 == null) {
                     break label399;
                  }

                  Object var63 = 130734847106351886L;
                  Ref.g(130734847106351886L, var63);
                  Object[] var10007 = Registry.emptyArgs();
                  long var66 = 354946602891880038L;
                  Object[] var65 = var10007;
                  Ref.h(354946602891880038L, var65, var66);

                  try {
                     ;
                  } catch (InvocationTargetException var167) {
                     throw var167.getTargetException();
                  }
               }

               String var210 = (String)(Registry.emptyArgs());
               long var68 = 292557478156152530L;
               Object[] var67 = var210;
               var210 = Ref.h(292557478156152530L, var67, var68);

               try {
                  var210 = (String)var210;
               } catch (InvocationTargetException var166) {
                  throw var166.getTargetException();
               }

               var182 = var210;
            }

            Object var69 = 498692346592337143L;
            Ref.g(498692346592337143L, var69);
            Object[] var10008 = Registry.packArgs(var178, var182);
            long var72 = 604541551035870242L;
            Object[] var71 = var10008;
            Ref.h(604541551035870242L, var71, var72);

            try {
               ;
            } catch (InvocationTargetException var165) {
               throw var165.getTargetException();
            }

            Object var73 = 498692346592337143L;
            Ref.g(498692346592337143L, var73);
            Object[] var227 = Registry.emptyArgs();
            long var76 = 368701050591933944L;
            Object[] var75 = var227;
            Ref.h(368701050591933944L, var75, var76);

            try {
               ;
            } catch (InvocationTargetException var164) {
               throw var164.getTargetException();
            }

            if (var1 == null) {
               return;
            }
         }

         var10001 = this;
         Object var77 = 395703699466617837L;
         ((F8)Ref.g(395703699466617837L, var77)).getClass().equals(CT.class);
      }

      if (var1 == null) {
         if (var10001 == null) {
            Object var79 = 308804367364433353L;
            Ref.g(308804367364433353L, var79);
            ConnectionProperty var190 = (ConnectionProperty)(Registry.emptyArgs());
            long var82 = 398891882190620836L;
            Object[] var81 = var190;
            var190 = Ref.h(398891882190620836L, var81, var82);

            try {
               var190 = (ConnectionProperty)var190;
            } catch (InvocationTargetException var163) {
               throw var163.getTargetException();
            }

            ConnectionProperty var179 = var190;
            Ty2 var183 = var179.M$Ty_2();
            if (var183 != null) {
               var179.a();
               Object[] var203 = Registry.emptyArgs();
               long var84 = 292557478156152530L;
               Object[] var83 = var203;
               Ref.h(292557478156152530L, var83, var84);

               try {
                  ;
               } catch (InvocationTargetException var162) {
                  throw var162.getTargetException();
               }

               Object var85 = 308804367364433353L;
               Object var213 = Ref.g(308804367364433353L, var85);
               String var216 = (String)(Registry.emptyArgs());
               long var88 = 134780214066966408L;
               Object[] var87 = var216;
               var216 = Ref.h(134780214066966408L, var87, var88);

               try {
                  var216 = (String)var216;
               } catch (InvocationTargetException var161) {
                  throw var161.getTargetException();
               }

               if (var213.equals(var216)) {
                  var216 = Registry.emptyArgs();
                  long var90 = 121632250293569146L;
                  Object[] var89 = var216;
                  Ref.h(121632250293569146L, var89, var90);

                  try {
                     ;
                  } catch (InvocationTargetException var160) {
                     throw var160.getTargetException();
                  }

                  Object var91 = 498692346592337143L;
                  Ref.g(498692346592337143L, var91);
                  Object var93 = 308804367364433353L;
                  Object var228 = Ref.g(308804367364433353L, var93);
                  Object[] var10012 = Registry.emptyArgs();
                  long var96 = 134780214066966408L;
                  Object[] var95 = var10012;
                  var228 = Registry.packArgs(var228, Ref.h(134780214066966408L, var95, var96));
                  long var98 = 604541551035870242L;
                  Object[] var97 = (Object[])var228;
                  Ref.h(604541551035870242L, var97, var98);

                  try {
                     ;
                  } catch (InvocationTargetException var159) {
                     throw var159.getTargetException();
                  }
               }
            }

            if (var1 == null) {
               return;
            }
         }

         var10001 = this;
         Object var99 = 395703699466617837L;
         ((F8)Ref.g(395703699466617837L, var99)).getClass().equals(Refresh.class);
      }

      if (var1 == null) {
         if (var10001 == null) {
            Object var101 = 395703699466617837L;
            Ref.g(395703699466617837L, var101);
            ConnectionProperty var193 = (ConnectionProperty)(Registry.emptyArgs());
            long var104 = 595556246051364370L;
            Object[] var103 = var193;
            var193 = Ref.h(595556246051364370L, var103, var104);

            try {
               var193 = (ConnectionProperty)var193;
            } catch (InvocationTargetException var158) {
               throw var158.getTargetException();
            }

            ConnectionProperty var180 = var193;
            Ty2 var184 = var180.M$Ty_2();
            if (var1 != null || var184 != null) {
               Object[] var204 = Registry.emptyArgs();
               long var106 = 121632250293569146L;
               Object[] var105 = var204;
               Ref.h(121632250293569146L, var105, var106);

               try {
                  ;
               } catch (InvocationTargetException var157) {
                  throw var157.getTargetException();
               }

               Object var107 = 498692346592337143L;
               Ref.g(498692346592337143L, var107);
               Object var109 = 395703699466617837L;
               Object var224 = Ref.g(395703699466617837L, var109);
               Object[] var10009 = Registry.emptyArgs();
               long var112 = 134780214066966408L;
               Object[] var111 = var10009;
               var224 = Registry.packArgs(var224, Ref.h(134780214066966408L, var111, var112));
               long var114 = 604541551035870242L;
               Object[] var113 = (Object[])var224;
               Ref.h(604541551035870242L, var113, var114);

               try {
                  ;
               } catch (InvocationTargetException var156) {
                  throw var156.getTargetException();
               }
            }

            if (var1 == null) {
               return;
            }
         }

         var10001 = this;
         Object var115 = 395703699466617837L;
         ((F8)Ref.g(395703699466617837L, var115)).getClass().equals(CE.class);
      }

      label406: {
         if (var1 == null) {
            if (var10001 == null) {
               Object var117 = 456220523169412016L;
               Ref.g(456220523169412016L, var117);
               ConnectionProperty var196 = (ConnectionProperty)(Registry.emptyArgs());
               long var120 = 595556246051364370L;
               Object[] var119 = var196;
               var196 = Ref.h(595556246051364370L, var119, var120);

               try {
                  var196 = (ConnectionProperty)var196;
               } catch (InvocationTargetException var155) {
                  throw var155.getTargetException();
               }

               ConnectionProperty var181 = var196;
               Ty2 var185 = var181.M$Ty_2();
               if (var185 != null) {
                  var181.a();
                  Object[] var205 = Registry.emptyArgs();
                  long var122 = 292557478156152530L;
                  Object[] var121 = var205;
                  Ref.h(292557478156152530L, var121, var122);

                  try {
                     ;
                  } catch (InvocationTargetException var154) {
                     throw var154.getTargetException();
                  }

                  Object var123 = 456220523169412016L;
                  Object var214 = Ref.g(456220523169412016L, var123);
                  String var220 = (String)(Registry.emptyArgs());
                  long var126 = 504379882782984288L;
                  Object[] var125 = var220;
                  var220 = Ref.h(504379882782984288L, var125, var126);

                  try {
                     var220 = (String)var220;
                  } catch (InvocationTargetException var153) {
                     throw var153.getTargetException();
                  }

                  if (var214.equals(var220)) {
                     var220 = Registry.emptyArgs();
                     long var128 = 121632250293569146L;
                     Object[] var127 = var220;
                     Ref.h(121632250293569146L, var127, var128);

                     try {
                        ;
                     } catch (InvocationTargetException var152) {
                        throw var152.getTargetException();
                     }

                     Object var129 = 498692346592337143L;
                     Ref.g(498692346592337143L, var129);
                     Object var131 = 456220523169412016L;
                     Object var230 = Ref.g(456220523169412016L, var131);
                     Object[] var232 = Registry.emptyArgs();
                     long var134 = 504379882782984288L;
                     Object[] var133 = var232;
                     var230 = Registry.packArgs(var230, Ref.h(504379882782984288L, var133, var134));
                     long var136 = 604541551035870242L;
                     Object[] var135 = (Object[])var230;
                     Ref.h(604541551035870242L, var135, var136);

                     try {
                        ;
                     } catch (InvocationTargetException var151) {
                        throw var151.getTargetException();
                     }
                  }
               }

               if (var1 == null) {
                  return;
               }
            }

            var10001 = this;
            if (var1 != null) {
               break label406;
            }

            Object var137 = 395703699466617837L;
            ((F8)Ref.g(395703699466617837L, var137)).getClass().equals(CL.class);
         }

         if (var10001 == null) {
            return;
         }

         Object var139 = 498692346592337143L;
         Ref.g(498692346592337143L, var139);
         Object var141 = 305081152315023558L;
         Object[] var206 = Registry.packArgs(Ref.g(305081152315023558L, var141), null);
         long var144 = 604541551035870242L;
         Object[] var143 = var206;
         Ref.h(604541551035870242L, var143, var144);

         try {
            ;
         } catch (InvocationTargetException var150) {
            throw var150.getTargetException();
         }
      }

      Object var145 = 498692346592337143L;
      Ref.g(498692346592337143L, var145);
      Object[] var215 = Registry.emptyArgs();
      long var148 = 594178333358473808L;
      Object[] var147 = var215;
      Ref.h(594178333358473808L, var147, var148);

      try {
         ;
      } catch (InvocationTargetException var149) {
         throw var149.getTargetException();
      }
   }

   public JSplitPane l(JFrame var1) {
      AE var10001 = new AE(0);
      long var12 = 132798821314429637L;
      AE var11 = var10001;
      Ref.s(132798821314429637L, var11, var12);
      Object var13 = 132798821314429637L;
      ((AE)Ref.g(132798821314429637L, var13)).setBorder(null);
      F8.y();
      Object var15 = 132798821314429637L;
      ((AE)Ref.g(132798821314429637L, var15)).setResizeWeight((double)Registry.lookupField(624618836428943420L).getFloat(this));
      Object var17 = 132798821314429637L;
      ((AE)Ref.g(132798821314429637L, var17)).setOpaque(false);
      Object var19 = 132798821314429637L;
      ((AE)Ref.g(132798821314429637L, var19)).setDividerSize(0);
      SwingUtilities.invokeLater(new Ux2(this));
      JPanel var10006 = new JPanel();
      long var22 = 471498955248174934L;
      JPanel var21 = var10006;
      Ref.s(471498955248174934L, var21, var22);
      Object var23 = 471498955248174934L;
      ((JPanel)Ref.g(471498955248174934L, var23)).setBorder(null);
      Object var25 = 471498955248174934L;
      ((JPanel)Ref.g(471498955248174934L, var25)).setOpaque(false);
      Object var27 = 471498955248174934L;
      ((JPanel)Ref.g(471498955248174934L, var27)).setLayout(new MigLayout(a(1447, 12869), a(1427, 32364), a(1462, 111)));
      AM var10010 = new AM(true);
      long var30 = 493158471773442262L;
      AM var29 = var10010;
      Ref.s(493158471773442262L, var29, var30);
      Object var31 = 493158471773442262L;
      Ref.g(493158471773442262L, var31);
      Object[] var10012 = Registry.packArgs(true);
      long var34 = 231073666784554004L;
      Object[] var33 = var10012;
      Ref.h(231073666784554004L, var33, var34);

      try {
         ;
      } catch (InvocationTargetException var196) {
         throw var196.getTargetException();
      }

      Object var35 = 493158471773442262L;
      Ref.g(493158471773442262L, var35);
      Object[] var10014 = Registry.packArgs(true);
      long var38 = 477598938102420541L;
      Object[] var37 = var10014;
      Ref.h(477598938102420541L, var37, var38);

      try {
         ;
      } catch (InvocationTargetException var195) {
         throw var195.getTargetException();
      }

      Object var39 = 493158471773442262L;
      Ref.g(493158471773442262L, var39);
      Object[] var10016 = Registry.packArgs(true);
      long var42 = 388534896479408285L;
      Object[] var41 = var10016;
      Ref.h(388534896479408285L, var41, var42);

      try {
         ;
      } catch (InvocationTargetException var194) {
         throw var194.getTargetException();
      }

      Object var43 = 493158471773442262L;
      Ref.g(493158471773442262L, var43);
      Object[] var10018 = Registry.packArgs(this);
      long var46 = 423609045109176509L;
      Object[] var45 = var10018;
      Ref.h(423609045109176509L, var45, var46);

      try {
         ;
      } catch (InvocationTargetException var193) {
         throw var193.getTargetException();
      }

      JPanel var10019 = new JPanel();
      long var48 = 215568540160986138L;
      JPanel var47 = var10019;
      Ref.s(215568540160986138L, var47, var48);
      Object var49 = 215568540160986138L;
      ((JPanel)Ref.g(215568540160986138L, var49)).setLayout(new MigLayout(a(1461, 1168), a(1431, -11908), a(1416, -15011)));
      Object var51 = 215568540160986138L;
      ((JPanel)Ref.g(215568540160986138L, var51)).setOpaque(false);
      Registry.packArgs("\uf115");
      long var53 = 378399160856121064L;
      Object var10023 = Ref.h2(378399160856121064L, var53);
      long var56 = 488270198363831547L;
      Object var55 = var10023;
      Ref.s(488270198363831547L, var55, var56);
      Color var3 = new Color(a(4340, 4217835602806884368L), a(19666, 3820787202038273077L), a(1718, 1428167295437659728L));
      Object var57 = 488270198363831547L;
      ((com.finalshell.core.C)Ref.g(488270198363831547L, var57)).setForeground(var3);
      Color var4 = new Color(a(28163, 5913372509456938732L), a(17215, 5362272149277547463L), a(26933, 7737798623767048654L));
      Object var59 = 488270198363831547L;
      Ref.g(488270198363831547L, var59);
      Object var61 = 460802416977433453L;
      Object[] var10027 = Registry.packArgs(Ref.g(460802416977433453L, var61));
      long var64 = 213570708619288257L;
      Object[] var63 = var10027;
      Ref.h(213570708619288257L, var63, var64);

      try {
         ;
      } catch (InvocationTargetException var192) {
         throw var192.getTargetException();
      }

      Object var65 = 488270198363831547L;
      ((com.finalshell.core.C)Ref.g(488270198363831547L, var65)).setFont((Font)Registry.lookupField(466738480260186535L).get(null));
      Object var67 = 488270198363831547L;
      ((com.finalshell.core.C)Ref.g(488270198363831547L, var67)).setBorder(BorderFactory.createEmptyBorder(3, 0, 2, 1));
      Object var69 = 488270198363831547L;
      ((com.finalshell.core.C)Ref.g(488270198363831547L, var69)).addMouseListener(new FW(this, var4, var3));
      Object var71 = 488270198363831547L;
      ((com.finalshell.core.C)Ref.g(488270198363831547L, var71)).setFocusable(false);
      Object var73 = 488270198363831547L;
      ((com.finalshell.core.C)Ref.g(488270198363831547L, var73)).addActionListener(new LT(this));
      Object var75 = 488270198363831547L;
      ((com.finalshell.core.C)Ref.g(488270198363831547L, var75)).addActionListener(new LV(this));
      Object var77 = 215568540160986138L;
      JPanel var10034 = (JPanel)Ref.g(215568540160986138L, var77);
      Object var79 = 488270198363831547L;
      this.add((com.finalshell.core.C)Ref.g(488270198363831547L, var79));
      Object var81 = 493158471773442262L;
      Ref.g(493158471773442262L, var81);
      Object var83 = 215568540160986138L;
      Object[] var10038 = Registry.packArgs(Ref.g(215568540160986138L, var83));
      long var86 = 298780248823275057L;
      Object[] var85 = var10038;
      Ref.h(298780248823275057L, var85, var86);

      try {
         ;
      } catch (InvocationTargetException var191) {
         throw var191.getTargetException();
      }

      Registry.packArgs("\uf009");
      long var87 = 378399160856121064L;
      Object var10040 = Ref.h2(378399160856121064L, var87);
      long var90 = 406404529706956411L;
      Object var89 = var10040;
      Ref.s(406404529706956411L, var89, var90);
      Object var91 = 406404529706956411L;
      ((com.finalshell.core.C)Ref.g(406404529706956411L, var91)).setFont((Font)Registry.lookupField(586943296376675339L).get(null));
      Object var93 = 406404529706956411L;
      com.finalshell.core.C var10042 = (com.finalshell.core.C)Ref.g(406404529706956411L, var93);
      Object var95 = 360309369918999825L;
      this.setForeground((Color)Ref.g(360309369918999825L, var95));
      Object var97 = 406404529706956411L;
      ((com.finalshell.core.C)Ref.g(406404529706956411L, var97)).setBackground((Color)Registry.lookupField(470254319214767552L).get(null));
      Object var99 = 406404529706956411L;
      ((com.finalshell.core.C)Ref.g(406404529706956411L, var99)).setBorder(BorderFactory.createEmptyBorder(a(24772, 9259802474854433L), 0, 0, 2));
      Object var101 = 406404529706956411L;
      Ref.g(406404529706956411L, var101);
      Object var103 = 460802416977433453L;
      Object[] var10048 = Registry.packArgs(Ref.g(460802416977433453L, var103));
      long var106 = 213570708619288257L;
      Object[] var105 = var10048;
      Ref.h(213570708619288257L, var105, var106);

      try {
         ;
      } catch (InvocationTargetException var190) {
         throw var190.getTargetException();
      }

      Object var107 = 406404529706956411L;
      ((com.finalshell.core.C)Ref.g(406404529706956411L, var107)).addActionListener(new BK3(this));
      Object[] var10051 = Registry.emptyArgs();
      long var110 = 440819565065186185L;
      Object[] var109 = var10051;
      var10051 = Ref.h(440819565065186185L, var109, var110);
      long var112 = 337860688004803931L;
      Object var111 = var10051;
      Ref.s(337860688004803931L, var111, var112);
      Registry.packArgs("\uf0c9");
      long var113 = 378399160856121064L;
      Object var10052 = Ref.h2(378399160856121064L, var113);

      try {
         var10052 = (com.finalshell.core.C)var10052;
      } catch (InvocationTargetException var189) {
         throw var189.getTargetException();
      }

      com.finalshell.core.C var5 = (com.finalshell.core.C)var10052;
      Object var115 = 460802416977433453L;
      Object[] var10054 = Registry.packArgs(Ref.g(460802416977433453L, var115));
      long var118 = 213570708619288257L;
      Object[] var117 = var10054;
      Ref.h(213570708619288257L, var117, var118);

      try {
         ;
      } catch (InvocationTargetException var188) {
         throw var188.getTargetException();
      }

      var5.setBackground((Color)Registry.lookupField(470254319214767552L).get(null));
      var5.setBorder(BorderFactory.createEmptyBorder(5, 3, 0, 4));
      var5.setFont((Font)Registry.lookupField(568130515263631326L).get(null));
      var5.setForeground(new Color(a(17215, 5362272149277547463L), a(17215, 5362272149277547463L), a(17215, 5362272149277547463L)));
      Y12_2 var10055;
      Object var119 = 337860688004803931L;
var5 = new RenderingHints(this, (JPopupMenu)Ref.g(337860688004803931L, var119));
      Y12_2 var6 = var10055;
      var5.addMouseListener(new Y4(this, var6, var5));
      Registry.emptyArgs();
      long var121 = 270389152141252877L;
      Ref.h2(270389152141252877L, var121);
      U62 var10057 = (U62)(Registry.emptyArgs());
      long var124 = 306266403902896148L;
      Object[] var123 = var10057;
      var10057 = Ref.h(306266403902896148L, var123, var124);

      try {
         var10057 = (U62)var10057;
      } catch (InvocationTargetException var187) {
         throw var187.getTargetException();
      }

      U62 var7 = var10057;
      X var10058 = new X(this, new MigLayout(a(1458, 27250), a(1416, -15011), a(1464, 21281)), var7);
      long var126 = 438466734956564607L;
      X var125 = var10058;
      Ref.s(438466734956564607L, var125, var126);
      Object var127 = 438466734956564607L;
      ((JPanel)Ref.g(438466734956564607L, var127)).setOpaque(false);
      Object var129 = 438466734956564607L;
      JPanel var10060 = (JPanel)Ref.g(438466734956564607L, var129);
      Object var131 = 493158471773442262L;
      this.add((AM)Ref.g(493158471773442262L, var131), a(1422, 12118));
      Object var133 = 438466734956564607L;
      JPanel var10062 = (JPanel)Ref.g(438466734956564607L, var133);
      Object var135 = 406404529706956411L;
      this.add((com.finalshell.core.C)Ref.g(406404529706956411L, var135));
      Object var137 = 438466734956564607L;
      ((JPanel)Ref.g(438466734956564607L, var137)).add(var5);
      Object var139 = 438466734956564607L;
      ((JPanel)Ref.g(438466734956564607L, var139)).setOpaque(true);
      Object var141 = 438466734956564607L;
      JPanel var10066 = (JPanel)Ref.g(438466734956564607L, var141);
      Object var143 = 493158471773442262L;
      this.setBackground(((AM)Ref.g(493158471773442262L, var143)).getBackground());
      MatteBorder var8 = BorderFactory.createMatteBorder(2, 0, 0, 0, (Color)Registry.lookupField(470254319214767552L).get(null));
      MatteBorder var9 = BorderFactory.createMatteBorder(0, 0, 2, 0, (Color)Registry.lookupField(575518801661014217L).get(null));
      CompoundBorder var10 = BorderFactory.createCompoundBorder(var8, var9);
      Object var145 = 438466734956564607L;
      ((JPanel)Ref.g(438466734956564607L, var145)).setBorder(var10);
      Object var147 = 471498955248174934L;
      JPanel var10069 = (JPanel)Ref.g(471498955248174934L, var147);
      Object var149 = 438466734956564607L;
      this.add((JPanel)Ref.g(438466734956564607L, var149), a(1441, 23162));
      Object var151 = 493158471773442262L;
      Ref.g(493158471773442262L, var151);
      Object[] var10073 = Registry.emptyArgs();
      long var154 = 435326248614032175L;
      Object[] var153 = var10073;
      var10073 = Ref.h(435326248614032175L, var153, var154);
      long var156 = 357928268534803218L;
      Object var155 = var10073;
      Ref.s(357928268534803218L, var155, var156);
      Object[] var10074 = Registry.packArgs(false);
      long var158 = 394729994862123299L;
      Object[] var157 = var10074;
      Ref.h(394729994862123299L, var157, var158);

      try {
         ;
      } catch (InvocationTargetException var186) {
         throw var186.getTargetException();
      }

      Object var159 = 471498955248174934L;
      JPanel var10075 = (JPanel)Ref.g(471498955248174934L, var159);
      Object var161 = 357928268534803218L;
      this.add((Ge2)Ref.g(357928268534803218L, var161), a(1414, -160));
      Object var163 = 493158471773442262L;
      Ref.g(493158471773442262L, var163);
      Object[] var10078 = Registry.packArgs(this);
      long var166 = 253827983161591241L;
      Object[] var165 = var10078;
      Ref.h(253827983161591241L, var165, var166);

      try {
         ;
      } catch (InvocationTargetException var185) {
         throw var185.getTargetException();
      }

      Object var167 = 132798821314429637L;
      AE var10079 = (AE)Ref.g(132798821314429637L, var167);
      Object var169 = 471498955248174934L;
      this.setTopComponent((JPanel)Ref.g(471498955248174934L, var169));
      UU var10081 = new UU();
      long var172 = 270752363788326463L;
      UU var171 = var10081;
      Ref.s(270752363788326463L, var171, var172);
      Object var173 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var173)).setMinimumSize(new Dimension(0, 0));
      Object var175 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var175)).setOpaque(false);
      Object var177 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var177)).setLayout(new MigLayout(a(1458, 27250)));
      Object var179 = 132798821314429637L;
      AE var10085 = (AE)Ref.g(132798821314429637L, var179);
      Object var181 = 270752363788326463L;
      this.setBottomComponent((UU)Ref.g(270752363788326463L, var181));
      Object var183 = 132798821314429637L;
      AE var10087 = (AE)Ref.g(132798821314429637L, var183);
      if (Ky4.F$arrString() != null) {
         F8.D(new String[5]);
      }

      return var10087;
   }

   public void w(boolean var1) {
      label18: {
         String[] var2 = F8.y();
         if (var1) {
            Object var3 = 406404529706956411L;
            com.finalshell.core.C var10001 = (com.finalshell.core.C)Ref.g(406404529706956411L, var3);
            if (var2 != null) {
               break label18;
            }

            if (var10001 != null) {
               Object var5 = 406404529706956411L;
               com.finalshell.core.C var10002 = (com.finalshell.core.C)Ref.g(406404529706956411L, var5);
               Object var7 = 173925038705818380L;
               this.setForeground((Color)Ref.g(173925038705818380L, var7));
               if (var2 == null) {
                  return;
               }
            }
         }

         Object var9 = 406404529706956411L;
         com.finalshell.core.C var13 = (com.finalshell.core.C)Ref.g(406404529706956411L, var9);
      }

      Object var11 = 360309369918999825L;
      this.setForeground((Color)Ref.g(360309369918999825L, var11));
   }

   public void b() {
      Object var3 = 406404529706956411L;
      Point var1 = ((com.finalshell.core.C)Ref.g(406404529706956411L, var3)).getLocationOnScreen();
      int var10001 = var1.x - ((C5)Registry.lookupField(222367947831078517L).get(null)).getWidth();
      Object var5 = 406404529706956411L;
      int var2 = this + ((com.finalshell.core.C)Ref.g(406404529706956411L, var5)).getWidth();
      C5 var10002 = (C5)Registry.lookupField(222367947831078517L).get(null);
      Object var7 = 406404529706956411L;
      var2.setLocation(var1.y, this + ((com.finalshell.core.C)Ref.g(406404529706956411L, var7)).getHeight() + 2);
      ((C5)Registry.lookupField(222367947831078517L).get(null)).setVisible(true);
   }

   @Override
   public synchronized void P(Y9 var1) {
      T32 var10001 = (T32)(Registry.emptyArgs());
      long var8 = 625676037677438329L;
      Object[] var7 = var10001;
      var10001 = Ref.h(625676037677438329L, var7, var8);

      try {
         var10001 = (T32)var10001;
      } catch (InvocationTargetException var62) {
         throw var62.getTargetException();
      }

      T32 var3 = var10001;
      F8.y();
      F8 var10003 = (F8)(Registry.emptyArgs());
      long var10 = 424156930953488367L;
      Object[] var9 = var10003;
      var10003 = Ref.h(424156930953488367L, var9, var10);

      try {
         var10003 = (F8)var10003;
      } catch (InvocationTargetException var61) {
         throw var61.getTargetException();
      }

      F8 var4 = var10003;
      F8 var5 = var4;
      var10003 = Registry.emptyArgs();
      long var12 = 584415777428790164L;
      Object[] var11 = var10003;
      var10003 = Ref.h(584415777428790164L, var11, var12);

      try {
         var10003 = (Boolean)var10003;
      } catch (InvocationTargetException var60) {
         throw var60.getTargetException();
      }

      if (var3 == null) {
         if (var10003 == null) {
            Object[] var10004 = Registry.emptyArgs();
            long var14 = 406843505159214218L;
            Object[] var13 = var10004;
            Ref.h(406843505159214218L, var13, var14);

            try {
               ;
            } catch (InvocationTargetException var59) {
               throw var59.getTargetException();
            }
         }

         var10003 = var4.getClass().equals(ConnectionProperty.class);
      }

      label166: {
         label167: {
            if (var3 == null) {
               if (var10003 == null) {
                  ConnectionProperty var6 = (ConnectionProperty)var4;
                  if (var6 != null) {
                     Object[] var73 = Registry.emptyArgs();
                     long var16 = 584415777428790164L;
                     Object[] var15 = var73;
                     var73 = Ref.h(584415777428790164L, var15, var16);

                     try {
                        var75 = (Boolean)var73;
                     } catch (InvocationTargetException var58) {
                        throw var58.getTargetException();
                     }

                     if (!var75) {
                        var6.q$void();
                     }
                  }

                  if (var3 == null) {
                     break label167;
                  }
               }

               var10003 = var4.getClass().equals(CE.class);
            }

            if (var3 != null) {
               break label166;
            }

            if (var10003 == null) {
               CE var63 = (CE)var4;
               var10003 = var1;
               Object[] var76 = Registry.emptyArgs();
               long var18 = 584415777428790164L;
               Object[] var17 = var76;
               var76 = Ref.h(584415777428790164L, var17, var18);

               try {
                  var78 = (Boolean)var76;
               } catch (InvocationTargetException var57) {
                  throw var57.getTargetException();
               }

               if (var3 != null) {
                  break label166;
               }

               if (!var78) {
                  Object[] var10005 = Registry.emptyArgs();
                  long var20 = 182326773334454719L;
                  Object[] var19 = var10005;
                  Ref.h(182326773334454719L, var19, var20);
                  Object[] var10006 = Registry.emptyArgs();
                  long var22 = 559196035657690421L;
                  Object[] var21 = var10006;
                  Ref.h(559196035657690421L, var21, var22);
                  Object[] var10007 = Registry.packArgs(false);
                  long var24 = 307806728445309055L;
                  Object[] var23 = var10007;
                  Ref.h(307806728445309055L, var23, var24);

                  try {
                     ;
                  } catch (InvocationTargetException var56) {
                     throw var56.getTargetException();
                  }
               }
            }
         }

         var10003 = this;
         Object var25 = 493158471773442262L;
         Ref.g(493158471773442262L, var25);
         ArrayList var81 = Registry.emptyArgs();
         long var28 = 230171768324088030L;
         Object[] var27 = var81;
         var81 = Ref.h(230171768324088030L, var27, var28);

         try {
            var81 = (ArrayList)var81;
         } catch (InvocationTargetException var55) {
            throw var55.getTargetException();
         }

         var81.size();
      }

      Object var64 = var10003;
      var10003 = (Object[])var64;
      if (var3 == null) {
         if (var64 == null) {
            long var30 = 208444474277099894L;
            Object var29 = null;
            Ref.s(208444474277099894L, var29, var30);
            long var32 = 130734847106351886L;
            Object var31 = null;
            Ref.s(130734847106351886L, var31, var32);
            long var34 = 395703699466617837L;
            Object var33 = null;
            Ref.s(395703699466617837L, var33, var34);
            long var36 = 308804367364433353L;
            Object var35 = null;
            Ref.s(308804367364433353L, var35, var36);
            long var38 = 456220523169412016L;
            Object var37 = null;
            Ref.s(456220523169412016L, var37, var38);
            Object var39 = 132798821314429637L;
            ((AE)Ref.g(132798821314429637L, var39)).setDividerSize(0);
            Object[] var10010 = Registry.emptyArgs();
            long var42 = 453547301262862026L;
            Object[] var41 = var10010;
            Ref.h(453547301262862026L, var41, var42);

            try {
               ;
            } catch (InvocationTargetException var54) {
               throw var54.getTargetException();
            }
         }

         var10003 = this;
         Object[] var79 = Registry.emptyArgs();
         long var44 = 603983761173484132L;
         Object[] var43 = var79;
         Ref.h(603983761173484132L, var43, var44);

         try {
            ;
         } catch (InvocationTargetException var53) {
            throw var53.getTargetException();
         }
      }

      if (var3 == null) {
         if (var10003 == null) {
            Object[] var80 = Registry.packArgs(false);
            long var46 = 394729994862123299L;
            Object[] var45 = var80;
            Ref.h(394729994862123299L, var45, var46);

            try {
               ;
            } catch (InvocationTargetException var52) {
               throw var52.getTargetException();
            }
         }

         var10003 = (Object[])var64;
      }

      if (var3 == null) {
         if (var10003 == null) {
            return;
         }

         var10003 = this;
         Object var47 = 493158471773442262L;
         Ref.g(493158471773442262L, var47);
         Object[] var84 = Registry.emptyArgs();
         long var50 = 505761988954123678L;
         Object[] var49 = var84;
         var84 = Ref.h(505761988954123678L, var49, var50);

         try {
         } catch (InvocationTargetException var51) {
            throw var51.getTargetException();
         }
      }

      if (var10003 == null) {
         SwingUtilities.invokeLater(new No2_2(this));
      }
   }

   public void G(boolean var1) {
      if (!var1) {
         Object var2 = 357928268534803218L;
         ((Ge2)Ref.g(357928268534803218L, var2)).setBorder(null);
      }
   }

   public void h(F8 var1) {
      F8.y();
      Registry.emptyArgs();
      long var8 = 270389152141252877L;
      Object var10002 = Ref.h2(270389152141252877L, var8);
      Object[] var10003 = Registry.emptyArgs();
      long var11 = 306266403902896148L;
      Object[] var10 = var10003;
      Ref.h(306266403902896148L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      Object var2 = var10002;
      var10003 = Registry.emptyArgs();
      long var13 = 192524377405831538L;
      Object[] var12 = var10003;
      var10003 = Ref.h(192524377405831538L, var12, var13);

      try {
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      boolean var5 = false;
      Object[] var10004 = Registry.emptyArgs();
      long var15 = 483219322811206313L;
      Object[] var14 = var10004;
      Ref.h(483219322811206313L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      if (var2 == null) {
         Object[] var10005 = Registry.emptyArgs();
         long var17 = 571514335693873067L;
         Object[] var16 = var10005;
         var10005 = Ref.h(571514335693873067L, var16, var17);

         try {
            var41 = (Boolean)var10005;
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }

         if (var41) {
            Object var18 = 132798821314429637L;
            ((AE)Ref.g(132798821314429637L, var18)).setDividerSize(Registry.lookupField(515873310631527540L).getInt(this));
            Integer var10007 = (Integer)(Registry.emptyArgs());
            long var21 = 529990610495795289L;
            Object[] var20 = var10007;
            var10007 = Ref.h(529990610495795289L, var20, var21);

            try {
               var10007 = (Integer)var10007;
            } catch (InvocationTargetException var32) {
               throw var32.getTargetException();
            }

            Object var37 = var10007;
            U var44 = (U)var37;
            int var10008 = a(6637, 1130080905756295431L);
            if (var2 == null) {
               if (var37 < var10008) {
                  var37 = a(6637, 1130080905756295431L);
               }

               var44 = this;
               Object var22 = 132798821314429637L;
               var10008 = ((AE)Ref.g(132798821314429637L, var22)).getHeight() - var37;
               Registry.lookupField(515873310631527540L).getInt(this);
            }

            int var7 = var44 - var10008;
            Object var24 = 132798821314429637L;
            ((AE)Ref.g(132798821314429637L, var24)).setDividerLocation(var7);
            if (var2 == null) {
               return;
            }
         }

         Object var26 = 132798821314429637L;
         AE var10006 = (AE)Ref.g(132798821314429637L, var26);
         Object var28 = 132798821314429637L;
         this.setDividerLocation(((AE)Ref.g(132798821314429637L, var28)).getHeight());
      }

      Object var30 = 132798821314429637L;
      ((AE)Ref.g(132798821314429637L, var30)).setDividerSize(0);
   }

   @Override
   public void v(Y9 var1) {
      Object[] var10001 = Registry.packArgs(var1);
      long var3 = 202570099267635142L;
      Object[] var2 = var10001;
      Ref.h(202570099267635142L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void V(Y9 var1) {
      String[] var2 = F8.y();
      if (var2 == null) {
         Object var8 = 498692346592337143L;
         if ((NetworkMonitorPanel)Ref.g(498692346592337143L, var8) == null) {
            return;
         }
      }

      Registry.lookupField(130882364772064219L).setLong(this, System.currentTimeMillis());
      Object[] var10001 = Registry.emptyArgs();
      long var11 = 625676037677438329L;
      Object[] var10 = var10001;
      Ref.h(625676037677438329L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var174) {
         throw var174.getTargetException();
      }

      Object[] var10003 = Registry.emptyArgs();
      long var13 = 424156930953488367L;
      Object[] var12 = var10003;
      var10003 = Ref.h(424156930953488367L, var12, var13);
      long var15 = 395703699466617837L;
      Object var14 = var10003;
      Ref.s(395703699466617837L, var14, var15);
      Object var4 = null;
      Object var16 = 395703699466617837L;
      Ref.g(395703699466617837L, var16);
      Object[] var10005 = Registry.emptyArgs();
      long var19 = 483219322811206313L;
      Object[] var18 = var10005;
      Ref.h(483219322811206313L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var173) {
         throw var173.getTargetException();
      }

      Object[] var10006 = Registry.emptyArgs();
      long var21 = 529990610495795289L;
      Object[] var20 = var10006;
      var10006 = Ref.h(529990610495795289L, var20, var21);

      try {
         var180 = (Integer)var10006;
      } catch (InvocationTargetException var172) {
         throw var172.getTargetException();
      }

      label308: {
         label309: {
            int var6 = var180;
            Object var22 = 395703699466617837L;
            U var10007 = ((F8)Ref.g(395703699466617837L, var22)).getClass().equals(ConnectionProperty.class);
            if (var2 == null) {
               if (var10007 == null) {
                  Object var24 = 498692346592337143L;
                  Ref.g(498692346592337143L, var24);
                  Object[] var181 = Registry.emptyArgs();
                  long var27 = 240475708906671602L;
                  Object[] var26 = var181;
                  Ref.h(240475708906671602L, var26, var27);

                  try {
                     ;
                  } catch (InvocationTargetException var171) {
                     throw var171.getTargetException();
                  }

                  if (var2 == null) {
                     Object var28 = 493158471773442262L;
                     Ref.g(493158471773442262L, var28);
                     ArrayList var185 = (ArrayList)(Registry.emptyArgs());
                     long var31 = 230171768324088030L;
                     Object[] var30 = var185;
                     var185 = Ref.h(230171768324088030L, var30, var31);

                     try {
                        var185 = (ArrayList)var185;
                     } catch (InvocationTargetException var170) {
                        throw var170.getTargetException();
                     }

                     if (var185.size() > 0) {
                        Object var32 = 395703699466617837L;
                        ConnectionProperty var191 = (ConnectionProperty)Ref.g(395703699466617837L, var32);
                        long var35 = 208444474277099894L;
                        ConnectionProperty var34 = var191;
                        Ref.s(208444474277099894L, var34, var35);
                     }
                  }

                  Object var36 = 208444474277099894L;
                  Object var183 = (ConnectionProperty)Ref.g(208444474277099894L, var36);
                  if (var2 == null) {
                     if (var183 == null) {
                        break label309;
                     }

                     var183 = this;
                     Object var38 = 208444474277099894L;
                     ConnectionProperty var188 = (ConnectionProperty)Ref.g(208444474277099894L, var38);
                  }

                  ((ConnectionProperty)var183).W(this);
                  if (var2 == null && this.isFocused()) {
                     Object var40 = 208444474277099894L;
                     ((ConnectionProperty)Ref.g(208444474277099894L, var40)).O$pA_3().requestFocus();
                  }

                  Object var42 = 208444474277099894L;
                  var4 = ((ConnectionProperty)Ref.g(208444474277099894L, var42)).q$s();
                  Object[] var189 = Registry.emptyArgs();
                  long var45 = 391523999621654604L;
                  Object[] var44 = var189;
                  Ref.h(391523999621654604L, var44, var45);

                  try {
                     ;
                  } catch (InvocationTargetException var169) {
                     throw var169.getTargetException();
                  }

                  if (var2 == null) {
                     Object var46 = 208444474277099894L;
                     if (!((ConnectionProperty)Ref.g(208444474277099894L, var46)).u()) {
                        if (var2 != null) {
                           break label308;
                        }

                        Object var48 = 132798821314429637L;
                        if (((AE)Ref.g(132798821314429637L, var48)).getBottomComponent() == null) {
                           break label309;
                        }

                        Object[] var194 = Registry.emptyArgs();
                        long var51 = 453547301262862026L;
                        Object[] var50 = var194;
                        Ref.h(453547301262862026L, var50, var51);

                        try {
                           ;
                        } catch (InvocationTargetException var168) {
                           throw var168.getTargetException();
                        }

                        if (var2 == null) {
                           break label309;
                        }
                     }
                  }

                  Object[] var192 = Registry.packArgs(var4);
                  long var53 = 247914494315670987L;
                  Object[] var52 = var192;
                  Ref.h(247914494315670987L, var52, var53);

                  try {
                     break label309;
                  } catch (InvocationTargetException var167) {
                     throw var167.getTargetException();
                  }
               }

               var10007 = this;
               Object var54 = 395703699466617837L;
               ((F8)Ref.g(395703699466617837L, var54)).getClass().equals(F5.class);
            }

            if (var2 == null) {
               if (var10007 == null) {
                  Object var56 = 132798821314429637L;
                  int var7 = ((AE)Ref.g(132798821314429637L, var56)).getHeight() - var6;
                  Object var58 = 132798821314429637L;
                  ((AE)Ref.g(132798821314429637L, var58)).setDividerLocation(var7);
                  Object var60 = 395703699466617837L;
                  F5 var10011 = (F5)Ref.g(395703699466617837L, var60);
                  long var63 = 130734847106351886L;
                  F5 var62 = var10011;
                  Ref.s(130734847106351886L, var62, var63);
                  Object var64 = 498692346592337143L;
                  Ref.g(498692346592337143L, var64);
                  Object[] var10013 = Registry.emptyArgs();
                  long var67 = 368701050591933944L;
                  Object[] var66 = var10013;
                  Ref.h(368701050591933944L, var66, var67);

                  try {
                     ;
                  } catch (InvocationTargetException var166) {
                     throw var166.getTargetException();
                  }

                  long var69 = 208444474277099894L;
                  Object var68 = null;
                  Ref.s(208444474277099894L, var68, var69);
                  Object[] var10015 = Registry.emptyArgs();
                  long var71 = 453547301262862026L;
                  Object[] var70 = var10015;
                  Ref.h(453547301262862026L, var70, var71);

                  try {
                     ;
                  } catch (InvocationTargetException var165) {
                     throw var165.getTargetException();
                  }

                  Object var72 = 130734847106351886L;
                  Ref.g(130734847106351886L, var72);
                  Object[] var10018 = Registry.emptyArgs();
                  long var75 = 629411790963347134L;
                  Object[] var74 = var10018;
                  var10018 = Registry.packArgs(Ref.h(629411790963347134L, var74, var75));
                  long var77 = 325968899029982303L;
                  Object[] var76 = var10018;
                  Ref.h(325968899029982303L, var76, var77);

                  try {
                     ;
                  } catch (InvocationTargetException var164) {
                     throw var164.getTargetException();
                  }

                  if (var2 == null) {
                     break label309;
                  }
               }

               var10007 = this;
               Object var78 = 395703699466617837L;
               ((F8)Ref.g(395703699466617837L, var78)).getClass().equals(CL.class);
            }

            if (var2 == null) {
               if (var10007 == null) {
                  long var81 = 208444474277099894L;
                  Object var80 = null;
                  Ref.s(208444474277099894L, var80, var81);
                  Object[] var10009 = Registry.emptyArgs();
                  long var83 = 453547301262862026L;
                  Object[] var82 = var10009;
                  Ref.h(453547301262862026L, var82, var83);

                  try {
                     ;
                  } catch (InvocationTargetException var163) {
                     throw var163.getTargetException();
                  }

                  Object var84 = 132798821314429637L;
                  AE var10010 = (AE)Ref.g(132798821314429637L, var84);
                  Object var86 = 132798821314429637L;
                  this.setDividerLocation(((AE)Ref.g(132798821314429637L, var86)).getHeight());
                  Object var88 = 132798821314429637L;
                  ((AE)Ref.g(132798821314429637L, var88)).setDividerSize(0);
                  if (var2 == null) {
                     break label309;
                  }
               }

               var10007 = this;
               Object var90 = 395703699466617837L;
               ((F8)Ref.g(395703699466617837L, var90)).getClass().equals(CT.class);
            }

            if (var2 == null) {
               if (var10007 == null) {
                  Object var92 = 132798821314429637L;
                  int var176 = ((AE)Ref.g(132798821314429637L, var92)).getHeight() - var6;
                  Object var94 = 132798821314429637L;
                  ((AE)Ref.g(132798821314429637L, var94)).setDividerLocation(var176);
                  Object var96 = 395703699466617837L;
                  CT var184 = (CT)Ref.g(395703699466617837L, var96);
                  long var99 = 308804367364433353L;
                  CT var98 = var184;
                  Ref.s(308804367364433353L, var98, var99);
                  Object var100 = 498692346592337143L;
                  Ref.g(498692346592337143L, var100);
                  Object[] var190 = Registry.emptyArgs();
                  long var103 = 240475708906671602L;
                  Object[] var102 = var190;
                  Ref.h(240475708906671602L, var102, var103);

                  try {
                     ;
                  } catch (InvocationTargetException var162) {
                     throw var162.getTargetException();
                  }

                  long var105 = 208444474277099894L;
                  Object var104 = null;
                  Ref.s(208444474277099894L, var104, var105);
                  Object[] var193 = Registry.emptyArgs();
                  long var107 = 453547301262862026L;
                  Object[] var106 = var193;
                  Ref.h(453547301262862026L, var106, var107);

                  try {
                     ;
                  } catch (InvocationTargetException var161) {
                     throw var161.getTargetException();
                  }

                  Object var108 = 308804367364433353L;
                  Ref.g(308804367364433353L, var108);
                  Object[] var197 = Registry.emptyArgs();
                  long var111 = 612851846225679981L;
                  Object[] var110 = var197;
                  var197 = Registry.packArgs(Ref.h(612851846225679981L, var110, var111));
                  long var113 = 594005020580798553L;
                  Object[] var112 = var197;
                  Ref.h(594005020580798553L, var112, var113);

                  try {
                     ;
                  } catch (InvocationTargetException var160) {
                     throw var160.getTargetException();
                  }

                  if (var2 == null) {
                     break label309;
                  }
               }

               var10007 = this;
               Object var114 = 395703699466617837L;
               ((F8)Ref.g(395703699466617837L, var114)).getClass().equals(CE.class);
            }

            if (var2 == null) {
               if (var10007 == null) {
                  break label309;
               }

               var10007 = this;
               Object var116 = 132798821314429637L;
               int var10008 = ((AE)Ref.g(132798821314429637L, var116)).getHeight() - var6;
            }

            U var177 = var10007;
            Object var118 = 132798821314429637L;
            ((AE)Ref.g(132798821314429637L, var118)).setDividerLocation((int)var177);
            Object var120 = 395703699466617837L;
            CE var182 = (CE)Ref.g(395703699466617837L, var120);
            long var123 = 456220523169412016L;
            CE var122 = var182;
            Ref.s(456220523169412016L, var122, var123);
            Object var124 = 498692346592337143L;
            Ref.g(498692346592337143L, var124);
            Object[] var10012 = Registry.emptyArgs();
            long var127 = 240475708906671602L;
            Object[] var126 = var10012;
            Ref.h(240475708906671602L, var126, var127);

            try {
               ;
            } catch (InvocationTargetException var159) {
               throw var159.getTargetException();
            }

            long var129 = 208444474277099894L;
            Object var128 = null;
            Ref.s(208444474277099894L, var128, var129);
            Object[] var10014 = Registry.emptyArgs();
            long var131 = 453547301262862026L;
            Object[] var130 = var10014;
            Ref.h(453547301262862026L, var130, var131);

            try {
               ;
            } catch (InvocationTargetException var158) {
               throw var158.getTargetException();
            }

            Object var132 = 456220523169412016L;
            Ref.g(456220523169412016L, var132);
            Object[] var10017 = Registry.emptyArgs();
            long var135 = 129994171961210369L;
            Object[] var134 = var10017;
            var10017 = Registry.packArgs(Ref.h(129994171961210369L, var134, var135));
            long var137 = 526082081406094860L;
            Object[] var136 = var10017;
            Ref.h(526082081406094860L, var136, var137);

            try {
               ;
            } catch (InvocationTargetException var157) {
               throw var157.getTargetException();
            }
         }

         Object[] var199 = Registry.emptyArgs();
         long var139 = 526151509200330945L;
         Object[] var138 = var199;
         Ref.h(526151509200330945L, var138, var139);

         try {
            ;
         } catch (InvocationTargetException var156) {
            throw var156.getTargetException();
         }

         Object var140 = 395703699466617837L;
         Object[] var10020 = Registry.packArgs(Ref.g(395703699466617837L, var140));
         long var143 = 182560589671772498L;
         Object[] var142 = var10020;
         Ref.h(182560589671772498L, var142, var143);

         try {
            ;
         } catch (InvocationTargetException var155) {
            throw var155.getTargetException();
         }

         Object[] var10021 = Registry.emptyArgs();
         long var145 = 603983761173484132L;
         Object[] var144 = var10021;
         Ref.h(603983761173484132L, var144, var145);

         try {
            ;
         } catch (InvocationTargetException var154) {
            throw var154.getTargetException();
         }
      }

      if (var2 == null) {
         Object var146 = 493158471773442262L;
         Ref.g(493158471773442262L, var146);
         ArrayList var10023 = (ArrayList)(Registry.emptyArgs());
         long var149 = 230171768324088030L;
         Object[] var148 = var10023;
         var10023 = Ref.h(230171768324088030L, var148, var149);

         try {
            var10023 = (ArrayList)var10023;
         } catch (InvocationTargetException var153) {
            throw var153.getTargetException();
         }

         if (var10023.size() <= 0) {
            return;
         }
      }

      Object[] var10022 = Registry.packArgs(true);
      long var151 = 394729994862123299L;
      Object[] var150 = var10022;
      Ref.h(394729994862123299L, var150, var151);

      try {
         ;
      } catch (InvocationTargetException var152) {
         throw var152.getTargetException();
      }
   }

   public void w(YX3 var1) {
      Object var2 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var2)).removeAll();
      Object var4 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var4)).add(var1);
      Object var6 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var6)).validate();
   }

   public void t(DG3 var1) {
      Object var2 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var2)).removeAll();
      Object var4 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var4)).add(var1);
      Object var6 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var6)).validate();
   }

   public void L(FY3 var1) {
      Object var2 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var2)).removeAll();
      Object var4 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var4)).add(var1);
      Object var6 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var6)).validate();
   }

   public void L(FilePanel var1) {
      Object var2 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var2)).removeAll();
      Object var4 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var4)).add(var1);
      Object var6 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var6)).validate();
   }

   public void d$void() {
      Object var1 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var1)).removeAll();
      Object var3 = 270752363788326463L;
      ((UU)Ref.g(270752363788326463L, var3)).validate();
   }

   @Override
   public void U(Y9 var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var5 = 625676037677438329L;
      Object[] var4 = var10001;
      Ref.h(625676037677438329L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      F8 var10002 = (F8)(Registry.emptyArgs());
      long var7 = 424156930953488367L;
      Object[] var6 = var10002;
      var10002 = Ref.h(424156930953488367L, var6, var7);

      try {
         var10002 = (F8)var10002;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      F8 var3 = var10002;
      if (var3.getClass().equals(ConnectionProperty.class)) {
      }
   }

   public void l$void() {
      boolean var1 = false;
      Object var2 = null;
   }

   public CT Y(ConnectionProperty var1) {
      CT var10001;
      Ty2 var10002 = var1.M$Ty_2();
      Lv4_2 var10004 = var1.a();
      String var10005 = (String)(Registry.emptyArgs());
      long var5 = 292557478156152530L;
      Object[] var4 = var10005;
      var10005 = Ref.h(292557478156152530L, var4, var5);

      try {
         var10005 = (String)var10005;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      var10002 = new Color(false, (boolean)var10004, var10005);
      CT var2 = var10001;
      Object[] var21 = Registry.packArgs(var1);
      long var7 = 243450989687975156L;
      Object[] var6 = var21;
      Ref.h(243450989687975156L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      Object var8 = 493158471773442262L;
      Ref.g(493158471773442262L, var8);
      Object[] var22 = Registry.packArgs(var2, a(1412, -31274));
      long var11 = 401520261048533776L;
      Object[] var10 = var22;
      Object var23 = Ref.h(401520261048533776L, var10, var11);

      try {
         var23 = (T32)var23;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      T32 var3 = (T32)var23;
      var10005 = Registry.packArgs(var3);
      long var13 = 550700107560986297L;
      Object[] var12 = var10005;
      Ref.h(550700107560986297L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      Object[] var10006 = Registry.packArgs(var1.M$Ty_2());
      long var15 = 447231690756717844L;
      Object[] var14 = var10006;
      Ref.h(447231690756717844L, var14, var15);

      try {
         return var2;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }

   public Ch2 b(ConnectionProperty var1) {
      Ch2 var2 = new Ch2();
      Object[] var10001 = Registry.packArgs(var1);
      long var5 = 156331705465675838L;
      Object[] var4 = var10001;
      Ref.h(156331705465675838L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      Object var6 = 493158471773442262L;
      Ref.g(493158471773442262L, var6);
      T32 var10003 = (T32)(Registry.packArgs(var2, a(1412, -31274)));
      long var9 = 401520261048533776L;
      Object[] var8 = var10003;
      var10003 = Ref.h(401520261048533776L, var8, var9);

      try {
         var10003 = (T32)var10003;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      T32 var3 = var10003;
      Object[] var10004 = Registry.packArgs(var3);
      long var11 = 288871474692900386L;
      Object[] var10 = var10004;
      Ref.h(288871474692900386L, var10, var11);

      try {
         return var2;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }

   public Refresh s(ConnectionProperty var1) {
      Refresh var10001;
      Ty2 var10002 = var1.M$Ty_2();
      Lv4_2 var10003 = var1.a();
      String var10004 = (String)(Registry.emptyArgs());
      long var5 = 292557478156152530L;
      Object[] var4 = var10004;
      var10004 = Ref.h(292557478156152530L, var4, var5);

      try {
         var10004 = (String)var10004;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      var10002 = new Color(var10003, var10004);
      Refresh var2 = var10001;
      Object[] var21 = Registry.packArgs(var1);
      long var7 = 427189173729820890L;
      Object[] var6 = var21;
      Ref.h(427189173729820890L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      Object var8 = 493158471773442262L;
      Ref.g(493158471773442262L, var8);
      var10004 = Registry.packArgs(var2, a(1412, -31274));
      long var11 = 401520261048533776L;
      Object[] var10 = var10004;
      var10004 = Ref.h(401520261048533776L, var10, var11);

      try {
         var10004 = (T32)var10004;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      T32 var3 = var10004;
      Object[] var10005 = Registry.packArgs(var3);
      long var13 = 484746425044698500L;
      Object[] var12 = var10005;
      Ref.h(484746425044698500L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      Object[] var10006 = Registry.packArgs(var1.M$Ty_2());
      long var15 = 517712845725185310L;
      Object[] var14 = var10006;
      Ref.h(517712845725185310L, var14, var15);

      try {
         return var2;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }

   public CE q(String var1, ConnectionProperty var2) {
      CE var10001;
      Ty2 var10003 = var2.M$Ty_2();
      Lv4_2 var10005 = var2.a();
      String var10006 = (String)(Registry.emptyArgs());
      long var6 = 292557478156152530L;
      Object[] var5 = var10006;
      var10006 = Ref.h(292557478156152530L, var5, var6);

      try {
         var10006 = (String)var10006;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      var1 = new Object(var10003, true, (boolean)var10005, var10006);
      CE var3 = var10001;
      Object[] var10002 = Registry.packArgs(var2);
      long var8 = 386630747282164747L;
      Object[] var7 = var10002;
      Ref.h(386630747282164747L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      Object var9 = 493158471773442262L;
      Ref.g(493158471773442262L, var9);
      T32 var10004 = (T32)(Registry.packArgs(var3, a(1412, -31274)));
      long var12 = 401520261048533776L;
      Object[] var11 = var10004;
      var10004 = Ref.h(401520261048533776L, var11, var12);

      try {
         var10004 = (T32)var10004;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      T32 var4 = var10004;
      Object[] var24 = Registry.packArgs(var4);
      long var14 = 167247614137839733L;
      Object[] var13 = var24;
      Ref.h(167247614137839733L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      var10006 = Registry.packArgs(var2.M$Ty_2());
      long var16 = 161554410917791183L;
      Object[] var15 = var10006;
      Ref.h(161554410917791183L, var15, var16);

      try {
         return var3;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }
   }

   public F5 W(String var1, Lv4_2 var2) {
      F5 var3 = new F5(var1, var2);
      Object var5 = 493158471773442262L;
      Ref.g(493158471773442262L, var5);
      T32 var10002 = (T32)(Registry.packArgs(var3, a(1412, -31274)));
      long var8 = 401520261048533776L;
      Object[] var7 = var10002;
      var10002 = Ref.h(401520261048533776L, var7, var8);

      try {
         var10002 = (T32)var10002;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      T32 var4 = var10002;
      Object[] var10003 = Registry.packArgs(var4);
      long var10 = 289114460879885243L;
      Object[] var9 = var10003;
      Ref.h(289114460879885243L, var9, var10);

      try {
         return var3;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   public CL u$CL() {
      CL var1 = new CL();
      Object var3 = 493158471773442262L;
      Ref.g(493158471773442262L, var3);
      T32 var10002 = (T32)(Registry.packArgs(var1, a(1412, -31274), 0, false, true));
      long var6 = 451133235546109527L;
      Object[] var5 = var10002;
      var10002 = Ref.h(451133235546109527L, var5, var6);

      try {
         var10002 = (T32)var10002;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      T32 var2 = var10002;
      Object[] var10003 = Registry.packArgs(var2);
      long var8 = 318870397969942063L;
      Object[] var7 = var10003;
      Ref.h(318870397969942063L, var7, var8);

      try {
         return var1;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public ConnectionProperty Y(int var1) {
      ConnectionProperty var3 = new ConnectionProperty(new XF());
      var3.W(this);
      var3.Y(this);
      Color var10002;
      Object var7 = 290540599632617730L;
      Object var10004 = Ref.g(290540599632617730L, var7);
      XF3 var10005 = (XF3)(Registry.emptyArgs());
      long var10 = 605008073331144146L;
      Object[] var9 = var10005;
      var10005 = Ref.h(605008073331144146L, var9, var10);

      try {
         var10005 = (XF3)var10005;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

var10004 = new Random(var10005.p());
      var10002.setBackground(this);
      FilePanel var4 = new FilePanel(var3);
      String[] var27 = F8.y();
      var3.K(var4);
      String[] var2 = var27;
      Registry.emptyArgs();
      long var11 = 270389152141252877L;
      Ref.h2(270389152141252877L, var11);
      Object[] var28 = Registry.emptyArgs();
      long var14 = 306266403902896148L;
      Object[] var13 = var28;
      Ref.h(306266403902896148L, var13, var14);
      var10005 = Registry.emptyArgs();
      long var16 = 192524377405831538L;
      Object[] var15 = var10005;
      var10005 = Ref.h(192524377405831538L, var15, var16);

      try {
         var33 = (Integer)var10005;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      label55: {
         int var5 = var33;
         int var34 = var5;
         int var10006 = Registry.lookupField(575606058119943329L).getInt(null);
         if (var2 == null) {
            if (var5 == var10006) {
               var3.N$void();
               var3.d$void();
               if (var2 == null) {
                  break label55;
               }
            }

            var34 = var5;
            var10006 = Registry.lookupField(365550255727062967L).getInt(null);
         }

         if (var34 == var10006) {
            var3.N$void();
         }
      }

      Object var17 = 493158471773442262L;
      Ref.g(493158471773442262L, var17);
      T32 var10007 = (T32)(Registry.packArgs(var3, a(1439, 31958), var1, true, true));
      long var20 = 451133235546109527L;
      Object[] var19 = var10007;
      var10007 = Ref.h(451133235546109527L, var19, var20);

      try {
         var10007 = (T32)var10007;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      T32 var6 = var10007;
      Object[] var10008 = Registry.packArgs(var3);
      long var22 = 331953291291636753L;
      Object[] var21 = var10008;
      Ref.h(331953291291636753L, var21, var22);

      try {
         ;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      var3.U(var6);
      return var3;
   }

   public ConnectionProperty c$_y_2() {
      Object var3 = 493158471773442262L;
      Ref.g(493158471773442262L, var3);
      ArrayList var10002 = Registry.emptyArgs();
      long var6 = 230171768324088030L;
      Object[] var5 = var10002;
      var10002 = Ref.h(230171768324088030L, var5, var6);

      try {
         var10002 = (ArrayList)var10002;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      int var1 = var10002.size();
      ConnectionProperty var10003 = Registry.packArgs(var1);
      long var8 = 373772676770569629L;
      Object[] var7 = var10003;
      var10003 = Ref.h(373772676770569629L, var7, var8);

      try {
         var10003 = (ConnectionProperty)var10003;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      return var10003;
   }

   public void T$void() {
      F8.y();
      Object var7 = 493158471773442262L;
      Object var10002 = Ref.g(493158471773442262L, var7);
      ArrayList var10003 = (ArrayList)(Registry.emptyArgs());
      long var10 = 230171768324088030L;
      Object[] var9 = var10003;
      var10003 = Ref.h(230171768324088030L, var9, var10);

      try {
         var10003 = (ArrayList)var10003;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      ArrayList var2 = var10003;
      Object var1 = var10002;

      for (T32 var4 : var2) {
         var10003 = Registry.emptyArgs();
         long var12 = 424156930953488367L;
         Object[] var11 = var10003;
         var10003 = Ref.h(424156930953488367L, var11, var12);

         try {
            var10003 = (F8)var10003;
         } catch (InvocationTargetException var16) {
            throw var16.getTargetException();
         }

         label44: {
            F8 var5 = var10003;
            F8 var23 = var5;
            if (var1 == null) {
               if (!var5.getClass().equals(ConnectionProperty.class)) {
                  break label44;
               }

               var23 = var5;
            }

            ConnectionProperty var6 = (ConnectionProperty)var23;
            if (var6.R()) {
               Object[] var10004 = Registry.packArgs(var6);
               long var14 = 185296114512803953L;
               Object[] var13 = var10004;
               Ref.h(185296114512803953L, var13, var14);

               try {
                  ;
               } catch (InvocationTargetException var15) {
                  throw var15.getTargetException();
               }
            }
         }

         if (var1 != null) {
            break;
         }
      }
   }

   public boolean G() {
      Object var2 = false;
      F8.y();
      Object var8 = 493158471773442262L;
      Z var10002 = (Z)Ref.g(493158471773442262L, var8);
      ArrayList var10003 = (ArrayList)(Registry.emptyArgs());
      long var11 = 230171768324088030L;
      Object[] var10 = var10003;
      var10003 = Ref.h(230171768324088030L, var10, var11);

      try {
         var10003 = (ArrayList)var10003;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      ArrayList var3 = var10003;
      Object var1 = var10002;
      Iterator var4 = var3.iterator();

      while (true) {
         label51:
         if (var4.hasNext()) {
            T32 var5 = (T32)var4.next();
            var10002 = var5;
            var10003 = Registry.emptyArgs();
            long var13 = 424156930953488367L;
            Object[] var12 = var10003;
            var10003 = Ref.h(424156930953488367L, var12, var13);

            try {
               var10003 = (F8)var10003;
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            label58: {
               F8 var6 = var10003;
               F8 var22 = var6;
               if (var1 == null) {
                  boolean var23 = var6.getClass().equals(ConnectionProperty.class);
                  if (var1 != null) {
                     break;
                  }

                  if (!var23) {
                     break label58;
                  }

                  var22 = var6;
               }

               ConnectionProperty var7 = (ConnectionProperty)var22;
               var10003 = var7.R();
               if (var1 == null) {
                  if (var10003 == null) {
                     break label58;
                  }

                  var10003 = true;
               }

               var2 = var10003;
               if (var1 == null) {
                  break label51;
               }
            }

            if (var1 == null) {
               continue;
            }
         }

         var10002 = (Z)var2;
         break;
      }

      return (boolean)var10002;
   }

   public void d(ConnectionProperty var1) {
      if (var1.R()) {
         Lv4_2 var10002 = var1.a();
         Object[] var10003 = Registry.emptyArgs();
         long var3 = 432693308750455264L;
         Object[] var2 = var10003;
         Object[] var7 = Registry.packArgs(var10002, Ref.h(432693308750455264L, var2, var3), false);
         long var5 = 274870394042991893L;
         Object[] var4 = var7;
         Ref.h(274870394042991893L, var4, var5);

         try {
            ;
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }
   }

   public void A(ConnectionProperty var1, String var2, boolean var3) {
      String[] var4;
      Lv4_2 var6;
      ConnectionProperty var58;
      label170: {
         label171: {
            var58 = F8.y();
            String var5 = "";
            var6 = null;
            var4 = (String[])var58;
            var58 = var1;
            if (var4 == null) {
               if (var1 == null) {
                  break label171;
               }

               var58 = var1;
            }

            var6 = var58.a();
            var58 = var6;
            if (var4 != null) {
               break label170;
            }

            if (var6 != null) {
               Object[] var10001 = Registry.emptyArgs();
               long var14 = 292557478156152530L;
               Object[] var13 = var10001;
               Ref.h(292557478156152530L, var13, var14);

               try {
                  ;
               } catch (InvocationTargetException var53) {
                  throw var53.getTargetException();
               }
            }
         }

         var58 = Registry.emptyArgs();
         long var15 = 270389152141252877L;
         Ref.h2(270389152141252877L, var15);
         Object[] var10002 = Registry.emptyArgs();
         long var18 = 410905379772103887L;
         Object[] var17 = var10002;
         Ref.h(410905379772103887L, var17, var18);
         Object[] var10003 = Registry.packArgs(var1, var2);
         long var20 = 495418189741494584L;
         Object[] var19 = var10003;
         Ref.h(495418189741494584L, var19, var20);

         try {
            ;
         } catch (InvocationTargetException var52) {
            throw var52.getTargetException();
         }
      }

      Object var7 = var58;
      String var59 = (String)(Registry.emptyArgs());
      long var22 = 424907351961233197L;
      Object[] var21 = var59;
      var59 = Ref.h(424907351961233197L, var21, var22);

      try {
         var59 = (String)var59;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }

      ((ConnectionProperty)var7).o(var59);
      int var8 = Registry.lookupField(457705496102446726L).getInt(null);
      Object[] var10004 = Registry.emptyArgs();
      long var24 = 380415140795833934L;
      Object[] var23 = var10004;
      Ref.h(380415140795833934L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var50) {
         throw var50.getTargetException();
      }

      Object[] var10006 = Registry.emptyArgs();
      long var26 = 255354522009994316L;
      Object[] var25 = var10006;
      var10006 = Ref.h(255354522009994316L, var25, var26);

      try {
         var65 = (Integer)var10006;
      } catch (InvocationTargetException var49) {
         throw var49.getTargetException();
      }

      int var10008 = (int)Registry.emptyArgs();
      long var28 = 255973732097233937L;
      Object[] var27 = var10008;
      var10008 = Ref.h(255973732097233937L, var27, var28);

      try {
         var10008 = (int)((String)var10008);
      } catch (InvocationTargetException var48) {
         throw var48.getTargetException();
      }

      String var10010 = (String)(Registry.emptyArgs());
      long var30 = 195538594886366540L;
      Object[] var29 = var10010;
      var10010 = Ref.h(195538594886366540L, var29, var30);

      try {
         var10010 = (String)var10010;
      } catch (InvocationTargetException var47) {
         throw var47.getTargetException();
      }

var65 = new U((String)var7, (int)var70, (String)var7, var10010, (Lv4_2)var7);
      boolean var10005 = var1.v$boolean();
      if (var4 == null) {
         if (var10005) {
            ConnectionProperty var10 = var1.f((Fv2_2)var7);
            var10.N(var8);
         }

         var10005 = var3;
      }

      if (var4 == null) {
         if (var10005) {
            long var32 = 208444474277099894L;
            Ref.s(208444474277099894L, var1, var32);
         }

         var1.H((Lv4_2)var7);
         var10005 = var7.equals(var6);
      }

      label153: {
         label173: {
            if (var4 == null) {
               if (var10005) {
                  break label173;
               }

               var10005 = var3;
            }

            if (var4 != null) {
               break label153;
            }

            if (!var10005) {
               var10005 = true;
               break label153;
            }
         }

         var10005 = false;
      }

      boolean var54 = var10005;
      if (var54) {
         FilePanel var11 = var1.q$s();
         FilePanel var62 = var11;
         if (var4 == null) {
            if (var11 != null) {
               var10006 = Registry.emptyArgs();
               long var34 = 596995871768363771L;
               Object[] var33 = var10006;
               Ref.h(596995871768363771L, var33, var34);

               try {
                  ;
               } catch (InvocationTargetException var46) {
                  throw var46.getTargetException();
               }
            }

            var62 = new FilePanel(var1);
         }

         FilePanel var12 = var62;
         var1.K(var12);
         var10006 = Registry.packArgs(var12);
         long var36 = 247914494315670987L;
         Object[] var35 = var10006;
         Ref.h(247914494315670987L, var35, var36);

         try {
            ;
         } catch (InvocationTargetException var45) {
            throw var45.getTargetException();
         }
      }

      ConnectionProperty var63 = var1.N$_y_2();
      if (var4 == null) {
         if (var63 == null) {
            ConnectionProperty var55 = new ConnectionProperty(new XF());
            var55.o(true);
            var1.W(var55);
         }

         var63 = var1;
      }

      T32 var56 = var63.X();
      Object[] var10007 = Registry.emptyArgs();
      long var38 = 286931176286176762L;
      Object[] var37 = var10007;
      var10007 = Registry.packArgs(Ref.h(286931176286176762L, var37, var38));
      long var40 = 519460332647460288L;
      Object[] var39 = var10007;
      Ref.h(519460332647460288L, var39, var40);

      try {
         ;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      Object[] var71 = Registry.emptyArgs();
      long var42 = 176235325809488947L;
      Object[] var41 = var71;
      Ref.h(176235325809488947L, var41, var42);

      try {
         ;
      } catch (InvocationTargetException var43) {
         throw var43.getTargetException();
      }
   }

   public void H() {
      String[] var10000 = F8.y();
      this.requestFocus();
      String[] var1 = var10000;
      Object var3 = 395703699466617837L;
      Object var10001 = (F8)Ref.g(395703699466617837L, var3);
      if (var1 == null) {
         if (!var10001.getClass().equals(ConnectionProperty.class)) {
            return;
         }

         var10001 = this;
         Object var5 = 395703699466617837L;
         F8 var10002 = (F8)Ref.g(395703699466617837L, var5);
      }

      ConnectionProperty var2 = (ConnectionProperty)var10001;
      var2.C$void();
   }

   public JPopupMenu o$JPopupMenu() {
      label32: {
         String[] var1 = F8.y();
         Object var19 = 337860688004803931L;
         Object var10001 = (JPopupMenu)Ref.g(337860688004803931L, var19);
         if (var1 == null) {
            if (var10001 == null) {
               JPopupMenu var10002 = new JPopupMenu();
               long var22 = 337860688004803931L;
               JPopupMenu var21 = var10002;
               Ref.s(337860688004803931L, var21, var22);
               if (var1 == null) {
                  break label32;
               }
            }

            var10001 = this;
            Object var23 = 337860688004803931L;
            JPopupMenu var63 = (JPopupMenu)Ref.g(337860688004803931L, var23);
         }

         var10001.removeAll();
      }

      JMenu var2 = new JMenu(a(1455, 29417));
      Object var25 = 337860688004803931L;
      ((JPopupMenu)Ref.g(337860688004803931L, var25)).add(var2);
      JMenuItem var3 = new JMenuItem(a(1437, -8504));
      var2.add(var3);
      var3.addActionListener(new ConfirmCloseWindowListener(this));
      JMenu var4 = new JMenu(a(1448, 9125));
      JMenuItem var5 = new JMenuItem(a(1446, 7960));
      var4.add(var5);
      var4.addSeparator();
      JMenuItem var6 = new JMenuItem(a(1418, 20374));
      var4.add(var6);
      var4.addSeparator();
      JMenuItem var7 = new JMenuItem(a(1469, -24370));
      var4.add(var7);
      JMenuItem var8 = new JMenuItem(a(1466, 23392));
      var4.add(var8);
      var4.addSeparator();
      JMenuItem var9 = new JMenuItem(a(1450, -28235));
      var4.add(var9);
      JMenu var10003 = new JMenu(a(1428, 29861));
      long var28 = 433205011082801842L;
      JMenu var27 = var10003;
      Ref.s(433205011082801842L, var27, var28);
      Object var29 = 337860688004803931L;
      JPopupMenu var10004 = (JPopupMenu)Ref.g(337860688004803931L, var29);
      Object var31 = 433205011082801842L;
      this.add((JMenu)Ref.g(433205011082801842L, var31));
      Object[] var10006 = Registry.emptyArgs();
      long var34 = 137546088887019078L;
      Object[] var33 = var10006;
      Ref.h(137546088887019078L, var33, var34);

      try {
         ;
      } catch (InvocationTargetException var62) {
         throw var62.getTargetException();
      }

      Object var35 = 433205011082801842L;
      ((JMenu)Ref.g(433205011082801842L, var35)).addMenuListener(new Ys_4(this));
      JMenuItem var10 = new JMenuItem(a(1454, 18125));
      Object var37 = 337860688004803931L;
      ((JPopupMenu)Ref.g(337860688004803931L, var37)).add(var10);
      var10.addActionListener(new Z0(this));
      Object var39 = 337860688004803931L;
      ((JPopupMenu)Ref.g(337860688004803931L, var39)).addSeparator();
      JMenuItem var11 = new JMenuItem(a(1419, 7470));
      Object var41 = 337860688004803931L;
      ((JPopupMenu)Ref.g(337860688004803931L, var41)).add(var11);
      var11.addActionListener(new Ze2(this));
      Object var43 = 337860688004803931L;
      ((JPopupMenu)Ref.g(337860688004803931L, var43)).addSeparator();
      JMenuItem var12 = new JMenuItem(a(1430, 26174));
      Object var45 = 337860688004803931L;
      ((JPopupMenu)Ref.g(337860688004803931L, var45)).add(var12);
      var12.addActionListener(new UP(this));
      Object var47 = 337860688004803931L;
      ((JPopupMenu)Ref.g(337860688004803931L, var47)).addSeparator();
      JMenuItem var13 = new JMenuItem("");
      Object var49 = 337860688004803931L;
      ((JPopupMenu)Ref.g(337860688004803931L, var49)).add(var13);
      var13.addActionListener(new TP(this));
      Object[] var10015 = Registry.packArgs(a(1408, -30590));
      long var51 = 517287540690064504L;
      Object var10016 = Ref.h2(517287540690064504L, var51);

      try {
         var10016 = (String)var10016;
      } catch (InvocationTargetException var61) {
         throw var61.getTargetException();
      }

      var10015.setText((String)var10016);
      JMenuItem var14 = new JMenuItem(a(1415, -1959));
      Object var53 = 337860688004803931L;
      ((JPopupMenu)Ref.g(337860688004803931L, var53)).add(var14);
      var14.addActionListener(new FJ(this));
      Object var55 = 337860688004803931L;
      ((JPopupMenu)Ref.g(337860688004803931L, var55)).addSeparator();
      JMenu var15 = new JMenu(a(1436, -28002));
      Object var57 = 337860688004803931L;
      ((JPopupMenu)Ref.g(337860688004803931L, var57)).add(var15);
      JMenuItem var16 = new JMenuItem(a(1420, 12120));
      var15.add(var16);
      var16.addActionListener(new Jd2(this));
      JMenuItem var17 = new JMenuItem(a(1445, 7065));
      var15.add(var17);
      var17.addActionListener(new Od4(this));
      JMenuItem var18 = new JMenuItem(a(1442, 15745));
      var15.add(var18);
      var18.addActionListener(new Bo2(this));
      Object var59 = 337860688004803931L;
      return (JPopupMenu)Ref.g(337860688004803931L, var59);
   }

   public static Ox4 s$ox_4() {
      String[] var0 = F8.y();
      Ox4 var10000 = (Ox4)Registry.lookupField(339870049399706971L).get(null);
      if (var0 == null) {
         if (!var10000.isVisible()) {
            var10000 = (Ox4)Registry.lookupField(339870049399706971L).get(null);
            Registry.emptyArgs();
            long var1 = 270389152141252877L;
            Object var10002 = Ref.h2(270389152141252877L, var1);
            U var10003 = (U)(Registry.emptyArgs());
            long var4 = 159021807804818901L;
            Object[] var3 = var10003;
            var10003 = Ref.h(159021807804818901L, var3, var4);

            try {
               var10003 = (U)var10003;
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            ((Ox4)var10002).setLocationRelativeTo(var10003);
         }

         var10000 = (Ox4)Registry.lookupField(339870049399706971L).get(null);
         Object[] var10001 = Registry.packArgs(true);
         long var6 = 509679152478047438L;
         Object[] var5 = var10001;
         Ref.h(509679152478047438L, var5, var6);

         try {
            ;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         ((Ox4)Registry.lookupField(339870049399706971L).get(null)).requestFocus();
         Ox4 var10 = (Ox4)Registry.lookupField(339870049399706971L).get(null);
      }

      return var10000;
   }

   public void x$void() {
      F8.y();
      a(1417, 13786);
      Object[] var10004 = Registry.emptyArgs();
      long var6 = 270389152141252877L;
      Object var10005 = Ref.h2(270389152141252877L, var6);
      Object[] var10006 = Registry.emptyArgs();
      long var9 = 306266403902896148L;
      Object[] var8 = var10006;
      var10006 = Ref.h(306266403902896148L, var8, var9);
      Object[] var10007 = Registry.emptyArgs();
      long var11 = 577875833820570498L;
      Object[] var10 = var10007;
      var10007 = Ref.h(577875833820570498L, var10, var11);

      try {
         var37 = (Boolean)var10007;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

var10005 = new RenderingHints(var10006, var37);
      Object[] var2 = var10004;
      Object var12 = 433205011082801842L;
      ((JMenu)Ref.g(433205011082801842L, var12)).add(var2);
      var2.addActionListener(new Tw4(this, var2));
      Registry.emptyArgs();
      long var14 = 270389152141252877L;
      Ref.h2(270389152141252877L, var14);
      var10006 = Registry.emptyArgs();
      long var17 = 332056532434062105L;
      Object[] var16 = var10006;
      Ref.h(332056532434062105L, var16, var17);
      var10007 = Registry.emptyArgs();
      long var19 = 143530106198249902L;
      Object[] var18 = var10007;
      var10007 = Ref.h(143530106198249902L, var18, var19);

      try {
         var10007 = (Kj2)var10007;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      Kj2 var3 = var10007;
      JCheckBoxMenuItem var10008;
      String var10009 = a(1444, 5101);
      Object[] var10011 = Registry.emptyArgs();
      long var21 = 571514335693873067L;
      Object[] var20 = var10011;
      var10011 = Ref.h(571514335693873067L, var20, var21);

      try {
         var43 = (Boolean)var10011;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

var10009 = new RenderingHints(var3, var43);
      JCheckBoxMenuItem var4 = var10008;
      Object var22 = 433205011082801842L;
      ((JMenu)Ref.g(433205011082801842L, var22)).add((JMenuItem)var4);
      var4.addActionListener(new Lf2(this, var4, var3));
      Registry.packArgs(Registry.lookupField(466286588116172621L).getInt(null), new Od2(this, a(1463, 14835)));
      long var24 = 458639668206483981L;
      Object var10010 = Ref.h2(458639668206483981L, var24);

      try {
         var10010 = (JMenuItem)var10010;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      JMenuItem var5 = (JMenuItem)var10010;
      Object var26 = 433205011082801842L;
      ((JMenu)Ref.g(433205011082801842L, var26)).add(var5);
      if (this == null) {
         Object var28 = 395703699466617837L;
         if (Ref.g(395703699466617837L, var28) instanceof ConnectionProperty) {
            return;
         }

         var4.setEnabled(false);
      }

      var5.setEnabled(false);
   }

   public void I(boolean var1) {
      String[] var2;
      label43: {
         var2 = F8.y();
         if (var2 == null) {
            if (var1 != 0) {
               Object var4 = 467883177032167383L;
               JSplitPane var10001 = (JSplitPane)Ref.g(467883177032167383L, var4);
               Object var6 = 346229218997944282L;
               this.setRightComponent((JPanel)Ref.g(346229218997944282L, var6));
               Object var8 = 575209039576190599L;
               ((Yp4)Ref.g(575209039576190599L, var8)).removeAll();
               Object var10 = 575209039576190599L;
               Yp4 var10004 = (Yp4)Ref.g(575209039576190599L, var10);
               Object var12 = 467883177032167383L;
               this.add((JSplitPane)Ref.g(467883177032167383L, var12), a(1425, 29228));
               Rectangle var3 = this.getBounds();
               Object var14 = 467883177032167383L;
               int var10008 = ((JSplitPane)Ref.g(467883177032167383L, var14)).getDividerLocation();
               Object var16 = 467883177032167383L;
               super.x = var10008 - (this + ((JSplitPane)Ref.g(467883177032167383L, var16)).getDividerSize());
               Object var18 = 467883177032167383L;
               var3.width.width = this + ((JSplitPane)Ref.g(467883177032167383L, var18)).getDividerLocation();
               this.setBounds(var3);
               if (var2 == null) {
                  break label43;
               }
            }

            Object var20 = 467883177032167383L;
            Registry.lookupField(421784410847310645L).setInt(this, ((JSplitPane)Ref.g(467883177032167383L, var20)).getDividerLocation());
            Object var22 = 575209039576190599L;
            ((Yp4)Ref.g(575209039576190599L, var22)).removeAll();
            Object var24 = 575209039576190599L;
            Yp4 var10003 = (Yp4)Ref.g(575209039576190599L, var24);
            Object var26 = 346229218997944282L;
            this.add((JPanel)Ref.g(346229218997944282L, var26), a(1425, 29228));
         }

         Rectangle var41 = this.getBounds();
         Object var28 = 467883177032167383L;
         int var42 = ((JSplitPane)Ref.g(467883177032167383L, var28)).getDividerLocation();
         Object var30 = 467883177032167383L;
         super.x = var42 + this + ((JSplitPane)Ref.g(467883177032167383L, var30)).getDividerSize();
         Object var32 = 467883177032167383L;
         int var10005 = ((JSplitPane)Ref.g(467883177032167383L, var32)).getDividerLocation();
         Object var34 = 467883177032167383L;
         super.width = var10005 - (this + ((JSplitPane)Ref.g(467883177032167383L, var34)).getDividerSize());
         this.setBounds(var41);
      }

      Object[] var43 = Registry.emptyArgs();
      long var37 = 176356587927714575L;
      Object[] var36 = var43;
      Ref.h(176356587927714575L, var36, var37);

      try {
         ;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      label46: {
         this.rootPane.validate();
         int var44 = (var1) ? 1 : 0;
         if (var2 == null) {
            if (var1 == 0) {
               return;
            }

            if (var2 != null) {
               break label46;
            }

            var44 = Registry.lookupField(421784410847310645L).getInt(this);
         }

         if (var44 <= 0) {
            return;
         }
      }

      Object var38 = 467883177032167383L;
      ((JSplitPane)Ref.g(467883177032167383L, var38)).setDividerLocation(Registry.lookupField(421784410847310645L).getInt(this));
   }

   public void g() {
      String[] var1;
      label48: {
         var1 = F8.y();
         if (var1 == null && Registry.lookupField(215457793551818098L).getBoolean(this)) {
            Object[] var10001 = Registry.emptyArgs();
            long var3 = 394056082178229950L;
            Object[] var2 = var10001;
            Ref.h(394056082178229950L, var2, var3);

            try {
               ;
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            if (var1 == null) {
               break label48;
            }
         }

         Object[] var15 = Registry.emptyArgs();
         long var5 = 509273842925604241L;
         Object[] var4 = var15;
         Ref.h(509273842925604241L, var4, var5);

         try {
            ;
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }
      }

      if (var1 == null) {
         Object var6 = 208444474277099894L;
         if ((ConnectionProperty)Ref.g(208444474277099894L, var6) != null) {
            Object var8 = 208444474277099894L;
            ((ConnectionProperty)Ref.g(208444474277099894L, var8)).U();
         }
      }

      Object[] var10002 = Registry.emptyArgs();
      long var11 = 176356587927714575L;
      Object[] var10 = var10002;
      Ref.h(176356587927714575L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }

   public void E() {
      String[] var10000 = F8.y();
      Registry.lookupField(215457793551818098L).setBoolean(this, true);
      String[] var1 = var10000;
      if (var1 == null) {
         Object var4 = 395703699466617837L;
         if ((F8)Ref.g(395703699466617837L, var4) != null && var1 == null) {
            Object var6 = 395703699466617837L;
            if (((F8)Ref.g(395703699466617837L, var6)).getClass().equals(ConnectionProperty.class)) {
               Object var8 = 395703699466617837L;
               ConnectionProperty var2 = (ConnectionProperty)Ref.g(395703699466617837L, var8);
               Object var10 = 408335381065038419L;
               U1 var10004 = (U1)Ref.g(408335381065038419L, var10);
               if (var1 == null) {
                  if (var10004 == null) {
                     U var3 = null;
                     Registry.emptyArgs();
                     long var12 = 253808553645062345L;
                     Object var10005 = Ref.h2(253808553645062345L, var12);

                     try {
                        var26 = (Boolean)var10005;
                     } catch (InvocationTargetException var25) {
                        throw var25.getTargetException();
                     }

                     if (var26) {
                        var3 = this;
                     }

                     U1 var10006 = new U1(var3);
                     long var15 = 408335381065038419L;
                     U1 var14 = var10006;
                     Ref.s(408335381065038419L, var14, var15);
                  }

                  Object var16 = 408335381065038419L;
                  U1 var27 = (U1)Ref.g(408335381065038419L, var16);
               }

               Object[] var28 = Registry.packArgs(var2);
               long var19 = 558392958367179253L;
               Object[] var18 = var28;
               Ref.h(558392958367179253L, var18, var19);

               try {
                  ;
               } catch (InvocationTargetException var24) {
                  throw var24.getTargetException();
               }
            }
         }
      }

      Object var20 = 208444474277099894L;
      Object var10001 = (ConnectionProperty)Ref.g(208444474277099894L, var20);
      if (var1 == null) {
         if (var10001 == null) {
            return;
         }

         var10001 = this;
         Object var22 = 208444474277099894L;
         ConnectionProperty var10002 = (ConnectionProperty)Ref.g(208444474277099894L, var22);
      }

      ((ConnectionProperty)var10001).U();
   }

   public void B() {
      Registry.lookupField(215457793551818098L).setBoolean(this, false);
      F8.y();
      Object var2 = 493158471773442262L;
      Ref.g(493158471773442262L, var2);
      Object var4 = 395703699466617837L;
      Object[] var10004 = Registry.packArgs(Ref.g(395703699466617837L, var4));
      long var7 = 623077201085538176L;
      Object[] var6 = var10004;
      Ref.h(623077201085538176L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      Object var8 = 408335381065038419L;
      Object var10005 = Ref.g(408335381065038419L, var8);
      Object[] var10006 = Registry.emptyArgs();
      long var11 = 239470758801356617L;
      Object[] var10 = var10006;
      Ref.h(239470758801356617L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      Object var1 = var10005;
      Object var12 = 208444474277099894L;
      var10006 = (ConnectionProperty)Ref.g(208444474277099894L, var12);
      if (var1 == null) {
         if (var10006 == null) {
            return;
         }

         var10006 = this;
         Object var14 = 208444474277099894L;
         ConnectionProperty var10007 = (ConnectionProperty)Ref.g(208444474277099894L, var14);
      }

      var10006.O$pA_3().requestFocus();
   }

   public void K() {
      F8.y();
      Registry.emptyArgs();
      long var7 = 270389152141252877L;
      Ref.h2(270389152141252877L, var7);
      Object[] var10004 = Registry.emptyArgs();
      long var10 = 399585344452154517L;
      Object[] var9 = var10004;
      Ref.h(399585344452154517L, var9, var10);
      Object[] var10005 = Registry.emptyArgs();
      long var12 = 149968465491171480L;
      Object[] var11 = var10005;
      var10005 = Ref.h(149968465491171480L, var11, var12);
      long var14 = 290540599632617730L;
      Object var13 = var10005;
      Ref.s(290540599632617730L, var13, var14);
      Object var15 = 346229218997944282L;
      ((JPanel)Ref.g(346229218997944282L, var15)).setOpaque(false);
      Registry.emptyArgs();
      long var17 = 566976294285821501L;
      Ref.h2(566976294285821501L, var17);

      try {
         ;
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }

      Object var19 = 493158471773442262L;
      Object var10008 = Ref.g(493158471773442262L, var19);
      ArrayList var10009 = (ArrayList)(Registry.emptyArgs());
      long var22 = 230171768324088030L;
      Object[] var21 = var10009;
      var10009 = Ref.h(230171768324088030L, var21, var22);

      try {
         var10009 = (ArrayList)var10009;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }

      ArrayList var2 = var10009;
      Object var1 = var10008;
      Iterator var3 = var2.iterator();

      while (true) {
         if (var3.hasNext()) {
            T32 var4 = (T32)var3.next();
            var10009 = Registry.emptyArgs();
            long var24 = 424156930953488367L;
            Object[] var23 = var10009;
            var10009 = Ref.h(424156930953488367L, var23, var24);

            try {
               var10009 = (F8)var10009;
            } catch (InvocationTargetException var34) {
               throw var34.getTargetException();
            }

            F8 var5 = var10009;
            if (var1 != null) {
               break;
            }

            label106: {
               boolean var47 = var5.getClass().equals(ConnectionProperty.class);
               if (var1 == null) {
                  if (var47) {
                     ConnectionProperty var6 = (ConnectionProperty)var5;
                     var6.n$void();
                     if (var1 == null) {
                        break label106;
                     }
                  }

                  var47 = var5.getClass().equals(F5.class);
               }

               label107: {
                  if (var1 == null) {
                     if (var47) {
                        F5 var39 = (F5)var5;
                        Object[] var10010 = Registry.emptyArgs();
                        long var26 = 447912758445060699L;
                        Object[] var25 = var10010;
                        Ref.h(447912758445060699L, var25, var26);

                        try {
                           ;
                        } catch (InvocationTargetException var36) {
                           throw var36.getTargetException();
                        }

                        if (var1 == null) {
                           break label106;
                        }
                     }

                     var10009 = var5;
                     if (var1 != null) {
                        break label107;
                     }

                     var47 = var5.getClass().equals(FilePanel.class);
                  }

                  if (!var47) {
                     break label106;
                  }

                  var10009 = var5;
               }

               FilePanel var40 = (FilePanel)var10009;
               Object[] var49 = Registry.emptyArgs();
               long var28 = 154124667354705878L;
               Object[] var27 = var49;
               Ref.h(154124667354705878L, var27, var28);

               try {
                  ;
               } catch (InvocationTargetException var35) {
                  throw var35.getTargetException();
               }
            }

            if (var1 == null) {
               continue;
            }
         }

         Object var29 = 493158471773442262L;
         Ref.g(493158471773442262L, var29);
         Object[] var50 = Registry.emptyArgs();
         long var32 = 415642889349902360L;
         Object[] var31 = var50;
         Ref.h(415642889349902360L, var31, var32);

         try {
            break;
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }
      }
   }

   public ArrayList x$ArrayList() {
      String[] var10000 = F8.y();
      ArrayList var2 = new ArrayList();
      String[] var1 = var10000;
      Object var8 = 493158471773442262L;
      Ref.g(493158471773442262L, var8);
      ArrayList var10002 = (ArrayList)(Registry.emptyArgs());
      long var11 = 230171768324088030L;
      Object[] var10 = var10002;
      var10002 = Ref.h(230171768324088030L, var10, var11);

      try {
         var10002 = (ArrayList)var10002;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      for (T32 var5 : var10002) {
         F8 var10003 = (F8)(Registry.emptyArgs());
         long var13 = 424156930953488367L;
         Object[] var12 = var10003;
         var10003 = Ref.h(424156930953488367L, var12, var13);

         try {
            var10003 = (F8)var10003;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         label36: {
            F8 var6 = var10003;
            F8 var20 = var6;
            if (var1 == null) {
               if (!var6.getClass().equals(ConnectionProperty.class)) {
                  break label36;
               }

               var20 = var6;
            }

            ConnectionProperty var7 = (ConnectionProperty)var20;
            var2.add(var7);
         }

         if (var1 != null) {
            break;
         }
      }

      return var2;
   }

   public void j(String var1) {
      F8.y();
      Object var10 = 493158471773442262L;
      Object var10002 = Ref.g(493158471773442262L, var10);
      ArrayList var10003 = (ArrayList)(Registry.emptyArgs());
      long var13 = 230171768324088030L;
      Object[] var12 = var10003;
      var10003 = Ref.h(230171768324088030L, var12, var13);

      try {
         var10003 = (ArrayList)var10003;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      ArrayList var3 = var10003;
      Object var2 = var10002;

      for (T32 var5 : var3) {
         var10003 = Registry.emptyArgs();
         long var15 = 424156930953488367L;
         Object[] var14 = var10003;
         var10003 = Ref.h(424156930953488367L, var14, var15);

         try {
            var10003 = (F8)var10003;
         } catch (InvocationTargetException var34) {
            throw var34.getTargetException();
         }

         label85: {
            F8 var6 = var10003;
            F8 var41 = var6;
            if (var2 == null) {
               if (!var6.getClass().equals(ConnectionProperty.class)) {
                  break label85;
               }

               var41 = var6;
            }

            ConnectionProperty var7 = (ConnectionProperty)var41;
            Lv4_2 var8 = var7.a();
            String var10005 = (String)(Registry.emptyArgs());
            long var17 = 292557478156152530L;
            Object[] var16 = var10005;
            var10005 = Ref.h(292557478156152530L, var16, var17);

            try {
               var10005 = (String)var10005;
            } catch (InvocationTargetException var33) {
               throw var33.getTargetException();
            }

            if (var8.equals(var10005)) {
               Registry.emptyArgs();
               long var18 = 270389152141252877L;
               Ref.h2(270389152141252877L, var18);
               Object[] var10006 = Registry.emptyArgs();
               long var21 = 410905379772103887L;
               Object[] var20 = var10006;
               Ref.h(410905379772103887L, var20, var21);
               Object[] var10007 = Registry.packArgs(var7);
               long var23 = 489222651847620900L;
               Object[] var22 = var10007;
               Ref.h(489222651847620900L, var22, var23);

               try {
                  ;
               } catch (InvocationTargetException var32) {
                  throw var32.getTargetException();
               }

               Object[] var10009 = Registry.emptyArgs();
               long var25 = 286931176286176762L;
               Object[] var24 = var10009;
               var10009 = Registry.packArgs(Ref.h(286931176286176762L, var24, var25));
               long var27 = 519460332647460288L;
               Object[] var26 = var10009;
               Ref.h(519460332647460288L, var26, var27);

               try {
                  ;
               } catch (InvocationTargetException var31) {
                  throw var31.getTargetException();
               }

               Object[] var10010 = Registry.emptyArgs();
               long var29 = 176235325809488947L;
               Object[] var28 = var10010;
               Ref.h(176235325809488947L, var28, var29);

               try {
                  ;
               } catch (InvocationTargetException var30) {
                  throw var30.getTargetException();
               }
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public AM o$aM() {
      Object var1 = 493158471773442262L;
      return (AM)Ref.g(493158471773442262L, var1);
   }

   public void x(AM var1) {
      long var3 = 493158471773442262L;
      Ref.s(493158471773442262L, var1, var3);
   }

   public void v(String var1) {
      try {
         Desktop.getDesktop().browse(new URI(var1));
      } catch (IOException var3) {
         var3.printStackTrace();
      } catch (URISyntaxException var4) {
         var4.printStackTrace();
      }
   }

   public boolean U() {
      String[] var1 = F8.y();
      int var10000 = Registry.lookupField(563734721953453048L).getInt(this);
      if (var1 == null) {
         var10000 = var10000 > Registry.lookupField(568929910594850224L).getInt(this) ? 1 : 0;
      }

      return var10000 != 0;
   }

   public void W() {
      XT3 var1 = new XT3(0);
      var1.setOpaque(false);
      var1.setLayout(new MigLayout(a(1451, 22061), a(1421, -29208), ""));
      var1.O(true);
      var1.setBorder(null);
      var1.f(2, 2, 2, 2);
      var1.setBorderPainted(false);
      var1.setFloatable(false);
      var1.X(LS.attached);
      var1.O(new Color(a(1275, 5080696519888100379L), a(20630, 8580117942563997816L), a(20630, 8580117942563997816L)));
      var1.T(new Color(a(29762, 4695122850733960376L), a(3459, 3602834727550014817L), a(3459, 3602834727550014817L), a(3459, 3602834727550014817L)));
      var1.setFloatable(false);
      Object[] var10002 = Registry.packArgs(a(1459, -13261));
      long var7 = 145848265399467883L;
      Object[] var6 = var10002;
      var10002 = Ref.h(145848265399467883L, var6, var7);
      long var9 = 143091319553655617L;
      Object var8 = var10002;
      Ref.s(143091319553655617L, var8, var9);
      Object var10 = 143091319553655617L;
      ((JButton)Ref.g(143091319553655617L, var10)).addActionListener(new Connection2(this));
      JToggleButton var10004 = new JToggleButton(a(1456, -12175));
      long var13 = 465653008199209678L;
      JToggleButton var12 = var10004;
      Ref.s(465653008199209678L, var12, var13);
      Object var14 = 465653008199209678L;
      ((JToggleButton)Ref.g(465653008199209678L, var14)).setFocusable(false);
      Object var16 = 465653008199209678L;
      ((JToggleButton)Ref.g(465653008199209678L, var16)).setFocusPainted(false);
      Object var18 = 465653008199209678L;
      ((JToggleButton)Ref.g(465653008199209678L, var18)).addActionListener(new WO(this));
      Object[] var10008 = Registry.packArgs(a(1453, -13371));
      long var21 = 145848265399467883L;
      Object[] var20 = var10008;
      Ref.h(145848265399467883L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      Qe2_2 var3 = new Qe2_2(a(1440, -11016));
      var3.k(3);
      var3.t(0);
      var3.setBorder(
         BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.red), BorderFactory.createEmptyBorder(3, a(24772, 9259802474854433L), 3, a(24772, 9259802474854433L))
         )
      );
      JPanel var4 = new JPanel();
      var4.setLayout(new MigLayout(a(1423, 13298)));
      var4.setOpaque(false);
      KD var10009 = (KD)(Registry.packArgs(a(1429, 2916)));
      long var23 = 145848265399467883L;
      Object[] var22 = var10009;
      var10009 = Ref.h(145848265399467883L, var22, var23);

      try {
         var10009 = (KD)var10009;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      KD var5 = var10009;
      var5.G(true);
      var5.setForeground(new Color(a(9624, 3463077069245873505L), a(17215, 5362272149277547463L), a(17215, 5362272149277547463L)));
      var5.t(new Color(a(17215, 5362272149277547463L), a(17215, 5362272149277547463L), a(17215, 5362272149277547463L)));
      var5.addActionListener(new Fd4(this));
      var4.add(new JLabel(), a(1460, -7859));
   }

   public void v() {
      String[] var1 = F8.y();
      if (var1 != null) {
         Registry.lookupField(199832172921665052L).get(null);
         Object var6 = 488270198363831547L;
         Object[] var12 = Registry.packArgs(Ref.g(488270198363831547L, var6));
         long var9 = 422760829319996944L;
         Object[] var8 = var12;
         Ref.h(422760829319996944L, var8, var9);

         try {
            ;
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }
      } else if (System.currentTimeMillis() - Registry.lookupField(143884728914136480L).getLong(this) > b(25440, 3593803201574059277L)) {
         Registry.emptyArgs();
         long var2 = 270389152141252877L;
         Ref.h2(270389152141252877L, var2);
         Object[] var10002 = Registry.emptyArgs();
         long var5 = 284609497308396758L;
         Object[] var4 = var10002;
         Ref.h(284609497308396758L, var4, var5);

         label23:
         try {
            break label23;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }
      }
   }

   public void c$void() {
      Registry.lookupField(199832172921665052L).get(null);
      Object[] var10001 = Registry.packArgs(false);
      long var2 = 634601920284847200L;
      Object[] var1 = var10001;
      Ref.h(634601920284847200L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public KQ F() {
      return (KQ)Registry.lookupField(199832172921665052L).get(null);
   }

   public KD x(String var1) {
      KD var2 = new KD(var1);
      Registry.packArgs(var2);
      long var3 = 560784054776466487L;
      Ref.h2(560784054776466487L, var3);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var2.setMargin(new Insets(0, 0, 0, 0));
      var2.setFocusPainted(false);
      var2.setFocusable(false);
      return var2;
   }

   public ImageIcon J(String var1) {
      Object[] var10001 = Registry.packArgs(this.getClass(), var1);
      long var3 = 144976446280365993L;
      Object[] var2 = var10001;
      var10001 = Ref.h(144976446280365993L, var2, var3);

      try {
         return (ImageIcon)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public ImageIcon o(Class var1, String var2) {
      String[] var10000 = F8.y();
      String var4 = var1.getCanonicalName() + ":" + var2;
      String[] var3 = var10000;
      Map var5 = (Map)Registry.lookupField(207356635846703947L).get(null);
      String var10001 = var4;
      if (var3 == null) {
         if (!var5.containsKey(var4)) {
            ((Map)Registry.lookupField(207356635846703947L).get(null)).put(var4, new ImageIcon(var1.getResource("/" + var2)));
         }

         var5 = (Map)Registry.lookupField(207356635846703947L).get(null);
         var10001 = var4;
      }

      return (ImageIcon)var5.get(var10001);
   }

   public List n$List() {
      return null;
   }

   public CS3_2 c$cS_3() {
      return null;
   }

   @Override
   public void Y(CS3_2 var1) {
   }

   public KQ i() {
      return (KQ)Registry.lookupField(199832172921665052L).get(null);
   }

   @Override
   public void M(Yl4 var1) {
      F8.y();
      Object[] var10002 = Registry.emptyArgs();
      long var10 = 603983761173484132L;
      Object[] var9 = var10002;
      Ref.h(603983761173484132L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var52) {
         throw var52.getTargetException();
      }

      var10002 = Registry.emptyArgs();
      long var12 = 482158916352546664L;
      Object[] var11 = var10002;
      var10002 = Ref.h(482158916352546664L, var11, var12);

      try {
         var56 = (Integer)var10002;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }

      int var3 = var56;
      ConnectHost var10003 = Registry.emptyArgs();
      long var14 = 323168880566913665L;
      Object[] var13 = var10003;
      var10003 = Ref.h(323168880566913665L, var13, var14);

      try {
         var10003 = (ConnectHost)var10003;
      } catch (InvocationTargetException var50) {
         throw var50.getTargetException();
      }

      ConnectionProperty var4 = var10003.a();
      Lv4_2 var5 = var4.a();
      var4.M$void();
      int var59 = var3;
      int var10004 = Registry.lookupField(292074870577220689L).getInt(null);
      if (this == null) {
         if (var3 == var10004) {
            Object[] var60 = Registry.emptyArgs();
            long var16 = 323168880566913665L;
            Object[] var15 = var60;
            Ref.h(323168880566913665L, var15, var16);

            try {
               ;
            } catch (InvocationTargetException var49) {
               throw var49.getTargetException();
            }

            FilePanel var7 = var4.q$s();
            if (var7 == null) {
               return;
            }

            Object[] var10005 = Registry.emptyArgs();
            long var18 = 292557478156152530L;
            Object[] var17 = var10005;
            Ref.h(292557478156152530L, var17, var18);

            try {
               ;
            } catch (InvocationTargetException var48) {
               throw var48.getTargetException();
            }

            String var10007 = (String)(Registry.emptyArgs());
            long var20 = 491398570065935257L;
            Object[] var19 = var10007;
            var10007 = Ref.h(491398570065935257L, var19, var20);

            try {
               var10007 = (String)var10007;
            } catch (InvocationTargetException var47) {
               throw var47.getTargetException();
            }

            if (!var7.equals(var10007)) {
               Registry.lookupField(388376917454860932L).get(null);
               var10007 = Registry.packArgs(new OZ3(this, var7, var1, var5));
               long var22 = 434592463220957006L;
               Object[] var21 = var10007;
               Ref.h(434592463220957006L, var21, var22);

               try {
                  ;
               } catch (InvocationTargetException var46) {
                  throw var46.getTargetException();
               }
            }

            Object[] var10008 = Registry.emptyArgs();
            long var24 = 292557478156152530L;
            Object[] var23 = var10008;
            var10008 = Registry.packArgs(Ref.h(292557478156152530L, var23, var24));
            long var26 = 346048129223478377L;
            Object[] var25 = var10008;
            Ref.h(346048129223478377L, var25, var26);

            try {
               ;
            } catch (InvocationTargetException var45) {
               throw var45.getTargetException();
            }

            Ty2 var8 = var4.M$Ty_2();
            if (var8 == null) {
               return;
            }

            Object[] var10009 = Registry.emptyArgs();
            long var28 = 351807163041799452L;
            Object[] var27 = var10009;
            var10009 = Ref.h(351807163041799452L, var27, var28);

            try {
               var68 = (Boolean)var10009;
            } catch (InvocationTargetException var44) {
               throw var44.getTargetException();
            }

            if (var68) {
               Object[] var10010 = Registry.emptyArgs();
               long var30 = 191291493980654548L;
               Object[] var29 = var10010;
               Ref.h(191291493980654548L, var29, var30);

               try {
                  ;
               } catch (InvocationTargetException var43) {
                  throw var43.getTargetException();
               }
            }

            Registry.lookupField(388376917454860932L).get(null);
            Object[] var69 = Registry.packArgs(new Dh4(this, var4));
            long var32 = 434592463220957006L;
            Object[] var31 = var69;
            Ref.h(434592463220957006L, var31, var32);

            try {
               ;
            } catch (InvocationTargetException var42) {
               throw var42.getTargetException();
            }

            Registry.lookupField(388376917454860932L).get(null);
            Object[] var10011 = Registry.packArgs(new Ye4(this, var5, var1));
            long var34 = 434592463220957006L;
            Object[] var33 = var10011;
            Ref.h(434592463220957006L, var33, var34);

            try {
               ;
            } catch (InvocationTargetException var41) {
               throw var41.getTargetException();
            }

            if (this == null) {
               return;
            }
         }

         var59 = var3;
         var10004 = Registry.lookupField(411125898711485254L).getInt(null);
      }

      if (this == null) {
         if (var59 == var10004) {
            Registry.lookupField(388376917454860932L).get(null);
            Object[] var61 = Registry.packArgs(new Wg2(this, var4));
            long var36 = 434592463220957006L;
            Object[] var35 = var61;
            Ref.h(434592463220957006L, var35, var36);

            try {
               ;
            } catch (InvocationTargetException var40) {
               throw var40.getTargetException();
            }

            if (this == null) {
               return;
            }
         }

         var59 = var3;
         var10004 = Registry.lookupField(261180006635811470L).getInt(null);
      }

      if (var59 == var10004) {
         FilePanel var6 = var4.q$s();
         Ty2 var53 = var4.M$Ty_2();
         if (this != null || var53 != null) {
            Object[] var62 = Registry.emptyArgs();
            long var38 = 211078057503611761L;
            Object[] var37 = var62;
            Ref.h(211078057503611761L, var37, var38);

            try {
               ;
            } catch (InvocationTargetException var39) {
               throw var39.getTargetException();
            }
         }
      }
   }

   public void z(ConnectionProperty param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual com/finalshell/ui/panel/ConnectionProperty.N$_y_2 ()Lcom/finalshell/ui/panel/ConnectionProperty;
      // 004: astore 3
      // 005: aload 3
      // 006: bipush 1
      // 007: invokevirtual com/finalshell/ui/panel/ConnectionProperty.setFocusable (Z)V
      // 00a: invokestatic com/finalshell/ui/panel/F8.y ()[Ljava/lang/String;
      // 00d: aload 3
      // 00e: aconst_null
      // 00f: invokevirtual com/finalshell/ui/panel/ConnectionProperty.W (Lcom/finalshell/ui/frame/U;)V
      // 012: aload 3
      // 013: aconst_null
      // 014: invokevirtual com/finalshell/ui/panel/ConnectionProperty.Y (Lcom/finalshell/core/CS3_2;)V
      // 017: astore 2
      // 018: aload 3
      // 019: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$QT ()Lcom/finalshell/core/QT;
      // 01c: invokeinterface com/finalshell/core/QT.w$void ()V 1
      // 021: aload 1
      // 022: invokevirtual com/finalshell/ui/panel/ConnectionProperty.a ()Lcom/finalshell/core/Lv4_2;
      // 025: astore 4
      // 027: aload 3
      // 028: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$pA_3 ()Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // 02b: astore 5
      // 02d: ldc2_w 440862887533695589
      // 030: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 033: aconst_null
      // 034: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 037: aload 5
      // 039: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 03c: ldc2_w 525033836373041364
      // 03f: astore 11
      // 041: astore 10
      // 043: ldc2_w 525033836373041364
      // 046: aload 10
      // 048: aload 11
      // 04a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 04d: checkcast java/lang/Boolean
      // 050: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 053: goto 05a
      // 056: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 059: athrow
      // 05a: aload 2
      // 05b: ifnonnull 0dd
      // 05e: ifne 0d9
      // 061: goto 068
      // 064: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067: athrow
      // 068: ldc2_w 440862887533695589
      // 06b: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 06e: aconst_null
      // 06f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 072: aload 4
      // 074: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 077: ldc2_w 286931176286176762
      // 07a: astore 13
      // 07c: astore 12
      // 07e: ldc2_w 286931176286176762
      // 081: aload 12
      // 083: aload 13
      // 085: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 088: goto 08f
      // 08b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08e: athrow
      // 08f: aload 5
      // 091: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 094: ldc2_w 495374662784801625
      // 097: astore 15
      // 099: astore 14
      // 09b: ldc2_w 495374662784801625
      // 09e: aload 14
      // 0a0: aload 15
      // 0a2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a5: checkcast javax/swing/JComponent
      // 0a8: goto 0af
      // 0ab: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: astore 6
      // 0b1: ldc2_w 440862887533695589
      // 0b4: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0b7: aconst_null
      // 0b8: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0bb: aload 6
      // 0bd: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0c0: ldc2_w 515126278618913208
      // 0c3: astore 17
      // 0c5: astore 16
      // 0c7: ldc2_w 515126278618913208
      // 0ca: aload 16
      // 0cc: aload 17
      // 0ce: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d1: pop
      // 0d2: goto 0d9
      // 0d5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: aload 3
      // 0da: invokevirtual com/finalshell/ui/panel/ConnectionProperty.v$boolean ()Z
      // 0dd: ifeq 0e0
      // 0e0: aload 3
      // 0e1: aload 2
      // 0e2: ifnonnull 0fa
      // 0e5: invokevirtual com/finalshell/ui/panel/ConnectionProperty.v$boolean ()Z
      // 0e8: ifeq 1f4
      // 0eb: goto 0f2
      // 0ee: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: aload 3
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f9: athrow
      // 0fa: aload 1
      // 0fb: invokevirtual com/finalshell/ui/panel/ConnectionProperty.s$Fv_2 ()Lcom/finalshell/core/Fv2_2;
      // 0fe: invokeinterface com/finalshell/core/Fv2_2.e ()Lcom/finalshell/crypto/ConnectHost; 1
      // 103: invokevirtual com/finalshell/ui/panel/ConnectionProperty.t (Lcom/finalshell/crypto/ConnectHost;)V
      // 106: new com/finalshell/core/Cp4
      // 109: dup
      // 10a: aload 4
      // 10c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 10f: ldc2_w 380415140795833934
      // 112: astore 19
      // 114: astore 18
      // 116: ldc2_w 380415140795833934
      // 119: aload 18
      // 11b: aload 19
      // 11d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 120: checkcast java/lang/String
      // 123: goto 12a
      // 126: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 129: athrow
      // 12a: aload 4
      // 12c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 12f: ldc2_w 255354522009994316
      // 132: astore 21
      // 134: astore 20
      // 136: ldc2_w 255354522009994316
      // 139: aload 20
      // 13b: aload 21
      // 13d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 140: checkcast java/lang/Integer
      // 143: invokevirtual java/lang/Integer.intValue ()I
      // 146: goto 14d
      // 149: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: aload 4
      // 14f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 152: ldc2_w 255973732097233937
      // 155: astore 23
      // 157: astore 22
      // 159: ldc2_w 255973732097233937
      // 15c: aload 22
      // 15e: aload 23
      // 160: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 163: checkcast java/lang/String
      // 166: goto 16d
      // 169: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 16c: athrow
      // 16d: aload 4
      // 16f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 172: ldc2_w 195538594886366540
      // 175: astore 25
      // 177: astore 24
      // 179: ldc2_w 195538594886366540
      // 17c: aload 24
      // 17e: aload 25
      // 180: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 183: checkcast java/lang/String
      // 186: goto 18d
      // 189: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 18c: athrow
      // 18d: aload 4
      // 18f: invokespecial com/finalshell/core/Cp4.<init> (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/finalshell/core/Lv4_2;)V
      // 192: astore 6
      // 194: aload 3
      // 195: aload 6
      // 197: invokevirtual com/finalshell/ui/panel/ConnectionProperty.f (Lcom/finalshell/core/Fv2_2;)Lcom/finalshell/ui/panel/ConnectionProperty;
      // 19a: astore 7
      // 19c: bipush 0
      // 19d: istore 8
      // 19f: iload 8
      // 1a1: sipush 32341
      // 1a4: ldc2_w 9193618709285250742
      // 1a7: invokestatic com/finalshell/ui/frame/U.a (IJ)I
      // 1aa: if_icmpge 1ec
      // 1ad: aload 1
      // 1ae: aload 2
      // 1af: ifnonnull 1ee
      // 1b2: invokevirtual com/finalshell/ui/panel/ConnectionProperty.s$Fv_2 ()Lcom/finalshell/core/Fv2_2;
      // 1b5: invokeinterface com/finalshell/core/Fv2_2.K ()Z 1
      // 1ba: ifeq 1cf
      // 1bd: goto 1c4
      // 1c0: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c3: athrow
      // 1c4: aload 2
      // 1c5: ifnull 1ec
      // 1c8: goto 1cf
      // 1cb: invokestatic com/finalshell/ui/frame/U.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ce: athrow
      // 1cf: sipush 2654
      // 1d2: ldc2_w 4065653079701705777
      // 1d5: invokestatic com/finalshell/ui/frame/U.b (IJ)J
      // 1d8: invokestatic java/lang/Thread.sleep (J)V
      // 1db: goto 1e5
      // 1de: astore 9
      // 1e0: aload 9
      // 1e2: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 1e5: iinc 8 1
      // 1e8: aload 2
      // 1e9: ifnull 19f
      // 1ec: aload 7
      // 1ee: bipush -1
      // 1ef: invokeinterface com/finalshell/core/W82.N (I)V 2
      // 1f4: return
   }

   public F8 q() {
      Object var1 = 395703699466617837L;
      return (F8)Ref.g(395703699466617837L, var1);
   }

   public void Y(F8 var1) {
      long var3 = 395703699466617837L;
      Ref.s(395703699466617837L, var1, var3);
   }

   public ConnectionProperty n$_y_2() {
      Object var1 = 208444474277099894L;
      return (ConnectionProperty)Ref.g(208444474277099894L, var1);
   }

   public NetworkMonitorPanel D$aj_2() {
      Object var1 = 498692346592337143L;
      return (NetworkMonitorPanel)Ref.g(498692346592337143L, var1);
   }

   public void c(NetworkMonitorPanel var1) {
      long var3 = 498692346592337143L;
      Ref.s(498692346592337143L, var1, var3);
   }

   @Override
   public void K(Y9 var1) {
   }

   @Override
   public void D(Y9 var1) {
   }

   public U1 D$U1() {
      Object var1 = 408335381065038419L;
      return (U1)Ref.g(408335381065038419L, var1);
   }

   public void Y(U1 var1) {
      long var3 = 408335381065038419L;
      Ref.s(408335381065038419L, var1, var3);
   }

   public boolean o$boolean() {
      return Registry.lookupField(215457793551818098L).getBoolean(this);
   }

   public void g(boolean var1) {
      Registry.lookupField(215457793551818098L).setBoolean(this, var1);
   }

   @Override
   public void O(Ty4 var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 542590257020999358L;
      Object[] var3 = var10001;
      var10001 = Ref.h(542590257020999358L, var3, var4);

      try {
         var10 = (Integer)var10001;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      int var2 = var10;
      if (var2 == Registry.lookupField(146259046198212012L).getInt(null)) {
         Object[] var10002 = Registry.emptyArgs();
         long var6 = 443232666219743263L;
         Object[] var5 = var10002;
         Ref.h(443232666219743263L, var5, var6);

         try {
            ;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }
      }
   }

   public void o$void() {
      Registry.emptyArgs();
      long var2 = 270389152141252877L;
      Ref.h2(270389152141252877L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 163462326892114024L;
      Object[] var4 = var10002;
      Ref.h(163462326892114024L, var4, var5);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 633712494917113170L;
      Object[] var6 = var10003;
      var10003 = Ref.h(633712494917113170L, var6, var7);

      try {
         var25 = (Boolean)var10003;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      boolean var1 = var25;
      Object var8 = 498692346592337143L;
      Ref.g(498692346592337143L, var8);
      Object[] var10005 = Registry.packArgs(var1);
      long var11 = 257224887316492697L;
      Object[] var10 = var10005;
      Ref.h(257224887316492697L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      Registry.lookupField(222367947831078517L).get(null);
      Object[] var10006 = Registry.emptyArgs();
      long var13 = 206313101874916437L;
      Object[] var12 = var10006;
      Ref.h(206313101874916437L, var12, var13);
      Object[] var10007 = Registry.packArgs(var1);
      long var15 = 179143699838950106L;
      Object[] var14 = var10007;
      Ref.h(179143699838950106L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      Registry.lookupField(199832172921665052L).get(null);
      Object[] var10008 = Registry.emptyArgs();
      long var17 = 283087596964075372L;
      Object[] var16 = var10008;
      Ref.h(283087596964075372L, var16, var17);
      Object[] var10009 = Registry.packArgs(var1);
      long var19 = 593429187478510131L;
      Object[] var18 = var10009;
      Ref.h(593429187478510131L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }
   }

   public static JDialog T$JDialog() {
      return (JDialog)Registry.lookupField(245459929255404945L).get(null);
   }

   public static void W(JDialog var0) {
      Registry.lookupField(245459929255404945L).set(null, var0);
   }

   public int d$int() {
      return Registry.lookupField(361734294472086805L).getInt(this);
   }

   public void P(int var1) {
      Registry.lookupField(361734294472086805L).setInt(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static void O(String var0) {
      M = var0;
   }

   public static String N() {
      return M;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 1446) & 65535;
      if (bb[var2] == null) {
         char[] var3 = ab[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 24;
               break;
            case 1:
               var10000 = 125;
               break;
            case 2:
               var10000 = 112;
               break;
            case 3:
               var10000 = 193;
               break;
            case 4:
               var10000 = 111;
               break;
            case 5:
               var10000 = 158;
               break;
            case 6:
               var10000 = 203;
               break;
            case 7:
               var10000 = 117;
               break;
            case 8:
               var10000 = 25;
               break;
            case 9:
               var10000 = 147;
               break;
            case 10:
               var10000 = 202;
               break;
            case 11:
               var10000 = 63;
               break;
            case 12:
               var10000 = 28;
               break;
            case 13:
               var10000 = 90;
               break;
            case 14:
               var10000 = 89;
               break;
            case 15:
               var10000 = 151;
               break;
            case 16:
               var10000 = 221;
               break;
            case 17:
               var10000 = 212;
               break;
            case 18:
               var10000 = 157;
               break;
            case 19:
               var10000 = 234;
               break;
            case 20:
               var10000 = 233;
               break;
            case 21:
               var10000 = 62;
               break;
            case 22:
               var10000 = 107;
               break;
            case 23:
               var10000 = 167;
               break;
            case 24:
               var10000 = 81;
               break;
            case 25:
               var10000 = 169;
               break;
            case 26:
               var10000 = 35;
               break;
            case 27:
               var10000 = 177;
               break;
            case 28:
               var10000 = 127;
               break;
            case 29:
               var10000 = 20;
               break;
            case 30:
               var10000 = 227;
               break;
            case 31:
               var10000 = 38;
               break;
            case 32:
               var10000 = 21;
               break;
            case 33:
               var10000 = 144;
               break;
            case 34:
               var10000 = 27;
               break;
            case 35:
               var10000 = 156;
               break;
            case 36:
               var10000 = 75;
               break;
            case 37:
               var10000 = 192;
               break;
            case 38:
               var10000 = 131;
               break;
            case 39:
               var10000 = 180;
               break;
            case 40:
               var10000 = 58;
               break;
            case 41:
               var10000 = 34;
               break;
            case 42:
               var10000 = 2;
               break;
            case 43:
               var10000 = 94;
               break;
            case 44:
               var10000 = 141;
               break;
            case 45:
               var10000 = 4;
               break;
            case 46:
               var10000 = 250;
               break;
            case 47:
               var10000 = 210;
               break;
            case 48:
               var10000 = 216;
               break;
            case 49:
               var10000 = 15;
               break;
            case 50:
               var10000 = 201;
               break;
            case 51:
               var10000 = 254;
               break;
            case 52:
               var10000 = 189;
               break;
            case 53:
               var10000 = 162;
               break;
            case 54:
               var10000 = 106;
               break;
            case 55:
               var10000 = 1;
               break;
            case 56:
               var10000 = 61;
               break;
            case 57:
               var10000 = 199;
               break;
            case 58:
               var10000 = 255;
               break;
            case 59:
               var10000 = 247;
               break;
            case 60:
               var10000 = 244;
               break;
            case 61:
               var10000 = 214;
               break;
            case 62:
               var10000 = 48;
               break;
            case 63:
               var10000 = 47;
               break;
            case 64:
               var10000 = 128;
               break;
            case 65:
               var10000 = 225;
               break;
            case 66:
               var10000 = 230;
               break;
            case 67:
               var10000 = 86;
               break;
            case 68:
               var10000 = 93;
               break;
            case 69:
               var10000 = 171;
               break;
            case 70:
               var10000 = 3;
               break;
            case 71:
               var10000 = 217;
               break;
            case 72:
               var10000 = 101;
               break;
            case 73:
               var10000 = 198;
               break;
            case 74:
               var10000 = 54;
               break;
            case 75:
               var10000 = 78;
               break;
            case 76:
               var10000 = 6;
               break;
            case 77:
               var10000 = 163;
               break;
            case 78:
               var10000 = 11;
               break;
            case 79:
               var10000 = 70;
               break;
            case 80:
               var10000 = 12;
               break;
            case 81:
               var10000 = 114;
               break;
            case 82:
               var10000 = 59;
               break;
            case 83:
               var10000 = 115;
               break;
            case 84:
               var10000 = 87;
               break;
            case 85:
               var10000 = 186;
               break;
            case 86:
               var10000 = 239;
               break;
            case 87:
               var10000 = 248;
               break;
            case 88:
               var10000 = 46;
               break;
            case 89:
               var10000 = 240;
               break;
            case 90:
               var10000 = 69;
               break;
            case 91:
               var10000 = 31;
               break;
            case 92:
               var10000 = 146;
               break;
            case 93:
               var10000 = 105;
               break;
            case 94:
               var10000 = 17;
               break;
            case 95:
               var10000 = 99;
               break;
            case 96:
               var10000 = 10;
               break;
            case 97:
               var10000 = 209;
               break;
            case 98:
               var10000 = 243;
               break;
            case 99:
               var10000 = 43;
               break;
            case 100:
               var10000 = 66;
               break;
            case 101:
               var10000 = 161;
               break;
            case 102:
               var10000 = 68;
               break;
            case 103:
               var10000 = 33;
               break;
            case 104:
               var10000 = 205;
               break;
            case 105:
               var10000 = 170;
               break;
            case 106:
               var10000 = 118;
               break;
            case 107:
               var10000 = 238;
               break;
            case 108:
               var10000 = 142;
               break;
            case 109:
               var10000 = 116;
               break;
            case 110:
               var10000 = 132;
               break;
            case 111:
               var10000 = 168;
               break;
            case 112:
               var10000 = 229;
               break;
            case 113:
               var10000 = 109;
               break;
            case 114:
               var10000 = 100;
               break;
            case 115:
               var10000 = 29;
               break;
            case 116:
               var10000 = 119;
               break;
            case 117:
               var10000 = 220;
               break;
            case 118:
               var10000 = 154;
               break;
            case 119:
               var10000 = 231;
               break;
            case 120:
               var10000 = 152;
               break;
            case 121:
               var10000 = 174;
               break;
            case 122:
               var10000 = 184;
               break;
            case 123:
               var10000 = 153;
               break;
            case 124:
               var10000 = 44;
               break;
            case 125:
               var10000 = 49;
               break;
            case 126:
               var10000 = 18;
               break;
            case 127:
               var10000 = 72;
               break;
            case 128:
               var10000 = 102;
               break;
            case 129:
               var10000 = 120;
               break;
            case 130:
               var10000 = 74;
               break;
            case 131:
               var10000 = 148;
               break;
            case 132:
               var10000 = 9;
               break;
            case 133:
               var10000 = 224;
               break;
            case 134:
               var10000 = 139;
               break;
            case 135:
               var10000 = 126;
               break;
            case 136:
               var10000 = 30;
               break;
            case 137:
               var10000 = 52;
               break;
            case 138:
               var10000 = 60;
               break;
            case 139:
               var10000 = 79;
               break;
            case 140:
               var10000 = 206;
               break;
            case 141:
               var10000 = 5;
               break;
            case 142:
               var10000 = 197;
               break;
            case 143:
               var10000 = 22;
               break;
            case 144:
               var10000 = 82;
               break;
            case 145:
               var10000 = 194;
               break;
            case 146:
               var10000 = 19;
               break;
            case 147:
               var10000 = 91;
               break;
            case 148:
               var10000 = 173;
               break;
            case 149:
               var10000 = 0;
               break;
            case 150:
               var10000 = 175;
               break;
            case 151:
               var10000 = 71;
               break;
            case 152:
               var10000 = 50;
               break;
            case 153:
               var10000 = 179;
               break;
            case 154:
               var10000 = 166;
               break;
            case 155:
               var10000 = 232;
               break;
            case 156:
               var10000 = 159;
               break;
            case 157:
               var10000 = 183;
               break;
            case 158:
               var10000 = 164;
               break;
            case 159:
               var10000 = 155;
               break;
            case 160:
               var10000 = 108;
               break;
            case 161:
               var10000 = 123;
               break;
            case 162:
               var10000 = 228;
               break;
            case 163:
               var10000 = 37;
               break;
            case 164:
               var10000 = 246;
               break;
            case 165:
               var10000 = 136;
               break;
            case 166:
               var10000 = 211;
               break;
            case 167:
               var10000 = 222;
               break;
            case 168:
               var10000 = 88;
               break;
            case 169:
               var10000 = 223;
               break;
            case 170:
               var10000 = 252;
               break;
            case 171:
               var10000 = 122;
               break;
            case 172:
               var10000 = 77;
               break;
            case 173:
               var10000 = 241;
               break;
            case 174:
               var10000 = 32;
               break;
            case 175:
               var10000 = 172;
               break;
            case 176:
               var10000 = 185;
               break;
            case 177:
               var10000 = 65;
               break;
            case 178:
               var10000 = 42;
               break;
            case 179:
               var10000 = 96;
               break;
            case 180:
               var10000 = 83;
               break;
            case 181:
               var10000 = 14;
               break;
            case 182:
               var10000 = 135;
               break;
            case 183:
               var10000 = 237;
               break;
            case 184:
               var10000 = 242;
               break;
            case 185:
               var10000 = 51;
               break;
            case 186:
               var10000 = 160;
               break;
            case 187:
               var10000 = 137;
               break;
            case 188:
               var10000 = 39;
               break;
            case 189:
               var10000 = 226;
               break;
            case 190:
               var10000 = 138;
               break;
            case 191:
               var10000 = 133;
               break;
            case 192:
               var10000 = 110;
               break;
            case 193:
               var10000 = 85;
               break;
            case 194:
               var10000 = 56;
               break;
            case 195:
               var10000 = 219;
               break;
            case 196:
               var10000 = 149;
               break;
            case 197:
               var10000 = 143;
               break;
            case 198:
               var10000 = 80;
               break;
            case 199:
               var10000 = 253;
               break;
            case 200:
               var10000 = 150;
               break;
            case 201:
               var10000 = 188;
               break;
            case 202:
               var10000 = 92;
               break;
            case 203:
               var10000 = 55;
               break;
            case 204:
               var10000 = 207;
               break;
            case 205:
               var10000 = 191;
               break;
            case 206:
               var10000 = 165;
               break;
            case 207:
               var10000 = 145;
               break;
            case 208:
               var10000 = 182;
               break;
            case 209:
               var10000 = 57;
               break;
            case 210:
               var10000 = 7;
               break;
            case 211:
               var10000 = 23;
               break;
            case 212:
               var10000 = 103;
               break;
            case 213:
               var10000 = 113;
               break;
            case 214:
               var10000 = 64;
               break;
            case 215:
               var10000 = 76;
               break;
            case 216:
               var10000 = 190;
               break;
            case 217:
               var10000 = 178;
               break;
            case 218:
               var10000 = 40;
               break;
            case 219:
               var10000 = 26;
               break;
            case 220:
               var10000 = 208;
               break;
            case 221:
               var10000 = 121;
               break;
            case 222:
               var10000 = 218;
               break;
            case 223:
               var10000 = 104;
               break;
            case 224:
               var10000 = 196;
               break;
            case 225:
               var10000 = 134;
               break;
            case 226:
               var10000 = 67;
               break;
            case 227:
               var10000 = 236;
               break;
            case 228:
               var10000 = 130;
               break;
            case 229:
               var10000 = 215;
               break;
            case 230:
               var10000 = 195;
               break;
            case 231:
               var10000 = 140;
               break;
            case 232:
               var10000 = 95;
               break;
            case 233:
               var10000 = 53;
               break;
            case 234:
               var10000 = 235;
               break;
            case 235:
               var10000 = 98;
               break;
            case 236:
               var10000 = 187;
               break;
            case 237:
               var10000 = 249;
               break;
            case 238:
               var10000 = 181;
               break;
            case 239:
               var10000 = 8;
               break;
            case 240:
               var10000 = 204;
               break;
            case 241:
               var10000 = 251;
               break;
            case 242:
               var10000 = 245;
               break;
            case 243:
               var10000 = 213;
               break;
            case 244:
               var10000 = 200;
               break;
            case 245:
               var10000 = 73;
               break;
            case 246:
               var10000 = 45;
               break;
            case 247:
               var10000 = 84;
               break;
            case 248:
               var10000 = 16;
               break;
            case 249:
               var10000 = 36;
               break;
            case 250:
               var10000 = 97;
               break;
            case 251:
               var10000 = 41;
               break;
            case 252:
               var10000 = 176;
               break;
            case 253:
               var10000 = 13;
               break;
            case 254:
               var10000 = 124;
               break;
            default:
               var10000 = 129;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         bb[var2] = new String(var3).intern();
      }

      return bb[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22761;
      if (db[var3] == null) {
         db[var3] = (int)(cb[var3] ^ var1);
      }

      return db[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 24172) & 32767;
      if (fb[var3] == null) {
         fb[var3] = eb[var3] ^ var1;
      }

      return fb[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[60];
      int var19 = 0;
      String var18 = "儮尛诼罣\u000eGK=\u0089\u0093nqRg®Î\u008e8\u000e\u0005幌棸a縟稖\u0006繢竓伀畦廣劭\u0006幑觸错願覮凖\b磻孵免閬穾參呤j\u0003俓辅棄$ÞôÄ\u0088E.$iÅ\u009e\u008bB\u0098?\u008dU\u0016L\u0081=óÎ×p&æ1ÞpÝ\u0017(\u009e;ò\u0099\u0002遄颩\u0002政仍\b硵孉农锫穄匳吣t\u0002侅輨\u0004彤遨咅丳\rÂ\u0088\u008dñ\u00852£ð?øÇF\u001b\u0002茣匰H\u008br^±ÜxàÑ\u008c\rGù¿\u008714Ek~¿]c·Àªc*V\u0002\u0089\nz:\u009b{ AºðimzÝ#ð_mzfu|Ä}æ\u009cÙýº1K[1â\"g\u000eK>ãa`'\t©(×\u008eÌ4í_ð\u0002几岩\t¨6\nÐ\u009c%\u001a\b§\u0010åbi¬\u0019Ê ÆM=\u009bÍ\u0090d§Õ\u000e¸ÓÂ\u009al\f\u008e\u001e\u0098'1¿Ç(\u0002族弍\u0004斮乨篡琅\u0005¨í³\tÌ\fªñSSÍ6;7ñàSº\u0007t並瑇杰勒嘯?\u0004救棐笐颮\u0004乔杳寲钐\u0004疾扈寞鑛\nÝ¾¹Ô¥aäÂØ\u001f\u0012éµ\u0083´«Y\u0007Næ¡%'ìV/*lc\u0002涂惔7Î'Æò\u0005a&\u008bÄ´¸Íþg \u0086àð[¥~\n,\u008f\\é®ñ*T¡ªe·8cL\u0088µ\u001d\u0088\u009eèdJºÏVk\u0083\u0095³OÓ@\u0004輠丂暐旾\u0006à\\N`ý=0\u001b\u0001¹¦Vjæ+Öõ\u000bqÎ¿Â=\u001d²\u0000\rýV\u0097\u0004g\u00ad\u0007öÃg\u0080m \u008e&ö\u00063\u00044y\u0096r\u0017*Ùó\u009b06ÛÝW?npëä} ã¿8bd\u0015gy2·9ã\u0089\u0001\u0006Úd\u0010í±Ü;_jâg³ô ú£B\"{¶\u0081\u0007\u0002淨惀0:ïøøà\u001c\u0084.³{Ï\u0012Ã+\u0015HYJ0Ýìã\t\u0010¯(§ù-\u00008i îÚtU\u001fÔ ¢\u0089/P\u009d\u008f]ô\u000bF¼|£p_\u009a\u008a>\u007f~'û\u001e`ÕÑ\u0085¶\u001c\u009c,\u0090Ú³\nÞ\u0019õ\tMè\u008fê|¡á$zG¬~\u0093¢Õ\u0004séÇ\u0094%\u0019à²É¶\rÚ²í\u001d[\u00832\u0093\u0097\u0097z4ïñ³6\u0089ÐÿÃ\u0004謒镼羹穃\u0004\u0093ÚûÖ\u0004辥掃對恠\u0005孒铔笗璫噂\u0005púìÔ«\u0002例梚\u0004也竭咦毬\u0005\u0083z\u0092Äd\u0002枿眔\u000b¶ü\u0006OÂ\u0083í79\u0080c06pBWÜéR¦B²®QÕðV\u0089\u000fÍöÇYËq\u0010M=Çêß\u000bg\u0088\u0091÷\u0082ç#÷\u007fo=p//L\u009dîJ\u0003\u001f;\u0001\u0004ª剷邅U\f\u0011Ö$·#ªæ¤J\u0092$ô\n\u0016\u0007\u0000\u009c¼³H\u0001C\u0013\u0006àENCýY";
      int var20 = "儮尛诼罣\u000eGK=\u0089\u0093nqRg®Î\u008e8\u000e\u0005幌棸a縟稖\u0006繢竓伀畦廣劭\u0006幑觸错願覮凖\b磻孵免閬穾參呤j\u0003俓辅棄$ÞôÄ\u0088E.$iÅ\u009e\u008bB\u0098?\u008dU\u0016L\u0081=óÎ×p&æ1ÞpÝ\u0017(\u009e;ò\u0099\u0002遄颩\u0002政仍\b硵孉农锫穄匳吣t\u0002侅輨\u0004彤遨咅丳\rÂ\u0088\u008dñ\u00852£ð?øÇF\u001b\u0002茣匰H\u008br^±ÜxàÑ\u008c\rGù¿\u008714Ek~¿]c·Àªc*V\u0002\u0089\nz:\u009b{ AºðimzÝ#ð_mzfu|Ä}æ\u009cÙýº1K[1â\"g\u000eK>ãa`'\t©(×\u008eÌ4í_ð\u0002几岩\t¨6\nÐ\u009c%\u001a\b§\u0010åbi¬\u0019Ê ÆM=\u009bÍ\u0090d§Õ\u000e¸ÓÂ\u009al\f\u008e\u001e\u0098'1¿Ç(\u0002族弍\u0004斮乨篡琅\u0005¨í³\tÌ\fªñSSÍ6;7ñàSº\u0007t並瑇杰勒嘯?\u0004救棐笐颮\u0004乔杳寲钐\u0004疾扈寞鑛\nÝ¾¹Ô¥aäÂØ\u001f\u0012éµ\u0083´«Y\u0007Næ¡%'ìV/*lc\u0002涂惔7Î'Æò\u0005a&\u008bÄ´¸Íþg \u0086àð[¥~\n,\u008f\\é®ñ*T¡ªe·8cL\u0088µ\u001d\u0088\u009eèdJºÏVk\u0083\u0095³OÓ@\u0004輠丂暐旾\u0006à\\N`ý=0\u001b\u0001¹¦Vjæ+Öõ\u000bqÎ¿Â=\u001d²\u0000\rýV\u0097\u0004g\u00ad\u0007öÃg\u0080m \u008e&ö\u00063\u00044y\u0096r\u0017*Ùó\u009b06ÛÝW?npëä} ã¿8bd\u0015gy2·9ã\u0089\u0001\u0006Úd\u0010í±Ü;_jâg³ô ú£B\"{¶\u0081\u0007\u0002淨惀0:ïøøà\u001c\u0084.³{Ï\u0012Ã+\u0015HYJ0Ýìã\t\u0010¯(§ù-\u00008i îÚtU\u001fÔ ¢\u0089/P\u009d\u008f]ô\u000bF¼|£p_\u009a\u008a>\u007f~'û\u001e`ÕÑ\u0085¶\u001c\u009c,\u0090Ú³\nÞ\u0019õ\tMè\u008fê|¡á$zG¬~\u0093¢Õ\u0004séÇ\u0094%\u0019à²É¶\rÚ²í\u001d[\u00832\u0093\u0097\u0097z4ïñ³6\u0089ÐÿÃ\u0004謒镼羹穃\u0004\u0093ÚûÖ\u0004辥掃對恠\u0005孒铔笗璫噂\u0005púìÔ«\u0002例梚\u0004也竭咦毬\u0005\u0083z\u0092Äd\u0002枿眔\u000b¶ü\u0006OÂ\u0083í79\u0080c06pBWÜéR¦B²®QÕðV\u0089\u000fÍöÇYËq\u0010M=Çêß\u000bg\u0088\u0091÷\u0082ç#÷\u007fo=p//L\u009dîJ\u0003\u001f;\u0001\u0004ª剷邅U\f\u0011Ö$·#ªæ¤J\u0092$ô\n\u0016\u0007\u0000\u009c¼³H\u0001C\u0013\u0006àENCýY"
         .length();
      char var17 = 4;
      int var34 = -1;
      O(null);

      label88:
      while (true) {
         byte var10000 = 101;
         String var10001 = var18.substring(++var34, var34 + var17);
         byte var10002 = -1;

         while (true) {
      long var54;
            label83: {
               char[] var62 = var10001.toCharArray();
               int var10004 = var62.length;
               int var22 = 0;
               byte var65 = var10000;
               var54 = var62;
               int var42 = var10004;
               byte var74;
               char[] var83;
               int var10006;
               if (var10004 <= 1) {
                  var83 = var62;
                  var74 = var10000;
                  var10006 = var22;
               } else {
                  var65 = var10000;
                  var42 = var10004;
                  if (var10004 <= var22) {
                     break label83;
                  }

                  var83 = var62;
                  var74 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var92 = var83[var10006];
                  byte var93;
                  switch (var22 % 7) {
                     case 0:
                        var93 = 114;
                        break;
                     case 1:
                        var93 = 102;
                        break;
                     case 2:
                        var93 = 101;
                        break;
                     case 3:
                        var93 = 35;
                        break;
                     case 4:
                        var93 = 56;
                        break;
                     case 5:
                        var93 = 72;
                        break;
                     default:
                        var93 = 23;
                  }

                  var83[var10006] = (char)(var92 ^ var74 ^ var93);
                  var22++;
                  if (var65 == 0) {
                     var10006 = var65;
                     var83 = var54;
                     var74 = var65;
                  } else {
                     if (var42 <= var22) {
                        break;
                     }

                     var83 = var54;
                     var74 = var65;
                     var10006 = var22;
                  }
               }
            }

            String var67 = new String(var54).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var67;
                  if ((var34 += var17) >= var20) {
                     ab = var21;
                     bb = new String[60];
                     long var8 = 1863692338662630556L;
                     long[] var14 = new long[22];
                     int var11 = 0;
                     String var12 = "`\u009a\f\u00036ìh¤'RTTÁ»úd\u0005êÌ¼Ñã%ù\u008b\u009c\u0089&c\u0094%ÿËÝÿÀÊà]DÕVjÃ±ðkäi7åCB'Ò\u0090\u008fÁx\u0019ùáì\u0014\u000e4Áúúö¥«ÁeV&'ä8w\u000f)¤õ_ÏAÂ_Ðì4P\u00951\u0002Nö`}\r®\\»q]ÿ\u0084òÖ¬\u0094:\u008b\u001e¹KCð*ÅV\u009a\\lþ:\u001bt[½\u001cÆ©\u0019\u00856@Ûö>2ÿ#mk{·Á¾U`Ä\u00161\u009d\u0096KHÛ";
                     int var13 = "`\u009a\f\u00036ìh¤'RTTÁ»úd\u0005êÌ¼Ñã%ù\u008b\u009c\u0089&c\u0094%ÿËÝÿÀÊà]DÕVjÃ±ðkäi7åCB'Ò\u0090\u008fÁx\u0019ùáì\u0014\u000e4Áúúö¥«ÁeV&'ä8w\u000f)¤õ_ÏAÂ_Ðì4P\u00951\u0002Nö`}\r®\\»q]ÿ\u0084òÖ¬\u0094:\u008b\u001e¹KCð*ÅV\u009a\\lþ:\u001bt[½\u001cÆ©\u0019\u00856@Ûö>2ÿ#mk{·Á¾U`Ä\u00161\u009d\u0096KHÛ"
                        .length();
                     byte var10 = 0;

                     label62:
                     while (true) {
                        byte var44 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var44, var10).getBytes("ISO-8859-1");
                        long[] var36 = var14;
                        int var45 = var11++;
                        long var58 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var68 = -1;

                        while (true) {
                           long var79 = var58 ^ var8;
                           switch (var68) {
                              case 0:
                                 var36[var45] = var79;
                                 if (var10 >= var13) {
                                    cb = var14;
                                    db = new Integer[22];
                                    long var0 = 4248027791631800568L;
                                    long[] var6 = new long[5];
                                    int var3 = 0;
                                    String var4 = "<&\u0096\u0001^-\u001dÛ\u000b+Æ<jHîM¯ï\u009fa6HÕÅ";
                                    int var5 = "<&\u0096\u0001^-\u001dÛ\u000b+Æ<jHîM¯ï\u009fa6HÕÅ".length();
                                    byte var2 = 0;

                                    label52:
                                    while (true) {
                                       byte var47 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
                                       long[] var37 = var6;
                                       int var48 = var3++;
                                       long var60 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var70 = -1;

                                       while (true) {
                                          var79 = var60 ^ var0;
                                          switch (var70) {
                                             case 0:
                                                var37[var48] = var79;
                                                if (var2 >= var5) {
                                                   eb = var6;
                                                   fb = new Long[5];
                                                   m = new HashMap();
                                                   Registry.packArgs(a(1426, -20469));
                                                   long var23 = 517287540690064504L;
                                                   Registry.lookupField(420455465341613887L).set(null, Ref.h2(517287540690064504L, var23));
                                                   Registry.packArgs(a(1410, 10741));
                                                   long var25 = 517287540690064504L;
                                                   Registry.lookupField(204284935306083361L).set(null, Ref.h2(517287540690064504L, var25));
                                                   Registry.packArgs(a(1413, -28311));
                                                   long var27 = 517287540690064504L;
                                                   Registry.lookupField(127034442177009153L).set(null, Ref.h2(517287540690064504L, var27));
                                                   Registry.lookupField(388376917454860932L).get(null);
                                                   Object[] var82 = Registry.packArgs(new C3(), a(32341, 9193618709285250742L));
                                                   long var30 = 201859364639460244L;
                                                   Object[] var29 = var82;
                                                   Ref.h(201859364639460244L, var29, var30);
                                                   Registry.lookupField(383251759444111355L).setLong(null, 0L);
                                                   return;
                                                }
                                                break;
                                             default:
                                                var37[var48] = var79;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "\u0002\u0098\u001f+\u0097¤\u008cõV\u0011ÿ\\JÍ\u001d\u0087";
                                                var5 = "\u0002\u0098\u001f+\u0097¤\u008cõV\u0011ÿ\\JÍ\u001d\u0087".length();
                                                var2 = 0;
                                          }

                                          byte var49 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var49, var2).getBytes("ISO-8859-1");
                                          var37 = var6;
                                          var48 = var3++;
                                          var60 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var70 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var36[var45] = var79;
                                 if (var10 < var13) {
                                    continue label62;
                                 }

                                 var12 = "åK¼\u0096Ñ(Ê\u007f\u0013Þq°]\u000f¹o";
                                 var13 = "åK¼\u0096Ñ(Ê\u007f\u0013Þq°]\u000f¹o".length();
                                 var10 = 0;
                           }

                           byte var46 = var10;
                           var10 += 8;
                           var15 = var12.substring(var46, var10).getBytes("ISO-8859-1");
                           var36 = var14;
                           var45 = var11++;
                           var58 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var68 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var34);
                  break;
               default:
                  var21[var19++] = var67;
                  if ((var34 += var17) < var20) {
                     var17 = var18.charAt(var34);
                     continue label88;
                  }

                  var18 = "帆务\u0002郲処";
                  var20 = "帆务\u0002郲処".length();
                  var17 = 2;
                  var34 = -1;
            }

            var10000 = 115;
            var10001 = var18.substring(++var34, var34 + var17);
            var10002 = 0;
         }
      }
   }
}





