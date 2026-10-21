package com.finalshell.ui.panel;

import com.finalshell.core.KV;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.SpeedTestFrame;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.QuadCurve2D.Float;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JComponent;

public class Kz_4 extends JComponent {
   Color F;
   Stroke D;
   Stroke Z;
   int Y;
   public static int J;
   int W;
   KV L;
   GradientPaint k;
   boolean h;
   Font o;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long e;

   Kz_4(boolean var1) {
      Color var10001 = new Color(a(2436, 5943810783130428494L), a(24698, 8272176761077747127L), a(24698, 8272176761077747127L));
      long var3 = 264277659433671324L;
      Color var2 = var10001;
      Ref.s(264277659433671324L, var2, var3);
      BasicStroke var10002 = new BasicStroke(1.0F, 0, 2, 0.0F, new float[]{1.0F, 3.0F}, 0.0F);
      long var5 = 333339938931776115L;
      BasicStroke var4 = var10002;
      Ref.s(333339938931776115L, var4, var5);
      BasicStroke var10003 = new BasicStroke();
      long var7 = 367001539238364134L;
      BasicStroke var6 = var10003;
      Ref.s(367001539238364134L, var6, var7);
      Registry.lookupField(169932481795517130L).setInt(this, a(14019, 4260299206178085658L));
      Registry.lookupField(462162872101477141L).setInt(this, a(24557, 394913765627589182L));
      Registry.lookupField(472643134503049350L).setBoolean(this, var1);
      this.setMinimumSize(
         new Dimension(
            Registry.lookupField(169932481795517130L).getInt(this) * Registry.lookupField(443908032455270008L).getInt(null),
            Registry.lookupField(462162872101477141L).getInt(this)
         )
      );
      this.setPreferredSize(
         new Dimension(
            Registry.lookupField(169932481795517130L).getInt(this) * Registry.lookupField(443908032455270008L).getInt(null),
            Registry.lookupField(462162872101477141L).getInt(this)
         )
      );
      Font var10004 = new Font((String)Registry.lookupField(523981883291410284L).get(null), 0, a(14120, 653656738651773670L));
      long var9 = 261008078319392333L;
      Font var8 = var10004;
      Ref.s(261008078319392333L, var8, var9);
   }

   public void j(KV var1) {
      long var3 = 138736762734453887L;
      Ref.s(138736762734453887L, var1, var3);
      this.repaint();
   }

   @Override
   public void paint(Graphics var1) {
      GradientPaint var10001 = new GradientPaint(
         0.0F,
         0.0F,
         new Color(a(13457, 550192635991693646L), a(3241, 2348612885128552806L), a(26125, 6329081782754692055L), 0),
         0.0F,
         (float)this.getHeight(),
         new Color(a(22670, 4485871212771734853L), a(28520, 6384374000793731748L), a(5752, 6841454373574589350L), a(21327, 4602759460838407834L))
      );
      long var33 = 358435710073559422L;
      GradientPaint var32 = var10001;
      Ref.s(358435710073559422L, var32, var33);
      Color var3 = new Color(a(6731, 3857170459415754647L), a(10388, 6515818549129741661L), a(10388, 6515818549129741661L));
      byte var4 = 0;
      Object var5 = 2;
      int var6 = (int)((float)this.getHeight() / 3.0F);
      int var7 = a(1712, 6215117487230200680L);
      SpeedTestFrame.K();
      BasicStroke var8 = new BasicStroke(2.0F, 0, 2, 0.0F, new float[]{1.0F, 0.0F}, 0.0F);
      Graphics2D var9 = (Graphics2D)var1;
      var9.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      Object var34 = 358435710073559422L;
      this.setPaint((GradientPaint)Ref.g(358435710073559422L, var34));
      Graphics2D var2 = var9;
      var9.fillRect(0, 0, this.getWidth(), this.getHeight());
      Object var36 = 138736762734453887L;
      KV var10003 = (KV)Ref.g(138736762734453887L, var36);
      if (var9 != null) {
         if (var10003 == null) {
            return;
         }

         Object var38 = 138736762734453887L;
         KV var10004 = (KV)Ref.g(138736762734453887L, var38);
      }

      ArrayList var75 = (ArrayList)(Registry.emptyArgs());
      long var41 = 174879372698186460L;
      Object[] var40 = var75;
      var75 = Ref.h(174879372698186460L, var40, var41);

      try {
         var75 = (ArrayList)var75;
      } catch (InvocationTargetException var60) {
         throw var60.getTargetException();
      }

      ArrayList var10 = var75;
      Object var42 = 138736762734453887L;
      Ref.g(138736762734453887L, var42);
      ArrayList var10006 = (ArrayList)(Registry.emptyArgs());
      long var45 = 397464978562681153L;
      Object[] var44 = var10006;
      var10006 = Ref.h(397464978562681153L, var44, var45);

      try {
         var10006 = (ArrayList)var10006;
      } catch (InvocationTargetException var59) {
         throw var59.getTargetException();
      }

      ArrayList var11;
      long var12;
      Object var10007;
      label228: {
         label234: {
            var11 = var10006;
            var12 = e;
            int var14 = 0;
            byte var80 = (Registry.lookupField(472643134503049350L).getBoolean(this)) ? 1 : 0;
            if (var9 != null) {
               if (var80 != 0) {
                  int var15 = 0;

                  while (var15 < var10.size()) {
      int var81;
                     var81 = var15;
                     var10007 = (this.getWidth() - var7) / Registry.lookupField(169932481795517130L).getInt(this);
                     if (var2 == null) {
                        break label228;
                     }

                     if (var15 > var10007 && var2 != null) {
                        break;
                     }

                     label237: {
                        long var16 = (Long)var10.get(var10.size() - var15 - 1);
                        long var85;
                        int var82 = (var85 = var16 - var12) == 0L ? 0 : (var85 < 0L ? -1 : 1);
                        if (var2 != null) {
                           if (var82 > 0) {
                              var12 = var16;
                           }

                           var14++;
                           if (var2 == null) {
                              break label237;
                           }

                           var82 = var14;
                        }

                        if (var82 > (this.getWidth() - var7) / Registry.lookupField(169932481795517130L).getInt(this) && var2 != null) {
                           break;
                        }

                        var15++;
                     }

                     if (var2 == null) {
                        break;
                     }
                  }

                  if (var2 != null) {
                     break label234;
                  }
               }

               var14 = 0;
               var80 = 0;
            }

            int var61 = var80;

            while (var61 < var11.size()) {
      int var81;
               var81 = var61;
               var10007 = (this.getWidth() - var7) / Registry.lookupField(169932481795517130L).getInt(this);
               if (var2 == null) {
                  break label228;
               }

               if (var61 > var10007 && var2 != null) {
                  break;
               }

               label240: {
                  long var64 = (Long)var11.get(var11.size() - var61 - 1);
                  long var86;
                  int var83 = (var86 = var64 - var12) == 0L ? 0 : (var86 < 0L ? -1 : 1);
                  if (var2 != null) {
                     if (var83 > 0) {
                        var12 = var64;
                     }

                     var14++;
                     if (var2 == null) {
                        break label240;
                     }

                     var83 = var14;
                  }

                  if (var83 > (this.getWidth() - var7) / Registry.lookupField(169932481795517130L).getInt(this) && var2 != null) {
                     break;
                  }

                  var61++;
               }

               if (var2 == null) {
                  break;
               }
            }
         }

         var12 = (long)((float)var12 * 1.04F);
         var81 = this.getHeight() - var6;
         var10007 = var5;
      }

      int var62 = var81 + var10007;
      Object var46 = 333339938931776115L;
      this.setStroke((Stroke)Ref.g(333339938931776115L, var46));

      while (true) {
         var9.setColor(var3);
         var9.drawLine(this.getWidth(), var62, var7 - 5, var62);
         Object var48 = 261008078319392333L;
         this.setFont((Font)Ref.g(261008078319392333L, var48));
         var9.setColor(Color.white);
         var62 -= var6;
         if (var62 > 0 && var62 <= 3) {
         }

         while (var62 < 0) {
            if (var2 != null) {
               Color var17;
               int var18;
               ArrayList var19;
               Color var65;
               label165: {
                  label164: {
                     var65 = new Color(
                        a(21031, 8643554545650401263L), a(10357, 7370235180625266094L), a(21031, 8643554545650401263L), a(10388, 6515818549129741661L)
                     );
                     var17 = new Color(a(31615, 5091607063362754210L), a(28828, 2776704135425842507L), 0, a(8418, 2804086561583074598L));
                     var18 = 0;
                     var19 = new ArrayList();
                     if (var2 != null) {
                        if (!Registry.lookupField(472643134503049350L).getBoolean(this)) {
                           break label164;
                        }

                        var19 = var10;
                     }

                     if (var2 != null) {
                        break label165;
                     }
                  }

                  var19 = var11;
               }

               int var20 = 0;
               int var21 = this.getWidth();
               var9.setStroke(var8);

               int var10009;
               Graphics2D var10010;
               while (true) {
                  if (var20 > -1) {
                     var10009 = var19.size() - 1;
                     var10010 = var2;
                     if (var2 == null) {
                        break;
                     }

                     var10010 = var2;
                     if (var2 == null) {
                        break;
                     }

                     if (var20 <= var10009) {
                        int var25;
                        label149: {
                           label148: {
                              long var22 = (Long)var19.get(var20);
                              var21 = var7 + (var18 + 1) * Registry.lookupField(169932481795517130L).getInt(this);
                              int var24 = (int)((float)(this.getHeight() - var5) * ((float)var22 / (float)var12));
                              var25 = this.getHeight() - var24 - var5;
                              if (var2 != null) {
                                 if (!Registry.lookupField(472643134503049350L).getBoolean(this)) {
                                    break label148;
                                 }

                                 var9.setColor(var65);
                              }

                              if (var2 != null) {
                                 break label149;
                              }
                           }

                           var9.setColor(var17);
                        }

                        label140: {
                           int var28 = var7 + (var19.size() + 2) * Registry.lookupField(169932481795517130L).getInt(this);
                           int var30 = 0;
                           int var10008 = var20;
                           if (var2 != null) {
                              if (var20 > 0) {
                                 long var26 = (Long)var19.get(var20 - 1);
                                 var28 = var7 + var18 * Registry.lookupField(169932481795517130L).getInt(this);
                                 int var29 = (int)((float)(this.getHeight() - var5) * ((float)var26 / (float)var12));
                                 var30 = this.getHeight() - var29 - var5;
                                 Float var31 = new Float();
                                 var9.drawLine(var21, var25, var28, var30);
                                 var9.draw(var31);
                                 if (var2 != null) {
                                    break label140;
                                 }
                              }

                              var28 = var7;
                              var10008 = 0;
                           }

                           int var72 = var10008;
                           var30 = this.getHeight() - var72 - var5;
                           var9.drawLine(var21, var25, var28, var30);
                        }

                        if (var21 >= var7 || var2 == null) {
                           var18++;
                           var20++;
                           if (var2 != null) {
                              continue;
                           }
                        }
                     }
                  }

                  Object var50 = 367001539238364134L;
                  this.setStroke((Stroke)Ref.g(367001539238364134L, var50));
                  var10009 = this.getHeight() - var6;
                  var10010 = (Graphics2D)var5;
                  break;
               }

               var62 = var10009 - var10010;
               Color var67 = new Color(0, 0, 0, a(28770, 3656700641706204595L));
               var9.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);

               do {
                  int var23 = this.getHeight() - var62;
                  int var69 = (int)((float)var23 * ((float)var12 / (float)(this.getHeight() - var5 - var4)));
                  Object var52 = 261008078319392333L;
                  this.setFont((Font)Ref.g(261008078319392333L, var52));
                  var9.setColor(
                     new Color(a(31615, 5091607063362754210L), a(31615, 5091607063362754210L), a(31615, 5091607063362754210L), a(18394, 53471572812098058L))
                  );
                  Registry.e((long)var69);
                  long var54 = 408529162510360196L;
                  Object var10011 = Ref.h2(408529162510360196L, var54);

                  try {
                     var10011 = (String)var10011;
                  } catch (InvocationTargetException var58) {
                     throw var58.getTargetException();
                  }

                  String var70 = var10011.replaceAll(a(31005, -16297), "").replaceAll(a(31006, -32144), a(31004, 21053));
                  var9.drawString(var70, 4, var62 + 5);
                  var9.setColor(var67);
                  var9.drawString(var70, 3, var62 + 4);
                  var62 -= var6;
                  if (var62 <= a(6838, 3025304357728892787L)) {
                     if (var2 == null) {
                        continue;
                     }

                     var62 += 7;
                  }

                  if (var62 < 0 && var2 != null) {
                     break;
                  }
               } while (var2 != null);

               Object var56 = 367001539238364134L;
               this.setStroke((Stroke)Ref.g(367001539238364134L, var56));
               Color var68 = new Color(
                  a(31625, 9071118801113470559L), a(11144, 5826958519739713116L), a(10388, 6515818549129741661L), a(18394, 53471572812098058L)
               );
               var9.setColor(var68);
               var9.drawLine(0, this.getHeight() - 1, this.getWidth() - 1, this.getHeight() - 1);
               if (Ky4.F$arrString() != null) {
                  SpeedTestFrame.k(new Ky4[1]);
               }

               return;
            }
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 31004) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 60;
               break;
            case 1:
               var10000 = 139;
               break;
            case 2:
               var10000 = 31;
               break;
            case 3:
               var10000 = 0;
               break;
            case 4:
               var10000 = 42;
               break;
            case 5:
               var10000 = 150;
               break;
            case 6:
               var10000 = 11;
               break;
            case 7:
               var10000 = 35;
               break;
            case 8:
               var10000 = 5;
               break;
            case 9:
               var10000 = 21;
               break;
            case 10:
               var10000 = 189;
               break;
            case 11:
               var10000 = 6;
               break;
            case 12:
               var10000 = 90;
               break;
            case 13:
               var10000 = 135;
               break;
            case 14:
               var10000 = 182;
               break;
            case 15:
               var10000 = 111;
               break;
            case 16:
               var10000 = 207;
               break;
            case 17:
               var10000 = 193;
               break;
            case 18:
               var10000 = 9;
               break;
            case 19:
               var10000 = 124;
               break;
            case 20:
               var10000 = 77;
               break;
            case 21:
               var10000 = 222;
               break;
            case 22:
               var10000 = 163;
               break;
            case 23:
               var10000 = 63;
               break;
            case 24:
               var10000 = 212;
               break;
            case 25:
               var10000 = 108;
               break;
            case 26:
               var10000 = 188;
               break;
            case 27:
               var10000 = 181;
               break;
            case 28:
               var10000 = 95;
               break;
            case 29:
               var10000 = 155;
               break;
            case 30:
               var10000 = 96;
               break;
            case 31:
               var10000 = 4;
               break;
            case 32:
               var10000 = 201;
               break;
            case 33:
               var10000 = 15;
               break;
            case 34:
               var10000 = 100;
               break;
            case 35:
               var10000 = 109;
               break;
            case 36:
               var10000 = 10;
               break;
            case 37:
               var10000 = 131;
               break;
            case 38:
               var10000 = 223;
               break;
            case 39:
               var10000 = 225;
               break;
            case 40:
               var10000 = 202;
               break;
            case 41:
               var10000 = 190;
               break;
            case 42:
               var10000 = 45;
               break;
            case 43:
               var10000 = 27;
               break;
            case 44:
               var10000 = 114;
               break;
            case 45:
               var10000 = 115;
               break;
            case 46:
               var10000 = 89;
               break;
            case 47:
               var10000 = 41;
               break;
            case 48:
               var10000 = 161;
               break;
            case 49:
               var10000 = 112;
               break;
            case 50:
               var10000 = 170;
               break;
            case 51:
               var10000 = 117;
               break;
            case 52:
               var10000 = 12;
               break;
            case 53:
               var10000 = 204;
               break;
            case 54:
               var10000 = 158;
               break;
            case 55:
               var10000 = 149;
               break;
            case 56:
               var10000 = 75;
               break;
            case 57:
               var10000 = 85;
               break;
            case 58:
               var10000 = 68;
               break;
            case 59:
               var10000 = 218;
               break;
            case 60:
               var10000 = 76;
               break;
            case 61:
               var10000 = 29;
               break;
            case 62:
               var10000 = 253;
               break;
            case 63:
               var10000 = 61;
               break;
            case 64:
               var10000 = 53;
               break;
            case 65:
               var10000 = 133;
               break;
            case 66:
               var10000 = 123;
               break;
            case 67:
               var10000 = 144;
               break;
            case 68:
               var10000 = 80;
               break;
            case 69:
               var10000 = 78;
               break;
            case 70:
               var10000 = 69;
               break;
            case 71:
               var10000 = 47;
               break;
            case 72:
               var10000 = 57;
               break;
            case 73:
               var10000 = 128;
               break;
            case 74:
               var10000 = 43;
               break;
            case 75:
               var10000 = 93;
               break;
            case 76:
               var10000 = 215;
               break;
            case 77:
               var10000 = 231;
               break;
            case 78:
               var10000 = 185;
               break;
            case 79:
               var10000 = 210;
               break;
            case 80:
               var10000 = 216;
               break;
            case 81:
               var10000 = 99;
               break;
            case 82:
               var10000 = 184;
               break;
            case 83:
               var10000 = 54;
               break;
            case 84:
               var10000 = 7;
               break;
            case 85:
               var10000 = 209;
               break;
            case 86:
               var10000 = 67;
               break;
            case 87:
               var10000 = 20;
               break;
            case 88:
               var10000 = 230;
               break;
            case 89:
               var10000 = 104;
               break;
            case 90:
               var10000 = 44;
               break;
            case 91:
               var10000 = 19;
               break;
            case 92:
               var10000 = 175;
               break;
            case 93:
               var10000 = 152;
               break;
            case 94:
               var10000 = 74;
               break;
            case 95:
               var10000 = 147;
               break;
            case 96:
               var10000 = 87;
               break;
            case 97:
               var10000 = 58;
               break;
            case 98:
               var10000 = 141;
               break;
            case 99:
               var10000 = 168;
               break;
            case 100:
               var10000 = 178;
               break;
            case 101:
               var10000 = 26;
               break;
            case 102:
               var10000 = 206;
               break;
            case 103:
               var10000 = 176;
               break;
            case 104:
               var10000 = 227;
               break;
            case 105:
               var10000 = 249;
               break;
            case 106:
               var10000 = 154;
               break;
            case 107:
               var10000 = 129;
               break;
            case 108:
               var10000 = 156;
               break;
            case 109:
               var10000 = 224;
               break;
            case 110:
               var10000 = 1;
               break;
            case 111:
               var10000 = 213;
               break;
            case 112:
               var10000 = 49;
               break;
            case 113:
               var10000 = 138;
               break;
            case 114:
               var10000 = 105;
               break;
            case 115:
               var10000 = 33;
               break;
            case 116:
               var10000 = 148;
               break;
            case 117:
               var10000 = 246;
               break;
            case 118:
               var10000 = 88;
               break;
            case 119:
               var10000 = 236;
               break;
            case 120:
               var10000 = 238;
               break;
            case 121:
               var10000 = 83;
               break;
            case 122:
               var10000 = 30;
               break;
            case 123:
               var10000 = 252;
               break;
            case 124:
               var10000 = 167;
               break;
            case 125:
               var10000 = 34;
               break;
            case 126:
               var10000 = 46;
               break;
            case 127:
               var10000 = 18;
               break;
            case 128:
               var10000 = 248;
               break;
            case 129:
               var10000 = 116;
               break;
            case 130:
               var10000 = 2;
               break;
            case 131:
               var10000 = 121;
               break;
            case 132:
               var10000 = 22;
               break;
            case 133:
               var10000 = 130;
               break;
            case 134:
               var10000 = 118;
               break;
            case 135:
               var10000 = 177;
               break;
            case 136:
               var10000 = 162;
               break;
            case 137:
               var10000 = 229;
               break;
            case 138:
               var10000 = 8;
               break;
            case 139:
               var10000 = 217;
               break;
            case 140:
               var10000 = 64;
               break;
            case 141:
               var10000 = 143;
               break;
            case 142:
               var10000 = 79;
               break;
            case 143:
               var10000 = 136;
               break;
            case 144:
               var10000 = 245;
               break;
            case 145:
               var10000 = 247;
               break;
            case 146:
               var10000 = 172;
               break;
            case 147:
               var10000 = 140;
               break;
            case 148:
               var10000 = 134;
               break;
            case 149:
               var10000 = 171;
               break;
            case 150:
               var10000 = 126;
               break;
            case 151:
               var10000 = 32;
               break;
            case 152:
               var10000 = 84;
               break;
            case 153:
               var10000 = 132;
               break;
            case 154:
               var10000 = 242;
               break;
            case 155:
               var10000 = 192;
               break;
            case 156:
               var10000 = 56;
               break;
            case 157:
               var10000 = 142;
               break;
            case 158:
               var10000 = 183;
               break;
            case 159:
               var10000 = 73;
               break;
            case 160:
               var10000 = 173;
               break;
            case 161:
               var10000 = 233;
               break;
            case 162:
               var10000 = 59;
               break;
            case 163:
               var10000 = 102;
               break;
            case 164:
               var10000 = 250;
               break;
            case 165:
               var10000 = 219;
               break;
            case 166:
               var10000 = 160;
               break;
            case 167:
               var10000 = 40;
               break;
            case 168:
               var10000 = 197;
               break;
            case 169:
               var10000 = 199;
               break;
            case 170:
               var10000 = 235;
               break;
            case 171:
               var10000 = 194;
               break;
            case 172:
               var10000 = 180;
               break;
            case 173:
               var10000 = 196;
               break;
            case 174:
               var10000 = 48;
               break;
            case 175:
               var10000 = 205;
               break;
            case 176:
               var10000 = 106;
               break;
            case 177:
               var10000 = 243;
               break;
            case 178:
               var10000 = 239;
               break;
            case 179:
               var10000 = 220;
               break;
            case 180:
               var10000 = 221;
               break;
            case 181:
               var10000 = 3;
               break;
            case 182:
               var10000 = 198;
               break;
            case 183:
               var10000 = 169;
               break;
            case 184:
               var10000 = 97;
               break;
            case 185:
               var10000 = 51;
               break;
            case 186:
               var10000 = 55;
               break;
            case 187:
               var10000 = 187;
               break;
            case 188:
               var10000 = 107;
               break;
            case 189:
               var10000 = 37;
               break;
            case 190:
               var10000 = 103;
               break;
            case 191:
               var10000 = 157;
               break;
            case 192:
               var10000 = 151;
               break;
            case 193:
               var10000 = 72;
               break;
            case 194:
               var10000 = 70;
               break;
            case 195:
               var10000 = 119;
               break;
            case 196:
               var10000 = 71;
               break;
            case 197:
               var10000 = 91;
               break;
            case 198:
               var10000 = 39;
               break;
            case 199:
               var10000 = 36;
               break;
            case 200:
               var10000 = 82;
               break;
            case 201:
               var10000 = 92;
               break;
            case 202:
               var10000 = 122;
               break;
            case 203:
               var10000 = 255;
               break;
            case 204:
               var10000 = 164;
               break;
            case 205:
               var10000 = 25;
               break;
            case 206:
               var10000 = 137;
               break;
            case 207:
               var10000 = 153;
               break;
            case 208:
               var10000 = 101;
               break;
            case 209:
               var10000 = 81;
               break;
            case 210:
               var10000 = 254;
               break;
            case 211:
               var10000 = 200;
               break;
            case 212:
               var10000 = 214;
               break;
            case 213:
               var10000 = 240;
               break;
            case 214:
               var10000 = 244;
               break;
            case 215:
               var10000 = 13;
               break;
            case 216:
               var10000 = 251;
               break;
            case 217:
               var10000 = 145;
               break;
            case 218:
               var10000 = 174;
               break;
            case 219:
               var10000 = 241;
               break;
            case 220:
               var10000 = 166;
               break;
            case 221:
               var10000 = 24;
               break;
            case 222:
               var10000 = 120;
               break;
            case 223:
               var10000 = 38;
               break;
            case 224:
               var10000 = 16;
               break;
            case 225:
               var10000 = 50;
               break;
            case 226:
               var10000 = 66;
               break;
            case 227:
               var10000 = 28;
               break;
            case 228:
               var10000 = 127;
               break;
            case 229:
               var10000 = 234;
               break;
            case 230:
               var10000 = 226;
               break;
            case 231:
               var10000 = 195;
               break;
            case 232:
               var10000 = 211;
               break;
            case 233:
               var10000 = 110;
               break;
            case 234:
               var10000 = 191;
               break;
            case 235:
               var10000 = 179;
               break;
            case 236:
               var10000 = 86;
               break;
            case 237:
               var10000 = 186;
               break;
            case 238:
               var10000 = 165;
               break;
            case 239:
               var10000 = 237;
               break;
            case 240:
               var10000 = 113;
               break;
            case 241:
               var10000 = 125;
               break;
            case 242:
               var10000 = 159;
               break;
            case 243:
               var10000 = 14;
               break;
            case 244:
               var10000 = 232;
               break;
            case 245:
               var10000 = 94;
               break;
            case 246:
               var10000 = 208;
               break;
            case 247:
               var10000 = 23;
               break;
            case 248:
               var10000 = 62;
               break;
            case 249:
               var10000 = 228;
               break;
            case 250:
               var10000 = 203;
               break;
            case 251:
               var10000 = 65;
               break;
            case 252:
               var10000 = 146;
               break;
            case 253:
               var10000 = 17;
               break;
            case 254:
               var10000 = 98;
               break;
            default:
               var10000 = 52;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11741;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var15 = new String[3];
      int var13 = 0;
      String var12 = "\u008f¦\u0002\u0080Ã\u0006\u0002yÂ\u0091\u0098\u0092";
      int var14 = "\u008f¦\u0002\u0080Ã\u0006\u0002yÂ\u0091\u0098\u0092".length();
      char var11 = 2;
      int var10 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var12.substring(++var10, var10 + var11).toCharArray();
            int var10004 = var10003.length;
            int var16 = 0;
            byte var31 = 38;
            var10002 = var10003;
            int var19 = var10004;
            byte var36;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var36 = 38;
               var10006 = var16;
            } else {
               var31 = 38;
               var19 = var10004;
               if (var10004 <= var16) {
                  break label56;
               }

               var10005 = var10003;
               var36 = 38;
               var10006 = var16;
            }

            while (true) {
               char var50 = var10005[var10006];
               byte var51;
               switch (var16 % 7) {
                  case 0:
                     var51 = 117;
                     break;
                  case 1:
                     var51 = 110;
                     break;
                  case 2:
                     var51 = 69;
                     break;
                  case 3:
                     var51 = 30;
                     break;
                  case 4:
                     var51 = 22;
                     break;
                  case 5:
                     var51 = 43;
                     break;
                  default:
                     var51 = 89;
               }

               var10005[var10006] = (char)(var50 ^ var36 ^ var51);
               var16++;
               if (var31 == 0) {
                  var10006 = var31;
                  var10005 = var10002;
                  var36 = var31;
               } else {
                  if (var19 <= var16) {
                     break;
                  }

                  var10005 = var10002;
                  var36 = var31;
                  var10006 = var16;
               }
            }
         }

         String var33 = new String(var10002).intern();
         int var21 = -1;
         var15[var13++] = var33;
         if ((var10 += var11) >= var14) {
            a = var15;
            b = new String[3];
            long var2 = 2005121138260477025L;
            long[] var8 = new long[26];
            int var5 = 0;
            String var6 = "ÖËO\u008eò?Ò<*¶\u0085\u0003\u0086?³`¶\u0000¤n«ö\u009dâ£ÜM\u0096jP?=å\t6îl»\u001foí\u0091f\u0084Ö\b/;R;¦ZÅå\u0001«téo\u0086\u000eÙÏC¨Õ\u0005/àsú½®\\}\u0012\u008b¡\u0002¿\u0091\u008a\u0015\u0084/ÎÙ\u0018^\u0010vÀ&\u0018ÒxO\u0094P¾7sÙfp\u001aöµ\u008e¯n\u000fk}=\u009f\u0004\u0080v\u0005Äã¥w\u0002VÇY\u0084#\u001dO\u008aãI\u0004`5m¿×(F:Ò$¹D\u0085Z¥ò^:OË\tÅ\u009e\u008bÑ\n|\u0017\u0080c\u0001ªs7M\"k\u0090û\u009aë_w,èÌqÅ|ªu\u0001]\u0004 ý";
            int var7 = "ÖËO\u008eò?Ò<*¶\u0085\u0003\u0086?³`¶\u0000¤n«ö\u009dâ£ÜM\u0096jP?=å\t6îl»\u001foí\u0091f\u0084Ö\b/;R;¦ZÅå\u0001«téo\u0086\u000eÙÏC¨Õ\u0005/àsú½®\\}\u0012\u008b¡\u0002¿\u0091\u008a\u0015\u0084/ÎÙ\u0018^\u0010vÀ&\u0018ÒxO\u0094P¾7sÙfp\u001aöµ\u008e¯n\u000fk}=\u009f\u0004\u0080v\u0005Äã¥w\u0002VÇY\u0084#\u001dO\u008aãI\u0004`5m¿×(F:Ò$¹D\u0085Z¥ò^:OË\tÅ\u009e\u008bÑ\n|\u0017\u0080c\u0001ªs7M\"k\u0090û\u009aë_w,èÌqÅ|ªu\u0001]\u0004 ý"
               .length();
            byte var4 = 0;

            label40:
            while (true) {
               var21 = var4;
               var4 += 8;
               byte[] var9 = var6.substring(var21, var4).getBytes("ISO-8859-1");
               long[] var10000 = var8;
               var21 = var5++;
               long var28 = ((long)var9[0] & 255L) << 56
                  | ((long)var9[1] & 255L) << 48
                  | ((long)var9[2] & 255L) << 40
                  | ((long)var9[3] & 255L) << 32
                  | ((long)var9[4] & 255L) << 24
                  | ((long)var9[5] & 255L) << 16
                  | ((long)var9[6] & 255L) << 8
                  | (long)var9[7] & 255L;
               byte var34 = -1;

               while (true) {
                  long var41 = var28 ^ var2;
                  switch (var34) {
                     case 0:
                        var10000[var21] = var41;
                        if (var4 >= var7) {
                           c = var8;
                           d = new Integer[26];
                           long var0 = 8718879861034257117L;
                           long var30 = 8718879861034257111L ^ var0;
                           byte var25 = -1;
                           e = var30;
                           Registry.lookupField(443908032455270008L).setInt(null, a(28389, 7908668044450349879L));
                           return;
                        }
                        break;
                     default:
                        var10000[var21] = var41;
                        if (var4 < var7) {
                           continue label40;
                        }

                        var6 = ":\u0085¾Qâ{³\u0018\u009f\u0016lþÇ?\u0089í";
                        var7 = ":\u0085¾Qâ{³\u0018\u009f\u0016lþÇ?\u0089í".length();
                        var4 = 0;
                  }

                  byte var24 = var4;
                  var4 += 8;
                  var9 = var6.substring(var24, var4).getBytes("ISO-8859-1");
                  var10000 = var8;
                  var21 = var5++;
                  var28 = ((long)var9[0] & 255L) << 56
                     | ((long)var9[1] & 255L) << 48
                     | ((long)var9[2] & 255L) << 40
                     | ((long)var9[3] & 255L) << 32
                     | ((long)var9[4] & 255L) << 24
                     | ((long)var9[5] & 255L) << 16
                     | ((long)var9[6] & 255L) << 8
                     | (long)var9[7] & 255L;
                  var34 = 0;
               }
            }
         }

         var11 = var12.charAt(var10);
      }
   }
}





