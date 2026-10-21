package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.text.View;

public class OH3 extends BasicTabbedPaneUI {
   public final Color n = new Color(a(30869, 6331030130161647827L), a(17023, 8587638417083120188L), a(17023, 8587638417083120188L));
   public final Color b = new Color(a(26737, 3913403077390078010L), a(18950, 5803028987773727306L), a(18950, 5803028987773727306L));
   public static String a;
   public static long[] c;
   public static Integer[] d;

   public static ComponentUI createUI(JComponent var0) {
      return new OH3();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   protected void paintTabArea(Graphics var1, int var2, int var3) {
      Graphics2D var5 = (Graphics2D)var1;
      int var6 = this.tabPane.getTabCount();
      String var10000 = com.finalshell.ui.panel.Hd2.X();
      Rectangle var7 = new Rectangle();
      String var4 = var10000;
      Rectangle var8 = new Rectangle();
      Rectangle var9 = var1.getClipBounds();
      int var10 = -1;
      int var11 = -1;
      int var12 = -1;
      int var13 = this.runCount - 1;

      label124: {
         while (true) {
            if (var13 >= 0) {
               int var14 = 0;
               int var15 = this.tabRuns[var13];
               var20 = this;
               if (var4 == null) {
                  break;
               }

               int var24;
               label113: {
                  var24 = var13;
                  int var10002 = this.runCount - 1;
                  if (var4 != null) {
                     if (var13 == var10002) {
                        var24 = 0;
                        break label113;
                     }

                     var24 = var13;
                     var10002 = 1;
                  }

                  var24 += var10002;
               }

               label106: {
                  int var16 = this.tabRuns[var24];
                  int var21 = var16;
                  byte var25;
                  if (var4 != null) {
                     if (var16 != 0) {
                        var22 = var16 - 1;
                        break label106;
                     }

                     var21 = var6;
                     var25 = 1;
                  } else {
                     var25 = 1;
                  }

                  var22 = var21 - var25;
               }

               label101:
               while (true) {
                  int var17 = var22;
                  int var18 = var17 - var15 + 1;
                  int var19 = var15;

                  while (true) {
                     if (var19 > var17) {
                        break label101;
                     }

                     int var23 = var19;
                     var24 = var3;
                     if (var4 == null) {
                        var22 = var19 - var3;
                        break;
                     }

                     if (var4 != null) {
                        if (var19 != var3) {
                           var23 = (this.rects[var19].intersects(var9)) ? 1 : 0;
                           if (var4 != null) {
                              if (var23 != 0) {
                                 this.R(var5, var2, this.rects, this.runCount - 1 - var13, var14, var18, var19, var7, var8);
                              }

                              var23 = var19;
                           }
                        } else {
                           var23 = var19;
                        }

                        var24 = var3;
                     }

                     label95: {
                        if (var4 != null) {
                           if (var23 != var24) {
                              break label95;
                           }

                           var23 = this.runCount - 1;
                           var24 = var13;
                        }

                        var10 = var23 - var24;
                        var11 = var14;
                        var12 = var18;
                     }

                     var14++;
                     var19++;
                     if (var4 == null) {
                        break label101;
                     }
                  }
               }

               var13--;
               if (var4 != null) {
                  continue;
               }

               if (var4 == null) {
                  if (var3 == 0) {
                     return;
                  }

                  var20 = this;
                  break label124;
               }

               if (var3 < 0) {
                  return;
               }

               var20 = this;
               break;
            }

            if (var4 == null) {
               if (var3 == 0) {
                  return;
               }

               var20 = this;
               break label124;
            }

            if (var3 < 0) {
               return;
            }

            var20 = this;
            break;
         }

         if (var4 != null) {
            if (!var20.rects[var3].intersects(var9)) {
               return;
            }

            var20 = this;
         }
      }

      var20.R(var5, var2, this.rects, var10, var11, var12, var3, var7, var8);
   }

   protected void R(Graphics2D var1, int var2, Rectangle[] var3, int var4, int var5, int var6, int var7, Rectangle var8, Rectangle var9) {
      String var10000 = com.finalshell.ui.panel.Hd2.X();
      Rectangle var11 = var3[var7];
      String var10 = var10000;
      int var12 = this.tabPane.getSelectedIndex();
      int var19 = var12;
      if (var10 != null) {
         var19 = var12 == var7 ? 1 : 0;
      }

      int var13 = var19;
      this.S(var1, var2, var4, var5, var6, var7, var11.x, var11.y, var11.width, var11.height, (boolean)var13);
      String var14 = this.tabPane.getTitleAt(var7);
      Font var15 = this.tabPane.getFont();
      FontMetrics var16 = FN.P(this.tabPane, var1, var15);
      Icon var17 = this.getIconForTab(var7);
      this.layoutLabel(var2, var16, var7, var14, var17, var11, var8, var9, (boolean)var13);
      boolean var18 = this.tabPane.getTabComponentAt(var7) == null;
      if (var10 != null) {
         if (!var18) {
            return;
         }

         this.paintIcon(var1, var2, var7, var17, var8, (boolean)var13);
      }

      this.paintText(var1, var2, var15, var16, var7, var14, var9, (boolean)var13);
   }

   @Override
   protected void paintText(Graphics var1, int var2, Font var3, FontMetrics var4, int var5, String var6, Rectangle var7, boolean var8) {
      Map var10;
      label60: {
         String var9;
         label57: {
            String var10000 = com.finalshell.ui.panel.Hd2.X();
            var10 = FN.B(var1);
            var1.setFont(var3);
            View var11 = this.getTextViewForTab(var5);
            var9 = var10000;
            View var15 = var11;
            if (var9 != null) {
               if (var11 == null) {
                  break label57;
               }

               var15 = var11;
            }

            var15.paint(var1, var7);
            if (var9 != null) {
               break label60;
            }
         }

         int var12 = this.tabPane.getDisplayedMnemonicIndexAt(var5);
         if (var9 != null) {
            label33:
            if (this.tabPane.isEnabled()) {
               JTabbedPane var16 = this.tabPane;
               int var10001 = var5;
               if (var9 != null) {
                  if (!this.tabPane.isEnabledAt(var5)) {
                     break label33;
                  }

                  var16 = this.tabPane;
                  var10001 = var5;
               }

               Color var13 = var16.getForegroundAt(var10001);
               label45:
               if (var9 != null) {
                  label43:
                  if (var8) {
                     Color var17 = var13;
                     if (var9 != null) {
                        if (!(var13 instanceof UIResource)) {
                           break label43;
                        }

                        var17 = UIManager.getColor(a);
                     }

                     Color var14 = var17;
                     if (var9 == null) {
                        break label45;
                     }

                     if (var14 != null) {
                        var13 = var14;
                     }
                  }

                  var1.setColor(var13);
                  FN.W(var1, var6, var12, var7.x, var7.y + var4.getAscent());
               }

               if (var9 != null) {
                  break label60;
               }
            }

            var1.setColor(this.tabPane.getBackgroundAt(var5).brighter());
            FN.W(var1, var6, var12, var7.x, var7.y + var4.getAscent());
            var1.setColor(this.tabPane.getBackgroundAt(var5).darker());
         }

         FN.W(var1, var6, var12, var7.x - 1, var7.y + var4.getAscent() - 1);
      }

      FN.O(var1, var10);
   }

   protected void S(Graphics2D var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      String var12;
      label132: {
         var12 = com.finalshell.ui.panel.Hd2.X();
         if (var12 != null) {
            if (var11 != 0) {
               var1.setPaint(
                  new GradientPaint(
                     (float)var7,
                     (float)var8,
                     Color.WHITE,
                     (float)var7,
                     (float)(var8 + var10),
                     new Color(a(20168, 1472741880331351686L), a(30094, 8038920903828639186L), a(30094, 8038920903828639186L))
                  )
               );
               var1.fillRect(var7 + 1, var8, var9 - 2, var10);
               if (var12 != null) {
                  break label132;
               }
            }

            var1.setPaint(
               new GradientPaint(
                  (float)var7,
                  (float)var8,
                  new Color(a(11228, 3245802035373757313L), a(10911, 49905407576789718L), a(10911, 49905407576789718L)),
                  (float)var7,
                  (float)(var8 + var10),
                  new Color(a(26976, 1610053688423649583L), a(12063, 2637917129769375570L), a(12063, 2637917129769375570L))
               )
            );
         }

         var1.fillRect(var7, var8, var9, var10);
      }

      int var10000 = var3;
      if (var12 != null) {
         var10000 = var3 > 0 ? 1 : 0;
      }

      int var13;
      var13 = var10000;
      var10000 = this.runCount;
      label124:
      if (var12 != null) {
         if (this.runCount != 1) {
            var10000 = var4;
            if (var12 == null) {
               break label124;
            }

            if (var4 >= var5 - 1) {
               var10000 = 0;
               break label124;
            }
         }

         var10000 = 1;
      }

      label135: {
         int var14 = var10000;
         var10000 = (var11) ? 1 : 0;
         if (var12 != null) {
            if (var11 != 0) {
               var1.setColor(this.n);
               var10000 = var13;
               if (var12 != null) {
                  if (var13 != 0) {
                     var1.drawLine(var7, var8, var7 + var9 - 1, var8);
                  }

                  var10000 = var14;
               }

               if (var10000 != 0) {
                  var1.drawLine(var7 + var9 - 1, var8, var7 + var9 - 1, var8 + var10 - 2);
               }

               var1.setColor(this.b);
               var1.drawLine(var7, var8 + 1, var7, var8 + var10 - 1);
               int var10001 = var7 + 1;
               int var10003 = var13;
               if (var12 != null) {
                  var10003 = var13 != 0 ? 1 : 0;
               }

               int var10002 = var8 + var10003;
               var10003 = var7 + var9;
               int var10004 = var14;
               if (var12 != null) {
                  var10004 = var14 != 0 ? 2 : 1;
               }

               var10003 -= var10004;
               int var10005 = var13;
               if (var12 != null) {
                  var10005 = var13 != 0 ? 1 : 0;
               }

               var1.drawLine(var10001, var10002, var10003, var8 + var10005);
               var10001 = var7 + var9;
               var10002 = var14;
               if (var12 != null) {
                  var10002 = var14 != 0 ? 2 : 1;
               }

               var10001 -= var10002;
               var10002 = var8 + 1;
               var10003 = var7 + var9;
               var10004 = var14;
               if (var12 != null) {
                  var10004 = var14 != 0 ? 2 : 1;
               }

               var1.drawLine(var10001, var10002, var10003 - var10004, var8 + var10 - 1);
               if (var12 != null) {
                  break label135;
               }
            }

            var10000 = var3;
         }

         if (var12 != null) {
            if (var10000 == 0) {
               var1.setPaint(new Color(a(27260, 1062375001290150456L), a(7428, 480317748196533574L), a(7428, 480317748196533574L)));
               var1.drawLine(var7, var8, var7 + var9 - 1, var8);
            }

            var1.setPaint(new Color(a(7428, 480317748196533574L), a(7428, 480317748196533574L), a(7428, 480317748196533574L)));
            var1.drawLine(var7, var8 + var10 - 1, var7 + var9 - 1, var8 + var10 - 1);
            var1.setPaint(new Color(a(26529, 8565113143162642409L), a(19051, 4099288931787878945L), a(19051, 4099288931787878945L)));
            var1.drawLine(var7, var8 + var10 - 2, var7 + var9 - 1, var8 + var10 - 2);
            var1.setColor(this.n);
            var10000 = var13;
         }

         if (var12 != null) {
            if (var10000 != 0) {
               var1.drawLine(var7, var8, var7 + var9 - 1, var8);
            }

            var10000 = var14;
         }

         if (var12 != null) {
            if (var10000 != 0) {
               var1.drawLine(var7 + var9 - 1, var8, var7 + var9 - 1, var8 + var10 - 1);
            }

            var10000 = var13;
         }

         if (var10000 != 0) {
            var1.setPaint(this.b);
            var1.drawLine(var7, var8 + 1, var7 + var9 - 2, var8 + 1);
         }
      }

      if (Ky4.F$arrString() != null) {
         com.finalshell.ui.panel.Hd2.E("mwW9xb");
      }
   }

   @Override
   protected void paintContentBorder(Graphics var1, int var2, int var3) {
      int var7;
      int var8;
      int var9;
      label22: {
         int var5 = this.tabPane.getWidth();
         String var10000 = com.finalshell.ui.panel.Hd2.X();
         Insets var6 = this.tabPane.getInsets();
         var7 = var6.left;
         String var4 = var10000;
         var8 = var6.top;
         var9 = var5 - var6.right - var6.left;
         int var11 = var2;
         if (var4 != null) {
            switch (var2) {
               case 2:
                  var7 += this.calculateTabAreaWidth(var2, this.runCount, this.maxTabWidth);
                  var9 -= var7 - var6.left;
                  if (var4 != null) {
                     break label22;
                  }

                  Ky4.K(new String[4]);
               case 4:
                  var9 -= this.calculateTabAreaWidth(var2, this.runCount, this.maxTabWidth);
                  if (var4 != null) {
                     break label22;
                  }
               case 3:
                  if (var4 != null) {
                     break label22;
                  }
               case 1:
               default:
                  var11 = var8 + this.calculateTabAreaHeight(var2, this.runCount, this.maxTabHeight);
            }
         }

         var8 = var11;
      }

      switch (var2) {
         case 1:
         case 2:
         case 3:
         case 4:
         default:
            Graphics2D var10 = (Graphics2D)var1;
            var10.setPaint(
               new GradientPaint(
                  (float)var7,
                  (float)(var8 + 1),
                  new Color(a(30094, 8038920903828639186L), a(30094, 8038920903828639186L), a(30094, 8038920903828639186L)),
                  (float)var7,
                  (float)(var8 + 3),
                  new Color(a(8008, 4498914647841892104L), a(3828, 8153646415644587699L), a(3828, 8153646415644587699L))
               )
            );
            var10.fillRect(var7, var8 + 1, var9, 3);
            var10.setPaint(this.n);
            var10.drawLine(var7, var8, var7 + var9, var8);
            var10.setPaint(this.b);
            var10.drawLine(var7, var8 + 1, var7, var8 + 3);
            var10.drawLine(var7 + var9 - 1, var8 + 1, var7 + var9 - 1, var8 + 3);
            var10.drawLine(var7, var8 + 1, var7 + var9, var8 + 1);
            var10.setPaint(new Color(a(22030, 2310957875248574031L), a(7923, 5591702179231426230L), a(7923, 5591702179231426230L)));
            var10.drawLine(var7, var8 + 4, var7 + var9, var8 + 4);
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30797;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "{\u0006\bh\u0011BjN\t\u000f$\u0007CVJ\u0004\u001eo\u0010`U]\u0002\rx\u001bSTK".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 92;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 92;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 115;
               break;
            case 1:
               var50 = 59;
               break;
            case 2:
               var50 = 54;
               break;
            case 3:
               var50 = 86;
               break;
            case 4:
               var50 = 40;
               break;
            case 5:
               var50 = 122;
               break;
            default:
               var50 = 102;
         }
      } else {
         var34 = 92;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 6257685085578504643L;
            long[] var14 = new long[18];
            int var11 = 0;
            String var12 = "¢\u0016ýjxøþ\\Ãv®N\u001f¦\u009bq\u008a\u0013\u009dïÕæ8!¿J\u001bÒ¬×\u001f\u00adÓ\f\u0097âhÖû÷ªËMËU\u0017¶âz.ü6 ë9\u0001\u0083zÆ\u009eÀÂ\u009b*¸\u0099\u0084\u001aÀ÷OÍÿ\u0093\u009fË\u0018\r;D»¼ìsV\u008b_\u0096\u0001§Z§p¾)µÕ\u0089à+Ï?\u00874é¨\u0083¯q@N-þÅ¼l_\u0096\u0013Z\u0083öåâ:»L:";
            int var13 = "¢\u0016ýjxøþ\\Ãv®N\u001f¦\u009bq\u008a\u0013\u009dïÕæ8!¿J\u001bÒ¬×\u001f\u00adÓ\f\u0097âhÖû÷ªËMËU\u0017¶âz.ü6 ë9\u0001\u0083zÆ\u009eÀÂ\u009b*¸\u0099\u0084\u001aÀ÷OÍÿ\u0093\u009fË\u0018\r;D»¼ìsV\u008b_\u0096\u0001§Z§p¾)µÕ\u0089à+Ï?\u00874é¨\u0083¯q@N-þÅ¼l_\u0096\u0013Z\u0083öåâ:»L:"
               .length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           c = var14;
                           d = new Integer[18];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "|ËÐ$S\u009bú ý/çb\u0010\u0001¤ù";
                        var13 = "|ËÐ$S\u009bú ý/çb\u0010\u0001¤ù".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 92;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 115;
               break;
            case 1:
               var50 = 59;
               break;
            case 2:
               var50 = 54;
               break;
            case 3:
               var50 = 86;
               break;
            case 4:
               var50 = 40;
               break;
            case 5:
               var50 = 122;
               break;
            default:
               var50 = 102;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 115;
                  break;
               case 1:
                  var50 = 59;
                  break;
               case 2:
                  var50 = 54;
                  break;
               case 3:
                  var50 = 86;
                  break;
               case 4:
                  var50 = 40;
                  break;
               case 5:
                  var50 = 122;
                  break;
               default:
                  var50 = 102;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 6257685085578504643L;
               long[] var6 = new long[18];
               int var3 = 0;
               String var4 = "¢\u0016ýjxøþ\\Ãv®N\u001f¦\u009bq\u008a\u0013\u009dïÕæ8!¿J\u001bÒ¬×\u001f\u00adÓ\f\u0097âhÖû÷ªËMËU\u0017¶âz.ü6 ë9\u0001\u0083zÆ\u009eÀÂ\u009b*¸\u0099\u0084\u001aÀ÷OÍÿ\u0093\u009fË\u0018\r;D»¼ìsV\u008b_\u0096\u0001§Z§p¾)µÕ\u0089à+Ï?\u00874é¨\u0083¯q@N-þÅ¼l_\u0096\u0013Z\u0083öåâ:»L:";
               int var5 = "¢\u0016ýjxøþ\\Ãv®N\u001f¦\u009bq\u008a\u0013\u009dïÕæ8!¿J\u001bÒ¬×\u001f\u00adÓ\f\u0097âhÖû÷ªËMËU\u0017¶âz.ü6 ë9\u0001\u0083zÆ\u009eÀÂ\u009b*¸\u0099\u0084\u001aÀ÷OÍÿ\u0093\u009fË\u0018\r;D»¼ìsV\u008b_\u0096\u0001§Z§p¾)µÕ\u0089à+Ï?\u00874é¨\u0083¯q@N-þÅ¼l_\u0096\u0013Z\u0083öåâ:»L:"
                  .length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              c = var6;
                              d = new Integer[18];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "|ËÐ$S\u009bú ý/çb\u0010\u0001¤ù";
                           var5 = "|ËÐ$S\u009bú ý/çb\u0010\u0001¤ù".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 115;
                  break;
               case 1:
                  var50 = 59;
                  break;
               case 2:
                  var50 = 54;
                  break;
               case 3:
                  var50 = 86;
                  break;
               case 4:
                  var50 = 40;
                  break;
               case 5:
                  var50 = 122;
                  break;
               default:
                  var50 = 102;
            }
         }
      }
   }
}





