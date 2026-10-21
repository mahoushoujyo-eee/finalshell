package com.finalshell.ui.listener;

import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.RenameFolderDialog;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ft2 implements ActionListener {
   public final JTextField m;
   public final JPanel w;
   public final boolean O;
   public final AppendCarriageReturnCRPanel L;
   public final T32 C;
   public final RenameFolderDialog Y;
   public static String a;

   public Ft2(RenameFolderDialog var1, JTextField var2, JPanel var3, boolean var4, AppendCarriageReturnCRPanel var5, T32 var6) {
      this.Y = var1;
      this.m = var2;
      this.w = var3;
      this.O = var4;
      this.L = var5;
      this.C = var6;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var36;
      AppendCarriageReturnCRPanel.Y();
      Object var4 = 346664127253186856L;
      String var3 = ((JTextField)Ref.g(346664127253186856L, var4)).getText().trim();
      Registry.packArgs(var3);
      long var6 = 330094358428833085L;
      Object var10002 = Ref.h2(330094358428833085L, var6);

      try {
         var36 = (Boolean)var10002;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      label64: {
         label65: {
            if (this == null) {
               if (var36) {
                  Object var8 = 342054005342952875L;
                  JOptionPane.showMessageDialog((JPanel)Ref.g(342054005342952875L, var8), a);
                  return;
               }

               if (this != null) {
                  break label65;
               }

               var36 = Registry.lookupField(215323650323848767L).getBoolean(this);
            }

            if (var36) {
               Object var10 = 290056859033489534L;
               Ref.g(290056859033489534L, var10);
               Object var12 = 609652041151518912L;
               Ref.g(609652041151518912L, var12);
               Object var14 = 555729720984516794L;
               Object var10007 = Ref.g(555729720984516794L, var14);
               Object var16 = 147921783444629588L;
               var10007 = Registry.packArgs(var10007, Ref.g(147921783444629588L, var16), var3);
               long var19 = 378286834384421181L;
               Object[] var18 = (Object[])var10007;
               Ref.h(378286834384421181L, var18, var19);

               try {
                  ;
               } catch (InvocationTargetException var34) {
                  throw var34.getTargetException();
               }

               if (this == null) {
                  break label64;
               }
            }
         }

         Object var20 = 290056859033489534L;
         Ref.g(290056859033489534L, var20);
         Object[] var10004 = Registry.packArgs(var3);
         long var23 = 563615782501425138L;
         Object[] var22 = var10004;
         Ref.h(563615782501425138L, var22, var23);

         try {
            ;
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }
      }

      Object var24 = 555729720984516794L;
      ((RenameFolderDialog)Ref.g(555729720984516794L, var24)).setVisible(false);
      Registry.emptyArgs();
      long var26 = 270389152141252877L;
      Ref.h2(270389152141252877L, var26);
      Object[] var38 = Registry.emptyArgs();
      long var29 = 612604310671515822L;
      Object[] var28 = var38;
      Ref.h(612604310671515822L, var28, var29);
      Object[] var10008 = Registry.emptyArgs();
      long var31 = 200561288808923907L;
      Object[] var30 = var10008;
      Ref.h(200561288808923907L, var30, var31);

      try {
         ;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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





