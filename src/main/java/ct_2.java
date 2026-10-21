import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

class Ct_2 implements Comparator {
   final Comparator G;
   final O8 v;
   final Om_2 D;
   String W;
   final String C;
   final y6_2 L;

   Ct_2(y6_2 var1, String var2) {
      this.L = var1;
      this.C = var2;
      this.G = Collator.getInstance(Locale.CHINA);
      this.v = new O8();
      this.D = new Om_2();
      com.c.c(322807311559053454L).set(this, com.c.c(343523684098393531L).get(this));
   }

   public int H(yA_3 var1, yA_3 var2) {
      String[] var3 = y6_2.Z();
      byte var10000 = ((String)com.c.c(322807311559053454L).get(this)).equals((String)com.c.c(537427811193673915L).get(null));
      if (var3 != null) {
         if (var10000 != 0) {
            Comparator var21 = (Comparator)com.c.c(322467945652486988L).get(this);
            Object[] var52 = com.c.f();
            Method var75 = com.c.d(593117720967762508L);
            Object[] var67 = var52;
            yA_3 var53 = var1;
            Method var36 = var75;

            try {
               var37 = (String)var36.invoke(var53, var67);
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }

            var67 = com.c.f();
            Method var79 = com.c.d(593117720967762508L);
            Object[] var76 = var67;
            yA_3 var69 = var2;
            Method var54 = var79;

            try {
               var52 = (String)var54.invoke(var69, var76);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }

            return var21.compare(var37, var52);
         }

         var10000 = ((String)com.c.c(322807311559053454L).get(this)).equals((String)com.c.c(217711252181986658L).get(null));
      }

      if (var3 != null) {
         if (var10000 != 0) {
            Object var19 = com.c.c(576645009835838970L).get(this);
            Object[] var47 = com.c.f();
            Method var73 = com.c.d(567652193651101967L);
            Object[] var63 = var47;
            yA_3 var48 = var1;
            Method var31 = var73;

            try {
               var32 = (Integer)var31.invoke(var48, var63);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            Integer var33 = var32;
            var63 = com.c.f();
            Method var78 = com.c.d(567652193651101967L);
            Object[] var74 = var63;
            yA_3 var65 = var2;
            Method var49 = var78;

            try {
               var50 = (Integer)var49.invoke(var65, var74);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            Object[] var34 = com.c.a(var33, Integer.valueOf(var50));
            Method var66 = com.c.d(227703286706087580L);
            var47 = var34;
            var31 = (Method)var19;
            Method var20 = var66;

            try {
               return (Integer)var20.invoke(var31, var47);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }
         }

         var10000 = ((String)com.c.c(322807311559053454L).get(this)).equals((String)com.c.c(635079983588403018L).get(null));
      }

      if (var3 != null) {
         if (var10000 != 0) {
            Object var17 = com.c.c(595339177194496352L).get(this);
            Object[] var42 = com.c.f();
            Method var71 = com.c.d(622646466192314176L);
            Object[] var59 = var42;
            yA_3 var43 = var1;
            Method var26 = var71;

            try {
               var27 = (Long)var26.invoke(var43, var59);
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }

            Long var28 = var27;
            var59 = com.c.f();
            Method var77 = com.c.d(622646466192314176L);
            Object[] var72 = var59;
            yA_3 var61 = var2;
            Method var44 = var77;

            try {
               var45 = (Long)var44.invoke(var61, var72);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            Object[] var29 = com.c.a(var28, Long.valueOf(var45));
            Method var62 = com.c.d(262915954633911742L);
            var42 = var29;
            var26 = (Method)var17;
            Method var18 = var62;

            try {
               return (Integer)var18.invoke(var26, var42);
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }
         }

         var10000 = ((String)com.c.c(322807311559053454L).get(this)).equals((String)com.c.c(156537853841081209L).get(null));
      }

      if (var3 != null) {
         if (var10000 != 0) {
            Object var15 = com.c.c(595339177194496352L).get(this);
            Object[] var10002 = com.c.f();
            Method var10004 = com.c.d(620345507679359767L);
            Object[] var10003 = var10002;
            yA_3 var38 = var1;
            Method var10001 = var10004;

            try {
               var22 = (Long)var10001.invoke(var38, var10003);
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            Long var23 = var22;
            var10003 = com.c.f();
            Method var10005 = com.c.d(620345507679359767L);
            Object[] var70 = var10003;
            yA_3 var57 = var2;
            Method var39 = var10005;

            try {
               var40 = (Long)var39.invoke(var57, var70);
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            Object[] var24 = com.c.a(var23, Long.valueOf(var40));
            Method var58 = com.c.d(262915954633911742L);
            var10002 = var24;
            var10001 = (Method)var15;
            Method var16 = var58;

            try {
               return (Integer)var16.invoke(var10001, var10002);
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }
         }

         var10000 = 1;
      }

      return var10000;
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = com.c.a((yA_3)var1, (yA_3)var2);
      Method var10003 = com.c.d(147012843948399118L);
      Object[] var10002 = var10001;
      Ct_2 var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





