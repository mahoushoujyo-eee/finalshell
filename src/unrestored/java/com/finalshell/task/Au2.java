package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.UpdateDialog;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextArea;

public class Au2 implements Runnable {
   public final String I;
   public final UpdateDialog j;
   public static String a;

   public Au2(UpdateDialog var1, String var2) {
      this.j = var1;
      this.I = var2;
   }

   @Override
   public void run() {
      label42: {
         Object var10001;
         label43: {
            String[] var1 = UpdateDialog.y();
            if (var1 == null) {
               Object var2 = 618749111386179014L;
               var10001 = Ref.g(618749111386179014L, var2);
               Object var4 = 209593506021318868L;
               if ((JTextArea)Ref.g(209593506021318868L, var4) != null) {
                  Object var6 = 618749111386179014L;
                  Ref.g(618749111386179014L, var6);
                  Object var8 = 209593506021318868L;
                  JTextArea var10004 = (JTextArea)Ref.g(209593506021318868L, var8);
                  Object var10 = 178250428921673276L;
                  this.append((String)Ref.g(178250428921673276L, var10));
                  Object var12 = 618749111386179014L;
                  Ref.g(618749111386179014L, var12);
                  Object var14 = 618749111386179014L;
                  Ref.g(618749111386179014L, var14);
                  Object var16 = 209593506021318868L;
                  Object[] var10009 = Registry.packArgs(Ref.g(209593506021318868L, var16));
                  long var19 = 584802178139769689L;
                  Object[] var18 = var10009;
                  Ref.h(584802178139769689L, var18, var19);

                  try {
                     ;
                  } catch (InvocationTargetException var34) {
                     throw var34.getTargetException();
                  }

                  Object var20 = 618749111386179014L;
                  boolean var10010 = Registry.lookupField(557137373509279378L).getBoolean(Ref.g(618749111386179014L, var20));
                  if (var1 != null) {
                     break label43;
                  }

                  if (var10010) {
                     Object var22 = 618749111386179014L;
                     Ref.g(618749111386179014L, var22);
                     Object var24 = 209593506021318868L;
                     JTextArea var10012 = (JTextArea)Ref.g(209593506021318868L, var24);
                     Object var26 = 618749111386179014L;
                     Object var10014 = Ref.g(618749111386179014L, var26);
                     Object var28 = 209593506021318868L;
                     var10014.setCaretPosition(((JTextArea)Ref.g(209593506021318868L, var28)).getDocument().getLength());
                  }
               }
            }

            if (var1 != null) {
               break label42;
            }

            Object var30 = 178250428921673276L;
            var10001 = ((String)Ref.g(178250428921673276L, var30)).contains(a);
         }

         if (var10001 == null) {
            return;
         }
      }

      Object var32 = 618749111386179014L;
      Registry.lookupField(509757470572563007L).setBoolean(Ref.g(618749111386179014L, var32), true);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "{+f\fIC0|\"".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 101;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 101;
         var10006 = var0;
      } else {
         var6 = 101;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 101;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 119;
               break;
            case 1:
               var23 = 32;
               break;
            case 2:
               var23 = 101;
               break;
            case 3:
               var23 = 5;
               break;
            case 4:
               var23 = 77;
               break;
            case 5:
               var23 = 82;
               break;
            default:
               var23 = 60;
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





