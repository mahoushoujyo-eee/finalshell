package com.finalshell.ui.panel;

import com.finalshell.core.CS;
import com.finalshell.core.Dv2;
import com.finalshell.core.Dx4_2;
import com.finalshell.core.L1;
import com.finalshell.core.Lj4_2;
import com.finalshell.core.OJ3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Fw2;
import com.finalshell.ui.listener.Of_4;
import com.finalshell.ui.listener.TS;
import java.awt.Color;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

public class EditPanel extends JPanel {
   public AppendCarriageReturnCRPanel L;
   public JLabel a;
   public JLabel G;
   public ArrayList j;
   public Lj4_2 J;
   public Copy3 u;
   public JPanel P;
   public static String[] b;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public EditPanel(AppendCarriageReturnCRPanel var1) {
      ArrayList var10001 = new ArrayList();
      long var12 = 584619567951220222L;
      ArrayList var11 = var10001;
      Ref.s(584619567951220222L, var11, var12);
      AppendCarriageReturnCRPanel.Y();
      long var14 = 562502632945222151L;
      Ref.s(562502632945222151L, var1, var14);
      this.setBackground(new Color(a(12552, 8839153764368034356L), a(29104, 8826966808744618637L), a(29104, 8826966808744618637L)));
      this.setLayout(new MigLayout(a(1269, -2753), a(1276, -24752), a(1270, 9217)));
      JPanel var3 = new JPanel();
      var3.setOpaque(false);
      var3.setLayout(new MigLayout(a(1265, -6788), a(1268, 17258), a(1270, 9217)));
      this.add(var3, a(1278, 21328));
      JLabel var10004 = new JLabel();
      long var16 = 396374395717633047L;
      JLabel var15 = var10004;
      Ref.s(396374395717633047L, var15, var16);
      Object var17 = 396374395717633047L;
      ((JLabel)Ref.g(396374395717633047L, var17))
         .setFont(new Font((String)Registry.lookupField(523981883291410284L).get(null), 1, a(8329, 7147429178051017655L)));
      Object var19 = 396374395717633047L;
      ((JLabel)Ref.g(396374395717633047L, var19))
         .setBackground(new Color(a(7543, 4424724887623665230L), a(3772, 8104324031391503747L), a(15651, 8878192665410086424L)));
      Object var21 = 396374395717633047L;
      ((JLabel)Ref.g(396374395717633047L, var21)).setForeground(Color.white);
      Object var23 = 396374395717633047L;
      ((JLabel)Ref.g(396374395717633047L, var23)).setOpaque(true);
      Object var25 = 396374395717633047L;
      ((JLabel)Ref.g(396374395717633047L, var25))
         .setBorder(BorderFactory.createEmptyBorder(2, a(9435, 8604390446749990881L), 3, a(26321, 1581774741442919913L)));
      Object var27 = 396374395717633047L;
      this.add((JLabel)Ref.g(396374395717633047L, var27), a(1279, -6425));
      JLabel var10011 = new JLabel();
      long var30 = 608082533723237713L;
      JLabel var29 = var10011;
      Ref.s(608082533723237713L, var29, var30);
      EditPanel var2 = this;
      Object var31 = 608082533723237713L;
      this.add((JLabel)Ref.g(608082533723237713L, var31), a(1264, -9156));
      JButton var4 = new JButton(a(1271, 20169));
      var3.add(var4, "");
      var4.addActionListener(new TS(this));
      int var5 = 0;

      while (true) {
         if (var5 < Registry.lookupField(216182060077896093L).getInt(null)) {
            String var6 = "#" + (var5 + 1);
            JLabel var7 = new JLabel();
            Registry.packArgs("");
            long var33 = 479240045929603103L;
            Object var10012 = Ref.h2(479240045929603103L, var33);

            try {
               var10012 = (Dv2)var10012;
            } catch (InvocationTargetException var45) {
               throw var45.getTargetException();
            }

            Dv2 var8 = (Dv2)var10012;
            var8.setForeground(Color.black);
            Fw2 var9 = new Fw2(var6, this, var8);
            var8.addActionListener(new Of_4(this));
            OJ3 var10 = new OJ3(this, var9, var6, var7, var8);
            Object var35 = 584619567951220222L;
            ((ArrayList)Ref.g(584619567951220222L, var35)).add(var10);
            var5++;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         JPanel var47 = new JPanel();
         long var38 = 236559307586037520L;
         JPanel var37 = var47;
         Ref.s(236559307586037520L, var37, var38);
         Object var39 = 236559307586037520L;
         ((JPanel)Ref.g(236559307586037520L, var39)).setOpaque(false);
         Object var41 = 236559307586037520L;
         ((JPanel)Ref.g(236559307586037520L, var41)).setLayout(new MigLayout(a(1277, 18657), a(1270, 9217), a(1270, 9217)));
         Object var43 = 236559307586037520L;
         this.add((JPanel)Ref.g(236559307586037520L, var43), a(1267, -22608));
         break;
      }
   }

   public void q() {
      AppendCarriageReturnCRPanel.Y();
      Object var5 = 376006859484345408L;
      Lj4_2 var2 = (Lj4_2)Ref.g(376006859484345408L, var5);
      EditPanel var1 = this;
      if (this != null) {
         Object var11 = 584619567951220222L;

         for (OJ3 var4 : (ArrayList)Ref.g(584619567951220222L, var11)) {
            Object[] var24 = Registry.emptyArgs();
            long var14 = 618768380564905662L;
            Object[] var13 = var24;
            Ref.h(618768380564905662L, var13, var14);
            Object[] var10005 = Registry.emptyArgs();
            long var16 = 618768380564905662L;
            Object[] var15 = var10005;
            Ref.h(618768380564905662L, var15, var16);
            Dv2 var10006 = (Dv2)(Registry.emptyArgs());
            long var18 = 444392071806916948L;
            Object[] var17 = var10006;
            var10006 = Ref.h(444392071806916948L, var17, var18);

            try {
               var10006 = (Dv2)var10006;
            } catch (InvocationTargetException var22) {
               throw var22.getTargetException();
            }

            var10006 = Registry.packArgs(var10006.getText());
            long var20 = 183637464897772936L;
            Object[] var19 = var10006;
            Ref.h(183637464897772936L, var19, var20);

            try {
               ;
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            if (var1 != null) {
               break;
            }
         }
      } else if (var2 != null) {
         Object var7 = 562502632945222151L;
         Ref.g(562502632945222151L, var7);
         Object[] var10003 = Registry.packArgs(var2);
         long var10 = 164326793235876733L;
         Object[] var9 = var10003;
         Ref.h(164326793235876733L, var9, var10);

         label37:
         try {
            break label37;
         } catch (InvocationTargetException var23) {
            throw var23.getTargetException();
         }
      }
   }

   public void T(Lj4_2 var1) {
      AppendCarriageReturnCRPanel.Y();
      long var11 = 376006859484345408L;
      Ref.s(376006859484345408L, var1, var11);
      Object var12 = 396374395717633047L;
      JLabel var10003 = (JLabel)Ref.g(396374395717633047L, var12);
      String var10005 = (String)(Registry.emptyArgs());
      long var15 = 286931176286176762L;
      Object[] var14 = var10005;
      var10005 = Ref.h(286931176286176762L, var14, var15);

      try {
         var10005 = (String)var10005;
      } catch (InvocationTargetException var100) {
         throw var100.getTargetException();
      }

      var1.setText(var10005);
      JLabel var2 = var10003;
      Object var16 = 608082533723237713L;
      JLabel var10004 = (JLabel)Ref.g(608082533723237713L, var16);
      String var10006 = (String)(Registry.emptyArgs());
      long var19 = 547398689030025911L;
      Object[] var18 = var10006;
      var10006 = Ref.h(547398689030025911L, var18, var19);

      try {
         var10006 = (String)var10006;
      } catch (InvocationTargetException var99) {
         throw var99.getTargetException();
      }

      var1.setText(var10006);
      var10006 = Registry.emptyArgs();
      long var21 = 384035338232698498L;
      Object[] var20 = var10006;
      var10006 = Ref.h(384035338232698498L, var20, var21);

      try {
         var10006 = (ArrayList)var10006;
      } catch (InvocationTargetException var98) {
         throw var98.getTargetException();
      }

      ArrayList var3 = var10006;
      Object var22 = 584619567951220222L;

      for (OJ3 var5 : (ArrayList)Ref.g(584619567951220222L, var22)) {
         Object var24 = 236559307586037520L;
         JPanel var10008 = (JPanel)Ref.g(236559307586037520L, var24);
         JLabel var10010 = (JLabel)(Registry.emptyArgs());
         long var27 = 118615872545397619L;
         Object[] var26 = var10010;
         var10010 = Ref.h(118615872545397619L, var26, var27);

         try {
            var10010 = (JLabel)var10010;
         } catch (InvocationTargetException var97) {
            throw var97.getTargetException();
         }

         var5.remove(var10010);
         Object var28 = 236559307586037520L;
         JPanel var112 = (JPanel)Ref.g(236559307586037520L, var28);
         JTextField var10012 = (JTextField)(Registry.emptyArgs());
         long var31 = 221314680238633888L;
         Object[] var30 = var10012;
         var10012 = Ref.h(221314680238633888L, var30, var31);

         try {
            var10012 = (JTextField)var10012;
         } catch (InvocationTargetException var96) {
            throw var96.getTargetException();
         }

         var5.remove(var10012);
         var10012 = Registry.packArgs("");
         long var33 = 574096403321140047L;
         Object[] var32 = var10012;
         Ref.h(574096403321140047L, var32, var33);

         try {
            ;
         } catch (InvocationTargetException var95) {
            throw var95.getTargetException();
         }

         if (var2 != null) {
            break;
         }
      }

      int var101 = 0;
      HashSet var102 = new HashSet();

      for (CS var7 : var3) {
         Object var34 = 584619567951220222L;
         OJ3 var8 = (OJ3)((ArrayList)Ref.g(584619567951220222L, var34)).get(var101);
         String var113 = (String)(Registry.emptyArgs());
         long var37 = 452972440898270588L;
         Object[] var36 = var113;
         var113 = Ref.h(452972440898270588L, var36, var37);

         try {
            var113 = (String)var113;
         } catch (InvocationTargetException var94) {
            throw var94.getTargetException();
         }

         boolean var10009 = var7.contains(var113);
         if (var2 == null) {
            if (var10009 && var2 == null) {
               continue;
            }

            String var10011 = (String)(Registry.emptyArgs());
            long var39 = 452972440898270588L;
            Object[] var38 = var10011;
            var10011 = Ref.h(452972440898270588L, var38, var39);

            try {
               var10011 = (String)var10011;
            } catch (InvocationTargetException var93) {
               throw var93.getTargetException();
            }

            var7.add(var10011);
         }

         var113 = Registry.emptyArgs();
         long var41 = 118615872545397619L;
         Object[] var40 = var113;
         Ref.h(118615872545397619L, var40, var41);

         try {
            ;
         } catch (InvocationTargetException var92) {
            throw var92.getTargetException();
         }

         StringBuilder var119 = new StringBuilder();
         String var10013 = (String)(Registry.emptyArgs());
         long var43 = 154853555769629536L;
         Object[] var42 = var10013;
         var10013 = Ref.h(154853555769629536L, var42, var43);

         try {
            var10013 = (String)var10013;
         } catch (InvocationTargetException var91) {
            throw var91.getTargetException();
         }

         var119.setText(var7.append((String)var10013).append(" ").toString());
         JTextField var123 = Registry.emptyArgs();
         long var45 = 221314680238633888L;
         Object[] var44 = var123;
         var123 = Ref.h(221314680238633888L, var44, var45);

         try {
            var123 = (JTextField)var123;
         } catch (InvocationTargetException var90) {
            throw var90.getTargetException();
         }

         var123.setText("");
         var10013 = Registry.emptyArgs();
         long var47 = 618768380564905662L;
         Object[] var46 = var10013;
         Ref.h(618768380564905662L, var46, var47);
         Object[] var10014 = Registry.packArgs(var1);
         long var49 = 301014203256957327L;
         Object[] var48 = var10014;
         Ref.h(301014203256957327L, var48, var49);

         try {
            ;
         } catch (InvocationTargetException var89) {
            throw var89.getTargetException();
         }

         Object[] var10015 = Registry.emptyArgs();
         long var51 = 618768380564905662L;
         Object[] var50 = var10015;
         Ref.h(618768380564905662L, var50, var51);
         Object[] var10017 = Registry.emptyArgs();
         long var53 = 452972440898270588L;
         Object[] var52 = var10017;
         var10017 = Registry.packArgs(Ref.h(452972440898270588L, var52, var53));
         long var55 = 361977656573465404L;
         Object[] var54 = var10017;
         Ref.h(361977656573465404L, var54, var55);

         try {
            ;
         } catch (InvocationTargetException var88) {
            throw var88.getTargetException();
         }

         Object[] var10019 = Registry.emptyArgs();
         long var57 = 452972440898270588L;
         Object[] var56 = var10019;
         var10019 = Registry.packArgs(Ref.h(452972440898270588L, var56, var57));
         long var59 = 574096403321140047L;
         Object[] var58 = var10019;
         Ref.h(574096403321140047L, var58, var59);

         try {
            ;
         } catch (InvocationTargetException var87) {
            throw var87.getTargetException();
         }

         Object var60 = 236559307586037520L;
         JPanel var10020 = (JPanel)Ref.g(236559307586037520L, var60);
         JLabel var10022 = (JLabel)(Registry.emptyArgs());
         long var63 = 118615872545397619L;
         Object[] var62 = var10022;
         var10022 = Ref.h(118615872545397619L, var62, var63);

         try {
            var10022 = (JLabel)var10022;
         } catch (InvocationTargetException var86) {
            throw var86.getTargetException();
         }

         var8.add(var10022, a(1266, 18965));
         Object var64 = 236559307586037520L;
         JPanel var133 = (JPanel)Ref.g(236559307586037520L, var64);
         JTextField var10024 = (JTextField)(Registry.emptyArgs());
         long var67 = 221314680238633888L;
         Object[] var66 = var10024;
         var10024 = Ref.h(221314680238633888L, var66, var67);

         try {
            var10024 = (JTextField)var10024;
         } catch (InvocationTargetException var85) {
            throw var85.getTargetException();
         }

         var8.add(var10024, a(1273, -16599));
         Dx4_2 var10025 = (Dx4_2)(Registry.emptyArgs());
         long var69 = 257102191814086367L;
         Object[] var68 = var10025;
         var10025 = Registry.packArgs(Ref.h(257102191814086367L, var68, var69));
         long var71 = 242040625560871861L;
         Object[] var70 = var10025;
         var10025 = Ref.h(242040625560871861L, var70, var71);

         try {
            var10025 = (Dx4_2)var10025;
         } catch (InvocationTargetException var84) {
            throw var84.getTargetException();
         }

         Dx4_2 var9 = var10025;
         if (var2 == null) {
            if (var9 != null) {
               ArrayList var10026 = (ArrayList)(Registry.emptyArgs());
               long var73 = 596400151700218172L;
               Object[] var72 = var10026;
               var10026 = Ref.h(596400151700218172L, var72, var73);

               try {
                  var10026 = (ArrayList)var10026;
               } catch (InvocationTargetException var83) {
                  throw var83.getTargetException();
               }

               if (var10026.size() > 0) {
                  Object[] var10027 = Registry.emptyArgs();
                  long var75 = 221314680238633888L;
                  Object[] var74 = var10027;
                  Ref.h(221314680238633888L, var74, var75);

                  try {
                     ;
                  } catch (InvocationTargetException var82) {
                     throw var82.getTargetException();
                  }

                  ArrayList var10029 = Registry.emptyArgs();
                  long var77 = 596400151700218172L;
                  Object[] var76 = var10029;
                  var10029 = Ref.h(596400151700218172L, var76, var77);

                  try {
                     var10029 = (ArrayList)var10029;
                  } catch (InvocationTargetException var81) {
                     throw var81.getTargetException();
                  }

                  L1 var143 = (L1)var10029.get(0);
                  String var10030 = (String)(Registry.emptyArgs());
                  long var79 = 542058094445767607L;
                  Object[] var78 = var10030;
                  var10030 = Ref.h(542058094445767607L, var78, var79);

                  try {
                     var10030 = (String)var10030;
                  } catch (InvocationTargetException var80) {
                     throw var80.getTargetException();
                  }

                  var143.setText(var10030);
               }
            }

            var101++;
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public ArrayList e() {
      Object var1 = 584619567951220222L;
      return (ArrayList)Ref.g(584619567951220222L, var1);
   }

   public void z(ArrayList var1) {
      long var3 = 584619567951220222L;
      Ref.s(584619567951220222L, var1, var3);
   }

   public Copy3 R() {
      Object var1 = 329993788740527022L;
      return (Copy3)Ref.g(329993788740527022L, var1);
   }

   public void z(Copy3 var1) {
      long var3 = 329993788740527022L;
      Ref.s(329993788740527022L, var1, var3);
   }

   public Lj4_2 c() {
      Object var1 = 376006859484345408L;
      return (Lj4_2)Ref.g(376006859484345408L, var1);
   }

   public void y(Lj4_2 var1) {
      long var3 = 376006859484345408L;
      Ref.s(376006859484345408L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 1269) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 112;
               break;
            case 1:
               var10000 = 215;
               break;
            case 2:
               var10000 = 59;
               break;
            case 3:
               var10000 = 185;
               break;
            case 4:
               var10000 = 136;
               break;
            case 5:
               var10000 = 203;
               break;
            case 6:
               var10000 = 78;
               break;
            case 7:
               var10000 = 10;
               break;
            case 8:
               var10000 = 28;
               break;
            case 9:
               var10000 = 245;
               break;
            case 10:
               var10000 = 104;
               break;
            case 11:
               var10000 = 97;
               break;
            case 12:
               var10000 = 246;
               break;
            case 13:
               var10000 = 3;
               break;
            case 14:
               var10000 = 180;
               break;
            case 15:
               var10000 = 177;
               break;
            case 16:
               var10000 = 146;
               break;
            case 17:
               var10000 = 157;
               break;
            case 18:
               var10000 = 197;
               break;
            case 19:
               var10000 = 193;
               break;
            case 20:
               var10000 = 249;
               break;
            case 21:
               var10000 = 225;
               break;
            case 22:
               var10000 = 172;
               break;
            case 23:
               var10000 = 152;
               break;
            case 24:
               var10000 = 234;
               break;
            case 25:
               var10000 = 64;
               break;
            case 26:
               var10000 = 218;
               break;
            case 27:
               var10000 = 50;
               break;
            case 28:
               var10000 = 27;
               break;
            case 29:
               var10000 = 175;
               break;
            case 30:
               var10000 = 88;
               break;
            case 31:
               var10000 = 29;
               break;
            case 32:
               var10000 = 190;
               break;
            case 33:
               var10000 = 74;
               break;
            case 34:
               var10000 = 129;
               break;
            case 35:
               var10000 = 117;
               break;
            case 36:
               var10000 = 91;
               break;
            case 37:
               var10000 = 14;
               break;
            case 38:
               var10000 = 111;
               break;
            case 39:
               var10000 = 96;
               break;
            case 40:
               var10000 = 120;
               break;
            case 41:
               var10000 = 254;
               break;
            case 42:
               var10000 = 148;
               break;
            case 43:
               var10000 = 54;
               break;
            case 44:
               var10000 = 51;
               break;
            case 45:
               var10000 = 22;
               break;
            case 46:
               var10000 = 255;
               break;
            case 47:
               var10000 = 173;
               break;
            case 48:
               var10000 = 134;
               break;
            case 49:
               var10000 = 238;
               break;
            case 50:
               var10000 = 30;
               break;
            case 51:
               var10000 = 128;
               break;
            case 52:
               var10000 = 138;
               break;
            case 53:
               var10000 = 118;
               break;
            case 54:
               var10000 = 15;
               break;
            case 55:
               var10000 = 230;
               break;
            case 56:
               var10000 = 237;
               break;
            case 57:
               var10000 = 13;
               break;
            case 58:
               var10000 = 1;
               break;
            case 59:
               var10000 = 247;
               break;
            case 60:
               var10000 = 19;
               break;
            case 61:
               var10000 = 107;
               break;
            case 62:
               var10000 = 189;
               break;
            case 63:
               var10000 = 6;
               break;
            case 64:
               var10000 = 131;
               break;
            case 65:
               var10000 = 140;
               break;
            case 66:
               var10000 = 75;
               break;
            case 67:
               var10000 = 46;
               break;
            case 68:
               var10000 = 192;
               break;
            case 69:
               var10000 = 221;
               break;
            case 70:
               var10000 = 168;
               break;
            case 71:
               var10000 = 167;
               break;
            case 72:
               var10000 = 119;
               break;
            case 73:
               var10000 = 53;
               break;
            case 74:
               var10000 = 236;
               break;
            case 75:
               var10000 = 113;
               break;
            case 76:
               var10000 = 150;
               break;
            case 77:
               var10000 = 77;
               break;
            case 78:
               var10000 = 38;
               break;
            case 79:
               var10000 = 44;
               break;
            case 80:
               var10000 = 153;
               break;
            case 81:
               var10000 = 93;
               break;
            case 82:
               var10000 = 58;
               break;
            case 83:
               var10000 = 26;
               break;
            case 84:
               var10000 = 110;
               break;
            case 85:
               var10000 = 224;
               break;
            case 86:
               var10000 = 191;
               break;
            case 87:
               var10000 = 204;
               break;
            case 88:
               var10000 = 232;
               break;
            case 89:
               var10000 = 114;
               break;
            case 90:
               var10000 = 135;
               break;
            case 91:
               var10000 = 139;
               break;
            case 92:
               var10000 = 213;
               break;
            case 93:
               var10000 = 144;
               break;
            case 94:
               var10000 = 178;
               break;
            case 95:
               var10000 = 79;
               break;
            case 96:
               var10000 = 216;
               break;
            case 97:
               var10000 = 130;
               break;
            case 98:
               var10000 = 151;
               break;
            case 99:
               var10000 = 202;
               break;
            case 100:
               var10000 = 253;
               break;
            case 101:
               var10000 = 0;
               break;
            case 102:
               var10000 = 231;
               break;
            case 103:
               var10000 = 162;
               break;
            case 104:
               var10000 = 195;
               break;
            case 105:
               var10000 = 48;
               break;
            case 106:
               var10000 = 20;
               break;
            case 107:
               var10000 = 81;
               break;
            case 108:
               var10000 = 2;
               break;
            case 109:
               var10000 = 32;
               break;
            case 110:
               var10000 = 198;
               break;
            case 111:
               var10000 = 163;
               break;
            case 112:
               var10000 = 252;
               break;
            case 113:
               var10000 = 45;
               break;
            case 114:
               var10000 = 174;
               break;
            case 115:
               var10000 = 251;
               break;
            case 116:
               var10000 = 123;
               break;
            case 117:
               var10000 = 147;
               break;
            case 118:
               var10000 = 70;
               break;
            case 119:
               var10000 = 205;
               break;
            case 120:
               var10000 = 127;
               break;
            case 121:
               var10000 = 61;
               break;
            case 122:
               var10000 = 68;
               break;
            case 123:
               var10000 = 176;
               break;
            case 124:
               var10000 = 164;
               break;
            case 125:
               var10000 = 42;
               break;
            case 126:
               var10000 = 186;
               break;
            case 127:
               var10000 = 200;
               break;
            case 128:
               var10000 = 242;
               break;
            case 129:
               var10000 = 67;
               break;
            case 130:
               var10000 = 9;
               break;
            case 131:
               var10000 = 101;
               break;
            case 132:
               var10000 = 239;
               break;
            case 133:
               var10000 = 228;
               break;
            case 134:
               var10000 = 34;
               break;
            case 135:
               var10000 = 5;
               break;
            case 136:
               var10000 = 73;
               break;
            case 137:
               var10000 = 52;
               break;
            case 138:
               var10000 = 165;
               break;
            case 139:
               var10000 = 124;
               break;
            case 140:
               var10000 = 84;
               break;
            case 141:
               var10000 = 170;
               break;
            case 142:
               var10000 = 149;
               break;
            case 143:
               var10000 = 183;
               break;
            case 144:
               var10000 = 199;
               break;
            case 145:
               var10000 = 37;
               break;
            case 146:
               var10000 = 160;
               break;
            case 147:
               var10000 = 220;
               break;
            case 148:
               var10000 = 235;
               break;
            case 149:
               var10000 = 72;
               break;
            case 150:
               var10000 = 25;
               break;
            case 151:
               var10000 = 7;
               break;
            case 152:
               var10000 = 16;
               break;
            case 153:
               var10000 = 159;
               break;
            case 154:
               var10000 = 219;
               break;
            case 155:
               var10000 = 95;
               break;
            case 156:
               var10000 = 141;
               break;
            case 157:
               var10000 = 229;
               break;
            case 158:
               var10000 = 222;
               break;
            case 159:
               var10000 = 182;
               break;
            case 160:
               var10000 = 11;
               break;
            case 161:
               var10000 = 243;
               break;
            case 162:
               var10000 = 55;
               break;
            case 163:
               var10000 = 240;
               break;
            case 164:
               var10000 = 98;
               break;
            case 165:
               var10000 = 132;
               break;
            case 166:
               var10000 = 92;
               break;
            case 167:
               var10000 = 217;
               break;
            case 168:
               var10000 = 39;
               break;
            case 169:
               var10000 = 4;
               break;
            case 170:
               var10000 = 169;
               break;
            case 171:
               var10000 = 24;
               break;
            case 172:
               var10000 = 89;
               break;
            case 173:
               var10000 = 154;
               break;
            case 174:
               var10000 = 248;
               break;
            case 175:
               var10000 = 171;
               break;
            case 176:
               var10000 = 161;
               break;
            case 177:
               var10000 = 250;
               break;
            case 178:
               var10000 = 80;
               break;
            case 179:
               var10000 = 43;
               break;
            case 180:
               var10000 = 83;
               break;
            case 181:
               var10000 = 76;
               break;
            case 182:
               var10000 = 36;
               break;
            case 183:
               var10000 = 145;
               break;
            case 184:
               var10000 = 223;
               break;
            case 185:
               var10000 = 105;
               break;
            case 186:
               var10000 = 126;
               break;
            case 187:
               var10000 = 106;
               break;
            case 188:
               var10000 = 207;
               break;
            case 189:
               var10000 = 133;
               break;
            case 190:
               var10000 = 108;
               break;
            case 191:
               var10000 = 181;
               break;
            case 192:
               var10000 = 100;
               break;
            case 193:
               var10000 = 121;
               break;
            case 194:
               var10000 = 8;
               break;
            case 195:
               var10000 = 211;
               break;
            case 196:
               var10000 = 227;
               break;
            case 197:
               var10000 = 65;
               break;
            case 198:
               var10000 = 62;
               break;
            case 199:
               var10000 = 116;
               break;
            case 200:
               var10000 = 18;
               break;
            case 201:
               var10000 = 194;
               break;
            case 202:
               var10000 = 188;
               break;
            case 203:
               var10000 = 102;
               break;
            case 204:
               var10000 = 60;
               break;
            case 205:
               var10000 = 115;
               break;
            case 206:
               var10000 = 31;
               break;
            case 207:
               var10000 = 109;
               break;
            case 208:
               var10000 = 156;
               break;
            case 209:
               var10000 = 201;
               break;
            case 210:
               var10000 = 23;
               break;
            case 211:
               var10000 = 86;
               break;
            case 212:
               var10000 = 212;
               break;
            case 213:
               var10000 = 17;
               break;
            case 214:
               var10000 = 241;
               break;
            case 215:
               var10000 = 209;
               break;
            case 216:
               var10000 = 142;
               break;
            case 217:
               var10000 = 90;
               break;
            case 218:
               var10000 = 244;
               break;
            case 219:
               var10000 = 41;
               break;
            case 220:
               var10000 = 99;
               break;
            case 221:
               var10000 = 82;
               break;
            case 222:
               var10000 = 143;
               break;
            case 223:
               var10000 = 21;
               break;
            case 224:
               var10000 = 122;
               break;
            case 225:
               var10000 = 125;
               break;
            case 226:
               var10000 = 47;
               break;
            case 227:
               var10000 = 71;
               break;
            case 228:
               var10000 = 66;
               break;
            case 229:
               var10000 = 137;
               break;
            case 230:
               var10000 = 63;
               break;
            case 231:
               var10000 = 35;
               break;
            case 232:
               var10000 = 184;
               break;
            case 233:
               var10000 = 166;
               break;
            case 234:
               var10000 = 155;
               break;
            case 235:
               var10000 = 179;
               break;
            case 236:
               var10000 = 49;
               break;
            case 237:
               var10000 = 87;
               break;
            case 238:
               var10000 = 208;
               break;
            case 239:
               var10000 = 85;
               break;
            case 240:
               var10000 = 12;
               break;
            case 241:
               var10000 = 196;
               break;
            case 242:
               var10000 = 158;
               break;
            case 243:
               var10000 = 233;
               break;
            case 244:
               var10000 = 33;
               break;
            case 245:
               var10000 = 206;
               break;
            case 246:
               var10000 = 226;
               break;
            case 247:
               var10000 = 40;
               break;
            case 248:
               var10000 = 57;
               break;
            case 249:
               var10000 = 56;
               break;
            case 250:
               var10000 = 187;
               break;
            case 251:
               var10000 = 69;
               break;
            case 252:
               var10000 = 210;
               break;
            case 253:
               var10000 = 214;
               break;
            case 254:
               var10000 = 103;
               break;
            default:
               var10000 = 94;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6975;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[13];
      int var11 = 0;
      String var10 = "Õu\u000e\u008c«D+ë\u0090\u009fòq5Ë\t\u0083\u008fô¸\u0011y`.\u0096\u0002缟轤\bÂ\u0096Û\u009b\u0013\u001cK¥\u000e\u0083BÄjò\u0098\u0000sõë^x \u008d\n5úØ\u008b\u0098ÄÂË¥§\u000e\u000fy\u009fûpÊÕ\n\u0016\u0093uª9\u009d\u000b-\u0099ÛçøIÄz%\u0084g\u000eÁ\u001e\u008cáûé!]Ñ.ÚÀ0\u009a\bpT\u008dÃÙ\u0017\u0012Ä\t\u009aÊ-\u008d&\u0004\u001fÓO";
      int var12 = "Õu\u000e\u008c«D+ë\u0090\u009fòq5Ë\t\u0083\u008fô¸\u0011y`.\u0096\u0002缟轤\bÂ\u0096Û\u009b\u0013\u001cK¥\u000e\u0083BÄjò\u0098\u0000sõë^x \u008d\n5úØ\u008b\u0098ÄÂË¥§\u000e\u000fy\u009fûpÊÕ\n\u0016\u0093uª9\u009d\u000b-\u0099ÛçøIÄz%\u0084g\u000eÁ\u001e\u008cáûé!]Ñ.ÚÀ0\u009a\bpT\u008dÃÙ\u0017\u0012Ä\t\u009aÊ-\u008d&\u0004\u001fÓO"
         .length();
      char var9 = 14;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 58;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      Object var33;
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
                        var65 = 55;
                        break;
                     case 1:
                        var65 = 70;
                        break;
                     case 2:
                        var65 = 24;
                        break;
                     case 3:
                        var65 = 81;
                        break;
                     case 4:
                        var65 = 125;
                        break;
                     case 5:
                        var65 = 56;
                        break;
                     default:
                        var65 = 86;
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
                     b = var13;
                     c = new String[13];
                     long var0 = 5106096291619412510L;
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "cÇI\u0090¹*\u008f\u001fE0Á\u0086Ü\u0014!¥~\u0092`jµ\u0088ðc$¸½ærÜ°Úk|2\u0003çÕ<~\u0019Ý\rÄÕ¦%õ";
                     int var5 = "cÇI\u0090¹*\u008f\u001fE0Á\u0086Ü\u0014!¥~\u0092`jµ\u0088ðc$¸½ærÜ°Úk|2\u0003çÕ<~\u0019Ý\rÄÕ¦%õ".length();
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
                                    d = var6;
                                    e = new Integer[8];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "KiA©±I\u009c\u0000H®Ê±\b\u0089çý";
                                 var5 = "KiA©±I\u009c\u0000H®Ê±\b\u0089çý".length();
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

                  var10 = "\u0087ï\u001e¹Ð\u0012Q\u0081\u0016rå\u0006»\u0098\r}dAÈ;<!N®ßì\rn";
                  var12 = "\u0087ï\u001e¹Ð\u0012Q\u0081\u0016rå\u0006»\u0098\r}dAÈ;<!N®ßì\rn".length();
                  var9 = 14;
                  var17 = -1;
            }

            var10000 = 69;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





