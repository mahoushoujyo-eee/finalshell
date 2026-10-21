package com.finalshell.ui.dialog;

import com.finalshell.core.Km2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.DY3;
import com.finalshell.ui.listener.JY;
import com.finalshell.ui.listener.OB;
import com.finalshell.ui.listener.T62;
import com.finalshell.ui.listener.TY;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Kl4;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.Address;
import com.finalshell.ui.panel.Connection4;
import com.finalshell.ui.panel.PathPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileSystemView;
import net.miginfocom.swing.MigLayout;

public class Xw2 extends JDialog {
   public PathPanel Y;
   public JPanel B;
   public static int u;
   public static int C;
   public int S;
   public static int v;
   public static int K;
   public int f;
   public ArrayList Z;
   public String V;
   public Km2 p;
   public Connection4 d;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] e;

   public static void d(String[] var0) {
      while (true) {
         Xw2 var1 = new Xw2(null, a(2091, -3028));
         Object[] var10001 = Registry.packArgs(a(2086, -1188), true, true);
         long var3 = 633945515680537718L;
         Object[] var2 = var10001;
         Ref.h(633945515680537718L, var2, var3);

         try {
            ;
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         var1.setLocationRelativeTo(null);
         var1.setVisible(true);
      }
   }

   public Xw2(Window var1, String var2) {
      super(var1, var2);
      Registry.lookupField(619905985051257260L).setInt(this, Registry.lookupField(265275935393846693L).getInt(null));
      Registry.lookupField(527873833330177408L).setInt(this, Registry.lookupField(311183796363677834L).getInt(null));
      ArrayList var10001 = new ArrayList();
      long var19 = 599144936174029496L;
      ArrayList var18 = var10001;
      Ref.s(599144936174029496L, var18, var19);
      Address.i();
      Registry.emptyArgs();
      long var20 = 270389152141252877L;
      Ref.h2(270389152141252877L, var20);
      Object[] var10004 = Registry.emptyArgs();
      long var23 = 306266403902896148L;
      Object[] var22 = var10004;
      Ref.h(306266403902896148L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var98) {
         throw var98.getTargetException();
      }

      this.setModal(true);
      this.setSize(a(19452, 4108965562415475689L), a(10810, 5356451581566356001L));
      JPanel var5 = (JPanel)this.getContentPane();
      var5.setLayout(new MigLayout(a(2105, -5012), a(2085, 8534), a(2082, -16032)));
      var5.setBackground(Color.white);
      JPanel var6 = new JPanel();
      var6.setLayout(new MigLayout(a(2087, 20447)));
      var6.setOpaque(false);
      var5.add(var6, a(2107, -23343));
      JPanel var7 = new JPanel();
      var7.setOpaque(false);
      var7.setLayout(new MigLayout(a(2094, -32063)));
      var6.add(var7, a(2080, 8076));
      JLabel var8 = new JLabel(a(2084, 18106));
      var8.setForeground(new Color(a(29551, 6893749643217556339L), a(30761, 2450194107102419005L), a(4345, 5607993199569285350L)));
      var7.add(var8, a(2081, 21601));
      JPanel var10005 = new JPanel();
      long var25 = 246429828742070477L;
      JPanel var24 = var10005;
      Ref.s(246429828742070477L, var24, var25);
      Object var26 = 246429828742070477L;
      ((JPanel)Ref.g(246429828742070477L, var26)).setOpaque(false);
      MigLayout var9 = new MigLayout(a(2088, -31684), "", a(2090, 32075));
      Object var28 = 246429828742070477L;
      ((JPanel)Ref.g(246429828742070477L, var28)).setLayout(var9);
      JScrollPane var10007;
      Object var30 = 246429828742070477L;
      super((JPanel)Ref.g(246429828742070477L, var30));
      JScrollPane var10 = var10007;
      var10.setAutoscrolls(false);
      var10.setOpaque(false);
      JScrollPane var3 = var10007;
      var10.getViewport().setOpaque(false);
      var7.add(var10, a(2106, 8217));
      Object[] var10008 = Registry.emptyArgs();
      long var33 = 623400893456259775L;
      Object[] var32 = var10008;
      Ref.h(623400893456259775L, var32, var33);

      try {
         ;
      } catch (InvocationTargetException var97) {
         throw var97.getTargetException();
      }

      ArrayList var10009 = Registry.emptyArgs();
      long var35 = 250284129792311327L;
      Object[] var34 = var10009;
      var10009 = Ref.h(250284129792311327L, var34, var35);

      try {
         var10009 = (ArrayList)var10009;
      } catch (InvocationTargetException var96) {
         throw var96.getTargetException();
      }

      Iterator var12 = var10009.iterator();

      JPanel var10021;
      label151: {
         while (true) {
            if (var12.hasNext()) {
               String var13 = (String)var12.next();
               JTextArea var14 = new JTextArea(var13);
               var14.setFont((Font)Registry.lookupField(395970988011231853L).get(null));
               var14.setLineWrap(true);
               var14.setEditable(false);
               var14.setOpaque(false);
               int var15 = a(9394, 937581489803232431L);
               Color var16 = new Color(var15, var15, var15);
               var14.setForeground(var16);
               var14.setCursor(new Cursor(a(22140, 9177490792372336226L)));
               Object var36 = 246429828742070477L;
               ((JPanel)Ref.g(246429828742070477L, var36)).add(var14, a(2104, 17686));
               var14.addMouseListener(new T62(this, var13, var14, var16));
               if (var3 == null) {
                  break;
               }

               if (var3 == null) {
                  continue;
               }
            }

            PathPanel var10010 = new PathPanel(Registry.lookupField(527873833330177408L).getInt(this));
            long var39 = 540498928662567395L;
            PathPanel var38 = var10010;
            Ref.s(540498928662567395L, var38, var39);
            Object var40 = 540498928662567395L;
            Ref.g(540498928662567395L, var40);
            Object[] var10012 = Registry.packArgs(Registry.lookupField(527873833330177408L).getInt(this));
            long var43 = 355553533336863693L;
            Object[] var42 = var10012;
            Ref.h(355553533336863693L, var42, var43);

            try {
               ;
            } catch (InvocationTargetException var95) {
               throw var95.getTargetException();
            }

            Object var44 = 540498928662567395L;
            Ref.g(540498928662567395L, var44);
            Object[] var10015 = Registry.emptyArgs();
            long var47 = 479006944855319308L;
            Object[] var46 = var10015;
            var10015 = Ref.h(479006944855319308L, var46, var47);
            long var49 = 571805043480765699L;
            Object var48 = var10015;
            Ref.s(571805043480765699L, var48, var49);
            Object var50 = 571805043480765699L;
            Ref.g(571805043480765699L, var50);
            Object[] var10017 = Registry.packArgs(false);
            long var53 = 167604273003001173L;
            Object[] var52 = var10017;
            Ref.h(167604273003001173L, var52, var53);

            try {
               ;
            } catch (InvocationTargetException var94) {
               throw var94.getTargetException();
            }

            Object var54 = 540498928662567395L;
            Ref.g(540498928662567395L, var54);
            Object[] var10020 = Registry.emptyArgs();
            long var57 = 126176237984401993L;
            Object[] var56 = var10020;
            var10020 = Ref.h(126176237984401993L, var56, var57);
            long var59 = 295254898775337161L;
            Object var58 = var10020;
            Ref.s(295254898775337161L, var58, var59);
            Object var60 = 295254898775337161L;
            ((Km2)Ref.g(295254898775337161L, var60)).setDragEnabled(false);
            var10021 = var6;
            if (var3 == null) {
               break label151;
            }

            Object var62 = 540498928662567395L;
            this.add((PathPanel)Ref.g(540498928662567395L, var62));
            Object var64 = 295254898775337161L;
            Ref.g(295254898775337161L, var64);
            Object[] var10024 = Registry.packArgs(false);
            long var67 = 233644321955391576L;
            Object[] var66 = var10024;
            Ref.h(233644321955391576L, var66, var67);

            try {
               break;
            } catch (InvocationTargetException var93) {
               throw var93.getTargetException();
            }
         }

         if (Registry.lookupField(527873833330177408L).getInt(this) == Registry.lookupField(599401513125029986L).getInt(null)) {
            Object var68 = 295254898775337161L;
            ((Km2)Ref.g(295254898775337161L, var68)).setSelectionMode(2);
         }

         new JPanel();
      }

      JPanel var99 = var10021;
      var99.setOpaque(false);
      var5.add(var99, a(2089, 18534));
      var99.setLayout(new MigLayout(a(2093, 28291), a(2095, -11752), ""));
      JButton var100 = new JButton(a(2092, -16465));
      var99.add(var100);
      var100.addActionListener(new JY(this));
      JButton var101 = new JButton(a(2083, -21120));
      var99.add(var101);
      var101.addActionListener(new TY(this));
      Object var70 = 540498928662567395L;
      Ref.g(540498928662567395L, var70);
      Km2 var10023 = (Km2)(Registry.emptyArgs());
      long var73 = 126176237984401993L;
      Object[] var72 = var10023;
      var10023 = Ref.h(126176237984401993L, var72, var73);

      try {
         var10023 = (Km2)var10023;
      } catch (InvocationTargetException var92) {
         throw var92.getTargetException();
      }

      Km2 var102 = var10023;
      var102.addMouseListener(new OB(this));
      String var110 = (String)(Registry.emptyArgs());
      long var75 = 351281291503408509L;
      Object[] var74 = var110;
      var110 = Ref.h(351281291503408509L, var74, var75);

      try {
         var110 = (String)var110;
      } catch (InvocationTargetException var91) {
         throw var91.getTargetException();
      }

      String var103 = var110;
      Registry.packArgs(var103);
      long var76 = 330094358428833085L;
      Object var10025 = Ref.h2(330094358428833085L, var76);

      try {
         var10025 = (Boolean)var10025;
      } catch (InvocationTargetException var90) {
         throw var90.getTargetException();
      }

      label133: {
         if (var3 == null) {
            if (var10025 == null) {
               Object[] var10026 = Registry.packArgs(var103, true, false);
               long var79 = 633945515680537718L;
               Object[] var78 = var10026;
               Ref.h(633945515680537718L, var78, var79);

               try {
                  ;
               } catch (InvocationTargetException var89) {
                  throw var89.getTargetException();
               }

               if (var3 == null) {
                  break label133;
               }
            }

            var10025 = Registry.emptyArgs();
            long var80 = 253808553645062345L;
            Object var114 = Ref.h2(253808553645062345L, var80);

            try {
            } catch (InvocationTargetException var88) {
               throw var88.getTargetException();
            }
         }

         if (var10025 == null) {
            FileSystemView var17 = FileSystemView.getFileSystemView();
            Object[] var115 = Registry.packArgs(Registry.lookupField(149082991182987426L).get(null), true, true);
            long var83 = 633945515680537718L;
            Object[] var82 = var115;
            Ref.h(633945515680537718L, var82, var83);

            try {
               ;
            } catch (InvocationTargetException var87) {
               throw var87.getTargetException();
            }
         }
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var116 = Registry.packArgs(new DY3(this, var10));
      long var85 = 434592463220957006L;
      Object[] var84 = var116;
      Ref.h(434592463220957006L, var84, var85);

      try {
         ;
      } catch (InvocationTargetException var86) {
         throw var86.getTargetException();
      }
   }

   public void F() {
      Address.g();
      boolean var2 = false;
      Object var14 = 540498928662567395L;
      Ref.g(540498928662567395L, var14);
      Connection4 var10003 = (Connection4)(Registry.emptyArgs());
      long var17 = 479006944855319308L;
      Object[] var16 = var10003;
      var10003 = Ref.h(479006944855319308L, var16, var17);

      try {
         var10003 = (Connection4)var10003;
      } catch (InvocationTargetException var60) {
         throw var60.getTargetException();
      }

      Connection4 var3 = var10003;
      var3.setDragEnabled(false);
      Object[] var10004 = Registry.emptyArgs();
      long var19 = 208260183617353218L;
      Object[] var18 = var10004;
      Ref.h(208260183617353218L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var59) {
         throw var59.getTargetException();
      }

      Object[] var10006 = Registry.emptyArgs();
      long var21 = 498856411508641826L;
      Object[] var20 = var10006;
      var10006 = Ref.h(498856411508641826L, var20, var21);
      long var23 = 561963779586225953L;
      Object var22 = var10006;
      Ref.s(561963779586225953L, var22, var23);
      Object var24 = 295254898775337161L;
      int[] var5 = ((Km2)Ref.g(295254898775337161L, var24)).getSelectedRows();
      Object var26 = 295254898775337161L;
      Kl4 var6 = (Kl4)((Km2)Ref.g(295254898775337161L, var26)).getModel();
      int[] var7 = var5;
      int var8 = var5.length;
      Xw2 var1 = this;
      int var9 = 0;

      Kl4 var10008;
      while (true) {
         if (var9 < var8) {
            int var10 = var7[var9];
            Object var28 = 295254898775337161L;
            int var11 = ((Km2)Ref.g(295254898775337161L, var28)).convertRowIndexToModel(var10);
            var10008 = var6;
            Object[] var10009 = Registry.packArgs(var11);
            long var31 = 291710787850444005L;
            Object[] var30 = var10009;
            var10009 = Ref.h(291710787850444005L, var30, var31);

            try {
               var10009 = (Object[])((Object)var10009);
            } catch (InvocationTargetException var58) {
               throw var58.getTargetException();
            }

            Object var12 = var10009;
            Object var32 = 599144936174029496L;
            ((ArrayList)Ref.g(599144936174029496L, var32)).add(var12);
            boolean var10010 = var12.getClass().equals(Tf4.class);
            if (var1 == null) {
               break;
            }

            label109: {
               label119: {
                  if (var1 == null) {
                     if (var10010) {
                        Tf4 var13 = (Tf4)var12;
                        if (var1 == null) {
                           break label109;
                        }
                     }

                     var68 = var12.getClass();
                     if (var1 == null) {
                        break label119;
                     }

                     var10010 = var68.equals(Ck4.class);
                  }

                  if (!var10010) {
      Iterator var68;
      Iterator var68;
                     break label109;
                  }

                  var68 = var12;
               }

               Ck4 var61 = (Ck4)var68;
            }

            var9++;
            if (var1 == null) {
               continue;
            }
         }

         Object var34 = 599144936174029496L;
         var10008 = ((ArrayList)Ref.g(599144936174029496L, var34)).size();
         break;
      }

      if (var1 == null) {
         if (!(var10008 > 0)) {
            return;
         }

         boolean var65 = true;
      }

      Registry.lookupField(619905985051257260L).setInt(this, Registry.lookupField(289676987792490373L).getInt(null));
      this.setVisible(false);
      Registry.emptyArgs();
      long var36 = 270389152141252877L;
      Ref.h2(270389152141252877L, var36);
      Object[] var69 = Registry.emptyArgs();
      long var39 = 306266403902896148L;
      Object[] var38 = var69;
      Ref.h(306266403902896148L, var38, var39);

      try {
         ;
      } catch (InvocationTargetException var57) {
         throw var57.getTargetException();
      }

      Object var40 = 561963779586225953L;
      Object[] var10012 = Registry.packArgs(Ref.g(561963779586225953L, var40));
      long var43 = 633767615784019382L;
      Object[] var42 = var10012;
      Ref.h(633767615784019382L, var42, var43);

      try {
         ;
      } catch (InvocationTargetException var56) {
         throw var56.getTargetException();
      }

      Object[] var10013 = Registry.emptyArgs();
      long var45 = 623400893456259775L;
      Object[] var44 = var10013;
      Ref.h(623400893456259775L, var44, var45);
      Object var46 = 561963779586225953L;
      Object[] var10015 = Registry.packArgs(Ref.g(561963779586225953L, var46));
      long var49 = 586754005152705687L;
      Object[] var48 = var10015;
      Ref.h(586754005152705687L, var48, var49);

      try {
         ;
      } catch (InvocationTargetException var55) {
         throw var55.getTargetException();
      }

      Registry.emptyArgs();
      long var50 = 270389152141252877L;
      Ref.h2(270389152141252877L, var50);
      Object[] var10017 = Registry.emptyArgs();
      long var53 = 578864097947885485L;
      Object[] var52 = var10017;
      Ref.h(578864097947885485L, var52, var53);

      try {
         ;
      } catch (InvocationTargetException var54) {
         throw var54.getTargetException();
      }
   }

   public void O(String var1, boolean var2, boolean var3) {
      Object var4 = 540498928662567395L;
      Ref.g(540498928662567395L, var4);
      Object[] var10002 = Registry.packArgs(var1, var2, var3);
      long var7 = 530353687625151908L;
      Object[] var6 = var10002;
      Ref.h(530353687625151908L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public int V() {
      return Registry.lookupField(619905985051257260L).getInt(this);
   }

   public ArrayList b() {
      Object var1 = 599144936174029496L;
      return (ArrayList)Ref.g(599144936174029496L, var1);
   }

   public String M() {
      Object var1 = 561963779586225953L;
      return (String)Ref.g(561963779586225953L, var1);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 2089) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 130;
               break;
            case 1:
               var10000 = 149;
               break;
            case 2:
               var10000 = 230;
               break;
            case 3:
               var10000 = 41;
               break;
            case 4:
               var10000 = 151;
               break;
            case 5:
               var10000 = 50;
               break;
            case 6:
               var10000 = 225;
               break;
            case 7:
               var10000 = 199;
               break;
            case 8:
               var10000 = 142;
               break;
            case 9:
               var10000 = 237;
               break;
            case 10:
               var10000 = 60;
               break;
            case 11:
               var10000 = 211;
               break;
            case 12:
               var10000 = 19;
               break;
            case 13:
               var10000 = 201;
               break;
            case 14:
               var10000 = 179;
               break;
            case 15:
               var10000 = 216;
               break;
            case 16:
               var10000 = 135;
               break;
            case 17:
               var10000 = 112;
               break;
            case 18:
               var10000 = 197;
               break;
            case 19:
               var10000 = 131;
               break;
            case 20:
               var10000 = 33;
               break;
            case 21:
               var10000 = 249;
               break;
            case 22:
               var10000 = 11;
               break;
            case 23:
               var10000 = 196;
               break;
            case 24:
               var10000 = 183;
               break;
            case 25:
               var10000 = 140;
               break;
            case 26:
               var10000 = 124;
               break;
            case 27:
               var10000 = 66;
               break;
            case 28:
               var10000 = 235;
               break;
            case 29:
               var10000 = 250;
               break;
            case 30:
               var10000 = 122;
               break;
            case 31:
               var10000 = 48;
               break;
            case 32:
               var10000 = 156;
               break;
            case 33:
               var10000 = 208;
               break;
            case 34:
               var10000 = 107;
               break;
            case 35:
               var10000 = 88;
               break;
            case 36:
               var10000 = 155;
               break;
            case 37:
               var10000 = 185;
               break;
            case 38:
               var10000 = 93;
               break;
            case 39:
               var10000 = 74;
               break;
            case 40:
               var10000 = 5;
               break;
            case 41:
               var10000 = 204;
               break;
            case 42:
               var10000 = 64;
               break;
            case 43:
               var10000 = 54;
               break;
            case 44:
               var10000 = 61;
               break;
            case 45:
               var10000 = 69;
               break;
            case 46:
               var10000 = 163;
               break;
            case 47:
               var10000 = 222;
               break;
            case 48:
               var10000 = 84;
               break;
            case 49:
               var10000 = 113;
               break;
            case 50:
               var10000 = 229;
               break;
            case 51:
               var10000 = 128;
               break;
            case 52:
               var10000 = 157;
               break;
            case 53:
               var10000 = 254;
               break;
            case 54:
               var10000 = 248;
               break;
            case 55:
               var10000 = 1;
               break;
            case 56:
               var10000 = 36;
               break;
            case 57:
               var10000 = 28;
               break;
            case 58:
               var10000 = 241;
               break;
            case 59:
               var10000 = 68;
               break;
            case 60:
               var10000 = 45;
               break;
            case 61:
               var10000 = 172;
               break;
            case 62:
               var10000 = 104;
               break;
            case 63:
               var10000 = 72;
               break;
            case 64:
               var10000 = 220;
               break;
            case 65:
               var10000 = 49;
               break;
            case 66:
               var10000 = 35;
               break;
            case 67:
               var10000 = 145;
               break;
            case 68:
               var10000 = 65;
               break;
            case 69:
               var10000 = 158;
               break;
            case 70:
               var10000 = 17;
               break;
            case 71:
               var10000 = 227;
               break;
            case 72:
               var10000 = 233;
               break;
            case 73:
               var10000 = 75;
               break;
            case 74:
               var10000 = 0;
               break;
            case 75:
               var10000 = 97;
               break;
            case 76:
               var10000 = 59;
               break;
            case 77:
               var10000 = 111;
               break;
            case 78:
               var10000 = 251;
               break;
            case 79:
               var10000 = 212;
               break;
            case 80:
               var10000 = 23;
               break;
            case 81:
               var10000 = 8;
               break;
            case 82:
               var10000 = 191;
               break;
            case 83:
               var10000 = 24;
               break;
            case 84:
               var10000 = 47;
               break;
            case 85:
               var10000 = 226;
               break;
            case 86:
               var10000 = 238;
               break;
            case 87:
               var10000 = 46;
               break;
            case 88:
               var10000 = 18;
               break;
            case 89:
               var10000 = 4;
               break;
            case 90:
               var10000 = 26;
               break;
            case 91:
               var10000 = 127;
               break;
            case 92:
               var10000 = 89;
               break;
            case 93:
               var10000 = 228;
               break;
            case 94:
               var10000 = 55;
               break;
            case 95:
               var10000 = 21;
               break;
            case 96:
               var10000 = 56;
               break;
            case 97:
               var10000 = 9;
               break;
            case 98:
               var10000 = 188;
               break;
            case 99:
               var10000 = 160;
               break;
            case 100:
               var10000 = 189;
               break;
            case 101:
               var10000 = 181;
               break;
            case 102:
               var10000 = 210;
               break;
            case 103:
               var10000 = 209;
               break;
            case 104:
               var10000 = 22;
               break;
            case 105:
               var10000 = 176;
               break;
            case 106:
               var10000 = 164;
               break;
            case 107:
               var10000 = 15;
               break;
            case 108:
               var10000 = 213;
               break;
            case 109:
               var10000 = 70;
               break;
            case 110:
               var10000 = 52;
               break;
            case 111:
               var10000 = 91;
               break;
            case 112:
               var10000 = 42;
               break;
            case 113:
               var10000 = 148;
               break;
            case 114:
               var10000 = 190;
               break;
            case 115:
               var10000 = 223;
               break;
            case 116:
               var10000 = 110;
               break;
            case 117:
               var10000 = 10;
               break;
            case 118:
               var10000 = 80;
               break;
            case 119:
               var10000 = 103;
               break;
            case 120:
               var10000 = 109;
               break;
            case 121:
               var10000 = 239;
               break;
            case 122:
               var10000 = 114;
               break;
            case 123:
               var10000 = 186;
               break;
            case 124:
               var10000 = 102;
               break;
            case 125:
               var10000 = 37;
               break;
            case 126:
               var10000 = 200;
               break;
            case 127:
               var10000 = 147;
               break;
            case 128:
               var10000 = 180;
               break;
            case 129:
               var10000 = 31;
               break;
            case 130:
               var10000 = 7;
               break;
            case 131:
               var10000 = 81;
               break;
            case 132:
               var10000 = 67;
               break;
            case 133:
               var10000 = 106;
               break;
            case 134:
               var10000 = 167;
               break;
            case 135:
               var10000 = 219;
               break;
            case 136:
               var10000 = 43;
               break;
            case 137:
               var10000 = 132;
               break;
            case 138:
               var10000 = 198;
               break;
            case 139:
               var10000 = 119;
               break;
            case 140:
               var10000 = 150;
               break;
            case 141:
               var10000 = 221;
               break;
            case 142:
               var10000 = 170;
               break;
            case 143:
               var10000 = 96;
               break;
            case 144:
               var10000 = 202;
               break;
            case 145:
               var10000 = 153;
               break;
            case 146:
               var10000 = 175;
               break;
            case 147:
               var10000 = 247;
               break;
            case 148:
               var10000 = 94;
               break;
            case 149:
               var10000 = 243;
               break;
            case 150:
               var10000 = 138;
               break;
            case 151:
               var10000 = 152;
               break;
            case 152:
               var10000 = 245;
               break;
            case 153:
               var10000 = 92;
               break;
            case 154:
               var10000 = 159;
               break;
            case 155:
               var10000 = 207;
               break;
            case 156:
               var10000 = 71;
               break;
            case 157:
               var10000 = 120;
               break;
            case 158:
               var10000 = 234;
               break;
            case 159:
               var10000 = 134;
               break;
            case 160:
               var10000 = 136;
               break;
            case 161:
               var10000 = 87;
               break;
            case 162:
               var10000 = 100;
               break;
            case 163:
               var10000 = 154;
               break;
            case 164:
               var10000 = 82;
               break;
            case 165:
               var10000 = 169;
               break;
            case 166:
               var10000 = 108;
               break;
            case 167:
               var10000 = 171;
               break;
            case 168:
               var10000 = 40;
               break;
            case 169:
               var10000 = 90;
               break;
            case 170:
               var10000 = 133;
               break;
            case 171:
               var10000 = 29;
               break;
            case 172:
               var10000 = 44;
               break;
            case 173:
               var10000 = 187;
               break;
            case 174:
               var10000 = 121;
               break;
            case 175:
               var10000 = 162;
               break;
            case 176:
               var10000 = 252;
               break;
            case 177:
               var10000 = 143;
               break;
            case 178:
               var10000 = 255;
               break;
            case 179:
               var10000 = 16;
               break;
            case 180:
               var10000 = 38;
               break;
            case 181:
               var10000 = 194;
               break;
            case 182:
               var10000 = 215;
               break;
            case 183:
               var10000 = 58;
               break;
            case 184:
               var10000 = 182;
               break;
            case 185:
               var10000 = 32;
               break;
            case 186:
               var10000 = 53;
               break;
            case 187:
               var10000 = 177;
               break;
            case 188:
               var10000 = 231;
               break;
            case 189:
               var10000 = 253;
               break;
            case 190:
               var10000 = 141;
               break;
            case 191:
               var10000 = 139;
               break;
            case 192:
               var10000 = 116;
               break;
            case 193:
               var10000 = 203;
               break;
            case 194:
               var10000 = 27;
               break;
            case 195:
               var10000 = 165;
               break;
            case 196:
               var10000 = 174;
               break;
            case 197:
               var10000 = 57;
               break;
            case 198:
               var10000 = 3;
               break;
            case 199:
               var10000 = 95;
               break;
            case 200:
               var10000 = 39;
               break;
            case 201:
               var10000 = 73;
               break;
            case 202:
               var10000 = 161;
               break;
            case 203:
               var10000 = 20;
               break;
            case 204:
               var10000 = 244;
               break;
            case 205:
               var10000 = 101;
               break;
            case 206:
               var10000 = 195;
               break;
            case 207:
               var10000 = 76;
               break;
            case 208:
               var10000 = 214;
               break;
            case 209:
               var10000 = 30;
               break;
            case 210:
               var10000 = 232;
               break;
            case 211:
               var10000 = 98;
               break;
            case 212:
               var10000 = 77;
               break;
            case 213:
               var10000 = 6;
               break;
            case 214:
               var10000 = 14;
               break;
            case 215:
               var10000 = 105;
               break;
            case 216:
               var10000 = 173;
               break;
            case 217:
               var10000 = 126;
               break;
            case 218:
               var10000 = 192;
               break;
            case 219:
               var10000 = 184;
               break;
            case 220:
               var10000 = 118;
               break;
            case 221:
               var10000 = 218;
               break;
            case 222:
               var10000 = 2;
               break;
            case 223:
               var10000 = 193;
               break;
            case 224:
               var10000 = 129;
               break;
            case 225:
               var10000 = 242;
               break;
            case 226:
               var10000 = 78;
               break;
            case 227:
               var10000 = 86;
               break;
            case 228:
               var10000 = 137;
               break;
            case 229:
               var10000 = 205;
               break;
            case 230:
               var10000 = 115;
               break;
            case 231:
               var10000 = 246;
               break;
            case 232:
               var10000 = 51;
               break;
            case 233:
               var10000 = 12;
               break;
            case 234:
               var10000 = 117;
               break;
            case 235:
               var10000 = 166;
               break;
            case 236:
               var10000 = 217;
               break;
            case 237:
               var10000 = 99;
               break;
            case 238:
               var10000 = 236;
               break;
            case 239:
               var10000 = 125;
               break;
            case 240:
               var10000 = 85;
               break;
            case 241:
               var10000 = 13;
               break;
            case 242:
               var10000 = 62;
               break;
            case 243:
               var10000 = 240;
               break;
            case 244:
               var10000 = 224;
               break;
            case 245:
               var10000 = 123;
               break;
            case 246:
               var10000 = 34;
               break;
            case 247:
               var10000 = 63;
               break;
            case 248:
               var10000 = 25;
               break;
            case 249:
               var10000 = 206;
               break;
            case 250:
               var10000 = 144;
               break;
            case 251:
               var10000 = 178;
               break;
            case 252:
               var10000 = 168;
               break;
            case 253:
               var10000 = 79;
               break;
            case 254:
               var10000 = 146;
               break;
            default:
               var10000 = 83;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8220;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[20];
      int var11 = 0;
      String var10 = "¨©z\u0002\u009a\u000e\u008a3íÜû\ntÞÈSaæ\u0003\u000b\u0004遭抳丄俾EWqaÿhÔqClN\u009aæÕf\b#á\u0018¾C\u0006wéeìè¶a\u000fnÇÚ×Ý@\tçÁ\u0080ºP\u0086\u0015ù)îaöP\u0007HÆ\u001e÷ED\u001ag£\u0090öR\u000fUÈ!È`2\u001cj\u0004âzY\u0097yE xTßè¹hB@]\u009dZJý¨0j-Ç`\u0002磮孜\u00068\u0012\u008døÒ_\u001b'\u001dKYl«\u009c\u0086°æ¬{[ë\u001e\b\u008e\u0014DstØÊ\u0094#¹I\u0004Ò´)¦!n ¢#\u0081úñ6\u0098\u0006\u0094Z\u0098Z\\9\u0080\u0081h\u000f\u0098_]1ÂÅ\u007fÇqEà\u0014-\u0002及淟\u0005R½Áf|\u0005\u009f xÅK\u0007柄迯所彪料亐妬\u000eqp\u0092´\u0014\u0007\u0089\u007fwg\u0096`ýÛ\f\u0080+\u000b\u0000ö´ãÑò1Ä7\u000e/ÞYam½¦(\u0092\u0088*8jÐ\u00167g\u0089ÛäåMÎ\u0016b>¹¸õ\u0087\u0017ÒÏ\u007f\tÆß";
      int var12 = "¨©z\u0002\u009a\u000e\u008a3íÜû\ntÞÈSaæ\u0003\u000b\u0004遭抳丄俾EWqaÿhÔqClN\u009aæÕf\b#á\u0018¾C\u0006wéeìè¶a\u000fnÇÚ×Ý@\tçÁ\u0080ºP\u0086\u0015ù)îaöP\u0007HÆ\u001e÷ED\u001ag£\u0090öR\u000fUÈ!È`2\u001cj\u0004âzY\u0097yE xTßè¹hB@]\u009dZJý¨0j-Ç`\u0002磮孜\u00068\u0012\u008døÒ_\u001b'\u001dKYl«\u009c\u0086°æ¬{[ë\u001e\b\u008e\u0014DstØÊ\u0094#¹I\u0004Ò´)¦!n ¢#\u0081úñ6\u0098\u0006\u0094Z\u0098Z\\9\u0080\u0081h\u000f\u0098_]1ÂÅ\u007fÇqEà\u0014-\u0002及淟\u0005R½Áf|\u0005\u009f xÅK\u0007柄迯所彪料亐妬\u000eqp\u0092´\u0014\u0007\u0089\u007fwg\u0096`ýÛ\f\u0080+\u000b\u0000ö´ãÑò1Ä7\u000e/ÞYam½¦(\u0092\u0088*8jÐ\u00167g\u0089ÛäåMÎ\u0016b>¹¸õ\u0087\u0017ÒÏ\u007f\tÆß"
         .length();
      char var9 = 5;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 122;
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
                        var65 = 108;
                        break;
                     case 1:
                        var65 = 26;
                        break;
                     case 2:
                        var65 = 51;
                        break;
                     case 3:
                        var65 = 10;
                        break;
                     case 4:
                        var65 = 124;
                        break;
                     case 5:
                        var65 = 95;
                        break;
                     default:
                        var65 = 107;
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
                     b = new String[20];
                     long var0 = 7211576444534439782L;
                     long[] var6 = new long[11];
                     int var3 = 0;
                     String var4 = "\u0088û\u0094\u0090Éyì\u001f!\u0010q\u008dè¸»\u0093\u0099HV\u0013\u0007ÉÉ\by´?7\u0014.\u008fÐCo)ß\u0011#)\u0083¸Å\u001bÅ\u0097÷§2Cç¿\u0097\u0018\u008a´-Kw\u0091µ8Û4\u0085ù\nKê_\u0094çE";
                     int var5 = "\u0088û\u0094\u0090Éyì\u001f!\u0010q\u008dè¸»\u0093\u0099HV\u0013\u0007ÉÉ\by´?7\u0014.\u008fÐCo)ß\u0011#)\u0083¸Å\u001bÅ\u0097÷§2Cç¿\u0097\u0018\u008a´-Kw\u0091µ8Û4\u0085ù\nKê_\u0094çE"
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
                                    e = new Integer[11];
                                    Registry.lookupField(289676987792490373L).setInt(null, a(14469, 950826309972072604L));
                                    Registry.lookupField(265275935393846693L).setInt(null, a(10877, 8726491596746787431L));
                                    Registry.lookupField(599401513125029986L).setInt(null, a(10157, 198593035124672443L));
                                    Registry.lookupField(311183796363677834L).setInt(null, a(12977, 5024318658901414569L));
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u0098\u009dµ\u0017ñ\u001a×±}\u0003\u0010Xfu»5";
                                 var5 = "\u0098\u009dµ\u0017ñ\u001a×±}\u0003\u0010Xfu»5".length();
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

                  var10 = "lâåw!Ù½O\u009b'ö>¬zNÓHk\u00039\t7\u009c\u0085·>S\u0092« \u008d8Õ\u0082\u001c\u0085$\u009a";
                  var12 = "lâåw!Ù½O\u009b'ö>¬zNÓHk\u00039\t7\u009c\u0085·>S\u0092« \u008d8Õ\u0082\u001c\u0085$\u009a".length();
                  var9 = 4;
                  var17 = -1;
            }

            var10000 = 98;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}






