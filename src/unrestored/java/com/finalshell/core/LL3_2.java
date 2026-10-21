package com.finalshell.core;

import com.finalshell.connection.FileTransferConnection;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LL3_2 implements Cq2 {
   public HashMap l;
   public int m;
   public int F;
   public ArrayList s;
   public ExecutorService I;
   public HashSet V;
   public HashMap X;
   public HashMap c;
   public static long a;

   public LL3_2() {
      HashMap var10001 = new HashMap();
      long var2 = 386849566821741858L;
      HashMap var1 = var10001;
      Ref.s(386849566821741858L, var1, var2);
      Registry.lookupField(256164222342390016L).setInt(this, 0);
      int var10002 = (int)a;
      Registry.lookupField(279108313700036577L).setInt(this, var10002);
      ArrayList var13 = new ArrayList();
      long var4 = 550567548032100594L;
      ArrayList var3 = var13;
      Ref.s(550567548032100594L, var3, var4);
      ExecutorService var10003 = Executors.newFixedThreadPool(Registry.lookupField(611678237881470112L).getInt(null));
      long var6 = 609930306026547909L;
      ExecutorService var5 = var10003;
      Ref.s(609930306026547909L, var5, var6);
      HashSet var10004 = new HashSet();
      long var8 = 294127198955704615L;
      HashSet var7 = var10004;
      Ref.s(294127198955704615L, var7, var8);
      HashMap var10005 = new HashMap();
      long var10 = 614370709562827652L;
      HashMap var9 = var10005;
      Ref.s(614370709562827652L, var9, var10);
      HashMap var10006 = new HashMap();
      long var12 = 495522543738164163L;
      HashMap var11 = var10006;
      Ref.s(495522543738164163L, var11, var12);
   }

   public void g(String var1, String var2, Lv4_2 var3, int var4) {
      String var6 = var1.toLowerCase();
      FileTransferConnection.X();
      StringBuilder var10001 = new StringBuilder();
      String var10003 = (String)(Registry.emptyArgs());
      long var10 = 292557478156152530L;
      Object var9 = var10003;
      var10003 = Ref.h(292557478156152530L, var9, var10);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      String var7 = var3.append((String)var10003).append("_").append(var2).toString();
      StringBuilder var5 = var10001;
      Object var11 = 614370709562827652L;
      HashMap var8 = (HashMap)((HashMap)Ref.g(614370709562827652L, var11)).get(var6);
      if (var5 == null) {
         if (var8 == null) {
            var8 = new HashMap();
            Object var13 = 614370709562827652L;
            ((HashMap)Ref.g(614370709562827652L, var13)).put(var6, var8);
         }

         var8.put(var7, var4);
      }
   }

   public int u(String var1, String var2, Lv4_2 var3) {
      String var5 = var1.toLowerCase();
      FileTransferConnection.X();
      Object var9 = 614370709562827652L;
      HashMap var6 = (HashMap)((HashMap)Ref.g(614370709562827652L, var9)).get(var5);
      if (this == null && var6 == null) {
         var6 = new HashMap();
         Object var11 = 614370709562827652L;
         ((HashMap)Ref.g(614370709562827652L, var11)).put(var5, var6);
      }

      int var7 = 0;
      new StringBuilder();
      String var10003 = (String)(Registry.emptyArgs());
      long var14 = 292557478156152530L;
      Object var13 = var10003;
      var10003 = Ref.h(292557478156152530L, var13, var14);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      String var8 = var3.append((String)var10003).append("_").append(var2).toString();
      int var10002 = (var6.containsKey(var8)) ? 1 : 0;
      if (this == null) {
         if (var10002 != 0) {
            var7 = (Integer)var6.get(var8);
            if (this == null) {
               return var7;
            }
         }

         var10002 = var6.size();
      }

      var7 = var10002;
      var6.put(var2, var7);
      return var7;
   }

   public void S(String var1) {
      var1 = new File(var1).getAbsolutePath();
      Object var2 = 294127198955704615L;
      ((HashSet)Ref.g(294127198955704615L, var2)).add(var1);
   }

   public void B$void(String var1) {
      var1 = new File(var1).getAbsolutePath();
      Object var2 = 294127198955704615L;
      ((HashSet)Ref.g(294127198955704615L, var2)).remove(var1);
   }

   public void C(String var1) {
      var1 = new File(var1).getAbsolutePath();
      Object var2 = 294127198955704615L;
      ((HashSet)Ref.g(294127198955704615L, var2)).remove(var1);
      Object var4 = 495522543738164163L;
      ((HashMap)Ref.g(495522543738164163L, var4)).put(var1, System.currentTimeMillis());
   }

   public long B$long(String var1) {
      boolean var10000 = FileTransferConnection.d$boolean();
      long var3 = 0L;
      boolean var2 = var10000;
      Object var5 = 495522543738164163L;
      Object var10001 = (HashMap)Ref.g(495522543738164163L, var5);
      Object var10002 = var1;
      if (!var2) {
         if (!var10001.containsKey(var1)) {
            return var3;
         }

         var10001 = this;
         Object var7 = 495522543738164163L;
         var10002 = (HashMap)Ref.g(495522543738164163L, var7);
      }

      return (Long)var10001.get(var10002);
   }

   public boolean F(String var1) {
      var1 = new File(var1).getAbsolutePath();
      Object var2 = 294127198955704615L;
      return ((HashSet)Ref.g(294127198955704615L, var2)).contains(var1);
   }

   public synchronized void z(YI var1) {
      Integer var15;
      Object var3 = 386849566821741858L;
      HashMap var10001 = (HashMap)Ref.g(386849566821741858L, var3);
      Object var10003 = Registry.emptyArgs();
      long var6 = 305126359001981386L;
      Object var5 = var10003;
      var10003 = Ref.h(305126359001981386L, var5, var6);

      try {
         var15 = (Integer)var10003;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      var1.put(var15, var1);
      Registry.lookupField(256164222342390016L).setInt(this, Registry.lookupField(256164222342390016L).getInt(this) + 1);
      var10003 = Registry.packArgs(this);
      long var8 = 541437196102236947L;
      Object var7 = var10003;
      Ref.h(541437196102236947L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      VO var2 = new VO(var1, Registry.lookupField(355995585155017665L).getInt(null));
      Object[] var10004 = Registry.packArgs(var2);
      long var10 = 575065562045324617L;
      Object[] var9 = var10004;
      Ref.h(575065562045324617L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   public YI N(int var1) {
      Object var2 = 386849566821741858L;
      return (YI)((HashMap)Ref.g(386849566821741858L, var2)).get(var1);
   }

   @Override
   public synchronized void u(VO var1) {
      Object[] var10001 = Registry.packArgs(var1);
      long var3 = 575065562045324617L;
      Object[] var2 = var10001;
      Ref.h(575065562045324617L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void w(VO var1) {
      FileTransferConnection.d$boolean();
      Object var5 = 550567548032100594L;
      Iterator var3 = ((ArrayList)Ref.g(550567548032100594L, var5)).iterator();
      LL3_2 var2 = this;

      while (var3.hasNext()) {
         Cq2 var4 = (Cq2)var3.next();
         Object[] var10002 = Registry.packArgs(var1);
         long var8 = 297776913386603291L;
         Object[] var7 = var10002;
         Ref.h(297776913386603291L, var7, var8);

         try {
            ;
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         if (var2 == null) {
            break;
         }
      }
   }

   public void A(Cq2 var1) {
      Object var2 = 550567548032100594L;
      ((ArrayList)Ref.g(550567548032100594L, var2)).add(var1);
   }

   public ExecutorService b() {
      Object var1 = 609930306026547909L;
      return (ExecutorService)Ref.g(609930306026547909L, var1);
   }

   public void a(ExecutorService var1) {
      long var3 = 609930306026547909L;
      Ref.s(609930306026547909L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6150985399780439196L;
      long var10002 = -794610302837132129L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





