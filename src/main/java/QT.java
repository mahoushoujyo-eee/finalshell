import com._y_2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class QT implements Runnable {
   final tJ_3 R;
   private static final String a;

   QT(tJ_3 var1) {
      this.R = var1;
   }

   @Override
   public void run() {
      int[] var1 = DU.u();
      DU var10000 = (DU)com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this));
      if (var1 != null) {
         Object[] var15 = com.c.a(((JTextField)com.c.c(429952889391243847L).get(var10000)).getText());
         Method var16 = com.c.d(330094358428833085L);
         Object[] var61 = var15;
         Method var38 = null;

         try {
            var17 = (Boolean)var16.invoke(var38, var61);
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         label126:
         if (!var17) {
            String var18 = new String(
               ((JPasswordField)com.c.c(228183978052282907L).get(com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this)))).getPassword()
            );
            if (var1 != null) {
               Object[] var19 = com.c.a(var18);
               Method var20 = com.c.d(330094358428833085L);
               var61 = var19;
               var38 = null;

               try {
                  var21 = (Boolean)var20.invoke(var38, var61);
               } catch (InvocationTargetException var13) {
                  throw var13.getTargetException();
               }

               if (var21) {
                  break label126;
               }

               ((JTextField)com.c.c(429952889391243847L).get(com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this))))
                  .setText(
                     ((JTextField)com.c.c(429952889391243847L).get(com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this))))
                        .getText()
                        .toLowerCase()
                  );
               var18 = new String(
                  ((JPasswordField)com.c.c(228183978052282907L).get(com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this)))).getPassword()
               );
            }

            String var2 = var18;
            var38 = com.c.c(181350030129350521L).get(com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this)));
            var61 = com.c.f();
            Method var10004 = com.c.d(191807067392725406L);
            Object[] var10003 = var61;
            var61 = (Object[])var38;
            var38 = var10004;

            try {
               var43 = (String)var38.invoke(var61, var10003);
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }

            label135: {
               boolean var22 = var2.equals(var43);
               if (var1 != null) {
                  if (!var22) {
                     Object[] var23 = com.c.a(var2);
                     Method var24 = com.c.d(310648841563123270L);
                     var61 = var23;
                     var38 = null;

                     try {
                        var25 = (String)var24.invoke(var38, var61);
                     } catch (InvocationTargetException var10) {
                        throw var10.getTargetException();
                     }

                     String var3 = var25;
                     ((JPasswordField)com.c.c(228183978052282907L).get(com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this)))).setText(var3);
                  }

                  var10000 = (DU)com.c.c(181350030129350521L).get(com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this)));
                  Object[] var46 = com.c.a(
                     ((JTextField)com.c.c(429952889391243847L).get(com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this)))).getText()
                  );
                  Method var77 = com.c.d(562455292458332652L);
                  var61 = var46;
                  var38 = var10000;
                  Method var27 = var77;

                  try {
                     var27.invoke(var38, var61);
                  } catch (InvocationTargetException var9) {
                     throw var9.getTargetException();
                  }

                  var10000 = (DU)com.c.c(181350030129350521L).get(com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this)));
                  Object[] var48 = com.c.a(
                     new String(
                        ((JPasswordField)com.c.c(228183978052282907L).get(com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this))))
                           .getPassword()
                     )
                  );
                  Method var78 = com.c.d(583865646792521502L);
                  var61 = var48;
                  var38 = var10000;
                  Method var29 = var78;

                  try {
                     var29.invoke(var38, var61);
                  } catch (InvocationTargetException var8) {
                     throw var8.getTargetException();
                  }

                  Object[] var30 = com.c.f();
                  Method var31 = com.c.d(270389152141252877L);
                  var61 = var30;
                  var38 = null;

                  try {
                     var10000 = (DU)var31.invoke(var38, var61);
                  } catch (InvocationTargetException var7) {
                     throw var7.getTargetException();
                  }

                  Object[] var52 = com.c.f();
                  Method var79 = com.c.d(578864097947885485L);
                  var61 = var52;
                  var38 = var10000;
                  Method var33 = var79;

                  try {
                     var33.invoke(var38, var61);
                  } catch (InvocationTargetException var6) {
                     throw var6.getTargetException();
                  }

                  _y_2.b();
                  var34 = (aW)com.c.c(608857086159868835L).get(com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this)));
                  if (var1 == null) {
                     break label135;
                  }

                  var22 = var34.isVisible();
               }

               if (!var22) {
                  ((aW)com.c.c(608857086159868835L).get(com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this))))
                     .setLocationRelativeTo((DU)com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this)));
               }

               var10000 = (DU)com.c.c(608857086159868835L).get(com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this)));
               Object[] var54 = com.c.f();
               Method var80 = com.c.d(409729356224766465L);
               var61 = var54;
               var38 = var10000;
               Method var36 = var80;

               try {
                  var36.invoke(var38, var61);
               } catch (InvocationTargetException var5) {
                  throw var5.getTargetException();
               }

               var34 = (aW)com.c.c(608857086159868835L).get(com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this)));
            }

            Object[] var56 = com.c.a(true);
            Method var81 = com.c.d(269104104400495911L);
            var61 = var56;
            aW var57 = var34;
            Method var37 = var81;

            try {
               var37.invoke(var57, var61);
               return;
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }
         }

         var10000 = (DU)com.c.c(411470404885834306L).get(com.c.c(475144306283845054L).get(this));
      }

      Object[] var58 = com.c.a(a);
      Method var59 = com.c.d(517287540690064504L);
      Object[] var83 = var58;
      Object var76 = null;

      try {
         var58 = (String)var59.invoke(var76, var83);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      JOptionPane.showMessageDialog(var10000, var58);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = ".FK}>3l>Jaq:\tKNelq`\f|\u0012@\u0010J\u001c\u000b\u0013LXTv9\u0013cM\u0000QV4\u000epIDu\u007f5)N0`\u0010I\u0012\fd\u001e\u0018\u001fC6\u0011|\u001beq+5\u0018H>bFK)kSNgKr-\rc\u0012YU~\u001b\u0002\u0015G"
         .toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 20;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 20;
         var10006 = var0;
      } else {
         var6 = 20;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 20;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 110;
               break;
            case 1:
               var23 = 63;
               break;
            case 2:
               var23 = 51;
               break;
            case 3:
               var23 = 13;
               break;
            case 4:
               var23 = 76;
               break;
            case 5:
               var23 = 79;
               break;
            default:
               var23 = 49;
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





