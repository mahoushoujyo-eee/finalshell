package com.finalshell.task;

import com.finalshell.connection.FileTransferConnection;
import com.finalshell.core.FileDropTransferHandler;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.ConnectionInfoPanel;
import java.lang.reflect.InvocationTargetException;

public class UU3 implements Runnable {
   public final FileTransferConnection l;
   public final Ck4 i;
   public final Tf4 m;
   public final String Y;
   public final ConnectionInfoPanel B;
   public final FileDropTransferHandler n;

   public UU3(FileDropTransferHandler var1, FileTransferConnection var2, Ck4 var3, Tf4 var4, String var5, ConnectionInfoPanel var6) {
      this.n = var1;
      this.l = var2;
      this.i = var3;
      this.m = var4;
      this.Y = var5;
      this.B = var6;
   }

   @Override
   public void run() {
      try {
         Object var2 = 631097344452987274L;
         Ref.g(631097344452987274L, var2);
         Object var4 = 245403701154742402L;
         Ref.g(245403701154742402L, var4);
         Object[] var10004 = Registry.emptyArgs();
         long var7 = 605430732347023634L;
         Object[] var6 = var10004;
         Ref.h(605430732347023634L, var6, var7);
         new StringBuilder();
         Object var8 = 156041858654433892L;
         Object var10007 = Ref.g(156041858654433892L, var8);
         String var10008 = (String)(Registry.emptyArgs());
         long var11 = 498856411508641826L;
         Object var10 = var10008;
         var10008 = Ref.h(498856411508641826L, var10, var11);

         try {
            var10008 = (String)var10008;
         } catch (InvocationTargetException var39) {
            throw var39.getTargetException();
         }

         var10007.append((String)var10008);
         Object var12 = 342460290428124331L;
         this.append((String)Ref.g(342460290428124331L, var12));
         Object var14 = 245403701154742402L;
         Object var10010 = Ref.g(245403701154742402L, var14);
         String var10011 = (String)(Registry.emptyArgs());
         long var17 = 396085629172753019L;
         Object var16 = var10011;
         var10011 = Ref.h(396085629172753019L, var16, var17);

         try {
            var10011 = (String)var10011;
         } catch (InvocationTargetException var38) {
            throw var38.getTargetException();
         }

         Object[] var10009 = Registry.packArgs(this, var10010.append((String)var10011).toString());
         long var19 = 247777483328047393L;
         Object[] var18 = var10009;
         Ref.h(247777483328047393L, var18, var19);

         try {
            ;
         } catch (InvocationTargetException var37) {
            throw var37.getTargetException();
         }

         Object var20 = 564007731332690070L;
         Ref.g(564007731332690070L, var20);
         Object var22 = 245403701154742402L;
         Ref.g(245403701154742402L, var22);
         Object[] var10013 = Registry.emptyArgs();
         long var25 = 605430732347023634L;
         Object[] var24 = var10013;
         Ref.h(605430732347023634L, var24, var25);
         Object var26 = 156041858654433892L;
         Ref.g(156041858654433892L, var26);
         Object[] var10016 = Registry.emptyArgs();
         long var29 = 498856411508641826L;
         Object[] var28 = var10016;
         Ref.h(498856411508641826L, var28, var29);
         Object var30 = 245403701154742402L;
         Object var10018 = Ref.g(245403701154742402L, var30);
         Object[] var10019 = Registry.emptyArgs();
         long var33 = 396085629172753019L;
         Object[] var32 = var10019;
         Object[] var10017 = Registry.packArgs(this, var10018, Ref.h(396085629172753019L, var32, var33));
         long var35 = 117823788615315526L;
         Object[] var34 = var10017;
         Ref.h(117823788615315526L, var34, var35);

         try {
            ;
         } catch (InvocationTargetException var36) {
            throw var36.getTargetException();
         }
      } catch (Exception var40) {
         var40.printStackTrace();
      }
   }
}





