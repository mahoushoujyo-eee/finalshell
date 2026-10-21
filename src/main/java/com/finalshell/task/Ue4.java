package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.UpdateFrame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextArea;

public class Ue4 implements Runnable {
   public final String v;
   public final UpdateFrame Z;
   public static String a;

   public Ue4(UpdateFrame var1, String var2) {
      this.Z = var1;
      this.v = var2;
   }

   @Override
   public void run() {
      label42: {
         Object var10001;
         label43: {
            String[] var1 = UpdateFrame.q();
            if (var1 == null) {
               Object var2 = 264483240089333141L;
               var10001 = Ref.g(264483240089333141L, var2);
               Object var4 = 406171939123952740L;
               if ((JTextArea)Ref.g(406171939123952740L, var4) != null) {
                  Object var6 = 264483240089333141L;
                  Ref.g(264483240089333141L, var6);
                  Object var8 = 406171939123952740L;
                  JTextArea var10004 = (JTextArea)Ref.g(406171939123952740L, var8);
                  Object var10 = 326124367307822784L;
                  this.append((String)Ref.g(326124367307822784L, var10));
                  Object var12 = 264483240089333141L;
                  Ref.g(264483240089333141L, var12);
                  Object var14 = 264483240089333141L;
                  Ref.g(264483240089333141L, var14);
                  Object var16 = 406171939123952740L;
                  Object[] var10009 = Registry.packArgs(Ref.g(406171939123952740L, var16));
                  long var19 = 545163393621250611L;
                  Object[] var18 = var10009;
                  Ref.h(545163393621250611L, var18, var19);

                  try {
                     ;
                  } catch (InvocationTargetException var34) {
                     throw var34.getTargetException();
                  }

                  Object var20 = 264483240089333141L;
                  boolean var10010 = Registry.lookupField(198290463385639860L).getBoolean(Ref.g(264483240089333141L, var20));
                  if (var1 != null) {
                     break label43;
                  }

                  if (var10010) {
                     Object var22 = 264483240089333141L;
                     Ref.g(264483240089333141L, var22);
                     Object var24 = 406171939123952740L;
                     JTextArea var10012 = (JTextArea)Ref.g(406171939123952740L, var24);
                     Object var26 = 264483240089333141L;
                     Object var10014 = Ref.g(264483240089333141L, var26);
                     Object var28 = 406171939123952740L;
                     var10014.setCaretPosition(((JTextArea)Ref.g(406171939123952740L, var28)).getDocument().getLength());
                  }
               }
            }

            if (var1 != null) {
               break label42;
            }

            Object var30 = 326124367307822784L;
            var10001 = ((String)Ref.g(326124367307822784L, var30)).contains(a);
         }

         if (var10001 == null) {
            return;
         }
      }

      Object var32 = 264483240089333141L;
      Registry.lookupField(602217905248930587L).setBoolean(Ref.g(264483240089333141L, var32), true);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "LM110\u001eOKD".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 74;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 74;
         var10006 = var0;
      } else {
         var6 = 74;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 74;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 111;
               break;
            case 1:
               var23 = 105;
               break;
            case 2:
               var23 = 29;
               break;
            case 3:
               var23 = 23;
               break;
            case 4:
               var23 = 27;
               break;
            case 5:
               var23 = 32;
               break;
            default:
               var23 = 108;
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





