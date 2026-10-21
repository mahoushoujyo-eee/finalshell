import com.ne_4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JFileChooser;

class dN_3 implements ActionListener {
   final KO S;
   private static final String a;

   dN_3(KO var1) {
      this.S = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var10000 = Y_.j();
      Object[] var10001 = com.c.f();
      Method var31 = com.c.d(270389152141252877L);
      Object[] var58 = var10001;
      Object var47 = null;

      try {
         var10001 = (Object[])var31.invoke(var47, var58);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      var47 = com.c.f();
      Method var10004 = com.c.d(306266403902896148L);
      var58 = (Object[])var47;
      var47 = var10001;
      Method var33 = var10004;

      try {
         var10001 = (u6_2)var33.invoke(var47, var58);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      u6_2 var3 = var10001;
      String[] var2 = var10000;
      var10001 = com.c.f();
      Method var60 = com.c.d(499444795808443762L);
      var47 = var10001;
      u6_2 var36 = var3;
      Method var17 = var60;

      try {
         var10000 = (String)var17.invoke(var36, (Object[])var47);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      String var4;
      label95: {
         label90: {
            var4 = var10000;
            String var19 = var4;
            if (var2 != null) {
               Object[] var20 = com.c.a(var4);
               Method var21 = com.c.d(330094358428833085L);
               var47 = var20;
               var10001 = null;

               try {
                  var22 = (Boolean)var21.invoke(var10001, (Object[])var47);
               } catch (InvocationTargetException var12) {
                  throw var12.getTargetException();
               }

               if (!var22) {
                  break label90;
               }

               var19 = (String)com.c.c(149082991182987426L).get(null);
            }

            var4 = var19;
            if (var2 != null) {
               break label95;
            }
         }

         File var5 = new File(var4);
         String var23 = var5.getParent();
         if (var2 != null) {
            if (var23 == null) {
               break label95;
            }

            var23 = var5.getParent();
         }

         var4 = var23;
      }

      JFileChooser var16 = new JFileChooser(var4);
      var16.setDialogTitle(a);
      var16.setFileSelectionMode(0);
      var16.setMultiSelectionEnabled(false);
      int var6 = var16.showOpenDialog((KO)com.c.c(586331377038781344L).get(this));
      if (var6 == 0) {
         File var7 = var16.getSelectedFile();
         var10001 = com.c.a(var7.getAbsolutePath());
         Method var61 = com.c.d(279878592174441822L);
         var47 = var10001;
         u6_2 var40 = var3;
         Method var24 = var61;

         try {
            var24.invoke(var40, (Object[])var47);
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         ((ne_4)com.c.c(305865902009348731L).get(com.c.c(586331377038781344L).get(this))).setText(var7.getAbsolutePath());
         var10000 = (String[])com.c.c(586331377038781344L).get(this);
         var10001 = com.c.a(false);
         Method var62 = com.c.d(379642641301702996L);
         var47 = var10001;
         var10001 = var10000;
         Method var26 = var62;

         try {
            var26.invoke(var10001, (Object[])var47);
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         Object[] var27 = com.c.f();
         Method var28 = com.c.d(270389152141252877L);
         var47 = var27;
         var10001 = null;

         try {
            var10000 = (String[])var28.invoke(var10001, (Object[])var47);
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         var10001 = com.c.f();
         Method var63 = com.c.d(578864097947885485L);
         var47 = var10001;
         var10001 = var10000;
         Method var30 = var63;

         try {
            var30.invoke(var10001, (Object[])var47);
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "逑拪秅铆旀享".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 103;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 103;
         var10006 = var0;
      } else {
         var6 = 103;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 103;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 127;
               break;
            case 1:
               var23 = 100;
               break;
            case 2:
               var23 = 99;
               break;
            case 3:
               var23 = 4;
               break;
            case 4:
               var23 = 32;
               break;
            case 5:
               var23 = 58;
               break;
            default:
               var23 = 44;
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





