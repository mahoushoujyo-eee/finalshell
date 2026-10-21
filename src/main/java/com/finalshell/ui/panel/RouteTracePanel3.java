package com.finalshell.ui.panel;

import com.finalshell.core.C;
import com.finalshell.core.FX3;
import com.finalshell.core.L9;
import com.finalshell.core.T32;
import com.finalshell.core.U62;
import com.finalshell.core.Y12_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.A9;
import com.finalshell.ui.listener.AG;
import com.finalshell.ui.listener.Mc2;
import com.finalshell.ui.listener.Mr2;
import com.finalshell.ui.listener.UO;
import com.finalshell.ui.listener.Uv2;
import com.finalshell.ui.listener.ZO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

public class RouteTracePanel3 extends JPanel {
   public U62 V;
   public ArrayList G;
   public JTextField g;
   public JPopupMenu t;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public RouteTracePanel3() {
      L9.X();
      ArrayList var10002 = new ArrayList();
      long var10 = 375737987500155781L;
      ArrayList var9 = var10002;
      Ref.s(375737987500155781L, var9, var10);
      this.setOpaque(false);
      this.setLayout(new MigLayout(a(23111, 28425), a(23117, 1724), ""));
      JButton var2 = new JButton();
      this.add(var2, a(23107, -15544));
      JTextField var10003 = new JTextField();
      long var12 = 248665380297112060L;
      JTextField var11 = var10003;
      Ref.s(248665380297112060L, var11, var12);
      Object var13 = 248665380297112060L;
      ((JTextField)Ref.g(248665380297112060L, var13)).setOpaque(true);
      Object var15 = 248665380297112060L;
      ((JTextField)Ref.g(248665380297112060L, var15))
         .setBackground(new Color(a(30232, 3700063584172132937L), a(1158, 4960988423828617436L), a(1158, 4960988423828617436L)));
      Object var17 = 248665380297112060L;
      ((JTextField)Ref.g(248665380297112060L, var17)).setFont((Font)Registry.lookupField(395970988011231853L).get(null));
      Object var19 = 248665380297112060L;
      Registry.packArgs(Ref.g(248665380297112060L, var19));
      long var21 = 322267315291882359L;
      Ref.h2(322267315291882359L, var21);
      Object[] var10008 = Registry.packArgs("\uf1da");
      long var23 = 360256375153447639L;
      Object var10009 = Ref.h2(360256375153447639L, var23);

      try {
         var10009 = (T2)var10009;
      } catch (InvocationTargetException var49) {
         throw var49.getTargetException();
      }

      T2 var3 = (T2)var10009;
      var3.setOpaque(false);
      var3.setForeground(new Color(a(26035, 8693973341270825448L), a(28538, 1203797285833691951L), a(28538, 1203797285833691951L)));
      Object[] var1 = var10008;
      var3.setFont((Font)Registry.lookupField(164046876459002055L).get(null));
      JLabel var4 = new JLabel(a(23105, 13288));
      var4.setForeground((Color)Registry.lookupField(503018106388102479L).get(null));
      Registry.packArgs("\uf0d7");
      long var25 = 378399160856121064L;
      var10009 = Ref.h2(378399160856121064L, var25);

      try {
         var10009 = (C)var10009;
      } catch (InvocationTargetException var48) {
         throw var48.getTargetException();
      }

      C var5 = (C)var10009;
      var5.setFont((Font)Registry.lookupField(164046876459002055L).get(null));
      Object var27 = 248665380297112060L;
      ((JTextField)Ref.g(248665380297112060L, var27)).putClientProperty(a(23116, -31470), var5);
      Object var29 = 248665380297112060L;
      ((JTextField)Ref.g(248665380297112060L, var29)).addFocusListener(new UO(this));
      Object var31 = 248665380297112060L;
      ((JTextField)Ref.g(248665380297112060L, var31)).addActionListener(new A9(this));
      Object var33 = 248665380297112060L;
      ((JTextField)Ref.g(248665380297112060L, var33)).addMouseListener(new Uv2(this));
      Object var35 = 248665380297112060L;
      this.add((JTextField)Ref.g(248665380297112060L, var35), a(23108, 2532));
      JButton var6 = new JButton(a(23110, 7707));
      var6.setFont((Font)Registry.lookupField(395970988011231853L).get(null));
      if (var1 == null) {
         var6.addActionListener(new Mr2(this));
         Registry.emptyArgs();
         long var37 = 253808553645062345L;
         Object var10015 = Ref.h2(253808553645062345L, var37);

         try {
            var53 = (Boolean)var10015;
         } catch (InvocationTargetException var47) {
            throw var47.getTargetException();
         }

         if (var53) {
            this.add(var6);
         }
      }

      JLabel var7 = new JLabel();
      var7.setText(a(23104, -9530));
      Object var39 = 248665380297112060L;
      Object[] var10017 = Registry.packArgs(Ref.g(248665380297112060L, var39));
      long var42 = 614573051264868227L;
      Object[] var41 = var10017;
      var10017 = Ref.h(614573051264868227L, var41, var42);
      long var44 = 243859269374928732L;
      Object var43 = var10017;
      Ref.s(243859269374928732L, var43, var44);
      Y12_2 var10018;
      Object var45 = 243859269374928732L;
var5 = new com.finalshell.ui.listener.Qq2(this, (JPopupMenu)Ref.g(243859269374928732L, var45));
      Y12_2 var8 = var10018;
      var5.addActionListener(new com.finalshell.ui.listener.Qq2(this, var8));
      if (Ky4.F$arrString() != null) {
         L9.A(new int[4]);
      }
   }

   public void z(String var1, String var2) {
      int[] var3 = L9.X();
      if (var3 == null) {
         if (var1.trim().equals("")) {
            return;
         }

         Object var4 = 248665380297112060L;
         ((JTextField)Ref.g(248665380297112060L, var4)).setText(var1);
      }

      Object[] var10001 = Registry.packArgs(var2);
      long var7 = 519002930381305189L;
      Object[] var6 = var10001;
      Ref.h(519002930381305189L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public void e(String var1) {
      L9.X();
      Object var14 = 377829773077623687L;
      Object var10002 = Ref.g(377829773077623687L, var14);
      FX3 var10003 = (FX3)(Registry.emptyArgs());
      long var17 = 430740873249406416L;
      Object[] var16 = var10003;
      var10003 = Ref.h(430740873249406416L, var16, var17);

      try {
         var10003 = (FX3)var10003;
      } catch (InvocationTargetException var86) {
         throw var86.getTargetException();
      }

      FX3 var3 = var10003;
      Object var2 = var10002;
      Object var18 = 248665380297112060L;
      String var4 = ((JTextField)Ref.g(248665380297112060L, var18)).getText().trim();
      FX3 var90 = var4.equals("");
      label179:
      if (var2 != null) {
         FX3 var5 = var90;
         Object[] var92 = Registry.packArgs(var4);
         long var23 = 586754005152705687L;
         Object[] var22 = var92;
         Ref.h(586754005152705687L, var22, var23);

         try {
            ;
         } catch (InvocationTargetException var84) {
            throw var84.getTargetException();
         }

         Object[] var10005 = Registry.emptyArgs();
         long var25 = 136665046032231527L;
         Object[] var24 = var10005;
         Ref.h(136665046032231527L, var24, var25);

         try {
            ;
         } catch (InvocationTargetException var83) {
            throw var83.getTargetException();
         }

         W8 var10006 = (W8)(Registry.packArgs(var4));
         long var27 = 399675325010309536L;
         Object[] var26 = var10006;
         var10006 = Ref.h(399675325010309536L, var26, var27);

         try {
            var10006 = (W8)var10006;
         } catch (InvocationTargetException var82) {
            throw var82.getTargetException();
         }

         label176: {
            W8 var6 = var10006;
            if (var5 == null) {
               Object var28 = 243859269374928732L;
               Object var10009 = Ref.g(243859269374928732L, var28);
               Object var30 = 248665380297112060L;
               var10009 = Registry.packArgs(var10009, this, Ref.g(248665380297112060L, var30), var4);
               long var33 = 154969935643114158L;
               Object[] var32 = (Object[])var10009;
               var10009 = Ref.h(154969935643114158L, var32, var33);

               try {
                  var10009 = (W8)var10009;
               } catch (InvocationTargetException var81) {
                  throw var81.getTargetException();
               }

               W8 var7 = (W8)var10009;
               Object var34 = 243859269374928732L;
               ((JPopupMenu)Ref.g(243859269374928732L, var34)).insert(var7, 0);
               Object var36 = 375737987500155781L;
               ((ArrayList)Ref.g(375737987500155781L, var36)).remove(var6);
               Object var38 = 375737987500155781L;
               ((ArrayList)Ref.g(375737987500155781L, var38)).add(0, var7);
               if (var2 == null) {
                  break label176;
               }
            }

            if (var6 != null) {
               Object var40 = 243859269374928732L;
               ((JPopupMenu)Ref.g(243859269374928732L, var40)).remove(var6);
               Object var42 = 243859269374928732L;
               ((JPopupMenu)Ref.g(243859269374928732L, var42)).insert(var6, 0);
               Object var44 = 375737987500155781L;
               ((ArrayList)Ref.g(375737987500155781L, var44)).remove(var6);
               Object var46 = 375737987500155781L;
               ((ArrayList)Ref.g(375737987500155781L, var46)).add(0, var6);
            }
         }

         Object[] var10007 = Registry.emptyArgs();
         long var49 = 136665046032231527L;
         Object[] var48 = var10007;
         Ref.h(136665046032231527L, var48, var49);

         try {
            ;
         } catch (InvocationTargetException var80) {
            throw var80.getTargetException();
         }

         Registry.emptyArgs();
         long var50 = 270389152141252877L;
         Ref.h2(270389152141252877L, var50);
         Object[] var98 = Registry.emptyArgs();
         long var53 = 634817973682994708L;
         Object[] var52 = var98;
         Ref.h(634817973682994708L, var52, var53);
         Object[] var10010 = Registry.emptyArgs();
         long var55 = 240567170779145617L;
         Object[] var54 = var10010;
         Ref.h(240567170779145617L, var54, var55);
         Object[] var10011 = Registry.emptyArgs();
         long var57 = 226341449505323490L;
         Object[] var56 = var10011;
         Ref.h(226341449505323490L, var56, var57);

         try {
            ;
         } catch (InvocationTargetException var79) {
            throw var79.getTargetException();
         }

         Object[] var10012 = Registry.emptyArgs();
         long var59 = 303756590022481369L;
         Object[] var58 = var10012;
         Ref.h(303756590022481369L, var58, var59);

         try {
            ;
         } catch (InvocationTargetException var78) {
            throw var78.getTargetException();
         }

         T32 var10013 = (T32)(Registry.packArgs(var4));
         long var61 = 441588612977596085L;
         Object[] var60 = var10013;
         var10013 = Ref.h(441588612977596085L, var60, var61);

         try {
            var10013 = (T32)var10013;
         } catch (InvocationTargetException var77) {
            throw var77.getTargetException();
         }

         label168: {
            T32 var9 = var10013;
            if (var2 == null) {
               if (var9 == null) {
                  break label168;
               }

               Object[] var10014 = Registry.packArgs(var9);
               long var63 = 176011466134249595L;
               Object[] var62 = var10014;
               Ref.h(176011466134249595L, var62, var63);

               try {
                  ;
               } catch (InvocationTargetException var76) {
                  throw var76.getTargetException();
               }
            }

            if (var2 == null) {
               return;
            }
         }

         Object[] var101 = Registry.packArgs(var4, null);
         long var65 = 505490541727736838L;
         Object[] var64 = var101;
         Ref.h(505490541727736838L, var64, var65);

         try {
            ;
         } catch (InvocationTargetException var75) {
            throw var75.getTargetException();
         }

         Object[] var10015 = Registry.emptyArgs();
         long var67 = 374403798285916040L;
         Object[] var66 = var10015;
         Ref.h(374403798285916040L, var66, var67);

         try {
            ;
         } catch (InvocationTargetException var74) {
            throw var74.getTargetException();
         }

         String var87;
         label159: {
            var87 = null;
            String var102 = var1;
            if (var2 == null) {
               if (var1 != null) {
                  var87 = a(23115, 23869) + var1;
                  break label159;
               }

               var102 = a(23112, -9903) + var4;
            }

            var87 = var102;
         }

         Object[] var10016 = Registry.packArgs(var87);
         long var69 = 519460332647460288L;
         Object[] var68 = var10016;
         Ref.h(519460332647460288L, var68, var69);

         try {
            ;
         } catch (InvocationTargetException var73) {
            throw var73.getTargetException();
         }

         Object[] var10017 = Registry.emptyArgs();
         long var71 = 176235325809488947L;
         Object[] var70 = var10017;
         Ref.h(176235325809488947L, var70, var71);

         try {
            ;
         } catch (InvocationTargetException var72) {
            throw var72.getTargetException();
         }

         Window var13 = SwingUtilities.getWindowAncestor(this);
         Window var103 = var13;
         if (var2 == null) {
            if (var13 == null) {
               return;
            }

            var103 = var13;
         }

         var103.setVisible(false);
      } else if (var90 == null) {
         var90 = var3;
         Object[] var10004 = Registry.packArgs(var4);
         long var21 = 610893823161621108L;
         Object[] var20 = var10004;
         var10004 = Ref.h(610893823161621108L, var20, var21);

         try {
            break label179;
         } catch (InvocationTargetException var85) {
            throw var85.getTargetException();
         }
      }
   }

   public JPopupMenu U(Component var1) {
      L9.X();
      Registry.emptyArgs();
      long var9 = 270389152141252877L;
      Ref.h2(270389152141252877L, var9);
      Object[] var10004 = Registry.emptyArgs();
      long var12 = 306266403902896148L;
      Object[] var11 = var10004;
      var10004 = Ref.h(306266403902896148L, var11, var12);
      long var14 = 377829773077623687L;
      Object var13 = var10004;
      Ref.s(377829773077623687L, var13, var14);
      Object var15 = 377829773077623687L;
      Object var10005 = Ref.g(377829773077623687L, var15);
      ArrayList var10006 = Registry.emptyArgs();
      long var18 = 430740873249406416L;
      Object[] var17 = var10006;
      var10006 = Ref.h(430740873249406416L, var17, var18);

      try {
         var10006 = (FX3)var10006;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      FX3 var3 = var10006;
      JPopupMenu var4 = new JPopupMenu();
      int var5 = 0;
      Object var2 = var10005;
      var10006 = Registry.emptyArgs();
      long var20 = 250284129792311327L;
      Object[] var19 = var10006;
      var10006 = Ref.h(250284129792311327L, var19, var20);

      try {
         var10006 = (ArrayList)var10006;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      Iterator var6 = var10006.iterator();

      while (true) {
         if (var6.hasNext()) {
            String var7 = (String)var6.next();
            var32 = this;
            W8 var10007 = (W8)(Registry.packArgs(var3, var4, var1, var7));
            long var22 = 154969935643114158L;
            Object[] var21 = var10007;
            var10007 = Ref.h(154969935643114158L, var21, var22);

            try {
               var10007 = (W8)var10007;
            } catch (InvocationTargetException var23) {
               throw var23.getTargetException();
            }

            W8 var8 = var10007;
            if (var2 != null) {
               break;
            }

            var4.insert(var8, var5);
            var5++;
            if (var2 == null) {
      JLabel var32;
      JLabel var32;
               continue;
            }
         }

         var32 = var4;
         break;
      }

      return (JPopupMenu)var32;
   }

   public W8 X(String var1) {
      int[] var10000 = L9.X();
      W8 var3 = null;
      int[] var2 = var10000;
      Object var6 = 375737987500155781L;

      for (W8 var5 : (ArrayList)Ref.g(375737987500155781L, var6)) {
         if (var2 == null) {
            Object[] var10002 = Registry.emptyArgs();
            long var9 = 325466260686391537L;
            Object[] var8 = var10002;
            var10002 = Ref.h(325466260686391537L, var8, var9);

            try {
               var10002 = (String)var10002;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            if (!var10002.equals(var1)) {
               continue;
            }
         }

         var3 = var5;
         break;
      }

      return var3;
   }

   public void E() {
      Registry.emptyArgs();
      long var1 = 270389152141252877L;
      Ref.h2(270389152141252877L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 578864097947885485L;
      Object[] var3 = var10002;
      Ref.h(578864097947885485L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public W8 S(FX3 var1, JPopupMenu var2, Component var3, String var4) {
      Color var5 = (Color)Registry.lookupField(461796957683008100L).get(null);
      Color var6 = new Color(a(13900, 8296476825590303260L), a(24754, 7491671487769238756L), a(24754, 7491671487769238756L));
      new Color(a(32569, 2105838693354226541L), a(25959, 8887335800914008372L), a(25959, 8887335800914008372L));
      Color var8 = new Color(a(16850, 5465374185659760000L), a(7369, 7048773247140995230L), a(7369, 7048773247140995230L));
      W8 var9 = new W8(var4);
      Object var15 = 375737987500155781L;
      ((ArrayList)Ref.g(375737987500155781L, var15)).add(var9);
      var9.setLayout(new MigLayout(a(23106, -21969), a(23109, 22011), ""));
      var9.setBackground(var6);
      JLabel var10 = new JLabel(var4);
      var10.setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      var10.setForeground(var8);
      var10.setOpaque(true);
      var10.setBackground(var6);
      var10.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
      var9.add(var10, a(23118, -30225));
      var10.addMouseListener(new ZO(this, var4, var10, var6, var9, var2));
      JPanel var11 = new JPanel();
      var11.setLayout(new MigLayout(a(23119, 18542), a(23114, 1758), ""));
      var11.setOpaque(false);
      var9.add(var11);
      Font var12 = (Font)Registry.lookupField(344087302787482558L).get(null);
      Registry.packArgs("\uf00d");
      long var17 = 378399160856121064L;
      Object var10002 = Ref.h2(378399160856121064L, var17);

      try {
         var10002 = (C)var10002;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      C var13 = (C)var10002;
      var13.setForeground((Color)Registry.lookupField(476153709123937579L).get(null));
      var13.setFont(var12);
      var11.add(var13);
      var13.addActionListener(new AG(this, var1, var4, var2, var9));
      Mc2 var14 = new Mc2(this, var10, var6, var9, var5);
      var13.addMouseListener(var14);
      var10.addMouseListener(var14);
      var9.addMouseListener(var14);
      return var9;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 23110) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 248;
               break;
            case 1:
               var10000 = 157;
               break;
            case 2:
               var10000 = 174;
               break;
            case 3:
               var10000 = 37;
               break;
            case 4:
               var10000 = 3;
               break;
            case 5:
               var10000 = 231;
               break;
            case 6:
               var10000 = 48;
               break;
            case 7:
               var10000 = 196;
               break;
            case 8:
               var10000 = 31;
               break;
            case 9:
               var10000 = 109;
               break;
            case 10:
               var10000 = 33;
               break;
            case 11:
               var10000 = 105;
               break;
            case 12:
               var10000 = 130;
               break;
            case 13:
               var10000 = 24;
               break;
            case 14:
               var10000 = 243;
               break;
            case 15:
               var10000 = 125;
               break;
            case 16:
               var10000 = 15;
               break;
            case 17:
               var10000 = 250;
               break;
            case 18:
               var10000 = 217;
               break;
            case 19:
               var10000 = 39;
               break;
            case 20:
               var10000 = 219;
               break;
            case 21:
               var10000 = 212;
               break;
            case 22:
               var10000 = 66;
               break;
            case 23:
               var10000 = 173;
               break;
            case 24:
               var10000 = 113;
               break;
            case 25:
               var10000 = 139;
               break;
            case 26:
               var10000 = 136;
               break;
            case 27:
               var10000 = 124;
               break;
            case 28:
               var10000 = 84;
               break;
            case 29:
               var10000 = 40;
               break;
            case 30:
               var10000 = 134;
               break;
            case 31:
               var10000 = 91;
               break;
            case 32:
               var10000 = 30;
               break;
            case 33:
               var10000 = 97;
               break;
            case 34:
               var10000 = 224;
               break;
            case 35:
               var10000 = 234;
               break;
            case 36:
               var10000 = 80;
               break;
            case 37:
               var10000 = 26;
               break;
            case 38:
               var10000 = 65;
               break;
            case 39:
               var10000 = 215;
               break;
            case 40:
               var10000 = 133;
               break;
            case 41:
               var10000 = 183;
               break;
            case 42:
               var10000 = 6;
               break;
            case 43:
               var10000 = 83;
               break;
            case 44:
               var10000 = 117;
               break;
            case 45:
               var10000 = 47;
               break;
            case 46:
               var10000 = 164;
               break;
            case 47:
               var10000 = 138;
               break;
            case 48:
               var10000 = 71;
               break;
            case 49:
               var10000 = 251;
               break;
            case 50:
               var10000 = 104;
               break;
            case 51:
               var10000 = 241;
               break;
            case 52:
               var10000 = 61;
               break;
            case 53:
               var10000 = 154;
               break;
            case 54:
               var10000 = 127;
               break;
            case 55:
               var10000 = 149;
               break;
            case 56:
               var10000 = 132;
               break;
            case 57:
               var10000 = 11;
               break;
            case 58:
               var10000 = 78;
               break;
            case 59:
               var10000 = 108;
               break;
            case 60:
               var10000 = 21;
               break;
            case 61:
               var10000 = 90;
               break;
            case 62:
               var10000 = 85;
               break;
            case 63:
               var10000 = 67;
               break;
            case 64:
               var10000 = 160;
               break;
            case 65:
               var10000 = 245;
               break;
            case 66:
               var10000 = 58;
               break;
            case 67:
               var10000 = 12;
               break;
            case 68:
               var10000 = 110;
               break;
            case 69:
               var10000 = 253;
               break;
            case 70:
               var10000 = 218;
               break;
            case 71:
               var10000 = 140;
               break;
            case 72:
               var10000 = 161;
               break;
            case 73:
               var10000 = 29;
               break;
            case 74:
               var10000 = 172;
               break;
            case 75:
               var10000 = 227;
               break;
            case 76:
               var10000 = 158;
               break;
            case 77:
               var10000 = 57;
               break;
            case 78:
               var10000 = 228;
               break;
            case 79:
               var10000 = 16;
               break;
            case 80:
               var10000 = 188;
               break;
            case 81:
               var10000 = 171;
               break;
            case 82:
               var10000 = 249;
               break;
            case 83:
               var10000 = 226;
               break;
            case 84:
               var10000 = 156;
               break;
            case 85:
               var10000 = 122;
               break;
            case 86:
               var10000 = 246;
               break;
            case 87:
               var10000 = 176;
               break;
            case 88:
               var10000 = 170;
               break;
            case 89:
               var10000 = 119;
               break;
            case 90:
               var10000 = 187;
               break;
            case 91:
               var10000 = 0;
               break;
            case 92:
               var10000 = 181;
               break;
            case 93:
               var10000 = 186;
               break;
            case 94:
               var10000 = 209;
               break;
            case 95:
               var10000 = 213;
               break;
            case 96:
               var10000 = 116;
               break;
            case 97:
               var10000 = 60;
               break;
            case 98:
               var10000 = 225;
               break;
            case 99:
               var10000 = 208;
               break;
            case 100:
               var10000 = 38;
               break;
            case 101:
               var10000 = 42;
               break;
            case 102:
               var10000 = 92;
               break;
            case 103:
               var10000 = 144;
               break;
            case 104:
               var10000 = 147;
               break;
            case 105:
               var10000 = 93;
               break;
            case 106:
               var10000 = 20;
               break;
            case 107:
               var10000 = 252;
               break;
            case 108:
               var10000 = 44;
               break;
            case 109:
               var10000 = 203;
               break;
            case 110:
               var10000 = 126;
               break;
            case 111:
               var10000 = 166;
               break;
            case 112:
               var10000 = 95;
               break;
            case 113:
               var10000 = 128;
               break;
            case 114:
               var10000 = 169;
               break;
            case 115:
               var10000 = 36;
               break;
            case 116:
               var10000 = 46;
               break;
            case 117:
               var10000 = 123;
               break;
            case 118:
               var10000 = 68;
               break;
            case 119:
               var10000 = 35;
               break;
            case 120:
               var10000 = 204;
               break;
            case 121:
               var10000 = 101;
               break;
            case 122:
               var10000 = 247;
               break;
            case 123:
               var10000 = 192;
               break;
            case 124:
               var10000 = 223;
               break;
            case 125:
               var10000 = 194;
               break;
            case 126:
               var10000 = 115;
               break;
            case 127:
               var10000 = 107;
               break;
            case 128:
               var10000 = 146;
               break;
            case 129:
               var10000 = 112;
               break;
            case 130:
               var10000 = 210;
               break;
            case 131:
               var10000 = 193;
               break;
            case 132:
               var10000 = 155;
               break;
            case 133:
               var10000 = 77;
               break;
            case 134:
               var10000 = 14;
               break;
            case 135:
               var10000 = 198;
               break;
            case 136:
               var10000 = 114;
               break;
            case 137:
               var10000 = 17;
               break;
            case 138:
               var10000 = 23;
               break;
            case 139:
               var10000 = 177;
               break;
            case 140:
               var10000 = 7;
               break;
            case 141:
               var10000 = 254;
               break;
            case 142:
               var10000 = 240;
               break;
            case 143:
               var10000 = 8;
               break;
            case 144:
               var10000 = 103;
               break;
            case 145:
               var10000 = 202;
               break;
            case 146:
               var10000 = 52;
               break;
            case 147:
               var10000 = 56;
               break;
            case 148:
               var10000 = 98;
               break;
            case 149:
               var10000 = 18;
               break;
            case 150:
               var10000 = 99;
               break;
            case 151:
               var10000 = 72;
               break;
            case 152:
               var10000 = 184;
               break;
            case 153:
               var10000 = 220;
               break;
            case 154:
               var10000 = 201;
               break;
            case 155:
               var10000 = 178;
               break;
            case 156:
               var10000 = 168;
               break;
            case 157:
               var10000 = 89;
               break;
            case 158:
               var10000 = 199;
               break;
            case 159:
               var10000 = 106;
               break;
            case 160:
               var10000 = 88;
               break;
            case 161:
               var10000 = 152;
               break;
            case 162:
               var10000 = 206;
               break;
            case 163:
               var10000 = 13;
               break;
            case 164:
               var10000 = 148;
               break;
            case 165:
               var10000 = 191;
               break;
            case 166:
               var10000 = 76;
               break;
            case 167:
               var10000 = 73;
               break;
            case 168:
               var10000 = 50;
               break;
            case 169:
               var10000 = 163;
               break;
            case 170:
               var10000 = 207;
               break;
            case 171:
               var10000 = 205;
               break;
            case 172:
               var10000 = 222;
               break;
            case 173:
               var10000 = 142;
               break;
            case 174:
               var10000 = 137;
               break;
            case 175:
               var10000 = 179;
               break;
            case 176:
               var10000 = 100;
               break;
            case 177:
               var10000 = 120;
               break;
            case 178:
               var10000 = 4;
               break;
            case 179:
               var10000 = 82;
               break;
            case 180:
               var10000 = 25;
               break;
            case 181:
               var10000 = 195;
               break;
            case 182:
               var10000 = 237;
               break;
            case 183:
               var10000 = 182;
               break;
            case 184:
               var10000 = 236;
               break;
            case 185:
               var10000 = 81;
               break;
            case 186:
               var10000 = 22;
               break;
            case 187:
               var10000 = 255;
               break;
            case 188:
               var10000 = 189;
               break;
            case 189:
               var10000 = 135;
               break;
            case 190:
               var10000 = 75;
               break;
            case 191:
               var10000 = 165;
               break;
            case 192:
               var10000 = 5;
               break;
            case 193:
               var10000 = 96;
               break;
            case 194:
               var10000 = 111;
               break;
            case 195:
               var10000 = 64;
               break;
            case 196:
               var10000 = 162;
               break;
            case 197:
               var10000 = 102;
               break;
            case 198:
               var10000 = 45;
               break;
            case 199:
               var10000 = 141;
               break;
            case 200:
               var10000 = 34;
               break;
            case 201:
               var10000 = 53;
               break;
            case 202:
               var10000 = 19;
               break;
            case 203:
               var10000 = 145;
               break;
            case 204:
               var10000 = 41;
               break;
            case 205:
               var10000 = 167;
               break;
            case 206:
               var10000 = 79;
               break;
            case 207:
               var10000 = 200;
               break;
            case 208:
               var10000 = 87;
               break;
            case 209:
               var10000 = 153;
               break;
            case 210:
               var10000 = 27;
               break;
            case 211:
               var10000 = 242;
               break;
            case 212:
               var10000 = 2;
               break;
            case 213:
               var10000 = 28;
               break;
            case 214:
               var10000 = 94;
               break;
            case 215:
               var10000 = 32;
               break;
            case 216:
               var10000 = 221;
               break;
            case 217:
               var10000 = 1;
               break;
            case 218:
               var10000 = 51;
               break;
            case 219:
               var10000 = 244;
               break;
            case 220:
               var10000 = 239;
               break;
            case 221:
               var10000 = 49;
               break;
            case 222:
               var10000 = 151;
               break;
            case 223:
               var10000 = 118;
               break;
            case 224:
               var10000 = 235;
               break;
            case 225:
               var10000 = 230;
               break;
            case 226:
               var10000 = 70;
               break;
            case 227:
               var10000 = 159;
               break;
            case 228:
               var10000 = 63;
               break;
            case 229:
               var10000 = 175;
               break;
            case 230:
               var10000 = 129;
               break;
            case 231:
               var10000 = 216;
               break;
            case 232:
               var10000 = 232;
               break;
            case 233:
               var10000 = 180;
               break;
            case 234:
               var10000 = 9;
               break;
            case 235:
               var10000 = 131;
               break;
            case 236:
               var10000 = 211;
               break;
            case 237:
               var10000 = 69;
               break;
            case 238:
               var10000 = 10;
               break;
            case 239:
               var10000 = 238;
               break;
            case 240:
               var10000 = 190;
               break;
            case 241:
               var10000 = 214;
               break;
            case 242:
               var10000 = 233;
               break;
            case 243:
               var10000 = 150;
               break;
            case 244:
               var10000 = 43;
               break;
            case 245:
               var10000 = 54;
               break;
            case 246:
               var10000 = 59;
               break;
            case 247:
               var10000 = 121;
               break;
            case 248:
               var10000 = 197;
               break;
            case 249:
               var10000 = 143;
               break;
            case 250:
               var10000 = 74;
               break;
            case 251:
               var10000 = 55;
               break;
            case 252:
               var10000 = 86;
               break;
            case 253:
               var10000 = 62;
               break;
            case 254:
               var10000 = 229;
               break;
            default:
               var10000 = 185;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15443;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[15];
      int var11 = 0;
      String var10 = "贾疡轹軗\u000e\\¥í¬\u0099ö2\u0086[\u0087±¹ë¨!2³ê\u0098\u0090\u0010\u0096`\u00868\u0002P\u008c\u001dè\u0014`£\u0004mE\u0089«»OqÊ@<Ê2Ìð\b÷\u0013¯\u0011Óû\fa\r\u0088FwÐÊ*H4\u0015Ó\u00193ÿ\u0013U\u0084\u0006~\rÌ%òñ^\u009fJ&<\u009da§2§\u0007\u0002NÕ5¶ý°\u0002埴圷\u000e\u00044,hH\u000e\u008d¡ãBh\u0002\u009f¼\rûR\u0019R\u0007zñ>!\u0092ü\u001b@\u001cÑþ\r§Q\u001cb\u001d}_¾:\u0097\u0007ÒØ&Jªpj=¦Y\u001a\u0081WV\u0005FR\u009d9\u0011\u0005\u0096ü\u0083ìV";
      int var12 = "贾疡轹軗\u000e\\¥í¬\u0099ö2\u0086[\u0087±¹ë¨!2³ê\u0098\u0090\u0010\u0096`\u00868\u0002P\u008c\u001dè\u0014`£\u0004mE\u0089«»OqÊ@<Ê2Ìð\b÷\u0013¯\u0011Óû\fa\r\u0088FwÐÊ*H4\u0015Ó\u00193ÿ\u0013U\u0084\u0006~\rÌ%òñ^\u009fJ&<\u009da§2§\u0007\u0002NÕ5¶ý°\u0002埴圷\u000e\u00044,hH\u000e\u008d¡ãBh\u0002\u009f¼\rûR\u0019R\u0007zñ>!\u0092ü\u001b@\u001cÑþ\r§Q\u001cb\u001d}_¾:\u0097\u0007ÒØ&Jªpj=¦Y\u001a\u0081WV\u0005FR\u009d9\u0011\u0005\u0096ü\u0083ìV"
         .length();
      char var9 = 4;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 96;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 122;
                        break;
                     case 1:
                        var65 = 62;
                        break;
                     case 2:
                        var65 = 114;
                        break;
                     case 3:
                        var65 = 117;
                        break;
                     case 4:
                        var65 = 111;
                        break;
                     case 5:
                        var65 = 27;
                        break;
                     default:
                        var65 = 90;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[15];
                     long var0 = 5173094343510678364L;
                     long[] var6 = new long[10];
                     int var3 = 0;
                     String var4 = "\u001dÅª*K\u009e\u0002êêó-iÚ_¦È\u0083Qwøry\u0011ê(\u0082Lêò\u001bQº7\u0091\u0088Ô´\u0094ûÖH/ÂW$á\u0007B5@\fZM;\bÿ\u0098\u008dÐ«É/\u0098³";
                     int var5 = "\u001dÅª*K\u009e\u0002êêó-iÚ_¦È\u0083Qwøry\u0011ê(\u0082Lêò\u001bQº7\u0091\u0088Ô´\u0094ûÖH/ÂW$á\u0007B5@\fZM;\bÿ\u0098\u008dÐ«É/\u0098³"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    c = var6;
                                    d = new Integer[10];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u00ad¾\u0096\u0007[ \u00828ò\u0019\f®O¨c\u007f";
                                 var5 = "\u00ad¾\u0096\u0007[ \u00828ò\u0019\f®O¨c\u007f".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "趪畐Ó\u0003跰痢\u0098";
                  var12 = "趪畐Ó\u0003跰痢\u0098".length();
                  var9 = 3;
                  var17 = -1;
            }

            var10000 = 4;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}






