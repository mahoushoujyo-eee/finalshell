import com.ne_4;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Dv_2 extends ne_4 {
   FK N;
   private static final long a;

   public Dv_2() {
      Object[] var10001 = com.c.a(com.c.c(395970988011231853L).get(null));
      Method var10003 = com.c.d(450901685535284362L);
      Object[] var10002 = var10001;
      Dv_2 var2 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      this.h(0);
   }

   @Override
   public void setFont(Font var1) {
      String[] var2 = FK.i();
      if (var2 == null) {
         if (var1.getSize() == (int)a) {
            new Exception().printStackTrace();
         }

         super.setFont(var1);
      }
   }

   @Override
   public Font getFont() {
      return super.getFont();
   }

   public FK u() {
      return (FK)com.c.c(478553490735199209L).get(this);
   }

   public void A(FK var1) {
      com.c.c(478553490735199209L).set(this, var1);
   }

   static {
      long var0 = 5245860697566201968L;
      long var10002 = 8015606882517239933L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





