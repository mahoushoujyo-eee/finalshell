import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

class lK_3 implements Comparator {
   final Comparator K = Collator.getInstance(Locale.CHINA);

   public int U(lD_3 var1, lD_3 var2) {
      Comparator var10000 = (Comparator)com.c.c(244830222573439052L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(286931176286176762L);
      Object[] var10003 = var10002;
      lD_3 var6 = var1;
      Method var10001 = var10004;

      try {
         var5 = (String)var10001.invoke(var6, var10003);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10003 = com.c.f();
      Method var10005 = com.c.d(286931176286176762L);
      Object[] var11 = var10003;
      lD_3 var10 = var2;
      Method var7 = var10005;

      try {
         var10002 = (String)var7.invoke(var10, var11);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      return var10000.compare(var5, var10002);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = com.c.a((lD_3)var1, (lD_3)var2);
      Method var10003 = com.c.d(175580520082473153L);
      Object[] var10002 = var10001;
      lK_3 var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





