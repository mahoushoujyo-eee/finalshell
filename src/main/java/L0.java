import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Vector;

public class L0 {
   public long E;
   public long u;
   Thread A;
   int J;
   Vector B;
   QB Q;
   public int Y;
   public int L;

   public L0(int var1) {
      boolean var10000 = zD.d();
      super();
      com.c.c(313681502140473979L).setInt(this, 0);
      boolean var2 = var10000;
      com.c.c(587987719470651652L).setInt(this, 0);
      com.c.c(208184117373149257L).setInt(this, var1);
      com.c.c(200915860947377828L).set(this, new Vector());
      int var3 = 0;

      while (true) {
         if (var3 < var1) {
            QB var4 = new QB();
            if (var2) {
               break;
            }

            if (!var2) {
               if (var3 == 0) {
                  com.c.c(304026184918353025L).set(this, var4);
               }

               ((Vector)com.c.c(200915860947377828L).get(this)).add(var4);
            }

            var3++;
            if (!var2) {
               continue;
            }
         }

         com.c.c(328888399667795027L).set(this, new tW_3(this));
         ((Thread)com.c.c(328888399667795027L).get(this)).start();
         break;
      }
   }

   public void X() {
      ((Thread)com.c.c(328888399667795027L).get(this)).interrupt();
   }

   public int S() {
      return com.c.c(313681502140473979L).getInt(this);
   }

   public void P(int var1) {
      com.c.c(313681502140473979L).setInt(this, var1);
   }

   public int a() {
      return com.c.c(587987719470651652L).getInt(this);
   }

   public void F(int var1) {
      com.c.c(587987719470651652L).setInt(this, var1);
   }

   void S$void() {
      boolean var10000 = zD.X();
      int var2 = 0;
      boolean var1 = var10000;
      int var3 = 0;
      Iterator var4 = ((Vector)com.c.c(200915860947377828L).get(this)).iterator();

      while (true) {
         if (var4.hasNext()) {
            QB var5 = (QB)var4.next();
            var2 += com.c.c(634944541091262560L).getInt(var5);
            var3 += com.c.c(291580733527856622L).getInt(var5);
            if (!var1) {
               break;
            }

            if (var1) {
               continue;
            }
         }

         com.c.c(313681502140473979L).setInt(this, (int)((float)var3 / (float)((Vector)com.c.c(200915860947377828L).get(this)).size()));
         com.c.c(587987719470651652L).setInt(this, (int)((float)var2) / ((Vector)com.c.c(200915860947377828L).get(this)).size());
         ((Vector)com.c.c(200915860947377828L).get(this)).remove(0);
         break;
      }

      QB var6 = new QB();
      com.c.c(304026184918353025L).set(this, var6);
      ((Vector)com.c.c(200915860947377828L).get(this)).add(var6);
   }

   public void T(int var1) {
      com.c.c(436456179109857455L).setLong(this, com.c.c(436456179109857455L).getLong(this) + (long)var1);
      Method var10000 = (Method)com.c.c(304026184918353025L).get(this);
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(322521174366635584L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public void N(int var1) {
      com.c.c(313231035437214097L).setLong(this, com.c.c(313231035437214097L).getLong(this) + (long)var1);
      Method var10000 = (Method)com.c.c(304026184918353025L).get(this);
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(364751476035821007L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public void v() {
   }

   public void V() {
   }

   public void c(int var1) {
   }

   public void Z(int var1) {
   }
}





