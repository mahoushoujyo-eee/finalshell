package com.finalshell.ui.listener;

import com.finalshell.core.Dv2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Backspace;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.KeyStroke;

public class UB3 implements KeyListener {
   public boolean S;
   public final SetBackgroundImagePanel O;
   public final Backspace s;
   public static long[] a;
   public static Integer[] b;
   public static long c;

   public UB3(Backspace var1, SetBackgroundImagePanel var2) {
      this.s = var1;
      this.O = var2;
      Registry.lookupField(411573546296257898L).setBoolean(this, false);
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      boolean var48;
      String[] var2 = Backspace.F();
      Object var7 = 614438461152141123L;
      Ref.g(614438461152141123L, var7);
      Object var10002 = Registry.emptyArgs();
      long var10 = 634403491225282499L;
      Object var9 = var10002;
      var10002 = Ref.h(634403491225282499L, var9, var10);

      try {
         var48 = (Boolean)var10002;
      } catch (InvocationTargetException var46) {
         throw var46.getTargetException();
      }

      if (var48) {
         int var10003;
         label105: {
            KeyStroke var3 = KeyStroke.getKeyStrokeForEvent(var1);
            var10002 = var3.getModifiers();
            if (var2 != null) {
               if (var10002 == null) {
                  Object var4 = var1.getKeyCode();
                  var10002 = (Object[])var4;
                  var10003 = a(12946, 2137176971674416974L);
                  if (var2 == null) {
                     break label105;
                  }

                  if (var4 == var10003) {
                     Object var11 = 614438461152141123L;
                     Object var50 = (Backspace)Ref.g(614438461152141123L, var11);
                     if (var2 != null) {
                        if (Registry.lookupField(312620352076276408L).getInt(var50) == a(12946, 2137176971674416974L)) {
                           System.currentTimeMillis();
                           Object var13 = 614438461152141123L;
                           long var5 = 0 - Registry.lookupField(573885833107561009L).getLong(Ref.g(614438461152141123L, var13));
                           if (var5 < c) {
                              Object var15 = 507290872213626229L;
                              ((SetBackgroundImagePanel)Ref.g(507290872213626229L, var15)).X$_y_2().O$pA_3().requestFocus();
                           }
                        }

                        var50 = this;
                        Object var17 = 614438461152141123L;
                        Backspace var10004 = (Backspace)Ref.g(614438461152141123L, var17);
                     }

                     Registry.lookupField(573885833107561009L).setLong(var50, System.currentTimeMillis());
                  }
               }

               var10002 = this;
               Object var19 = 614438461152141123L;
               Registry.lookupField(312620352076276408L).setInt(Ref.g(614438461152141123L, var19), var1.getKeyCode());
               var1.getKeyCode();
            }

            var10003 = a(6928, 1265977075100802760L);
         }

         label109: {
            if (var2 != null) {
               if (var10002 == var10003) {
                  Object var21 = 614438461152141123L;
                  Registry.lookupField(255113142618897746L).setBoolean(Ref.g(614438461152141123L, var21), true);
                  Object var23 = 614438461152141123L;
                  Registry.lookupField(410556687437883332L).setLong(Ref.g(614438461152141123L, var23), System.currentTimeMillis());
                  Object var25 = 614438461152141123L;
                  Backspace var10005 = (Backspace)Ref.g(614438461152141123L, var25);
                  if (var2 != null) {
                     if (var10005.isVisible()) {
                        Object var27 = 614438461152141123L;
                        Ref.g(614438461152141123L, var27);
                        Object[] var10007 = Registry.emptyArgs();
                        long var30 = 496821856781947383L;
                        Object[] var29 = var10007;
                        Ref.h(496821856781947383L, var29, var30);

                        try {
                           ;
                        } catch (InvocationTargetException var45) {
                           throw var45.getTargetException();
                        }

                        if (var2 != null) {
                           break label109;
                        }
                     }

                     Object var31 = 614438461152141123L;
                     Registry.packArgs(Ref.g(614438461152141123L, var31));
                     long var33 = 445702098416541746L;
                     Dv2 var51 = (Dv2)Ref.h2(445702098416541746L, var33);

                     try {
                        var51 = var51;
                     } catch (InvocationTargetException var44) {
                        throw var44.getTargetException();
                     }

                     var51.setText("");
                     Object var35 = 614438461152141123L;
                     Backspace var10008 = (Backspace)Ref.g(614438461152141123L, var35);
                  }

                  Object[] var10006 = Registry.emptyArgs();
                  long var38 = 509913333937371663L;
                  Object[] var37 = var10006;
                  Ref.h(509913333937371663L, var37, var38);

                  try {
                     ;
                  } catch (InvocationTargetException var43) {
                     throw var43.getTargetException();
                  }

                  if (var2 != null) {
                     break label109;
                  }
               }

               var10002 = var1.getKeyCode();
               var10003 = a(28753, 67497304671171978L);
            }

            if (var2 != null) {
               if (var10002 == var10003) {
                  break label109;
               }

               var10002 = var1.getKeyCode();
               var10003 = a(22334, 2058444445699740391L);
            }

            if (var2 != null) {
               if (var10002 == var10003) {
                  break label109;
               }

               var10002 = var1.getKeyCode();
               var10003 = a(1767, 7955502263690576696L);
            }

            if (var10002 == var10003) {
            }
         }

         Object var39 = 614438461152141123L;
         Registry.lookupField(312620352076276408L).setInt(Ref.g(614438461152141123L, var39), var1.getKeyCode());
         Object var41 = 614438461152141123L;
         Registry.lookupField(177945602361155986L).setBoolean(Ref.g(614438461152141123L, var41), var1.isControlDown());
      }
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      Backspace.F();
      Object var5 = 614438461152141123L;
      Registry.lookupField(486270061265296034L).setInt(Ref.g(614438461152141123L, var5), var1.getKeyCode());
      int var3 = var1.getKeyCode();
      KeyStroke var4 = KeyStroke.getKeyStrokeForEvent(var1);
      int var10001 = var3;
      int var10002 = a(2070, 1820936551941754312L);
      if (this != null) {
         if (var3 == var10002) {
            return;
         }

         var10001 = var4.getModifiers();
         var10002 = a(4548, 6973595155736482841L);
      }

      if ((var10001 & var10002) != 0) {
         Registry.lookupField(411573546296257898L).setBoolean(this, true);
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17885;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var2 = 2221912735667580633L;
      long[] var8 = new long[7];
      int var5 = 0;
      String var6 = "â\u0019ZöÒo:@±.>ÿ\u0089\u00ad\u0099\u0086]Í4ÃÆv-ëÆ\u0019rÃ\u0012b£\u0000ú\u0090uïT®ü\u0016";
      int var7 = "â\u0019ZöÒo:@±.>ÿ\u0089\u00ad\u0099\u0086]Í4ÃÆv-ëÆ\u0019rÃ\u0012b£\u0000ú\u0090uïT®ü\u0016".length();
      byte var4 = 0;

      label20:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var10000 = var8;
         var10001 = var5++;
         long var10002 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var17 = var10002 ^ var2;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var17;
                  if (var4 >= var7) {
                     a = var8;
                     b = new Integer[7];
                     long var0 = 2449060489221272086L;
                     var10002 = 2449060489221272546L ^ var0;
                     byte var13 = -1;
                     c = var10002;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var17;
                  if (var4 < var7) {
                     continue label20;
                  }

                  var6 = "Í¥QÔ\\J0\u0018w%s(\u0087Y[H";
                  var7 = "Í¥QÔ\\J0\u0018w%s(\u0087Y[H".length();
                  var4 = 0;
            }

            byte var12 = var4;
            var4 += 8;
            var9 = var6.substring(var12, var4).getBytes("ISO-8859-1");
            var10000 = var8;
            var10001 = var5++;
            var10002 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





