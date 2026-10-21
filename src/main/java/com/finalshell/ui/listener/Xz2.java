package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K32;
import com.finalshell.ui.panel.Kb4;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class Xz2 extends MouseAdapter {
   final Kb4 j;
   public static long[] a;
   public static Integer[] b;

   Xz2(Kb4 var1) {
      this.j = var1;
   }

   public void V(MouseEvent var1) {
      int[] var2 = K32.L$arrint();
      boolean var10000 = new Rectangle(0, 0, a(18472, 4376805916605354215L), a(32508, 7406508288587474485L)).contains(var1.getPoint());
      if (var2 != null) {
         if (var10000) {
            Kb4.y(this.j, a(27220, 2869854698237145759L));
            this.j.setCursor(Cursor.getPredefinedCursor(a(10826, 6739842021146555012L)));
            if (var2 != null) {
               return;
            }
         }

         var10000 = new Rectangle(this.j.getWidth() / 2 - a(10826, 6739842021146555012L), 0, a(32508, 7406508288587474485L), a(32508, 7406508288587474485L))
            .contains(var1.getPoint());
      }

      if (var2 != null) {
         if (var10000) {
            Kb4.y(this.j, 1);
            this.j.setCursor(Cursor.getPredefinedCursor(a(27220, 2869854698237145759L)));
            if (var2 != null) {
               return;
            }
         }

         var10000 = new Rectangle(this.j.getWidth() - a(32508, 7406508288587474485L), 0, a(32508, 7406508288587474485L), a(32508, 7406508288587474485L))
            .contains(var1.getPoint());
      }

      if (var2 != null) {
         if (var10000) {
            Kb4.y(this.j, 2);
            this.j.setCursor(Cursor.getPredefinedCursor(a(17383, 2236633985702894371L)));
            if (var2 != null) {
               return;
            }
         }

         var10000 = new Rectangle(0, this.j.getHeight() / 2 - a(10826, 6739842021146555012L), a(32508, 7406508288587474485L), a(32508, 7406508288587474485L))
            .contains(var1.getPoint());
      }

      if (var2 != null) {
         if (var10000) {
            Kb4.y(this.j, a(17383, 2236633985702894371L));
            this.j.setCursor(Cursor.getPredefinedCursor(a(5452, 2970219182896434569L)));
            if (var2 != null) {
               return;
            }
         }

         var10000 = new Rectangle(
               this.j.getWidth() - a(32508, 7406508288587474485L),
               this.j.getHeight() / 2 - a(10826, 6739842021146555012L),
               a(32508, 7406508288587474485L),
               a(32508, 7406508288587474485L)
            )
            .contains(var1.getPoint());
      }

      if (var2 != null) {
         if (var10000) {
            Kb4.y(this.j, 3);
            this.j.setCursor(Cursor.getPredefinedCursor(a(2736, 7433830175054221944L)));
            if (var2 != null) {
               return;
            }
         }

         var10000 = new Rectangle(0, this.j.getHeight() - a(32508, 7406508288587474485L), a(32508, 7406508288587474485L), a(32508, 7406508288587474485L))
            .contains(var1.getPoint());
      }

      if (var2 != null) {
         if (var10000) {
            Kb4.y(this.j, a(10826, 6739842021146555012L));
            this.j.setCursor(Cursor.getPredefinedCursor(4));
            if (var2 != null) {
               return;
            }
         }

         var10000 = new Rectangle(
               this.j.getWidth() / 2 - a(10826, 6739842021146555012L),
               this.j.getHeight() - a(32508, 7406508288587474485L),
               a(32508, 7406508288587474485L),
               a(32508, 7406508288587474485L)
            )
            .contains(var1.getPoint());
      }

      if (var2 != null) {
         if (var10000) {
            Kb4.y(this.j, 5);
            this.j.setCursor(Cursor.getPredefinedCursor(a(25528, 8702408367310388084L)));
            if (var2 != null) {
               return;
            }
         }

         var10000 = new Rectangle(
               this.j.getWidth() - a(32508, 7406508288587474485L),
               this.j.getHeight() - a(32508, 7406508288587474485L),
               a(32508, 7406508288587474485L),
               a(32508, 7406508288587474485L)
            )
            .contains(var1.getPoint());
      }

      if (var2 != null) {
         if (var10000) {
            Kb4.y(this.j, 4);
            this.j.setCursor(Cursor.getPredefinedCursor(5));
            if (var2 != null) {
               return;
            }
         }

         Kb4.y(this.j, -1);
      }

      this.j.setCursor(Cursor.getDefaultCursor());
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      this.V(var1);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int[] var10000 = K32.L$arrint();
      this.V(var1);
      int[] var2 = var10000;
      boolean var3 = SwingUtilities.isLeftMouseButton(var1);
      if (var2 != null) {
         if (var3) {
            int var4 = Kb4.z(this.j);
            if (var2 == null) {
               return;
            }

            if (var4 != -1) {
               Kb4.Y(this.j, true);
            }
         }

         Kb4.n(this.j, var1.getXOnScreen());
         Kb4.i(this.j, var1.getYOnScreen());
      }
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      int[] var2 = K32.L$arrint();
      int var10000 = Kb4.r(this.j);
      if (var2 != null) {
         if (var10000) {
            var10000 = Kb4.A(this.j);
            if (var2 == null) {
               return;
            }

            if (var10000 != -1) {
               var10000 = Kb4.Q(this.j);
               if (var2 == null) {
                  return;
               }

               if (var10000 != -1) {
                  int var10001;
                  int var10002;
                  var5 = this.j;
                  var10001 = (Kb4.A(this.j) - var1.getXOnScreen()) * 2;
                  var10002 = Kb4.z(this.j);
                  label82:
                  if (var2 != null) {
                     label89:
                     if (var10002 != 1) {
                        var10002 = Kb4.z(this.j);
                        int var10003 = 5;
                        if (var2 != null) {
                           if (var10002 == 5) {
                              break label89;
                           }

                           var10002 = Kb4.z(this.j);
                           if (var2 == null) {
                              break label82;
                           }

                           var10003 = a(27828, 2575646271157384313L);
                        }

                        if (var10002 != var10003) {
                           var10002 = Kb4.z(this.j);
                           if (var2 == null) {
                              break label82;
                           }

                           if (var10002 != a(20341, 312491051622897599L)) {
                              var10002 = Kb4.z(this.j);
                              if (var2 == null) {
                                 break label82;
                              }

                              if (var10002 != a(14349, 2266619925450711243L)) {
                                 var10002 = -1;
                                 break label82;
                              }
                           }
                        }

                        var10002 = 1;
                        break label82;
                     }

                     var10002 = 0;
                  }

                  Kb4.H(var5, var10001 * var10002);
                  Kb4.t(this.j, Math.max(Kb4.J(this.j), 0));
                  var6 = this.j;
                  var10001 = (Kb4.Q(this.j) - var1.getYOnScreen()) * 2;
                  var10002 = Kb4.z(this.j);
                  label59:
                  if (var2 != null) {
                     label66:
                     if (var10002 != a(17383, 2236633985702894371L)) {
                        var10002 = Kb4.z(this.j);
                        int var9 = 3;
                        if (var2 != null) {
                           if (var10002 == 3) {
                              break label66;
                           }

                           var10002 = Kb4.z(this.j);
                           if (var2 == null) {
                              break label59;
                           }

                           var9 = a(27220, 2869854698237145759L);
                        }

                        if (var10002 != var9) {
                           var10002 = Kb4.z(this.j);
                           if (var2 == null) {
                              break label59;
                           }

                           if (var10002 != 1) {
                              var10002 = Kb4.z(this.j);
                              if (var2 == null) {
                                 break label59;
                              }

                              if (var10002 != 2) {
                                 var10002 = -1;
                                 break label59;
                              }
                           }
                        }

                        var10002 = 1;
                        break label59;
                     }

                     var10002 = 0;
                  }

                  Kb4.A(var6, var10001 * var10002);
                  Kb4.T(this.j, Math.max(Kb4.v(this.j), 0));
                  this.j.revalidate();
               }
            }
         }

         Kb4.n(this.j, var1.getXOnScreen());
         Kb4.i(this.j, var1.getYOnScreen());
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int[] var2 = K32.L$arrint();
      if (var2 != null) {
         if (SwingUtilities.isLeftMouseButton(var1)) {
            Kb4.Y(this.j, false);
         }

         this.V(var1);
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22732;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8842949951879555565L;
      long[] var6 = new long[11];
      int var3 = 0;
      String var4 = "\u008coE\u008egº\u0092\u0090ë÷èÅ;3\u009d\u009c\u0003£ç\u0007ðæ[o\u0091T\u0084ï®A¹\u0006\u0080D½\u0006`ù{\u009e×\u0019·Û\u0017h\u008fÔ%wg¸·.>Uì\u0019\u0093Ü\u008d?\u009bz\u0086l6°\u009a5²É";
      int var5 = "\u008coE\u008egº\u0092\u0090ë÷èÅ;3\u009d\u009c\u0003£ç\u0007ðæ[o\u0091T\u0084ï®A¹\u0006\u0080D½\u0006`ù{\u009e×\u0019·Û\u0017h\u008fÔ%wg¸·.>Uì\u0019\u0093Ü\u008d?\u009bz\u0086l6°\u009a5²É"
         .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[11];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "ýå^\u008c=ÁdnÌ\u0014ÒØ1\u0019I ";
                  var5 = "ýå^\u008c=ÁdnÌ\u0014ÒØ1\u0019I ".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





