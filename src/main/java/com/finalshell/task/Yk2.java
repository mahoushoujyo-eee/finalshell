package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.DU;
import com.finalshell.ui.listener.KR;
import com.finalshell.ui.panel.ConnectionProperty;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Yk2 implements Runnable {
   public final KR Z;
   public static long a;

   public Yk2(KR var1) {
      this.Z = var1;
   }

   @Override
   public void run() {
      DU.u();
      Object var4 = 427592903543022635L;
      Ref.g(427592903543022635L, var4);
      Object var6 = 477342503026871908L;
      Ref.g(477342503026871908L, var6);
      Object var8 = 429952889391243847L;
      JTextField var10004 = (JTextField)Ref.g(429952889391243847L, var8);
      Object var10 = 427592903543022635L;
      Object var10006 = Ref.g(427592903543022635L, var10);
      Object var12 = 477342503026871908L;
      Object var10007 = Ref.g(477342503026871908L, var12);
      Object var14 = 429952889391243847L;
      var10007.setText(((JTextField)Ref.g(429952889391243847L, var14)).getText().toLowerCase());
      Object var1 = var10006;
      Object var16 = 427592903543022635L;
      Object var10009 = Ref.g(427592903543022635L, var16);
      Object var18 = 477342503026871908L;
      Object var10010 = Ref.g(477342503026871908L, var18);
      Object var20 = 228183978052282907L;
var10010 = new T9(((JPasswordField)Ref.g(228183978052282907L, var20)).getPassword());
      Object var2 = var10009;
      if (var1 != null) {
         Object var22 = 427592903543022635L;
         Ref.g(427592903543022635L, var22);
         Object var24 = 477342503026871908L;
         Ref.g(477342503026871908L, var24);
         Object var26 = 181350030129350521L;
         Object var10013 = Ref.g(181350030129350521L, var26);
         String var10014 = (String)(Registry.emptyArgs());
         long var29 = 191807067392725406L;
         Object var28 = var10014;
         var10014 = Ref.h(191807067392725406L, var28, var29);

         try {
            var10014 = (String)var10014;
         } catch (InvocationTargetException var85) {
            throw var85.getTargetException();
         }

         if (!var10013.equals(var10014)) {
            Registry.packArgs(var2);
            long var30 = 310648841563123270L;
            var10014 = Ref.h2(310648841563123270L, var30);

            try {
               var10014 = (String)var10014;
            } catch (InvocationTargetException var84) {
               throw var84.getTargetException();
            }

            String var3 = var10014;
            Object var32 = 427592903543022635L;
            Ref.g(427592903543022635L, var32);
            Object var34 = 477342503026871908L;
            Ref.g(477342503026871908L, var34);
            Object var36 = 228183978052282907L;
            ((JPasswordField)Ref.g(228183978052282907L, var36)).setText(var3);
         }

         Object var38 = 427592903543022635L;
         Ref.g(427592903543022635L, var38);
         Object var40 = 477342503026871908L;
         Ref.g(477342503026871908L, var40);
         Object var42 = 181350030129350521L;
         Ref.g(181350030129350521L, var42);
         Object var44 = 427592903543022635L;
         Ref.g(427592903543022635L, var44);
         Object var46 = 477342503026871908L;
         Ref.g(477342503026871908L, var46);
         Object var48 = 429952889391243847L;
         Object[] var10020 = Registry.packArgs(((JTextField)Ref.g(429952889391243847L, var48)).getText());
         long var51 = 562455292458332652L;
         Object[] var50 = var10020;
         Ref.h(562455292458332652L, var50, var51);

         try {
            ;
         } catch (InvocationTargetException var83) {
            throw var83.getTargetException();
         }

         Object var52 = 427592903543022635L;
         Ref.g(427592903543022635L, var52);
         Object var54 = 477342503026871908L;
         Ref.g(477342503026871908L, var54);
         Object var56 = 181350030129350521L;
         Ref.g(181350030129350521L, var56);
         Object var58 = 427592903543022635L;
         Object var10027 = Ref.g(427592903543022635L, var58);
         Object var60 = 477342503026871908L;
         Object var10028 = Ref.g(477342503026871908L, var60);
         Object var62 = 228183978052282907L;
var10028 = new T9(((JPasswordField)Ref.g(228183978052282907L, var62)).getPassword());
         var10027 = Registry.packArgs(var10027);
         long var65 = 583865646792521502L;
         Object[] var64 = (Object[])var10027;
         Ref.h(583865646792521502L, var64, var65);

         try {
            ;
         } catch (InvocationTargetException var82) {
            throw var82.getTargetException();
         }

         Registry.emptyArgs();
         long var66 = 270389152141252877L;
         Ref.h2(270389152141252877L, var66);
         Object[] var10029 = Registry.emptyArgs();
         long var69 = 578864097947885485L;
         Object[] var68 = var10029;
         Ref.h(578864097947885485L, var68, var69);

         try {
            ;
         } catch (InvocationTargetException var81) {
            throw var81.getTargetException();
         }

         ConnectionProperty.b$void();
         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10030 = Registry.packArgs(new T9(this), (int)a);
         long var71 = 266288712085965362L;
         Object[] var70 = var10030;
         Ref.h(266288712085965362L, var70, var71);
         Object var72 = 427592903543022635L;
         Ref.g(427592903543022635L, var72);
         Object var74 = 477342503026871908L;
         Ref.g(477342503026871908L, var74);
         Object var76 = 608857086159868835L;
         Ref.g(608857086159868835L, var76);
         Object[] var10034 = Registry.emptyArgs();
         long var79 = 409729356224766465L;
         Object[] var78 = var10034;
         Ref.h(409729356224766465L, var78, var79);

         try {
            ;
         } catch (InvocationTargetException var80) {
            throw var80.getTargetException();
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 7614969788393075630L;
      long var10002 = -4406316031530747882L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





