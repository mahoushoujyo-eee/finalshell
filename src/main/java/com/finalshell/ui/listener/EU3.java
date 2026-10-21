package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class EU3 extends MouseAdapter implements SwingConstants {
   public boolean l = false;
   public int X = -1;
   public int N = -1;
   public int U = 0;
   public static long[] a;
   public static Integer[] b;

   public static void x(Component var0, int var1) {
      EU3 var2 = new EU3(var1);
      var0.addMouseListener(var2);
      var0.addMouseMotionListener(var2);
   }

   public EU3(int var1) {
      this.U = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int[] var2 = com.finalshell.ui.dialog.Ds2.U$arrint();
      if (var2 == null) {
         if (SwingUtilities.isLeftMouseButton(var1)) {
            this.l = true;
         }

         this.X = var1.getXOnScreen();
         this.N = var1.getYOnScreen();
      }
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      Window var10;
      EU3 var12;
      int[] var2;
      int var10000;
      label279: {
         var2 = com.finalshell.ui.dialog.Ds2.U$arrint();
         var10000 = this.X;
         byte var10001 = -1;
         if (var2 == null) {
            if (this.X == -1) {
               return;
            }

            var10000 = this.N;
            if (var2 != null) {
               break label279;
            }

            var10001 = -1;
         }

         if (var10000 == var10001) {
            return;
         }

         var10000 = (this.l) ? 1 : 0;
      }

      if (var10000 != 0) {
         Window var3;
         Rectangle var4;
         Dimension var5;
         byte var6;
         label282: {
            var3 = FN.L(var1.getComponent());
            var4 = var3.getBounds();
            boolean var9 = var3 instanceof JDialog;
            if (var2 == null) {
               if (var9) {
                  var5 = ((JDialog)var3).getRootPane().getMinimumSize();
                  var6 = (byte)((((JDialog)var3).isUndecorated()) ? 1 : 0);
                  if (var2 == null) {
                     break label282;
                  }
               }

               var9 = var3 instanceof JFrame;
            }

            label283: {
               if (var2 == null) {
                  if (var9) {
                     var5 = ((JFrame)var3).getRootPane().getMinimumSize();
                     var6 = (byte)((((JFrame)var3).isUndecorated()) ? 1 : 0);
                     if (var2 == null) {
                        break label282;
                     }
                  }

                  var10 = var3;
                  if (var2 != null) {
                     break label283;
                  }

                  var9 = var3 instanceof JWindow;
               }

               if (var9) {
                  var5 = ((JWindow)var3).getRootPane().getMinimumSize();
                  var6 = (byte)((((JFrame)var3).isUndecorated()) ? 1 : 0);
                  if (var2 == null) {
                     break label282;
                  }
               }

               var10 = var3;
            }

            var5 = var10.getMinimumSize();
            var6 = 1;
         }

         int var7;
         int var8;
         var7 = var1.getXOnScreen() - this.X;
         var8 = var1.getYOnScreen() - this.N;
         var10000 = var6;
         label174:
         if (var2 == null) {
            label243:
            if (var6 != 0) {
               int var13;
               label241: {
                  label287: {
                     label239: {
                        label288: {
                           var10000 = this.U;
                           var13 = a(25203, 6827266121268851179L);
                           label237:
                           if (var2 == null) {
                              if (var10000 != var13) {
                                 var10000 = this.U;
                                 var13 = a(8962, 5682727548206493852L);
                                 if (var2 != null) {
                                    break label237;
                                 }

                                 if (var10000 != var13) {
                                    var10000 = this.U;
                                    var13 = a(30476, 8681860764236211344L);
                                    if (var2 != null) {
                                       break label239;
                                    }

                                    if (var10000 != var13) {
                                       break label288;
                                    }
                                 }
                              }

                              var10000 = var4.width - var7;
                              var13 = var5.width;
                           }

                           if (var2 != null) {
                              break label241;
                           }

                           if (var10000 >= var13) {
                              break label287;
                           }

                           var7 = 0;
                           if (var2 == null) {
                              break label287;
                           }
                        }

                        var10000 = this.U;
                        var13 = 2;
                     }

                     label219:
                     if (var2 == null) {
                        if (var10000 != var13) {
                           var10000 = this.U;
                           var13 = 3;
                           if (var2 != null) {
                              break label219;
                           }

                           if (this.U != 3) {
                              var10000 = this.U;
                              var13 = 4;
                              if (var2 != null) {
                                 break label241;
                              }

                              if (this.U != 4) {
                                 break label287;
                              }
                           }
                        }

                        var10000 = var4.width + var7;
                        var13 = var5.width;
                     }

                     if (var2 != null) {
                        break label241;
                     }

                     if (var10000 < var13) {
                        var7 = 0;
                     }
                  }

                  var10000 = this.U;
                  var13 = a(17381, 1006339150088917116L);
               }

               label203: {
                  label289: {
                     label201:
                     if (var2 == null) {
                        if (var10000 != var13) {
                           var10000 = this.U;
                           var13 = 1;
                           if (var2 != null) {
                              break label201;
                           }

                           if (this.U != 1) {
                              var10000 = this.U;
                              var13 = 2;
                              if (var2 != null) {
                                 break label203;
                              }

                              if (this.U != 2) {
                                 break label289;
                              }
                           }
                        }

                        var10000 = var4.height - var8;
                        if (var2 != null) {
                           break label174;
                        }

                        var13 = var5.height;
                     }

                     if (var10000 >= var13) {
                        break label243;
                     }

                     var8 = 0;
                     if (var2 == null) {
                        break label243;
                     }
                  }

                  var10000 = this.U;
                  var13 = a(16346, 5654950915180145733L);
               }

               label184:
               if (var2 == null) {
                  if (var10000 != var13) {
                     var10000 = this.U;
                     var13 = 5;
                     if (var2 != null) {
                        break label184;
                     }

                     if (this.U != 5) {
                        var10000 = this.U;
                        if (var2 != null) {
                           break label174;
                        }

                        if (this.U != 4) {
                           break label243;
                        }
                     }
                  }

                  var10000 = var4.height + var8;
                  if (var2 != null) {
                     break label174;
                  }

                  var13 = var5.height;
               }

               if (var10000 < var13) {
                  var8 = 0;
               }
            }

            var10000 = var7;
         }

         label166:
         if (var2 == null) {
            if (var10000 == 0) {
               var10000 = var8;
               if (var2 != null) {
                  break label166;
               }

               if (var8 == 0) {
                  return;
               }
            }

            var10000 = this.U;
         }

         label157: {
            label292: {
               int var15 = a(17381, 1006339150088917116L);
               if (var2 == null) {
                  if (var10000 == var15) {
                     var3.setBounds(var4.x + var7, var4.y + var8, var4.width - var7, var4.height - var8);
                     if (var2 == null) {
                        break label292;
                     }
                  }

                  var10000 = this.U;
                  var15 = 1;
               }

               if (var2 == null) {
                  if (var10000 == var15) {
                     var3.setBounds(var4.x, var4.y + var8, var4.width, var4.height - var8);
                     if (var2 == null) {
                        break label292;
                     }
                  }

                  var10000 = this.U;
                  var15 = 2;
               }

               if (var2 == null) {
                  if (var10000 == var15) {
                     var3.setBounds(var4.x, var4.y + var8, var4.width + var7, var4.height - var8);
                     if (var2 == null) {
                        break label292;
                     }
                  }

                  var10000 = this.U;
                  var15 = a(17317, 9077518228257919032L);
               }

               if (var2 == null) {
                  if (var10000 == var15) {
                     var3.setBounds(var4.x + var7, var4.y, var4.width - var7, var4.height);
                     if (var2 == null) {
                        break label292;
                     }
                  }

                  var10000 = this.U;
                  var15 = 3;
               }

               if (var2 == null) {
                  if (var10000 == var15) {
                     var3.setBounds(var4.x, var4.y, var4.width + var7, var4.height);
                     if (var2 == null) {
                        break label292;
                     }
                  }

                  var10000 = this.U;
                  var15 = a(16346, 5654950915180145733L);
               }

               if (var2 == null) {
                  if (var10000 == var15) {
                     var3.setBounds(var4.x + var7, var4.y, var4.width - var7, var4.height + var8);
                     if (var2 == null) {
                        break label292;
                     }
                  }

                  var10000 = this.U;
                  var15 = 5;
               }

               if (var2 == null) {
                  if (var10000 == var15) {
                     var3.setBounds(var4.x, var4.y, var4.width, var4.height + var8);
                     if (var2 == null) {
                        break label292;
                     }
                  }

                  var12 = this;
                  if (var2 != null) {
                     break label157;
                  }

                  var10000 = this.U;
                  var15 = 4;
               }

               if (var10000 == var15) {
                  var3.setBounds(var4.x, var4.y, var4.width + var7, var4.height + var8);
               }
            }

            this.X = var1.getXOnScreen();
            var12 = this;
         }

         var12.N = var1.getYOnScreen();
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.l = false;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5020;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      byte var10;
      long var0 = 4628800196339751999L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "\u008b\u0093\u009bHÖ¥¸©¾ù\u0088\u0099Òd\u008c\u0000½¹³øÍ:l¤ú9\u0094Yf\u0083ð|";
      int var5 = "\u008b\u0093\u009bHÖ¥¸©¾ù\u0088\u0099Òd\u008c\u0000½¹³øÍ:l¤ú9\u0094Yf\u0083ð|".length();
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
                     b = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0091B±\u0004f_-Üµ¸Õ=\u0003\u0088\u008cK";
                  var5 = "\u0091B±\u0004f_-Üµ¸Õ=\u0003\u0088\u008cK".length();
                  var2 = 0;
            }

            var10 = var2;
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





