package com.finalshell.core;

import com.finalshell.ui.model.LX;
import com.finalshell.ui.panel.K32;
import com.finalshell.ui.panel.Ks4;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class T0_2 extends T4 {
   public final Ks4 K;

   public T0_2(Ks4 var1) {
      this.K = var1;
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      return this.W(var1, true);
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return this.W(var1, false);
   }

   public Dimension W(Container var1, boolean var2) {
      Dimension var16;
      int var3;
      List var4;
      int var13;
      label79: {
         var13 = T4.b();
         var4 = this.K.N();
         var3 = var13;
         Ks4 var12 = this.K;
         if (var3 != 0) {
            if (this.K.y() != LX.separated) {
               var13 = 0;
               break label79;
            }

            var12 = this.K;
         }

         var13 = var12.O();
      }

      int var5 = var13;
      Dimension var6 = new Dimension();
      var13 = this.K.Z();
      if (var3 != 0) {
         var13 = var13 == 0 ? 1 : 0;
      }

      int var7 = var13;
      Iterator var8 = var4.iterator();

      while (true) {
         if (var8.hasNext()) {
            K32 var9 = (K32)var8.next();
            var13 = (var2) ? 1 : 0;
            if (var3 == 0) {
               break;
            }

            label67: {
               label66: {
                  if (var3 != 0) {
                     if (var2 != 0) {
                        break label66;
                     }

                     var13 = (this.K.H()) ? 1 : 0;
                  }

                  if (var13 != 0) {
                     var16 = var9.u$Dimension();
                     break label67;
                  }
               }

               var16 = var9.getPreferredSize();
            }

            label58: {
               Dimension var10 = var16;
               if (var3 != 0) {
                  if (var7 != 0) {
                     var6.width = var6.width + var10.width;
                     var6.height = Math.max(var6.height, var10.height);
                     if (var3 != 0) {
                        break label58;
                     }
                  }

                  var6.width = Math.max(var6.width, var10.width);
               }

               var6.height = var6.height + var10.height;
            }

            if (var3 != 0) {
               continue;
            }
         }

         var13 = var4.size();
         break;
      }

      label83: {
         if (var3 != 0) {
            if (var13 <= 0) {
               break label83;
            }

            var13 = var7;
         }

         if (var13 != 0) {
            var6.width = var6.width + var5 * (var4.size() - 1);
            if (var3 != 0) {
               break label83;
            }
         }

         var6.height = var6.height + var5 * (var4.size() - 1);
      }

      Insets var11 = var1.getInsets();
      var6.width = var6.width + var11.left + var11.right;
      var6.height = var6.height + var11.top + var11.bottom;
      return var6;
   }

   @Override
   public void layoutContainer(Container var1) {
      ArrayList var16;
      float var36;
      int var2;
      List var3;
      int var31;
      label183: {
         var31 = T4.b();
         var3 = this.K.N();
         var2 = var31;
         Ks4 var30 = this.K;
         if (var2 != 0) {
            if (this.K.y() != LX.separated) {
               var31 = 0;
               break label183;
            }

            var30 = this.K;
         }

         var31 = var30.O();
      }

      int var4 = var31;
      Insets var5 = var1.getInsets();
      Dimension var6 = var1.getSize();
      int var7 = var6.width - var5.left - var5.right;
      int var8 = var6.height - var5.top - var5.bottom;
      var31 = this.K.Z();
      if (var2 != 0) {
         var31 = var31 == 0 ? 1 : 0;
      }

      int var9 = var31;
      int var10 = var5.left;
      int var11 = var5.top;
      if (this.K.H()) {
         float var12;
         label173: {
            var12 = 0.0F;
            var31 = var9;
            if (var2 != 0) {
               if (var9 != 0) {
                  var31 = var6.width - var5.left - var5.right;
                  break label173;
               }

               var31 = var6.height - var5.top;
            }

            var31 -= var5.bottom;
         }

         int var13 = var31 + var4;
         int var14 = 0;
         int var15 = -1;
         var16 = new ArrayList();
         Iterator var17 = var3.iterator();

         label166: {
            while (true) {
               if (var17.hasNext()) {
                  K32 var18 = (K32)var17.next();
                  Dimension var19 = var18.u$Dimension();
                  if (var2 == 0) {
                     break;
                  }

                  int var10001 = var9;
                  if (var2 != 0) {
                     var10001 = var9 != 0 ? var19.width : var19.height;
                  }

                  var16.add(var10001);
                  float var20 = var18.q$float();
                  var12 += var20;
                  var10001 = var9;
                  if (var2 != 0) {
                     var10001 = var9 != 0 ? var19.width : var19.height;
                  }

                  label157: {
                     var13 -= var10001 + var4;
                     float var45;
                     var31 = (var45 = var20 - 0.0F) == 0.0F ? 0 : (var45 < 0.0F ? -1 : 1);
                     if (var2 != 0) {
                        if (var31 <= 0) {
                           break label157;
                        }

                        var31 = var3.indexOf(var18);
                     }

                     var15 = var31;
                     var14++;
                  }

                  if (var2 != 0) {
                     continue;
                  }
               }

               if (var14 == 1) {
                  var36 = 1.0F;
                  break label166;
               }
               break;
            }

            var36 = var12;
         }

         var12 = var36;
         var13 = Math.max(var13, 0);
         float var26 = 0.0F;
         int var27 = 0;

         while (var27 < var3.size()) {
            float var28 = ((K32)var3.get(var27)).q$float();
            int var29 = (Integer)var16.get(var27);
            if (var2 == 0) {
               return;
            }

            label190: {
               float var46;
               var31 = (var46 = var28 - 0.0F) == 0.0F ? 0 : (var46 < 0.0F ? -1 : 1);
               if (var2 != 0) {
                  if (var31 <= 0) {
                     break label190;
                  }

                  var26 += (float)var13 * var28 / var12 % 1.0F;
                  var31 = var29;
               }

               int var42 = Math.round((float)Math.floor((double)((float)var13 * var28 / var12)));
               int var10002 = var27;
               if (var2 != 0) {
                  var10002 = var27 == var15 ? Math.round(var26) : 0;
               }

               var29 = var31 + var42 + var10002;
            }

            K32 var38 = (K32)var3.get(var27);
            int var10003 = var9;
            if (var2 != 0) {
               var10003 = var9 != 0 ? var29 : var7;
            }

            int var10004 = var9;
            if (var2 != 0) {
               var10004 = var9 != 0 ? var8 : var29;
            }

            label133: {
               var38.setBounds(var10, var11, var10003, var10004);
               var31 = var9;
               if (var2 != 0) {
                  if (var9 != 0) {
                     var10 += var29 + var4;
                     if (var2 != 0) {
                        break label133;
                     }
                  }

                  var31 = var11 + var29 + var4;
               }

               var11 = var31;
            }

            var27++;
            if (var2 == 0) {
               break;
            }
         }

         if (var2 != 0) {
            return;
         }
      }

      for (K32 var24 : var3) {
         Dimension var25 = var24.getPreferredSize();
         int var43 = var9;
         if (var2 != 0) {
            var43 = var9 != 0 ? var25.width : var7;
         }

         int var44 = var9;
         if (var2 != 0) {
            var44 = var9 != 0 ? var8 : var25.height;
         }

         label112: {
            var24.setBounds(var10, var11, var43, var44);
            var31 = var9;
            if (var2 != 0) {
               if (var9 != 0) {
                  var10 += var25.width + var4;
                  if (var2 != 0) {
                     break label112;
                  }
               }

               var31 = var11 + var25.height + var4;
            }

            var11 = var31;
         }

         if (var2 == 0) {
            break;
         }
      }
   }
}





