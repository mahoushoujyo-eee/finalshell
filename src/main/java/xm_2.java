import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Collator;
import java.util.Comparator;

class xm_2 implements Comparator {
   final Collator m;
   final zD i;

   xm_2(zD var1, Collator var2) {
      this.i = var1;
      this.m = var2;
   }

   public int Z(ck_4 var1, ck_4 var2) {
      Collator var10000 = (Collator)com.c.c(597087467921843404L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(396085629172753019L);
      Object[] var10003 = var10002;
      ck_4 var6 = var1;
      Method var10001 = var10004;

      try {
         var5 = (String)var10001.invoke(var6, var10003);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10003 = com.c.f();
      Method var10005 = com.c.d(396085629172753019L);
      Object[] var11 = var10003;
      ck_4 var10 = var2;
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
      Object[] var10001 = com.c.a((ck_4)var1, (ck_4)var2);
      Method var10003 = com.c.d(431151734525113829L);
      Object[] var10002 = var10001;
      xm_2 var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





