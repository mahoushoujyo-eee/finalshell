package com.finalshell.ui.panel;

import com.finalshell.core.C;
import com.finalshell.core.Km2;
import com.finalshell.core.Td4;
import com.finalshell.core.Uf4;
import com.finalshell.core.Zv2_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.Gz2;
import com.finalshell.ui.listener.LG;
import com.finalshell.ui.listener.Lw2;
import com.finalshell.ui.listener.Oq4;
import com.finalshell.ui.listener.TA;
import com.finalshell.ui.model.Tf4;
import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

public class PathPanel extends JPanel implements Td4 {
   public JPanel h;
   public JTextField C;
   public ConnectionInfoPanel w;
   public JPanel K;
   public Km2 u;
   public com.finalshell.ui.model.Kl4 o;
   public LoadingPanel Y;
   public ArrayList y;
   public String x;
   public String J;
   public int k;
   public Zv2_2 b;
   public boolean c;
   public static String[] a;
   public static String[] d;
   public static long[] e;
   public static Integer[] f;

   public PathPanel(int var1) {
      this(var1, null, false);
   }

   public PathPanel(int var1, Zv2_2 var2, boolean var3) {
      ArrayList var10001 = new ArrayList();
      long var5 = 450621661109313877L;
      ArrayList var4 = var10001;
      Ref.s(450621661109313877L, var4, var5);
      long var7 = 249999464528804374L;
      Object var6 = null;
      Ref.s(249999464528804374L, var6, var7);
      Registry.lookupField(464038983016865223L).setBoolean(this, var3);
      long var9 = 199098042270422744L;
      Ref.s(199098042270422744L, var2, var9);
      Registry.lookupField(403162208242956478L).setInt(this, var1);
      Object[] var10004 = Registry.emptyArgs();
      long var11 = 536429010661993053L;
      Object[] var10 = var10004;
      Ref.h(536429010661993053L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }

   public void b() {
      this.setLayout(new MigLayout(a(-29541, 6200), "", ""));
      this.setOpaque(false);
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 462689362330284318L;
      Object[] var1 = var10001;
      Ref.h(462689362330284318L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void p(String var1, boolean var2, boolean var3) {
      Object var4 = 294487557435087442L;
      Ref.g(294487557435087442L, var4);
      Object[] var10002 = Registry.packArgs(var1, var2, var3);
      long var7 = 413727787977868950L;
      Object[] var6 = var10002;
      Ref.h(413727787977868950L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public void i(String var1) {
      JTextField var2;
      String var3;
      label23: {
         FileBrowserAddressBar.g();
         long var5 = 291327501867436911L;
         Ref.s(291327501867436911L, var1, var5);
         Object var6 = 626158744249045388L;
         ((JTextField)Ref.g(626158744249045388L, var6)).setText(var1);
         Object var8 = 626158744249045388L;
         JTextField var10004 = (JTextField)Ref.g(626158744249045388L, var8);
         Object var10 = 626158744249045388L;
         this.setCaretPosition(((JTextField)Ref.g(626158744249045388L, var10)).getDocument().getLength());
         var3 = null;
         var2 = var10004;
         Object var12 = 450621661109313877L;
         Object var10005 = (ArrayList)Ref.g(450621661109313877L, var12);
         if (var2 == null) {
            if (var10005.size() <= 0) {
               break label23;
            }

            var10005 = this;
            Object var14 = 450621661109313877L;
            ArrayList var10006 = (ArrayList)Ref.g(450621661109313877L, var14);
            Object var16 = 450621661109313877L;
            this.get(((ArrayList)Ref.g(450621661109313877L, var16)).size() - 1);
         }

         var3 = (String)var10005;
      }

      if (var2 == null && !var1.equals(var3)) {
         Object var18 = 450621661109313877L;
         ((ArrayList)Ref.g(450621661109313877L, var18)).add(var1);
      }
   }

   public void h$void() {
      long var32;
      JPanel var10001 = new JPanel();
      long var7 = 300027703367967316L;
      JPanel var6 = var10001;
      Ref.s(300027703367967316L, var6, var7);
      Object var8 = 300027703367967316L;
      ((JPanel)Ref.g(300027703367967316L, var8)).setOpaque(false);
      Object var10 = 300027703367967316L;
      this.add((JPanel)Ref.g(300027703367967316L, var10), a(-29543, 26662));
      Object var12 = 300027703367967316L;
      ((JPanel)Ref.g(300027703367967316L, var12)).setLayout(new MigLayout(a(-29544, -3575), "", a(-29539, -22682)));
      JPanel var10005 = new JPanel();
      long var15 = 497237436534330041L;
      JPanel var14 = var10005;
      Ref.s(497237436534330041L, var14, var15);
      Object var16 = 497237436534330041L;
      ((JPanel)Ref.g(497237436534330041L, var16)).setLayout(new MigLayout(a(-29538, 5498)));
      Object var18 = 497237436534330041L;
      ((JPanel)Ref.g(497237436534330041L, var18)).add(new JLabel(a(-29537, -350)));
      Registry.packArgs("\uf021");
      long var20 = 378399160856121064L;
      Object var10008 = Ref.h2(378399160856121064L, var20);

      try {
         var10008 = (C)var10008;
      } catch (InvocationTargetException var114) {
         throw var114.getTargetException();
      }

      C var1 = (C)var10008;
      var1.addActionListener(new TA(this, var1));
      JTextField var10009 = new JTextField();
      long var23 = 626158744249045388L;
      JTextField var22 = var10009;
      Ref.s(626158744249045388L, var22, var23);
      Object var24 = 497237436534330041L;
      JPanel var10010 = (JPanel)Ref.g(497237436534330041L, var24);
      Object var26 = 626158744249045388L;
      this.add((JTextField)Ref.g(626158744249045388L, var26), a(-29540, -7272));
      Object var28 = 626158744249045388L;
      ((JTextField)Ref.g(626158744249045388L, var28)).addKeyListener(new LG(this));
      Object var30 = 626158744249045388L;
      ((JTextField)Ref.g(626158744249045388L, var30)).addFocusListener(new Oq4(this));
      Registry.packArgs("\uf148");
      var32 = 378399160856121064L;
      Object var10014 = Ref.h2(378399160856121064L, var32);

      try {
         var10014 = (C)var10014;
      } catch (InvocationTargetException var113) {
         throw var113.getTargetException();
      }

      C var2 = (C)var10014;
      Object var34 = 497237436534330041L;
      ((JPanel)Ref.g(497237436534330041L, var34)).add(var2);
      var2.addActionListener(new Lw2(this));
      JSplitPane var3 = new JSplitPane(1);
      var3.setOpaque(false);
      Object var36 = 300027703367967316L;
      ((JPanel)Ref.g(300027703367967316L, var36)).add(var3, a(-29542, 26060));
      com.finalshell.ui.model.Kl4 var10017 = new com.finalshell.ui.model.Kl4(true);
      long var39 = 215197654066137060L;
      com.finalshell.ui.model.Kl4 var38 = var10017;
      Ref.s(215197654066137060L, var38, var39);
      Object var40 = 215197654066137060L;
      Ref.g(215197654066137060L, var40);
      Object[] var10019 = Registry.packArgs(Registry.lookupField(403162208242956478L).getInt(this));
      long var43 = 388120151393686609L;
      Object[] var42 = var10019;
      Ref.h(388120151393686609L, var42, var43);

      try {
         ;
      } catch (InvocationTargetException var112) {
         throw var112.getTargetException();
      }

      Object var44 = 215197654066137060L;
      Ref.g(215197654066137060L, var44);
      Object[] var10021 = Registry.packArgs(false);
      long var47 = 579859854786904790L;
      Object[] var46 = var10021;
      Ref.h(579859854786904790L, var46, var47);

      try {
         ;
      } catch (InvocationTargetException var111) {
         throw var111.getTargetException();
      }

      Object var48 = 215197654066137060L;
      Ref.g(215197654066137060L, var48);
      Object var50 = 199098042270422744L;
      Object[] var10024 = Registry.packArgs(Ref.g(199098042270422744L, var50));
      long var53 = 530612296803885459L;
      Object[] var52 = var10024;
      Ref.h(530612296803885459L, var52, var53);

      try {
         ;
      } catch (InvocationTargetException var110) {
         throw var110.getTargetException();
      }

      ConnectionInfoPanel var10026;
      Object var54 = 215197654066137060L;
true = new TA((boolean)this, (com.finalshell.ui.model.Kl4)Ref.g(215197654066137060L, var54));
      long var57 = 294487557435087442L;
      ConnectionInfoPanel var56 = var10026;
      Ref.s(294487557435087442L, var56, var57);
      Object var58 = 294487557435087442L;
      ((ConnectionInfoPanel)Ref.g(294487557435087442L, var58)).setDragEnabled(false);
      Object var60 = 294487557435087442L;
      ((ConnectionInfoPanel)Ref.g(294487557435087442L, var60)).setEditable(false);
      Object var62 = 294487557435087442L;
      Ref.g(294487557435087442L, var62);
      Object[] var10030 = Registry.packArgs(false);
      long var65 = 167604273003001173L;
      Object[] var64 = var10030;
      Ref.h(167604273003001173L, var64, var65);

      try {
         ;
      } catch (InvocationTargetException var109) {
         throw var109.getTargetException();
      }

      Km2 var10032;
      Object var66 = 294487557435087442L;
null = new MigLayout(this, (ConnectionInfoPanel)Ref.g(294487557435087442L, var66), Registry.lookupField(464038983016865223L).getBoolean(this));


      long var69 = 427789642816905166L;
      Km2 var68 = var10032;
      Ref.s(427789642816905166L, var68, var69);
      Object var70 = 427789642816905166L;
      ((Km2)Ref.g(427789642816905166L, var70)).setDragEnabled(false);
      Object var72 = 427789642816905166L;
      Ref.g(427789642816905166L, var72);
      Object var74 = 215197654066137060L;
      Object[] var10036 = Registry.packArgs(Ref.g(215197654066137060L, var74));
      long var77 = 518955321372630905L;
      Object[] var76 = var10036;
      Ref.h(518955321372630905L, var76, var77);

      try {
         ;
      } catch (InvocationTargetException var108) {
         throw var108.getTargetException();
      }

      Object var78 = 427789642816905166L;
      Ref.g(427789642816905166L, var78);
      Object[] var10038 = Registry.packArgs(false);
      long var81 = 233644321955391576L;
      Object[] var80 = var10038;
      Ref.h(233644321955391576L, var80, var81);

      try {
         ;
      } catch (InvocationTargetException var107) {
         throw var107.getTargetException();
      }

      Object var82 = 427789642816905166L;
      ((Km2)Ref.g(427789642816905166L, var82)).getTableHeader().setOpaque(false);
      Object var84 = 294487557435087442L;
      Ref.g(294487557435087442L, var84);
      Object[] var10041 = Registry.packArgs(null);
      long var87 = 134852060198148161L;
      Object[] var86 = var10041;
      Ref.h(134852060198148161L, var86, var87);

      try {
         ;
      } catch (InvocationTargetException var106) {
         throw var106.getTargetException();
      }

      JScrollPane var4 = new JScrollPane(null);
      var4.setBorder(BorderFactory.createLineBorder(new Color(a(9928, 8964294156000086783L), a(24779, 1218422891563027709L), a(24779, 1218422891563027709L))));
      Object var88 = 294487557435087442L;
      this.setViewportView((ConnectionInfoPanel)Ref.g(294487557435087442L, var88));
      var4.setOpaque(false);
      var4.getViewport().setOpaque(false);
      var3.setLeftComponent(var4);
      Object var90 = 294487557435087442L;
      Ref.g(294487557435087442L, var90);
      Object[] var10044 = Registry.packArgs(this);
      long var93 = 444737714719139741L;
      Object[] var92 = var10044;
      Ref.h(444737714719139741L, var92, var93);

      try {
         ;
      } catch (InvocationTargetException var105) {
         throw var105.getTargetException();
      }

      Object var94 = 294487557435087442L;
      Ref.g(294487557435087442L, var94);
      Object var96 = 427789642816905166L;
      Object[] var10047 = Registry.packArgs(Ref.g(427789642816905166L, var96));
      long var99 = 403669917970824410L;
      Object[] var98 = var10047;
      Ref.h(403669917970824410L, var98, var99);

      try {
         ;
      } catch (InvocationTargetException var104) {
         throw var104.getTargetException();
      }

      Object var100 = 427789642816905166L;
      ((Km2)Ref.g(427789642816905166L, var100)).setAutoResizeMode(0);
      L4 var10049;
      Object var102 = 427789642816905166L;
      // [VF-super] super(this, (Km2)Ref.g(427789642816905166L, var102));
      L4 var5 = var10049;
      var5.setBorder(BorderFactory.createLineBorder(new Color(a(24779, 1218422891563027709L), a(24779, 1218422891563027709L), a(24779, 1218422891563027709L))));
      var5.setOpaque(false);
      var5.getViewport().setOpaque(false);
      var5.addMouseListener(new Gz2(this));
      var3.setRightComponent(var5);
      var3.setDividerLocation(a(10636, 7686518659151381945L));
      var3.setResizeWeight(0.1F);
   }

   public void J(boolean var1) {
      Object var2 = 309786152565523780L;
      ((LoadingPanel)Ref.g(309786152565523780L, var2)).setVisible(var1);
   }

   @Override
   public void E(Uf4 var1) {
      FileBrowserAddressBar.g();
      Object var10002 = Registry.emptyArgs();
      long var6 = 177073721418864424L;
      Object var5 = var10002;
      var10002 = Ref.h(177073721418864424L, var5, var6);

      try {
         var32 = (Integer)var10002;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      int var3 = var32;
      if (var3 == Registry.lookupField(451440066276164151L).getInt(null)) {
         var10002 = Registry.emptyArgs();
         long var8 = 405617140951858885L;
         Object var7 = var10002;
         var10002 = Ref.h(405617140951858885L, var7, var8);

         try {
            var10002 = (Tf4)var10002;
         } catch (InvocationTargetException var29) {
            throw var29.getTargetException();
         }

         Tf4 var4 = var10002;
         Object var9 = 215197654066137060L;
         Ref.g(215197654066137060L, var9);
         Tf4 var10004 = (Tf4)(Registry.emptyArgs());
         long var12 = 152919711700242153L;
         Object var11 = var10004;
         var10004 = Ref.h(152919711700242153L, var11, var12);

         try {
            var10004 = (Tf4)var10004;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }

         if (var1 == null || var10004 != null) {
            Object[] var10005 = Registry.emptyArgs();
            long var14 = 498856411508641826L;
            Object[] var13 = var10005;
            Ref.h(498856411508641826L, var13, var14);

            try {
               ;
            } catch (InvocationTargetException var27) {
               throw var27.getTargetException();
            }

            Object var15 = 215197654066137060L;
            Ref.g(215197654066137060L, var15);
            Object[] var10008 = Registry.emptyArgs();
            long var18 = 152919711700242153L;
            Object[] var17 = var10008;
            var10008 = Ref.h(152919711700242153L, var17, var18);
            String var10009 = (String)(Registry.emptyArgs());
            long var20 = 498856411508641826L;
            Object var19 = var10009;
            var10009 = Ref.h(498856411508641826L, var19, var20);

            try {
               var10009 = (String)var10009;
            } catch (InvocationTargetException var26) {
               throw var26.getTargetException();
            }

            if (var10008.equals(var10009)) {
               Object var21 = 215197654066137060L;
               Ref.g(215197654066137060L, var21);
               Object[] var10010 = Registry.packArgs(var4);
               long var24 = 217942201414471271L;
               Object[] var23 = var10010;
               Ref.h(217942201414471271L, var23, var24);

               try {
                  ;
               } catch (InvocationTargetException var25) {
                  throw var25.getTargetException();
               }
            }
         }
      }
   }

   public int H() {
      return Registry.lookupField(403162208242956478L).getInt(this);
   }

   public void X(int var1) {
      Registry.lookupField(403162208242956478L).setInt(this, var1);
   }

   public ConnectionInfoPanel h$a3() {
      Object var1 = 294487557435087442L;
      return (ConnectionInfoPanel)Ref.g(294487557435087442L, var1);
   }

   public Km2 V() {
      Object var1 = 427789642816905166L;
      return (Km2)Ref.g(427789642816905166L, var1);
   }

   public com.finalshell.ui.model.Kl4 T() {
      Object var1 = 215197654066137060L;
      return (com.finalshell.ui.model.Kl4)Ref.g(215197654066137060L, var1);
   }

   public boolean L() {
      return Registry.lookupField(464038983016865223L).getBoolean(this);
   }

   public void G(boolean var1) {
      Registry.lookupField(464038983016865223L).setBoolean(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -29538) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 70;
               break;
            case 1:
               var10000 = 224;
               break;
            case 2:
               var10000 = 211;
               break;
            case 3:
               var10000 = 255;
               break;
            case 4:
               var10000 = 113;
               break;
            case 5:
               var10000 = 206;
               break;
            case 6:
               var10000 = 201;
               break;
            case 7:
               var10000 = 246;
               break;
            case 8:
               var10000 = 53;
               break;
            case 9:
               var10000 = 140;
               break;
            case 10:
               var10000 = 200;
               break;
            case 11:
               var10000 = 94;
               break;
            case 12:
               var10000 = 174;
               break;
            case 13:
               var10000 = 82;
               break;
            case 14:
               var10000 = 198;
               break;
            case 15:
               var10000 = 136;
               break;
            case 16:
               var10000 = 74;
               break;
            case 17:
               var10000 = 153;
               break;
            case 18:
               var10000 = 60;
               break;
            case 19:
               var10000 = 122;
               break;
            case 20:
               var10000 = 143;
               break;
            case 21:
               var10000 = 227;
               break;
            case 22:
               var10000 = 177;
               break;
            case 23:
               var10000 = 208;
               break;
            case 24:
               var10000 = 126;
               break;
            case 25:
               var10000 = 77;
               break;
            case 26:
               var10000 = 184;
               break;
            case 27:
               var10000 = 145;
               break;
            case 28:
               var10000 = 175;
               break;
            case 29:
               var10000 = 8;
               break;
            case 30:
               var10000 = 58;
               break;
            case 31:
               var10000 = 204;
               break;
            case 32:
               var10000 = 169;
               break;
            case 33:
               var10000 = 197;
               break;
            case 34:
               var10000 = 27;
               break;
            case 35:
               var10000 = 90;
               break;
            case 36:
               var10000 = 244;
               break;
            case 37:
               var10000 = 111;
               break;
            case 38:
               var10000 = 3;
               break;
            case 39:
               var10000 = 147;
               break;
            case 40:
               var10000 = 46;
               break;
            case 41:
               var10000 = 252;
               break;
            case 42:
               var10000 = 215;
               break;
            case 43:
               var10000 = 91;
               break;
            case 44:
               var10000 = 127;
               break;
            case 45:
               var10000 = 18;
               break;
            case 46:
               var10000 = 73;
               break;
            case 47:
               var10000 = 112;
               break;
            case 48:
               var10000 = 100;
               break;
            case 49:
               var10000 = 34;
               break;
            case 50:
               var10000 = 225;
               break;
            case 51:
               var10000 = 195;
               break;
            case 52:
               var10000 = 25;
               break;
            case 53:
               var10000 = 228;
               break;
            case 54:
               var10000 = 152;
               break;
            case 55:
               var10000 = 79;
               break;
            case 56:
               var10000 = 36;
               break;
            case 57:
               var10000 = 189;
               break;
            case 58:
               var10000 = 32;
               break;
            case 59:
               var10000 = 202;
               break;
            case 60:
               var10000 = 14;
               break;
            case 61:
               var10000 = 183;
               break;
            case 62:
               var10000 = 217;
               break;
            case 63:
               var10000 = 120;
               break;
            case 64:
               var10000 = 40;
               break;
            case 65:
               var10000 = 86;
               break;
            case 66:
               var10000 = 192;
               break;
            case 67:
               var10000 = 237;
               break;
            case 68:
               var10000 = 241;
               break;
            case 69:
               var10000 = 12;
               break;
            case 70:
               var10000 = 179;
               break;
            case 71:
               var10000 = 151;
               break;
            case 72:
               var10000 = 130;
               break;
            case 73:
               var10000 = 10;
               break;
            case 74:
               var10000 = 56;
               break;
            case 75:
               var10000 = 115;
               break;
            case 76:
               var10000 = 98;
               break;
            case 77:
               var10000 = 229;
               break;
            case 78:
               var10000 = 75;
               break;
            case 79:
               var10000 = 141;
               break;
            case 80:
               var10000 = 157;
               break;
            case 81:
               var10000 = 57;
               break;
            case 82:
               var10000 = 210;
               break;
            case 83:
               var10000 = 41;
               break;
            case 84:
               var10000 = 116;
               break;
            case 85:
               var10000 = 187;
               break;
            case 86:
               var10000 = 35;
               break;
            case 87:
               var10000 = 49;
               break;
            case 88:
               var10000 = 33;
               break;
            case 89:
               var10000 = 207;
               break;
            case 90:
               var10000 = 28;
               break;
            case 91:
               var10000 = 245;
               break;
            case 92:
               var10000 = 4;
               break;
            case 93:
               var10000 = 150;
               break;
            case 94:
               var10000 = 239;
               break;
            case 95:
               var10000 = 11;
               break;
            case 96:
               var10000 = 190;
               break;
            case 97:
               var10000 = 128;
               break;
            case 98:
               var10000 = 205;
               break;
            case 99:
               var10000 = 13;
               break;
            case 100:
               var10000 = 15;
               break;
            case 101:
               var10000 = 129;
               break;
            case 102:
               var10000 = 159;
               break;
            case 103:
               var10000 = 220;
               break;
            case 104:
               var10000 = 109;
               break;
            case 105:
               var10000 = 117;
               break;
            case 106:
               var10000 = 154;
               break;
            case 107:
               var10000 = 173;
               break;
            case 108:
               var10000 = 138;
               break;
            case 109:
               var10000 = 1;
               break;
            case 110:
               var10000 = 59;
               break;
            case 111:
               var10000 = 249;
               break;
            case 112:
               var10000 = 250;
               break;
            case 113:
               var10000 = 93;
               break;
            case 114:
               var10000 = 106;
               break;
            case 115:
               var10000 = 68;
               break;
            case 116:
               var10000 = 55;
               break;
            case 117:
               var10000 = 235;
               break;
            case 118:
               var10000 = 156;
               break;
            case 119:
               var10000 = 26;
               break;
            case 120:
               var10000 = 7;
               break;
            case 121:
               var10000 = 95;
               break;
            case 122:
               var10000 = 135;
               break;
            case 123:
               var10000 = 149;
               break;
            case 124:
               var10000 = 132;
               break;
            case 125:
               var10000 = 248;
               break;
            case 126:
               var10000 = 62;
               break;
            case 127:
               var10000 = 131;
               break;
            case 128:
               var10000 = 233;
               break;
            case 129:
               var10000 = 9;
               break;
            case 130:
               var10000 = 97;
               break;
            case 131:
               var10000 = 67;
               break;
            case 132:
               var10000 = 118;
               break;
            case 133:
               var10000 = 107;
               break;
            case 134:
               var10000 = 234;
               break;
            case 135:
               var10000 = 66;
               break;
            case 136:
               var10000 = 163;
               break;
            case 137:
               var10000 = 80;
               break;
            case 138:
               var10000 = 238;
               break;
            case 139:
               var10000 = 155;
               break;
            case 140:
               var10000 = 199;
               break;
            case 141:
               var10000 = 96;
               break;
            case 142:
               var10000 = 110;
               break;
            case 143:
               var10000 = 166;
               break;
            case 144:
               var10000 = 168;
               break;
            case 145:
               var10000 = 170;
               break;
            case 146:
               var10000 = 186;
               break;
            case 147:
               var10000 = 193;
               break;
            case 148:
               var10000 = 142;
               break;
            case 149:
               var10000 = 223;
               break;
            case 150:
               var10000 = 92;
               break;
            case 151:
               var10000 = 162;
               break;
            case 152:
               var10000 = 214;
               break;
            case 153:
               var10000 = 247;
               break;
            case 154:
               var10000 = 232;
               break;
            case 155:
               var10000 = 212;
               break;
            case 156:
               var10000 = 172;
               break;
            case 157:
               var10000 = 76;
               break;
            case 158:
               var10000 = 251;
               break;
            case 159:
               var10000 = 47;
               break;
            case 160:
               var10000 = 161;
               break;
            case 161:
               var10000 = 134;
               break;
            case 162:
               var10000 = 83;
               break;
            case 163:
               var10000 = 45;
               break;
            case 164:
               var10000 = 242;
               break;
            case 165:
               var10000 = 230;
               break;
            case 166:
               var10000 = 19;
               break;
            case 167:
               var10000 = 209;
               break;
            case 168:
               var10000 = 48;
               break;
            case 169:
               var10000 = 72;
               break;
            case 170:
               var10000 = 64;
               break;
            case 171:
               var10000 = 5;
               break;
            case 172:
               var10000 = 54;
               break;
            case 173:
               var10000 = 84;
               break;
            case 174:
               var10000 = 146;
               break;
            case 175:
               var10000 = 243;
               break;
            case 176:
               var10000 = 222;
               break;
            case 177:
               var10000 = 139;
               break;
            case 178:
               var10000 = 176;
               break;
            case 179:
               var10000 = 160;
               break;
            case 180:
               var10000 = 108;
               break;
            case 181:
               var10000 = 6;
               break;
            case 182:
               var10000 = 52;
               break;
            case 183:
               var10000 = 231;
               break;
            case 184:
               var10000 = 164;
               break;
            case 185:
               var10000 = 253;
               break;
            case 186:
               var10000 = 148;
               break;
            case 187:
               var10000 = 0;
               break;
            case 188:
               var10000 = 119;
               break;
            case 189:
               var10000 = 103;
               break;
            case 190:
               var10000 = 22;
               break;
            case 191:
               var10000 = 39;
               break;
            case 192:
               var10000 = 31;
               break;
            case 193:
               var10000 = 124;
               break;
            case 194:
               var10000 = 16;
               break;
            case 195:
               var10000 = 185;
               break;
            case 196:
               var10000 = 43;
               break;
            case 197:
               var10000 = 21;
               break;
            case 198:
               var10000 = 71;
               break;
            case 199:
               var10000 = 191;
               break;
            case 200:
               var10000 = 165;
               break;
            case 201:
               var10000 = 20;
               break;
            case 202:
               var10000 = 99;
               break;
            case 203:
               var10000 = 236;
               break;
            case 204:
               var10000 = 65;
               break;
            case 205:
               var10000 = 61;
               break;
            case 206:
               var10000 = 51;
               break;
            case 207:
               var10000 = 203;
               break;
            case 208:
               var10000 = 104;
               break;
            case 209:
               var10000 = 24;
               break;
            case 210:
               var10000 = 218;
               break;
            case 211:
               var10000 = 87;
               break;
            case 212:
               var10000 = 182;
               break;
            case 213:
               var10000 = 181;
               break;
            case 214:
               var10000 = 23;
               break;
            case 215:
               var10000 = 44;
               break;
            case 216:
               var10000 = 125;
               break;
            case 217:
               var10000 = 221;
               break;
            case 218:
               var10000 = 196;
               break;
            case 219:
               var10000 = 101;
               break;
            case 220:
               var10000 = 89;
               break;
            case 221:
               var10000 = 88;
               break;
            case 222:
               var10000 = 133;
               break;
            case 223:
               var10000 = 171;
               break;
            case 224:
               var10000 = 105;
               break;
            case 225:
               var10000 = 38;
               break;
            case 226:
               var10000 = 178;
               break;
            case 227:
               var10000 = 123;
               break;
            case 228:
               var10000 = 78;
               break;
            case 229:
               var10000 = 121;
               break;
            case 230:
               var10000 = 30;
               break;
            case 231:
               var10000 = 29;
               break;
            case 232:
               var10000 = 240;
               break;
            case 233:
               var10000 = 37;
               break;
            case 234:
               var10000 = 85;
               break;
            case 235:
               var10000 = 158;
               break;
            case 236:
               var10000 = 42;
               break;
            case 237:
               var10000 = 254;
               break;
            case 238:
               var10000 = 63;
               break;
            case 239:
               var10000 = 188;
               break;
            case 240:
               var10000 = 2;
               break;
            case 241:
               var10000 = 216;
               break;
            case 242:
               var10000 = 144;
               break;
            case 243:
               var10000 = 219;
               break;
            case 244:
               var10000 = 17;
               break;
            case 245:
               var10000 = 102;
               break;
            case 246:
               var10000 = 81;
               break;
            case 247:
               var10000 = 50;
               break;
            case 248:
               var10000 = 194;
               break;
            case 249:
               var10000 = 180;
               break;
            case 250:
               var10000 = 69;
               break;
            case 251:
               var10000 = 114;
               break;
            case 252:
               var10000 = 213;
               break;
            case 253:
               var10000 = 167;
               break;
            case 254:
               var10000 = 137;
               break;
            default:
               var10000 = 226;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27703;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      String[] var13 = new String[8];
      int var11 = 0;
      String var10 = "\u001dòHBE\u0001ÁÀ\u001dÀß9ý\u0004跇律\f\u009f\u0013Áã\u0019\u0096\u0086¨)äëg¡Å\u0082O÷±Æ§\u0007\u0005XB×?´'û?^\rnÛ4\u008aH¨Ñt\u00122³\t¦UÝõX\u009a\u009dÂL\u007fmÁS¡m\nÃ\u001bk\u00875Ô0\ri\rÆ½\u0094þû?Z?2Æå";
      int var12 = "\u001dòHBE\u0001ÁÀ\u001dÀß9ý\u0004跇律\f\u009f\u0013Áã\u0019\u0096\u0086¨)äëg¡Å\u0082O÷±Æ§\u0007\u0005XB×?´'û?^\rnÛ4\u008aH¨Ñt\u00122³\t¦UÝõX\u009a\u009dÂL\u007fmÁS¡m\nÃ\u001bk\u00875Ô0\ri\rÆ½\u0094þû?Z?2Æå"
         .length();
      char var9 = '\r';
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 82;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 126;
                        break;
                     case 1:
                        var58 = 61;
                        break;
                     case 2:
                        var58 = 11;
                        break;
                     case 3:
                        var58 = 101;
                        break;
                     case 4:
                        var58 = 92;
                        break;
                     case 5:
                        var58 = 20;
                        break;
                     default:
                        var58 = 53;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     d = new String[8];
                     long var0 = 3977175062347296058L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "\u0012V\u00adk\u008e¾g\u0017\u001dæ±\u00ad¥\u0011!\u0015\fÃ³Vnáèe";
                     int var5 = "\u0012V\u00adk\u008e¾g\u0017\u001dæ±\u00ad¥\u0011!\u0015\fÃ³Vnáèe".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
                              ((long)var7[0] & 255L) << 56
                                 | ((long)var7[1] & 255L) << 48
                                 | ((long)var7[2] & 255L) << 40
                                 | ((long)var7[3] & 255L) << 32
                                 | ((long)var7[4] & 255L) << 24
                                 | ((long)var7[5] & 255L) << 16
                                 | ((long)var7[6] & 255L) << 8
                                 | (long)var7[7] & 255L
                           )
                           ^ var0;
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     e = var6;
                     f = new Integer[3];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "(E\u008eÔý³³ö\u0093fÎ\u008d\u001f\u0010^Ê\u0093¨Ì`nSÊ\u009d\u0019Cãu\u0000\u0001";
                  var12 = "(E\u008eÔý³³ö\u0093fÎ\u008d\u001f\u0010^Ê\u0093¨Ì`nSÊ\u009d\u0019Cãu\u0000\u0001".length();
                  var9 = '\r';
                  var16 = -1;
            }

            var10000 = 27;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





