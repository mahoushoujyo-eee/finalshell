package com.finalshell.core;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.HashMap;
import java.util.Map;
import javax.swing.SwingConstants;

public class Tw2 extends T4 implements SwingConstants {
   public int x;
   public int X;
   public Map R = new HashMap();
   public static String a;

   public Tw2() {
      this(0);
   }

   public Tw2(int var1) {
      this(var1, 0);
   }

   public Tw2(int var1, int var2) {
      this.B(var1);
      this.O(var2);
   }

   public int Z() {
      return this.x;
   }

   public void B(int var1) {
      this.x = var1;
   }

   public int q() {
      return this.X;
   }

   public void O(int var1) {
      this.X = var1;
   }

   @Override
   public void A(Component var1, Object var2) {
      this.R.put(var1, (String)var2);
   }

   @Override
   public void F(Component var1) {
      this.R.remove(var1);
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      return this.r(var1, false);
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return this.r(var1, true);
   }

   @Override
   public void layoutContainer(Container var1) {
      int var20;
      int var21;
      int var3 = 0;
      int var10000 = T4.O();
      int var4 = 0;
      int var2 = var10000;
      Component[] var5 = var1.getComponents();
      int var6 = var5.length;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            Component var8 = var5[var7];
            byte var9 = (byte)((this.U(var8)) ? 1 : 0);
            var10000 = var9;
            if (var2 != 0) {
               break;
            }

            if (var2 == 0) {
               if (var9 != 0) {
                  var3++;
               }

               var10000 = this.x;
            }

            label181: {
               if (var2 == 0) {
                  if (var10000 == 0) {
                     int var10001 = var9;
                     if (var2 == 0) {
                        var10001 = var9 != 0 ? 0 : var8.getPreferredSize().width;
                     }

                     var4 += var10001;
                     if (var2 == 0) {
                        break label181;
                     }
                  }

                  var10000 = var4;
               }

               int var33 = var9;
               if (var2 == 0) {
                  var33 = var9 != 0 ? 0 : var8.getPreferredSize().height;
               }

               var4 = var10000 + var33;
            }

            var7++;
            if (var2 == 0) {
               continue;
            }
         }

         var10000 = var1.getComponentCount();
         break;
      }

      if (var2 == 0) {
         if (var10000 > 0) {
            var4 += this.X * (var1.getComponentCount() - 1);
         }

         var10000 = (var1.getComponentOrientation().isLeftToRight()) ? 1 : 0;
      }

      int var23;
      int var24;
      label182: {
         var20 = var10000;
         var21 = var1.getInsets();
         var22 = var1.getSize();
         var23 = var22.width - var21.left - var21.right;
         var24 = var22.height - var21.top - var21.bottom;
         var10000 = this.x;
         if (var2 == 0) {
            if (this.x == 0) {
               var10000 = var3;
               if (var2 == 0) {
                  if (var3 > 0) {
                     var10000 = var23;
                     if (var2 != 0) {
                        break label182;
                     }

                     if (var23 > var4) {
                        var10000 = (var23 - var4) / var3;
                        break label182;
                     }
                  }

                  var10000 = 0;
               }
               break label182;
            }

            var10000 = var3;
         }

         int var34;
         label145: {
            label183: {
               if (var2 == 0) {
                  if (var10000 <= 0) {
                     break label183;
                  }

                  var10000 = var24;
               }

               var34 = var4;
               if (var2 != 0) {
                  break label145;
               }

               if (var10000 > var4) {
                  var10000 = var24 - var4;
                  var34 = var3;
                  break label145;
               }
            }

            var10000 = 0;
            break label182;
         }

         var10000 /= var34;
      }

      int var10;
      var10 = var10000;
      var10000 = var20;
      label133:
      if (var2 == 0) {
         label130:
         if (var20 == 0) {
            var10000 = this.x;
            int var35 = 1;
            if (var2 == 0) {
               if (this.x == 1) {
                  break label130;
               }

               var10000 = var22.width;
               var35 = var21.right;
            }

            var10000 -= var35;
            break label133;
         }

         var10000 = var21.left;
      }

      int var11 = var10000;
      int var12 = var21.top;

      for (Component var16 : var1.getComponents()) {
         label186: {
            Dimension var17 = var16.getPreferredSize();
            byte var18 = (byte)((this.U(var16)) ? 1 : 0);
            var10000 = this.x;
            if (var2 == 0) {
               if (this.x == 0) {
                  var10000 = var18;
                  if (var2 == 0) {
                     var10000 = var18 != 0 ? var10 : var17.width;
                  }

                  int var19 = var10000;
                  int var10002 = var20;
                  if (var2 == 0) {
                     var10002 = var20 != 0 ? 0 : var19;
                  }

                  var16.setBounds(var11 - var10002, var12, var19, var24);
                  int var36 = var20;
                  if (var2 == 0) {
                     var36 = var20 != 0 ? 1 : -1;
                  }

                  var11 += var36 * (var19 + this.X);
                  if (var2 == 0) {
                     break label186;
                  }
               }

               var10000 = var18;
            }

            if (var2 == 0) {
               var10000 = var10000 != 0 ? var10 : var17.height;
            }

            int var25 = var10000;
            var16.setBounds(var11, var12, var23, var25);
            var12 += var25 + this.X;
         }

         if (var2 != 0) {
            break;
         }
      }
   }

   public Dimension r(Container var1, boolean var2) {
      Dimension var14;
      Dimension var15;
      Insets var4 = var1.getInsets();
      Dimension var5 = new Dimension();
      Component[] var6 = var1.getComponents();
      int var10000 = T4.O();
      int var7 = var6.length;
      int var8 = 0;
      int var3 = var10000;

      while (true) {
         if (var8 < var7) {
            Component var9 = var6[var8];
            var10000 = (var2) ? 1 : 0;
            if (var3 != 0) {
      int var13;
               break;
            }

            Dimension var10;
            label84: {
               label94: {
                  var10 = var2 != 0 ? var9.getMinimumSize() : var9.getPreferredSize();
                  var13 = var2;
                  if (var3 == 0) {
                     if (var2 == 0) {
                        break label94;
                     }

                     var13 = this.U(var9);
                  }

                  if (var3 != 0) {
                     break label84;
                  }

                  if (var13 != 0) {
                     var13 = 1;
                     break label84;
                  }
               }

               var13 = 0;
            }

            label73: {
               int var16;
               int var10001;
               label72: {
                  label95: {
                     byte var11 = var13;
                     if (var3 == 0) {
                        if (this.x == 0) {
                           var16 = var11;
                           if (var3 == 0) {
                              var16 = var11 != 0 ? 1 : var10.width;
                           }

                           var5.width += var16;
                           var5.height = Math.max(var5.height, var10.height);
                           if (var3 == 0) {
                              break label73;
                           }
                        }

                        var14 = var5;
                        var10001 = var5.width;
                        var15 = var10;
                        if (var3 != 0) {
                           break label95;
                        }

                        var5.width = Math.max(var5.width, var10.width);
                     }

                     var14 = var5;
                     var10001 = var5.height;
                     if (var11 != 0) {
                        var16 = 1;
                        break label72;
                     }

                     var15 = var10;
                  }

                  var16 = var15.height;
               }

               var14.height = var10001 + var16;
            }

            var8++;
            if (var3 == 0) {
               continue;
            }
         }

         var10000 = var1.getComponentCount();
         break;
      }

      label97: {
         if (var3 == 0) {
            if (var10000 <= 0) {
               break label97;
            }

            var10000 = this.x;
         }

         if (var10000 == 0) {
            var5.width = var5.width + this.X * (var1.getComponentCount() - 1);
            if (var3 == 0) {
               break label97;
            }
         }

         var5.height = var5.height + this.X * (var1.getComponentCount() - 1);
      }

      var5.width = var5.width + var4.left + var4.right;
      var5.height = var5.height + var4.top + var4.bottom;
      return var5;
   }

   public boolean U(Component var1) {
      int var2 = T4.b();
      boolean var10000 = this.R.containsKey(var1);
      if (var2 != 0) {
         if (var10000) {
            String var3 = (String)this.R.get(var1);
            String var4 = var3;
            if (var2 != 0) {
               if (var3 == null) {
                  return false;
               }

               var4 = var3;
            }

            var10000 = var4.equals(a);
            if (var2 == 0) {
               return var10000;
            }

            if (var10000) {
               return true;
            }

            return false;
         }

         var10000 = false;
      }

      return var10000;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "qMBk".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 113;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 113;
         var10006 = var0;
      } else {
         var6 = 113;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 113;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 70;
               break;
            case 1:
               var23 = 117;
               break;
            case 2:
               var23 = 127;
               break;
            case 3:
               var23 = 86;
               break;
            case 4:
               var23 = 50;
               break;
            case 5:
               var23 = 111;
               break;
            default:
               var23 = 18;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





