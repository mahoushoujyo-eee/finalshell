package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.AW;
import com.finalshell.ui.dialog.DU;
import com.finalshell.ui.listener.TJ3;
import com.finalshell.ui.panel.ConnectionProperty;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class QT implements Runnable {
   final TJ3 R;
   public static String a;

   QT(TJ3 var1) {
      this.R = var1;
   }

   @Override
   public void run() {
      int[] var1 = DU.u();
      Object var4 = 475144306283845054L;
      Ref.g(475144306283845054L, var4);
      Object var6 = 411470404885834306L;
      DU var10002 = (DU)Ref.g(411470404885834306L, var6);
      if (var1 != null) {
         Object var8 = 429952889391243847L;
         Registry.packArgs(((JTextField)Ref.g(429952889391243847L, var8)).getText());
         long var10 = 330094358428833085L;
         Object var10004 = Ref.h2(330094358428833085L, var10);

         try {
            var134 = (Boolean)var10004;
         } catch (InvocationTargetException var133) {
            throw var133.getTargetException();
         }

         label121:
         if (!var134) {
            Object var12 = 475144306283845054L;
            Object var10007 = Ref.g(475144306283845054L, var12);
            Object var14 = 411470404885834306L;
            Object var10008 = Ref.g(411470404885834306L, var14);
            Object var16 = 228183978052282907L;
new String(((JPasswordField)Ref.g(228183978052282907L, var16)).getPassword());
            if (var1 != null) {
               var10007 = Registry.packArgs(var10007);
               long var18 = 330094358428833085L;
               var10008 = Ref.h2(330094358428833085L, var18);

               try {
                  var138 = (Boolean)var10008;
               } catch (InvocationTargetException var132) {
                  throw var132.getTargetException();
               }

               if (var138) {
                  break label121;
               }

               Object var26 = 475144306283845054L;
               Ref.g(475144306283845054L, var26);
               Object var28 = 411470404885834306L;
               Ref.g(411470404885834306L, var28);
               Object var30 = 429952889391243847L;
               JTextField var10011 = (JTextField)Ref.g(429952889391243847L, var30);
               Object var32 = 475144306283845054L;
               Ref.g(475144306283845054L, var32);
               Object var34 = 411470404885834306L;
               Object var10014 = Ref.g(411470404885834306L, var34);
               Object var36 = 429952889391243847L;
               var10014.setText(((JTextField)Ref.g(429952889391243847L, var36)).getText().toLowerCase());
               Object var38 = 475144306283845054L;
               Ref.g(475144306283845054L, var38);
               Object var40 = 411470404885834306L;
               Object var10018 = Ref.g(411470404885834306L, var40);
               Object var42 = 228183978052282907L;
new String(((JPasswordField)Ref.g(228183978052282907L, var42)).getPassword());
            }

            Object var2 = var10007;
            Object var44 = 475144306283845054L;
            Ref.g(475144306283845054L, var44);
            Object var46 = 411470404885834306L;
            Ref.g(411470404885834306L, var46);
            Object var48 = 181350030129350521L;
            Object var139 = Ref.g(181350030129350521L, var48);
            String var10012 = (String)(Registry.emptyArgs());
            long var51 = 191807067392725406L;
            Object[] var50 = var10012;
            var10012 = Ref.h(191807067392725406L, var50, var51);

            try {
               var10012 = (String)var10012;
            } catch (InvocationTargetException var130) {
               throw var130.getTargetException();
            }

            label130: {
               QT var140 = var139.equals(var10012);
               if (var1 != null) {
                  if (var140 == false) {
                     Registry.packArgs(var2);
                     long var52 = 310648841563123270L;
                     var10012 = Ref.h2(310648841563123270L, var52);

                     try {
                        var10012 = (String)var10012;
                     } catch (InvocationTargetException var129) {
                        throw var129.getTargetException();
                     }

                     String var3 = var10012;
                     Object var54 = 475144306283845054L;
                     Ref.g(475144306283845054L, var54);
                     Object var56 = 411470404885834306L;
                     Ref.g(411470404885834306L, var56);
                     Object var58 = 228183978052282907L;
                     ((JPasswordField)Ref.g(228183978052282907L, var58)).setText(var3);
                  }

                  var140 = this;
                  Object var60 = 475144306283845054L;
                  Ref.g(475144306283845054L, var60);
                  Object var62 = 411470404885834306L;
                  Ref.g(411470404885834306L, var62);
                  Object var64 = 181350030129350521L;
                  Ref.g(181350030129350521L, var64);
                  Object var66 = 475144306283845054L;
                  Ref.g(475144306283845054L, var66);
                  Object var68 = 411470404885834306L;
                  Ref.g(411470404885834306L, var68);
                  Object var70 = 429952889391243847L;
                  Object[] var146 = Registry.packArgs(((JTextField)Ref.g(429952889391243847L, var70)).getText());
                  long var73 = 562455292458332652L;
                  Object[] var72 = var146;
                  Ref.h(562455292458332652L, var72, var73);

                  try {
                     ;
                  } catch (InvocationTargetException var128) {
                     throw var128.getTargetException();
                  }

                  Object var74 = 475144306283845054L;
                  Ref.g(475144306283845054L, var74);
                  Object var76 = 411470404885834306L;
                  Ref.g(411470404885834306L, var76);
                  Object var78 = 181350030129350521L;
                  Ref.g(181350030129350521L, var78);
                  Object var80 = 475144306283845054L;
                  Object var10025 = Ref.g(475144306283845054L, var80);
                  Object var82 = 411470404885834306L;
                  Object var10026 = Ref.g(411470404885834306L, var82);
                  Object var84 = 228183978052282907L;
new String(((JPasswordField)Ref.g(228183978052282907L, var84)).getPassword());
                  var10025 = Registry.packArgs(var10025);
                  long var87 = 583865646792521502L;
                  Object[] var86 = (Object[])var10025;
                  Ref.h(583865646792521502L, var86, var87);

                  try {
                     ;
                  } catch (InvocationTargetException var127) {
                     throw var127.getTargetException();
                  }

                  Registry.emptyArgs();
                  long var88 = 270389152141252877L;
                  Ref.h2(270389152141252877L, var88);
                  Object[] var10027 = Registry.emptyArgs();
                  long var91 = 578864097947885485L;
                  Object[] var90 = var10027;
                  Ref.h(578864097947885485L, var90, var91);

                  try {
                     ;
                  } catch (InvocationTargetException var126) {
                     throw var126.getTargetException();
                  }

                  ConnectionProperty.b$void();
                  Object var92 = 475144306283845054L;
                  Ref.g(475144306283845054L, var92);
                  Object var94 = 411470404885834306L;
                  Ref.g(411470404885834306L, var94);
                  Object var96 = 608857086159868835L;
                  AW var10030 = (AW)Ref.g(608857086159868835L, var96);
                  if (var1 == null) {
                     break label130;
                  }

                  var10030.isVisible();
               }

               if (var140 == false) {
                  Object var98 = 475144306283845054L;
                  Ref.g(475144306283845054L, var98);
                  Object var100 = 411470404885834306L;
                  Ref.g(411470404885834306L, var100);
                  Object var102 = 608857086159868835L;
                  AW var145 = (AW)Ref.g(608857086159868835L, var102);
                  Object var104 = 475144306283845054L;
                  Object var10016 = Ref.g(475144306283845054L, var104);
                  Object var106 = 411470404885834306L;
                  ((AW)var10016).setLocationRelativeTo((DU)Ref.g(411470404885834306L, var106));
               }

               Object var108 = 475144306283845054L;
               Ref.g(475144306283845054L, var108);
               Object var110 = 411470404885834306L;
               Ref.g(411470404885834306L, var110);
               Object var112 = 608857086159868835L;
               Ref.g(608857086159868835L, var112);
               Object[] var10015 = Registry.emptyArgs();
               long var115 = 409729356224766465L;
               Object[] var114 = var10015;
               Ref.h(409729356224766465L, var114, var115);

               try {
                  ;
               } catch (InvocationTargetException var125) {
                  throw var125.getTargetException();
               }

               Object var116 = 475144306283845054L;
               Ref.g(475144306283845054L, var116);
               Object var118 = 411470404885834306L;
               Ref.g(411470404885834306L, var118);
               Object var120 = 608857086159868835L;
               AW var147 = (AW)Ref.g(608857086159868835L, var120);
            }

            Object[] var10019 = Registry.packArgs(true);
            long var123 = 269104104400495911L;
            Object[] var122 = var10019;
            Ref.h(269104104400495911L, var122, var123);

            try {
               return;
            } catch (InvocationTargetException var124) {
               throw var124.getTargetException();
            }
         }

         Object var20 = 475144306283845054L;
         Ref.g(475144306283845054L, var20);
         Object var22 = 411470404885834306L;
         DU var10006 = (DU)Ref.g(411470404885834306L, var22);
      }

      Object[] var10003 = Registry.packArgs(a);
      long var24 = 517287540690064504L;
      Object var135 = Ref.h2(517287540690064504L, var24);

      try {
         var135 = (String)var135;
      } catch (InvocationTargetException var131) {
         throw var131.getTargetException();
      }

      JOptionPane.showMessageDialog(var10003, var135);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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





