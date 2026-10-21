package com;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.io.Serializable;

public class oo_4 implements LayoutManager, Serializable {
   public static int G;
   protected int D;
   protected int p;
   protected int S;

   public oo_4() {
      this(0, 0, G);
   }

   public oo_4(int var1) {
      this(var1, 0, G);
   }

   public oo_4(int var1, int var2, int var3) {
      int var4;
      int var5;
      label45: {
         var5 = com.T4.b();
         super();
         var4 = var5;
         var5 = var1;
         byte var10001 = 1;
         if (var4 != 0) {
            if (var1 != 1) {
               var1 = 0;
            }

            var5 = var2;
            if (var4 == 0) {
               break label45;
            }

            var10001 = 1;
         }

         if (var5 != var10001) {
            var5 = var2;
            if (var4 == 0) {
               break label45;
            }

            if (var2 != 2) {
               var5 = var2;
               if (var4 == 0) {
                  break label45;
               }

               if (var2 != 4) {
                  var2 = 0;
               }
            }
         }

         var5 = var3;
      }

      label27: {
         if (var4 != 0) {
            if (var5 >= 0) {
               break label27;
            }

            var5 = 0;
         }

         var3 = var5;
      }

      this.D = var1;
      this.p = var2;
      this.S = var3;
   }

   @Override
   public void layoutContainer(Container var1) {
      Dimension var3 = var1.getSize();
      int var10000 = com.T4.O();
      Insets var4 = var1.getInsets();
      int var2 = var10000;
      int var5 = var4.left;
      int var6 = var4.top;
      Component[] var7 = var1.getComponents();
      var10000 = this.D;
      if (var2 == 0) {
         if (this.D == 0) {
            int var8 = 0;

            while (var8 < var7.length) {
               Dimension var9 = var7[var8].getPreferredSize();
               if (var2 != 0) {
                  return;
               }

               var10000 = this.p;
               if (var2 == 0) {
                  switch (this.p) {
                     case 0:
                        var5 = var4.left;
                        if (var2 == 0) {
                           break;
                        }
                     case 1:
                        var5 = (var3.width - var9.width >> 1) + var4.left - var4.right;
                        if (var2 == 0) {
                           break;
                        }
                     case 2:
                        var5 = var4.left;
                        var9.width = var3.width - var4.left - var4.right;
                        if (var2 == 0) {
                           break;
                        }
                     case 4:
                        var5 = var3.width - var9.width - var4.right;
                     case 3:
                  }

                  var7[var8].setBounds(var5, var6, var9.width, var9.height);
                  var10000 = var6 + var9.height + this.S;
               }

               var6 = var10000;
               var8++;
               if (var2 != 0) {
                  break;
               }
            }

            if (var2 == 0) {
               return;
            }
         }

         var10000 = 0;
      }

      int var10 = var10000;

      while (var10 < var7.length) {
         Dimension var11 = var7[var10].getPreferredSize();
         var10000 = this.p;
         if (var2 == 0) {
            switch (this.p) {
               case 0:
                  var6 = var4.top;
                  if (var2 == 0) {
                     break;
                  }
               case 1:
                  var6 = (var3.height - var11.height >> 1) + var4.top - var4.bottom;
                  if (var2 == 0) {
                     break;
                  }
               case 2:
                  var6 = var4.top;
                  var11.height = var3.height - var4.top - var4.bottom;
                  if (var2 == 0) {
                     break;
                  }
               case 3:
                  var6 = var3.height - var11.height - var4.bottom;
            }

            var7[var10].setBounds(var5, var6, var11.width, var11.height);
            var10000 = var5 + var11.width + this.S;
         }

         var5 = var10000;
         var10++;
         if (var2 != 0) {
            break;
         }
      }
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      int var3;
      int var4;
      label65: {
         var3 = 0;
         var4 = 0;
         int var10000 = com.T4.O();
         Component[] var5 = var1.getComponents();
         int var2 = var10000;
         var10000 = this.D;
         if (var2 == 0) {
            if (this.D == 0) {
               int var6 = 0;

               int var10001;
               while (true) {
                  if (var6 < var5.length) {
                     Dimension var7 = var5[var6].getPreferredSize();
                     var10000 = var3;
                     var10001 = var7.width;
                     if (var2 != 0) {
                        break;
                     }

                     if (var2 == 0) {
                        if (var3 < var7.width) {
                           var3 = var7.width;
                        }

                        var10000 = var4;
                        var10001 = var7.height + this.S;
                     }

                     var4 = var10000 + var10001;
                     var6++;
                     if (var2 == 0) {
                        continue;
                     }
                  }

                  var10000 = var4;
                  var10001 = this.S;
                  break;
               }

               var4 = var10000 - var10001;
               if (var2 == 0) {
                  break label65;
               }
            }

            var10000 = 0;
         }

         int var10 = var10000;

         int var16;
         label43: {
            while (var10 < var5.length) {
               Dimension var12 = var5[var10].getPreferredSize();
               var3 += var12.width + this.S;
               if (var2 == 0) {
                  var10000 = var4;
                  var16 = var12.height;
                  if (var2 != 0) {
                     break label43;
                  }

                  if (var4 < var12.height) {
                     var4 = var12.height;
                  }

                  var10++;
               }

               if (var2 != 0) {
                  break;
               }
            }

            var10000 = var3;
            var16 = this.S;
         }

         var3 = var10000 - var16;
      }

      Insets var11 = var1.getInsets();
      var3 += var11.left + var11.right;
      var4 += var11.top + var11.bottom;
      return new Dimension(var3, var4);
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      int var3;
      int var4;
      label65: {
         int var10000 = com.T4.b();
         var3 = 0;
         var4 = 0;
         int var2 = var10000;
         Component[] var5 = var1.getComponents();
         var10000 = this.D;
         if (var2 != 0) {
            if (this.D == 0) {
               int var6 = 0;

               int var10001;
               while (true) {
                  if (var6 < var5.length) {
                     Dimension var7 = var5[var6].getMinimumSize();
                     var10000 = var3;
                     var10001 = var7.width;
                     if (var2 == 0) {
                        break;
                     }

                     if (var2 != 0) {
                        if (var3 < var7.width) {
                           var3 = var7.width;
                        }

                        var10000 = var4;
                        var10001 = var7.height + this.S;
                     }

                     var4 = var10000 + var10001;
                     var6++;
                     if (var2 != 0) {
                        continue;
                     }
                  }

                  var10000 = var4;
                  var10001 = this.S;
                  break;
               }

               var4 = var10000 - var10001;
               if (var2 != 0) {
                  break label65;
               }
            }

            var10000 = 0;
         }

         int var10 = var10000;

         label43: {
            while (var10 < var5.length) {
               Dimension var12 = var5[var10].getMinimumSize();
               var3 += var12.width + this.S;
               if (var2 != 0) {
                  var10000 = var4;
                  if (var2 == 0) {
                     break label43;
                  }

                  if (var4 < var12.height) {
                     var4 = var12.height;
                  }

                  var10++;
               }

               if (var2 == 0) {
                  break;
               }
            }

            var10000 = -this.S;
         }

         var3 = var10000;
      }

      Insets var11 = var1.getInsets();
      var3 += var11.left + var11.right;
      var4 += var11.top + var11.bottom;
      return new Dimension(var3, var4);
   }

   @Override
   public void addLayoutComponent(String var1, Component var2) {
   }

   @Override
   public void removeLayoutComponent(Component var1) {
   }

   static {
      long var2 = 7330293765374988639L;
      long var10002 = 14289199703249242L ^ var2;
      byte var10001 = -1;
      long var0 = var10002;
      G = (int)var0;
   }
}





