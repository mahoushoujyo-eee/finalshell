package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Nq2;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextArea;

public class OE3 implements Runnable {
   final String Z;
   final Nq2 U;
   public static String a;

   OE3(Nq2 var1, String var2) {
      this.U = var1;
      this.Z = var2;
   }

   @Override
   public void run() {
      Object var1 = 549465658310609690L;
      Ref.g(549465658310609690L, var1);
      Object var3 = 407397985905936675L;
      JTextArea var10002 = (JTextArea)Ref.g(407397985905936675L, var3);
      StringBuilder var10003 = new StringBuilder();
      Object var5 = 344632110714370227L;
      var10003.append(this.append((String)Ref.g(344632110714370227L, var5)).append("\n").toString());
      Object var7 = 549465658310609690L;
      Ref.g(549465658310609690L, var7);
      Object var9 = 549465658310609690L;
      Ref.g(549465658310609690L, var9);
      Object var11 = 407397985905936675L;
      Object[] var10007 = Registry.packArgs(Ref.g(407397985905936675L, var11));
      long var14 = 537105238359129972L;
      Object[] var13 = var10007;
      Ref.h(537105238359129972L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      Object var15 = 549465658310609690L;
      Ref.g(549465658310609690L, var15);
      Object var17 = 407397985905936675L;
      JTextArea var10009 = (JTextArea)Ref.g(407397985905936675L, var17);
      Object var19 = 549465658310609690L;
      Object var10011 = Ref.g(549465658310609690L, var19);
      Object var21 = 407397985905936675L;
      var10011.setCaretPosition(((JTextArea)Ref.g(407397985905936675L, var21)).getDocument().getLength());
      Object var23 = 344632110714370227L;
      if (((String)Ref.g(344632110714370227L, var23)).startsWith(a)) {
         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10013 = Registry.packArgs(new QF(this));
         long var26 = 434592463220957006L;
         Object[] var25 = var10013;
         Ref.h(434592463220957006L, var25, var26);

         try {
            ;
         } catch (InvocationTargetException var27) {
            throw var27.getTargetException();
         }
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "厭缑寜戅".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 99;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 99;
         var10006 = var0;
      } else {
         var6 = 99;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 99;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 69;
               break;
            case 1:
               var23 = 91;
               break;
            case 2:
               var23 = 51;
               break;
            case 3:
               var23 = 118;
               break;
            case 4:
               var23 = 21;
               break;
            case 5:
               var23 = 106;
               break;
            default:
               var23 = 71;
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





