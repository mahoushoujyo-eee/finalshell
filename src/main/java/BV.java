import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class BV implements KeyListener {
   final F6 n;
   private static final long a;

   BV(F6 var1) {
      this.n = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      boolean var2 = F6.i();
      if (var1.getKeyCode() == (int)a) {
         String var3 = ((Dv_2)com.c.c(426888588741823559L).get(com.c.c(300671885637670350L).get(this))).getText().trim();
         boolean var4 = false;

         label29: {
            while (var3.endsWith("/")) {
               var3 = var3.substring(0, var3.length() - 1);
               var4 = true;
               if (!var2) {
                  break label29;
               }

               if (!var2) {
                  break;
               }
            }

            if (var4) {
               ((Dv_2)com.c.c(426888588741823559L).get(com.c.c(300671885637670350L).get(this))).setText(var3);
            }
         }

         ((Dv_2)com.c.c(426888588741823559L).get(com.c.c(300671885637670350L).get(this)))
            .setCaretPosition(((Dv_2)com.c.c(426888588741823559L).get(com.c.c(300671885637670350L).get(this))).getDocument().getLength());
         Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
         Object[] var10001 = com.c.a(new Dr_2(this, var3));
         Method var10003 = com.c.d(434592463220957006L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }
   }

   static {
      long var0 = 8841734958257816143L;
      long var10002 = -3849329549525630395L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





