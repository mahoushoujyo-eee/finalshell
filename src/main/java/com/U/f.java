package com.U;

import com.GO;
import com.RV;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.beans.PropertyChangeEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;

class f extends BasicSplitPaneDivider {
   protected final Border m;
   protected final Color e;
   protected final Color[] k;
   final y K;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   f(y var1, BasicSplitPaneUI var2) {
      super(var2);
      this.K = var1;
      this.m = BorderFactory.createEmptyBorder(0, 0, 0, 0);
      this.e = new Color(a(20066, 7593633442637922697L), a(305, 7863712319510154969L), a(305, 7863712319510154969L));
      this.k = new Color[]{GO.l, this.e, this.e, GO.l};
   }

   @Override
   public Border getBorder() {
      return this.m;
   }

   @Override
   protected JButton createLeftOneTouchButton() {
      boolean var1 = com.U.O.r();
      int var10000 = this.orientation;
      if (var1) {
         var10000 = this.orientation == 1 ? 1 : 0;
      }

      int var2 = var10000;
      ImageIcon var3 = this.K.N(true, (boolean)var2);
      com.KD var4 = com.KD.F(var3, 0, 0, 0, false, true, false);
      var4.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      var4.setCursor(Cursor.getDefaultCursor());
      var4.setPreferredSize(this.K.E((boolean)var2));
      var4.setFocusable(false);
      return var4;
   }

   @Override
   protected JButton createRightOneTouchButton() {
      boolean var1 = com.U.O.r();
      int var10000 = this.orientation;
      if (var1) {
         var10000 = this.orientation == 1 ? 1 : 0;
      }

      int var2 = var10000;
      ImageIcon var3 = this.K.N(false, (boolean)var2);
      com.KD var4 = com.KD.F(var3, 0, 0, 0, false, true, false);
      var4.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      var4.setCursor(Cursor.getDefaultCursor());
      var4.setPreferredSize(this.K.E((boolean)var2));
      var4.setFocusable(false);
      if (com.ky_4.F() != null) {
         com.U.O.o(!var1);
      }

      return var4;
   }

   @Override
   public void paint(Graphics var1) {
      Graphics2D var4;
      Object var5;
      com.U.f var13;
      label58: {
         label61: {
            boolean var10000 = com.U.O.r();
            int var3 = a(20309, 64345082587463868L);
            boolean var2 = var10000;
            var4 = (Graphics2D)var1;
            var5 = RV.X(var4);
            int var12 = this.orientation;
            int var10001 = 1;
            if (var2) {
               if (this.orientation == 1) {
                  int var6 = this.getHeight() / 2 - var3;
                  int var7 = this.getHeight() / 2 + var3;
                  var4.setPaint(new LinearGradientPaint(0.0F, (float)var6, 0.0F, (float)var7, new float[]{0.0F, 0.25F, 0.75F, 1.0F}, this.k));
                  int var8 = var6;

                  while (true) {
                     if (var8 < var7) {
                        var4.fillRect(this.getWidth() / 2 - 1, var8 - 1, 2, 2);
                        var8 += 6;
                        if (!var2) {
                           break;
                        }

                        if (var2) {
                           continue;
                        }

                        com.ky_4.K(new String[2]);
                     }

                     if (this.K.B) {
                        var4.setPaint(this.K.m);
                        var4.drawLine(0, 0, 0, this.getHeight() - 1);
                        var4.drawLine(this.getWidth() - 1, 0, this.getWidth() - 1, this.getHeight() - 1);
                     }
                     break;
                  }

                  if (var2) {
                     break label61;
                  }
               }

               var12 = this.getWidth() / 2;
               var10001 = var3;
            }

            int var9 = var12 - var10001;
            int var10 = this.getWidth() / 2 + var3;
            var4.setPaint(new LinearGradientPaint((float)var9, 0.0F, (float)var10, 0.0F, new float[]{0.0F, 0.25F, 0.75F, 1.0F}, this.k));
            int var11 = var9;

            while (var11 < var10) {
               var4.fillRect(var11 - 1, this.getHeight() / 2 - 1, 2, 2);
               var11 += 6;
               if (!var2) {
                  return;
               }

               if (!var2) {
                  break;
               }
            }

            var13 = this;
            if (!var2) {
               break label58;
            }

            if (this.K.B) {
               var4.setPaint(this.K.m);
               var4.drawLine(0, 0, this.getWidth() - 1, 0);
               var4.drawLine(0, this.getHeight() - 1, this.getWidth() - 1, this.getHeight() - 1);
            }
         }

         var13 = this;
      }

      var13.paint(var1);
      RV.X(var4, var5);
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      int var10000 = com.U.O.r();
      super.propertyChange(var1);
      boolean var2 = (boolean)var10000;
      PropertyChangeEvent var4 = var1;
      if (var2) {
         if (var1.getSource() != this.splitPane) {
            return;
         }

         var4 = var1;
      }

      var10000 = var4.getPropertyName().equals(a);
      if (var2) {
         if (var10000 == 0) {
            return;
         }

         var10000 = this.orientation;
      }

      if (var2) {
         var10000 = var10000 == 1 ? 1 : 0;
      }

      int var3 = var10000;
      JButton var6 = this.leftButton;
      if (var2) {
         if (this.leftButton != null) {
            this.leftButton.setIcon(this.K.N(true, (boolean)var3));
            this.leftButton.setPreferredSize(this.K.E((boolean)var3));
         }

         var6 = this.rightButton;
      }

      if (var2) {
         if (var6 == null) {
            return;
         }

         this.rightButton.setIcon(this.K.N(false, (boolean)var3));
         var6 = this.rightButton;
      }

      var6.setPreferredSize(this.K.E((boolean)var3));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "z\u0016FJ\u001d.\u0014a\r@A".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 103;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 103;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 114;
               break;
            case 1:
               var37 = 3;
               break;
            case 2:
               var37 = 72;
               break;
            case 3:
               var37 = 72;
               break;
            case 4:
               var37 = 20;
               break;
            case 5:
               var37 = 61;
               break;
            default:
               var37 = 18;
         }
      } else {
         var25 = 103;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 2626633179351483356L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "\u0096÷5º4+Ct5¸Ê\u000b\u0016Ä\r\u009bÐ\u0014\u001b\u0090ÔuÂË";
            int var13 = "\u0096÷5º4+Ct5¸Ê\u000b\u0016Ä\r\u009bÐ\u0014\u001b\u0090ÔuÂË".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            b = var14;
            c = new Integer[3];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 103;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 114;
               break;
            case 1:
               var37 = 3;
               break;
            case 2:
               var37 = 72;
               break;
            case 3:
               var37 = 72;
               break;
            case 4:
               var37 = 20;
               break;
            case 5:
               var37 = 61;
               break;
            default:
               var37 = 18;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 114;
                  break;
               case 1:
                  var37 = 3;
                  break;
               case 2:
                  var37 = 72;
                  break;
               case 3:
                  var37 = 72;
                  break;
               case 4:
                  var37 = 20;
                  break;
               case 5:
                  var37 = 61;
                  break;
               default:
                  var37 = 18;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 2626633179351483356L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "\u0096÷5º4+Ct5¸Ê\u000b\u0016Ä\r\u009bÐ\u0014\u001b\u0090ÔuÂË";
               int var5 = "\u0096÷5º4+Ct5¸Ê\u000b\u0016Ä\r\u009bÐ\u0014\u001b\u0090ÔuÂË".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
                  var18 = var3++;
                  long var34 = (
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
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               b = var6;
               c = new Integer[3];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 114;
                  break;
               case 1:
                  var37 = 3;
                  break;
               case 2:
                  var37 = 72;
                  break;
               case 3:
                  var37 = 72;
                  break;
               case 4:
                  var37 = 20;
                  break;
               case 5:
                  var37 = 61;
                  break;
               default:
                  var37 = 18;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4073;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





