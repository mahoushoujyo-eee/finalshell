package com.finalshell.core;

import com.finalshell.ui.panel.K22;
import com.finalshell.ui.panel.Ky4;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import javax.swing.JRootPane;

public class P extends T4 {
   @Override
   public Dimension preferredLayoutSize(Container var1) {
      return this.e(var1, true);
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return this.e(var1, false);
   }

   @Override
   public void layoutContainer(Container var1) {
      int[] var2;
      JRootPane var3;
      D var4;
      Insets var5;
      Insets var6;
      Dimension var7;
      int var8;
      int var9;
      byte var10;
      K22 var11;
      JComponent var12;
      JMenuBar var13;
      com.finalshell.ui.panel.M2 var14;
      boolean var30;
      label229: {
         label241: {
            var3 = (JRootPane)var1;
            var4 = (D)var3.getUI();
            var5 = var1.getInsets();
            var6 = new Insets(1, 1, 1, 1);
            var7 = var1.getSize();
            int[] var10000 = com.finalshell.ui.dialog.Y2.M$arrint();
            var8 = var7.width - var5.right - var5.left;
            var9 = var7.height - var5.top - var5.bottom;
            var10 = (var3.getComponentOrientation().isLeftToRight()) ? 1 : 0;
            var11 = var4.M$k2_2();
            var2 = var10000;
            var12 = var4.R$JComponent();
            var13 = var3.getJMenuBar();
            var14 = var4.F();
            label226:
            if (var11 != null) {
               var30 = var4.y();
               if (var2 != null) {
                  if (!var30) {
                     break label226;
                  }

                  var30 = var4.k$boolean();
               }

               if (var2 == null) {
                  break label229;
               }

               if (var30) {
                  break label241;
               }

               var30 = var4.t$boolean();
               if (var2 == null) {
                  break label229;
               }

               if (var30) {
                  break label241;
               }

               var30 = var4.w();
               if (var2 == null) {
                  break label229;
               }

               if (var30) {
                  break label241;
               }
            }

            var30 = (0) != 0;
            break label229;
         }

         var30 = (1) != 0;
      }

      boolean var15;
      label206: {
         var15 = (boolean)var30;
         if (var12 != null) {
            var30 = var4.A$boolean();
            if (var2 == null) {
               break label206;
            }

            if (var30) {
               var30 = (((((boolean)1) != 0) != 0) != 0) != 0;
               break label206;
            }
         }

         var30 = (((((boolean)0) != 0) != 0) != 0) != 0;
      }

      boolean var16;
      label199: {
         var16 = var30;
         if (var13 != null) {
            var30 = var4.s$boolean();
            if (var2 == null) {
               break label199;
            }

            if (var30) {
               var30 = (((((boolean)1) != 0) != 0) != 0) != 0;
               break label199;
            }
         }

         var30 = (((((boolean)0) != 0) != 0) != 0) != 0;
      }

      boolean var17;
      label192: {
         var17 = var30;
         label191:
         if (var14 != null) {
            var30 = var4.f$boolean();
            if (var2 != null) {
               if (!var30) {
                  break label191;
               }

               var30 = var4.i$boolean();
            }

            if (var2 != null) {
               if (!var30) {
                  break label191;
               }

               var30 = var4.j$boolean();
            }

            if (var2 == null) {
               break label192;
            }

            if (!var30) {
               var30 = (((((boolean)1) != 0) != 0) != 0) != 0;
               break label192;
            }
         }

         var30 = (((((boolean)0) != 0) != 0) != 0) != 0;
      }

      boolean var18;
      int var19;
      int var20;
      label234: {
         label235: {
            var18 = var30;
            var19 = 0;
            var20 = 0;
            if (var2 != null) {
               if (!var15) {
                  break label235;
               }

               var1.setComponentZOrder(var11, 0);
            }

            Dimension var21;
            label168: {
               var21 = var11.getPreferredSize();
               int var22 = this.C(var4);
               var30 = (var10) != 0;
               if (var2 != null) {
                  if (var10 != 0) {
                     var30 = (var7.width - var5.right - var22 - var21.width) != 0;
                     break label168;
                  }

                  var30 = (var5.left) != 0;
               }

               var30 += var22;
            }

            int var23 = (var30) ? 1 : 0;
            var11.setVisible(true);
            var11.setBounds(var23, var5.top, var21.width, var21.height);
            var20 = var21.width;
            if (var2 != null) {
               break label234;
            }

            Ky4.K(new String[3]);
         }

         K22 var36 = var11;
         if (var2 != null) {
            if (var11 == null) {
               break label234;
            }

            var36 = var11;
         }

         var36.setVisible(false);
      }

      label236: {
         if (var16) {
            Dimension var25;
            int var43;
            label151: {
               var25 = var12.getPreferredSize();
               var12.setVisible(true);
               var43 = var10;
               if (var2 != null) {
                  if (var10 != 0) {
                     var43 = var5.left;
                     break label151;
                  }

                  var43 = var5.left;
               }

               var43 += var20;
            }

            var12.setBounds(var43, var5.top, var8 - var20, var25.height);
            var19 += var25.height;
            if (var2 != null) {
               break label236;
            }
         }

         JComponent var37 = var12;
         if (var2 != null) {
            if (var12 == null) {
               break label236;
            }

            var37 = var12;
         }

         var37.setVisible(false);
      }

      label138: {
         JLayeredPane var26 = var3.getLayeredPane();
         JLayeredPane var38 = var26;
         if (var2 != null) {
            if (var26 == null) {
               break label138;
            }

            var38 = var26;
         }

         var38.setBounds(var5.left + var6.left, var5.top + var6.top, var8 - var6.left - var6.right, var9 - var6.top - var6.bottom);
      }

      label132: {
         label237: {
            if (var17) {
               Dimension var27 = var13.getPreferredSize();
               var13.setVisible(true);
               var13.setBounds(0, var19, var8 - var6.left - var6.right, var27.height);
               var19 += var27.height;
               if (var2 != null) {
      JMenuBar var39;
      JMenuBar var39;
                  break label237;
               }
            }

            var39 = var13;
            if (var2 == null) {
               break label132;
            }

            if (var13 != null) {
               var13.setVisible(false);
            }
         }

         var39 = var3.getGlassPane();
      }

      label123: {
         Object var28 = var39;
         Object var40 = var28;
         if (var2 != null) {
            if (var28 == null) {
               break label123;
            }

            var40 = var28;
         }

         var40.setBounds(var5.left, var5.top, var8, var9);
      }

      label238: {
         Container var29 = var3.getContentPane();
         Container var41 = var29;
         if (var2 != null) {
            if (var29 == null) {
               break label238;
            }

            var41 = var29;
         }

         int var44;
         int var10003;
         label111: {
            var10003 = var8 - var6.left - var6.right;
            var44 = var9;
            int var10005 = var19;
            if (var2 != null) {
               if (var9 < var19) {
                  var44 = 0;
                  break label111;
               }

               var44 = var9 - var19 - var6.top;
               var10005 = var6.bottom;
            }

            var44 -= var10005;
         }

         var41.setBounds(0, var19, var10003, var44);
      }

      if (var18) {
         Dimension var24 = var14.getPreferredSize();
         var14.setVisible(true);
         var14.setBounds(var7.width - var5.right - var24.width - 2, var7.height - var5.bottom - var24.height - 2, var24.width, var24.height);
         if (var2 != null) {
            return;
         }
      }

      com.finalshell.ui.panel.M2 var42 = var14;
      if (var2 != null) {
         if (var14 == null) {
            return;
         }

         var42 = var14;
      }

      var42.setVisible(false);
   }

   public Dimension e(Container var1, boolean var2) {
      int[] var3;
      Insets var4;
      Insets var5;
      JRootPane var6;
      D var7;
      K22 var8;
      JComponent var9;
      JMenuBar var10;
      com.finalshell.ui.panel.M2 var11;
      byte var31;
      label281: {
         label295: {
            var4 = var1.getInsets();
            int[] var10000 = com.finalshell.ui.dialog.Y2.M$arrint();
            var5 = new Insets(1, 1, 1, 1);
            var6 = (JRootPane)var1;
            var7 = (D)var6.getUI();
            var8 = var7.M$k2_2();
            var3 = var10000;
            var9 = var7.R$JComponent();
            var10 = var6.getJMenuBar();
            var11 = var7.F();
            label278:
            if (var8 != null) {
               var31 = var7.y();
               if (var3 != null) {
                  if (var31 == 0) {
                     break label278;
                  }

                  var31 = var7.k$boolean();
               }

               if (var3 == null) {
                  break label281;
               }

               if (var31 != 0) {
                  break label295;
               }

               var31 = var7.t$boolean();
               if (var3 == null) {
                  break label281;
               }

               if (var31 != 0) {
                  break label295;
               }

               var31 = var7.w();
               if (var3 == null) {
                  break label281;
               }

               if (var31 != 0) {
                  break label295;
               }
            }

            var31 = 0;
            break label281;
         }

         var31 = 1;
      }

      byte var12;
      label258: {
         var12 = (byte)var31;
         if (var9 != null) {
            var31 = var7.A$boolean();
            if (var3 == null) {
               break label258;
            }

            if (var31 != 0) {
               var31 = (byte)1;
               break label258;
            }
         }

         var31 = (byte)0;
      }

      byte var13;
      label251: {
         var13 = var31;
         if (var10 != null) {
            var31 = var7.s$boolean();
            if (var3 == null) {
               break label251;
            }

            if (var31 != 0) {
               var31 = (byte)1;
               break label251;
            }
         }

         var31 = (byte)0;
      }

      byte var14;
      label244: {
         var14 = var31;
         label243:
         if (var11 != null) {
            var31 = var7.i$boolean();
            if (var3 != null) {
               if (var31 == 0) {
                  break label243;
               }

               var31 = var7.j$boolean();
            }

            if (var3 == null) {
               break label244;
            }

            if (var31 == 0) {
               var31 = (byte)1;
               break label244;
            }
         }

         var31 = (byte)0;
      }

      byte var15;
      Dimension var16;
      label232: {
         var15 = var31;
         if (var13 != 0) {
            var16 = var9.getPreferredSize();
            if (var3 != null) {
               break label232;
            }
         }

         var16 = new Dimension(0, 0);
      }

      Dimension var17;
      label227: {
         if (var12 != 0) {
            var17 = var8.getPreferredSize();
            if (var3 != null) {
               break label227;
            }
         }

         var17 = new Dimension(0, 0);
      }

      Dimension var18;
      label222: {
         if (var14 != 0) {
            var18 = var10.getPreferredSize();
            if (var3 != null) {
               break label222;
            }
         }

         var18 = new Dimension(0, 0);
      }

      int var19;
      int var20;
      label286: {
         var31 = var2;
         if (var3 != null) {
            if (var2 != 0) {
               var31 = var12;
               if (var3 != null) {
                  if (var12 != 0) {
                     label289: {
                        int var21 = this.C(var7);
                        var31 = var13;
                        if (var3 != null) {
                           if (var13 != 0) {
                              var31 = var14;
                              if (var3 != null) {
                                 if (var14 != 0) {
                                    var19 = Math.max(var16.width + var17.width + var21, var18.width);
                                    var20 = Math.max(var16.height, var17.height) + var18.height;
                                    if (var3 != null) {
                                       break label289;
                                    }
                                 }

                                 var31 = var16.width + var17.width + var21;
                              }

                              var19 = var31;
                              var20 = Math.max(var16.height, var17.height);
                              if (var3 != null) {
                                 break label289;
                              }
                           }

                           var31 = var14;
                        }

                        if (var3 != null) {
                           if (var31 != 0) {
                              var19 = var18.width + var17.width + var21;
                              var20 = Math.max(var18.height, var17.height);
                              if (var3 != null) {
                                 break label289;
                              }
                           }

                           var31 = var21 + var17.width + var21;
                        }

                        var19 = var31;
                        var20 = 0;
                     }

                     if (var3 != null) {
                        break label286;
                     }
                  }

                  var31 = var13;
               }

               label188:
               if (var3 != null) {
                  if (var31 != 0) {
                     var31 = var14;
                     if (var3 == null) {
                        break label188;
                     }

                     if (var14 != 0) {
                        var19 = Math.max(var16.width, var18.width);
                        var20 = var16.height + var18.height;
                        if (var3 != null) {
                           break label286;
                        }
                     }
                  }

                  var31 = var13;
               }

               if (var3 != null) {
                  if (var31 != 0) {
                     var19 = var16.width;
                     var20 = var16.height;
                     if (var3 != null) {
                        break label286;
                     }
                  }

                  var31 = var14;
               }

               if (var3 != null) {
                  if (var31 != 0) {
                     var19 = var18.width;
                     var20 = var18.height;
                     if (var3 != null) {
                        break label286;
                     }
                  }

                  var31 = (byte)0;
               }

               var19 = var31;
               var20 = 0;
               if (var3 != null) {
                  break label286;
               }
            }

            var31 = var12;
         }

         if (var3 != null) {
            if (var31 != 0) {
               label160: {
                  int var28 = this.C(var7);
                  var31 = var13;
                  if (var3 != null) {
                     if (var13 != 0) {
                        var19 = var16.width + var17.width + var28;
                        var20 = Math.max(var16.height, var17.height);
                        if (var3 != null) {
                           break label160;
                        }
                     }

                     var31 = var28 + var17.width + var28;
                  }

                  var19 = var31;
                  var20 = var17.height;
               }

               if (var3 != null) {
                  break label286;
               }
            }

            var31 = var13;
         }

         if (var3 != null) {
            if (var31 != 0) {
               var19 = var16.width;
               var20 = var16.height;
               if (var3 != null) {
                  break label286;
               }
            }

            var31 = (byte)0;
         }

         var19 = var31;
         var20 = 0;
      }

      int var22;
      int var23;
      Dimension var29;
      label143: {
         var22 = 0;
         var23 = 0;
         if (var2 != 0) {
            JRootPane var40 = var6;
            if (var3 != null) {
               if (var6.getContentPane() != null) {
                  var29 = var6.getContentPane().getPreferredSize();
                  if (var3 != null) {
                     break label143;
                  }
               }

               var40 = var6;
            }

            var29 = var40.getSize();
            if (var3 != null) {
               break label143;
            }
         }

         var29 = new Dimension(0, 0);
      }

      label133: {
         Dimension var41 = var29;
         if (var3 != null) {
            if (var29 == null) {
               break label133;
            }

            var22 = var29.width;
            var41 = var29;
         }

         var23 = var41.height;
      }

      var31 = var15;
      if (var3 != null) {
         label125: {
            if (var15 != 0) {
               var1.setComponentZOrder(var11, 0);
               Dimension var24 = var11.getPreferredSize();
               if (var3 == null) {
                  break label125;
               }

               if (var24 != null) {
                  var22 = Math.max(var22, var24.width);
                  var23 = Math.max(var23, var24.height);
               }
            }

            var22 += var5.left + var5.right;
            var23 += var5.top + var5.bottom;
         }

         var31 = var4.left + Gw2.E(new int[]{var19, var22}) + var4.right;
      }

      int var30 = var31;
      int var25 = var4.top + var20 + var23 + var4.bottom;
      PF3 var26 = var7.q(var6);
      Dimension var27 = new Dimension(var30, var25);
      return var26 != null ? FN.h(var27, var26.R()) : var27;
   }

   public int C(D var1) {
      int[] var10000 = com.finalshell.ui.dialog.Y2.M$arrint();
      int var3 = var1.u$int();
      int[] var2 = var10000;
      int var4 = var1.z();
      if (var2 != null) {
         if (var4 == 0) {
            return 0;
         }

         var4 = var3;
      }

      if (var2 == null) {
         return var4;
      } else {
         return var4 > 0 ? var3 - SG.d : 0;
      }
   }
}






