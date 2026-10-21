package com;

import java.awt.Component;
import java.awt.Container;
import java.awt.KeyEventPostProcessor;
import java.awt.Window;
import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRootPane;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.ComboPopup;

public class YR implements KeyEventPostProcessor {
   private static boolean r;
   private static boolean q;
   private static JRootPane f;
   private static Window e;
   private static final long[] a;
   private static final Integer[] b;

   @Override
   public boolean postProcessKeyEvent(KeyEvent var1) {
      String[] var2 = xD_3.U();
      int var10000 = var1.isConsumed();
      if (var2 == null) {
         if (var10000 != 0) {
            return false;
         }

         var10000 = var1.getKeyCode();
      }

      if (var2 == null) {
         if (var10000 == a(32254, 5881030798086241633L)) {
            label74: {
               f = SwingUtilities.getRootPane(var1.getComponent());
               JRootPane var5 = f;
               if (var2 == null) {
                  if (f == null) {
                     var6 = null;
                     break label74;
                  }

                  var5 = f;
               }

               var6 = com.FN.L(var5);
            }

            label84: {
               label85: {
                  e = var6;
                  var10000 = var1.getID();
                  int var10001 = a(31642, 9012265058378480391L);
                  if (var2 == null) {
                     if (var10000 == var10001) {
                        boolean var9 = r;
                        if (var2 == null) {
                           if (!r) {
                              this.t(var1);
                           }

                           r = true;
                           var9 = true;
                        }

                        return var9;
                     }

                     var10000 = var1.getID();
                     if (var2 != null) {
                        break label85;
                     }

                     var10001 = a(14031, 3092722417169708627L);
                  }

                  if (var10000 != var10001) {
                     break label84;
                  }

                  var10000 = r;
               }

               label57: {
                  label87: {
                     if (var10000 != 0) {
                        this.M();
                        if (var2 == null) {
                           break label87;
                        }
                     }

                     MenuSelectionManager var3 = MenuSelectionManager.defaultManager();
                     MenuElement[] var4 = var3.getSelectedPath();
                     var10000 = var4.length;
                     if (var2 != null) {
                        break label57;
                     }

                     if (var10000 <= 0) {
                        com.a9.I(true);
                        this.L(e);
                     }
                  }

                  var10000 = 0;
               }

               r = (boolean)var10000;
            }

            f = null;
            e = null;
            if (var2 == null) {
               return false;
            }
         }

         var10000 = 0;
      }

      r = (boolean)var10000;
      return false;
   }

   private void t(KeyEvent var1) {
      String[] var2;
      int var7;
      String[] var10000 = xD_3.U();
      MenuSelectionManager var3 = MenuSelectionManager.defaultManager();
      var2 = var10000;
      MenuElement[] var4 = var3.getSelectedPath();
      var7 = var4.length;
      label72:
      if (var2 == null) {
         if (var7 > 0) {
            var7 = var4[0] instanceof ComboPopup;
            if (var2 != null) {
               break label72;
            }

            if (var7 == 0) {
               var3.clearSelectedPath();
               q = true;
               var1.consume();
               if (var2 == null) {
                  return;
               }
            }
         }

         var7 = var4.length;
      }

      if (var2 == null) {
         if (var7 > 0) {
            q = false;
            com.a9.I(false);
            this.L(e);
            var1.consume();
            if (var2 == null) {
               return;
            }
         }

         q = false;
         var7 = 0;
      }

      label56: {
         com.a9.I((boolean)var7);
         this.L(e);
         JRootPane var8 = f;
         if (var2 == null) {
            if (f == null) {
               var9 = null;
               break label56;
            }

            var8 = f;
         }

         var9 = var8.getJMenuBar();
      }

      JMenuBar var5 = var9;
      JMenuBar var10 = var5;
      if (var2 == null) {
         label48:
         if (var5 == null) {
            Window var11 = e;
            if (var2 == null) {
               if (!(e instanceof JFrame)) {
                  break label48;
               }

               var11 = e;
            }

            var5 = ((JFrame)var11).getJMenuBar();
         }

         var10 = var5;
      }

      label39: {
         if (var2 == null) {
            if (var10 == null) {
               var12 = null;
               break label39;
            }

            var10 = var5;
         }

         var12 = var10.getMenu(0);
      }

      JMenu var6 = var12;
      if (var6 != null) {
         var1.consume();
      }
   }

   private void M() {
      String[] var1 = xD_3.U();
      int var10000 = q;
      if (var1 == null) {
         if (!q) {
            MenuSelectionManager var2 = MenuSelectionManager.defaultManager();
            var10000 = var2.getSelectedPath().length;
            if (var1 == null) {
               if (var10000 == 0) {
                  label79: {
                     JRootPane var7 = f;
                     if (var1 == null) {
                        if (f == null) {
                           var8 = null;
                           break label79;
                        }

                        var7 = f;
                     }

                     var8 = var7.getJMenuBar();
                  }

                  JMenuBar var3 = var8;
                  JMenuBar var9 = var3;
                  if (var1 == null) {
                     label70:
                     if (var3 == null) {
                        Window var10 = e;
                        if (var1 == null) {
                           if (!(e instanceof JFrame)) {
                              break label70;
                           }

                           var10 = e;
                        }

                        var3 = ((JFrame)var10).getJMenuBar();
                     }

                     var9 = var3;
                  }

                  label63: {
                     if (var1 == null) {
                        if (var9 == null) {
                           var11 = null;
                           break label63;
                        }

                        var9 = var3;
                     }

                     var11 = var9.getMenu(0);
                  }

                  label93: {
                     JMenu var4 = var11;
                     if (var4 != null) {
                        MenuElement[] var5 = new MenuElement[]{var3, var4};
                        var2.setSelectedPath(var5);
                        if (var1 == null) {
                           break label93;
                        }
                     }

                     boolean var12 = com.a9.R();
                     if (var1 == null) {
                        if (var12) {
                           break label93;
                        }

                        var12 = true;
                     }

                     com.a9.I(var12);
                     this.L(e);
                  }

                  if (var1 == null) {
                     return;
                  }
               }

               var10000 = var2.getSelectedPath()[0] instanceof ComboPopup;
            }

            if (var1 == null) {
               if (var10000 == 0) {
                  return;
               }

               var10000 = 1;
            }

            com.a9.I((boolean)var10000);
            this.L(e);
            return;
         }

         var10000 = 1;
      }

      com.a9.I((boolean)var10000);
      this.L(e);
   }

   private void L(Window var1) {
      String[] var2 = xD_3.U();
      Window var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (!var10000.isShowing()) {
            return;
         }

         var10000 = var1;
      }

      Window[] var3 = var10000.getOwnedWindows();
      Window[] var4 = var3;
      int var5 = var3.length;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            Window var7 = var4[var6];
            this.L(var7);
            var6++;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         this.k(var1);
         break;
      }
   }

   private void k(Container var1) {
      String[] var10000 = xD_3.U();
      int var4 = 0;
      String[] var2 = var10000;

      while (var4 < var1.getComponentCount()) {
         Component var3 = var1.getComponent(var4);
         if (var2 == null) {
            label42:
            if (var3 != null) {
               int var5 = var3.isVisible();
               if (var2 == null) {
                  if (var5 == 0 && var2 == null) {
                     break label42;
                  }

                  var5 = var3 instanceof AbstractButton;
               }

               label56:
               if (var2 == null) {
                  if (var5 != 0) {
                     var5 = ((AbstractButton)var3).getMnemonic();
                     if (var2 != null) {
                        break label56;
                     }

                     if (var5 != 0) {
                        var3.repaint();
                        if (var2 == null) {
                           break label42;
                        }
                     }
                  }

                  var5 = var3 instanceof JLabel;
               }

               label49:
               if (var2 == null) {
                  if (var5 != 0) {
                     var5 = ((JLabel)var3).getDisplayedMnemonic();
                     if (var2 != null) {
                        break label49;
                     }

                     if (var5 != 0) {
                        var3.repaint();
                        if (var2 == null) {
                           break label42;
                        }
                     }
                  }

                  var5 = var3 instanceof Container;
               }

               if (var5 != 0) {
                  this.k((Container)var3);
               }
            }

            var4++;
         }

         if (var2 != null) {
            break;
         }
      }
   }

   static {
      long var0 = 3026366423101576160L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "¡SéRksévh¾§K1j$!\\ä\f2(,n\u0093";
      int var5 = "¡SéRksévh¾§K1j$!\\ä\f2(,n\u0093".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
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
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[3];
      r = false;
      q = false;
      f = null;
      e = null;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 157;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





