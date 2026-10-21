import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class dx_4 {
   ArrayList T;
   BH n;

   public dx_4() {
      com.c.c(620874131776678079L).set(this, new ArrayList());
   }

   public boolean B(String var1) {
      boolean var2 = false;
      return ((ArrayList)com.c.c(620874131776678079L).get(this)).contains(var1);
   }

   public int Q() {
      return ((ArrayList)com.c.c(620874131776678079L).get(this)).size();
   }

   public synchronized L1 o(L1 var1) {
      L1 var3 = null;
      String[] var10000 = FK.i();
      Iterator var4 = ((ArrayList)com.c.c(620874131776678079L).get(this)).iterator();
      String[] var2 = var10000;

      while (var4.hasNext()) {
         L1 var5 = (L1)var4.next();
         L1 var8 = var5;
         if (var2 == null) {
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(542058094445767607L);
            Object[] var10002 = var10001;
            L1 var11 = var5;
            Method var9 = var10003;

            try {
               var10000 = (String)var9.invoke(var11, var10002);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            var10002 = com.c.f();
            Method var10004 = com.c.d(542058094445767607L);
            Object[] var16 = var10002;
            L1 var15 = var1;
            Method var12 = var10004;

            try {
               var10001 = (String)var12.invoke(var15, var16);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            if (!var10000.equals(var10001)) {
               continue;
            }

            var8 = var5;
         }

         var3 = var8;
         break;
      }

      return var3;
   }

   public synchronized L1 a(String var1) {
      String[] var10000 = FK.i();
      L1 var3 = null;
      Iterator var4 = ((ArrayList)com.c.c(620874131776678079L).get(this)).iterator();
      String[] var2 = var10000;

      while (var4.hasNext()) {
         L1 var5 = (L1)var4.next();
         String var7 = var1;
         if (var2 == null) {
            if (var1 == null) {
               continue;
            }

            var7 = var1;
         }

         Object[] var10002 = com.c.f();
         Method var10004 = com.c.d(542058094445767607L);
         Object[] var10003 = var10002;
         L1 var9 = var5;
         Method var10001 = var10004;

         try {
            var8 = (String)var10001.invoke(var9, var10003);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         if (var7.equals(var8)) {
            var3 = var5;
            break;
         }
      }

      return var3;
   }

   public synchronized void h(L1 var1) {
      String[] var2;
      label87: {
         var2 = FK.i();
         L1 var10000 = var1;
         if (var2 == null) {
            if (var1 == null) {
               break label87;
            }

            Object[] var10001 = com.c.e(System.currentTimeMillis());
            Method var10003 = com.c.d(250873246822364857L);
            Object[] var10002 = var10001;
            L1 var23 = var1;
            Method var14 = var10003;

            try {
               var14.invoke(var23, var10002);
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            var10002 = com.c.f();
            Method var10004 = com.c.d(542058094445767607L);
            Object[] var44 = var10002;
            L1 var37 = var1;
            Method var24 = var10004;

            try {
               var10001 = (Object[])var24.invoke(var37, var44);
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }

            var10001 = com.c.a(var10001);
            var10003 = com.c.d(200128008404143116L);
            var10002 = var10001;
            dx_4 var27 = this;
            Method var15 = var10003;

            try {
               var10000 = (L1)var15.invoke(var27, var10002);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }
         }

         L1 var3 = var10000;
         if (var3 != null) {
            ((ArrayList)com.c.c(620874131776678079L).get(this)).remove(var3);
         }

         ((ArrayList)com.c.c(620874131776678079L).get(this)).add(0, var1);
      }

      int var13 = 0;
      Iterator var4 = ((ArrayList)com.c.c(620874131776678079L).get(this)).iterator();

      while (true) {
         if (var4.hasNext()) {
            L1 var5 = (L1)var4.next();
            Object[] var28 = com.c.a(var13);
            Method var46 = com.c.d(124068231949608152L);
            Object[] var39 = var28;
            L1 var29 = var5;
            Method var16 = var46;

            try {
               var16.invoke(var29, var39);
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }

            var13++;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         Object[] var17 = com.c.f();
         Method var18 = com.c.d(270389152141252877L);
         Object[] var41 = var17;
         Object var31 = null;

         try {
            var17 = (Object[])var18.invoke(var31, var41);
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         var31 = com.c.f();
         Method var47 = com.c.d(612604310671515822L);
         var41 = (Object[])var31;
         var31 = var17;
         Method var20 = var47;

         try {
            var17 = (Object[])var20.invoke(var31, var41);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         var31 = com.c.f();
         var47 = com.c.d(200561288808923907L);
         var41 = (Object[])var31;
         var31 = var17;
         Method var22 = var47;

         try {
            var22.invoke(var31, var41);
            break;
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }
   }

   public void C(L1 var1) {
      String[] var10000 = FK.i();
      ArrayList var10001 = (ArrayList)com.c.c(620874131776678079L).get(this);
      Object[] var10003 = com.c.a(var1);
      Method var10005 = com.c.d(152334479981629602L);
      Object[] var10004 = var10003;
      dx_4 var30 = this;
      Method var10002 = var10005;

      try {
         var24 = (L1)var10002.invoke(var30, var10004);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var10001.remove(var24);
      String[] var2 = var10000;
      if (var2 == null) {
         if ((BH)com.c.c(138244215309433315L).get(this) != null) {
            var10000 = (String[])com.c.c(138244215309433315L).get(this);
            Object[] var16 = com.c.a(var1);
            Method var31 = com.c.d(485536741057184050L);
            Object[] var25 = var16;
            Object var17 = var10000;
            Method var9 = var31;

            try {
               var9.invoke(var17, var25);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }
         }

         Object[] var10 = com.c.f();
         Method var11 = com.c.d(270389152141252877L);
         Object[] var27 = var10;
         Object var19 = null;

         try {
            var10000 = (String[])var11.invoke(var19, var27);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var19 = com.c.f();
         Method var32 = com.c.d(612604310671515822L);
         Object[] var28 = (Object[])var19;
         var19 = var10000;
         Method var13 = var32;

         try {
            var10000 = (String[])var13.invoke(var19, var28);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         var19 = com.c.f();
         Method var33 = com.c.d(200561288808923907L);
         Object[] var29 = (Object[])var19;
         var19 = var10000;
         Method var15 = var33;

         try {
            var15.invoke(var19, var29);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      }
   }

   public ArrayList V() {
      return (ArrayList)com.c.c(620874131776678079L).get(this);
   }

   public void z(ArrayList var1) {
      com.c.c(620874131776678079L).set(this, var1);
   }

   public BH z() {
      return (BH)com.c.c(138244215309433315L).get(this);
   }

   public void O(BH var1) {
      com.c.c(138244215309433315L).set(this, var1);
   }
}





