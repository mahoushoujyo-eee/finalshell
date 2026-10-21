package com;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class LW extends com.Lz_2 {
   protected float[] G;
   protected Color[] Z;
   protected Color[] z;
   final com.kC_3 N;
   private static final long a;

   public LW(com.kC_3 var1) {
      this.N = var1;
      this.G = new float[]{0.0F, 0.25F, 0.75F, 1.0F};
      this.Z = new Color[]{GO.l, Color.WHITE, Color.WHITE, GO.l};
      this.z = new Color[]{GO.l, Color.GRAY, Color.GRAY, GO.l};
   }

   public Boolean v(com.ko_4 var1) {
      return true;
   }

   public void N(Graphics2D var1, Rectangle var2, com.ko_4 var3) {
      int[] var4 = com.k3_2.L();
      int var10000 = var3.L();
      if (var4 != null) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      int var5 = var10000;
      var10000 = var3.L();
      if (var4 != null) {
         var10000 = var10000 < com.kC_3.O(this.N).size() - 1 ? 1 : 0;
      }

      int var6;
      var6 = var10000;
      var10000 = var3.a();
      label132:
      if (var4 != null) {
         label130:
         if (var10000 != 0) {
            label128: {
               var1.setPaint(new GradientPaint((float)var2.x, (float)var2.y, GO.FR, (float)var2.x, (float)(var2.y + var2.height), GO.Q));
               var1.fill(var2);
               Integer var7 = this.N.v().O(var3);
               label127:
               if (var3.O()) {
                  Integer var18 = var7;
                  if (var4 != null) {
                     if (var7 == null) {
                        break label127;
                     }

                     var18 = var7;
                  }

                  var10000 = var18;
                  if (var4 == null) {
                     break label128;
                  }

                  if (var10000 != 0) {
                     var10000 = 1;
                     break label128;
                  }
               }

               var10000 = 0;
            }

            int var8;
            label116: {
               label115: {
                  var8 = var10000;
                  Graphics2D var20 = var1;
                  if (var4 != null) {
                     var1.setPaint(GO.Ff);
                     if (var5 == 0) {
                        var10000 = var8;
                        if (var4 == null) {
                           break label116;
                        }

                        if (var8 == 0) {
                           break label115;
                        }
                     }

                     var20 = var1;
                  }

                  var20.drawLine(var2.x, var2.y, var2.x + var2.width - 1, var2.y);
               }

               var10000 = var6;
            }

            label140: {
               if (var4 != null) {
                  if (var10000 != 0) {
                     break label140;
                  }

                  var10000 = var8;
               }

               if (var4 == null) {
                  break label132;
               }

               if (var10000 == 0) {
                  break label130;
               }
            }

            var1.drawLine(var2.x, var2.y + var2.height - 1, var2.x + var2.width - 1, var2.y + var2.height - 1);
         }

         var10000 = com.kC_3.Z(this.N);
      }

      if (var4 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = com.kC_3.u(this.N);
      }

      if (var4 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var3.getComponentOrientation().isLeftToRight();
      }

      int var14 = var10000;
      var10000 = var2.y + 2;
      int var10001 = var5;
      if (var4 != null) {
         var10001 = var5 != 0 ? 1 : 0;
      }

      int var15 = var10000 + var10001;
      var10000 = var2.x + var2.height - 2;
      var10001 = var6;
      if (var4 != null) {
         var10001 = var6 != 0 ? 1 : 0;
      }

      int var9;
      label80: {
         var9 = var10000 - var10001;
         var10000 = var14;
         if (var4 != null) {
            if (var14 != 0) {
               var10000 = var2.x + 3;
               break label80;
            }

            var10000 = var2.x + var2.width - (int)a;
         }

         var10000 += 2;
      }

      int var10 = var10000;
      int var11 = var15 + (var9 - var15) % 4 / 2;
      LinearGradientPaint var12 = new LinearGradientPaint((float)var10, (float)var15, (float)var10, (float)var9, this.G, this.Z);
      LinearGradientPaint var13 = new LinearGradientPaint((float)var10, (float)var15, (float)var10, (float)var9, this.G, this.z);

      while (var11 + 3 < var9) {
         var1.setPaint(var12);
         var1.fillRect(var10 + 1, var11 + 1, 2, 2);
         var1.setPaint(var13);
         var1.fillRect(var10, var11, 2, 2);
         var11 += 4;
         if (var4 == null) {
            break;
         }
      }
   }

   @Override
   public Boolean d(JComponent var1) {
      return this.v((com.ko_4)var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.N(var1, var2, (com.ko_4)var3);
   }

   static {
      long var0 = 8579087173977071657L;
      long var10002 = 7893699569941438510L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





