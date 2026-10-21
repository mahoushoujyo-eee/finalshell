package com.finalshell.task;

import com.finalshell.connection.FileTransferConnection;
import com.finalshell.core.FileDropTransferHandler;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.ConnectionInfoPanel;
import java.lang.reflect.InvocationTargetException;

public class M2 implements Runnable {
   public final FileTransferConnection f;
   public final Tf4 t;
   public final Tf4 e;
   public final String l;
   public final ConnectionInfoPanel J;
   public final FileDropTransferHandler z;

   public M2(FileDropTransferHandler var1, FileTransferConnection var2, Tf4 var3, Tf4 var4, String var5, ConnectionInfoPanel var6) {
      this.z = var1;
      this.f = var2;
      this.t = var3;
      this.e = var4;
      this.l = var5;
      this.J = var6;
   }

   @Override
   public void run() {
      try {
         Object var2 = 531166913010562583L;
         Ref.g(531166913010562583L, var2);
         Object var4 = 508507555311476301L;
         Ref.g(508507555311476301L, var4);
         Object[] var10004 = Registry.emptyArgs();
         long var7 = 498856411508641826L;
         Object[] var6 = var10004;
         Ref.h(498856411508641826L, var6, var7);
         new StringBuilder();
         Object var8 = 171528297637314273L;
         Object var10007 = Ref.g(171528297637314273L, var8);
         String var10008 = (String)(Registry.emptyArgs());
         long var11 = 498856411508641826L;
         Object var10 = var10008;
         var10008 = Ref.h(498856411508641826L, var10, var11);

         try {
            var10008 = (String)var10008;
         } catch (InvocationTargetException var35) {
            throw var35.getTargetException();
         }

         var10007.append((String)var10008);
         Object var12 = 146880237550439469L;
         this.append((String)Ref.g(146880237550439469L, var12));
         Object var14 = 508507555311476301L;
         Object var10010 = Ref.g(508507555311476301L, var14);
         String var10011 = (String)(Registry.emptyArgs());
         long var17 = 179612178163941306L;
         Object var16 = var10011;
         var10011 = Ref.h(179612178163941306L, var16, var17);

         try {
            var10011 = (String)var10011;
         } catch (InvocationTargetException var34) {
            throw var34.getTargetException();
         }

         Object[] var10009 = Registry.packArgs(this, var10010.append((String)var10011).toString());
         long var19 = 247777483328047393L;
         Object[] var18 = var10009;
         Ref.h(247777483328047393L, var18, var19);

         try {
            ;
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }

         Object var20 = 410340713056870936L;
         Ref.g(410340713056870936L, var20);
         Object var22 = 508507555311476301L;
         Ref.g(508507555311476301L, var22);
         Object[] var10013 = Registry.emptyArgs();
         long var25 = 498856411508641826L;
         Object[] var24 = var10013;
         Ref.h(498856411508641826L, var24, var25);
         Object var26 = 171528297637314273L;
         Object var10015 = Ref.g(171528297637314273L, var26);
         Object[] var10016 = Registry.emptyArgs();
         long var29 = 498856411508641826L;
         Object[] var28 = var10016;
         var10015 = Registry.packArgs(var10015, Ref.h(498856411508641826L, var28, var29), false);
         long var31 = 405516439223989653L;
         Object[] var30 = (Object[])var10015;
         Ref.h(405516439223989653L, var30, var31);

         try {
            ;
         } catch (InvocationTargetException var32) {
            throw var32.getTargetException();
         }
      } catch (Exception var36) {
         var36.printStackTrace();
      }
   }
}





