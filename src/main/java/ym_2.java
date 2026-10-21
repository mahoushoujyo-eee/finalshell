import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Ym_2 implements KeyListener {
   final yB_3 O;
   private static final long a;

   Ym_2(yB_3 var1) {
      this.O = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      int[] var2 = yB_3.Y();
      Object[] var10000 = com.c.f();
      Method var9 = com.c.d(270389152141252877L);
      Object[] var27 = var10000;
      Object var20 = null;

      try {
         var10000 = (Object[])var9.invoke(var20, var27);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var20 = com.c.f();
      Method var10003 = com.c.d(306266403902896148L);
      var27 = (Object[])var20;
      var20 = var10000;
      Method var11 = var10003;

      try {
         var10000 = (Object[])var11.invoke(var20, var27);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var20 = com.c.f();
      var10003 = com.c.d(257025344649675398L);
      var27 = (Object[])var20;
      var20 = var10000;
      Method var13 = var10003;

      try {
         var14 = (Integer)var13.invoke(var20, var27);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      if (var2 == null) {
         var14 = var14 == com.c.c(616402908672951906L).getInt(null) ? 1 : 0;
      }

      int var3 = var14;
      int var4 = 0;
      var15 = var1.getKeyCode();
      label76:
      if (var2 == null) {
         label74:
         if (var15 == (int)a) {
            int var16 = var3;
            if (var2 == null) {
               if (var3 != 0) {
                  byte var17 = var1.isControlDown();
                  if (var2 == null) {
                     if (var17 == 0) {
                        var15 = var1.isMetaDown();
                        if (var2 != null) {
                           break label76;
                        }

                        if (var15 == 0) {
                           break label74;
                        }
                     }

                     var17 = 1;
                  }

                  var4 = var17;
                  if (var2 == null) {
                     break label74;
                  }
               }

               var16 = 1;
            }

            var4 = var16;
         }

         var15 = var4;
      }

      if (var15 != 0) {
         var1.consume();
         var10000 = (Object[])com.c.c(295876503051881517L).get(this);
         var20 = com.c.f();
         var10003 = com.c.d(525165286654267194L);
         var27 = (Object[])var20;
         var20 = var10000;
         Method var19 = var10003;

         try {
            var19.invoke(var20, var27);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }
      }
   }

   static {
      long var0 = 786026515552509834L;
      long var10002 = 8956478253116923776L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





