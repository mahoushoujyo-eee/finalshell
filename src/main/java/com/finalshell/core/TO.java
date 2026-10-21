package com.finalshell.core;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

public class TO extends T4 {
   public int Y;
   public int s;
   public int d;
   public boolean Q;
   public boolean j;

   public TO() {
      this(0, 0, 0, true, false);
   }

   public TO(boolean var1, boolean var2) {
      this(0, 0, 0, var1, var2);
   }

   public TO(int var1, int var2) {
      this(0, var1, var2, true, false);
   }

   public TO(int var1, int var2, int var3) {
      this(var1, var2, var3, true, false);
   }

   public TO(int var1) {
      this(var1, 0, 0, true, false);
   }

   public TO(int var1, boolean var2, boolean var3) {
      this(var1, 0, 0, var2, var3);
   }

   public TO(int var1, int var2, boolean var3, boolean var4) {
      this(0, var1, var2, var3, var4);
   }

   public TO(int var1, int var2, int var3, boolean var4, boolean var5) {
      this.Y = var1;
      this.s = var2;
      this.d = var3;
      this.Q = var4;
      this.j = var5;
   }

   public void J(int var1) {
      this.s = var1;
   }

   public void Z(int var1) {
      this.d = var1;
   }

   public void r(boolean var1) {
      this.j = var1;
   }

   public void t(boolean var1) {
      this.Q = var1;
   }

   public int m() {
      return this.s;
   }

   public int V() {
      return this.d;
   }

   public boolean d() {
      return this.j;
   }

   public boolean i() {
      return this.Q;
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      int var10000 = T4.b();
      Dimension var3 = new Dimension(0, 0);
      int var2 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var1.getComponentCount()) {
            var8 = var1;
            if (var2 == 0) {
               break;
            }

            Component var5 = var1.getComponent(var4);
            if (var2 != 0) {
               if (var5.isVisible()) {
                  Dimension var6 = var5.getPreferredSize();
                  Dimension var9 = var3;
                  int var10001 = Math.max(var3.width, var6.width);
                  if (var2 != 0) {
                     var3.width = var10001;
                     if (var4 > 0) {
                        var3.height = var3.height + this.d;
                     }

                     var9 = var3;
                     var10001 = var3.height + var6.height;
                  }

                  var9.height = var10001;
               }

               var4++;
            }

            if (var2 != 0) {
               continue;
            }
         }

         var8 = var1;
         break;
      }

      Insets var7 = var8.getInsets();
      var3.width = var3.width + var7.left + var7.right;
      var3.height = var3.height + var7.top + var7.bottom;
      return var3;
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      int var10000 = T4.O();
      Dimension var3 = new Dimension(0, 0);
      int var4 = 0;
      int var2 = var10000;

      while (true) {
         if (var4 < var1.getComponentCount()) {
            var8 = var1;
            if (var2 != 0) {
               break;
            }

            Component var5 = var1.getComponent(var4);
            if (var2 == 0) {
               if (var5.isVisible()) {
                  Dimension var6 = var5.getMinimumSize();
                  Dimension var9 = var3;
                  int var10001 = Math.max(var3.width, var6.width);
                  if (var2 == 0) {
                     var3.width = var10001;
                     if (var4 > 0) {
                        var3.height = var3.height + this.d;
                     }

                     var9 = var3;
                     var10001 = var3.height + var6.height;
                  }

                  var9.height = var10001;
               }

               var4++;
            }

            if (var2 == 0) {
               continue;
            }
         }

         var8 = var1;
         break;
      }

      Insets var7 = var8.getInsets();
      var3.width = var3.width + var7.left + var7.right;
      var3.height = var3.height + var7.top + var7.bottom;
      return var3;
   }

   @Override
   public void layoutContainer(Container var1) {
      int var2;
      Insets var3;
      Dimension var4;
      int var5;
      int var6;
      int var7;
      int var15;
      label93: {
         label96: {
            var15 = T4.O();
            var3 = var1.getInsets();
            var2 = var15;
            var4 = var1.getSize();
            var5 = var4.width - (var3.left + var3.right);
            var6 = var4.height - (var3.top + var3.bottom);
            var7 = var1.getComponentCount();
            var15 = (this.j) ? 1 : 0;
            if (var2 == 0) {
               if (this.j) {
                  break label96;
               }

               var15 = this.Y;
            }

            if (var2 != 0) {
               break label93;
            }

            if (var15 != 0) {
               var15 = this.m(var1);
               break label93;
            }
         }

         var15 = 0;
      }

      int var8 = var15;
      int var9 = 0;
      int var10 = 0;

      while (var10 < var7) {
         Component var11 = var1.getComponent(var10);
         if (var2 == 0) {
            if (var11.isVisible()) {
               Dimension var12;
               label74: {
                  var12 = var11.getPreferredSize();
                  var15 = (this.Q) ? 1 : 0;
                  if (var2 == 0) {
                     if (this.Q) {
                        var15 = var5;
                        break label74;
                     }

                     var15 = var5;
                  }

                  var15 = Math.min(var15, var12.width);
               }

               int var13;
               label68: {
                  int var10001;
                  label67: {
                     label99: {
                        var13 = var15;
                        var15 = (this.j) ? 1 : 0;
                        if (var2 == 0) {
                           if (!this.j) {
                              break label99;
                           }

                           var15 = var10;
                        }

                        var10001 = var7 - 1;
                        if (var2 != 0) {
                           break label67;
                        }

                        if (var15 == var10001) {
                           var15 = var6;
                           var10001 = var9;
                           break label67;
                        }
                     }

                     var15 = var12.height;
                     break label68;
                  }

                  var15 -= var10001;
               }

               int var14;
               label55: {
                  var14 = var15;
                  var15 = (this.j) ? 1 : 0;
                  if (var2 == 0) {
                     if (this.j) {
                        var11.setBounds(var3.left, var3.top + var9, var13, var14);
                        if (var2 == 0) {
                           break label55;
                        }
                     }

                     var15 = this.Y;
                  }

                  switch (var15) {
                     case 1:
                        var11.setBounds(var3.left, var3.top + var6 / 2 - var8 / 2 + var9, var13, var12.height);
                        if (var2 == 0) {
                           break;
                        }
                     case 2:
                        var11.setBounds(var3.left, var4.height - var3.bottom - var8 + var9, var13, var12.height);
                        if (var2 == 0) {
                           break;
                        }
                     default:
                        var11.setBounds(var3.left, var3.top + var9, var13, var12.height);
                  }
               }

               var9 += var14 + this.d;
            }

            var10++;
         }

         if (var2 != 0) {
            break;
         }
      }
   }

   public int m(Container var1) {
      int var3 = 0;
      int var10000 = T4.b();
      int var4 = 0;
      int var2 = var10000;

      while (true) {
         if (var4 < var1.getComponentCount()) {
            var3 += var1.getComponent(var4).getPreferredSize().height;
            if (var2 != 0) {
               var10000 = var4;
               if (var2 == 0) {
                  break;
               }

               if (var4 < var1.getComponentCount() - 1) {
                  var3 += this.d;
               }

               var4++;
            }

            if (var2 != 0) {
               continue;
            }
         }

         var10000 = var3;
         break;
      }

      return var10000;
   }
}





