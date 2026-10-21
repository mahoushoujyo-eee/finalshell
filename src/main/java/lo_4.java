import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class lo_4 implements Q0 {
   final org.icmp4j.j m;
   final L9 I;
   final dw_4 p;

   lo_4(dw_4 var1, org.icmp4j.j var2, L9 var3) {
      this.p = var1;
      this.m = var2;
      this.I = var3;
   }

   @Override
   public void a(B0 var1) {
      L9 var14;
      org.icmp4j.j var3 = var1.w();
      ((org.icmp4j.j)com.c.c(501251444652304240L).get(this)).i(System.currentTimeMillis());
      ((org.icmp4j.j)com.c.c(501251444652304240L).get(this))
         .w((int)(((org.icmp4j.j)com.c.c(501251444652304240L).get(this)).q() - ((org.icmp4j.j)com.c.c(501251444652304240L).get(this)).R()));
      ((org.icmp4j.j)com.c.c(501251444652304240L).get(this)).S(var3.A());
      int[] var10000 = L9.X();
      ((org.icmp4j.j)com.c.c(501251444652304240L).get(this)).w(var3.r());
      int[] var2 = var10000;
      ((org.icmp4j.j)com.c.c(501251444652304240L).get(this)).v(true);
      var14 = (L9)com.c.c(308347012586041365L).get(this);
      label87:
      if (var2 == null) {
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(564648154927582737L);
         Object[] var10002 = var10001;
         L9 var32 = var14;
         Method var15 = var10003;

         try {
            var16 = (String)var15.invoke(var32, var10002);
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         if (var16 != null) {
            var14 = (L9)com.c.c(308347012586041365L).get(this);
            if (var2 != null) {
               break label87;
            }

            var10001 = com.c.f();
            var10003 = com.c.d(564648154927582737L);
            var10002 = var10001;
            L9 var34 = var14;
            Method var17 = var10003;

            try {
               var18 = (String)var17.invoke(var34, var10002);
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            if (!var18.equals(((org.icmp4j.j)com.c.c(501251444652304240L).get(this)).A())) {
               Object[] var19 = com.c.a(com.c.c(308347012586041365L).get(this), com.c.c(487072334706875582L).get(com.c.c(203134008647668925L).get(this)));
               Method var20 = com.c.d(268398290601759208L);
               var10002 = var19;
               var10001 = null;

               try {
                  var20.invoke(var10001, var10002);
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }
            }
         }

         var14 = (L9)com.c.c(308347012586041365L).get(this);
         var10001 = com.c.a(((org.icmp4j.j)com.c.c(501251444652304240L).get(this)).A());
         var10003 = com.c.d(475741620269029750L);
         var10002 = var10001;
         var10001 = var14;
         Method var22 = var10003;

         try {
            var22.invoke(var10001, var10002);
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         var14 = (L9)com.c.c(203134008647668925L).get(this);
         var10001 = com.c.f();
         var10003 = com.c.d(123204579573800400L);
         var10002 = var10001;
         var10001 = var14;
         Method var24 = var10003;

         try {
            var24.invoke(var10001, var10002);
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         var14 = (L9)com.c.c(308347012586041365L).get(this);
      }

      Object[] var41 = com.c.f();
      Method var62 = com.c.d(219753915081057422L);
      Object[] var54 = var41;
      L9 var42 = var14;
      Method var25 = var62;

      try {
         var26 = (KV)var25.invoke(var42, var54);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      KV var4 = var26;
      var41 = com.c.a(com.c.c(501251444652304240L).get(this));
      var62 = com.c.d(608917329576578057L);
      var54 = var41;
      KV var44 = var4;
      Method var27 = var62;

      try {
         var27.invoke(var44, var54);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var14 = (L9)com.c.c(487072334706875582L).get(com.c.c(203134008647668925L).get(this));
      var41 = com.c.a(com.c.c(308347012586041365L).get(this));
      var62 = com.c.d(137222181119797019L);
      var54 = var41;
      var41 = var14;
      Method var29 = var62;

      try {
         var29.invoke(var41, var54);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      Object[] var30 = com.c.a(com.c.c(308347012586041365L).get(this), com.c.c(487072334706875582L).get(com.c.c(203134008647668925L).get(this)));
      Method var31 = com.c.d(146445297662860567L);
      var54 = var30;
      var41 = null;

      try {
         var31.invoke(var41, var54);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





