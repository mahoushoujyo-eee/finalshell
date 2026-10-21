import com._C;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class lP_3 implements ActionListener {
   final C5 v;
   final Jx_2 d;
   private static final String a;

   lP_3(Jx_2 var1, C5 var2) {
      this.d = var1;
      this.v = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object[] var10000 = com.c.f();
      Method var22 = com.c.d(270389152141252877L);
      Object[] var74 = var10000;
      Method var48 = null;

      try {
         var10000 = (Object[])var22.invoke(var48, var74);
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      var48 = com.c.f();
      Method var10003 = com.c.d(634817973682994708L);
      var74 = (Object[])var48;
      var48 = var10000;
      Method var24 = var10003;

      try {
         var10000 = (Object[])var24.invoke(var48, var74);
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      var48 = com.c.f();
      var10003 = com.c.d(240567170779145617L);
      var74 = (Object[])var48;
      var48 = var10000;
      Method var26 = var10003;

      try {
         var10000 = (Object[])var26.invoke(var48, var74);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      var48 = com.c.f();
      var10003 = com.c.d(226341449505323490L);
      var74 = (Object[])var48;
      var48 = var10000;
      Method var28 = var10003;

      try {
         var10000 = (U)var28.invoke(var48, var74);
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      U var3 = var10000;
      int[] var30 = Jx_2.O();
      var48 = com.c.c(269586463206323716L).get(com.c.c(248768231919336173L).get(this));
      var74 = com.c.f();
      Method var10004 = com.c.d(248904686894997647L);
      Object[] var90 = var74;
      var74 = (Object[])var48;
      var48 = var10004;

      try {
         var57 = (String)var48.invoke(var74, var90);
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      String var4 = var57;
      int[] var2 = var30;
      var10000 = (Object[])com.c.c(248768231919336173L).get(this);
      Object[] var58 = com.c.a(var4, var3);
      var10003 = com.c.d(596842460043417062L);
      var74 = var58;
      var48 = var10000;
      Method var32 = var10003;

      try {
         var10000 = (YB)var32.invoke(var48, var74);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      YB var5 = var10000;
      Object[] var60 = com.c.f();
      var10003 = com.c.d(418327897845479655L);
      var74 = var60;
      YB var61 = var5;
      Method var34 = var10003;

      try {
         var35 = (Integer)var34.invoke(var61, var74);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      int var6 = var35;
      if (var2 == null) {
         if (var6 == com.c.c(564170828581134815L).getInt(null)) {
            Object[] var62 = com.c.f();
            var10003 = com.c.d(191095475795927576L);
            var74 = var62;
            YB var63 = var5;
            Method var36 = var10003;

            try {
               var10000 = (String)var36.invoke(var63, var74);
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            String var7 = var10000;
            ((_C)com.c.c(435031631667149019L).get(com.c.c(248768231919336173L).get(this))).setText(a + new File(var7).getAbsolutePath());
            ((_C)com.c.c(435031631667149019L).get(com.c.c(248768231919336173L).get(this))).setToolTipText(var7);
            var10000 = (Object[])com.c.c(269586463206323716L).get(com.c.c(248768231919336173L).get(this));
            Object[] var64 = com.c.a(var7);
            var10003 = com.c.d(565172623409340742L);
            var74 = var64;
            var48 = var10000;
            Method var39 = var10003;

            try {
               var39.invoke(var48, var74);
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            var10000 = (Object[])com.c.c(269586463206323716L).get(com.c.c(248768231919336173L).get(this));
            Object[] var66 = com.c.f();
            var10003 = com.c.d(380488306238748207L);
            var74 = var66;
            var48 = var10000;
            Method var41 = var10003;

            try {
               var10000 = (fX_3)var41.invoke(var48, var74);
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            fX_3 var8 = var10000;
            Object[] var68 = com.c.a(var7);
            var10003 = com.c.d(586754005152705687L);
            var74 = var68;
            fX_3 var69 = var8;
            Method var43 = var10003;

            try {
               var43.invoke(var69, var74);
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }

            var10000 = (Object[])com.c.c(248768231919336173L).get(this);
            Object[] var70 = com.c.f();
            var10003 = com.c.d(528723233100399280L);
            var74 = var70;
            var48 = var10000;
            Method var45 = var10003;

            try {
               var45.invoke(var48, var74);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }
         }

         var10000 = (Object[])com.c.c(248768231919336173L).get(this);
         Object[] var72 = com.c.a(com.c.c(435031631667149019L).get(com.c.c(248768231919336173L).get(this)));
         var10003 = com.c.d(342946178954715412L);
         var74 = var72;
         var48 = var10000;
         Method var47 = var10003;

         try {
            var47.invoke(var48, var74);
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         ((C5)com.c.c(549809328982242375L).get(this)).setVisible(true);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "乤轗\u001f8".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 95;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 95;
         var10006 = var0;
      } else {
         var6 = 95;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 95;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 48;
               break;
            case 1:
               var23 = 117;
               break;
            case 2:
               var23 = 122;
               break;
            case 3:
               var23 = 71;
               break;
            case 4:
               var23 = 23;
               break;
            case 5:
               var23 = 48;
               break;
            default:
               var23 = 32;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





