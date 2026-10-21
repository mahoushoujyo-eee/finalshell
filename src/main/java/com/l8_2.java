package com;

import java.awt.image.BufferedImage;

class l8_2 {
   private int U;
   private int E;
   private int S;
   private int[] Z;

   public l8_2(BufferedImage var1) {
      int var2 = var1.getWidth();
      int var3 = var1.getHeight();
      int var4 = var1.getType();
      this.Z = com.zb_2.Z(var1, 0, 0, var2, var3, null);
   }

   public int z(float var1, float var2) {
      int var4;
      int var5;
      float var6;
      float var7;
      int var13;
      String[] var10000 = com.W5.q();
      var4 = (int)Math.floor((double)var1);
      String[] var3 = var10000;
      var5 = (int)Math.floor((double)var2);
      var6 = var1 - (float)var4;
      var7 = var2 - (float)var5;
      var13 = var4;
      label30:
      if (var3 != null) {
         if (var4 >= 0) {
            var13 = var4;
            if (var3 == null) {
               break label30;
            }

            if (var4 < this.E - 1) {
               var13 = var5;
               if (var3 == null) {
                  break label30;
               }

               if (var5 >= 0) {
                  var13 = var5;
                  if (var3 == null) {
                     break label30;
                  }

                  if (var5 < this.S - 1) {
                     int var12 = this.E * var5 + var4;
                     int var8 = this.Z[var12];
                     int var9 = this.Z[var12 + 1];
                     int var10 = this.Z[var12 + this.E];
                     int var11 = this.Z[var12 + this.E + 1];
                     if (var3 != null) {
                        return NM.O(var6, var7, var8, var9, var10, var11);
                     }
                  }
               }
            }
         }

         var13 = this.j(this.Z, var4, var5, this.E, this.S);
      }

      int var14 = var13;
      int var15 = this.j(this.Z, var4 + 1, var5, this.E, this.S);
      int var16 = this.j(this.Z, var4, var5 + 1, this.E, this.S);
      int var17 = this.j(this.Z, var4 + 1, var5 + 1, this.E, this.S);
      return NM.O(var6, var7, var14, var15, var16, var17);
   }

   private final int j(int[] var1, int var2, int var3, int var4, int var5) {
      String[] var6;
      int var10000;
      var6 = com.W5.q();
      var10000 = var2;
      label37:
      if (var6 != null) {
         if (var2 >= 0) {
            var10000 = var2;
            if (var6 == null) {
               break label37;
            }

            if (var2 < var4) {
               var10000 = var3;
               if (var6 == null) {
                  break label37;
               }

               if (var3 >= 0) {
                  if (var6 == null) {
                     return var3;
                  }

                  if (var3 < var5) {
                     return var1[var3 * var4 + var2];
                  }
               }
            }
         }

         var10000 = this.U;
      }

      if (var6 != null) {
         switch (var10000) {
            case 0:
            default:
               return 0;
            case 1:
               var10000 = var1[NM.L(var3, 0, var5 - 1) * var4 + NM.L(var2, 0, var4 - 1)];
               break;
            case 2:
               return var1[NM.r(var3, var5) * var4 + NM.r(var2, var4)];
         }
      }

      return var10000;
   }
}





