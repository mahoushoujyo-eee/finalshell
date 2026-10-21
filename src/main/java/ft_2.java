import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Ft_2 implements ActionListener {
   final JTextField m;
   final JPanel w;
   final boolean O;
   final yB_3 L;
   final t3_2 C;
   final k0_2 Y;
   private static final String a;

   Ft_2(k0_2 var1, JTextField var2, JPanel var3, boolean var4, yB_3 var5, t3_2 var6) {
      this.Y = var1;
      this.m = var2;
      this.w = var3;
      this.O = var4;
      this.L = var5;
      this.C = var6;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var10000 = yB_3.Y();
      String var3 = ((JTextField)com.c.c(346664127253186856L).get(this)).getText().trim();
      int[] var2 = var10000;
      Object[] var10 = com.c.a(var3);
      Method var11 = com.c.d(330094358428833085L);
      Object[] var35 = var10;
      Object var24 = null;

      try {
         var12 = (Boolean)var11.invoke(var24, var35);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      label74: {
         label75: {
            if (var2 == null) {
               if (var12) {
                  JOptionPane.showMessageDialog((JPanel)com.c.c(342054005342952875L).get(this), a);
                  return;
               }

               var13 = this;
               if (var2 != null) {
                  break label75;
               }

               var12 = com.c.c(215323650323848767L).getBoolean(this);
            }

            if (var12) {
               var10000 = (int[])com.c.c(290056859033489534L).get(this);
               var24 = com.c.a(com.c.c(609652041151518912L).get(this), com.c.c(147921783444629588L).get(com.c.c(555729720984516794L).get(this)), var3);
               Method var10003 = com.c.d(378286834384421181L);
               var35 = (Object[])var24;
               var24 = var10000;
               Method var15 = var10003;

               try {
                  var15.invoke(var24, var35);
               } catch (InvocationTargetException var8) {
                  throw var8.getTargetException();
               }

               if (var2 == null) {
                  break label74;
               }
            }

            var13 = this;
         }

         var10000 = (int[])com.c.c(290056859033489534L).get(var13);
         var24 = com.c.a(var3);
         Method var42 = com.c.d(563615782501425138L);
         var35 = (Object[])var24;
         var24 = var10000;
         Method var17 = var42;

         try {
            var17.invoke(var24, var35);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }
      }

      ((k0_2)com.c.c(555729720984516794L).get(this)).setVisible(false);
      Object[] var18 = com.c.f();
      Method var19 = com.c.d(270389152141252877L);
      var35 = var18;
      var24 = null;

      try {
         var10000 = (int[])var19.invoke(var24, var35);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var24 = com.c.f();
      Method var43 = com.c.d(612604310671515822L);
      var35 = (Object[])var24;
      var24 = var10000;
      Method var21 = var43;

      try {
         var10000 = (int[])var21.invoke(var24, var35);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var24 = com.c.f();
      var43 = com.c.d(200561288808923907L);
      var35 = (Object[])var24;
      var24 = var10000;
      Method var23 = var43;

      try {
         var23.invoke(var24, var35);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "词迋兺斮介她呬秊".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 124;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 124;
         var10006 = var0;
      } else {
         var6 = 124;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 124;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 70;
               break;
            case 1:
               var23 = 36;
               break;
            case 2:
               var23 = 99;
               break;
            case 3:
               var23 = 85;
               break;
            case 4:
               var23 = 65;
               break;
            case 5:
               var23 = 60;
               break;
            default:
               var23 = 29;
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





