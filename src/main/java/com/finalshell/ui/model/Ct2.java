package com.finalshell.ui.model;

import com.finalshell.core.Y62_2;
import com.finalshell.core.YA3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class Ct2 implements Comparator {
   final Comparator G;
   final O8 v;
   final Om2 D;
   String W;
   final String C;
   final Y62_2 L;

   Ct2(Y62_2 var1, String var2) {
      this.L = var1;
      this.C = var2;
      this.G = Collator.getInstance(Locale.CHINA);
      this.v = new O8();
      this.D = new Om2();
      Object var3 = 343523684098393531L;
      Object var10002 = Ref.g(343523684098393531L, var3);
      long var6 = 322807311559053454L;
      Object var5 = var10002;
      Ref.s(322807311559053454L, var5, var6);
   }

   public int H(YA3_2 var1, YA3_2 var2) {
      String[] var3 = Y62_2.Z();
      Object var4 = 322807311559053454L;
      Ct2 var10001 = ((String)Ref.g(322807311559053454L, var4)).equals((String)Registry.lookupField(537427811193673915L).get(null));
      if (var3 != null) {
         if (var10001 != false) {
            Object var6 = 322467945652486988L;
            Comparator var10002 = (Comparator)Ref.g(322467945652486988L, var6);
            String var61 = (String)(Registry.emptyArgs());
            long var9 = 593117720967762508L;
            Object[] var8 = var61;
            var61 = Ref.h(593117720967762508L, var8, var9);

            try {
               var61 = (String)var61;
            } catch (InvocationTargetException var43) {
               throw var43.getTargetException();
            }

            String var77 = (String)(Registry.emptyArgs());
            long var11 = 593117720967762508L;
            Object[] var10 = var77;
            var77 = Ref.h(593117720967762508L, var10, var11);

            try {
               var77 = (String)var77;
            } catch (InvocationTargetException var42) {
               throw var42.getTargetException();
            }

            return var61.compare(var2, var77);
         }

         var10001 = this;
         Object var12 = 322807311559053454L;
         ((String)Ref.g(322807311559053454L, var12)).equals((String)Registry.lookupField(217711252181986658L).get(null));
      }

      if (var3 != null) {
         if (var10001 != false) {
            Object var14 = 576645009835838970L;
            Ref.g(576645009835838970L, var14);
            Object[] var58 = Registry.emptyArgs();
            long var17 = 567652193651101967L;
            Object[] var16 = var58;
            var58 = Ref.h(567652193651101967L, var16, var17);

            try {
               var60 = (Integer)var58;
            } catch (InvocationTargetException var46) {
               throw var46.getTargetException();
            }

            Integer.valueOf(var60);
            Object[] var74 = Registry.emptyArgs();
            long var19 = 567652193651101967L;
            Object[] var18 = var74;
            var74 = Ref.h(567652193651101967L, var18, var19);

            try {
               var76 = (Integer)var74;
            } catch (InvocationTargetException var45) {
               throw var45.getTargetException();
            }

            Object[] var67 = Registry.packArgs(var2, Integer.valueOf(var76));
            long var21 = 227703286706087580L;
            Object[] var20 = var67;
            var67 = Ref.h(227703286706087580L, var20, var21);

            try {
               return (Integer)var67;
            } catch (InvocationTargetException var44) {
               throw var44.getTargetException();
            }
         }

         var10001 = this;
         Object var22 = 322807311559053454L;
         ((String)Ref.g(322807311559053454L, var22)).equals((String)Registry.lookupField(635079983588403018L).get(null));
      }

      if (var3 != null) {
         if (var10001 != false) {
            Object var24 = 595339177194496352L;
            Ref.g(595339177194496352L, var24);
            Object[] var55 = Registry.emptyArgs();
            long var27 = 622646466192314176L;
            Object[] var26 = var55;
            var55 = Ref.h(622646466192314176L, var26, var27);

            try {
               var57 = (Long)var55;
            } catch (InvocationTargetException var49) {
               throw var49.getTargetException();
            }

            Long.valueOf(var57);
            Object[] var71 = Registry.emptyArgs();
            long var29 = 622646466192314176L;
            Object[] var28 = var71;
            var71 = Ref.h(622646466192314176L, var28, var29);

            try {
               var73 = (Long)var71;
            } catch (InvocationTargetException var48) {
               throw var48.getTargetException();
            }

            Object[] var65 = Registry.packArgs(var2, Long.valueOf(var73));
            long var31 = 262915954633911742L;
            Object[] var30 = var65;
            var65 = Ref.h(262915954633911742L, var30, var31);

            try {
               return (Integer)var65;
            } catch (InvocationTargetException var47) {
               throw var47.getTargetException();
            }
         }

         var10001 = this;
         Object var32 = 322807311559053454L;
         ((String)Ref.g(322807311559053454L, var32)).equals((String)Registry.lookupField(156537853841081209L).get(null));
      }

      if (var3 != null) {
         if (var10001 != false) {
            Object var34 = 595339177194496352L;
            Ref.g(595339177194496352L, var34);
            Object[] var10004 = Registry.emptyArgs();
            long var37 = 620345507679359767L;
            Object[] var36 = var10004;
            var10004 = Ref.h(620345507679359767L, var36, var37);

            try {
               var54 = (Long)var10004;
            } catch (InvocationTargetException var52) {
               throw var52.getTargetException();
            }

            Long.valueOf(var54);
            Object[] var10006 = Registry.emptyArgs();
            long var39 = 620345507679359767L;
            Object[] var38 = var10006;
            var10006 = Ref.h(620345507679359767L, var38, var39);

            try {
               var70 = (Long)var10006;
            } catch (InvocationTargetException var51) {
               throw var51.getTargetException();
            }

            Object[] var10005 = Registry.packArgs(var2, Long.valueOf(var70));
            long var41 = 262915954633911742L;
            Object[] var40 = var10005;
            var10005 = Ref.h(262915954633911742L, var40, var41);

            try {
               return (Integer)var10005;
            } catch (InvocationTargetException var50) {
               throw var50.getTargetException();
            }
         }

         var10001 = true;
      }

      return (int)var10001;
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = Registry.packArgs((YA3_2)var1, (YA3_2)var2);
      long var4 = 147012843948399118L;
      Object[] var3 = var10001;
      var10001 = Ref.h(147012843948399118L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





