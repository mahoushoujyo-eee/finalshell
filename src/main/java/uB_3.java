import com.pA_3;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.KeyStroke;

class uB_3 implements KeyListener {
   boolean S;
   final pA_3 O;
   final F_ s;
   private static final long[] a;
   private static final Integer[] b;
   private static final long c;

   uB_3(F_ var1, pA_3 var2) {
      this.s = var1;
      this.O = var2;
      com.c.c(411573546296257898L).setBoolean(this, false);
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      String[] var2 = F_.F();
      Method var10000 = (Method)com.c.c(614438461152141123L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(634403491225282499L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var12 = (Boolean)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      if (var12) {
         label105: {
            KeyStroke var3 = KeyStroke.getKeyStrokeForEvent(var1);
            var13 = var3.getModifiers();
            if (var2 != null) {
               if (var13 == 0) {
                  int var4 = var1.getKeyCode();
                  var13 = var4;
                  var23 = a(12946, 2137176971674416974L);
                  if (var2 == null) {
                     break label105;
                  }

                  if (var4 == var23) {
                     var10000 = (F_)com.c.c(614438461152141123L).get(this);
                     if (var2 != null) {
                        if (com.c.c(312620352076276408L).getInt(var10000) == a(12946, 2137176971674416974L)) {
                           long var5 = System.currentTimeMillis() - com.c.c(573885833107561009L).getLong(com.c.c(614438461152141123L).get(this));
                           if (var5 < c) {
                              ((pA_3)com.c.c(507290872213626229L).get(this)).X().O().requestFocus();
                           }
                        }

                        var10000 = (F_)com.c.c(614438461152141123L).get(this);
                     }

                     com.c.c(573885833107561009L).setLong(var10000, System.currentTimeMillis());
                  }
               }

               com.c.c(312620352076276408L).setInt(com.c.c(614438461152141123L).get(this), var1.getKeyCode());
               var13 = var1.getKeyCode();
            }

            var23 = a(6928, 1265977075100802760L);
         }

         label109: {
            if (var2 != null) {
               if (var13 == var23) {
                  com.c.c(255113142618897746L).setBoolean(com.c.c(614438461152141123L).get(this), true);
                  com.c.c(410556687437883332L).setLong(com.c.c(614438461152141123L).get(this), System.currentTimeMillis());
                  var10000 = (F_)com.c.c(614438461152141123L).get(this);
                  if (var2 != null) {
                     if (((F_)var10000).isVisible()) {
                        var10000 = com.c.c(614438461152141123L).get(this);
                        var10001 = com.c.f();
                        var10003 = com.c.d(496821856781947383L);
                        var10002 = var10001;
                        var10001 = (Object[])var10000;
                        var10000 = var10003;

                        try {
                           var10000.invoke(var10001, var10002);
                        } catch (InvocationTargetException var9) {
                           throw var9.getTargetException();
                        }

                        if (var2 != null) {
                           break label109;
                        }
                     }

                     Object[] var18 = com.c.a(com.c.c(614438461152141123L).get(this));
                     var10000 = com.c.d(445702098416541746L);
                     var10002 = var18;
                     var10001 = null;

                     try {
                        var20 = (Dv_2)var10000.invoke(var10001, var10002);
                     } catch (InvocationTargetException var8) {
                        throw var8.getTargetException();
                     }

                     var20.setText("");
                     var10000 = (F_)com.c.c(614438461152141123L).get(this);
                  }

                  var10001 = com.c.f();
                  var10003 = com.c.d(509913333937371663L);
                  var10002 = var10001;
                  F_ var29 = (F_)var10000;
                  var10000 = var10003;

                  try {
                     var10000.invoke(var29, var10002);
                  } catch (InvocationTargetException var7) {
                     throw var7.getTargetException();
                  }

                  if (var2 != null) {
                     break label109;
                  }
               }

               var13 = var1.getKeyCode();
               var23 = a(28753, 67497304671171978L);
            }

            if (var2 != null) {
               if (var13 == var23) {
                  break label109;
               }

               var13 = var1.getKeyCode();
               var23 = a(22334, 2058444445699740391L);
            }

            if (var2 != null) {
               if (var13 == var23) {
                  break label109;
               }

               var13 = var1.getKeyCode();
               var23 = a(1767, 7955502263690576696L);
            }

            if (var13 == var23) {
            }
         }

         com.c.c(312620352076276408L).setInt(com.c.c(614438461152141123L).get(this), var1.getKeyCode());
         com.c.c(177945602361155986L).setBoolean(com.c.c(614438461152141123L).get(this), var1.isControlDown());
      }
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      String[] var10000 = F_.F();
      com.c.c(486270061265296034L).setInt(com.c.c(614438461152141123L).get(this), var1.getKeyCode());
      String[] var2 = var10000;
      int var3 = var1.getKeyCode();
      KeyStroke var4 = KeyStroke.getKeyStrokeForEvent(var1);
      int var5 = var3;
      int var10001 = a(2070, 1820936551941754312L);
      if (var2 != null) {
         if (var3 == var10001) {
            return;
         }

         var5 = var4.getModifiers();
         var10001 = a(4548, 6973595155736482841L);
      }

      if ((var5 & var10001) != 0) {
         com.c.c(411573546296257898L).setBoolean(this, true);
      }
   }

   static {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17885;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





