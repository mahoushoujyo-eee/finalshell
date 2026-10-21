package com.finalshell.core;

import com.finalshell.ui.model.Pt2;
import com.finalshell.ui.panel.Ky4;
import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;
import javax.swing.JToggleButton.ToggleButtonModel;

public class S extends ToggleButtonModel {
   public boolean p = IN.G;
   public static long[] a;
   public static Integer[] b;

   public boolean O() {
      return this.p;
   }

   public void y(boolean var1) {
      this.p = var1;
   }

   public void f(Pt2 var1) {
      label22: {
         Ky4[] var2;
         label21: {
            var2 = Pt2.b();
            if (var2 == null) {
               switch (Yn2.M[var1.ordinal()]) {
                  case 1:
                     this.setSelected(false);
                     break;
                  case 2:
                     break label21;
                  case 3:
                     break label22;
                  default:
                     return;
               }
            }

            if (var2 == null) {
               return;
            }
         }

         this.setSelected(true);
         if (var2 == null) {
            return;
         }
      }

      this.g(true);
   }

   public Pt2 y() {
      Ky4[] var1 = Pt2.b();
      boolean var10000 = this.X();
      if (var1 == null) {
         if (var10000) {
            return Pt2.mixed;
         }

         var10000 = this.isSelected();
      }

      return var10000 ? Pt2.checked : Pt2.unchecked;
   }

   @Override
   public void setPressed(boolean var1) {
      S var7;
      Ky4[] var2 = Pt2.b();
      int var10000 = (this.isEnabled()) ? 1 : 0;
      if (var2 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = (this.isPressed()) ? 1 : 0;
      }

      if (var2 == null) {
         if (var10000 == var1) {
            return;
         }

         var10000 = (var1) ? 1 : 0;
      }

      label76: {
         label75: {
            if (var2 == null) {
               if (var10000 != 0) {
                  break label75;
               }

               var7 = this;
               if (var2 != null) {
                  break label76;
               }

               var10000 = (this.isArmed()) ? 1 : 0;
            }

            if (var10000 != 0) {
               this.d();
            }
         }

         var7 = this;
      }

      int var10;
      label66: {
         var10 = (var1) ? 1 : 0;
         if (var2 == null) {
            if (var1 != 0) {
               var10 = this.stateMask | 4;
               break label66;
            }

            var10 = this.stateMask;
         }

         var10 &= a(4766, 3863445292575446678L);
      }

      var7.stateMask = var10;
      this.fireStateChanged();
      var10000 = (this.isPressed()) ? 1 : 0;
      if (var2 == null) {
         if (var10000 != 0) {
            return;
         }

         var10000 = (this.isArmed()) ? 1 : 0;
      }

      if (var2 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = (byte)0;
      }

      int var3;
      label91: {
         var3 = var10000;
         AWTEvent var4 = EventQueue.getCurrentEvent();
         var10000 = (var4 instanceof InputEvent) ? 1 : 0;
         if (var2 == null) {
            if (var10000 != 0) {
               var3 = ((InputEvent)var4).getModifiers();
               if (var2 == null) {
                  break label91;
               }
            }

            var10000 = (var4 instanceof ActionEvent) ? 1 : 0;
         }

         if (var2 == null) {
            if (var10000 == 0) {
               break label91;
            }

            var10000 = ((ActionEvent)var4).getModifiers();
         }

         var3 = var10000;
      }

      long var5 = EventQueue.getMostRecentEventTime();
      this.fireActionPerformed(new ActionEvent(this, a(5724, 489063734572372561L), this.getActionCommand(), var5, var3));
   }

   public void d() {
      this.f(this.Y(this.y()));
   }

   @Override
   public void setSelected(boolean var1) {
      Ky4[] var10000 = Pt2.b();
      boolean var3 = this.X();
      Ky4[] var2 = var10000;
      if (var2 == null) {
         if (var3) {
            int var4;
            label20: {
               this.stateMask = this.stateMask & a(3451, 8044606198164277621L);
               var4 = (var1) ? 1 : 0;
               if (var2 == null) {
                  if (var1 != 0) {
                     var4 = this.stateMask & a(7556, 5045667298793806223L);
                     break label20;
                  }

                  var4 = this.stateMask;
               }

               var4 |= 2;
            }

            this.stateMask = var4;
         }

         super.setSelected((boolean)var1);
      }
   }

   public boolean X() {
      Ky4[] var1 = Pt2.b();
      int var10000 = this.stateMask & a(29808, 216269436117168255L);
      if (var1 == null) {
         var10000 = var10000 != 0 ? 1 : 0;
      }

      return var10000 != 0;
   }

   public void g(boolean var1) {
      Ky4[] var2 = Pt2.b();
      S var10000 = this;
      if (var2 == null) {
         if (this.X() == var1) {
            return;
         }

         var10000 = this;
      }

      int var3;
      label21: {
         var3 = (var1) ? 1 : 0;
         if (var2 == null) {
            if (var1 != 0) {
               var3 = this.stateMask | a(9977, 4060913670531310325L) | 2;
               break label21;
            }

            var3 = this.stateMask;
         }

         var3 &= a(4750, 6830364874690188932L);
      }

      var10000.stateMask = var3;
      this.fireStateChanged();
      this.fireItemStateChanged(new ItemEvent(this, a(23821, 7849490957253515524L), this, 3));
   }

   public Pt2 Y(Pt2 var1) {
      Ky4[] var2 = Pt2.b();
      int var10000 = Yn2.M[var1.ordinal()];
      if (var2 == null) {
         switch (var10000) {
            case 1:
               var10000 = (this.p) ? 1 : 0;
               break;
            case 2:
               return this.p ? Pt2.unchecked : Pt2.mixed;
            case 3:
               return this.p ? Pt2.checked : Pt2.unchecked;
            default:
               return Pt2.unchecked;
         }
      }

      return var10000 != 0 ? Pt2.mixed : Pt2.checked;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17420;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      byte[] var7;
      long var0 = 5499702052714726613L;
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = "*»â\u0087m\u0007¦ \u0088ËKfÍ:\u0015m¥ú\u0017Ô&\u000frß\u0092\u0014íeÕ\u0005ô*Q~BÑ\u0018ní¸]\u008dÚ\u008e80ßl";
      int var5 = "*»â\u0087m\u0007¦ \u0088ËKfÍ:\u0015m¥ú\u0017Ô&\u000frß\u0092\u0014íeÕ\u0005ô*Q~BÑ\u0018ní¸]\u008dÚ\u008e80ßl".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
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
                     b = new Integer[8];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "BG®r\u0003Em.B\u001d³>þ\u001bb§";
                  var5 = "BG®r\u0003Em.B\u001d³>þ\u001bb§".length();
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





