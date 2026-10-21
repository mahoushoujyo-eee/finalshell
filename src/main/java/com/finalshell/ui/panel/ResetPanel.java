package com.finalshell.ui.panel;

import com.finalshell.core.C;
import com.finalshell.core.KD;
import com.finalshell.core.KV;
import com.finalshell.core.UI3;
import com.finalshell.core.Y12_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.LU_3;
import com.finalshell.ui.listener.Qi2;
import com.finalshell.ui.listener.Yi4;
import java.awt.Color;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import net.miginfocom.swing.MigLayout;

public class ResetPanel extends JPanel {
   Xj2 F;
   JO w;
   JO g;
   JO Q;
   Color a;
   Color o;
   JO R;
   JO p;
   KV r;
   JPopupMenu b;
   String n;
   public static String[] c;
   public static String[] d;
   public static long[] e;
   public static Integer[] f;

   ResetPanel() {
      Color var10001 = new Color(a(523, 5605099169534719352L), a(304, 2788125910285694541L), a(13528, 8384030043991901090L));
      long var12 = 460253951039000465L;
      Color var11 = var10001;
      Ref.s(460253951039000465L, var11, var12);
      Color var10002 = new Color(a(14837, 5293015368758857355L), a(30941, 4635874745880235942L), a(22130, 7513717865442959626L));
      long var14 = 481634556353016409L;
      Color var13 = var10002;
      Ref.s(481634556353016409L, var13, var14);
      this.setLayout(new MigLayout(a(3128, 26044), "", a(3129, 6190)));
      this.setOpaque(false);
      JPanel var2 = new JPanel();
      var2.setLayout(new MigLayout(a(3125, 24825), a(3134, 10611), a(3124, -24728)));
      var2.setOpaque(false);
      this.add(var2, a(3126, 20431));
      JPanel var3 = new JPanel();
      var3.setLayout(new MigLayout(a(3131, 17831), "", a(3118, -23100)));
      var3.setOpaque(false);
      JPanel var4 = new JPanel();
      var4.setLayout(new MigLayout(a(3131, 17831), "", a(3135, -6878)));
      var4.setOpaque(false);
      JO var10003 = new JO();
      long var16 = 213022483458441055L;
      JO var15 = var10003;
      Ref.s(213022483458441055L, var15, var16);
      Object var17 = 213022483458441055L;
      ((JO)Ref.g(213022483458441055L, var17)).setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      Object var19 = 213022483458441055L;
      ((JO)Ref.g(213022483458441055L, var19))
         .setForeground(new Color(a(16622, 3641734374936901521L), a(32442, 5458681793450428867L), a(32442, 5458681793450428867L)));
      Object var21 = 213022483458441055L;
      ((JO)Ref.g(213022483458441055L, var21)).setText("");
      JO var10007 = new JO();
      long var24 = 335079693523391250L;
      JO var23 = var10007;
      Ref.s(335079693523391250L, var23, var24);
      Object var25 = 335079693523391250L;
      ((JO)Ref.g(335079693523391250L, var25))
         .setForeground(new Color(a(32442, 5458681793450428867L), a(32442, 5458681793450428867L), a(32442, 5458681793450428867L)));
      Object var27 = 335079693523391250L;
      ((JO)Ref.g(335079693523391250L, var27)).setText("");
      Registry.packArgs("\uf062");
      long var29 = 360256375153447639L;
      Object var10010 = Ref.h2(360256375153447639L, var29);

      try {
         var10010 = (T2)var10010;
      } catch (InvocationTargetException var89) {
         throw var89.getTargetException();
      }

      T2 var5 = (T2)var10010;
      Object var31 = 460253951039000465L;
      this.setForeground((Color)Ref.g(460253951039000465L, var31));
      var5.setFont((Font)Registry.lookupField(279716403554365768L).get(null));
      Object var33 = 460253951039000465L;
      this.setForeground((Color)Ref.g(460253951039000465L, var33));
      var2.add(var5);
      var2.add(var3);
      JO var10013 = new JO();
      long var36 = 591876319551861589L;
      JO var35 = var10013;
      Ref.s(591876319551861589L, var35, var36);
      Object var37 = 591876319551861589L;
      ((JO)Ref.g(591876319551861589L, var37)).setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      Object var39 = 591876319551861589L;
      ((JO)Ref.g(591876319551861589L, var39)).setOpaque(false);
      Object var41 = 591876319551861589L;
      JO var10016 = (JO)Ref.g(591876319551861589L, var41);
      Object var43 = 460253951039000465L;
      this.setForeground((Color)Ref.g(460253951039000465L, var43));
      Object var45 = 591876319551861589L;
      this.add((JO)Ref.g(591876319551861589L, var45), a(3121, 16701));
      Registry.packArgs("\uf063");
      long var47 = 360256375153447639L;
      Object var10019 = Ref.h2(360256375153447639L, var47);

      try {
         var10019 = (T2)var10019;
      } catch (InvocationTargetException var88) {
         throw var88.getTargetException();
      }

      T2 var6 = (T2)var10019;
      Object var49 = 460253951039000465L;
      this.setForeground((Color)Ref.g(460253951039000465L, var49));
      KV.b$arrString();
      var6.setFont((Font)Registry.lookupField(279716403554365768L).get(null));
      Object var51 = 481634556353016409L;
      this.setForeground((Color)Ref.g(481634556353016409L, var51));
      var2.add(var6);
      JO var10023 = new JO();
      long var54 = 507795167072795983L;
      JO var53 = var10023;
      Ref.s(507795167072795983L, var53, var54);
      Object var55 = 507795167072795983L;
      ((JO)Ref.g(507795167072795983L, var55)).setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      Object var57 = 507795167072795983L;
      ((JO)Ref.g(507795167072795983L, var57)).setOpaque(false);
      Object var59 = 507795167072795983L;
      JO var10026 = (JO)Ref.g(507795167072795983L, var59);
      Object var61 = 481634556353016409L;
      this.setForeground((Color)Ref.g(481634556353016409L, var61));
      Object var63 = 507795167072795983L;
      this.add((JO)Ref.g(507795167072795983L, var63), a(3116, -29241));
      var2.add(var4);
      JPanel var7 = new JPanel();
      var7.setOpaque(false);
      var7.setLayout(new MigLayout(a(3117, 4114), a(3132, 6553), ""));
      JO var10029 = new JO();
      long var66 = 463949295589544504L;
      JO var65 = var10029;
      Ref.s(463949295589544504L, var65, var66);
      Object var67 = 463949295589544504L;
      ((JO)Ref.g(463949295589544504L, var67)).setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      Object var69 = 463949295589544504L;
      ((JO)Ref.g(463949295589544504L, var69)).setOpaque(false);
      Object var71 = 463949295589544504L;
      ((JO)Ref.g(463949295589544504L, var71)).setForeground((Color)Registry.lookupField(503018106388102479L).get(null));
      Object var73 = 463949295589544504L;
      ((JO)Ref.g(463949295589544504L, var73)).setHorizontalAlignment(4);
      Object var75 = 463949295589544504L;
      this.add((JO)Ref.g(463949295589544504L, var75), a(3122, -7577));
      Registry.packArgs("\uf0d7");
      long var77 = 378399160856121064L;
      Object var10035 = Ref.h2(378399160856121064L, var77);

      try {
         var10035 = (C)var10035;
      } catch (InvocationTargetException var87) {
         throw var87.getTargetException();
      }

      C var8 = (C)var10035;
      var8.setFont((Font)Registry.lookupField(164046876459002055L).get(null));
      var8.setForeground((Color)Registry.lookupField(476153709123937579L).get(null));
      var7.add(var8, a(3130, 22076));
      var2.add(var7, a(3133, 26538));
      JPopupMenu var10036 = new JPopupMenu();
      long var80 = 635187916850230994L;
      JPopupMenu var79 = var10036;
      Ref.s(635187916850230994L, var79, var80);
      Y12_2 var93;
      Object var81 = 635187916850230994L;
new Yi4(this, (JPopupMenu)Ref.g(635187916850230994L, var81));
      Y12_2 var9 = var93;
      var8.addActionListener(new Qi2(this, var9, var8));
      KD var10 = new KD(a(3119, -80));
      var10.setForeground(new Color(a(12421, 2979064244720699385L), a(12421, 2979064244720699385L), a(12421, 2979064244720699385L)));
      var10.G(true);
      var10.addActionListener(new LU_3(this));
      Xj2 var10037 = new Xj2();
      long var84 = 571184257102162393L;
      Xj2 var83 = var10037;
      Ref.s(571184257102162393L, var83, var84);
      Object var85 = 571184257102162393L;
      this.add((Xj2)Ref.g(571184257102162393L, var85), a(3120, -29098));
      if (Ky4.F$arrString() != null) {
         KV.W(new String[1]);
      }
   }

   public void i(KV var1, String var2) {
      long var8 = 586501992965272398L;
      Ref.s(586501992965272398L, var1, var8);
      KV.b$arrString();
      long var10 = 549192848397597975L;
      Ref.s(549192848397597975L, var2, var10);
      UI3 var10004 = (UI3)(Registry.emptyArgs());
      long var12 = 452580985803160015L;
      Object[] var11 = var10004;
      var10004 = Ref.h(452580985803160015L, var11, var12);

      try {
         var10004 = (UI3)var10004;
      } catch (InvocationTargetException var83) {
         throw var83.getTargetException();
      }

      UI3 var4 = var10004;
      UI3 var10005 = (UI3)(Registry.emptyArgs());
      long var14 = 464295852732439993L;
      Object[] var13 = var10005;
      var10005 = Ref.h(464295852732439993L, var13, var14);

      try {
         var10005 = (UI3)var10005;
      } catch (InvocationTargetException var82) {
         throw var82.getTargetException();
      }

      label180: {
         label184: {
            UI3 var5 = var10005;
            var10004 = var5;
            if (var1 == null) {
               if (var5 == null) {
                  Registry.emptyArgs();
                  long var15 = 270389152141252877L;
                  Ref.h2(270389152141252877L, var15);
                  Object[] var10006 = Registry.emptyArgs();
                  long var18 = 306266403902896148L;
                  Object[] var17 = var10006;
                  Ref.h(306266403902896148L, var17, var18);
                  String var10007 = (String)(Registry.emptyArgs());
                  long var20 = 226464901787572175L;
                  Object[] var19 = var10007;
                  var10007 = Ref.h(226464901787572175L, var19, var20);

                  try {
                     var10007 = (String)var10007;
                  } catch (InvocationTargetException var81) {
                     throw var81.getTargetException();
                  }

                  String var6 = var10007;
                  if (var6 != null) {
                     UI3 var10008 = (UI3)(Registry.packArgs(var6));
                     long var22 = 128863411504517789L;
                     Object[] var21 = var10008;
                     var10008 = Ref.h(128863411504517789L, var21, var22);

                     try {
                        var10008 = (UI3)var10008;
                     } catch (InvocationTargetException var80) {
                        throw var80.getTargetException();
                     }

                     var5 = var10008;
                  }

                  label173: {
                     UI3 var93 = var5;
                     if (var1 == null) {
                        if (var5 != null) {
                           break label173;
                        }

                        var93 = var4;
                     }

                     var5 = var93;
                  }

                  Object[] var100 = Registry.packArgs(var5);
                  long var24 = 188694940876807421L;
                  Object[] var23 = var100;
                  Ref.h(188694940876807421L, var23, var24);

                  try {
                     ;
                  } catch (InvocationTargetException var79) {
                     throw var79.getTargetException();
                  }
               }

               var10004 = this;
               Object var25 = 571184257102162393L;
               Ref.g(571184257102162393L, var25);
               Object[] var90 = Registry.packArgs(var1, var5, var2);
               long var28 = 166558619706666222L;
               Object[] var27 = var90;
               Ref.h(166558619706666222L, var27, var28);

               try {
                  ;
               } catch (InvocationTargetException var78) {
                  throw var78.getTargetException();
               }

               if (var1 != null) {
                  break label184;
               }
            }

            if (var10004 != null) {
               Object var29 = 463949295589544504L;
               JO var89 = (JO)Ref.g(463949295589544504L, var29);
               String var94 = (String)(Registry.emptyArgs());
               long var32 = 326911699754169518L;
               Object[] var31 = var94;
               var94 = Ref.h(326911699754169518L, var31, var32);

               try {
                  var94 = (String)var94;
               } catch (InvocationTargetException var77) {
                  throw var77.getTargetException();
               }

               var5.setText(var94);
               Object var33 = 591876319551861589L;
               JO var97 = (JO)Ref.g(591876319551861589L, var33);
               new StringBuilder();
               Object[] var10010 = Registry.emptyArgs();
               long var36 = 513993714383704813L;
               Object[] var35 = var10010;
               var10010 = Ref.h(513993714383704813L, var35, var36);

               try {
                  var102 = (Long)var10010;
               } catch (InvocationTargetException var76) {
                  throw var76.getTargetException();
               }

               var10010 = Registry.e(var102);
               long var37 = 148259110884974759L;
               Object var10011 = Ref.h2(148259110884974759L, var37);

               try {
                  var10011 = (String)var10011;
               } catch (InvocationTargetException var75) {
                  throw var75.getTargetException();
               }

               var5.setText(var10010.append((String)var10011).append(" ").toString());
               Object var39 = 507795167072795983L;
               JO var104 = (JO)Ref.g(507795167072795983L, var39);
               new StringBuilder();
               Object[] var10013 = Registry.emptyArgs();
               long var42 = 308027402773800118L;
               Object[] var41 = var10013;
               var10013 = Ref.h(308027402773800118L, var41, var42);

               try {
                  var107 = (Long)var10013;
               } catch (InvocationTargetException var74) {
                  throw var74.getTargetException();
               }

               var10013 = Registry.e(var107);
               long var43 = 148259110884974759L;
               Object var10014 = Ref.h2(148259110884974759L, var43);

               try {
                  var10014 = (String)var10014;
               } catch (InvocationTargetException var73) {
                  throw var73.getTargetException();
               }

               var5.setText(var10013.append((String)var10014).append("").toString());
               Object var45 = 213022483458441055L;
               JO var109 = (JO)Ref.g(213022483458441055L, var45);
               new StringBuilder().append("");
               Object[] var10016 = Registry.emptyArgs();
               long var48 = 174539511860798304L;
               Object[] var47 = var10016;
               var10016 = Ref.h(174539511860798304L, var47, var48);

               try {
                  var112 = (Long)var10016;
               } catch (InvocationTargetException var72) {
                  throw var72.getTargetException();
               }

               Object[] var10018 = Registry.emptyArgs();
               long var50 = 154304842326423992L;
               Object[] var49 = var10018;
               var10018 = Ref.h(154304842326423992L, var49, var50);

               try {
                  var115 = (Long)var10018;
               } catch (InvocationTargetException var71) {
                  throw var71.getTargetException();
               }

               Object[] var10017 = Registry.e(var5 - var115);
               long var51 = 148259110884974759L;
               var10018 = Ref.h2(148259110884974759L, var51);

               try {
                  var10018 = (String)var10018;
               } catch (InvocationTargetException var70) {
                  throw var70.getTargetException();
               }

               var112.setText(var10017.append((String)var10018).toString());
               Object var53 = 335079693523391250L;
               JO var113 = (JO)Ref.g(335079693523391250L, var53);
               new StringBuilder().append("");
               Object[] var10020 = Registry.emptyArgs();
               long var56 = 267640906957606528L;
               Object[] var55 = var10020;
               var10020 = Ref.h(267640906957606528L, var55, var56);

               try {
                  var119 = (Long)var10020;
               } catch (InvocationTargetException var69) {
                  throw var69.getTargetException();
               }

               Object[] var10022 = Registry.emptyArgs();
               long var58 = 416428535578363385L;
               Object[] var57 = var10022;
               var10022 = Ref.h(416428535578363385L, var57, var58);

               try {
                  var121 = (Long)var10022;
               } catch (InvocationTargetException var68) {
                  throw var68.getTargetException();
               }

               Object[] var10021 = Registry.e(var5 - var121);
               long var59 = 148259110884974759L;
               var10022 = Ref.h2(148259110884974759L, var59);

               try {
                  var10022 = (String)var10022;
               } catch (InvocationTargetException var67) {
                  throw var67.getTargetException();
               }

               var119.setText(var10021.append((String)var10022).toString());
               if (var1 == null) {
                  break label180;
               }
            }

            Object var61 = 463949295589544504L;
            ((JO)Ref.g(463949295589544504L, var61)).setText(a(3123, -5813));
            Object var63 = 591876319551861589L;
            ((JO)Ref.g(591876319551861589L, var63)).setText(a(3127, 25471));
         }

         Object var65 = 507795167072795983L;
         ((JO)Ref.g(507795167072795983L, var65)).setText(a(3127, 25471));
      }

      this.validate();
   }

   JPopupMenu O() {
      Object var7 = 635187916850230994L;
      ((JPopupMenu)Ref.g(635187916850230994L, var7)).removeAll();
      KV.b$arrString();
      Object var9 = 586501992965272398L;
      Object var10003 = Ref.g(586501992965272398L, var9);
      UI3 var10004 = (UI3)(Registry.emptyArgs());
      long var12 = 464295852732439993L;
      Object[] var11 = var10004;
      var10004 = Ref.h(464295852732439993L, var11, var12);

      try {
         var10004 = (UI3)var10004;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      UI3 var2 = var10004;
      Object var1 = var10003;
      if (var1 == null) {
         Object var13 = 586501992965272398L;
         if ((KV)Ref.g(586501992965272398L, var13) != null) {
            Object var15 = 586501992965272398L;
            Ref.g(586501992965272398L, var15);
            ArrayList var10006 = (ArrayList)(Registry.emptyArgs());
            long var18 = 580849036705130203L;
            Object[] var17 = var10006;
            var10006 = Ref.h(580849036705130203L, var17, var18);

            try {
               var10006 = (ArrayList)var10006;
            } catch (InvocationTargetException var32) {
               throw var32.getTargetException();
            }

            for (UI3 var5 : var10006) {
               JRadioButtonMenuItem var10007;
               String var10009 = (String)(Registry.emptyArgs());
               long var20 = 326911699754169518L;
               Object[] var19 = var10009;
               var10009 = Ref.h(326911699754169518L, var19, var20);

               try {
                  var10009 = (String)var10009;
               } catch (InvocationTargetException var31) {
                  throw var31.getTargetException();
               }

new JPanel(var10009);
               JRadioButtonMenuItem var6 = var10007;
               if (var1 == null) {
                  if (var2 != null) {
                     Object[] var10008 = Registry.emptyArgs();
                     long var22 = 326911699754169518L;
                     Object[] var21 = var10008;
                     Ref.h(326911699754169518L, var21, var22);

                     try {
                        ;
                     } catch (InvocationTargetException var30) {
                        throw var30.getTargetException();
                     }

                     String var10010 = (String)(Registry.emptyArgs());
                     long var24 = 326911699754169518L;
                     Object[] var23 = var10010;
                     var10010 = Ref.h(326911699754169518L, var23, var24);

                     try {
                        var10010 = (String)var10010;
                     } catch (InvocationTargetException var29) {
                        throw var29.getTargetException();
                     }

                     if (var5.equals(var10010)) {
                        var6.setSelected(true);
                     }
                  }

                  var6.addActionListener(new Yi4(this, var6));
                  Object var25 = 635187916850230994L;
                  ((JPopupMenu)Ref.g(635187916850230994L, var25)).add(var6);
               }

               if (var1 != null) {
                  break;
               }
            }
         }
      }

      Object var27 = 635187916850230994L;
      return (JPopupMenu)Ref.g(635187916850230994L, var27);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 3133) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 185;
               break;
            case 1:
               var10000 = 93;
               break;
            case 2:
               var10000 = 64;
               break;
            case 3:
               var10000 = 131;
               break;
            case 4:
               var10000 = 203;
               break;
            case 5:
               var10000 = 171;
               break;
            case 6:
               var10000 = 134;
               break;
            case 7:
               var10000 = 229;
               break;
            case 8:
               var10000 = 144;
               break;
            case 9:
               var10000 = 194;
               break;
            case 10:
               var10000 = 233;
               break;
            case 11:
               var10000 = 149;
               break;
            case 12:
               var10000 = 217;
               break;
            case 13:
               var10000 = 119;
               break;
            case 14:
               var10000 = 231;
               break;
            case 15:
               var10000 = 230;
               break;
            case 16:
               var10000 = 196;
               break;
            case 17:
               var10000 = 92;
               break;
            case 18:
               var10000 = 17;
               break;
            case 19:
               var10000 = 156;
               break;
            case 20:
               var10000 = 36;
               break;
            case 21:
               var10000 = 143;
               break;
            case 22:
               var10000 = 125;
               break;
            case 23:
               var10000 = 251;
               break;
            case 24:
               var10000 = 129;
               break;
            case 25:
               var10000 = 60;
               break;
            case 26:
               var10000 = 210;
               break;
            case 27:
               var10000 = 137;
               break;
            case 28:
               var10000 = 113;
               break;
            case 29:
               var10000 = 191;
               break;
            case 30:
               var10000 = 169;
               break;
            case 31:
               var10000 = 26;
               break;
            case 32:
               var10000 = 152;
               break;
            case 33:
               var10000 = 10;
               break;
            case 34:
               var10000 = 162;
               break;
            case 35:
               var10000 = 135;
               break;
            case 36:
               var10000 = 183;
               break;
            case 37:
               var10000 = 248;
               break;
            case 38:
               var10000 = 75;
               break;
            case 39:
               var10000 = 23;
               break;
            case 40:
               var10000 = 184;
               break;
            case 41:
               var10000 = 83;
               break;
            case 42:
               var10000 = 216;
               break;
            case 43:
               var10000 = 99;
               break;
            case 44:
               var10000 = 95;
               break;
            case 45:
               var10000 = 146;
               break;
            case 46:
               var10000 = 47;
               break;
            case 47:
               var10000 = 226;
               break;
            case 48:
               var10000 = 228;
               break;
            case 49:
               var10000 = 41;
               break;
            case 50:
               var10000 = 104;
               break;
            case 51:
               var10000 = 148;
               break;
            case 52:
               var10000 = 72;
               break;
            case 53:
               var10000 = 121;
               break;
            case 54:
               var10000 = 237;
               break;
            case 55:
               var10000 = 179;
               break;
            case 56:
               var10000 = 53;
               break;
            case 57:
               var10000 = 84;
               break;
            case 58:
               var10000 = 1;
               break;
            case 59:
               var10000 = 76;
               break;
            case 60:
               var10000 = 215;
               break;
            case 61:
               var10000 = 243;
               break;
            case 62:
               var10000 = 97;
               break;
            case 63:
               var10000 = 208;
               break;
            case 64:
               var10000 = 128;
               break;
            case 65:
               var10000 = 124;
               break;
            case 66:
               var10000 = 28;
               break;
            case 67:
               var10000 = 145;
               break;
            case 68:
               var10000 = 157;
               break;
            case 69:
               var10000 = 68;
               break;
            case 70:
               var10000 = 150;
               break;
            case 71:
               var10000 = 198;
               break;
            case 72:
               var10000 = 94;
               break;
            case 73:
               var10000 = 182;
               break;
            case 74:
               var10000 = 225;
               break;
            case 75:
               var10000 = 177;
               break;
            case 76:
               var10000 = 27;
               break;
            case 77:
               var10000 = 43;
               break;
            case 78:
               var10000 = 11;
               break;
            case 79:
               var10000 = 29;
               break;
            case 80:
               var10000 = 240;
               break;
            case 81:
               var10000 = 48;
               break;
            case 82:
               var10000 = 209;
               break;
            case 83:
               var10000 = 188;
               break;
            case 84:
               var10000 = 91;
               break;
            case 85:
               var10000 = 181;
               break;
            case 86:
               var10000 = 54;
               break;
            case 87:
               var10000 = 139;
               break;
            case 88:
               var10000 = 180;
               break;
            case 89:
               var10000 = 223;
               break;
            case 90:
               var10000 = 86;
               break;
            case 91:
               var10000 = 15;
               break;
            case 92:
               var10000 = 81;
               break;
            case 93:
               var10000 = 114;
               break;
            case 94:
               var10000 = 153;
               break;
            case 95:
               var10000 = 79;
               break;
            case 96:
               var10000 = 214;
               break;
            case 97:
               var10000 = 46;
               break;
            case 98:
               var10000 = 7;
               break;
            case 99:
               var10000 = 101;
               break;
            case 100:
               var10000 = 167;
               break;
            case 101:
               var10000 = 189;
               break;
            case 102:
               var10000 = 160;
               break;
            case 103:
               var10000 = 254;
               break;
            case 104:
               var10000 = 239;
               break;
            case 105:
               var10000 = 71;
               break;
            case 106:
               var10000 = 66;
               break;
            case 107:
               var10000 = 80;
               break;
            case 108:
               var10000 = 168;
               break;
            case 109:
               var10000 = 241;
               break;
            case 110:
               var10000 = 9;
               break;
            case 111:
               var10000 = 235;
               break;
            case 112:
               var10000 = 221;
               break;
            case 113:
               var10000 = 2;
               break;
            case 114:
               var10000 = 250;
               break;
            case 115:
               var10000 = 110;
               break;
            case 116:
               var10000 = 58;
               break;
            case 117:
               var10000 = 51;
               break;
            case 118:
               var10000 = 159;
               break;
            case 119:
               var10000 = 105;
               break;
            case 120:
               var10000 = 44;
               break;
            case 121:
               var10000 = 192;
               break;
            case 122:
               var10000 = 122;
               break;
            case 123:
               var10000 = 77;
               break;
            case 124:
               var10000 = 212;
               break;
            case 125:
               var10000 = 12;
               break;
            case 126:
               var10000 = 195;
               break;
            case 127:
               var10000 = 38;
               break;
            case 128:
               var10000 = 205;
               break;
            case 129:
               var10000 = 132;
               break;
            case 130:
               var10000 = 133;
               break;
            case 131:
               var10000 = 85;
               break;
            case 132:
               var10000 = 67;
               break;
            case 133:
               var10000 = 73;
               break;
            case 134:
               var10000 = 100;
               break;
            case 135:
               var10000 = 59;
               break;
            case 136:
               var10000 = 219;
               break;
            case 137:
               var10000 = 21;
               break;
            case 138:
               var10000 = 172;
               break;
            case 139:
               var10000 = 89;
               break;
            case 140:
               var10000 = 211;
               break;
            case 141:
               var10000 = 247;
               break;
            case 142:
               var10000 = 201;
               break;
            case 143:
               var10000 = 141;
               break;
            case 144:
               var10000 = 154;
               break;
            case 145:
               var10000 = 88;
               break;
            case 146:
               var10000 = 56;
               break;
            case 147:
               var10000 = 222;
               break;
            case 148:
               var10000 = 39;
               break;
            case 149:
               var10000 = 252;
               break;
            case 150:
               var10000 = 117;
               break;
            case 151:
               var10000 = 90;
               break;
            case 152:
               var10000 = 232;
               break;
            case 153:
               var10000 = 186;
               break;
            case 154:
               var10000 = 63;
               break;
            case 155:
               var10000 = 106;
               break;
            case 156:
               var10000 = 166;
               break;
            case 157:
               var10000 = 142;
               break;
            case 158:
               var10000 = 24;
               break;
            case 159:
               var10000 = 175;
               break;
            case 160:
               var10000 = 127;
               break;
            case 161:
               var10000 = 174;
               break;
            case 162:
               var10000 = 111;
               break;
            case 163:
               var10000 = 18;
               break;
            case 164:
               var10000 = 126;
               break;
            case 165:
               var10000 = 4;
               break;
            case 166:
               var10000 = 37;
               break;
            case 167:
               var10000 = 151;
               break;
            case 168:
               var10000 = 178;
               break;
            case 169:
               var10000 = 33;
               break;
            case 170:
               var10000 = 123;
               break;
            case 171:
               var10000 = 253;
               break;
            case 172:
               var10000 = 244;
               break;
            case 173:
               var10000 = 25;
               break;
            case 174:
               var10000 = 138;
               break;
            case 175:
               var10000 = 45;
               break;
            case 176:
               var10000 = 42;
               break;
            case 177:
               var10000 = 165;
               break;
            case 178:
               var10000 = 234;
               break;
            case 179:
               var10000 = 190;
               break;
            case 180:
               var10000 = 107;
               break;
            case 181:
               var10000 = 96;
               break;
            case 182:
               var10000 = 200;
               break;
            case 183:
               var10000 = 206;
               break;
            case 184:
               var10000 = 52;
               break;
            case 185:
               var10000 = 57;
               break;
            case 186:
               var10000 = 13;
               break;
            case 187:
               var10000 = 69;
               break;
            case 188:
               var10000 = 22;
               break;
            case 189:
               var10000 = 108;
               break;
            case 190:
               var10000 = 207;
               break;
            case 191:
               var10000 = 74;
               break;
            case 192:
               var10000 = 55;
               break;
            case 193:
               var10000 = 82;
               break;
            case 194:
               var10000 = 35;
               break;
            case 195:
               var10000 = 118;
               break;
            case 196:
               var10000 = 20;
               break;
            case 197:
               var10000 = 49;
               break;
            case 198:
               var10000 = 8;
               break;
            case 199:
               var10000 = 197;
               break;
            case 200:
               var10000 = 120;
               break;
            case 201:
               var10000 = 220;
               break;
            case 202:
               var10000 = 224;
               break;
            case 203:
               var10000 = 5;
               break;
            case 204:
               var10000 = 0;
               break;
            case 205:
               var10000 = 164;
               break;
            case 206:
               var10000 = 31;
               break;
            case 207:
               var10000 = 199;
               break;
            case 208:
               var10000 = 30;
               break;
            case 209:
               var10000 = 19;
               break;
            case 210:
               var10000 = 170;
               break;
            case 211:
               var10000 = 187;
               break;
            case 212:
               var10000 = 255;
               break;
            case 213:
               var10000 = 155;
               break;
            case 214:
               var10000 = 78;
               break;
            case 215:
               var10000 = 227;
               break;
            case 216:
               var10000 = 65;
               break;
            case 217:
               var10000 = 34;
               break;
            case 218:
               var10000 = 202;
               break;
            case 219:
               var10000 = 236;
               break;
            case 220:
               var10000 = 16;
               break;
            case 221:
               var10000 = 136;
               break;
            case 222:
               var10000 = 103;
               break;
            case 223:
               var10000 = 218;
               break;
            case 224:
               var10000 = 161;
               break;
            case 225:
               var10000 = 70;
               break;
            case 226:
               var10000 = 238;
               break;
            case 227:
               var10000 = 176;
               break;
            case 228:
               var10000 = 163;
               break;
            case 229:
               var10000 = 245;
               break;
            case 230:
               var10000 = 158;
               break;
            case 231:
               var10000 = 242;
               break;
            case 232:
               var10000 = 6;
               break;
            case 233:
               var10000 = 249;
               break;
            case 234:
               var10000 = 102;
               break;
            case 235:
               var10000 = 109;
               break;
            case 236:
               var10000 = 50;
               break;
            case 237:
               var10000 = 112;
               break;
            case 238:
               var10000 = 173;
               break;
            case 239:
               var10000 = 140;
               break;
            case 240:
               var10000 = 116;
               break;
            case 241:
               var10000 = 204;
               break;
            case 242:
               var10000 = 193;
               break;
            case 243:
               var10000 = 62;
               break;
            case 244:
               var10000 = 213;
               break;
            case 245:
               var10000 = 87;
               break;
            case 246:
               var10000 = 3;
               break;
            case 247:
               var10000 = 130;
               break;
            case 248:
               var10000 = 246;
               break;
            case 249:
               var10000 = 40;
               break;
            case 250:
               var10000 = 14;
               break;
            case 251:
               var10000 = 147;
               break;
            case 252:
               var10000 = 32;
               break;
            case 253:
               var10000 = 98;
               break;
            case 254:
               var10000 = 115;
               break;
            default:
               var10000 = 61;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14203;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[20];
      int var11 = 0;
      String var10 = "!(1TÞ+§kô¬\u0004MËÃúÁ¢\u0005õ,M2\u0082\b\u0089\u00adÀ\u0002qTÿ/\u001bgè\u001fªÈ@£\u008aâ¢ë\u007fhU\u008f\u0000\\>\u000fù6 v®ø(3\u000eú\u0099¬\u0084¾\u0084\u00065=úÖ]c¼\u000eÙZý\u0097Ô\\<h~ùÑX*q\u000eÆ|\u001eS¨Ä³{\u008f\u0098ï\u0017í\u0098\u0014ã\u0097©n\u001dr\u000eÍgd\tÇ¸D$Eõhã\u0007\u000e%\u0094bN'gB\u000f±\u0016(Æ\u0015¢\u0011¯?\u0004Pé\u001eìf`\u0090}\u0010\u0016\u0015\fò\u001b\b\u0081âÅB¾X¯Á\u0004h²\u0004\u0000\by<#\u00adæ{ÿ¿&\u0007\u0085õáF\u009d´½\u0096vH\u0016B«Ë¯\u008eãÉ}\u0089mbp©IîDºÓîÉl|¢\u009aQî\bGz\u001dQ¥:Ì\u008d\u0014nC\u0018ô+!È§¿)\u0012nÛqHãx¼R\u009d\u001a|0Z\u009acìÁ\u001e\u009e\u001e6\u0088AªÑn¢m\u008c\u0094éXÄ¾\u0086Ñ\bKÌe³.¸æÇ";
      int var12 = "!(1TÞ+§kô¬\u0004MËÃúÁ¢\u0005õ,M2\u0082\b\u0089\u00adÀ\u0002qTÿ/\u001bgè\u001fªÈ@£\u008aâ¢ë\u007fhU\u008f\u0000\\>\u000fù6 v®ø(3\u000eú\u0099¬\u0084¾\u0084\u00065=úÖ]c¼\u000eÙZý\u0097Ô\\<h~ùÑX*q\u000eÆ|\u001eS¨Ä³{\u008f\u0098ï\u0017í\u0098\u0014ã\u0097©n\u001dr\u000eÍgd\tÇ¸D$Eõhã\u0007\u000e%\u0094bN'gB\u000f±\u0016(Æ\u0015¢\u0011¯?\u0004Pé\u001eìf`\u0090}\u0010\u0016\u0015\fò\u001b\b\u0081âÅB¾X¯Á\u0004h²\u0004\u0000\by<#\u00adæ{ÿ¿&\u0007\u0085õáF\u009d´½\u0096vH\u0016B«Ë¯\u008eãÉ}\u0089mbp©IîDºÓîÉl|¢\u009aQî\bGz\u001dQ¥:Ì\u008d\u0014nC\u0018ô+!È§¿)\u0012nÛqHãx¼R\u009d\u001a|0Z\u009acìÁ\u001e\u009e\u001e6\u0088AªÑn¢m\u008c\u0094éXÄ¾\u0086Ñ\bKÌe³.¸æÇ"
         .length();
      char var9 = 17;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 122;
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
                        var65 = 119;
                        break;
                     case 1:
                        var65 = 40;
                        break;
                     case 2:
                        var65 = 42;
                        break;
                     case 3:
                        var65 = 42;
                        break;
                     case 4:
                        var65 = 114;
                        break;
                     case 5:
                        var65 = 100;
                        break;
                     default:
                        var65 = 7;
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
                     c = var13;
                     d = new String[20];
                     long var0 = 2798211722381000428L;
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = "§\u009a\u0091\u0088\u009d¿1\u0010¥Fè\u0088è\u008d}D¤!Ðý\u001e[7Wm\u009eà\f¾á\u009fò\u0085\u0013r\u001aî«\t\u0005\u0010bWéKTps\u0085\u0002)\n!~H\u0093";
                     int var5 = "§\u009a\u0091\u0088\u009d¿1\u0010¥Fè\u0088è\u008d}D¤!Ðý\u001e[7Wm\u009eà\f¾á\u009fò\u0085\u0013r\u001aî«\t\u0005\u0010bWéKTps\u0085\u0002)\n!~H\u0093"
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
                                    e = var6;
                                    f = new Integer[9];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "pÉ~¶ó\u007fy\u0083 È¨%\u0004.K\u0002";
                                 var5 = "pÉ~¶ó\u007fy\u0083 È¨%\u0004.K\u0002".length();
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

                  var10 = "鄫缆\brÊ\u0016G\u0002U8¦";
                  var12 = "鄫缆\brÊ\u0016G\u0002U8¦".length();
                  var9 = 2;
                  var17 = -1;
            }

            var10000 = 86;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





